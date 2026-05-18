package o7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Intent intent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                i2 = y6.b.F(parcel, D);
            } else if (w != 3) {
                y6.b.L(parcel, D);
            } else {
                intent = (Intent) y6.b.p(parcel, D, Intent.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new b(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
