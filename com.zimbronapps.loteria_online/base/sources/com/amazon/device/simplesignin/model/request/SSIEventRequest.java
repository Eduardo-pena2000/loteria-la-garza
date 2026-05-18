package com.amazon.device.simplesignin.model.request;

import com.amazon.device.simplesignin.model.FailureReason;
import com.amazon.device.simplesignin.model.SSIEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class SSIEventRequest {
    private String epochTimestamp;
    private SSIEvent event;
    private FailureReason failureReason;

    public SSIEventRequest(SSIEvent sSIEvent, FailureReason failureReason) {
        this.epochTimestamp = String.valueOf(System.currentTimeMillis());
        this.event = sSIEvent;
        this.failureReason = failureReason;
    }

    public String getEpochTimestamp() {
        return this.epochTimestamp;
    }

    public SSIEvent getEvent() {
        return this.event;
    }

    public FailureReason getFailureReason() {
        return this.failureReason;
    }

    public SSIEventRequest(SSIEvent sSIEvent) {
        this.epochTimestamp = String.valueOf(System.currentTimeMillis());
        this.event = sSIEvent;
        this.failureReason = null;
    }
}
