package com.google.android.gms.internal.ads;

import V5.o0;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcsq implements Runnable {
    private final /* synthetic */ JSONObject zza;
    private final /* synthetic */ zzcjl zzb;

    public /* synthetic */ zzcsq(JSONObject jSONObject, zzcjl zzcjlVar) {
        this.zza = jSONObject;
        this.zzb = zzcjlVar;
    }

    public final /* synthetic */ void run() {
        JSONObject jSONObject = this.zza;
        String obj = jSONObject.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 31);
        sb.append("Calling AFMA_updateActiveView(");
        sb.append(obj);
        sb.append(")");
        String sb2 = sb.toString();
        int i = o0.b;
        W5.p.a(sb2);
        this.zzb.zzb("AFMA_updateActiveView", jSONObject);
    }
}
