package com.google.android.gms.drive;

import H6.M;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class UserMetadata extends a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new M();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public UserMetadata(String str, String str2, String str3, boolean z, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public String toString() {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d), this.e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.E(parcel, 2, this.a, false);
        c.E(parcel, 3, this.b, false);
        c.E(parcel, 4, this.c, false);
        c.g(parcel, 5, this.d);
        c.E(parcel, 6, this.e, false);
        c.b(parcel, a);
    }
}
