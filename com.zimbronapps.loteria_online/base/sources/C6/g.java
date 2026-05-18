package C6;

import C6.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g extends y6.a {
    public static final Parcelable.Creator CREATOR = new e();
    public final int a;
    public final String b;
    public final a.a c;

    public g(int i, String str, a.a aVar) {
        this.a = i;
        this.b = str;
        this.c = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.C(parcel, 3, this.c, i, false);
        y6.c.b(parcel, a);
    }

    public g(String str, a.a aVar) {
        this.a = 1;
        this.b = str;
        this.c = aVar;
    }
}
