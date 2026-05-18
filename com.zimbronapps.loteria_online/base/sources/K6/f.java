package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
                case 2:
                    list = y6.b.s(parcel, D);
                    break;
                case 3:
                    list2 = y6.b.s(parcel, D);
                    break;
                case 4:
                    list3 = y6.b.s(parcel, D);
                    break;
                case 5:
                    list4 = y6.b.s(parcel, D);
                    break;
                case 6:
                    arrayList = y6.b.s(parcel, D);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new e(i, list, list2, list3, list4, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new e[i];
    }
}
