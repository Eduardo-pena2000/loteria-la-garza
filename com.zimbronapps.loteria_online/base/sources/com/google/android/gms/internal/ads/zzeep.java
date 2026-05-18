package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeep extends zzbzk {
    private final zzcen zza;
    private final zzbzu zzb;

    public zzeep(zzcen zzcenVar, zzbzu zzbzuVar) {
        this.zza = zzcenVar;
        this.zzb = zzbzuVar;
    }

    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzefg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    public final void zzf(V5.C c) {
        this.zza.zzd(c.N1());
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbzu zzbzuVar) {
        this.zza.zzc(new zzefg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbzuVar));
    }
}
