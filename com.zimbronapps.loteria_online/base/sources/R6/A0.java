package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a0 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                str = y6.b.q(parcel, D);
            } else if (w != 3) {
                y6.b.L(parcel, D);
            } else {
                num = y6.b.G(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new w(str, num.intValue());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new w[i];
    }
}
