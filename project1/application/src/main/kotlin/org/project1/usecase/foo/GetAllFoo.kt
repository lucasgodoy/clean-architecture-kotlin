package org.project1.usecase.foo

import org.project1.usecase.foo.dto.FooOutput
import org.project1.usecase.foo.repository.FooRepository

class GetAllFoo(private val fooRepository: FooRepository) : GetFooList {
    override fun invoke(): List<FooOutput> {
        val allFooFromStorage = fooRepository.findAll()
        return allFooFromStorage.map { FooOutput.fromEntity(it) }
    }
}