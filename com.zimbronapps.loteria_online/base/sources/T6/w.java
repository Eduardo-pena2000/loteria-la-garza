package T6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w extends W6.y implements d {
    public static final Parcelable.Creator CREATOR = new x();
    public final int a;

    public w(int i) {
        this.a = i;
    }

    public static int M1(d dVar) {
        return com.google.android.gms.common.internal.r.c(Integer.valueOf(dVar.u0()));
    }

    public static String N1(d dVar) {
        r.a d = com.google.android.gms.common.internal.r.d(dVar);
        d.a("FriendsListVisibilityStatus", Integer.valueOf(dVar.u0()));
        return d.toString();
    }

    public static boolean O1(d dVar, Object obj) {
        if (obj instanceof d) {
            return obj == dVar || ((d) obj).u0() == dVar.u0();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return O1(this, obj);
    }

    public final int hashCode() {
        return M1(this);
    }

    public final String toString() {
        return N1(this);
    }

    public final int u0() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }

    public w(d dVar) {
        this.a = dVar.u0();
    }

    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }
}
