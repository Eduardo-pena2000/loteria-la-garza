package com.google.firebase.auth;

import J7.i0;
import L7.E;
import L7.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(E e, E e2, E e3, E e4, E e5, L7.d dVar) {
        return new K7.f((B7.g) dVar.a(B7.g.class), dVar.e(I7.a.class), dVar.e(j8.i.class), (Executor) dVar.f(e), (Executor) dVar.f(e2), (Executor) dVar.f(e3), (ScheduledExecutorService) dVar.f(e4), (Executor) dVar.f(e5));
    }

    @Keep
    public List getComponents() {
        E a = E.a(H7.a.class, Executor.class);
        E a2 = E.a(H7.b.class, Executor.class);
        E a3 = E.a(H7.c.class, Executor.class);
        E a4 = E.a(H7.c.class, ScheduledExecutorService.class);
        E a5 = E.a(H7.d.class, Executor.class);
        return Arrays.asList(new L7.c[]{L7.c.f(FirebaseAuth.class, K7.a.class).b(q.l(B7.g.class)).b(q.n(j8.i.class)).b(q.k(a)).b(q.k(a2)).b(q.k(a3)).b(q.k(a4)).b(q.k(a5)).b(q.j(I7.a.class)).f(new i0(a, a2, a3, a4, a5)).d(), j8.h.a(), v8.h.b("fire-auth", "24.0.1")});
    }
}
