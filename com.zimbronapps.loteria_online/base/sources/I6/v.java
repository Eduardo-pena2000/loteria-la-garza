package I6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 2) {
                y6.b.L(parcel, D);
            } else {
                i = y6.b.F(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new u(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new u[i];
    }
}
