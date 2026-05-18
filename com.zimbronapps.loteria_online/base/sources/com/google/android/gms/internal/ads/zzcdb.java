package com.google.android.gms.internal.ads;

import N6.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcdb extends zzbcs implements zzcdd {
    public zzcdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final void zze(N6.a aVar, zzcdh zzcdhVar, zzcda zzcdaVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, zzcdhVar);
        zzbcu.zze(zza, zzcdaVar);
        zzda(1, zza);
    }

    public final void zzf(N6.a aVar) throws RemoteException {
        throw null;
    }

    public final void zzg(List list, N6.a aVar, zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    public final void zzh(List list, N6.a aVar, zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    public final void zzi(zzbyk zzbykVar) throws RemoteException {
        throw null;
    }

    public final void zzj(N6.a aVar) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzda(8, zza);
    }

    public final void zzk(List list, N6.a aVar, zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    public final void zzl(List list, N6.a aVar, zzbyh zzbyhVar) throws RemoteException {
        throw null;
    }

    public final N6.a zzm(N6.a aVar, N6.a aVar2, String str, N6.a aVar3) throws RemoteException {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        zza.writeString(str);
        zzbcu.zze(zza, aVar3);
        Parcel zzcZ = zzcZ(11, zza);
        N6.a q1 = a.a.q1(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return q1;
    }
}
