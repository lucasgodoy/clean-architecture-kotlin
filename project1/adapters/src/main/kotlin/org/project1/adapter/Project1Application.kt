package org.project1.adapter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class Project1Application

fun main(args: Array<String>) {
    runApplication<Project1Application>(*args)
}