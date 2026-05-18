package org.apache.tika.fork;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class TimeoutLimits {
    private final long parseTimeoutMS;
    private final long pulseMS;
    private final long waitTimeoutMS;

    public TimeoutLimits(long j, long j2, long j3) {
        this.pulseMS = j;
        this.parseTimeoutMS = j2;
        this.waitTimeoutMS = j3;
    }

    public long getParseTimeoutMS() {
        return this.parseTimeoutMS;
    }

    public long getPulseMS() {
        return this.pulseMS;
    }

    public long getWaitTimeoutMS() {
        return this.waitTimeoutMS;
    }
}
