package com.kopring.fitlinkbe.infrastructure.trainer

import com.kopring.fitlinkbe.infrastructure.common.model.BaseTimeEntity
import jakarta.persistence.*

@Entity
@Table(name = "trainer")
class TrainerEntity(
    name: String,
    age: Int,
) : BaseTimeEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    @Column(name = "name")
    var name = name
        protected set

    @Column(name = "age")
    var age = age
        protected set
}