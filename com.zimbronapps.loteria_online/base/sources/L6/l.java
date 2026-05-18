package l6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class l extends y6.a {
    public static final Parcelable.Creator CREATOR = new H();
    public final PendingIntent a;

    public l(PendingIntent pendingIntent) {
        this.a = (PendingIntent) com.google.android.gms.common.internal.t.l(pendingIntent);
    }

    public PendingIntent M1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return com.google.android.gms.common.internal.r.b(this.a, ((l) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, M1(), i, false);
        y6.c.b(parcel, a);
    }
}
