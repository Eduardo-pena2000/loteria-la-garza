package com.google.firebase.auth;

import J7.A;
import K7.Q;
import K7.i0;
import K7.s0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c extends Q {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ A b;
    public final /* synthetic */ J7.j c;
    public final /* synthetic */ FirebaseAuth d;

    public c(FirebaseAuth firebaseAuth, boolean z, A a, J7.j jVar) {
        this.a = z;
        this.b = a;
        this.c = jVar;
        Objects.requireNonNull(firebaseAuth);
        this.d = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (this.a) {
            FirebaseAuth firebaseAuth = this.d;
            return firebaseAuth.e.zzb(FirebaseAuth.I(firebaseAuth), (A) t.l(this.b), this.c, str, (i0) new FirebaseAuth.d(this.d));
        }
        FirebaseAuth firebaseAuth2 = this.d;
        return firebaseAuth2.e.zza(FirebaseAuth.I(firebaseAuth2), this.c, str, (s0) new FirebaseAuth.c(this.d));
    }
}
