package com.google.android.gms.internal.ads;

import android.os.IInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgpx implements Runnable {
    private final /* synthetic */ zzgpz zza;

    public /* synthetic */ zzgpx(zzgpz zzgpzVar) {
        this.zza = zzgpzVar;
    }

    public final /* synthetic */ void run() {
        zzgqf zzgqfVar = this.zza.zza;
        zzgqfVar.zzi().zza("unlinkToDeath", new Object[0]);
        IInterface zzm = zzgqfVar.zzm();
        zzm.getClass();
        zzm.asBinder().unlinkToDeath(zzgqfVar.zzl(), 0);
        zzgqfVar.zzn(null);
        zzgqfVar.zzk(false);
    }
}
