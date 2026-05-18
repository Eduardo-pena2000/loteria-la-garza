package com.google.android.gms.internal.games_v2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaj extends zza implements zzal {
    public zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.recall.IRecallService");
    }

    public final void zzd(zzai zzaiVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, zzaiVar);
        zza.writeString("unusedServerClientId");
        zzc(2, zza);
    }
}
