package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeeo extends zzbzk {
    final /* synthetic */ zzeeq zza;

    public zzeeo(zzeeq zzeeqVar) {
        Objects.requireNonNull(zzeeqVar);
        this.zza = zzeeqVar;
    }

    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzeeq zzeeqVar = this.zza;
        zzeeqVar.zza.zzc(new zzefg(autoCloseInputStream, zzeeqVar.zze));
    }

    public final void zzf(V5.C c) {
        this.zza.zza.zzd(c.N1());
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) {
        this.zza.zza.zzc(new zzefg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbzuVar));
    }
}
