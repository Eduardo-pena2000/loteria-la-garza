package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbqr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                str = y6.b.q(parcel, D);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                bundle = y6.b.f(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new zzbqq(str, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbqq[i];
    }
}
