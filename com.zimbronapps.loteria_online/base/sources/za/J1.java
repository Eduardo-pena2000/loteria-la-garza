package za;

import Ca.s;
import da.a;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j1 {
    public static final a b = new a(null);
    public final P a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(j1 j1Var, Object obj, a.e eVar) {
            c(j1Var, obj, eVar);
        }

        public static final void c(j1 j1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj2).longValue();
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                j1Var.b().d().b(j1Var.c((String) obj3), longValue);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final void b(da.b binaryMessenger, j1 j1Var) {
            da.h bVar;
            P b;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            if (j1Var == null || (b = j1Var.b()) == null || (bVar = b.b()) == null) {
                bVar = new b();
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", bVar);
            if (j1Var != null) {
                aVar.e(new i1(j1Var));
            } else {
                aVar.e(null);
            }
        }

        public a() {
        }
    }

    public j1(P pigeonRegistrar) {
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

    public P b() {
        return this.a;
    }

    public abstract m0 c(String str);

    public final void d(m0 pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (b().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            s.a aVar3 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", "")))));
        }
    }

    public final void e(m0 pigeon_instanceArg, String messageArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(messageArg, "messageArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (b().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(pigeon_instanceArg)) {
            new da.a(b().a(), "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage", b().b()).d(Da.v.q(pigeon_instanceArg, messageArg), new h1(callback, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `JavaScriptChannel.postMessage` failed because native instance was not in the instance manager.", "")))));
        }
    }
}
