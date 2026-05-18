package n6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends y6.a {
    public static final Parcelable.Creator CREATOR = new d();
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 7;
    public static final int o = 7;
    public final String a;
    public final int b;
    public final long c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public b(int i2, String str, int i3, long j2, byte[] bArr, Bundle bundle) {
        this.e = i2;
        this.a = str;
        this.b = i3;
        this.c = j2;
        this.d = bArr;
        this.f = bundle;
    }

    public String toString() {
        return "ProxyRequest[ url: " + this.a + ", method: " + this.b + " ]";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, this.a, false);
        y6.c.t(parcel, 2, this.b);
        y6.c.x(parcel, 3, this.c);
        y6.c.k(parcel, 4, this.d, false);
        y6.c.j(parcel, 5, this.f, false);
        y6.c.t(parcel, 1000, this.e);
        y6.c.b(parcel, a);
    }
}
