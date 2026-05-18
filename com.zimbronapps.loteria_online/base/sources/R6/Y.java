package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class y extends y6.a {
    public static final Parcelable.Creator CREATOR = new c0();
    public final String a;
    public final String b;
    public final String c;

    public y(String str, String str2, String str3) {
        this.a = (String) com.google.android.gms.common.internal.t.l(str);
        this.b = (String) com.google.android.gms.common.internal.t.l(str2);
        this.c = str3;
    }

    public String M1() {
        return this.c;
    }

    public String N1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return com.google.android.gms.common.internal.r.b(this.a, yVar.a) && com.google.android.gms.common.internal.r.b(this.b, yVar.b) && com.google.android.gms.common.internal.r.b(this.c, yVar.c);
    }

    public String getName() {
        return this.b;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, this.c);
    }

    public final String toString() {
        return "PublicKeyCredentialRpEntity{\n id='" + this.a + "', \n name='" + this.b + "', \n icon='" + this.c + "'}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, N1(), false);
        y6.c.E(parcel, 3, getName(), false);
        y6.c.E(parcel, 4, M1(), false);
        y6.c.b(parcel, a);
    }
}
