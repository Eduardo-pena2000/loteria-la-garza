package k7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class o7 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        List list = null;
        String str11 = null;
        String str12 = null;
        int i4 = 100;
        boolean z4 = true;
        boolean z5 = true;
        long j8 = -2147483648L;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    str5 = y6.b.q(parcel, D);
                    break;
                case 3:
                    str6 = y6.b.q(parcel, D);
                    break;
                case 4:
                    str7 = y6.b.q(parcel, D);
                    break;
                case 5:
                    str8 = y6.b.q(parcel, D);
                    break;
                case 6:
                    j = y6.b.H(parcel, D);
                    break;
                case 7:
                    j2 = y6.b.H(parcel, D);
                    break;
                case 8:
                    str9 = y6.b.q(parcel, D);
                    break;
                case 9:
                    z4 = y6.b.x(parcel, D);
                    break;
                case 10:
                    z = y6.b.x(parcel, D);
                    break;
                case 11:
                    j8 = y6.b.H(parcel, D);
                    break;
                case 12:
                    str10 = y6.b.q(parcel, D);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    y6.b.L(parcel, D);
                    break;
                case 14:
                    j3 = y6.b.H(parcel, D);
                    break;
                case 15:
                    i = y6.b.F(parcel, D);
                    break;
                case 16:
                    z5 = y6.b.x(parcel, D);
                    break;
                case 18:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 21:
                    bool = y6.b.y(parcel, D);
                    break;
                case 22:
                    j4 = y6.b.H(parcel, D);
                    break;
                case 23:
                    list = y6.b.s(parcel, D);
                    break;
                case 25:
                    str = y6.b.q(parcel, D);
                    break;
                case 26:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 27:
                    str11 = y6.b.q(parcel, D);
                    break;
                case 28:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 29:
                    j5 = y6.b.H(parcel, D);
                    break;
                case 30:
                    i4 = y6.b.F(parcel, D);
                    break;
                case 31:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 32:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 34:
                    j6 = y6.b.H(parcel, D);
                    break;
                case 35:
                    str12 = y6.b.q(parcel, D);
                    break;
                case 36:
                    str4 = y6.b.q(parcel, D);
                    break;
                case 37:
                    j7 = y6.b.H(parcel, D);
                    break;
                case 38:
                    i3 = y6.b.F(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new n7(str5, str6, str7, str8, j, j2, str9, z4, z, j8, str10, j3, i, z5, z2, bool, j4, list, str, str2, str11, z3, j5, i4, str3, i2, j6, str12, str4, j7, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new n7[i];
    }
}
