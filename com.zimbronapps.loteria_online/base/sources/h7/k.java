package h7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class K implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        I i = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                arrayList = y6.b.u(parcel, D, LocationRequest.CREATOR);
            } else if (w == 2) {
                z = y6.b.x(parcel, D);
            } else if (w == 3) {
                z2 = y6.b.x(parcel, D);
            } else if (w != 5) {
                y6.b.L(parcel, D);
            } else {
                i = (I) y6.b.p(parcel, D, I.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new l(arrayList, z, z2, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new l[i];
    }
}
