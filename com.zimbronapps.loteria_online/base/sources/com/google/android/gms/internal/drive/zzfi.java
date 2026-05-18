package com.google.android.gms.internal.drive;

import H6.a;
import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfi implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        a aVar = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                aVar = (a) b.p(parcel, D, a.CREATOR);
            } else if (w != 3) {
                b.L(parcel, D);
            } else {
                z = b.x(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzfh(aVar, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfh[i];
    }
}
