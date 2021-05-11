package org.project1.usecase

class DuplicateEntityException(message: String) : RuntimeException(message)

class EntityNotFoundException(message: String) : RuntimeException(message)