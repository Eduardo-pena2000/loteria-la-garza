package C6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Parcel parcel2 = null;
        int i = 0;
        h hVar = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                parcel2 = y6.b.n(parcel, D);
            } else if (w != 3) {
                y6.b.L(parcel, D);
            } else {
                hVar = (h) y6.b.p(parcel, D, h.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new c(i, parcel2, hVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
