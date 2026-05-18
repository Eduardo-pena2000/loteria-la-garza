package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class p0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        short s = 0;
        short s2 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                s = y6.b.J(parcel, D);
            } else if (w != 3) {
                y6.b.L(parcel, D);
            } else {
                s2 = y6.b.J(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new I(i, s, s2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new I[i];
    }
}
