package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            y6.b.w(D);
            y6.b.L(parcel, D);
        }
        y6.b.v(parcel, M);
        return new b.a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b.a[i];
    }
}
