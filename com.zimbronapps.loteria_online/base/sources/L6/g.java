package l6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g extends y6.a {
    public static final Parcelable.Creator CREATOR = new x();
    public final int a;

    public g(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return com.google.android.gms.common.internal.r.b(Integer.valueOf(this.a), Integer.valueOf(((g) obj).a));
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(Integer.valueOf(this.a));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.b(parcel, a);
    }
}
