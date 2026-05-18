package za;

import Ca.s;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import da.a;
import java.util.List;
import za.b4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class k2 {
    public static final a b = new a(null);
    public final P a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(k2 k2Var, Object obj, a.e eVar) {
            l(k2Var, obj, eVar);
        }

        public static /* synthetic */ void b(k2 k2Var, Object obj, a.e eVar) {
            m(k2Var, obj, eVar);
        }

        public static /* synthetic */ void c(k2 k2Var, Object obj, a.e eVar) {
            j(k2Var, obj, eVar);
        }

        public static /* synthetic */ void d(k2 k2Var, Object obj, a.e eVar) {
            i(k2Var, obj, eVar);
        }

        public static /* synthetic */ void e(k2 k2Var, Object obj, a.e eVar) {
            h(k2Var, obj, eVar);
        }

        public static /* synthetic */ void f(k2 k2Var, Object obj, a.e eVar) {
            k(k2Var, obj, eVar);
        }

        public static final void h(k2 k2Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                k2Var.l().d().b(k2Var.I(), ((Long) obj2).longValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void i(k2 k2Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            b4.b bVar = (b4.b) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                k2Var.N(bVar, ((Boolean) obj3).booleanValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void j(k2 k2Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            b4.b bVar = (b4.b) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                k2Var.O(bVar, ((Boolean) obj3).booleanValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void k(k2 k2Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            b4.b bVar = (b4.b) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                k2Var.K(bVar, ((Boolean) obj3).booleanValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void l(k2 k2Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            b4.b bVar = (b4.b) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                k2Var.L(bVar, ((Boolean) obj3).booleanValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void m(k2 k2Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            b4.b bVar = (b4.b) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                k2Var.M(bVar, ((Boolean) obj3).booleanValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final void g(da.b binaryMessenger, k2 k2Var) {
            da.h bVar;
            P l;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            if (k2Var == null || (l = k2Var.l()) == null || (bVar = l.b()) == null) {
                bVar = new b();
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", bVar);
            if (k2Var != null) {
                aVar.e(new e2(k2Var));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", bVar);
            if (k2Var != null) {
                aVar2.e(new f2(k2Var));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", bVar);
            if (k2Var != null) {
                aVar3.e(new g2(k2Var));
            } else {
                aVar3.e(null);
            }
            da.a aVar4 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", bVar);
            if (k2Var != null) {
                aVar4.e(new h2(k2Var));
            } else {
                aVar4.e(null);
            }
            da.a aVar5 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", bVar);
            if (k2Var != null) {
                aVar5.e(new i2(k2Var));
            } else {
                aVar5.e(null);
            }
            da.a aVar6 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", bVar);
            if (k2Var != null) {
                aVar6.e(new j2(k2Var));
            } else {
                aVar6.e(null);
            }
        }

        public a() {
        }
    }

    public k2(P pigeonRegistrar) {
        kotlin.jvm.internal.t.g(pigeonRegistrar, "pigeonRegistrar");
        this.a = pigeonRegistrar;
    }

    public static final void B(Qa.l lVar, String str, Object obj) {
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

    public static final void D(Qa.l lVar, String str, Object obj) {
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

    public static final void F(Qa.l lVar, String str, Object obj) {
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

    public static final void H(Qa.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            s.a aVar = Ca.s.b;
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(Q.a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            s.a aVar2 = Ca.s.b;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a((String) obj2, (String) obj3, (String) list.get(2))))));
            return;
        }
        if (list.get(0) == null) {
            s.a aVar3 = Ca.s.b;
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("null-error", "Flutter api returned null value for non-null return value.", "")))));
        } else {
            Object obj4 = list.get(0);
            kotlin.jvm.internal.t.e(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            lVar.invoke(Ca.s.a(Ca.s.b((List) obj4)));
        }
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        D(lVar, str, obj);
    }

    public static /* synthetic */ void b(Qa.l lVar, String str, Object obj) {
        F(lVar, str, obj);
    }

    public static /* synthetic */ void c(Qa.l lVar, String str, Object obj) {
        H(lVar, str, obj);
    }

    public static /* synthetic */ void d(Qa.l lVar, String str, Object obj) {
        x(lVar, str, obj);
    }

    public static /* synthetic */ void e(Qa.l lVar, String str, Object obj) {
        v(lVar, str, obj);
    }

    public static /* synthetic */ void f(Qa.l lVar, String str, Object obj) {
        r(lVar, str, obj);
    }

    public static /* synthetic */ void g(Qa.l lVar, String str, Object obj) {
        z(lVar, str, obj);
    }

    public static /* synthetic */ void h(Qa.l lVar, String str, Object obj) {
        B(lVar, str, obj);
    }

    public static /* synthetic */ void i(Qa.l lVar, String str, Object obj) {
        p(lVar, str, obj);
    }

    public static /* synthetic */ void j(Qa.l lVar, String str, Object obj) {
        t(lVar, str, obj);
    }

    public static /* synthetic */ void k(Qa.l lVar, String str, Object obj) {
        n(lVar, str, obj);
    }

    public static final void n(Qa.l lVar, String str, Object obj) {
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

    public static final void p(Qa.l lVar, String str, Object obj) {
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

    public static final void r(Qa.l lVar, String str, Object obj) {
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

    public static final void t(Qa.l lVar, String str, Object obj) {
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

    public static final void v(Qa.l lVar, String str, Object obj) {
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

    public static final void x(Qa.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            s.a aVar = Ca.s.b;
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(Q.a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            s.a aVar2 = Ca.s.b;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a((String) obj2, (String) obj3, (String) list.get(2))))));
            return;
        }
        if (list.get(0) == null) {
            s.a aVar3 = Ca.s.b;
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("null-error", "Flutter api returned null value for non-null return value.", "")))));
            return;
        }
        Object obj4 = list.get(0);
        kotlin.jvm.internal.t.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) obj4;
        bool.booleanValue();
        lVar.invoke(Ca.s.a(Ca.s.b(bool)));
    }

    public static final void z(Qa.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            s.a aVar = Ca.s.b;
            lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(Q.a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            lVar.invoke(Ca.s.a(Ca.s.b((String) list.get(0))));
            return;
        }
        s.a aVar2 = Ca.s.b;
        Object obj2 = list.get(0);
        kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    public final void A(b4.b pigeon_instanceArg, PermissionRequest requestArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(requestArg, "requestArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", l().b()).d(Da.v.q(pigeon_instanceArg, requestArg), new Y1(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void C(b4.b pigeon_instanceArg, WebView webViewArg, long j, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", l().b()).d(Da.v.q(pigeon_instanceArg, webViewArg, Long.valueOf(j)), new U1(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void E(b4.b pigeon_instanceArg, View viewArg, WebChromeClient.CustomViewCallback callbackArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(viewArg, "viewArg");
        kotlin.jvm.internal.t.g(callbackArg, "callbackArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", l().b()).d(Da.v.q(pigeon_instanceArg, viewArg, callbackArg), new Z1(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void G(b4.b pigeon_instanceArg, WebView webViewArg, WebChromeClient.FileChooserParams paramsArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.t.g(paramsArg, "paramsArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", l().b()).d(Da.v.q(pigeon_instanceArg, webViewArg, paramsArg), new X1(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public abstract b4.b I();

    public final void J(b4.b pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            s.a aVar3 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", "")))));
        }
    }

    public abstract void K(b4.b bVar, boolean z);

    public abstract void L(b4.b bVar, boolean z);

    public abstract void M(b4.b bVar, boolean z);

    public abstract void N(b4.b bVar, boolean z);

    public abstract void O(b4.b bVar, boolean z);

    public P l() {
        return this.a;
    }

    public final void m(b4.b pigeon_instanceArg, ConsoleMessage messageArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(messageArg, "messageArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", l().b()).d(Da.v.q(pigeon_instanceArg, messageArg), new a2(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void o(b4.b pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", l().b()).d(Da.u.e(pigeon_instanceArg), new d2(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void q(b4.b pigeon_instanceArg, String originArg, GeolocationPermissions.Callback callbackArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(originArg, "originArg");
        kotlin.jvm.internal.t.g(callbackArg, "callbackArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", l().b()).d(Da.v.q(pigeon_instanceArg, originArg, callbackArg), new b2(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void s(b4.b pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", l().b()).d(Da.u.e(pigeon_instanceArg), new T1(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void u(b4.b pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.t.g(urlArg, "urlArg");
        kotlin.jvm.internal.t.g(messageArg, "messageArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", l().b()).d(Da.v.q(pigeon_instanceArg, webViewArg, urlArg, messageArg), new W1(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void w(b4.b pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.t.g(urlArg, "urlArg");
        kotlin.jvm.internal.t.g(messageArg, "messageArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", l().b()).d(Da.v.q(pigeon_instanceArg, webViewArg, urlArg, messageArg), new c2(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public final void y(b4.b pigeon_instanceArg, WebView webViewArg, String urlArg, String messageArg, String defaultValueArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(webViewArg, "webViewArg");
        kotlin.jvm.internal.t.g(urlArg, "urlArg");
        kotlin.jvm.internal.t.g(messageArg, "messageArg");
        kotlin.jvm.internal.t.g(defaultValueArg, "defaultValueArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (l().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(pigeon_instanceArg)) {
            new da.a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", l().b()).d(Da.v.q(pigeon_instanceArg, webViewArg, urlArg, messageArg, defaultValueArg), new V1(callback, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager.", "")))));
        }
    }
}
