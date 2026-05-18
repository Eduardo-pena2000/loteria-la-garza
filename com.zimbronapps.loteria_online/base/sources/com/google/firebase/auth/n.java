package com.google.firebase.auth;

import J7.A;
import K7.Q;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class n extends Q {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ A c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ FirebaseAuth f;

    public n(FirebaseAuth firebaseAuth, String str, boolean z, A a, String str2, String str3) {
        this.a = str;
        this.b = z;
        this.c = a;
        this.d = str2;
        this.e = str3;
        Objects.requireNonNull(firebaseAuth);
        this.f = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Logging in as " + this.a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + this.a);
        }
        if (this.b) {
            FirebaseAuth firebaseAuth = this.f;
            return firebaseAuth.e.zzb(FirebaseAuth.I(firebaseAuth), (A) t.l(this.c), this.a, this.d, this.e, str, new FirebaseAuth.d(this.f));
        }
        FirebaseAuth firebaseAuth2 = this.f;
        return firebaseAuth2.e.zzb(FirebaseAuth.I(firebaseAuth2), this.a, this.d, this.e, str, new FirebaseAuth.c(this.f));
    }
}
