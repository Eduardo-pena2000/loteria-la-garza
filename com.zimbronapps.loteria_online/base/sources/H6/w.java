package H6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                j = y6.b.H(parcel, D);
            } else if (w == 3) {
                j2 = y6.b.H(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                j3 = y6.b.H(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new v(j, j2, j3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new v[i];
    }
}
