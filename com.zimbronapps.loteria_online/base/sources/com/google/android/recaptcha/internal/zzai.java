package com.google.android.recaptcha.internal;

import cb.Q;
import cb.i;
import java.util.TimerTask;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    public final void run() {
        zzan zzanVar = this.zza;
        i.d(zzan.zzg(zzanVar), (Ga.i) null, (Q) null, new zzaj(zzanVar, null), 3, (Object) null);
    }
}
