package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends y6.a {
    public static final Parcelable.Creator CREATOR;
    public static final e e;
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public static final class a {
        public int a = -1;
        public int b = -1;
        public int c = 0;
        public boolean d = true;

        public e a() {
            return new e(this.a, this.b, this.c, this.d);
        }

        public a b(int i) {
            this.a = i;
            return this;
        }

        public a c(int i) {
            this.b = i;
            return this;
        }

        public a d(boolean z) {
            this.d = z;
            return this;
        }

        public a e(int i) {
            this.c = i;
            return this;
        }
    }

    static {
        a M1 = M1();
        M1.b(-1);
        M1.c(-1);
        M1.e(0);
        M1.d(true);
        e = M1.a();
        CREATOR = new x();
    }

    public e(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public static a M1() {
        return new a();
    }

    public static final a N1(Context context) {
        return M1();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        int length3 = String.valueOf(i3).length();
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        sb.append("ComplianceOptions{callerProductId=");
        sb.append(i);
        sb.append(", dataOwnerProductId=");
        sb.append(i2);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a2 = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.t(parcel, 2, this.b);
        y6.c.t(parcel, 3, this.c);
        y6.c.g(parcel, 4, this.d);
        y6.c.b(parcel, a2);
    }
}
