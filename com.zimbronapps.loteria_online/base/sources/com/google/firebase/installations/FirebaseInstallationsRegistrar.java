package com.google.firebase.installations;

import H7.a;
import H7.b;
import L7.E;
import L7.c;
import L7.d;
import L7.q;
import M7.z;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j8.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m8.g;
import m8.h;
import m8.j;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ h a(d dVar) {
        return lambda$getComponents$0(dVar);
    }

    private static /* synthetic */ h lambda$getComponents$0(d dVar) {
        return new g((B7.g) dVar.a(B7.g.class), dVar.e(i.class), (ExecutorService) dVar.f(E.a(a.class, ExecutorService.class)), z.b((Executor) dVar.f(E.a(b.class, Executor.class))));
    }

    public List getComponents() {
        return Arrays.asList(new c[]{c.e(h.class).h("fire-installations").b(q.l(B7.g.class)).b(q.j(i.class)).b(q.k(E.a(a.class, ExecutorService.class))).b(q.k(E.a(b.class, Executor.class))).f(new j()).d(), j8.h.a(), v8.h.b("fire-installations", "19.0.1")});
    }
}
