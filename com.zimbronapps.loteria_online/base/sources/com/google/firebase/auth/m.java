package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class m implements Runnable {
    public final /* synthetic */ FirebaseAuth a;

    public m(FirebaseAuth firebaseAuth) {
        this.a = firebaseAuth;
    }

    public final void run() {
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a(this.a);
        }
    }
}
