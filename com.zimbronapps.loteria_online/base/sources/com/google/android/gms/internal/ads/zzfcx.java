package com.google.android.gms.internal.ads;

import V5.o0;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfcx implements zzfav {
    private final List zza;

    public zzfcx(List list) {
        this.zza = list;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.zza));
        } catch (JSONException unused) {
            o0.k("Failed putting experiment ids.");
        }
    }
}
