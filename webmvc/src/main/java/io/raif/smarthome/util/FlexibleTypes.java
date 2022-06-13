package io.raif.smarthome.util;

import java.util.UUID;

/**
 * A hack to make use of Kotlin's flexible types.
 * For what are flexible types see <a href="https://youtu.be/2IhT8HACc2E">JVMLS 2015 - Flexible Types of Kotlin - Andrey Breslav</a>
 */
public class FlexibleTypes {

    public static UUID nullUuid() {
        return null;
    }
}
