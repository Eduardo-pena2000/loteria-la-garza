package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdnl implements zzikg {
    private final zzikp zza;

    private zzdnl(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzdnl zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzdnl(zzikpVar, zzikpVar2);
    }

    public final /* synthetic */ Object zzb() {
        W5.a zza = ((zzcna) this.zza).zza();
        R5.t.g();
        return new zzbdb(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
