package com.google.android.gms.internal.ads;

import S5.l2;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcao implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        l2 l2Var = null;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                l2Var = (l2) y6.b.p(parcel, D, l2.CREATOR);
            } else if (w != 3) {
                y6.b.L(parcel, D);
            } else {
                str = y6.b.q(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new zzcan(l2Var, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcan[i];
    }
}
