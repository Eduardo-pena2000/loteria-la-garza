package com.google.android.gms.internal.drive;

import H6.B;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfm implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                j = b.H(parcel, D);
            } else if (w == 3) {
                j2 = b.H(parcel, D);
            } else if (w == 4) {
                i = b.F(parcel, D);
            } else if (w != 5) {
                b.L(parcel, D);
            } else {
                list = b.u(parcel, D, B.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzfl(j, j2, i, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfl[i];
    }
}
