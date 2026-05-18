package h7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class P extends y6.a {
    public static final Parcelable.Creator CREATOR = new Q();
    public final List a;
    public final PendingIntent b;
    public final String c;

    public P(List list, PendingIntent pendingIntent, String str) {
        this.a = list == null ? zzbs.zzi() : zzbs.zzj(list);
        this.b = pendingIntent;
        this.c = str;
    }

    public static P M1(List list) {
        com.google.android.gms.common.internal.t.m(list, "geofence can't be null.");
        com.google.android.gms.common.internal.t.b(!list.isEmpty(), "Geofences must contains at least one id.");
        return new P(list, null, "");
    }

    public static P N1(PendingIntent pendingIntent) {
        com.google.android.gms.common.internal.t.m(pendingIntent, "PendingIntent can not be null.");
        return new P(null, pendingIntent, "");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.G(parcel, 1, this.a, false);
        y6.c.C(parcel, 2, this.b, i, false);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.b(parcel, a);
    }
}
