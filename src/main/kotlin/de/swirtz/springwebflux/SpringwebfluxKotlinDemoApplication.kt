package de.swirtz.springwebflux

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Spring WebFlux is the new reactive web framework introduced in Spring Framework 5.0.
 * Unlike Spring MVC, it does not require the Servlet API, is fully asynchronous and non-blocking,
 * and implements the Reactive Streams specification through the Reactor project.
 */
@SpringBootApplication
class SpringwebfluxKotlinDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringwebfluxKotlinDemoApplication::class.java, *args)

}


@RequestMapping("/")
@RestController
class IndexController
