package k7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h7 extends y6.a {
    public static final Parcelable.Creator CREATOR = new i7();
    public final int a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Double g;

    public h7(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        this.g = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.e = str2;
        this.f = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i7.a(this, parcel, i);
    }

    public final Object zza() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d = this.g;
        if (d != null) {
            return d;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    public h7(j7 j7Var) {
        this(j7Var.c, j7Var.d, j7Var.e, j7Var.b);
    }

    public h7(String str, long j, Object obj, String str2) {
        com.google.android.gms.common.internal.t.f(str);
        this.a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.g = null;
            this.e = null;
            return;
        }
        if (obj instanceof Long) {
            this.d = (Long) obj;
            this.g = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.g = null;
            this.e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.d = null;
                this.g = (Double) obj;
                this.e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
