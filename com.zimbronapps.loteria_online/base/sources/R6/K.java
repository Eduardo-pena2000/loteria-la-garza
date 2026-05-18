package R6;

import R6.D;
import R6.b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class k extends y6.a {
    public static final Parcelable.Creator CREATOR = new A0();
    public final b a;
    public final Boolean b;
    public final G c;
    public final D d;

    public k(String str, Boolean bool, String str2, String str3) {
        b b;
        D d = null;
        if (str == null) {
            b = null;
        } else {
            try {
                b = b.b(str);
            } catch (D.a | b.a | n0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = b;
        this.b = bool;
        this.c = str2 == null ? null : G.b(str2);
        if (str3 != null) {
            d = D.b(str3);
        }
        this.d = d;
    }

    public String M1() {
        b bVar = this.a;
        if (bVar == null) {
            return null;
        }
        return bVar.toString();
    }

    public Boolean N1() {
        return this.b;
    }

    public D O1() {
        D d = this.d;
        if (d != null) {
            return d;
        }
        Boolean bool = this.b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return D.RESIDENT_KEY_REQUIRED;
    }

    public String P1() {
        D O1 = O1();
        if (O1 == null) {
            return null;
        }
        return O1.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return com.google.android.gms.common.internal.r.b(this.a, kVar.a) && com.google.android.gms.common.internal.r.b(this.b, kVar.b) && com.google.android.gms.common.internal.r.b(this.c, kVar.c) && com.google.android.gms.common.internal.r.b(O1(), kVar.O1());
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, this.c, O1());
    }

    public final String toString() {
        D d = this.d;
        G g = this.c;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.a) + ", \n requireResidentKey=" + this.b + ", \n requireUserVerification=" + String.valueOf(g) + ", \n residentKeyRequirement=" + String.valueOf(d) + "\n }";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, M1(), false);
        y6.c.i(parcel, 3, N1(), false);
        G g = this.c;
        y6.c.E(parcel, 4, g == null ? null : g.toString(), false);
        y6.c.E(parcel, 5, P1(), false);
        y6.c.b(parcel, a);
    }
}
