package org.project2.usecase.bar

import org.project2.usecase.bar.dto.mapper.toOutput
import org.project2.usecase.bar.repository.BarRepository

class FindOneBar(private val barRepository: BarRepository) : FindBarByCode {

    override fun invoke(code: Int) =
        barRepository.findByCode(code)?.toOutput() ?: throw EntityNotFoundException("Bar not found with id $code")
}