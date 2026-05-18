package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgv implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        zzei zzeiVar = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            if (b.w(D) != 2) {
                b.L(parcel, D);
            } else {
                zzeiVar = (zzei) b.p(parcel, D, zzei.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzgu(zzeiVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzgu[i];
    }
}
