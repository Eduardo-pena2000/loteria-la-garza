package za;

import Ca.s;
import android.webkit.GeolocationPermissions;
import da.a;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b1 {
    public static final a b = new a(null);
    public final P a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(b1 b1Var, Object obj, a.e eVar) {
            c(b1Var, obj, eVar);
        }

        public static final void c(b1 b1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.t.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            Object obj5 = list.get(3);
            kotlin.jvm.internal.t.e(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                b1Var.c(callback, str, booleanValue, ((Boolean) obj5).booleanValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final void b(da.b binaryMessenger, b1 b1Var) {
            da.h bVar;
            P b;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            if (b1Var == null || (b = b1Var.b()) == null || (bVar = b.b()) == null) {
                bVar = new b();
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", bVar);
            if (b1Var != null) {
                aVar.e(new a1(b1Var));
            } else {
                aVar.e(null);
            }
        }

        public a() {
        }
    }

    public b1(P pigeonRegistrar) {
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

    public P b() {
        return this.a;
    }

    public abstract void c(GeolocationPermissions.Callback callback, String str, boolean z, boolean z2);

    public final void d(GeolocationPermissions.Callback pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (b().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            new da.a(b().a(), "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", b().b()).d(Da.u.e(Long.valueOf(b().d().c(pigeon_instanceArg))), new Z0(callback, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance"));
        }
    }
}
