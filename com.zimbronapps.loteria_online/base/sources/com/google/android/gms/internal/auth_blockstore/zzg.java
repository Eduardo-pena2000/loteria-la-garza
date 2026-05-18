package com.google.android.gms.internal.auth_blockstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q6.c;
import q6.d;
import q6.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void zza(zzi zziVar, c cVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zziVar);
        zzc.zzb(obtainAndWriteInterfaceToken, cVar);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    public final void zzb(zzk zzkVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zzkVar);
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
    }

    public final void zzc(zzm zzmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zzmVar);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void zzd(zzm zzmVar, d dVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zzmVar);
        zzc.zzb(obtainAndWriteInterfaceToken, dVar);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }

    public final void zze(zzo zzoVar, f fVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zzc(obtainAndWriteInterfaceToken, zzoVar);
        zzc.zzb(obtainAndWriteInterfaceToken, fVar);
        transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
    }
}
