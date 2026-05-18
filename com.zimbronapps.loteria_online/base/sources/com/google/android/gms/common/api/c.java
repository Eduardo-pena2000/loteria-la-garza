package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c extends y6.a {
    public static final Parcelable.Creator CREATOR = v.a();
    public static final c d = O1().a();
    public static final c e;
    public final e a;
    public final boolean b;
    public boolean c;

    public static final class a {
        public e a;
        public boolean b = false;
        public boolean c;

        public c a() {
            c cVar = new c(this.a, this.b);
            cVar.P1(this.c);
            return cVar;
        }

        public a b(e eVar) {
            this.a = eVar;
            return this;
        }

        public final /* synthetic */ a c(boolean z) {
            this.c = z;
            return this;
        }
    }

    static {
        a O1 = O1();
        O1.c(true);
        e = O1.a();
    }

    public c(e eVar, boolean z) {
        this.a = eVar;
        this.b = z;
    }

    public static final c M1(e eVar) {
        a O1 = O1();
        O1.b(eVar);
        return O1.a();
    }

    public static final c N1() {
        return d;
    }

    public static a O1() {
        return new a();
    }

    public final /* synthetic */ void P1(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return com.google.android.gms.common.internal.r.b(this.a, cVar.a) && this.c == cVar.c && this.b == cVar.b;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("ApiMetadata(complianceOptions=");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int a2 = y6.c.a(parcel);
        y6.c.C(parcel, 1, this.a, i, false);
        y6.c.g(parcel, 2, this.b);
        y6.c.b(parcel, a2);
    }
}
