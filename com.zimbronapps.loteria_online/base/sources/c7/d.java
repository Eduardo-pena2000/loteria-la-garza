package c7;

import W6.y;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d extends y implements a {
    public static final Parcelable.Creator CREATOR = new l();
    public final i a;
    public final c b;

    public d(e eVar, c cVar) {
        this.a = new i(eVar);
        this.b = cVar;
    }

    public b I1() {
        if (this.b.n1()) {
            return null;
        }
        return this.b;
    }

    public e e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return r.b(aVar.e(), e()) && r.b(aVar.I1(), I1());
    }

    public int hashCode() {
        return r.c(e(), I1());
    }

    public String toString() {
        return r.d(this).a("Metadata", e()).a("HasContents", Boolean.valueOf(I1() != null)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, e(), i, false);
        y6.c.C(parcel, 3, I1(), i, false);
        y6.c.b(parcel, a);
    }
}
