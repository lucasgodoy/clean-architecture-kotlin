package org.project2.usecase.bar

class DuplicateEntityException(message: String) : RuntimeException(message)

class EntityNotFoundException(message: String) : RuntimeException(message)