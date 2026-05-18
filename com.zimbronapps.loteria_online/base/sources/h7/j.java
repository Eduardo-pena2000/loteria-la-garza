package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class J implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                str2 = y6.b.q(parcel, D);
            } else if (w == 2) {
                str3 = y6.b.q(parcel, D);
            } else if (w != 5) {
                y6.b.L(parcel, D);
            } else {
                str = y6.b.q(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new I(str, str2, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new I[i];
    }
}
