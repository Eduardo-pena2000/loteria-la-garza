package com.amazon.device.iap.internal.util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public enum d {
    LEGACY(0),
    V1(1),
    V2(2),
    V3(3);

    private int e;

    d(int i) {
        this.e = i;
    }

    public int a() {
        return this.e;
    }

    public boolean a(d dVar) {
        return dVar != null && this.e < dVar.e;
    }
}
