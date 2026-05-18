package com.google.android.gms.internal.drive;

import H6.K;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzen implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                arrayList = b.u(parcel, D, K.CREATOR);
            } else if (w != 3) {
                b.L(parcel, D);
            } else {
                i = b.F(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzem(arrayList, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzem[i];
    }
}
