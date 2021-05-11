package org.project2.adapter.repository

import org.project2.adapter.repository.mapper.toDbSchema
import org.project2.adapter.repository.mapper.toEntity
import org.project2.adapter.repository.schema.DbBar
import org.project2.entity.Bar
import org.project2.usecase.bar.repository.BarRepository
import org.springframework.stereotype.Repository

@Repository
internal class BarRepository : BarRepository {

    override fun create(bar: Bar): Bar {
        val dbObject = bar.toDbSchema()
        dbBar[bar.code] = dbObject
        return dbObject.toEntity()
    }

    override fun findByCode(code: Int) = dbBar[code]?.toEntity()

    override fun findByName(name: String): Bar? {
        TODO("Not yet implemented")
    }

    override fun findAll() = dbBar.values.map { it.toEntity() }

    override fun delete(code: Int) {
        dbBar.remove(code)
    }

    private val dbBar = mutableMapOf(
        1 to DbBar(1,"Bar 1"),
        2 to DbBar(2,"Bar 2"),
        3 to DbBar(3,"Bar 3")
    )
}