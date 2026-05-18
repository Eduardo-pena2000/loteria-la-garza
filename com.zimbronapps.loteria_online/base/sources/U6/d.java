package u6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 1) {
                y6.b.L(parcel, D);
            } else {
                intent = (Intent) y6.b.p(parcel, D, Intent.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new a(intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}
