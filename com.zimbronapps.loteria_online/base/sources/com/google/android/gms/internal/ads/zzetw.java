package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzetw implements zzfax {
    private final Context zza;
    private final zzgzy zzb;

    public zzetw(zzgzy zzgzyVar, Context context) {
        this.zzb = zzgzyVar;
        this.zza = context;
    }

    public final x7.e zza() {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzor)).booleanValue()) {
            return zzgzo.zza(new zzetx(null, false));
        }
        ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzgzo.zza(new zzetx(null, false)) : this.zzb.submit(new zzetv(contentResolver));
    }

    public final int zzb() {
        return 61;
    }
}
