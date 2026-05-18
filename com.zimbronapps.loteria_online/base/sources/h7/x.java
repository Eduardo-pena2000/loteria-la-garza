package h7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class X implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        ArrayList arrayList = null;
        String str = null;
        List list = null;
        String str2 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                arrayList = y6.b.u(parcel, D, c.CREATOR);
            } else if (w == 2) {
                str = y6.b.q(parcel, D);
            } else if (w == 3) {
                list = y6.b.u(parcel, D, com.google.android.gms.common.internal.e.CREATOR);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                str2 = y6.b.q(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new d(arrayList, str, list, str2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new d[i];
    }
}
