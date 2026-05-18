package com.google.android.gms.common.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q extends UnsupportedOperationException {
    public final v6.d a;

    public q(v6.d dVar) {
        this.a = dVar;
    }

    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
