package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class z0 extends zzb implements A0 {
    public z0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static A0 q1(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof A0 ? (A0) queryLocalInterface : new y0(iBinder);
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            N6.a zzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else {
            if (i != 2) {
                return false;
            }
            int zze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(zze);
        }
        return true;
    }
}
