package com.google.android.gms.internal.firebase-auth-api;

import android.os.Parcel;
import android.os.Parcelable;
import y6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaja implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = b.M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < M) {
            int D = b.D(parcel);
            switch (b.w(D)) {
                case 2:
                    str = b.q(parcel, D);
                    break;
                case 3:
                    str2 = b.q(parcel, D);
                    break;
                case 4:
                    str3 = b.q(parcel, D);
                    break;
                case 5:
                    str4 = b.q(parcel, D);
                    break;
                case 6:
                    str5 = b.q(parcel, D);
                    break;
                case 7:
                    str6 = b.q(parcel, D);
                    break;
                case 8:
                    str7 = b.q(parcel, D);
                    break;
                case 9:
                    str8 = b.q(parcel, D);
                    break;
                case 10:
                    z = b.x(parcel, D);
                    break;
                case 11:
                    z2 = b.x(parcel, D);
                    break;
                case 12:
                    str9 = b.q(parcel, D);
                    break;
                case 13:
                    str10 = b.q(parcel, D);
                    break;
                case 14:
                    str11 = b.q(parcel, D);
                    break;
                case 15:
                    str12 = b.q(parcel, D);
                    break;
                case 16:
                    z3 = b.x(parcel, D);
                    break;
                case 17:
                    str13 = b.q(parcel, D);
                    break;
                default:
                    b.L(parcel, D);
                    break;
            }
        }
        b.v(parcel, M);
        return new zzajb(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzajb[i];
    }
}
