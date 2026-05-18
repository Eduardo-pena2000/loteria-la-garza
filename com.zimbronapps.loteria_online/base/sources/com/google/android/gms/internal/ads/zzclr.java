package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzclr extends Thread {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzcls zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzclr(zzcls zzclsVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzclsVar);
        this.zzb = zzclsVar;
    }

    public final void run() {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}
