package com.example.demo.domain

import javax.persistence.*
import kotlin.collections.ArrayList

@Entity
@Table(name = "team")
data class Team(

    @Id @GeneratedValue
    @Column(name = "team_id")
    var teamId: Long,

    @Column(name = "name")
    var name: String,

    @OneToMany
    @JoinColumn(name="team_id",
        insertable = false,
        updatable = false,
        foreignKey = ForeignKey(
            value = ConstraintMode.NO_CONSTRAINT
        ))
    var members: MutableList<Member> = ArrayList()
) {
}