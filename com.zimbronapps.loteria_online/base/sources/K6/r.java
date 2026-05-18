package K6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        long j = 0;
        int i = -1;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                str = y6.b.q(parcel, D);
            } else if (w == 3) {
                j = y6.b.H(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                i = y6.b.F(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new q(str, j, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new q[i];
    }
}
