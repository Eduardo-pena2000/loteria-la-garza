package com.google.android.gms.internal.ads;

import V5.F0;
import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwm implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwo zza;

    public zzbwm(zzbwo zzbwoVar) {
        Objects.requireNonNull(zzbwoVar);
        this.zza = zzbwoVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbwo zzbwoVar = this.zza;
        Intent zzb = zzbwoVar.zzb();
        R5.t.g();
        F0.B(zzbwoVar.zzc(), zzb);
    }
}
