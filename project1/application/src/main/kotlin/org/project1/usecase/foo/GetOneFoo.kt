package org.project1.usecase.foo

import org.project1.usecase.CustomException
import org.project1.usecase.foo.dto.FooOutput
import org.project1.usecase.foo.repository.FooRepository

class GetOneFoo(private val fooRepository: FooRepository) : GetFooById {
    override fun invoke(id: Int): FooOutput {
        val fooFromStorage = fooRepository.findById(id) ?: throw CustomException("Foo not found with id $id")
        return FooOutput.fromEntity(fooFromStorage)
    }
}