package com.nls.nest;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public final class Camera {
    private String deviceId;
    private String softwareVersion;
    private String structureId;
    private String whereId;
    private String whereName;
    private String name;
    private String nameLong;
    private boolean isOnline;

    private boolean isStreaming;
    private boolean isAudioInputEnabled;
    private ZonedDateTime lastIsOnlineChange;
    private boolean isVideoHistoryEnabled;
    private String webUrl;
    private String appUrl;
    private boolean isPublicShareEnabled;
    private List<ActivityZone> activityZones;
    private String publicShareUrl;
    private String snapshotUrl;
    private LastEvent lastEvent;

    private Camera() {

    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public String getStructureId() {
        return structureId;
    }

    public String getWhereId() {
        return whereId;
    }

    public String getWhereName() {
        return whereName;
    }

    public String getName() {
        return name;
    }

    public String getNameLong() {
        return nameLong;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public boolean isStreaming() {
        return isStreaming;
    }

    public boolean isAudioInputEnabled() {
        return isAudioInputEnabled;
    }

    public ZonedDateTime getLastIsOnlineChange() {
        return lastIsOnlineChange;
    }

    public boolean isVideoHistoryEnabled() {
        return isVideoHistoryEnabled;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public boolean isPublicShareEnabled() {
        return isPublicShareEnabled;
    }

    public List<ActivityZone> getActivityZones() {
        return Collections.unmodifiableList(activityZones == null ? Collections.emptyList() : activityZones);
    }

    public String getPublicShareUrl() {
        return publicShareUrl;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public LastEvent getLastEvent() {
        return lastEvent;
    }
}
