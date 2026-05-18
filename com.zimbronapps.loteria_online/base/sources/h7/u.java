package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class U implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                i2 = y6.b.F(parcel, D);
            } else if (w == 3) {
                i3 = y6.b.F(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                i4 = y6.b.F(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new T(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new T[i];
    }
}
