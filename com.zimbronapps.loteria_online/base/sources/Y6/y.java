package Y6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        ArrayList arrayList = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                arrayList = y6.b.s(parcel, D);
            } else if (w == 2) {
                list = y6.b.u(parcel, D, x.a());
            } else if (w == 3) {
                list2 = y6.b.s(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                list3 = y6.b.s(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new w(arrayList, list, list2, list3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new w[i];
    }
}
