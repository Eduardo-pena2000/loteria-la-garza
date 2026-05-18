package com.google.android.gms.common.internal;

import N6.a;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class y0 extends zza implements A0 {
    public y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final N6.a zzd() {
        Parcel zzB = zzB(1, zza());
        N6.a q1 = a.a.q1(zzB.readStrongBinder());
        zzB.recycle();
        return q1;
    }

    public final int zze() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
