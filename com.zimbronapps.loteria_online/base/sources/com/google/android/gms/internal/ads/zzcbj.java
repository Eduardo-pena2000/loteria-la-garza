package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbj implements f6.b {
    private final zzcaw zza;

    public zzcbj(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    public final int getAmount() {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            try {
                return zzcawVar.zzf();
            } catch (RemoteException e) {
                W5.p.g("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    public final String getType() {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            try {
                return zzcawVar.zze();
            } catch (RemoteException e) {
                W5.p.g("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
