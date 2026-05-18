package M6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        FilterHolder filterHolder = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 1) {
                y6.b.L(parcel, D);
            } else {
                filterHolder = (FilterHolder) y6.b.p(parcel, D, FilterHolder.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new v(filterHolder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new v[i];
    }
}
