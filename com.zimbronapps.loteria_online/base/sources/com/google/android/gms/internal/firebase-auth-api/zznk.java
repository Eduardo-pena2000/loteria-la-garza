package com.google.android.gms.internal.firebase-auth-api;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zznk {
    private Map zza;
    private Map zzb;

    public /* synthetic */ zznk(zznn zznnVar) {
        this();
    }

    public final zznk zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    private zznk() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zznl zza() {
        return new zznl(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }
}
