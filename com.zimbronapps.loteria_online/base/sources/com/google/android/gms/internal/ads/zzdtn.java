package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdtn extends zzdsy implements zzdjm {
    private zzdjm zza;

    public final synchronized void zzdQ() {
        zzdjm zzdjmVar = this.zza;
        if (zzdjmVar != null) {
            zzdjmVar.zzdQ();
        }
    }

    public final synchronized void zzdu() {
        zzdjm zzdjmVar = this.zza;
        if (zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    public final synchronized void zzn(S5.a aVar, zzbmx zzbmxVar, U5.E e, zzbmz zzbmzVar, U5.e eVar, zzdjm zzdjmVar) {
        super.zzm(aVar, zzbmxVar, e, zzbmzVar, eVar);
        this.zza = zzdjmVar;
    }
}
