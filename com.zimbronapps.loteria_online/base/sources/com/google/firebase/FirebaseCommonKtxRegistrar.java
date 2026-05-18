package com.google.firebase;

import Da.v;
import L7.E;
import L7.g;
import L7.q;
import androidx.annotation.Keep;
import cb.K;
import cb.t0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.t;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements g {
        public static final a a = new a();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(L7.d dVar) {
            Object f = dVar.f(E.a(H7.a.class, Executor.class));
            t.f(f, "get(...)");
            return t0.b((Executor) f);
        }
    }

    public static final class b implements g {
        public static final b a = new b();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(L7.d dVar) {
            Object f = dVar.f(E.a(H7.c.class, Executor.class));
            t.f(f, "get(...)");
            return t0.b((Executor) f);
        }
    }

    public static final class c implements g {
        public static final c a = new c();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(L7.d dVar) {
            Object f = dVar.f(E.a(H7.b.class, Executor.class));
            t.f(f, "get(...)");
            return t0.b((Executor) f);
        }
    }

    public static final class d implements g {
        public static final d a = new d();

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final K a(L7.d dVar) {
            Object f = dVar.f(E.a(H7.d.class, Executor.class));
            t.f(f, "get(...)");
            return t0.b((Executor) f);
        }
    }

    public List getComponents() {
        L7.c d2 = L7.c.c(E.a(H7.a.class, K.class)).b(q.k(E.a(H7.a.class, Executor.class))).f(a.a).d();
        t.f(d2, "build(...)");
        L7.c d3 = L7.c.c(E.a(H7.c.class, K.class)).b(q.k(E.a(H7.c.class, Executor.class))).f(b.a).d();
        t.f(d3, "build(...)");
        L7.c d4 = L7.c.c(E.a(H7.b.class, K.class)).b(q.k(E.a(H7.b.class, Executor.class))).f(c.a).d();
        t.f(d4, "build(...)");
        L7.c d5 = L7.c.c(E.a(H7.d.class, K.class)).b(q.k(E.a(H7.d.class, Executor.class))).f(d.a).d();
        t.f(d5, "build(...)");
        return v.q(new L7.c[]{d2, d3, d4, d5});
    }
}
