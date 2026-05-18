package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import p6.b;
import p6.w;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new w();
    public final String a;
    public final GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.a = t.f(str);
        this.b = googleSignInOptions;
    }

    public final GoogleSignInOptions M1() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions = this.b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.a).a(this.b).b();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = c.a(parcel);
        c.E(parcel, 2, str, false);
        c.C(parcel, 5, this.b, i, false);
        c.b(parcel, a);
    }
}
