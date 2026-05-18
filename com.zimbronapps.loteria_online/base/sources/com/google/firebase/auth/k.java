package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class k implements Runnable {
    public final /* synthetic */ FirebaseAuth.a a;
    public final /* synthetic */ FirebaseAuth b;

    public k(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.a = aVar;
        Objects.requireNonNull(firebaseAuth);
        this.b = firebaseAuth;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
