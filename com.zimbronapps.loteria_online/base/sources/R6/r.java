package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class r extends y6.a {
    public static final Parcelable.Creator CREATOR = new L0();
    public final String a;

    public r(String str) {
        this.a = (String) com.google.android.gms.common.internal.t.l(str);
    }

    public String M1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.a.equals(((r) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a);
    }

    public final String toString() {
        return "FidoAppIdExtension{appid='" + this.a + "'}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, M1(), false);
        y6.c.b(parcel, a);
    }
}
