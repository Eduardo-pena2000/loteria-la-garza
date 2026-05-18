package M6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l extends a {
    public static final Parcelable.Creator CREATOR = new m();
    public final String a;

    public l(String str) {
        this.a = str;
    }

    public final Object Q0(k kVar) {
        return kVar.zzi(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, this.a, false);
        y6.c.b(parcel, a);
    }
}
