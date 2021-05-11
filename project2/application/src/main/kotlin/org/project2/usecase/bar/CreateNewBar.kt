package org.project2.usecase.bar

import org.project2.usecase.bar.dto.BarOutput
import org.project2.usecase.bar.dto.NewBarInput
import org.project2.usecase.bar.dto.mapper.toEntity
import org.project2.usecase.bar.dto.mapper.toOutput
import org.project2.usecase.bar.repository.BarRepository

class CreateNewBar(private val barRepository: BarRepository) : CreateBar {

    override fun invoke(newBarInput: NewBarInput): BarOutput {
        validateBarDuplicationByCode(newBarInput.code)
        validateBarDuplicationByName(newBarInput.name)
        val newBar = newBarInput.toEntity()
        return barRepository.create(newBar).toOutput()
    }

    private fun validateBarDuplicationByCode(code: Int) {
        barRepository.findByCode(code)?.let {
            throw DuplicateEntityException("A Bar with code $code is already registered")
        }
    }

    private fun validateBarDuplicationByName(name: String) {
        barRepository.findByName(name)?.let {
            throw DuplicateEntityException("A Bar with name $name is already registered")
        }
    }
}