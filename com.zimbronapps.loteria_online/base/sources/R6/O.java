package R6;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class o implements Parcelable {
    public static final Parcelable.Creator CREATOR = new D0();
    public final R6.a a;

    public static class a extends Exception {
        public a(int i) {
            super("Algorithm with COSE value " + i + " not supported");
        }
    }

    public o(R6.a aVar) {
        this.a = (R6.a) com.google.android.gms.common.internal.t.l(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o b(int i) {
        B b;
        if (i == B.LEGACY_RS1.a()) {
            b = B.RS1;
        } else {
            B[] values = B.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (p pVar : p.values()) {
                        if (pVar.a() == i) {
                            b = pVar;
                        }
                    }
                    throw new a(i);
                }
                B b2 = values[i2];
                if (b2.a() == i) {
                    b = b2;
                    break;
                }
                i2++;
            }
        }
        return new o(b);
    }

    public int c() {
        return this.a.a();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && this.a.a() == ((o) obj).a.a();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a);
    }

    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + String.valueOf(this.a) + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
