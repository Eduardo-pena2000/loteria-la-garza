package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbpw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    z = y6.b.x(parcel, D);
                    break;
                case 2:
                    str = y6.b.q(parcel, D);
                    break;
                case 3:
                    i = y6.b.F(parcel, D);
                    break;
                case 4:
                    bArr = y6.b.g(parcel, D);
                    break;
                case 5:
                    strArr = y6.b.r(parcel, D);
                    break;
                case 6:
                    strArr2 = y6.b.r(parcel, D);
                    break;
                case 7:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 8:
                    j = y6.b.H(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new zzbpv(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbpv[i];
    }
}
