package c7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        H6.a aVar = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 1) {
                y6.b.L(parcel, D);
            } else {
                aVar = (H6.a) y6.b.p(parcel, D, H6.a.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new c(aVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
