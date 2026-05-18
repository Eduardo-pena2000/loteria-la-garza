package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzflh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
                case 2:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 3:
                    i3 = y6.b.F(parcel, D);
                    break;
                case 4:
                    i4 = y6.b.F(parcel, D);
                    break;
                case 5:
                    str = y6.b.q(parcel, D);
                    break;
                case 6:
                    i5 = y6.b.F(parcel, D);
                    break;
                case 7:
                    i6 = y6.b.F(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new zzflg(i, i2, i3, i4, str, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzflg[i];
    }
}
