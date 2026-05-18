package S5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r2 implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        String str = null;
        q2[] q2VarArr = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 2:
                    str = y6.b.q(parcel, D);
                    break;
                case 3:
                    i = y6.b.F(parcel, D);
                    break;
                case 4:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 5:
                    z = y6.b.x(parcel, D);
                    break;
                case 6:
                    i3 = y6.b.F(parcel, D);
                    break;
                case 7:
                    i4 = y6.b.F(parcel, D);
                    break;
                case 8:
                    q2VarArr = (q2[]) y6.b.t(parcel, D, q2.CREATOR);
                    break;
                case 9:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 10:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 11:
                    z4 = y6.b.x(parcel, D);
                    break;
                case 12:
                    z5 = y6.b.x(parcel, D);
                    break;
                case 13:
                    z6 = y6.b.x(parcel, D);
                    break;
                case 14:
                    z7 = y6.b.x(parcel, D);
                    break;
                case 15:
                    z8 = y6.b.x(parcel, D);
                    break;
                case 16:
                    z9 = y6.b.x(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new q2(str, i, i2, z, i3, i4, q2VarArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new q2[i];
    }
}
