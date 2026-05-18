package com.google.android.gms.internal.ads;

import V5.o0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfcd implements zzfav {
    private final String zza;

    public zzfcd(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e) {
            o0.l("Failed putting Ad ID.", e);
        }
    }
}
