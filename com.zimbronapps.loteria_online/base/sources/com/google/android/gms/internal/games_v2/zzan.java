package com.google.android.gms.internal.games_v2;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzan implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 1) {
                str = b.q(parcel, D);
            } else if (w != 2) {
                b.L(parcel, D);
            } else {
                str2 = b.q(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzam(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzam[i];
    }
}
