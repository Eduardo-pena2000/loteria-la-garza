package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Scope extends y6.a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new y();
    public final int a;
    public final String b;

    public Scope(int i, String str) {
        com.google.android.gms.common.internal.t.g(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public String M1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        y6.c.E(parcel, 2, M1(), false);
        y6.c.b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
