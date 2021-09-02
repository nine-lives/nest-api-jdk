package com.nls.nest;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public final class LastEvent {

    private boolean hasSound;
    private boolean hasMotion;
    private boolean hasPerson;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private ZonedDateTime urlsExpireTime;
    private String webUrl;
    private String appUrl;
    private String imageUrl;
    private String animatedImageUrl;
    private List<String> activityZoneIds;

    private LastEvent() {

    }

    public boolean isHasSound() {
        return hasSound;
    }

    public boolean isHasMotion() {
        return hasMotion;
    }

    public boolean isHasPerson() {
        return hasPerson;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public ZonedDateTime getUrlsExpireTime() {
        return urlsExpireTime;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getAnimatedImageUrl() {
        return animatedImageUrl;
    }

    public List<String> getActivityZoneIds() {
        return Collections.unmodifiableList(activityZoneIds == null ? Collections.emptyList() : activityZoneIds);
    }
}
