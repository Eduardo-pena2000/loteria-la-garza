package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzftp implements zzfti {
    private static zzftp zza;
    private float zzb = 0.0f;
    private zzftd zzc;
    private zzfth zzd;

    public zzftp(zzfte zzfteVar, zzfta zzftaVar) {
    }

    public static zzftp zza() {
        if (zza == null) {
            zza = new zzftp(new zzfte(), new zzfta());
        }
        return zza;
    }

    public final void zzb(Context context) {
        this.zzc = new zzftd(new Handler(), context, new zzfsz(), this);
    }

    public final void zzc() {
        zzftg.zza().zzg(this);
        zzftg.zza().zze();
        zzfur.zzb().zzc();
        this.zzc.zza();
    }

    public final void zzd(boolean z) {
        if (z) {
            zzfur.zzb().zzc();
        } else {
            zzfur.zzb().zze();
        }
    }

    public final void zze() {
        zzfur.zzb().zzd();
        zzftg.zza().zzf();
        this.zzc.zzb();
    }

    public final void zzf(float f) {
        this.zzb = f;
        if (this.zzd == null) {
            this.zzd = zzfth.zza();
        }
        Iterator it = this.zzd.zzf().iterator();
        while (it.hasNext()) {
            ((zzfsn) it.next()).zzg().zzo(f);
        }
    }

    public final float zzg() {
        return this.zzb;
    }
}
