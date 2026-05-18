package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class s extends y6.a {
    public static final Parcelable.Creator CREATOR = new P();
    public final boolean a;

    public s(boolean z) {
        this.a = z;
    }

    public boolean M1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && this.a == ((s) obj).M1();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(Boolean.valueOf(this.a));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.g(parcel, 1, M1());
        y6.c.b(parcel, a);
    }
}
