package S5;

import N6.a;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzblc;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzcdd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class r0 extends zzbct implements s0 {
    public r0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                N6.a q1 = a.a.q1(parcel.readStrongBinder());
                q2 q2Var = (q2) zzbcu.zzb(parcel, q2.CREATOR);
                String readString = parcel.readString();
                zzbtt zzf = zzbts.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbcu.zzh(parcel);
                Y W = W(q1, q2Var, readString, zzf, readInt);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, W);
                return true;
            case 2:
                N6.a q12 = a.a.q1(parcel.readStrongBinder());
                q2 q2Var2 = (q2) zzbcu.zzb(parcel, q2.CREATOR);
                String readString2 = parcel.readString();
                zzbtt zzf2 = zzbts.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzbcu.zzh(parcel);
                Y r = r(q12, q2Var2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, r);
                return true;
            case 3:
                N6.a q13 = a.a.q1(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbtt zzf3 = zzbts.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzbcu.zzh(parcel);
                U l0 = l0(q13, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, l0);
                return true;
            case 4:
                a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 5:
                N6.a q14 = a.a.q1(parcel.readStrongBinder());
                N6.a q15 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbkw G = G(q14, q15);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, G);
                return true;
            case 6:
                N6.a q16 = a.a.q1(parcel.readStrongBinder());
                zzbtt zzf4 = zzbts.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcaj R = R(q16, zzf4, readInt4);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, R);
                return true;
            case 7:
                a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, null);
                return true;
            case 8:
                N6.a q17 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbxs zzg = zzg(q17);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, zzg);
                return true;
            case 9:
                N6.a q18 = a.a.q1(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzbcu.zzh(parcel);
                D0 m = m(q18, readInt5);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, m);
                return true;
            case 10:
                N6.a q19 = a.a.q1(parcel.readStrongBinder());
                q2 q2Var3 = (q2) zzbcu.zzb(parcel, q2.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzbcu.zzh(parcel);
                Y C0 = C0(q19, q2Var3, readString4, readInt6);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, C0);
                return true;
            case 11:
                N6.a q110 = a.a.q1(parcel.readStrongBinder());
                N6.a q111 = a.a.q1(parcel.readStrongBinder());
                N6.a q112 = a.a.q1(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzblc V = V(q110, q111, q112);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, V);
                return true;
            case 12:
                N6.a q113 = a.a.q1(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbtt zzf5 = zzbts.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcaz q = q(q113, readString5, zzf5, readInt7);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, q);
                return true;
            case 13:
                N6.a q114 = a.a.q1(parcel.readStrongBinder());
                q2 q2Var4 = (q2) zzbcu.zzb(parcel, q2.CREATOR);
                String readString6 = parcel.readString();
                zzbtt zzf6 = zzbts.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzbcu.zzh(parcel);
                Y E0 = E0(q114, q2Var4, readString6, zzf6, readInt8);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, E0);
                return true;
            case 14:
                N6.a q115 = a.a.q1(parcel.readStrongBinder());
                zzbtt zzf7 = zzbts.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzcdd f1 = f1(q115, zzf7, readInt9);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, f1);
                return true;
            case 15:
                N6.a q116 = a.a.q1(parcel.readStrongBinder());
                zzbtt zzf8 = zzbts.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzbcu.zzh(parcel);
                zzbxl a1 = a1(q116, zzf8, readInt10);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, a1);
                return true;
            case 16:
                N6.a q117 = a.a.q1(parcel.readStrongBinder());
                zzbtt zzf9 = zzbts.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbph zzc = zzbpg.zzc(parcel.readStrongBinder());
                zzbcu.zzh(parcel);
                zzbpk y = y(q117, zzf9, readInt11, zzc);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, y);
                return true;
            case 17:
                N6.a q118 = a.a.q1(parcel.readStrongBinder());
                zzbtt zzf10 = zzbts.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzbcu.zzh(parcel);
                Y0 G0 = G0(q118, zzf10, readInt12);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, G0);
                return true;
            case 18:
                N6.a q119 = a.a.q1(parcel.readStrongBinder());
                zzbtt zzf11 = zzbts.zzf(parcel.readStrongBinder());
                int readInt13 = parcel.readInt();
                zzbcu.zzh(parcel);
                l0 B = B(q119, zzf11, readInt13);
                parcel2.writeNoException();
                zzbcu.zze(parcel2, B);
                return true;
            default:
                return false;
        }
    }
}
