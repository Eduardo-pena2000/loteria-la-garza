package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class M implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    z = y6.b.x(parcel, D);
                    break;
                case 2:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 3:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 4:
                    z4 = y6.b.x(parcel, D);
                    break;
                case 5:
                    z5 = y6.b.x(parcel, D);
                    break;
                case 6:
                    z6 = y6.b.x(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new n(z, z2, z3, z4, z5, z6);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new n[i];
    }
}
