package com.refaccionaria.direy.entity

import javax.persistence.*

@Entity
@Table(name = "product")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val description: String,
    val brand: String,
    val category: String,
    val price: Double,
    val existence: Int
)