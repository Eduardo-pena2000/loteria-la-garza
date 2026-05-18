package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbmw implements zzboh {
    private final zzbmx zza;

    public zzbmw(zzbmx zzbmxVar) {
        this.zza = zzbmxVar;
    }

    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i = o0.b;
            W5.p.e("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = V5.S.l(new JSONObject((String) map.get("info")));
            } catch (JSONException e) {
                int i2 = o0.b;
                W5.p.d("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle != null) {
            this.zza.zza(str, bundle);
        } else {
            int i3 = o0.b;
            W5.p.c("Failed to convert ad metadata to Bundle.");
        }
    }
}
