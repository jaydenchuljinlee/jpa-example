package com.example.demo.domain

import java.lang.reflect.Member
import java.util.*
import java.util.Collections.emptyList
import javax.persistence.*

@Entity
data class Team(

    @Id @GeneratedValue
    @Column(name = "team_id")
    var id: Long,

    @Column(name = "name")
    var name: String,

    @OneToMany(mappedBy = "team")
    var members: List<Member> = emptyList()
) {
}