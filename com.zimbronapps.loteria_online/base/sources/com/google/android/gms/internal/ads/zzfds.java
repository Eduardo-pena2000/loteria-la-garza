package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfds implements zzfav {
    private final Map zza;

    public zzfds(Map map) {
        this.zza = map;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", S5.B.a().t(this.zza));
        } catch (JSONException e) {
            o0.k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
