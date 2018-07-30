package gon.cue.KotlingDemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlingDemoApplication

fun main(args: Array<String>) {
    runApplication<KotlingDemoApplication>(*args)
    
    println("Hello World")
}