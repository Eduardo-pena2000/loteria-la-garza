package J7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class d0 extends y6.a {
    public static final Parcelable.Creator CREATOR = new x0();
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public Uri e;

    public static class a {
        public String a;
        public Uri b;
        public boolean c;
        public boolean d;

        public d0 a() {
            String str = this.a;
            Uri uri = this.b;
            return new d0(str, uri == null ? null : uri.toString(), this.c, this.d);
        }

        public a b(String str) {
            if (str == null) {
                this.c = true;
            } else {
                this.a = str;
            }
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.d = true;
            } else {
                this.b = uri;
            }
            return this;
        }
    }

    public d0(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    public Uri M1() {
        return this.e;
    }

    public String getDisplayName() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.E(parcel, 2, getDisplayName(), false);
        y6.c.E(parcel, 3, this.b, false);
        y6.c.g(parcel, 4, this.c);
        y6.c.g(parcel, 5, this.d);
        y6.c.b(parcel, a2);
    }

    public final String zza() {
        return this.b;
    }

    public final boolean zzb() {
        return this.c;
    }

    public final boolean zzc() {
        return this.d;
    }
}
