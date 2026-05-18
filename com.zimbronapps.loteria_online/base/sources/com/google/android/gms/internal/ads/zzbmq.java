package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbmq extends zzblv {
    final /* synthetic */ zzbms zza;

    public /* synthetic */ zzbmq(zzbms zzbmsVar, byte[] bArr) {
        Objects.requireNonNull(zzbmsVar);
        this.zza = zzbmsVar;
    }

    public final void zze(zzblm zzblmVar, String str) {
        zzbms zzbmsVar = this.zza;
        if (zzbmsVar.zzd() == null) {
            return;
        }
        zzbmsVar.zzd().b(zzbmsVar.zze(zzblmVar), str);
    }
}
