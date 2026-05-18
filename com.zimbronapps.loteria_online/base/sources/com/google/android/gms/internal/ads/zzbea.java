package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbea implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbee zzb;

    public zzbea(zzbee zzbeeVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbeeVar);
        this.zzb = zzbeeVar;
    }

    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
