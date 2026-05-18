package org.apache.tika.parser.external;

import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean a(Process process, long j, TimeUnit timeUnit) {
        return process.waitFor(j, timeUnit);
    }
}
