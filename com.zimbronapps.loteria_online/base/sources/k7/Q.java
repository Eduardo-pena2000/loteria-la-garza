package k7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 1) {
                y6.b.L(parcel, D);
            } else {
                bundle = y6.b.f(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new p(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new p[i];
    }
}
