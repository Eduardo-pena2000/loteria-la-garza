package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        String str = null;
        int i = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            int w = b.w(D);
            if (w == 1) {
                i = b.F(parcel, D);
            } else if (w == 2) {
                str = b.q(parcel, D);
            } else if (w != 3) {
                b.L(parcel, D);
            } else {
                pendingIntent = (PendingIntent) b.p(parcel, D, PendingIntent.CREATOR);
            }
        }
        b.v(parcel, M);
        return new zzbb(i, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbb[i];
    }
}
