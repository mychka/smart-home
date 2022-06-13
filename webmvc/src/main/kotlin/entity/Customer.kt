package io.raif.smarthome.entity

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*
import javax.persistence.Entity

@Entity
class Customer(
    val name: String
) : UuidPk()

interface CustomerRepo : JpaRepository<Customer, UUID>
