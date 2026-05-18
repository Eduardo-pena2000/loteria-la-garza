package k7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class i2 extends zzbm implements j2 {
    public i2() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        p2 p2Var = null;
        m2 m2Var = null;
        switch (i) {
            case 1:
                I i3 = (I) zzbn.zzb(parcel, I.CREATOR);
                n7 n7Var = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                q0(i3, n7Var);
                parcel2.writeNoException();
                return true;
            case 2:
                h7 h7Var = (h7) zzbn.zzb(parcel, h7.CREATOR);
                n7 n7Var2 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                D0(h7Var, n7Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                n7 n7Var3 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                w0(n7Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                I i4 = (I) zzbn.zzb(parcel, I.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbn.zzf(parcel);
                N(i4, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                n7 n7Var4 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                T0(n7Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                n7 n7Var5 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                boolean zza = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                List s = s(n7Var5, zza);
                parcel2.writeNoException();
                parcel2.writeTypedList(s);
                return true;
            case 9:
                I i5 = (I) zzbn.zzb(parcel, I.CREATOR);
                String readString3 = parcel.readString();
                zzbn.zzf(parcel);
                byte[] e0 = e0(i5, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(e0);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                zzbn.zzf(parcel);
                p0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                n7 n7Var6 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                String e = e(n7Var6);
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 12:
                i iVar = (i) zzbn.zzb(parcel, i.CREATOR);
                n7 n7Var7 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                t0(iVar, n7Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                i iVar2 = (i) zzbn.zzb(parcel, i.CREATOR);
                zzbn.zzf(parcel);
                F(iVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean zza2 = zzbn.zza(parcel);
                n7 n7Var8 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                List c0 = c0(readString7, readString8, zza2, n7Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(c0);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean zza3 = zzbn.zza(parcel);
                zzbn.zzf(parcel);
                List f = f(readString9, readString10, readString11, zza3);
                parcel2.writeNoException();
                parcel2.writeTypedList(f);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                n7 n7Var9 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                List g = g(readString12, readString13, n7Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(g);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                zzbn.zzf(parcel);
                List w = w(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(w);
                return true;
            case 18:
                n7 n7Var10 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                Y(n7Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                n7 n7Var11 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                d0(bundle, n7Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                n7 n7Var12 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                i0(n7Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                n7 n7Var13 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                p n0 = n0(n7Var13);
                parcel2.writeNoException();
                if (n0 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    n0.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                n7 n7Var14 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                Bundle bundle2 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                zzbn.zzf(parcel);
                List T = T(n7Var14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(T);
                return true;
            case 25:
                n7 n7Var15 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                H0(n7Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                n7 n7Var16 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                O0(n7Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                n7 n7Var17 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                zzbn.zzf(parcel);
                U(n7Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                n7 n7Var18 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                I6 i6 = (I6) zzbn.zzb(parcel, I6.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    p2Var = queryLocalInterface instanceof p2 ? (p2) queryLocalInterface : new n2(readStrongBinder);
                }
                zzbn.zzf(parcel);
                z0(n7Var18, i6, p2Var);
                parcel2.writeNoException();
                return true;
            case 30:
                n7 n7Var19 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                g gVar = (g) zzbn.zzb(parcel, g.CREATOR);
                zzbn.zzf(parcel);
                b1(n7Var19, gVar);
                parcel2.writeNoException();
                return true;
            case 31:
                n7 n7Var20 = (n7) zzbn.zzb(parcel, n7.CREATOR);
                Bundle bundle3 = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    m2Var = queryLocalInterface2 instanceof m2 ? (m2) queryLocalInterface2 : new k2(readStrongBinder2);
                }
                zzbn.zzf(parcel);
                I(n7Var20, bundle3, m2Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
