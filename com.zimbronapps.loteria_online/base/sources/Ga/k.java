package Ga;

import Ca.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class k implements e, Ia.e {
    public static final a b = new a(null);
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");
    public final e a;
    private volatile Object result;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public k(e delegate, Object obj) {
        t.g(delegate, "delegate");
        this.a = delegate;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        Ha.a aVar = Ha.a.b;
        if (obj == aVar) {
            if (s1.b.a(c, this, aVar, Ha.c.f())) {
                return Ha.c.f();
            }
            obj = this.result;
        }
        if (obj == Ha.a.c) {
            return Ha.c.f();
        }
        if (obj instanceof s.b) {
            throw ((s.b) obj).a;
        }
        return obj;
    }

    public Ia.e getCallerFrame() {
        e eVar = this.a;
        if (eVar instanceof Ia.e) {
            return (Ia.e) eVar;
        }
        return null;
    }

    public i getContext() {
        return this.a.getContext();
    }

    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            Ha.a aVar = Ha.a.b;
            if (obj2 == aVar) {
                if (s1.b.a(c, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != Ha.c.f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (s1.b.a(c, this, Ha.c.f(), Ha.a.c)) {
                    this.a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(e delegate) {
        this(delegate, Ha.a.b);
        t.g(delegate, "delegate");
    }
}
