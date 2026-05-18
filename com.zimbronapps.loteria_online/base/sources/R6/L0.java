package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 1) {
                y6.b.L(parcel, D);
            } else {
                z = y6.b.x(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new F(z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new F[i];
    }
}
