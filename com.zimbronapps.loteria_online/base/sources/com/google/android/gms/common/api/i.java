package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class i {

    public interface a {
        void a(Status status);
    }

    public abstract void addStatusListener(a aVar);

    public abstract m await(long j, TimeUnit timeUnit);
}
