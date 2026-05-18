package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class l implements Runnable {
    public final /* synthetic */ FirebaseAuth a;
    public final /* synthetic */ q8.b b;

    public l(FirebaseAuth firebaseAuth, q8.b bVar) {
        this.a = firebaseAuth;
        this.b = bVar;
    }

    public final void run() {
        Iterator it = this.a.d.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Iterator it2 = this.a.b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a(this.a);
        }
    }
}
