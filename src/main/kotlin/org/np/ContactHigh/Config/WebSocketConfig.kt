package org.np.ContactHigh.Config

import org.np.ContactHigh.EventHandlers.SocketHandler
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.*

@Configuration @EnableWebSocket
class WebSocketConfig : WebSocketConfigurer {
    override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
        registry.addHandler(SocketHandler(), "/ws").withSockJS()
    }
}