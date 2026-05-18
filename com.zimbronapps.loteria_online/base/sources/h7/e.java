package h7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class E implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        boolean z2 = false;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
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
                    j2 = y6.b.H(parcel, D);
                    break;
                case 4:
                    z = y6.b.x(parcel, D);
                    break;
                case 5:
                    j3 = y6.b.H(parcel, D);
                    break;
                case 6:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 7:
                    f = y6.b.B(parcel, D);
                    break;
                case 8:
                    j4 = y6.b.H(parcel, D);
                    break;
                case 9:
                    z2 = y6.b.x(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
