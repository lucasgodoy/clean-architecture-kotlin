package org.project2.usecase.bar

import org.project2.usecase.bar.dto.BarOutput
import org.project2.usecase.bar.repository.BarRepository

class GetAllBar(private val barRepository: BarRepository) : GetBarList {
    override fun invoke(): List<BarOutput> {
        val allBarFromStorage = barRepository.findAll()
        return allBarFromStorage.map { BarOutput.fromEntity(it) }
    }
}