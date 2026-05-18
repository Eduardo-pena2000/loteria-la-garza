package com.unity3d.services.core.extensions;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.P;
import cb.W;
import cb.i;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.r;
import lb.a;
import lb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap deferreds = new CoroutineExtensionsKt$deferreds$1();
    private static final a mutex = g.b(false, 1, null);

    @f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ Qa.l $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Object obj, Qa.l lVar, e eVar) {
            super(2, eVar);
            this.$key = obj;
            this.$action = lVar;
        }

        public final e create(Object obj, e eVar) {
            2 r0 = new 2(this.$key, this.$action, eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            O o;
            a mutex;
            Qa.l lVar;
            Object obj2;
            Object f = c.f();
            int i = this.label;
            try {
                if (i == 0) {
                    t.b(obj);
                    o = (O) this.L$0;
                    mutex = CoroutineExtensionsKt.getMutex();
                    Object obj3 = this.$key;
                    lVar = this.$action;
                    this.L$0 = o;
                    this.L$1 = mutex;
                    this.L$2 = obj3;
                    this.L$3 = lVar;
                    this.label = 1;
                    if (mutex.d(null, this) == f) {
                        return f;
                    }
                    obj2 = obj3;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            t.b(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = (Qa.l) this.L$3;
                    obj2 = this.L$2;
                    mutex = (a) this.L$1;
                    o = (O) this.L$0;
                    t.b(obj);
                }
                LinkedHashMap deferreds = CoroutineExtensionsKt.getDeferreds();
                Object obj4 = deferreds.get(obj2);
                if (obj4 == null) {
                    obj4 = i.b(o, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, obj4);
                }
                W w = (W) obj4;
                mutex.e(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = w.await(this);
                return obj == f ? f : obj;
            } catch (Throwable th) {
                mutex.e(null);
                throw th;
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            O o = (O) this.L$0;
            a mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            Qa.l lVar = this.$action;
            r.c(0);
            mutex.d(null, this);
            r.c(1);
            try {
                LinkedHashMap deferreds = CoroutineExtensionsKt.getDeferreds();
                Object obj3 = deferreds.get(obj2);
                if (obj3 == null) {
                    obj3 = i.b(o, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(lVar, null), 3, null);
                    deferreds.put(obj2, obj3);
                }
                W w = (W) obj3;
                mutex.e(null);
                r.c(0);
                Object await = w.await(this);
                r.c(1);
                return await;
            } catch (Throwable th) {
                mutex.e(null);
                throw th;
            }
        }
    }

    public static final LinkedHashMap getDeferreds() {
        return deferreds;
    }

    public static final a getMutex() {
        return mutex;
    }

    public static final Object memoize(Object obj, Qa.l lVar, e eVar) {
        return P.e(new 2(obj, lVar, null), eVar);
    }

    private static final Object memoize$$forInline(Object obj, Qa.l lVar, e eVar) {
        2 r0 = new 2(obj, lVar, null);
        r.c(0);
        Object e = P.e(r0, eVar);
        r.c(1);
        return e;
    }

    public static final Object runReturnSuspendCatching(Qa.a block) {
        Object b;
        kotlin.jvm.internal.t.g(block, "block");
        try {
            s.a aVar = s.b;
            b = s.b(block.invoke());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(t.a(th));
        }
        if (s.h(b)) {
            return s.b(b);
        }
        Throwable e2 = s.e(b);
        return e2 != null ? s.b(t.a(e2)) : b;
    }

    public static final Object runSuspendCatching(Qa.a block) {
        kotlin.jvm.internal.t.g(block, "block");
        try {
            s.a aVar = s.b;
            return s.b(block.invoke());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            return s.b(t.a(th));
        }
    }
}
