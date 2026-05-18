package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbkk extends zzbct implements zzbkl {
    public zzbkk() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbkl zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof zzbkl ? (zzbkl) queryLocalInterface : new zzbkj(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
            return true;
        }
        if (i != 3) {
            return false;
        }
        List zzc = zzc();
        parcel2.writeNoException();
        parcel2.writeList(zzc);
        return true;
    }
}
