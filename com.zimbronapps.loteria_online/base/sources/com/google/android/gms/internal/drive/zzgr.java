package com.google.android.gms.internal.drive;

import L6.c;
import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgr implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        c cVar = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            if (b.w(D) != 2) {
                b.L(parcel, D);
            } else {
                cVar = (c) b.p(parcel, D, c.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzgq(cVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgq[i];
    }
}
