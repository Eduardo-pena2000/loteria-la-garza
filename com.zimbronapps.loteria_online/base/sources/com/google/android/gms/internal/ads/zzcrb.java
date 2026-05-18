package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.Context;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcrb implements zzcql {
    private final Context zza;
    private final q0 zzb = R5.t.l().zzo();

    public zzcrb(Context context) {
        this.zza = context;
    }

    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        q0 q0Var = this.zzb;
        boolean parseBoolean = Boolean.parseBoolean(str);
        q0Var.zzw(parseBoolean);
        if (parseBoolean) {
            V5.d.a(this.zza);
        }
    }
}
