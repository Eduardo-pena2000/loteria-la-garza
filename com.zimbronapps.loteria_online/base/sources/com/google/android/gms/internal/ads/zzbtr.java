package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbtr extends zzbcs implements zzbtt {
    public zzbtr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public final zzbtw zzb(String str) throws RemoteException {
        zzbtw zzbtuVar;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(1, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbtuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbtuVar = queryLocalInterface instanceof zzbtw ? (zzbtw) queryLocalInterface : new zzbtu(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbtuVar;
    }

    public final boolean zzc(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    public final boolean zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    public final zzbvs zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(3, zza);
        zzbvs zzb = zzbvr.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }
}
