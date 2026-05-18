package S5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class a2 extends y6.a {
    public static final Parcelable.Creator CREATOR = new b2();
    public final String a;

    public a2(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 15, str, false);
        y6.c.b(parcel, a);
    }
}
