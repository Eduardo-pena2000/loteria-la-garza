package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbq extends zzcav {
    private final String zza;
    private final int zzb;

    public zzcbq(f6.b bVar) {
        this(bVar != null ? bVar.getType() : "", bVar != null ? bVar.getAmount() : 1);
    }

    public final String zze() throws RemoteException {
        return this.zza;
    }

    public final int zzf() throws RemoteException {
        return this.zzb;
    }

    public zzcbq(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
