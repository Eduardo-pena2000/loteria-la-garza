package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbqt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i3 = y6.b.F(parcel, D);
            } else if (w == 2) {
                str = y6.b.q(parcel, D);
            } else if (w == 3) {
                i2 = y6.b.F(parcel, D);
            } else if (w != 1000) {
                y6.b.L(parcel, D);
            } else {
                i = y6.b.F(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new zzbqs(i, i3, str, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbqs[i];
    }
}
