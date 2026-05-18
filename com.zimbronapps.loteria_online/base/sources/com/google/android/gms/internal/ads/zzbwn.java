package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwn implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwo zza;

    public zzbwn(zzbwo zzbwoVar) {
        Objects.requireNonNull(zzbwoVar);
        this.zza = zzbwoVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
