package J7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class x0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        String str2 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                str = y6.b.q(parcel, D);
            } else if (w == 3) {
                str2 = y6.b.q(parcel, D);
            } else if (w == 4) {
                z = y6.b.x(parcel, D);
            } else if (w != 5) {
                y6.b.L(parcel, D);
            } else {
                z2 = y6.b.x(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new d0(str, str2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new d0[i];
    }
}
