package h7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class I extends y6.a {
    public static final Parcelable.Creator CREATOR = new J();
    public final String a;
    public final String b;
    public final String c;

    public I(String str, String str2, String str3) {
        this.c = str;
        this.a = str2;
        this.b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, this.a, false);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.E(parcel, 5, this.c, false);
        y6.c.b(parcel, a);
    }
}
