package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        r rVar = null;
        G0 g0 = null;
        F f = null;
        M0 m0 = null;
        L l = null;
        N n = null;
        I0 i0 = null;
        Q q = null;
        s sVar = null;
        V v = null;
        g0 g0Var = null;
        T t = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    rVar = (r) y6.b.p(parcel, D, r.CREATOR);
                    break;
                case 3:
                    g0 = (G0) y6.b.p(parcel, D, G0.CREATOR);
                    break;
                case 4:
                    f = (F) y6.b.p(parcel, D, F.CREATOR);
                    break;
                case 5:
                    m0 = (M0) y6.b.p(parcel, D, M0.CREATOR);
                    break;
                case 6:
                    l = (L) y6.b.p(parcel, D, L.CREATOR);
                    break;
                case 7:
                    n = (N) y6.b.p(parcel, D, N.CREATOR);
                    break;
                case 8:
                    i0 = (I0) y6.b.p(parcel, D, I0.CREATOR);
                    break;
                case 9:
                    q = (Q) y6.b.p(parcel, D, Q.CREATOR);
                    break;
                case 10:
                    sVar = (s) y6.b.p(parcel, D, s.CREATOR);
                    break;
                case 11:
                    v = (V) y6.b.p(parcel, D, V.CREATOR);
                    break;
                case 12:
                    g0Var = (g0) y6.b.p(parcel, D, g0.CREATOR);
                    break;
                case 13:
                    t = (T) y6.b.p(parcel, D, T.CREATOR);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new d(rVar, g0, f, m0, l, n, i0, q, sVar, v, g0Var, t);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new d[i];
    }
}
