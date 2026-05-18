package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import l6.v;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class ClearTokenRequest extends y6.a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new v();
    public final String a;
    public final String b;

    public static abstract class a {
        public abstract ClearTokenRequest a();

        public abstract a b(String str);

        public abstract a c(String str);
    }

    public ClearTokenRequest(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static a M1() {
        return new com.google.android.gms.auth.api.identity.a();
    }

    public String N1() {
        return this.a;
    }

    public final String O1() {
        return this.b;
    }

    public final a P1() {
        return new com.google.android.gms.auth.api.identity.a(this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClearTokenRequest) {
            ClearTokenRequest clearTokenRequest = (ClearTokenRequest) obj;
            if (r.b(this.a, clearTokenRequest.a) && r.b(this.b, clearTokenRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return r.c(this.a, this.b);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.E(parcel, 1, N1(), false);
        c.E(parcel, 2, this.b, false);
        c.b(parcel, a2);
    }
}
