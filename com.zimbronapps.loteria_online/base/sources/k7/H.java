package k7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                j = y6.b.H(parcel, D);
            } else if (w == 2) {
                i = y6.b.F(parcel, D);
            } else if (w != 3) {
                y6.b.L(parcel, D);
            } else {
                j2 = y6.b.H(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new g(j, i, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new g[i];
    }
}
