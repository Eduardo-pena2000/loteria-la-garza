package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbqm extends zzbct implements zzbqn {
    public zzbqm() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbqn zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbqn ? (zzbqn) queryLocalInterface : new zzbql(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbqg.CREATOR);
        zzbcu.zzh(parcel);
        zzb(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
