package com.google.firebase.messaging;

import B7.g;
import L7.E;
import L7.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j8.j;
import java.util.Arrays;
import java.util.List;
import m8.h;
import s8.D;
import v8.i;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(E e, L7.d dVar) {
        return lambda$getComponents$0(e, dVar);
    }

    private static /* synthetic */ FirebaseMessaging lambda$getComponents$0(E e, L7.d dVar) {
        g gVar = (g) dVar.a(g.class);
        android.support.v4.media.session.b.a(dVar.a(k8.a.class));
        return new FirebaseMessaging(gVar, null, dVar.e(i.class), dVar.e(j.class), (h) dVar.a(h.class), dVar.b(e), (i8.d) dVar.a(i8.d.class));
    }

    @Keep
    public List getComponents() {
        E a = E.a(c8.b.class, w5.j.class);
        return Arrays.asList(new L7.c[]{L7.c.e(FirebaseMessaging.class).h("fire-fcm").b(q.l(g.class)).b(q.h(k8.a.class)).b(q.j(i.class)).b(q.j(j.class)).b(q.l(h.class)).b(q.i(a)).b(q.l(i8.d.class)).f(new D(a)).c().d(), v8.h.b("fire-fcm", "25.0.1")});
    }
}
