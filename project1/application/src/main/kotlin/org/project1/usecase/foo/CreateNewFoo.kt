package org.project1.usecase.foo

import org.project1.usecase.DuplicateEntityException
import org.project1.usecase.foo.dto.FooOutput
import org.project1.usecase.foo.dto.NewFooInput
import org.project1.usecase.foo.dto.mapper.toEntity
import org.project1.usecase.foo.dto.mapper.toOutput
import org.project1.usecase.foo.repository.FooRepository

class CreateNewFoo(private val fooRepository: FooRepository) : CreateFoo {

    override fun invoke(newFooInput: NewFooInput): FooOutput {
        validateFooDuplication(newFooInput.name)
        val newFoo = newFooInput.toEntity()
        return fooRepository.create(newFoo).toOutput()
    }

    private fun validateFooDuplication(name: String) {
        fooRepository.findByName(name)?.let {
            throw DuplicateEntityException("A Foo with name $name is already registered")
        }
    }
}