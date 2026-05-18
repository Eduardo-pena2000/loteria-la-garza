package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfch implements zzfav {
    final String zza;
    final int zzb;

    public zzfch(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        String str = this.zza;
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(str) || (i = this.zzb) == -1) {
            return;
        }
        try {
            JSONObject h = V5.S.h(jSONObject, "pii");
            h.put("pvid", str);
            h.put("pvid_s", i);
        } catch (JSONException e) {
            o0.l("Failed putting gms core app set ID info.", e);
        }
    }
}
