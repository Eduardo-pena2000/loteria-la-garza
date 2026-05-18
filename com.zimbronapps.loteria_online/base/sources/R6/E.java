package r6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends y6.a {
    public final Bundle a;
    public static final a b = new a(null);
    public static final Parcelable.Creator CREATOR = new f();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public e(Bundle bundle) {
        t.g(bundle, "responseBundle");
        this.a = bundle;
    }

    public final Bundle M1() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "dest");
        f.c(this, parcel, i);
    }
}
