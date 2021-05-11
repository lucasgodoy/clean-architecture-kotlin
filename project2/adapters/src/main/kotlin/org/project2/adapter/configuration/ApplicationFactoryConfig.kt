package org.project2.adapter.configuration

import org.project2.usecase.bar.CreateNewBar
import org.project2.usecase.bar.DeleteOneBar
import org.project2.usecase.bar.FindOneBar
import org.project2.usecase.bar.ListAllBar
import org.project2.usecase.bar.repository.BarRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class ApplicationFactoryConfig {

    @Bean
    fun createNewBar(barRepository: BarRepository) = CreateNewBar(barRepository)

    @Bean
    fun findOneBar(barRepository: BarRepository) = FindOneBar(barRepository)

    @Bean
    fun listAllBar(barRepository: BarRepository) = ListAllBar(barRepository)

    @Bean
    fun deleteOneBar(barRepository: BarRepository) = DeleteOneBar(barRepository)
}