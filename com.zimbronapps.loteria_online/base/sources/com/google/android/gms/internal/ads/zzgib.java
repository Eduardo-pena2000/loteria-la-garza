package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgib implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;

    private zzgib(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
    }

    public static zzgib zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzgib(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzikp zzikpVar = this.zzd;
        zzikp zzikpVar2 = this.zzc;
        zzikp zzikpVar3 = this.zzb;
        zzika zzc = zzikf.zzc(this.zza);
        zzika zzc2 = zzikf.zzc(zzikpVar3);
        zzika zzc3 = zzikf.zzc(zzikpVar2);
        zzgbf zzgbfVar = (zzgbf) zzikpVar.zzb();
        return new zzgia(zzc, zzc2, zzc3, zzgbfVar.zzi().zza(), zzgbfVar.zzi().zzd());
    }
}
