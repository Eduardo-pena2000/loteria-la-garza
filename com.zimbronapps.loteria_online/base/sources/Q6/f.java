package q6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f extends y6.a {
    public static final Parcelable.Creator CREATOR = new k();
    public final byte[] a;
    public final boolean b;
    public final String c;

    public static final class a {
        public byte[] a;
        public boolean b;
        public String c = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

        public f a() {
            return new f(this.a, this.b, this.c);
        }

        public a b(byte[] bArr) {
            this.a = bArr;
            return this;
        }

        public a c(String str) {
            t.g(str, "key cannot be null or empty");
            this.c = str;
            return this;
        }

        public a d(boolean z) {
            this.b = z;
            return this;
        }
    }

    public f(byte[] bArr, boolean z, String str) {
        this.a = bArr;
        this.b = z;
        this.c = str;
    }

    public byte[] M1() {
        return this.a;
    }

    public String N1() {
        return this.c;
    }

    public boolean O1() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.k(parcel, 1, M1(), false);
        y6.c.g(parcel, 2, O1());
        y6.c.E(parcel, 3, N1(), false);
        y6.c.b(parcel, a2);
    }
}
