package com.revenuecat.purchases.utils;

import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RateLimiter {
    private final long[] callTimestamps;
    private int index;
    private final int maxCallInclusive;
    private final int maxCallsInPeriod;
    private final long periodSeconds;

    public /* synthetic */ RateLimiter(int i, long j, k kVar) {
        this(i, j);
    }

    public final int getMaxCallsInPeriod() {
        return this.maxCallsInPeriod;
    }

    public final long getPeriodSeconds-UwyO8pc() {
        return this.periodSeconds;
    }

    public final synchronized boolean shouldProceed() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = (this.index + 1) % this.maxCallInclusive;
        long j = this.callTimestamps[i];
        if (j != 0 && currentTimeMillis - j <= ab.b.q(this.periodSeconds)) {
            return false;
        }
        this.callTimestamps[this.index] = currentTimeMillis;
        this.index = i;
        return true;
    }

    private RateLimiter(int i, long j) {
        this.maxCallsInPeriod = i;
        this.periodSeconds = j;
        int i2 = i + 1;
        this.maxCallInclusive = i2;
        this.callTimestamps = new long[i2];
    }
}
