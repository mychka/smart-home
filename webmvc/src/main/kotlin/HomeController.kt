package io.raif.smarthome

import io.raif.smarthome.entity.Home
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
    val homeService: HomeService
) {

    @GetMapping("homes")
    fun getHomesByRegion(@RequestParam region: String): List<Home> =
        homeService.getHomesByRegion(region)
}