package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.U;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class l extends y6.a {
    public static final Parcelable.Creator CREATOR = new m();
    public final int a;
    public final v6.b b;
    public final U c;

    public l(int i, v6.b bVar, U u) {
        this.a = i;
        this.b = bVar;
        this.c = u;
    }

    public final v6.b M1() {
        return this.b;
    }

    public final U N1() {
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.C(parcel, 2, this.b, i, false);
        y6.c.C(parcel, 3, this.c, i, false);
        y6.c.b(parcel, a);
    }
}
