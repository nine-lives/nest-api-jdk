package com.nls.nest;

import java.time.ZonedDateTime;

public final class SmokeCoAlarm {
    private String deviceId;
    private String locale;
    private String softwareVersion;
    private String structureId;
    private String name;
    private String nameLong;
    private ZonedDateTime lastConnection;
    private boolean isOnline;

    private BatteryHealth batteryHealth;
    private AlarmState coAlarmState;
    private AlarmState smokeAlarmState;

    private boolean isManualTestActive;
    private ZonedDateTime lastManualTestTime;
    private UiColorState uiColorState;

    private String whereId;
    private String whereName;

    private SmokeCoAlarm() {

    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getLocale() {
        return locale;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public String getStructureId() {
        return structureId;
    }

    public String getName() {
        return name;
    }

    public String getNameLong() {
        return nameLong;
    }

    public ZonedDateTime getLastConnection() {
        return lastConnection;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public BatteryHealth getBatteryHealth() {
        return batteryHealth;
    }

    public AlarmState getCoAlarmState() {
        return coAlarmState;
    }

    public AlarmState getSmokeAlarmState() {
        return smokeAlarmState;
    }

    public boolean isManualTestActive() {
        return isManualTestActive;
    }

    public ZonedDateTime getLastManualTestTime() {
        return lastManualTestTime;
    }

    public UiColorState getUiColorState() {
        return uiColorState;
    }

    public String getWhereId() {
        return whereId;
    }

    public String getWhereName() {
        return whereName;
    }
}
