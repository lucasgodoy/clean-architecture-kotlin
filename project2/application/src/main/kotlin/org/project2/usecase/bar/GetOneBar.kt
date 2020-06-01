package org.project2.usecase.bar

import org.project2.usecase.CustomException
import org.project2.usecase.bar.dto.BarOutput
import org.project2.usecase.bar.repository.BarRepository

class GetOneBar(private val barRepository: BarRepository) : GetBarById {
    override fun invoke(id: Int): BarOutput {
        val barFromStorage = barRepository.findById(id) ?: throw CustomException("Bar not found with id $id")
        return BarOutput.fromEntity(barFromStorage)
    }
}