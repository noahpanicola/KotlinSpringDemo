package org.np.ContactHigh.Controller

import org.np.ContactHigh.Model.ContactHighUser
import org.np.ContactHigh.Repository.ContactHighUserRepository

import java.util.Optional

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping("/api", produces = ["application/json"])
class ContactHighController (private val userRepository: ContactHighUserRepository) {


    @GetMapping("/", produces = ["application/json"])
    fun getTestHtml() : String  = "<h1>" + "Hello World" + "</h1>"

    /*@GetMapping("/user/{id}", produces = ["application/json"])
    fun getUserById(@PathVariable("id") id: Long) : Optional<ContactHighUser> = userRepository.findById(id)

    @GetMapping("/users", produces = ["application/json"])
    fun getAllUsers() : MutableIterable<ContactHighUser> = userRepository.findAll()

    @GetMapping("/user/{id}/friends", produces = ["application/json"])
    fun getFriends(@PathVariable("id") id: Long) : List<ContactHighUser> = userRepository.getFriendsById(id)


    @PostMapping("/user", produces = ["application/json"])
    fun addUser(newUser : ContactHighUser) : ContactHighUser = userRepository.save(newUser)*/

}
