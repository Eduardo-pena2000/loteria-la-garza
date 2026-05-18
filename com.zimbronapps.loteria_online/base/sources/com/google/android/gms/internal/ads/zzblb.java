package com.google.android.gms.internal.ads;

import N6.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzblb extends zzbct implements zzblc {
    public zzblb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzblc zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof zzblc ? (zzblc) queryLocalInterface : new zzbla(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            N6.a q1 = a.a.q1(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzb(q1);
        } else if (i == 2) {
            zzc();
        } else {
            if (i != 3) {
                return false;
            }
            N6.a q12 = a.a.q1(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            zzd(q12);
        }
        parcel2.writeNoException();
        return true;
    }
}
