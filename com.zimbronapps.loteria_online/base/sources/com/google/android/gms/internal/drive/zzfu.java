package com.google.android.gms.internal.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfu implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        DataHolder dataHolder = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 2) {
                dataHolder = (DataHolder) b.p(parcel, D, DataHolder.CREATOR);
            } else if (w != 3) {
                b.L(parcel, D);
            } else {
                z = b.x(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzft(dataHolder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzft[i];
    }
}
