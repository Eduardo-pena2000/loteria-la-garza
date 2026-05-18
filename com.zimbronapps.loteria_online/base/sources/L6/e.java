package l6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends y6.a {
    public static final Parcelable.Creator CREATOR = new u();
    public final String a;
    public final boolean b;

    public e(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public boolean M1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a.equals(eVar.a) && this.b == eVar.b) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return this.a;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, Boolean.valueOf(this.b));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, getName(), false);
        y6.c.g(parcel, 2, M1());
        y6.c.b(parcel, a);
    }
}
