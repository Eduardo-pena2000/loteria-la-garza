package org.apache.tika.pipes.async;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ long a(ChronoUnit chronoUnit, Temporal temporal, Temporal temporal2) {
        return chronoUnit.between(temporal, temporal2);
    }
}
