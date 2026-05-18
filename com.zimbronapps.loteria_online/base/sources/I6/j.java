package I6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        k kVar = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 3) {
                y6.b.L(parcel, D);
            } else {
                kVar = (k) y6.b.p(parcel, D, k.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new i(kVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new i[i];
    }
}
