package n6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c extends y6.a {
    public static final Parcelable.Creator CREATOR = new e();
    public final int a;
    public final PendingIntent b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public c(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.e = i;
        this.a = i2;
        this.c = i3;
        this.f = bundle;
        this.d = bArr;
        this.b = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.C(parcel, 2, this.b, i, false);
        y6.c.t(parcel, 3, this.c);
        y6.c.j(parcel, 4, this.f, false);
        y6.c.k(parcel, 5, this.d, false);
        y6.c.t(parcel, 1000, this.e);
        y6.c.b(parcel, a);
    }
}
