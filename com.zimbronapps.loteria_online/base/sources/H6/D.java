package h6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
                case 2:
                    j = y6.b.H(parcel, D);
                    break;
                case 3:
                    str = y6.b.q(parcel, D);
                    break;
                case 4:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 5:
                    i3 = y6.b.F(parcel, D);
                    break;
                case 6:
                    str2 = y6.b.q(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new a(i, j, str, i2, i3, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}
