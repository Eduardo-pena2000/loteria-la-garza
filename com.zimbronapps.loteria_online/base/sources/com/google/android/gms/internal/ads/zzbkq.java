package com.google.android.gms.internal.ads;

import N6.a;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbkq extends zzbcs implements zzbks {
    public zzbkq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final N6.a zzb() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }

    public final Uri zzc() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        Uri zzb = zzbcu.zzb(zzcZ, Uri.CREATOR);
        zzcZ.recycle();
        return zzb;
    }

    public final double zzd() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        double readDouble = zzcZ.readDouble();
        zzcZ.recycle();
        return readDouble;
    }

    public final int zze() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    public final int zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        int readInt = zzcZ.readInt();
        zzcZ.recycle();
        return readInt;
    }

    public final Map zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        HashMap zzg = zzbcu.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
