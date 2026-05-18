package za;

import Ca.s;
import da.a;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class i {
    public static final a b = new a(null);
    public static final Ca.l c = Ca.m.b(new e());
    public final da.b a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(d dVar, Object obj, a.e eVar) {
            e(dVar, obj, eVar);
        }

        public static /* synthetic */ void b(d dVar, Object obj, a.e eVar) {
            f(dVar, obj, eVar);
        }

        public static final void e(d dVar, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                dVar.m(((Long) obj2).longValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void f(d dVar, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            try {
                dVar.e();
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final da.h c() {
            return (da.h) i.c().getValue();
        }

        public final void d(da.b binaryMessenger, d dVar) {
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", c());
            if (dVar != null) {
                aVar.e(new g(dVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", c());
            if (dVar != null) {
                aVar2.e(new h(dVar));
            } else {
                aVar2.e(null);
            }
        }

        public a() {
        }
    }

    public i(da.b binaryMessenger) {
        kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
        this.a = binaryMessenger;
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        f(lVar, str, obj);
    }

    public static /* synthetic */ b b() {
        return d();
    }

    public static final /* synthetic */ Ca.l c() {
        return c;
    }

    public static final b d() {
        return new b();
    }

    public static final void f(Qa.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            s.a aVar = Ca.s.b;
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(Q.a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            s.a aVar2 = Ca.s.b;
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
            return;
        }
        s.a aVar3 = Ca.s.b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    public final void e(long j, Qa.l callback) {
        kotlin.jvm.internal.t.g(callback, "callback");
        new da.a(this.a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", b.c()).d(Da.u.e(Long.valueOf(j)), new f(callback, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference"));
    }
}
