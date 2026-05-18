package d7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d implements Parcelable.Creator {
    public static void a(c cVar, Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.p(parcel, 1, cVar.K1());
        y6.c.p(parcel, 2, cVar.h());
        y6.c.t(parcel, 3, cVar.q0());
        y6.c.t(parcel, 4, cVar.Y());
        y6.c.t(parcel, 5, cVar.I0());
        y6.c.p(parcel, 6, cVar.W());
        y6.c.p(parcel, 7, cVar.r());
        y6.c.j(parcel, 8, cVar.zza(), false);
        y6.c.p(parcel, 9, cVar.X());
        y6.c.p(parcel, 10, cVar.D1());
        y6.c.p(parcel, 11, cVar.P0());
        y6.c.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    f = y6.b.B(parcel, D);
                    break;
                case 2:
                    f2 = y6.b.B(parcel, D);
                    break;
                case 3:
                    i = y6.b.F(parcel, D);
                    break;
                case 4:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 5:
                    i3 = y6.b.F(parcel, D);
                    break;
                case 6:
                    f3 = y6.b.B(parcel, D);
                    break;
                case 7:
                    f4 = y6.b.B(parcel, D);
                    break;
                case 8:
                    bundle = y6.b.f(parcel, D);
                    break;
                case 9:
                    f5 = y6.b.B(parcel, D);
                    break;
                case 10:
                    f6 = y6.b.B(parcel, D);
                    break;
                case 11:
                    f7 = y6.b.B(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new c(f, f2, i, i2, i3, f3, f4, bundle, f5, f6, f7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
