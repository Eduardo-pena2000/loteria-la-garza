package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.U;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        v6.b bVar = null;
        int i = 0;
        U u = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                bVar = (v6.b) y6.b.p(parcel, D, v6.b.CREATOR);
            } else if (w != 3) {
                y6.b.L(parcel, D);
            } else {
                u = (U) y6.b.p(parcel, D, U.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new l(i, bVar, u);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new l[i];
    }
}
