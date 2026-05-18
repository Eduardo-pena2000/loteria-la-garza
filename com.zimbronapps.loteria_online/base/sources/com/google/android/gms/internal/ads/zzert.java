package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzert implements S5.a, zzdjm {
    private S5.H zza;

    public final synchronized void onAdClicked() {
        S5.H h = this.zza;
        if (h != null) {
            try {
                h.zzb();
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.g("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void zza(S5.H h) {
        this.zza = h;
    }

    public final synchronized void zzdQ() {
    }

    public final synchronized void zzdu() {
        S5.H h = this.zza;
        if (h != null) {
            try {
                h.zzb();
            } catch (RemoteException e) {
                int i = o0.b;
                W5.p.g("Remote Exception at onPhysicalClick.", e);
            }
        }
    }
}
