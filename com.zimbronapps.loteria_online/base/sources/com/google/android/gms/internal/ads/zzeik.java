package com.google.android.gms.internal.ads;

import android.app.Activity;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeik extends zzejg {
    private Activity zza;
    private U5.z zzb;
    private String zzc;
    private String zzd;

    public final zzejg zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    public final zzejg zzb(U5.z zVar) {
        this.zzb = zVar;
        return this;
    }

    public final zzejg zzc(String str) {
        this.zzc = str;
        return this;
    }

    public final zzejg zzd(String str) {
        this.zzd = str;
        return this;
    }

    public final zzejh zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzeil(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
