package com.google.android.gms.internal.drive;

import H6.a;
import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzp implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        a aVar = null;
        int i = 0;
        Boolean bool = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                aVar = (a) b.p(parcel, D, a.CREATOR);
            } else if (w == 3) {
                bool = b.y(parcel, D);
            } else if (w != 4) {
                b.L(parcel, D);
            } else {
                i = b.F(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzo(aVar, bool, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
