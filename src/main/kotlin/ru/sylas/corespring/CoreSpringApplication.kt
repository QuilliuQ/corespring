package ru.sylas.corespring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoreSpringApplication

fun main(args: Array<String>) {
	runApplication<CoreSpringApplication>(*args)
}
