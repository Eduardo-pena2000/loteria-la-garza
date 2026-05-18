package Y6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class z extends y6.a {
    public static final Parcelable.Creator CREATOR = new A();
    public final String a;
    public final PersistableBundle b;
    public final Boolean c;
    public final Boolean d;

    public z(String str, PersistableBundle persistableBundle, Boolean bool, Boolean bool2) {
        this.a = str;
        this.b = persistableBundle;
        this.c = bool;
        this.d = bool2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, str, false);
        y6.c.C(parcel, 2, this.b, i, false);
        y6.c.i(parcel, 3, this.c, false);
        y6.c.i(parcel, 4, this.d, false);
        y6.c.b(parcel, a);
    }

    public final String zza() {
        return this.a;
    }
}
