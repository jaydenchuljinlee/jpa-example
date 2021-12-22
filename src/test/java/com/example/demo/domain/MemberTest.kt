package com.example.demo.domain

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Commit
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@SpringBootTest
@Transactional
@Commit
class MemberTest(
    @PersistenceContext
    val em: EntityManager,

) {
    fun testEntity() {
    }
}