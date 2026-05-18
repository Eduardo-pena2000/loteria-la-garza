package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzccc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        List list = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    str = y6.b.q(parcel, D);
                    break;
                case 3:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 4:
                    z = y6.b.x(parcel, D);
                    break;
                case 5:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 6:
                    list = y6.b.s(parcel, D);
                    break;
                case 7:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 8:
                    z4 = y6.b.x(parcel, D);
                    break;
                case 9:
                    arrayList = y6.b.s(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new zzccb(str, str2, z, z2, list, z3, z4, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzccb[i];
    }
}
