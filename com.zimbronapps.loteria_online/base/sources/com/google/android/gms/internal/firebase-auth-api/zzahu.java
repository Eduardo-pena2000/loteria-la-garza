package com.google.android.gms.internal.firebase-auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzahu implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                str = b.q(parcel, D);
            } else if (w == 3) {
                str2 = b.q(parcel, D);
            } else if (w == 4) {
                l = b.I(parcel, D);
            } else if (w == 5) {
                str3 = b.q(parcel, D);
            } else if (w != 6) {
                b.L(parcel, D);
            } else {
                l2 = b.I(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzahv(str, str2, l, str3, l2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzahv[i];
    }
}
