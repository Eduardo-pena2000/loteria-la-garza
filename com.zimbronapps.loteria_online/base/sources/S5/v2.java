package S5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        c1 c1Var = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    str = y6.b.q(parcel, D);
                    break;
                case 2:
                    j = y6.b.H(parcel, D);
                    break;
                case 3:
                    c1Var = (c1) y6.b.p(parcel, D, c1.CREATOR);
                    break;
                case 4:
                    bundle = y6.b.f(parcel, D);
                    break;
                case 5:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 6:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 7:
                    str4 = y6.b.q(parcel, D);
                    break;
                case 8:
                    str5 = y6.b.q(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new u2(str, j, c1Var, bundle, str2, str3, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new u2[i];
    }
}
