package I6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        DataHolder dataHolder = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 2) {
                dataHolder = (DataHolder) y6.b.p(parcel, D, DataHolder.CREATOR);
            } else if (w == 3) {
                z = y6.b.x(parcel, D);
            } else if (w != 4) {
                y6.b.L(parcel, D);
            } else {
                i = y6.b.F(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new q(dataHolder, z, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new q[i];
    }
}
