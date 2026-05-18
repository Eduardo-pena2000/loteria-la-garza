package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class o0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        v vVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    vVar = (v) y6.b.p(parcel, D, v.CREATOR);
                    break;
                case 2:
                    z = y6.b.x(parcel, D);
                    break;
                case 3:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 4:
                    iArr = y6.b.k(parcel, D);
                    break;
                case 5:
                    i = y6.b.F(parcel, D);
                    break;
                case 6:
                    iArr2 = y6.b.k(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new g(vVar, z, z2, iArr, i, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new g[i];
    }
}
