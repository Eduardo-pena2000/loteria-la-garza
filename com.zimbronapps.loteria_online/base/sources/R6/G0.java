package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g0 extends y6.a {
    public static final Parcelable.Creator CREATOR = new h0();
    public final String a;

    public g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return com.google.android.gms.common.internal.r.b(this.a, ((g0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.b(parcel, a);
    }
}
