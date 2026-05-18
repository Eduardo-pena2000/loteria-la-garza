package com.google.firebase.auth;

import J7.O;
import com.google.android.gms.common.internal.t;
import com.google.firebase.auth.b;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h extends b.b {
    public final /* synthetic */ b.b a;
    public final /* synthetic */ FirebaseAuth b;

    public h(FirebaseAuth firebaseAuth, b.b bVar) {
        this.a = bVar;
        Objects.requireNonNull(firebaseAuth);
        this.b = firebaseAuth;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    public final void onCodeSent(String str, b.a aVar) {
        this.a.onVerificationCompleted(b.a(str, (String) t.l(FirebaseAuth.r0(this.b).e())));
    }

    public final void onVerificationCompleted(O o) {
        this.a.onVerificationCompleted(o);
    }

    public final void onVerificationFailed(B7.m mVar) {
        this.a.onVerificationFailed(mVar);
    }
}
