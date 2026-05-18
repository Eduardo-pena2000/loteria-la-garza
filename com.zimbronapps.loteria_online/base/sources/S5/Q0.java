package S5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcay;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzcdd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q0 extends zzbcs implements s0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final l0 B(N6.a aVar, zzbtt zzbttVar, int i) {
        l0 j0Var;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(18, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            j0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            j0Var = queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new j0(readStrongBinder);
        }
        zzcZ.recycle();
        return j0Var;
    }

    public final Y C0(N6.a aVar, q2 q2Var, String str, int i) {
        Y w;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, q2Var);
        zza.writeString(str);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(10, zza);
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

    public final Y E0(N6.a aVar, q2 q2Var, String str, zzbtt zzbttVar, int i) {
        Y w;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, q2Var);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(13, zza);
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

    public final zzbkw G(N6.a aVar, N6.a aVar2) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, aVar2);
        Parcel zzcZ = zzcZ(5, zza);
        zzbkw zzdF = zzbkv.zzdF(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzdF;
    }

    public final Y0 G0(N6.a aVar, zzbtt zzbttVar, int i) {
        Y0 w0;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(17, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            w0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            w0 = queryLocalInterface instanceof Y0 ? (Y0) queryLocalInterface : new W0(readStrongBinder);
        }
        zzcZ.recycle();
        return w0;
    }

    public final Y W(N6.a aVar, q2 q2Var, String str, zzbtt zzbttVar, int i) {
        Y w;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, q2Var);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(1, zza);
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

    public final zzbxl a1(N6.a aVar, zzbtt zzbttVar, int i) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(15, zza);
        zzbxl zzb = zzbxk.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzcdd f1(N6.a aVar, zzbtt zzbttVar, int i) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(14, zza);
        zzcdd zzb = zzcdc.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final U l0(N6.a aVar, String str, zzbtt zzbttVar, int i) {
        U s;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(3, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            s = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            s = queryLocalInterface instanceof U ? (U) queryLocalInterface : new S(readStrongBinder);
        }
        zzcZ.recycle();
        return s;
    }

    public final D0 m(N6.a aVar, int i) {
        D0 a0;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(9, zza);
        IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            a0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            a0 = queryLocalInterface instanceof D0 ? (D0) queryLocalInterface : new A0(readStrongBinder);
        }
        zzcZ.recycle();
        return a0;
    }

    public final zzcaz q(N6.a aVar, String str, zzbtt zzbttVar, int i) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(12, zza);
        zzcaz zzt = zzcay.zzt(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzt;
    }

    public final Y r(N6.a aVar, q2 q2Var, String str, zzbtt zzbttVar, int i) {
        Y w;
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zzc(zza, q2Var);
        zza.writeString(str);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        Parcel zzcZ = zzcZ(2, zza);
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

    public final zzbpk y(N6.a aVar, zzbtt zzbttVar, int i, zzbph zzbphVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        zzbcu.zze(zza, zzbttVar);
        zza.writeInt(254715000);
        zzbcu.zze(zza, zzbphVar);
        Parcel zzcZ = zzcZ(16, zza);
        zzbpk zzb = zzbpj.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzbxs zzg(N6.a aVar) {
        Parcel zza = zza();
        zzbcu.zze(zza, aVar);
        Parcel zzcZ = zzcZ(8, zza);
        zzbxs zzI = zzbxr.zzI(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzI;
    }
}
