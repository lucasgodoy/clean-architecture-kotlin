package org.project2.adapter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class Project2Application

fun main(args: Array<String>) {
    runApplication<Project2Application>(*args)
}