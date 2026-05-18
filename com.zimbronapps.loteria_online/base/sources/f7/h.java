package f7;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h extends y6.a {
    public final PendingIntent a;
    public static final a b = new a(null);
    public static final Parcelable.Creator CREATOR = new i();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public h(PendingIntent pendingIntent) {
        t.g(pendingIntent, "pendingIntent");
        this.a = pendingIntent;
    }

    public final PendingIntent M1() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "dest");
        i.c(this, parcel, i);
    }
}
