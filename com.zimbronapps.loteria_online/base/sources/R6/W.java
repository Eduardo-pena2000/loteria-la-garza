package R6;

import R6.o;
import R6.z;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class w extends y6.a {
    public static final Parcelable.Creator CREATOR = new a0();
    public final z a;
    public final o b;

    public w(String str, int i) {
        com.google.android.gms.common.internal.t.l(str);
        try {
            this.a = z.b(str);
            com.google.android.gms.common.internal.t.l(Integer.valueOf(i));
            try {
                this.b = o.b(i);
            } catch (o.a e) {
                throw new IllegalArgumentException(e);
            }
        } catch (z.a e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int M1() {
        return this.b.c();
    }

    public String N1() {
        return this.a.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.a.equals(wVar.a) && this.b.equals(wVar.b);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b);
    }

    public final String toString() {
        o oVar = this.b;
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.a) + ", \n algorithm=" + String.valueOf(oVar) + "\n }";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, N1(), false);
        y6.c.w(parcel, 3, Integer.valueOf(M1()), false);
        y6.c.b(parcel, a);
    }
}
