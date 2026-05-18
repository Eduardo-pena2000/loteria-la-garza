package com.applovin.shadow.okio;

import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Timeout$Companion$NONE$1 extends Timeout {
    public Timeout deadlineNanoTime(long j) {
        return this;
    }

    public void throwIfReached() {
    }

    public Timeout timeout(long j, TimeUnit timeUnit) {
        kotlin.jvm.internal.t.g(timeUnit, "unit");
        return this;
    }
}
