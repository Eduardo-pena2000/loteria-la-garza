package com.google.android.gms.internal.drive;

import android.content.IntentSender;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzep extends zza implements zzeo {
    public zzep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.internal.IDriveService");
    }

    public final void zza(zzek zzekVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzekVar);
        zzc.zza(zza, zzeqVar);
        zzb(1, zza);
    }

    public final void zzb(zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, zzeqVar);
        zzb(35, zza);
    }

    public final void zza(zzgq zzgqVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzgqVar);
        zzc.zza(zza, zzeqVar);
        zzb(2, zza);
    }

    public final void zza(zzhf zzhfVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzhfVar);
        zzc.zza(zza, zzeqVar);
        zzb(3, zza);
    }

    public final void zza(zzr zzrVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzrVar);
        zzc.zza(zza, zzeqVar);
        zzb(4, zza);
    }

    public final void zza(zzw zzwVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzwVar);
        zzc.zza(zza, zzeqVar);
        zzb(5, zza);
    }

    public final void zza(zzy zzyVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzyVar);
        zzc.zza(zza, zzeqVar);
        zzb(6, zza);
    }

    public final zzec zza(zzgj zzgjVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzgjVar);
        zzc.zza(zza, zzeqVar);
        Parcel zza2 = zza(7, zza);
        zzec zza3 = zzc.zza(zza2, zzec.CREATOR);
        zza2.recycle();
        return zza3;
    }

    public final void zza(zzo zzoVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzoVar);
        zzc.zza(zza, zzeqVar);
        zzb(8, zza);
    }

    public final void zza(zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, zzeqVar);
        zzb(9, zza);
    }

    public final IntentSender zza(zzgm zzgmVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzgmVar);
        Parcel zza2 = zza(10, zza);
        IntentSender zza3 = zzc.zza(zza2, IntentSender.CREATOR);
        zza2.recycle();
        return zza3;
    }

    public final IntentSender zza(zzu zzuVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzuVar);
        Parcel zza2 = zza(11, zza);
        IntentSender zza3 = zzc.zza(zza2, IntentSender.CREATOR);
        zza2.recycle();
        return zza3;
    }

    public final void zza(zzex zzexVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzexVar);
        zzc.zza(zza, zzeqVar);
        zzb(13, zza);
    }

    public final void zza(zzj zzjVar, zzes zzesVar, String str, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzjVar);
        zzc.zza(zza, zzesVar);
        zza.writeString((String) null);
        zzc.zza(zza, zzeqVar);
        zzb(14, zza);
    }

    public final void zza(zzgs zzgsVar, zzes zzesVar, String str, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzgsVar);
        zzc.zza(zza, zzesVar);
        zza.writeString((String) null);
        zzc.zza(zza, zzeqVar);
        zzb(15, zza);
    }

    public final void zza(zzad zzadVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzadVar);
        zzb(16, zza);
    }

    public final void zza(zzhb zzhbVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzhbVar);
        zzc.zza(zza, zzeqVar);
        zzb(17, zza);
    }

    public final void zza(zzm zzmVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzmVar);
        zzc.zza(zza, zzeqVar);
        zzb(18, zza);
    }

    public final void zza(zzab zzabVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzabVar);
        zzc.zza(zza, zzeqVar);
        zzb(24, zza);
    }

    public final void zza(zzgw zzgwVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzgwVar);
        zzc.zza(zza, zzeqVar);
        zzb(28, zza);
    }

    public final void zza(zzgu zzguVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzguVar);
        zzc.zza(zza, zzeqVar);
        zzb(36, zza);
    }

    public final void zza(zzhd zzhdVar, zzeq zzeqVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zza(zza, (Parcelable) zzhdVar);
        zzc.zza(zza, zzeqVar);
        zzb(38, zza);
    }
}
