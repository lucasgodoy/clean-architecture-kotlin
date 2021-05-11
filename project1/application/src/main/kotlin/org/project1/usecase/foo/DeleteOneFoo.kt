package org.project1.usecase.foo

import org.project1.usecase.DuplicateEntityException
import org.project1.usecase.foo.repository.FooRepository

class DeleteOneFoo(private val fooRepository: FooRepository) : DeleteFoo {

    override fun invoke(id: Int) {
        validateFooExistence(id)
        fooRepository.delete(id)
    }

    private fun validateFooExistence(id: Int) {
        fooRepository.findById(id) ?: throw DuplicateEntityException("Foo with id $id not found")
    }
}