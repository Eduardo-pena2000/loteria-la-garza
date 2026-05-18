package za;

import Ca.s;
import android.os.Message;
import da.a;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class u0 {
    public static final a b = new a(null);
    public final P a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(u0 u0Var, Object obj, a.e eVar) {
            c(u0Var, obj, eVar);
        }

        public static final void c(u0 u0Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.os.Message");
            try {
                u0Var.e((Message) obj2);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final void b(da.b binaryMessenger, u0 u0Var) {
            da.h bVar;
            P b;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            if (u0Var == null || (b = u0Var.b()) == null || (bVar = b.b()) == null) {
                bVar = new b();
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", bVar);
            if (u0Var != null) {
                aVar.e(new t0(u0Var));
            } else {
                aVar.e(null);
            }
        }

        public a() {
        }
    }

    public u0(P pigeonRegistrar) {
        kotlin.jvm.internal.t.g(pigeonRegistrar, "pigeonRegistrar");
        this.a = pigeonRegistrar;
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        d(lVar, str, obj);
    }

    public static final void d(Qa.l lVar, String str, Object obj) {
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

    public final void c(Message pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (b().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            new da.a(b().a(), "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", b().b()).d(Da.u.e(Long.valueOf(b().d().c(pigeon_instanceArg))), new s0(callback, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance"));
        }
    }

    public abstract void e(Message message);
}
