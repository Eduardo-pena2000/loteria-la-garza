package f7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k implements Parcelable.Creator {
    public static void c(j jVar, Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, jVar.M1(), i, false);
        y6.c.b(parcel, a);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 1) {
                y6.b.L(parcel, D);
            } else {
                pendingIntent = (PendingIntent) y6.b.p(parcel, D, PendingIntent.CREATOR);
            }
        }
        y6.b.v(parcel, M);
        return new j(pendingIntent);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j[] newArray(int i) {
        return new j[i];
    }
}
