package com.example.kotlinbootdemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinBootDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinBootDemoApplication::class.java, *args)
}
