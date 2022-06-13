package io.raif.smarthome

import org.springframework.stereotype.Component

@Component
class SensorClient {

    fun temperatureForSensorId(id: Long): Double {
        Thread.sleep(1000)
        return Math.random()
    }

    fun temperatureForSensorIds(ids: List<Long>): Map<Long, Double> {
        Thread.sleep(1000)
        return ids.associateWith {
            Math.random()
        }
    }
}