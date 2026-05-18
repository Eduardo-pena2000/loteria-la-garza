package I6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u extends y6.a {
    public static final Parcelable.Creator CREATOR = new v();
    public final int a;

    public u(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 2, this.a);
        y6.c.b(parcel, a);
    }
}
