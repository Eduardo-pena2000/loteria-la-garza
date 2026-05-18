package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzdsl implements Runnable {
    private final /* synthetic */ zzdsm zza;

    public /* synthetic */ zzdsl(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public final /* synthetic */ void run() {
        try {
            this.zza.zzc();
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.i("#007 Could not call remote method.", e);
        }
    }
}
