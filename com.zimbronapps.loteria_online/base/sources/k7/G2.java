package k7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzbn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g2 extends zzbl implements j2 {
    public g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void D0(h7 h7Var, n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, h7Var);
        zzbn.zzc(zza, n7Var);
        zzc(2, zza);
    }

    public final void H0(n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzc(25, zza);
    }

    public final void I(n7 n7Var, Bundle bundle, m2 m2Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzbn.zzc(zza, bundle);
        zzbn.zzd(zza, m2Var);
        zzc(31, zza);
    }

    public final void O0(n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzc(26, zza);
    }

    public final void T0(n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzc(6, zza);
    }

    public final void U(n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzc(27, zza);
    }

    public final void Y(n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzc(18, zza);
    }

    public final void b1(n7 n7Var, g gVar) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzbn.zzc(zza, gVar);
        zzc(30, zza);
    }

    public final List c0(String str, String str2, boolean z, n7 n7Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i = zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        zzbn.zzc(zza, n7Var);
        Parcel zzP = zzP(14, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(h7.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    public final void d0(Bundle bundle, n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, bundle);
        zzbn.zzc(zza, n7Var);
        zzc(19, zza);
    }

    public final String e(n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        Parcel zzP = zzP(11, zza);
        String readString = zzP.readString();
        zzP.recycle();
        return readString;
    }

    public final byte[] e0(I i, String str) {
        Parcel zza = zza();
        zzbn.zzc(zza, i);
        zza.writeString(str);
        Parcel zzP = zzP(9, zza);
        byte[] createByteArray = zzP.createByteArray();
        zzP.recycle();
        return createByteArray;
    }

    public final List f(String str, String str2, String str3, boolean z) {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        int i = zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        Parcel zzP = zzP(15, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(h7.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    public final List g(String str, String str2, n7 n7Var) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbn.zzc(zza, n7Var);
        Parcel zzP = zzP(16, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(i.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    public final void i0(n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzc(20, zza);
    }

    public final p n0(n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        Parcel zzP = zzP(21, zza);
        p zzb = zzbn.zzb(zzP, p.CREATOR);
        zzP.recycle();
        return zzb;
    }

    public final void p0(long j, String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeLong(j);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    public final void q0(I i, n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, i);
        zzbn.zzc(zza, n7Var);
        zzc(1, zza);
    }

    public final void t0(i iVar, n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, iVar);
        zzbn.zzc(zza, n7Var);
        zzc(12, zza);
    }

    public final List w(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzP = zzP(17, zza);
        ArrayList createTypedArrayList = zzP.createTypedArrayList(i.CREATOR);
        zzP.recycle();
        return createTypedArrayList;
    }

    public final void w0(n7 n7Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzc(4, zza);
    }

    public final void z0(n7 n7Var, I6 i6, p2 p2Var) {
        Parcel zza = zza();
        zzbn.zzc(zza, n7Var);
        zzbn.zzc(zza, i6);
        zzbn.zzd(zza, p2Var);
        zzc(29, zza);
    }
}
