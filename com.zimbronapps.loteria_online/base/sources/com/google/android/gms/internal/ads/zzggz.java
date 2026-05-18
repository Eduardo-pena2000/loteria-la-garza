package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzggz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;

    private zzggz(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
    }

    public static zzggz zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6) {
        return new zzggz(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzggy((zzawg) this.zza.zzb(), (zzgfx) this.zzb.zzb(), (zzgcc) this.zzc.zzb(), (Context) this.zzd.zzb(), (Map) this.zze.zzb(), (zzgoe) this.zzf.zzb());
    }
}
