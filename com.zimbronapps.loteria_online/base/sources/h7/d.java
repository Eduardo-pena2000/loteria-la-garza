package h7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class D implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        long j = 0;
        N[] nArr = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i2 = y6.b.F(parcel, D);
            } else if (w == 2) {
                i3 = y6.b.F(parcel, D);
            } else if (w == 3) {
                j = y6.b.H(parcel, D);
            } else if (w == 4) {
                i = y6.b.F(parcel, D);
            } else if (w != 5) {
                y6.b.L(parcel, D);
            } else {
                nArr = (N[]) y6.b.t(parcel, D, N.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new LocationAvailability(i, i2, i3, j, nArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
