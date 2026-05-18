package M6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            y6.b.w(D);
            y6.b.L(parcel, D);
        }
        y6.b.v(parcel, M);
        return new t();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new t[i];
    }
}
