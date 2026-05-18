package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.S;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        S s = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                s = (S) y6.b.p(parcel, D, S.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new j(i, s);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new j[i];
    }
}
