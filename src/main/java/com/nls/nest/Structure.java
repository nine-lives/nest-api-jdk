package com.nls.nest;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class Structure {
    public enum Away {
        away,
        home,
        unknown
    }

    private String structureId;
    private Set<String> thermostats;
    private Set<String> smokeCoAlarms;
    private Set<String> cameras;
    private Map<String, Object> devices;
    private Away away;
    private String name;
    private String countryCode;
    private String postalCode;
    private ZonedDateTime peakPeriodStartTime;
    private ZonedDateTime peakPeriodEndTime;
    private String timeZone;
    private ZonedDateTime etaBegin;
    private AlarmState coAlarmState;
    private AlarmState smokeAlarmState;
    private boolean rhrEnrollment;
    private Map<String, Where> wheres;

    public String getStructureId() {
        return structureId;
    }

    public Set<String> getThermostats() {
        return Collections.unmodifiableSet(thermostats == null ? Collections.emptySet() : thermostats);
    }

    public Set<String> getSmokeCoAlarms() {
        return Collections.unmodifiableSet(smokeCoAlarms == null ? Collections.emptySet() : smokeCoAlarms);
    }

    public Set<String> getCameras() {
        return Collections.unmodifiableSet(cameras == null ? Collections.emptySet() : cameras);
    }

    public Map<String, Object> getDevices() {
        return Collections.unmodifiableMap(devices == null ? Collections.emptyMap() : devices);
    }

    public Away getAway() {
        return away;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public ZonedDateTime getPeakPeriodStartTime() {
        return peakPeriodStartTime;
    }

    public ZonedDateTime getPeakPeriodEndTime() {
        return peakPeriodEndTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public ZonedDateTime getEtaBegin() {
        return etaBegin;
    }

    public AlarmState getCoAlarmState() {
        return coAlarmState;
    }

    public AlarmState getSmokeAlarmState() {
        return smokeAlarmState;
    }

    public boolean isRhrEnrollment() {
        return rhrEnrollment;
    }

    public Map<String, Where> getWheres() {
        return Collections.unmodifiableMap(wheres == null ? Collections.emptyMap() : wheres);
    }
}
