package l6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import l6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    z = y6.b.x(parcel, D);
                    break;
                case 2:
                    str = y6.b.q(parcel, D);
                    break;
                case 3:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 4:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 5:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 6:
                    list = y6.b.s(parcel, D);
                    break;
                case 7:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 8:
                    arrayList = y6.b.u(parcel, D, e.CREATOR);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new c.b(z, str, str2, z2, str3, list, z3, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c.b[i];
    }
}
