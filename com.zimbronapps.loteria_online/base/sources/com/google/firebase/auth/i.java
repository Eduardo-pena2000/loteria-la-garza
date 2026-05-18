package com.google.firebase.auth;

import K7.Q;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class i extends Q {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ FirebaseAuth c;

    public i(FirebaseAuth firebaseAuth, String str, String str2) {
        this.a = str;
        this.b = str2;
        Objects.requireNonNull(firebaseAuth);
        this.c = firebaseAuth;
    }

    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Creating user with " + this.a + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + this.a);
        }
        FirebaseAuth firebaseAuth = this.c;
        return firebaseAuth.e.zza(FirebaseAuth.I(firebaseAuth), this.a, this.b, FirebaseAuth.y0(this.c), str, new FirebaseAuth.c(this.c));
    }
}
