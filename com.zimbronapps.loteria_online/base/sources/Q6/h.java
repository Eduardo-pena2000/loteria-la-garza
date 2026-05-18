package q6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                arrayList = y6.b.s(parcel, D);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                z = y6.b.x(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new c(arrayList, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
