package io.raif.smarthome.entity

import io.raif.smarthome.util.FlexibleTypes
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class UuidPk {
    /**
     * See [Flexible types as a solution to JPA Ids](https://www.reddit.com/r/Kotlin/comments/bcfrhw/flexible_types_as_a_solution_to_jpa_ids/)
     */
    @Id
    @GeneratedValue
    val id = FlexibleTypes.nullUuid()
}