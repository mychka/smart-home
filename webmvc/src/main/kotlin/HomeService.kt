package io.raif.smarthome

import io.raif.smarthome.entity.Home
import io.raif.smarthome.entity.HomeRepo
import org.springframework.stereotype.Service

@Service
class HomeService(
    val homeRepo: HomeRepo
) {

    fun getHomesByRegion(region: String): List<Home> =
        homeRepo.findByRegion(region)
}