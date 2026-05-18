package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        zzx zzxVar = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 1) {
                i = b.F(parcel, D);
            } else if (w != 2) {
                b.L(parcel, D);
            } else {
                zzxVar = (zzx) b.p(parcel, D, zzx.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzq(i, zzxVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
