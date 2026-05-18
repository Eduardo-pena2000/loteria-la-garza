package com.google.firebase.auth;

import J7.A;
import K7.Q;
import K7.i0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j extends Q {
    public final /* synthetic */ A a;
    public final /* synthetic */ J7.j b;
    public final /* synthetic */ FirebaseAuth c;

    public j(FirebaseAuth firebaseAuth, A a, J7.j jVar) {
        this.a = a;
        this.b = jVar;
        Objects.requireNonNull(firebaseAuth);
        this.c = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        FirebaseAuth firebaseAuth = this.c;
        return firebaseAuth.e.zza(FirebaseAuth.I(firebaseAuth), this.a, (J7.h) this.b, str, (i0) new FirebaseAuth.d(this.c));
    }
}
