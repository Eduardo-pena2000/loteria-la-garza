package I6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.drive.zzh;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s extends y6.a implements d {
    public static final Parcelable.Creator CREATOR = new t();
    public final zzh a;

    public s(zzh zzhVar) {
        this.a = zzhVar;
    }

    public final zzh M1() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != s.class) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.common.internal.r.b(this.a, ((s) obj).a);
    }

    public final int getType() {
        return 8;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 2, this.a, i, false);
        y6.c.b(parcel, a);
    }
}
