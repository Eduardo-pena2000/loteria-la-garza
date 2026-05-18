package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfo {
    private final zzfn zza;
    private final zzdx zzb;
    private final zzdx zzc;
    private boolean zzd;
    private boolean zze;

    public zzfo(Context context, Looper looper, zzdn zzdnVar) {
        this.zza = new zzfn(context.getApplicationContext());
        this.zzb = zzdnVar.zzd(looper, null);
        this.zzc = zzdnVar.zzd(Looper.getMainLooper(), null);
    }

    public static /* synthetic */ boolean zze(boolean z, boolean z2) {
        return zzg(z, z2);
    }

    private final void zzf(boolean z, boolean z2) {
        if (zzg(z, z2)) {
            this.zzb.zzn(new zzfl(this, z, z2));
            return;
        }
        zzfn zzfnVar = this.zza;
        Objects.requireNonNull(zzfnVar);
        zzfk zzfkVar = new zzfk(zzfnVar);
        this.zzc.zzo(zzfkVar, 1000L);
        this.zzb.zzn(new zzfm(this, zzfkVar, z, z2));
    }

    private static boolean zzg(boolean z, boolean z2) {
        return z && z2;
    }

    public final void zza(boolean z) {
        if (this.zzd == z) {
            return;
        }
        this.zzd = z;
        zzf(z, this.zze);
    }

    public final void zzb(boolean z) {
        if (this.zze == z) {
            return;
        }
        this.zze = z;
        if (this.zzd) {
            zzf(true, z);
        }
    }

    public final /* synthetic */ void zzc(Runnable runnable, boolean z, boolean z2) {
        this.zzc.zzl(runnable);
        this.zza.zzb(z, z2);
    }

    public final /* synthetic */ void zzd(boolean z, boolean z2) {
        this.zza.zzb(z, z2);
    }
}
