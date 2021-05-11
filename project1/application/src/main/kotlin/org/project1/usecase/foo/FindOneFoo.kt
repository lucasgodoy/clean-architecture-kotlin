package org.project1.usecase.foo

import org.project1.usecase.CustomException
import org.project1.usecase.foo.dto.mapper.toOutput
import org.project1.usecase.foo.repository.FooRepository

class FindOneFoo(private val fooRepository: FooRepository) : FindFooById {

    override fun invoke(id: Int) =
        fooRepository.findById(id)?.toOutput() ?: throw CustomException("Foo not found with id $id")
}