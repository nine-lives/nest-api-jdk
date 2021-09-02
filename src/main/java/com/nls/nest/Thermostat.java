package com.nls.nest;

import java.time.ZonedDateTime;

public final class Thermostat {
    private String deviceId;
    private String locale;
    private String softwareVersion;
    private String structureId;
    private String name;
    private String nameLong;
    private ZonedDateTime lastConnection;
    private boolean isOnline;
    private boolean canCool;
    private boolean canHeat;
    private boolean isUsingEmergencyHeat;
    private boolean hasFan;
    private boolean fanTimerActive;
    private ZonedDateTime fanTimerTimeout;
    private boolean hasLeaf;
    private TemperatureScale temperatureScale;
    private Long targetTemperatureF;
    private Double targetTemperatureC;
    private Long targetTemperatureHighF;
    private Double targetTemperatureHighC;
    private Long targetTemperatureLowF;
    private Double targetTemperatureLowC;
    private Long ecoTemperatureHighF;
    private Double ecoTemperatureHighC;
    private Long ecoTemperatureLowF;
    private Double ecoTemperatureLowC;
    private Long awayTemperatureHighF;
    private Double awayTemperatureHighC;
    private Long awayTemperatureLowF;
    private Double awayTemperatureLowC;
    private String hvacMode;
    private String previousHvacMode;
    private Long ambientTemperatureF;
    private Double ambientTemperatureC;
    private Long humidity;
    private HvacState hvacState;
    private String whereId;
    private boolean isLocked;
    private Long lockedTempMinF;
    private Long lockedTempMaxF;
    private Double lockedTempMinC;
    private Double lockedTempMaxC;
    private String label;
    private String whereName;
    private boolean sunlightCorrectionEnabled;
    private boolean sunlightCorrectionActive;
    private int fanTimerDuration;
    private String timeToTarget;
    private String timeToTargetTraining;

    private Thermostat() {

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

    public boolean isCanCool() {
        return canCool;
    }

    public boolean isCanHeat() {
        return canHeat;
    }

    public boolean isUsingEmergencyHeat() {
        return isUsingEmergencyHeat;
    }

    public boolean isHasFan() {
        return hasFan;
    }

    public boolean isFanTimerActive() {
        return fanTimerActive;
    }

    public ZonedDateTime getFanTimerTimeout() {
        return fanTimerTimeout;
    }

    public boolean isHasLeaf() {
        return hasLeaf;
    }

    public TemperatureScale getTemperatureScale() {
        return temperatureScale;
    }

    public Long getTargetTemperatureF() {
        return targetTemperatureF;
    }

    public Double getTargetTemperatureC() {
        return targetTemperatureC;
    }

    public Long getTargetTemperatureHighF() {
        return targetTemperatureHighF;
    }

    public Double getTargetTemperatureHighC() {
        return targetTemperatureHighC;
    }

    public Long getTargetTemperatureLowF() {
        return targetTemperatureLowF;
    }

    public Double getTargetTemperatureLowC() {
        return targetTemperatureLowC;
    }

    public Long getEcoTemperatureHighF() {
        return ecoTemperatureHighF;
    }

    public Double getEcoTemperatureHighC() {
        return ecoTemperatureHighC;
    }

    public Long getEcoTemperatureLowF() {
        return ecoTemperatureLowF;
    }

    public Double getEcoTemperatureLowC() {
        return ecoTemperatureLowC;
    }

    public Long getAwayTemperatureHighF() {
        return awayTemperatureHighF;
    }

    public Double getAwayTemperatureHighC() {
        return awayTemperatureHighC;
    }

    public Long getAwayTemperatureLowF() {
        return awayTemperatureLowF;
    }

    public Double getAwayTemperatureLowC() {
        return awayTemperatureLowC;
    }

    public HvacMode getHvacMode() {
        return HvacMode.fromString(hvacMode);
    }

    public HvacMode getPreviousHvacMode() {
        return HvacMode.fromString(previousHvacMode);
    }

    public Long getAmbientTemperatureF() {
        return ambientTemperatureF;
    }

    public Double getAmbientTemperatureC() {
        return ambientTemperatureC;
    }

    public Long getHumidity() {
        return humidity;
    }

    public HvacState getHvacState() {
        return hvacState;
    }

    public String getWhereId() {
        return whereId;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public Long getLockedTempMinF() {
        return lockedTempMinF;
    }

    public Long getLockedTempMaxF() {
        return lockedTempMaxF;
    }

    public Double getLockedTempMinC() {
        return lockedTempMinC;
    }

    public Double getLockedTempMaxC() {
        return lockedTempMaxC;
    }

    public String getLabel() {
        return label;
    }

    public String getWhereName() {
        return whereName;
    }

    public boolean isSunlightCorrectionEnabled() {
        return sunlightCorrectionEnabled;
    }

    public boolean isSunlightCorrectionActive() {
        return sunlightCorrectionActive;
    }

    public int getFanTimerDuration() {
        return fanTimerDuration;
    }

    public String getTimeToTarget() {
        return timeToTarget;
    }

    public String getTimeToTargetTraining() {
        return timeToTargetTraining;
    }
}
