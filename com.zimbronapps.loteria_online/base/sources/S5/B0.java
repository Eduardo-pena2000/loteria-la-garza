package S5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b0 extends y6.a {
    public static final Parcelable.Creator CREATOR = new B0();
    public final String a;
    public final String b;

    public b0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.b(parcel, a);
    }
}
