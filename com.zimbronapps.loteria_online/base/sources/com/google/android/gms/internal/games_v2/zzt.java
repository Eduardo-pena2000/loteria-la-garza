package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            if (b.w(D) != 1) {
                b.L(parcel, D);
            } else {
                str = b.q(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzs(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
