package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcjm implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcce zza;
    final /* synthetic */ zzcjw zzb;

    public zzcjm(zzcjw zzcjwVar, zzcce zzcceVar) {
        this.zza = zzcceVar;
        Objects.requireNonNull(zzcjwVar);
        this.zzb = zzcjwVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
