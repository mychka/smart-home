package io.raif.smarthome

import org.springframework.stereotype.Service
import java.time.Instant

@Service
class LoopSensorService(
//    val sensorRepo: SensorRepo,
//    val sensorClient: SensorClient
) {

//    fun listUserHouseSensors(userId: Long, houseId: Long): List<Sensor> =
//        sensorRepo.findByUserIdAndHouseId(userId, houseId)
//
//    fun listUserHouseSensorTemperatures(userId: Long, houseId: Long): List<SensorTemperature> {
//        val sensors: List<Sensor> = listUserHouseSensors(userId, houseId)
//
//        val temperatures = mutableListOf<SensorTemperature>()
//
//        for (sensor in sensors) {
//            temperatures.add(
//                SensorTemperature(
//                    sensor,
//                    sensorClient.temperatureForSensorId(sensor.id),
//                    Instant.now()
//                )
//            )
//        }
//
//        return temperatures
//    }
}

//class SensorTemperature(
//    val sensor: Sensor,
//    val temperature: Double,
//    val timestamp: Instant
//)