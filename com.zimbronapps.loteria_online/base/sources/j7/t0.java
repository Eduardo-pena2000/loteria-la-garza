package J7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class t0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                str = y6.b.q(parcel, D);
            } else if (w == 2) {
                str2 = y6.b.q(parcel, D);
            } else if (w == 3) {
                j = y6.b.H(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                str3 = y6.b.q(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new S(str, str2, j, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new S[i];
    }
}
