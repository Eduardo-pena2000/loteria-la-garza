package com.google.firebase.auth;

import J7.O;
import K7.q0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.firebase-auth-api.zzaen;
import com.google.firebase.auth.b;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g extends b.b {
    public final /* synthetic */ a a;
    public final /* synthetic */ q0 b;
    public final /* synthetic */ b.b c;
    public final /* synthetic */ FirebaseAuth d;

    public g(FirebaseAuth firebaseAuth, a aVar, q0 q0Var, b.b bVar) {
        this.a = aVar;
        this.b = q0Var;
        this.c = bVar;
        Objects.requireNonNull(firebaseAuth);
        this.d = firebaseAuth;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.c.onCodeAutoRetrievalTimeOut(str);
    }

    public final void onCodeSent(String str, b.a aVar) {
        this.c.onCodeSent(str, aVar);
    }

    public final void onVerificationCompleted(O o) {
        this.c.onVerificationCompleted(o);
    }

    public final void onVerificationFailed(B7.m mVar) {
        if (zzaen.zza(mVar)) {
            this.a.b(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + this.a.j());
            FirebaseAuth.j0(this.a);
            return;
        }
        if (TextUtils.isEmpty(this.b.c())) {
            Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.a.j() + ", error - " + mVar.getMessage());
            this.c.onVerificationFailed(mVar);
            return;
        }
        if (zzaen.zzb(mVar) && this.d.m0().d("PHONE_PROVIDER") && TextUtils.isEmpty(this.b.b())) {
            this.a.d(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + this.a.j());
            FirebaseAuth.j0(this.a);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + this.a.j() + ", error - " + mVar.getMessage());
        this.c.onVerificationFailed(mVar);
    }
}
