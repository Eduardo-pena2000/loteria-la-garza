package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfgm implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzfgm(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
    }

    public static zzfgm zzc(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3) {
        return new zzfgm(zzikpVar, zzikpVar2, zzikpVar3);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfgj zzb() {
        Context context = (Context) this.zza.zzb();
        zzfkv zzfkvVar = (zzfkv) this.zzb.zzb();
        zzfln zzflnVar = (zzfln) this.zzc.zzb();
        zzcdp zzi = ((Boolean) S5.D.c().zzd(zzbhe.zzhk)).booleanValue() ? R5.t.l().zzo().zzi() : R5.t.l().zzo().zzj();
        boolean z = false;
        if (zzi != null && zzi.zzi()) {
            z = true;
        }
        if (((Integer) S5.D.c().zzd(zzbhe.zzhm)).intValue() > 0) {
            if (!((Boolean) S5.D.c().zzd(zzbhe.zzhj)).booleanValue() || z) {
                zzflm zza = zzflnVar.zza(zzfld.zza, context, zzfkvVar, new zzffm(new zzffl()));
                zzfga zzfgaVar = new zzfga(new zzffz());
                zzfkz zzfkzVar = zza.zza;
                zzgzy zzgzyVar = zzcei.zza;
                return new zzffq(zzfgaVar, new zzffw(zzfkzVar, zzgzyVar), zza.zzb, zzfkzVar.zze().zzf, zzgzyVar);
            }
        }
        return new zzffz();
    }
}
