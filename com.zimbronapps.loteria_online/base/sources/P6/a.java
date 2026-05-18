package p6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class a extends y6.a {
    public static final Parcelable.Creator CREATOR = new d();
    public final int a;
    public int b;
    public Bundle c;

    public a(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public int getType() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.t(parcel, 2, getType());
        y6.c.j(parcel, 3, this.c, false);
        y6.c.b(parcel, a);
    }
}
