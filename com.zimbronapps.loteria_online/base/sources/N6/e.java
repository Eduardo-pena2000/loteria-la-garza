package n6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            int w = y6.b.w(D);
            if (w == 1) {
                i2 = y6.b.F(parcel, D);
            } else if (w == 2) {
                pendingIntent = (PendingIntent) y6.b.p(parcel, D, PendingIntent.CREATOR);
            } else if (w == 3) {
                i3 = y6.b.F(parcel, D);
            } else if (w == 4) {
                bundle = y6.b.f(parcel, D);
            } else if (w == 5) {
                bArr = y6.b.g(parcel, D);
            } else if (w != 1000) {
                y6.b.L(parcel, D);
            } else {
                i = y6.b.F(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new c(i, i2, pendingIntent, i3, bundle, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new c[i];
    }
}
