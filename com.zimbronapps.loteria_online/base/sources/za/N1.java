package za;

import Ca.s;
import android.webkit.PermissionRequest;
import da.a;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class n1 {
    public static final a b = new a(null);
    public final P a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(n1 n1Var, Object obj, a.e eVar) {
            d(n1Var, obj, eVar);
        }

        public static /* synthetic */ void b(n1 n1Var, Object obj, a.e eVar) {
            e(n1Var, obj, eVar);
        }

        public static final void d(n1 n1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.PermissionRequest");
            PermissionRequest permissionRequest = (PermissionRequest) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            try {
                n1Var.d(permissionRequest, (List) obj3);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void e(n1 n1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.PermissionRequest");
            try {
                n1Var.b((PermissionRequest) obj2);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final void c(da.b binaryMessenger, n1 n1Var) {
            da.h bVar;
            P c;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            if (n1Var == null || (c = n1Var.c()) == null || (bVar = c.b()) == null) {
                bVar = new b();
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", bVar);
            if (n1Var != null) {
                aVar.e(new l1(n1Var));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", bVar);
            if (n1Var != null) {
                aVar2.e(new m1(n1Var));
            } else {
                aVar2.e(null);
            }
        }

        public a() {
        }
    }

    public n1(P pigeonRegistrar) {
        kotlin.jvm.internal.t.g(pigeonRegistrar, "pigeonRegistrar");
        this.a = pigeonRegistrar;
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        f(lVar, str, obj);
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

    public abstract void b(PermissionRequest permissionRequest);

    public P c() {
        return this.a;
    }

    public abstract void d(PermissionRequest permissionRequest, List list);

    public final void e(PermissionRequest pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (c().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (c().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            long c = c().d().c(pigeon_instanceArg);
            new da.a(c().a(), "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", c().b()).d(Da.v.q(Long.valueOf(c), g(pigeon_instanceArg)), new k1(callback, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance"));
        }
    }

    public abstract List g(PermissionRequest permissionRequest);
}
