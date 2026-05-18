package S5;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        Bundle bundle = null;
        List list = null;
        String str = null;
        a2 a2Var = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        b0 b0Var = null;
        String str5 = null;
        List list3 = null;
        String str6 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
                case 2:
                    j = y6.b.H(parcel, D);
                    break;
                case 3:
                    bundle = y6.b.f(parcel, D);
                    break;
                case 4:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 5:
                    list = y6.b.s(parcel, D);
                    break;
                case 6:
                    z = y6.b.x(parcel, D);
                    break;
                case 7:
                    i3 = y6.b.F(parcel, D);
                    break;
                case 8:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 9:
                    str = y6.b.q(parcel, D);
                    break;
                case 10:
                    a2Var = (a2) y6.b.p(parcel, D, a2.CREATOR);
                    break;
                case 11:
                    location = (Location) y6.b.p(parcel, D, Location.CREATOR);
                    break;
                case 12:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 13:
                    bundle2 = y6.b.f(parcel, D);
                    break;
                case 14:
                    bundle3 = y6.b.f(parcel, D);
                    break;
                case 15:
                    list2 = y6.b.s(parcel, D);
                    break;
                case 16:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 17:
                    str4 = y6.b.q(parcel, D);
                    break;
                case 18:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 19:
                    b0Var = (b0) y6.b.p(parcel, D, b0.CREATOR);
                    break;
                case 20:
                    i4 = y6.b.F(parcel, D);
                    break;
                case 21:
                    str5 = y6.b.q(parcel, D);
                    break;
                case 22:
                    list3 = y6.b.s(parcel, D);
                    break;
                case 23:
                    i5 = y6.b.F(parcel, D);
                    break;
                case 24:
                    str6 = y6.b.q(parcel, D);
                    break;
                case 25:
                    i6 = y6.b.F(parcel, D);
                    break;
                case 26:
                    j2 = y6.b.H(parcel, D);
                    break;
                case 27:
                    j3 = y6.b.H(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new l2(i, j, bundle, i2, list, z, i3, z2, str, a2Var, location, str2, bundle2, bundle3, list2, str3, str4, z3, b0Var, i4, str5, list3, i5, str6, i6, j2, j3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new l2[i];
    }
}
