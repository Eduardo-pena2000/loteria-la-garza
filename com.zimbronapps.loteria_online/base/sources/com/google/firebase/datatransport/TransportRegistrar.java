package com.google.firebase.datatransport;

import L7.E;
import L7.c;
import L7.d;
import L7.q;
import android.content.Context;
import androidx.annotation.Keep;
import c8.b;
import c8.e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import v8.h;
import w5.j;
import x5.a;
import z5.u;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ j a(d dVar) {
        return lambda$getComponents$2(dVar);
    }

    public static /* synthetic */ j b(d dVar) {
        return lambda$getComponents$1(dVar);
    }

    public static /* synthetic */ j c(d dVar) {
        return lambda$getComponents$0(dVar);
    }

    private static /* synthetic */ j lambda$getComponents$0(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.h);
    }

    private static /* synthetic */ j lambda$getComponents$1(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.h);
    }

    private static /* synthetic */ j lambda$getComponents$2(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.g);
    }

    public List getComponents() {
        return Arrays.asList(new c[]{c.e(j.class).h("fire-transport").b(q.l(Context.class)).f(new c8.c()).d(), c.c(E.a(c8.a.class, j.class)).b(q.l(Context.class)).f(new c8.d()).d(), c.c(E.a(b.class, j.class)).b(q.l(Context.class)).f(new e()).d(), h.b("fire-transport", "19.0.0")});
    }
}
