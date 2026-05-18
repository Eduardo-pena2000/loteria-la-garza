package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzw extends zza implements IInterface {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    public final void zzc(zzv zzvVar, RegisterRequestParams registerRequestParams) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeStrongBinder(zzvVar);
        zzc.zzd(zza, registerRequestParams);
        zzb(1, zza);
    }

    public final void zzd(zzv zzvVar, SignRequestParams signRequestParams) throws RemoteException {
        Parcel zza = zza();
        int i = zzc.zza;
        zza.writeStrongBinder(zzvVar);
        zzc.zzd(zza, signRequestParams);
        zzb(2, zza);
    }
}
