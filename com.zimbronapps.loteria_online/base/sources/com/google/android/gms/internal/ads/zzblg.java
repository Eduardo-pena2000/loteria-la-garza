package com.google.android.gms.internal.ads;

import S5.g1;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzblg extends zzbct implements zzblh {
    public zzblg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                N6.a zzb = zzb();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzb);
                return true;
            case 3:
                String zzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(zzc);
                return true;
            case 4:
                List zzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(zzd);
                return true;
            case 5:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 6:
                zzbks zzf = zzf();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzf);
                return true;
            case 7:
                String zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 8:
                double zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeDouble(zzh);
                return true;
            case 9:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 10:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 11:
                Bundle zzk = zzk();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzk);
                return true;
            case 12:
                zzl();
                parcel2.writeNoException();
                return true;
            case 13:
                g1 zzm = zzm();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzm);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzn(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                boolean zzo = zzo(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzbcu.zzb(parcel, Bundle.CREATOR);
                zzbcu.zzh(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzbkl zzq = zzq();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzq);
                return true;
            case 18:
                N6.a zzr = zzr();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzr);
                return true;
            case 19:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            default:
                return false;
        }
    }
}
