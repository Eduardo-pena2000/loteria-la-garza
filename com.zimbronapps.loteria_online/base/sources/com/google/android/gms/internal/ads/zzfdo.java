package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfdo implements zzfav {
    private final String zza;

    public zzfdo(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.zza;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            V5.S.h(jSONObject, "pii").put("adsid", str);
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.g("Failed putting trustless token.", e);
        }
    }
}
