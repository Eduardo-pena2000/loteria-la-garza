package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                z = y6.b.x(parcel, D);
            } else if (w == 2) {
                j = y6.b.H(parcel, D);
            } else if (w == 3) {
                f = y6.b.B(parcel, D);
            } else if (w == 4) {
                j2 = y6.b.H(parcel, D);
            } else if (w != 5) {
                y6.b.L(parcel, D);
            } else {
                i = y6.b.F(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new Y(z, j, f, j2, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Y[i];
    }
}
