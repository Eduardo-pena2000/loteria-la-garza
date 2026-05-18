package f7;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n extends y6.a {
    public static final a a = new a(null);
    public static final Parcelable.Creator CREATOR = new o();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "dest");
        o.c(this, parcel, i);
    }
}
