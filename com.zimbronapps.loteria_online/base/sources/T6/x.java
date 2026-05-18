package T6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x implements Parcelable.Creator {
    public static void a(w wVar, Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, wVar.u0());
        y6.c.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        int i = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 1) {
                y6.b.L(parcel, D);
            } else {
                i = y6.b.F(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new w(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new w[i];
    }
}
