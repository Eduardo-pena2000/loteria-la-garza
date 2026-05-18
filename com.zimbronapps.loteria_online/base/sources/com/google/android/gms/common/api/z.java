package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        v6.b bVar = null;
        int i = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                str = y6.b.q(parcel, D);
            } else if (w == 3) {
                pendingIntent = (PendingIntent) y6.b.p(parcel, D, PendingIntent.CREATOR);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                bVar = (v6.b) y6.b.p(parcel, D, v6.b.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new Status(i, str, pendingIntent, bVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
