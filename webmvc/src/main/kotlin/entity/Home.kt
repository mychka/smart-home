package io.raif.smarthome.entity

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*
import javax.persistence.Entity

@Entity
class Home(
    val region: String?
) : UuidPk()

interface HomeRepo : JpaRepository<Home, UUID> {

    fun findByRegion(region: String): List<Home>
}
