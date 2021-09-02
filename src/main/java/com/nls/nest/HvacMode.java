package com.nls.nest;

public enum HvacMode {
    heat,
    cool,
    heat_cool,
    eco,
    off,
    blank;

    public static HvacMode fromString(String hvacMode) {
        return (hvacMode == null || "".equals(hvacMode)) ? blank : valueOf(hvacMode);
    }
}
