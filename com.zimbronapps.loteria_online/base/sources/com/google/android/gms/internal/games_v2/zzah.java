package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.games.internal.recall.IRecallCallbacks");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzam zzamVar = (zzam) zzc.zza(parcel, zzam.CREATOR);
            zzc.zzb(parcel);
            zzc(zzamVar);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        zzc.zzb(parcel);
        zzb(status);
        return true;
    }
}
