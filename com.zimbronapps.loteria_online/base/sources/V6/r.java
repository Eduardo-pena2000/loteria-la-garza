package v6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        Integer num = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i = y6.b.F(parcel, D);
            } else if (w == 2) {
                i2 = y6.b.F(parcel, D);
            } else if (w == 3) {
                pendingIntent = (PendingIntent) y6.b.p(parcel, D, PendingIntent.CREATOR);
            } else if (w == 4) {
                str = y6.b.q(parcel, D);
            } else if (w != 5) {
                y6.b.L(parcel, D);
            } else {
                num = y6.b.G(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new b(i, i2, pendingIntent, str, num);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new b[i];
    }
}
