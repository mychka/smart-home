package io.raif.smarthome

import org.springframework.stereotype.Service

@Service
class SensorService(
    val loopSensorService: LoopSensorService,
    val sensorClient: SensorClient
) {

//    fun listUserHouseSensorTemperatures(userId: Long, houseId: Long): List<SensorTemperature> {
//        val sensors: List<Sensor> = loopSensorService.listUserHouseSensors(userId, houseId)
//
//        val id2temperature: Map<Long, Double> = sensorClient.temperatureForSensorIds(
//            sensors.map { it.id }
//        )
//
//        val now = Instant.now()
//
//        return sensors.mapNotNull { sensor ->
//            id2temperature[sensor.id]?.let {
//                SensorTemperature(
//                    sensor,
//                    it,
//                    now
//                )
//            }
//        }
//    }
}
