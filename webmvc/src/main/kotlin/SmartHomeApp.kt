package io.raif.smarthome

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmartHomeApp

fun main(args: Array<String>) {
    runApplication<SmartHomeApp>(*args)
}
