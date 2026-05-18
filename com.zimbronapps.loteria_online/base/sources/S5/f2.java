package S5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                z = y6.b.x(parcel, D);
            } else if (w == 3) {
                z2 = y6.b.x(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                z3 = y6.b.x(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new e2(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new e2[i];
    }
}
