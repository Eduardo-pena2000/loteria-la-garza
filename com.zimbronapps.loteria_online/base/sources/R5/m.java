package R5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        float f = 0.0f;
        String str = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    z = y6.b.x(parcel, D);
                    break;
                case 3:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 4:
                    str = y6.b.q(parcel, D);
                    break;
                case 5:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 6:
                    f = y6.b.B(parcel, D);
                    break;
                case 7:
                    i = y6.b.F(parcel, D);
                    break;
                case 8:
                    z4 = y6.b.x(parcel, D);
                    break;
                case 9:
                    z5 = y6.b.x(parcel, D);
                    break;
                case 10:
                    z6 = y6.b.x(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new l(z, z2, str, z3, f, i, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new l[i];
    }
}
