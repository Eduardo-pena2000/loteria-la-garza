package S5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbex;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzcay;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j0 extends zzbcs implements l0 {
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    public final void zze(List list, g0 g0Var) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbcu.zze(zza, g0Var);
        zzda(1, zza);
    }

    public final boolean zzf(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(2, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    public final zzcaz zzg(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(3, zza);
        zzcaz zzt = zzcay.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    public final boolean zzh(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(4, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    public final zzbex zzi(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(5, zza);
        zzbex zzb = zzbew.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final boolean zzj(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(6, zza);
        boolean zza2 = zzbcu.zza(zzcZ);
        zzcZ.recycle();
        return zza2;
    }

    public final Y zzk(String str) {
        Y w;
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzcZ = zzcZ(7, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            w = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            w = queryLocalInterface instanceof Y ? (Y) queryLocalInterface : new W(readStrongBinder);
        }
        zzcZ.recycle();
        return w;
    }

    public final void zzl(zzbtt zzbttVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, zzbttVar);
        zzda(8, zza);
    }

    public final void zzv(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(18, zza);
    }
}
