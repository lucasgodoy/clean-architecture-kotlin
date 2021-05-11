package org.project2.usecase.bar

import org.project2.usecase.bar.repository.BarRepository

class DeleteOneBar(private val barRepository: BarRepository) : DeleteBar {

    override fun invoke(code: Int) {
        validateBarExistence(code)
        barRepository.delete(code)
    }

    private fun validateBarExistence(id: Int) {
        barRepository.findByCode(id) ?: throw EntityNotFoundException("Bar with id $id not found")
    }
}