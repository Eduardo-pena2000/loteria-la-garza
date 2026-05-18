package M6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                str = y6.b.q(parcel, D);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                z = y6.b.x(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new g(str, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new g[i];
    }
}
