package za;

import Ca.s;
import android.webkit.HttpAuthHandler;
import da.a;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class g1 {
    public static final a b = new a(null);
    public final P a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(g1 g1Var, Object obj, a.e eVar) {
            g(g1Var, obj, eVar);
        }

        public static /* synthetic */ void b(g1 g1Var, Object obj, a.e eVar) {
            e(g1Var, obj, eVar);
        }

        public static /* synthetic */ void c(g1 g1Var, Object obj, a.e eVar) {
            f(g1Var, obj, eVar);
        }

        public static final void e(g1 g1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
            try {
                b = Da.u.e(Boolean.valueOf(g1Var.g((HttpAuthHandler) obj2)));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void f(g1 g1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
            try {
                g1Var.b((HttpAuthHandler) obj2);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void g(g1 g1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.t.e(obj4, "null cannot be cast to non-null type kotlin.String");
            try {
                g1Var.f(httpAuthHandler, str, (String) obj4);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final void d(da.b binaryMessenger, g1 g1Var) {
            da.h bVar;
            P c;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            if (g1Var == null || (c = g1Var.c()) == null || (bVar = c.b()) == null) {
                bVar = new b();
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", bVar);
            if (g1Var != null) {
                aVar.e(new d1(g1Var));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", bVar);
            if (g1Var != null) {
                aVar2.e(new e1(g1Var));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", bVar);
            if (g1Var != null) {
                aVar3.e(new f1(g1Var));
            } else {
                aVar3.e(null);
            }
        }

        public a() {
        }
    }

    public g1(P pigeonRegistrar) {
        kotlin.jvm.internal.t.g(pigeonRegistrar, "pigeonRegistrar");
        this.a = pigeonRegistrar;
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        e(lVar, str, obj);
    }

    public static final void e(Qa.l lVar, String str, Object obj) {
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

    public abstract void b(HttpAuthHandler httpAuthHandler);

    public P c() {
        return this.a;
    }

    public final void d(HttpAuthHandler pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (c().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (c().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            new da.a(c().a(), "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", c().b()).d(Da.u.e(Long.valueOf(c().d().c(pigeon_instanceArg))), new c1(callback, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance"));
        }
    }

    public abstract void f(HttpAuthHandler httpAuthHandler, String str, String str2);

    public abstract boolean g(HttpAuthHandler httpAuthHandler);
}
