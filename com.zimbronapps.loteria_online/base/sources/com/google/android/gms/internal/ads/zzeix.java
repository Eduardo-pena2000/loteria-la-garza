package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeix extends TimerTask {
    final /* synthetic */ AlertDialog zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ U5.z zzc;

    public zzeix(zzejf zzejfVar, AlertDialog alertDialog, Timer timer, U5.z zVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = zVar;
        Objects.requireNonNull(zzejfVar);
    }

    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        U5.z zVar = this.zzc;
        if (zVar != null) {
            zVar.zzb();
        }
    }
}
