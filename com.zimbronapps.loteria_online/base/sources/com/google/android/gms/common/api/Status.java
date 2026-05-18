package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Status extends y6.a implements m, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final v6.b d;
    public static final Status e = new Status(-1);
    public static final Status f = new Status(0);
    public static final Status g = new Status(14);
    public static final Status h = new Status(8);
    public static final Status i = new Status(15);
    public static final Status j = new Status(16);
    public static final Status k = new Status(17);
    public static final Status l = new Status(18);
    public static final Parcelable.Creator CREATOR = new z();

    public Status(int i2, String str, PendingIntent pendingIntent, v6.b bVar) {
        this.a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = bVar;
    }

    public v6.b M1() {
        return this.d;
    }

    public PendingIntent N1() {
        return this.c;
    }

    public int O1() {
        return this.a;
    }

    public String P1() {
        return this.b;
    }

    public boolean Q1() {
        return this.c != null;
    }

    public boolean R1() {
        return this.a <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && com.google.android.gms.common.internal.r.b(this.b, status.b) && com.google.android.gms.common.internal.r.b(this.c, status.c) && com.google.android.gms.common.internal.r.b(this.d, status.d);
    }

    public Status getStatus() {
        return this;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public String toString() {
        r.a d = com.google.android.gms.common.internal.r.d(this);
        d.a("statusCode", zza());
        d.a("resolution", this.c);
        return d.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, O1());
        y6.c.E(parcel, 2, P1(), false);
        y6.c.C(parcel, 3, this.c, i2, false);
        y6.c.C(parcel, 4, M1(), i2, false);
        y6.c.b(parcel, a);
    }

    public final String zza() {
        String str = this.b;
        return str != null ? str : d.a(this.a);
    }

    public Status(int i2) {
        this(i2, (String) null);
    }

    public Status(v6.b bVar, String str) {
        this(bVar, str, 17);
    }

    public Status(int i2, String str) {
        this(i2, str, (PendingIntent) null);
    }

    public Status(v6.b bVar, String str, int i2) {
        this(i2, str, bVar.P1(), bVar);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(i2, str, pendingIntent, null);
    }
}
