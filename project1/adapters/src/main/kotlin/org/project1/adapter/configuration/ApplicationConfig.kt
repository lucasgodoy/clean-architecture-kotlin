package org.project1.adapter.configuration

import org.project1.usecase.foo.ListAllFoo
import org.project1.usecase.foo.FindOneFoo
import org.project1.usecase.foo.repository.FooRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class ApplicationConfig {

    @Bean
    fun findOneFoo(fooRepository: FooRepository) = FindOneFoo(fooRepository)

    @Bean
    fun listAllFoo(fooRepository: FooRepository) = ListAllFoo(fooRepository)
}