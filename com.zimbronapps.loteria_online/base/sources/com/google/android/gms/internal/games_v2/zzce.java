package com.google.android.gms.internal.games_v2;

import T6.a;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzce implements a {
    private final zzaq zza;

    public zzce(zzaq zzaqVar) {
        this.zza = zzaqVar;
    }

    public final Task getAchievementsIntent() {
        return this.zza.zzb(new zzca());
    }

    public final void increment(String str, int i) {
        this.zza.zzb(new zzcd(str, i));
    }

    public final Task incrementImmediate(String str, int i) {
        return this.zza.zzb(new zzcd(str, i));
    }

    public final Task load(boolean z) {
        return this.zza.zzb(new zzby(z));
    }

    public final void reveal(String str) {
        this.zza.zzb(new zzbz(str));
    }

    public final Task revealImmediate(String str) {
        return this.zza.zzb(new zzbz(str));
    }

    public final void setSteps(String str, int i) {
        this.zza.zzb(new zzbt(str, i));
    }

    public final Task setStepsImmediate(String str, int i) {
        return this.zza.zzb(new zzbt(str, i));
    }

    public final void unlock(String str) {
        this.zza.zzb(new zzbx(str));
    }

    public final Task unlockImmediate(String str) {
        return this.zza.zzb(new zzbx(str));
    }
}
