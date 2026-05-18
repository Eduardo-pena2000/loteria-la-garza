package k7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        h7 h7Var = null;
        String str3 = null;
        I i = null;
        I i2 = null;
        I i3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
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
                    h7Var = (h7) y6.b.p(parcel, D, h7.CREATOR);
                    break;
                case 5:
                    j = y6.b.H(parcel, D);
                    break;
                case 6:
                    z = y6.b.x(parcel, D);
                    break;
                case 7:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 8:
                    i = (I) y6.b.p(parcel, D, I.CREATOR);
                    break;
                case 9:
                    j2 = y6.b.H(parcel, D);
                    break;
                case 10:
                    i2 = (I) y6.b.p(parcel, D, I.CREATOR);
                    break;
                case 11:
                    j3 = y6.b.H(parcel, D);
                    break;
                case 12:
                    i3 = (I) y6.b.p(parcel, D, I.CREATOR);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new i(str, str2, h7Var, j, z, str3, i, j2, i2, j3, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new i[i];
    }
}
