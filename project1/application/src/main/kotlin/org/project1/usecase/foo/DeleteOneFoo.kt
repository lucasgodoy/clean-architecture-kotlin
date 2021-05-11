package org.project1.usecase.foo

import org.project1.usecase.EntityNotFoundException
import org.project1.usecase.foo.repository.FooRepository

class DeleteOneFoo(private val fooRepository: FooRepository) : DeleteFoo {

    override fun invoke(code: Int) {
        validateFooExistence(code)
        fooRepository.delete(code)
    }

    private fun validateFooExistence(id: Int) {
        fooRepository.findByCode(id) ?: throw EntityNotFoundException("Foo with id $id not found")
    }
}