package k7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class i7 implements Parcelable.Creator {
    public static void a(h7 h7Var, Parcel parcel, int i) {
        int i2 = h7Var.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.E(parcel, 2, h7Var.b, false);
        y6.c.x(parcel, 3, h7Var.c);
        y6.c.z(parcel, 4, h7Var.d, false);
        y6.c.r(parcel, 5, (Float) null, false);
        y6.c.E(parcel, 6, h7Var.e, false);
        y6.c.E(parcel, 7, h7Var.f, false);
        y6.c.o(parcel, 8, h7Var.g, false);
        y6.c.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
                case 2:
                    str = y6.b.q(parcel, D);
                    break;
                case 3:
                    j = y6.b.H(parcel, D);
                    break;
                case 4:
                    l = y6.b.I(parcel, D);
                    break;
                case 5:
                    f = y6.b.C(parcel, D);
                    break;
                case 6:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 7:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 8:
                    d = y6.b.A(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new h7(i, str, j, l, f, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new h7[i];
    }
}
