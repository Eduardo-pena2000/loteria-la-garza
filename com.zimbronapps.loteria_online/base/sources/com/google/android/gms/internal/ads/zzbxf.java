package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxf {
    private final c.c zza;
    private final c.b zzb;
    private com.google.android.gms.ads.nativead.c zzc;

    public zzbxf(c.c cVar, c.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.ads.nativead.c zzc(zzblm zzblmVar) {
        com.google.android.gms.ads.nativead.c cVar = this.zzc;
        if (cVar != null) {
            return cVar;
        }
        zzbxg zzbxgVar = new zzbxg(zzblmVar);
        this.zzc = zzbxgVar;
        return zzbxgVar;
    }

    public final zzblz zza() {
        return new zzbxe(this, null);
    }

    public final zzblw zzb() {
        return null;
    }

    public final /* synthetic */ c.c zzd() {
        return null;
    }

    public final /* synthetic */ c.b zze() {
        return null;
    }
}
