package org.project2.adapter.repository

import org.project2.usecase.bar.repository.BarRepository
import org.springframework.stereotype.Repository

@Repository
internal class BarRepository : BarRepository {

    override fun findById(id: Int) = dbBar[id]?.toEntity()

    override fun findAll() = dbBar.values.map { it.toEntity() }

    private val dbBar = mapOf(
        1 to DbBar(1,"Bar 1"),
        2 to DbBar(2,"Bar 2"),
        3 to DbBar(3,"Bar 3")
    )
}