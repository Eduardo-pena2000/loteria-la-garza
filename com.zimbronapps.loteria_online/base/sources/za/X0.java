package za;

import Ca.s;
import da.a;
import java.security.cert.Certificate;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class x0 {
    public static final a b = new a(null);
    public final P a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(x0 x0Var, Object obj, a.e eVar) {
            c(x0Var, obj, eVar);
        }

        public static final void c(x0 x0Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type java.security.cert.Certificate");
            try {
                b = Da.u.e(x0Var.b((Certificate) obj2));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final void b(da.b binaryMessenger, x0 x0Var) {
            da.h bVar;
            P c;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            if (x0Var == null || (c = x0Var.c()) == null || (bVar = c.b()) == null) {
                bVar = new b();
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", bVar);
            if (x0Var != null) {
                aVar.e(new w0(x0Var));
            } else {
                aVar.e(null);
            }
        }

        public a() {
        }
    }

    public x0(P pigeonRegistrar) {
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

    public abstract byte[] b(Certificate certificate);

    public P c() {
        return this.a;
    }

    public final void d(Certificate pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (c().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (c().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            new da.a(c().a(), "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", c().b()).d(Da.u.e(Long.valueOf(c().d().c(pigeon_instanceArg))), new v0(callback, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance"));
        }
    }
}
