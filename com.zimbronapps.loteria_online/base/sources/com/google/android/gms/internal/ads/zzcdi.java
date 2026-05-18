package com.google.android.gms.internal.ads;

import S5.l2;
import S5.q2;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcdi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        q2 q2Var = null;
        l2 l2Var = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    str = y6.b.q(parcel, D);
                    break;
                case 2:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 3:
                    q2Var = (q2) y6.b.p(parcel, D, q2.CREATOR);
                    break;
                case 4:
                    l2Var = (l2) y6.b.p(parcel, D, l2.CREATOR);
                    break;
                case 5:
                    i = y6.b.F(parcel, D);
                    break;
                case 6:
                    str3 = y6.b.q(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new zzcdh(str, str2, q2Var, l2Var, i, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdh[i];
    }
}
