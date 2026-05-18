package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgzc extends zzgyq {
    private zzgzb zza;

    public zzgzc(zzgub zzgubVar, boolean z, Executor executor, Callable callable) {
        super(zzgubVar, z, false);
        this.zza = new zzgza(this, callable, executor);
        zze();
    }

    public final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    public final /* synthetic */ void zzD(zzgzb zzgzbVar) {
        this.zza = null;
    }

    public final void zzi() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zzh();
        }
    }

    public final void zzw(int i, Object obj) {
    }

    public final void zzx() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zze();
        }
    }
}
