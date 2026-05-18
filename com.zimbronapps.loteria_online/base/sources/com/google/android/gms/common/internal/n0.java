package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Bundle bundle = null;
        g gVar = null;
        int i = 0;
        v6.d[] dVarArr = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                bundle = y6.b.f(parcel, D);
            } else if (w == 2) {
                dVarArr = (v6.d[]) y6.b.t(parcel, D, v6.d.CREATOR);
            } else if (w == 3) {
                i = y6.b.F(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                gVar = (g) y6.b.p(parcel, D, g.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new m0(bundle, dVarArr, i, gVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new m0[i];
    }
}
