package com.google.android.gms.internal.ads;

import N6.a;
import S5.g1;
import S5.l2;
import S5.q2;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzbtv extends zzbct implements zzbtw {
    public zzbtv() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbtz zzbtzVar = null;
        switch (i) {
            case 1:
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                q2 q2Var = (q2) zzbcu.zzb(parcel, q2.CREATOR);
                l2 l2Var = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface instanceof zzbtz ? (zzbtz) queryLocalInterface : new zzbtx(readStrongBinder);
                }
                zzbtz zzbtzVar2 = zzbtzVar;
                zzbcu.zzh(parcel);
                zze(q1, q2Var, l2Var, readString, zzbtzVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                N6.a zzf = zzf();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzf);
                return true;
            case 3:
                N6.a q12 = a.a.q1(parcel.readStrongBinder());
                l2 l2Var2 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface2 instanceof zzbtz ? (zzbtz) queryLocalInterface2 : new zzbtx(readStrongBinder2);
                }
                zzbcu.zzh(parcel);
                zzg(q12, l2Var2, readString2, zzbtzVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                N6.a q13 = a.a.q1(parcel.readStrongBinder());
                q2 q2Var2 = (q2) zzbcu.zzb(parcel, q2.CREATOR);
                l2 l2Var3 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface3 instanceof zzbtz ? (zzbtz) queryLocalInterface3 : new zzbtx(readStrongBinder3);
                }
                zzbtz zzbtzVar3 = zzbtzVar;
                zzbcu.zzh(parcel);
                zzj(q13, q2Var2, l2Var3, readString3, readString4, zzbtzVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                N6.a q14 = a.a.q1(parcel.readStrongBinder());
                l2 l2Var4 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface4 instanceof zzbtz ? (zzbtz) queryLocalInterface4 : new zzbtx(readStrongBinder4);
                }
                zzbtz zzbtzVar4 = zzbtzVar;
                zzbcu.zzh(parcel);
                zzk(q14, l2Var4, readString5, readString6, zzbtzVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                N6.a q15 = a.a.q1(parcel.readStrongBinder());
                l2 l2Var5 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString7 = parcel.readString();
                zzcar zzb = zzcaq.zzb(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                zzbcu.zzh(parcel);
                zzn(q15, l2Var5, readString7, zzb, readString8);
                parcel2.writeNoException();
                return true;
            case 11:
                l2 l2Var6 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString9 = parcel.readString();
                zzbcu.zzh(parcel);
                zzo(l2Var6, readString9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zzq = zzq();
                parcel2.writeNoException();
                int i3 = zzbcu.zza;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 14:
                N6.a q16 = a.a.q1(parcel.readStrongBinder());
                l2 l2Var7 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface5 instanceof zzbtz ? (zzbtz) queryLocalInterface5 : new zzbtx(readStrongBinder5);
                }
                zzbtz zzbtzVar5 = zzbtzVar;
                zzbkh zzbkhVar = (zzbkh) zzbcu.zzb(parcel, zzbkh.CREATOR);
                ArrayList createStringArrayList = parcel.createStringArrayList();
                zzbcu.zzh(parcel);
                zzr(q16, l2Var7, readString10, readString11, zzbtzVar5, zzbkhVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 17:
                Bundle zzs = zzs();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzs);
                return true;
            case 18:
                Bundle zzt = zzt();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzt);
                return true;
            case 19:
                Bundle zzu = zzu();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzu);
                return true;
            case 20:
                l2 l2Var8 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzbcu.zzh(parcel);
                zzv(l2Var8, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 21:
                N6.a q17 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzw(q17);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzbcu.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                N6.a q18 = a.a.q1(parcel.readStrongBinder());
                zzcar zzb2 = zzcaq.zzb(parcel.readStrongBinder());
                ArrayList createStringArrayList2 = parcel.createStringArrayList();
                zzbcu.zzh(parcel);
                zzy(q18, zzb2, createStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzblm zzz = zzz();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzz);
                return true;
            case 25:
                boolean zza = zzbcu.zza(parcel);
                zzbcu.zzh(parcel);
                zzA(zza);
                parcel2.writeNoException();
                return true;
            case 26:
                g1 zzB = zzB();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzB);
                return true;
            case 27:
                zzbui zzC = zzC();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzC);
                return true;
            case 28:
                N6.a q19 = a.a.q1(parcel.readStrongBinder());
                l2 l2Var9 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString14 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface6 instanceof zzbtz ? (zzbtz) queryLocalInterface6 : new zzbtx(readStrongBinder6);
                }
                zzbcu.zzh(parcel);
                zzD(q19, l2Var9, readString14, zzbtzVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                N6.a q110 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzE(q110);
                parcel2.writeNoException();
                return true;
            case 31:
                N6.a q111 = a.a.q1(parcel.readStrongBinder());
                zzbqk zzb3 = zzbqj.zzb(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbqq.CREATOR);
                zzbcu.zzh(parcel);
                zzF(q111, zzb3, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                N6.a q112 = a.a.q1(parcel.readStrongBinder());
                l2 l2Var10 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString15 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface7 instanceof zzbtz ? (zzbtz) queryLocalInterface7 : new zzbtx(readStrongBinder7);
                }
                zzbcu.zzh(parcel);
                zzG(q112, l2Var10, readString15, zzbtzVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbwh zzH = zzH();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzH);
                return true;
            case 34:
                zzbwh zzI = zzI();
                parcel2.writeNoException();
                zzbcu.zzd(parcel2, zzI);
                return true;
            case 35:
                N6.a q113 = a.a.q1(parcel.readStrongBinder());
                q2 q2Var3 = (q2) zzbcu.zzb(parcel, q2.CREATOR);
                l2 l2Var11 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface8 instanceof zzbtz ? (zzbtz) queryLocalInterface8 : new zzbtx(readStrongBinder8);
                }
                zzbtz zzbtzVar6 = zzbtzVar;
                zzbcu.zzh(parcel);
                zzJ(q113, q2Var3, l2Var11, readString16, readString17, zzbtzVar6);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbuc zzK = zzK();
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzK);
                return true;
            case 37:
                N6.a q114 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzL(q114);
                parcel2.writeNoException();
                return true;
            case 38:
                N6.a q115 = a.a.q1(parcel.readStrongBinder());
                l2 l2Var12 = (l2) zzbcu.zzb(parcel, l2.CREATOR);
                String readString18 = parcel.readString();
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbtzVar = queryLocalInterface9 instanceof zzbtz ? (zzbtz) queryLocalInterface9 : new zzbtx(readStrongBinder9);
                }
                zzbcu.zzh(parcel);
                zzM(q115, l2Var12, readString18, zzbtzVar);
                parcel2.writeNoException();
                return true;
            case 39:
                N6.a q116 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzN(q116);
                parcel2.writeNoException();
                return true;
        }
    }
}
