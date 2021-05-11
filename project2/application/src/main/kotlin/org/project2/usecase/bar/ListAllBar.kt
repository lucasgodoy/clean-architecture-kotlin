package org.project2.usecase.bar

import org.project2.usecase.bar.dto.mapper.toOutput
import org.project2.usecase.bar.repository.BarRepository

class ListAllBar(private val barRepository: BarRepository) : ListBar {

    override fun invoke() = barRepository.findAll().map { it.toOutput() }
}