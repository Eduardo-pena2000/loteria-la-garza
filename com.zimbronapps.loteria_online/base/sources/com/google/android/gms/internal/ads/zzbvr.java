package com.google.android.gms.internal.ads;

import N6.a;
import S5.g1;
import S5.l2;
import S5.q2;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbvr extends zzbct implements zzbvs {
    public zzbvr() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbvs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return queryLocalInterface instanceof zzbvs ? (zzbvs) queryLocalInterface : new zzbvq(iBinder);
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvv zzbvvVar = null;
        zzbvd zzbvbVar = null;
        zzbvm zzbvkVar = null;
        zzbvg zzbveVar = null;
        zzbvp zzbvnVar = null;
        zzbvm zzbvkVar2 = null;
        zzbvp zzbvnVar2 = null;
        zzbvj zzbvhVar = null;
        zzbvg zzbveVar2 = null;
        if (i == 1) {
            N6.a q1 = a.a.q1(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzbcu.zzb(parcel, creator);
            Bundle bundle2 = (Bundle) zzbcu.zzb(parcel, creator);
            q2 q2Var = (q2) zzbcu.zzb(parcel, q2.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbvvVar = queryLocalInterface instanceof zzbvv ? (zzbvv) queryLocalInterface : new zzbvt(readStrongBinder);
            }
            zzbvv zzbvvVar2 = zzbvvVar;
            zzbcu.zzh(parcel);
            zze(q1, readString, bundle, bundle2, q2Var, zzbvvVar2);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbwh zzf = zzf();
            parcel2.writeNoException();
            zzbcu.zzd(parcel2, zzf);
        } else if (i == 3) {
            zzbwh zzg = zzg();
            parcel2.writeNoException();
            zzbcu.zzd(parcel2, zzg);
        } else if (i == 5) {
            g1 zzh = zzh();
            parcel2.writeNoException();
            zzbcu.zze(parcel2, zzh);
        } else if (i == 10) {
            a.a.q1(parcel.readStrongBinder());
            zzbcu.zzh(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    l2 l2Var = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                    N6.a q12 = a.a.q1(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbveVar2 = queryLocalInterface2 instanceof zzbvg ? (zzbvg) queryLocalInterface2 : new zzbve(readStrongBinder2);
                    }
                    zzbvg zzbvgVar = zzbveVar2;
                    zzbtz zzb = zzbty.zzb(parcel.readStrongBinder());
                    q2 q2Var2 = (q2) zzbcu.zzb(parcel, q2.CREATOR);
                    zzbcu.zzh(parcel);
                    zzi(readString2, readString3, l2Var, q12, zzbvgVar, zzb, q2Var2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    l2 l2Var2 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                    N6.a q13 = a.a.q1(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbvhVar = queryLocalInterface3 instanceof zzbvj ? (zzbvj) queryLocalInterface3 : new zzbvh(readStrongBinder3);
                    }
                    zzbvj zzbvjVar = zzbvhVar;
                    zzbtz zzb2 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzj(readString4, readString5, l2Var2, q13, zzbvjVar, zzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    N6.a q14 = a.a.q1(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    boolean zzk = zzk(q14);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzk ? 1 : 0);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    l2 l2Var3 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                    N6.a q15 = a.a.q1(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbvnVar2 = queryLocalInterface4 instanceof zzbvp ? (zzbvp) queryLocalInterface4 : new zzbvn(readStrongBinder4);
                    }
                    zzbvp zzbvpVar = zzbvnVar2;
                    zzbtz zzb3 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzl(readString6, readString7, l2Var3, q15, zzbvpVar, zzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    N6.a q16 = a.a.q1(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    boolean zzm = zzm(q16);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzm ? 1 : 0);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    l2 l2Var4 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                    N6.a q17 = a.a.q1(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbvkVar2 = queryLocalInterface5 instanceof zzbvm ? (zzbvm) queryLocalInterface5 : new zzbvk(readStrongBinder5);
                    }
                    zzbvm zzbvmVar = zzbvkVar2;
                    zzbtz zzb4 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzn(readString8, readString9, l2Var4, q17, zzbvmVar, zzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String readString10 = parcel.readString();
                    zzbcu.zzh(parcel);
                    zzo(readString10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString11 = parcel.readString();
                    String readString12 = parcel.readString();
                    l2 l2Var5 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                    N6.a q18 = a.a.q1(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbvnVar = queryLocalInterface6 instanceof zzbvp ? (zzbvp) queryLocalInterface6 : new zzbvn(readStrongBinder6);
                    }
                    zzbvp zzbvpVar2 = zzbvnVar;
                    zzbtz zzb5 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzp(readString11, readString12, l2Var5, q18, zzbvpVar2, zzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    l2 l2Var6 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                    N6.a q19 = a.a.q1(parcel.readStrongBinder());
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbveVar = queryLocalInterface7 instanceof zzbvg ? (zzbvg) queryLocalInterface7 : new zzbve(readStrongBinder7);
                    }
                    zzbvg zzbvgVar2 = zzbveVar;
                    zzbtz zzb6 = zzbty.zzb(parcel.readStrongBinder());
                    q2 q2Var3 = (q2) zzbcu.zzb(parcel, q2.CREATOR);
                    zzbcu.zzh(parcel);
                    zzq(readString13, readString14, l2Var6, q19, zzbvgVar2, zzb6, q2Var3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    l2 l2Var7 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                    N6.a q110 = a.a.q1(parcel.readStrongBinder());
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbvkVar = queryLocalInterface8 instanceof zzbvm ? (zzbvm) queryLocalInterface8 : new zzbvk(readStrongBinder8);
                    }
                    zzbvm zzbvmVar2 = zzbvkVar;
                    zzbtz zzb7 = zzbty.zzb(parcel.readStrongBinder());
                    zzbkh zzbkhVar = (zzbkh) zzbcu.zzb(parcel, zzbkh.CREATOR);
                    zzbcu.zzh(parcel);
                    zzr(readString15, readString16, l2Var7, q110, zzbvmVar2, zzb7, zzbkhVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    l2 l2Var8 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                    N6.a q111 = a.a.q1(parcel.readStrongBinder());
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbvbVar = queryLocalInterface9 instanceof zzbvd ? (zzbvd) queryLocalInterface9 : new zzbvb(readStrongBinder9);
                    }
                    zzbvd zzbvdVar = zzbvbVar;
                    zzbtz zzb8 = zzbty.zzb(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    zzs(readString17, readString18, l2Var8, q111, zzbvdVar, zzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    N6.a q112 = a.a.q1(parcel.readStrongBinder());
                    zzbcu.zzh(parcel);
                    boolean zzt = zzt(q112);
                    parcel2.writeNoException();
                    parcel2.writeInt(zzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzbcu.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
