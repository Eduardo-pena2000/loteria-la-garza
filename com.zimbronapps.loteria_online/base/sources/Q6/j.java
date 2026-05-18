package q6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import q6.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Bundle bundle = null;
        List list = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                bundle = y6.b.f(parcel, D);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                list = y6.b.u(parcel, D, e.a.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new e(bundle, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new e[i];
    }
}
