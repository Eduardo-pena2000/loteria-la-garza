package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f implements Parcelable.Creator {
    public static void c(e eVar, Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.j(parcel, 1, eVar.M1(), false);
        y6.c.b(parcel, a);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            if (y6.b.w(D) != 1) {
                y6.b.L(parcel, D);
            } else {
                bundle = y6.b.f(parcel, D);
            }
        }
        y6.b.v(parcel, M);
        return new e(bundle);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e[] newArray(int i) {
        return new e[i];
    }
}
