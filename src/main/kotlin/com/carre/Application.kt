package com.carre

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.carre.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureTemplating()
        configureSerialization()
        configureSockets()
    }.start(wait = true)
}
