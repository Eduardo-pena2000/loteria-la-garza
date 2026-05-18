package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbfq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    str = y6.b.q(parcel, D);
                    break;
                case 3:
                    j = y6.b.H(parcel, D);
                    break;
                case 4:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 5:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 6:
                    str4 = y6.b.q(parcel, D);
                    break;
                case 7:
                    bundle = y6.b.f(parcel, D);
                    break;
                case 8:
                    z = y6.b.x(parcel, D);
                    break;
                case 9:
                    j2 = y6.b.H(parcel, D);
                    break;
                case 10:
                    str5 = y6.b.q(parcel, D);
                    break;
                case 11:
                    i = y6.b.F(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new zzbfp(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfp[i];
    }
}
