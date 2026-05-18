package W5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                str = y6.b.q(parcel, D);
            } else if (w == 3) {
                i = y6.b.F(parcel, D);
            } else if (w == 4) {
                i2 = y6.b.F(parcel, D);
            } else if (w == 5) {
                z = y6.b.x(parcel, D);
            } else if (w != 6) {
                y6.b.L(parcel, D);
            } else {
                z2 = y6.b.x(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new a(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}
