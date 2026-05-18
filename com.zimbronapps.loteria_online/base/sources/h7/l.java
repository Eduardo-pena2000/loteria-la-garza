package h7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class L implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Status status = null;
        n nVar = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                status = (Status) y6.b.p(parcel, D, Status.CREATOR);
            } else if (w != 2) {
                y6.b.L(parcel, D);
            } else {
                nVar = (n) y6.b.p(parcel, D, n.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new m(status, nVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new m[i];
    }
}
