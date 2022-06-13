package io.raif.smarthome.util

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory
import org.springframework.boot.web.server.WebServerFactoryCustomizer
import org.springframework.stereotype.Component

@Component
class JettyCustomizer : WebServerFactoryCustomizer<JettyServletWebServerFactory> {

    override fun customize(factory: JettyServletWebServerFactory) {
        factory.threadPool = LoomThreadPool()
    }
}