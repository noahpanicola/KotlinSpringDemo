const SockJS = require('sockjs-client')
const readline = require('readline')
const webSocketUrl = "http://localhost:8080/ws"

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
})

var line = ""
var socketIsOpen = true
var cursorPointer = true
var receivedData = ""
var type = "say"
var name = "none"
var numLines = 0;
var webSocket;

console.log("> please enter your name name: ")
process.stdout.write("$: ")

rl.on('line', (data) => {
  if(numLines == 0){
    name = data;
    initializeWebSocket()
  }
  else if(data == "exit") {
      socketIsOpen = false;
      rl.close()
      webSocket.close()
      console.log('> goodbye')
  }
  else if (data !== "") {
    webSocket.send(JSON.stringify({type: type, data: data}))
    console.log("> sending: " + data)
  }
  else {
    console.log("> error: cannot send empty request")
  }
  numLines++;
  process.stdout.write("$: ")
})

function initializeWebSocket() {
    webSocket = new SockJS(webSocketUrl)

    webSocket.onmessage = function (msg) {

      var req = JSON.parse(msg.data)
      var data = req.data;
      var type = req.msgType;

      console.log(req)

      if(type == 'message'){
        console.log('> message from ' + data.name + ': ' + data)
      }

      else if(type == 'join'){
        console.log("A new user has joined...")
      }

      else if(type == 'users'){

      }

      else {
        console.log('> unknown message type')
        console.log('> ' + data)
      }

      process.stdout.write("$: ")

    }

    webSocket.onclose = function() {
      console.log("> disconnected from " + webSocketUrl)
      if(socketIsOpen == true) {
        console.log('> error: server failure')
        process.exit(1)
      }
    }

    webSocket.onopen = function() {
      console.log("> connecting to " + webSocketUrl + "...")
      webSocket.send(JSON.stringify({type: "join", data: name}))
    }
}
