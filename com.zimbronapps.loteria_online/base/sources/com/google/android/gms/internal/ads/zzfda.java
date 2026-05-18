package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfda implements zzfav {
    private final Bundle zza;

    public zzfda(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zza;
        if (bundle != null) {
            try {
                V5.S.h(V5.S.h(jSONObject, "device"), "play_store").put("parental_controls", S5.B.a().v(bundle));
            } catch (JSONException unused) {
                o0.k("Failed putting parental controls bundle.");
            }
        }
    }
}
