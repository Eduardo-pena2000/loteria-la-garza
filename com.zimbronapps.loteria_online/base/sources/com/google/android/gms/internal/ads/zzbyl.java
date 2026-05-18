package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbyl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                iBinder = y6.b.E(parcel, D);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                iBinder2 = y6.b.E(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new zzbyk(iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbyk[i];
    }
}
