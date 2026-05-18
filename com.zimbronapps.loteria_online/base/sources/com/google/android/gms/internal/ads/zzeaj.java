package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeaj implements Runnable {
    private final /* synthetic */ zzeak zza;
    private final /* synthetic */ zzbqn zzb;

    public /* synthetic */ zzeaj(zzeak zzeakVar, zzbqn zzbqnVar) {
        this.zza = zzeakVar;
        this.zzb = zzbqnVar;
    }

    public final /* synthetic */ void run() {
        try {
            this.zzb.zzb(this.zza.zzd());
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.d("", e);
        }
    }
}
