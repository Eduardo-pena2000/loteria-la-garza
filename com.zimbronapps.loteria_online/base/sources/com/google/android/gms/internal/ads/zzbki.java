package com.google.android.gms.internal.ads;

import S5.e2;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbki implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        e2 e2Var = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
                case 2:
                    z = y6.b.x(parcel, D);
                    break;
                case 3:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 4:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 5:
                    i3 = y6.b.F(parcel, D);
                    break;
                case 6:
                    e2Var = (e2) y6.b.p(parcel, D, e2.CREATOR);
                    break;
                case 7:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 8:
                    i4 = y6.b.F(parcel, D);
                    break;
                case 9:
                    i5 = y6.b.F(parcel, D);
                    break;
                case 10:
                    z4 = y6.b.x(parcel, D);
                    break;
                case 11:
                    i6 = y6.b.F(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new zzbkh(i, z, i2, z2, i3, e2Var, z3, i4, i5, z4, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbkh[i];
    }
}
