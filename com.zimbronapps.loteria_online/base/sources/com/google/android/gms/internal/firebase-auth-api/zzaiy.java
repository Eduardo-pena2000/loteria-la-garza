package com.google.android.gms.internal.firebase-auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaiy implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            b.w(D);
            b.L(parcel, D);
        }
        b.v(parcel, M);
        return new zzaiz();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaiz[i];
    }
}
