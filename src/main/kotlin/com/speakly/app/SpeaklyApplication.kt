package com.speakly.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpeaklyApplication

fun main(args: Array<String>) {
    runApplication<SpeaklyApplication>(*args)
}
