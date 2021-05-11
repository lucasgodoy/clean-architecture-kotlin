package org.project1.usecase.foo

import org.project1.usecase.EntityNotFoundException
import org.project1.usecase.foo.dto.mapper.toOutput
import org.project1.usecase.foo.repository.FooRepository

class FindOneFoo(private val fooRepository: FooRepository) : FindFooByCode {

    override fun invoke(code: Int) =
        fooRepository.findByCode(code)?.toOutput() ?: throw EntityNotFoundException("Foo not found with id $code")
}