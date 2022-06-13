package io.raif.smarthome

import org.springframework.web.bind.annotation.RestController

@RestController
class SensorController(
    val loopSensorService: LoopSensorService,
    val sensorService: SensorService
) {

//    @GetMapping("loopSensors")
//    fun listUserHouseSensors(@RequestParam userId: Long, @RequestParam houseId: Long): List<Sensor> =
//        loopSensorService.listUserHouseSensors(userId, houseId)
//
//    @GetMapping("loopSensorTemperatures")
//    fun loopListUserHouseSensorTemperatures(
//        @RequestParam userId: Long,
//        @RequestParam houseId: Long
//    ): List<SensorTemperature> =
//        loopSensorService.listUserHouseSensorTemperatures(userId, houseId)
//
//    @GetMapping("sensorTemperatures")
//    fun listUserHouseSensorTemperatures(
//        @RequestParam userId: Long,
//        @RequestParam houseId: Long
//    ): List<SensorTemperature> =
//        sensorService.listUserHouseSensorTemperatures(userId, houseId)
}