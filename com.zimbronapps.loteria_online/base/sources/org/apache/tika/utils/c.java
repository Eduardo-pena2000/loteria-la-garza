package org.apache.tika.utils;

import java.time.Instant;
import java.time.temporal.TemporalUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ Instant a(Instant instant, TemporalUnit temporalUnit) {
        return instant.truncatedTo(temporalUnit);
    }
}
