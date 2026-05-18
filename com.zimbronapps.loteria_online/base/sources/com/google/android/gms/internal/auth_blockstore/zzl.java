package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import q6.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            zza(status, createByteArray);
        } else {
            if (i != 2) {
                return false;
            }
            Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
            e eVar = (e) zzc.zza(parcel, e.CREATOR);
            enforceNoDataAvail(parcel);
            zzb(status2, eVar);
        }
        return true;
    }
}
