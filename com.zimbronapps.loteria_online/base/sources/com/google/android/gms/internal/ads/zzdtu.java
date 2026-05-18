package com.google.android.gms.internal.ads;

import L5.B;
import S5.g1;
import S5.j1;
import V5.o0;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdtu extends B.a {
    private final zzdoh zza;

    public zzdtu(zzdoh zzdohVar) {
        this.zza = zzdohVar;
    }

    private static j1 zza(zzdoh zzdohVar) {
        g1 zzy = zzdohVar.zzy();
        if (zzy == null) {
            return null;
        }
        try {
            return zzy.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void onVideoEnd() {
        j1 zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzh();
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.g("Unable to call onVideoEnd()", e);
        }
    }

    public final void onVideoPause() {
        j1 zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.g("Unable to call onVideoEnd()", e);
        }
    }

    public final void onVideoStart() {
        j1 zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.g("Unable to call onVideoEnd()", e);
        }
    }
}
