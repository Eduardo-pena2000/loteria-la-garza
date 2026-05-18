package W6;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.games_v2.zza;
import com.google.android.gms.internal.games_v2.zzc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class p extends zza implements IInterface {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    public final void A1(o oVar, long j) {
        Parcel zza = zza();
        zzc.zzd(zza, oVar);
        zza.writeLong(j);
        zzc(15501, zza);
    }

    public final void B1(m mVar, String str, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zzc(27003, zza);
    }

    public final void C1(m mVar, String str, String str2, c7.h hVar, H6.a aVar) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zzc(zza, hVar);
        zzc.zzc(zza, aVar);
        zzc(12033, zza);
    }

    public final void D1(m mVar, String str, IBinder iBinder, Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeStrongBinder(iBinder);
        zzc.zzc(zza, bundle);
        zzc(5023, zza);
    }

    public final void E1(m mVar, String str, int i, IBinder iBinder, Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        zzc.zzc(zza, bundle);
        zzc(7003, zza);
    }

    public final void F1(IBinder iBinder, Bundle bundle) {
        Parcel zza = zza();
        zza.writeStrongBinder(iBinder);
        zzc.zzc(zza, bundle);
        zzc(5005, zza);
    }

    public final void G1(m mVar) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zzc(5002, zza);
    }

    public final void H1(m mVar, String str, long j, String str2) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeLong(j);
        zza.writeString(str2);
        zzc(7002, zza);
    }

    public final void I1(m mVar, String str, IBinder iBinder, Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeStrongBinder(iBinder);
        zzc.zzc(zza, bundle);
        zzc(5024, zza);
    }

    public final int J1() {
        Parcel zzb = zzb(12036, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    public final PendingIntent K1() {
        Parcel zzb = zzb(25015, zza());
        PendingIntent zza = zzc.zza(zzb, PendingIntent.CREATOR);
        zzb.recycle();
        return zza;
    }

    public final Intent L1() {
        Parcel zzb = zzb(9005, zza());
        Intent zza = zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return zza;
    }

    public final Intent M1() {
        Parcel zzb = zzb(9003, zza());
        Intent zza = zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return zza;
    }

    public final Intent N1(PlayerEntity playerEntity) {
        Parcel zza = zza();
        zzc.zzc(zza, playerEntity);
        Parcel zzb = zzb(15503, zza);
        Intent zza2 = zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return zza2;
    }

    public final Intent O1(String str, String str2, String str3) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(25016, zza);
        Intent zza2 = zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return zza2;
    }

    public final Intent P1(String str, int i, int i2) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        Parcel zzb = zzb(18001, zza);
        Intent zza2 = zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return zza2;
    }

    public final Intent Q1() {
        Parcel zzb = zzb(9010, zza());
        Intent zza = zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return zza;
    }

    public final Intent R1(String str, boolean z, boolean z2, int i) {
        Parcel zza = zza();
        zza.writeString(str);
        int i2 = zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(z2 ? 1 : 0);
        zza.writeInt(i);
        Parcel zzb = zzb(12001, zza);
        Intent zza2 = zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return zza2;
    }

    public final DataHolder S1() {
        Parcel zzb = zzb(5013, zza());
        DataHolder dataHolder = (DataHolder) zzc.zza(zzb, DataHolder.CREATOR);
        zzb.recycle();
        return dataHolder;
    }

    public final void T1(long j) {
        Parcel zza = zza();
        zza.writeLong(j);
        zzc(5001, zza);
    }

    public final void U1(m mVar, String str, c7.h hVar, H6.a aVar) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zzc.zzc(zza, hVar);
        zzc.zzc(zza, aVar);
        zzc(12007, zza);
    }

    public final void V1(m mVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zzc(12020, zza);
    }

    public final void W1(H6.a aVar) {
        Parcel zza = zza();
        zzc.zzc(zza, aVar);
        zzc(12019, zza);
    }

    public final void X1(m mVar, String str, String str2, int i, int i2) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString((String) null);
        zza.writeString(str2);
        zza.writeInt(i);
        zza.writeInt(i2);
        zzc(8001, zza);
    }

    public final void Y1(m mVar, String str, int i, IBinder iBinder, Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        zzc.zzc(zza, bundle);
        zzc(5025, zza);
    }

    public final void Z1(String str, int i) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zzc(12017, zza);
    }

    public final void a2(m mVar, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeInt(z ? 1 : 0);
        zzc(6001, zza);
    }

    public final void b2(m mVar, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeInt(z ? 1 : 0);
        zzc(12016, zza);
    }

    public final void c2(m mVar, boolean z, String[] strArr) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeInt(z ? 1 : 0);
        zza.writeStringArray(strArr);
        zzc(12031, zza);
    }

    public final void q1(m mVar, String str, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zzc(6504, zza);
    }

    public final void r1(m mVar, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeInt(z ? 1 : 0);
        zzc(6503, zza);
    }

    public final void s1(m mVar, Bundle bundle, int i, int i2) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zzc.zzc(zza, bundle);
        zza.writeInt(i);
        zza.writeInt(i2);
        zzc(5021, zza);
    }

    public final void t1(m mVar, String str, int i, int i2, int i3, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        zza.writeInt(z ? 1 : 0);
        zzc(5020, zza);
    }

    public final void u1(m mVar, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeInt(z ? 1 : 0);
        zzc(17001, zza);
    }

    public final void v1(m mVar, String str, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zzc(13006, zza);
    }

    public final void w1(m mVar, String str, int i, boolean z, boolean z2) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(z2 ? 1 : 0);
        zzc(9020, zza);
    }

    public final void x1(m mVar, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeInt(z ? 1 : 0);
        zzc(12002, zza);
    }

    public final void y1(m mVar, String str, int i, int i2, int i3, boolean z) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        zza.writeInt(z ? 1 : 0);
        zzc(5019, zza);
    }

    public final void z1(m mVar, String str, boolean z, int i) {
        Parcel zza = zza();
        zzc.zzd(zza, mVar);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(i);
        zzc(15001, zza);
    }

    public final int zze() {
        Parcel zzb = zzb(12035, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    public final String zzo() {
        Parcel zzb = zzb(5012, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final void zzp() {
        zzc(5006, zza());
    }
}
