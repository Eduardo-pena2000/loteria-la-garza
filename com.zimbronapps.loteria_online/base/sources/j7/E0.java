package J7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    str = y6.b.q(parcel, D);
                    break;
                case 2:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 3:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 4:
                    str4 = y6.b.q(parcel, D);
                    break;
                case 5:
                    z = y6.b.x(parcel, D);
                    break;
                case 6:
                    str5 = y6.b.q(parcel, D);
                    break;
                case 7:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 8:
                    str6 = y6.b.q(parcel, D);
                    break;
                case 9:
                    i = y6.b.F(parcel, D);
                    break;
                case 10:
                    str7 = y6.b.q(parcel, D);
                    break;
                case 11:
                    str8 = y6.b.q(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new e(str, str2, str3, str4, z, str5, z2, str6, i, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new e[i];
    }
}
