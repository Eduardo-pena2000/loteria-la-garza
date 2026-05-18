package com.google.android.gms.tasks;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zza implements OnSuccessListener {
    final /* synthetic */ OnTokenCanceledListener zza;

    public zza(zzb zzbVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = onTokenCanceledListener;
        Objects.requireNonNull(zzbVar);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.zza.onCanceled();
    }
}
