package com.example.demo.domain

import javax.persistence.*

@Entity
@Table(name = "member")
data class Member(
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    var memberId: Long,

    @Column(name = "username")
    var username: String,

    @Column(name = "age")
    var age: Int,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    var team: Team

) {

}