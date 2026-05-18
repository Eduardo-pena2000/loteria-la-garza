package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w implements Parcelable.Creator {
    public static final c a(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        e eVar = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                eVar = (e) y6.b.p(parcel, D, e.CREATOR);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                z = y6.b.x(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new c(eVar, z);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
