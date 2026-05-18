package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzzn implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzaaa zza;

    public zzzn(zzzp zzzpVar, zzaaa zzaaaVar) {
        this.zza = zzaaaVar;
        Objects.requireNonNull(zzzpVar);
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzl();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzl();
    }
}
