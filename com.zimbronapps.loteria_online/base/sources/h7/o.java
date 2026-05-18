package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class O implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 1;
        int i2 = 1;
        long j = -1;
        long j2 = -1;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                i2 = y6.b.F(parcel, D);
            } else if (w == 3) {
                j = y6.b.H(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                j2 = y6.b.H(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new N(i, i2, j, j2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new N[i];
    }
}
