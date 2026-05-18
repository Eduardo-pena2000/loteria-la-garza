package f7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class m implements Parcelable.Creator {
    public static void c(l lVar, Parcel parcel, int i) {
        y6.c.b(parcel, y6.c.a(parcel));
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public l createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            y6.b.w(D);
            y6.b.L(parcel, D);
        }
        y6.b.v(parcel, M);
        return new l();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l[] newArray(int i) {
        return new l[i];
    }
}
