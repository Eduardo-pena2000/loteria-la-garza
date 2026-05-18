package l6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        boolean z = false;
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
                    i = y6.b.F(parcel, D);
                    break;
                case 7:
                    arrayList = y6.b.u(parcel, D, e.CREATOR);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new h(str, str2, str3, str4, z, i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new h[i];
    }
}
