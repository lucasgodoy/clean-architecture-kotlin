package org.project1.adapter.configuration

import org.project1.usecase.foo.CreateNewFoo
import org.project1.usecase.foo.DeleteOneFoo
import org.project1.usecase.foo.FindOneFoo
import org.project1.usecase.foo.ListAllFoo
import org.project1.usecase.foo.repository.FooRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class ApplicationFactoryConfig {

    @Bean
    fun createNewFoo(fooRepository: FooRepository) = CreateNewFoo(fooRepository)

    @Bean
    fun findOneFoo(fooRepository: FooRepository) = FindOneFoo(fooRepository)

    @Bean
    fun listAllFoo(fooRepository: FooRepository) = ListAllFoo(fooRepository)

    @Bean
    fun deleteOneFoo(fooRepository: FooRepository) = DeleteOneFoo(fooRepository)
}