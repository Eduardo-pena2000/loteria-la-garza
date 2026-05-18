package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzej implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                i = b.F(parcel, D);
            } else if (w == 3) {
                i2 = b.F(parcel, D);
            } else if (w != 4) {
                b.L(parcel, D);
            } else {
                z = b.x(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzei(i, i2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzei[i];
    }
}
