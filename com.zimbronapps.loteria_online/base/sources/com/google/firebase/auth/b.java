package com.google.firebase.auth;

import J7.O;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class b {

    public static class a extends y6.a {
        public static final Parcelable.Creator CREATOR = new d();

        public static a M1() {
            return new a();
        }

        public void writeToParcel(Parcel parcel, int i) {
            y6.c.b(parcel, y6.c.a(parcel));
        }
    }

    public static abstract class b {
        private static final A6.a zza = new A6.a("PhoneAuthProvider", new String[0]);

        public abstract void onCodeAutoRetrievalTimeOut(String str);

        public abstract void onCodeSent(String str, a aVar);

        public abstract void onVerificationCompleted(O o);

        public abstract void onVerificationFailed(B7.m mVar);
    }

    public static O a(String str, String str2) {
        return O.Q1(str, str2);
    }

    public static void b(com.google.firebase.auth.a aVar) {
        t.l(aVar);
        FirebaseAuth.j0(aVar);
    }
}
