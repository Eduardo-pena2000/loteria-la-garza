package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        Status status = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            if (b.w(D) != 1) {
                b.L(parcel, D);
            } else {
                status = (Status) b.p(parcel, D, Status.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzaa(status);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzaa[i];
    }
}
