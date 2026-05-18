package com.google.firebase.remoteconfig;

import B7.g;
import D7.a;
import H7.b;
import L7.E;
import L7.c;
import L7.d;
import L7.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import m8.h;
import w8.A;
import w8.z;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ z a(E e, d dVar) {
        return lambda$getComponents$0(e, dVar);
    }

    private static /* synthetic */ z lambda$getComponents$0(E e, d dVar) {
        return new z((Context) dVar.a(Context.class), (ScheduledExecutorService) dVar.f(e), (g) dVar.a(g.class), (h) dVar.a(h.class), ((a) dVar.a(a.class)).b("frc"), dVar.e(F7.a.class));
    }

    public List getComponents() {
        E a = E.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList(new c[]{c.f(z.class, z8.a.class).h("fire-rc").b(q.l(Context.class)).b(q.k(a)).b(q.l(g.class)).b(q.l(h.class)).b(q.l(a.class)).b(q.j(F7.a.class)).f(new A(a)).e().d(), v8.h.b("fire-rc", "23.0.1")});
    }
}
