package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        String str = null;
        int i = 0;
        short s = 0;
        int i2 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        float f = 0.0f;
        long j = 0;
        int i3 = -1;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            switch (b.w(D)) {
                case 1:
                    str = b.q(parcel, D);
                    break;
                case 2:
                    j = b.H(parcel, D);
                    break;
                case 3:
                    s = b.J(parcel, D);
                    break;
                case 4:
                    d = b.z(parcel, D);
                    break;
                case 5:
                    d2 = b.z(parcel, D);
                    break;
                case 6:
                    f = b.B(parcel, D);
                    break;
                case 7:
                    i = b.F(parcel, D);
                    break;
                case 8:
                    i2 = b.F(parcel, D);
                    break;
                case 9:
                    i3 = b.F(parcel, D);
                    break;
                default:
                    b.L(parcel, D);
                    break;
            }
        }
        b.v(parcel, M);
        return new zzbe(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzbe[i];
    }
}
