package com.nls.nest;

import java.util.Collections;
import java.util.Map;

public final class NestData {
    private Devices devices;
    private Map<String, Structure> structures;
    private Metadata metadata;

    private NestData() {

    }

    public Devices getDevices() {
        return devices;
    }

    public Map<String, Structure> getStructures() {
        return Collections.unmodifiableMap(structures == null ? Collections.emptyMap() : structures);
    }

    public Metadata getMetadata() {
        return metadata;
    }
}
