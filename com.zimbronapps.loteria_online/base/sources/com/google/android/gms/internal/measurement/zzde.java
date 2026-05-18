package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzde implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        Bundle bundle = null;
        String str = null;
        boolean z = false;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 1) {
                j = b.H(parcel, D);
            } else if (w == 2) {
                j2 = b.H(parcel, D);
            } else if (w == 3) {
                z = b.x(parcel, D);
            } else if (w == 7) {
                bundle = b.f(parcel, D);
            } else if (w != 8) {
                b.L(parcel, D);
            } else {
                str = b.q(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzdd(j, j2, z, bundle, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
