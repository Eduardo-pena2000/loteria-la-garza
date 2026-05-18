package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimestampExtensionsKt {
    public static final long duration(long j) {
        return System.nanoTime() - j;
    }

    public static final Timestamp fromMillis(long j) {
        long j2 = 1000;
        Timestamp build = Timestamp.newBuilder().setSeconds(j / j2).setNanos((int) ((j % j2) * 1000000)).build();
        t.f(build, "newBuilder().setSeconds(…000000).toInt())).build()");
        return build;
    }
}
