package com.google.android.recaptcha.internal;

import Za.E;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + E.r0(String.valueOf(this.zzb / this.zza), 10, (char) 0, 2, (Object) null) + " us| maxExecutionTime: " + E.r0(String.valueOf(this.zzc), 10, (char) 0, 2, (Object) null) + " us| totalTime: " + E.r0(String.valueOf(this.zzb), 10, (char) 0, 2, (Object) null) + " us| #Usages: " + E.r0(String.valueOf(this.zza), 5, (char) 0, 2, (Object) null);
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return Fa.b.d(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
