package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzu extends zzb implements zzv {
    public zzu() {
        super("com.google.android.gms.games.internal.connect.IGamesConnectCallbacks");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        zzs zzsVar = (zzs) zzc.zza(parcel, zzs.CREATOR);
        zzc.zzb(parcel);
        zzb(status, zzsVar);
        return true;
    }
}
