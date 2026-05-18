package com.google.android.gms.internal.ads;

import V5.q0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcqn implements zzcql {
    private final q0 zza;

    public zzcqn(q0 q0Var) {
        this.zza = q0Var;
    }

    public final void zza(Map map) {
        this.zza.zzb(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
