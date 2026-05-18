package com.google.android.gms.common.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class j {
    public static i a(m mVar, h hVar) {
        com.google.android.gms.common.internal.t.m(mVar, "Result must not be null");
        com.google.android.gms.common.internal.t.b(!mVar.getStatus().R1(), "Status code must not be SUCCESS");
        u uVar = new u(hVar, mVar);
        uVar.setResult(mVar);
        return uVar;
    }

    public static i b(Status status, h hVar) {
        com.google.android.gms.common.internal.t.m(status, "Result must not be null");
        com.google.android.gms.common.api.internal.v vVar = new com.google.android.gms.common.api.internal.v(hVar);
        vVar.setResult(status);
        return vVar;
    }
}
