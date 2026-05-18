package com.google.android.gms.internal.drive;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzed implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        IBinder iBinder = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            if (b.w(D) != 2) {
                b.L(parcel, D);
            } else {
                iBinder = b.E(parcel, D);
            }
        }
        b.v(parcel, M);
        return new zzec(iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzec[i];
    }
}
