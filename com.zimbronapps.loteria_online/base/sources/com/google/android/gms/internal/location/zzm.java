package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        zzj zzjVar = null;
        int i = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 1) {
                i = b.F(parcel, D);
            } else if (w == 2) {
                zzjVar = (zzj) b.p(parcel, D, zzj.CREATOR);
            } else if (w == 3) {
                iBinder = b.E(parcel, D);
            } else if (w != 4) {
                b.L(parcel, D);
            } else {
                iBinder2 = b.E(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzl(i, zzjVar, iBinder, iBinder2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
