package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 1) {
                str = b.q(parcel, D);
            } else if (w != 2) {
                b.L(parcel, D);
            } else {
                i = b.F(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzc(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
