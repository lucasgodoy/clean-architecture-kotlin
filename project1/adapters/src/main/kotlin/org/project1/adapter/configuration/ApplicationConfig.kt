package org.project1.adapter.configuration

import org.project1.usecase.foo.GetAllFoo
import org.project1.usecase.foo.GetOneFoo
import org.project1.usecase.foo.repository.FooRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class ApplicationConfig {

    @Bean
    fun buildGetOneFoo(fooRepository: FooRepository) = GetOneFoo(fooRepository)

    @Bean
    fun buildGetAllFoo(fooRepository: FooRepository) = GetAllFoo(fooRepository)
}