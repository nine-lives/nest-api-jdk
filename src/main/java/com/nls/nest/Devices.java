package com.nls.nest;

import java.util.Collections;
import java.util.Map;

public final class Devices {

    private Map<String, Thermostat> thermostats;
    private Map<String, SmokeCoAlarm> smokeCoAlarms;
    private Map<String, Camera> cameras;

    private Devices() {

    }

    public Map<String, Thermostat> getThermostats() {
        return Collections.unmodifiableMap(thermostats == null ? Collections.emptyMap() : thermostats);
    }

    public Map<String, SmokeCoAlarm> getSmokeCoAlarms() {
        return Collections.unmodifiableMap(smokeCoAlarms == null ? Collections.emptyMap() : smokeCoAlarms);
    }

    public Map<String, Camera> getCameras() {
        return Collections.unmodifiableMap(cameras == null ? Collections.emptyMap() : cameras);
    }
}
