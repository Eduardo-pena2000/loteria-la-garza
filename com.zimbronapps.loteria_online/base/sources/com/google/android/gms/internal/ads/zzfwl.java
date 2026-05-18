package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                str = y6.b.q(parcel, D);
            } else if (w != 3) {
                y6.b.L(parcel, D);
            } else {
                str2 = y6.b.q(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new zzfwk(i, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfwk[i];
    }
}
