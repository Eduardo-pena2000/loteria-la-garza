package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import o6.i;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class SignInAccount extends y6.a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new i();
    public final String a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        this.a = t.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.c = t.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount M1() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = c.a(parcel);
        c.E(parcel, 4, str, false);
        c.C(parcel, 7, this.b, i, false);
        c.E(parcel, 8, this.c, false);
        c.b(parcel, a);
    }
}
