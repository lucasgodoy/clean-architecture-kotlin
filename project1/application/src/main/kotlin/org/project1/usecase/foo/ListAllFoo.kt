package org.project1.usecase.foo

import org.project1.usecase.foo.dto.mapper.toOutput
import org.project1.usecase.foo.repository.FooRepository

class ListAllFoo(private val fooRepository: FooRepository) : ListFoo {

    override fun invoke() = fooRepository.findAll().map { it.toOutput() }
}