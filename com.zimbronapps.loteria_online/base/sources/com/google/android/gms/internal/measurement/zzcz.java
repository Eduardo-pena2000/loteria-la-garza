package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzcz extends zzbm implements zzda {
    public zzcz() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            zzbn.zzf(parcel);
            zze(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(zzf);
        }
        return true;
    }
}
