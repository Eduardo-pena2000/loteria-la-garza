package k7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class p extends y6.a {
    public static final Parcelable.Creator CREATOR = new q();
    public final Bundle a;

    public p(Bundle bundle) {
        this.a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int a = y6.c.a(parcel);
        y6.c.j(parcel, 1, bundle, false);
        y6.c.b(parcel, a);
    }
}
