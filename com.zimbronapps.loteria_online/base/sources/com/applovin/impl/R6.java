package com.applovin.impl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class r6 extends i5 {
    private final Runnable g;

    public r6(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    public void run() {
        this.g.run();
    }

    public r6(com.applovin.impl.sdk.k kVar, boolean z, String str, Runnable runnable) {
        super("TaskRunnable:" + str, kVar, z);
        this.g = runnable;
    }
}
