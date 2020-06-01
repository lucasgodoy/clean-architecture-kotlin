package org.project2.adapter.configuration

import org.project2.usecase.bar.GetAllBar
import org.project2.usecase.bar.GetOneBar
import org.project2.usecase.bar.repository.BarRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class ApplicationConfig {

    @Bean
    fun buildGetOneBar(barRepository: BarRepository) = GetOneBar(barRepository)

    @Bean
    fun buildGetAllBar(barRepository: BarRepository) = GetAllBar(barRepository)
}