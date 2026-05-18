package o7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.S;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j extends y6.a {
    public static final Parcelable.Creator CREATOR = new k();
    public final int a;
    public final S b;

    public j(int i, S s) {
        this.a = i;
        this.b = s;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.C(parcel, 2, this.b, i, false);
        y6.c.b(parcel, a);
    }
}
