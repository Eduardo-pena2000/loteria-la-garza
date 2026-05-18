package S6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        b bVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                bVar = (b) y6.b.p(parcel, D, b.CREATOR);
            } else if (w == 3) {
                str = y6.b.q(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                str2 = y6.b.q(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new e(bVar, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new e[i];
    }
}
