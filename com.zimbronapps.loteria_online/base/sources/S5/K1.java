package S5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k1 extends y6.a {
    public static final Parcelable.Creator CREATOR = new l1();
    public final int a;

    public k1(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 2, i2);
        y6.c.b(parcel, a);
    }
}
