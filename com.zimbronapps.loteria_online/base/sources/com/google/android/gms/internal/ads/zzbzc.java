package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        List list = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                z = y6.b.x(parcel, D);
            } else if (w != 3) {
                y6.b.L(parcel, D);
            } else {
                list = y6.b.s(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new zzbzb(z, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbzb[i];
    }
}
