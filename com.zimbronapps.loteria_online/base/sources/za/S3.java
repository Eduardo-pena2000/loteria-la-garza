package za;

import Ca.s;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import da.a;
import java.util.List;
import java.util.Map;
import za.b4;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class s3 {
    public static final a b = new a(null);
    public final P a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static final void A(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.t.e(obj4, "null cannot be cast to non-null type kotlin.ByteArray");
            try {
                s3Var.v(webView, str, (byte[]) obj4);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void B(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                b = Da.u.e(s3Var.k((WebView) obj2));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void C(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                b = Da.u.e(Boolean.valueOf(s3Var.d((WebView) obj2)));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void D(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                b = Da.u.e(Boolean.valueOf(s3Var.e((WebView) obj2)));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void E(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                s3Var.l((WebView) obj2);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void F(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                s3Var.m((WebView) obj2);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void G(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                s3Var.w((WebView) obj2);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void H(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                s3Var.f(webView, ((Boolean) obj3).booleanValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void I(s3 s3Var, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            s3Var.h((WebView) obj2, (String) obj3, new j3(reply));
        }

        public static final Ca.I J(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Q.a.b(e));
            } else {
                Object j = sVar.j();
                if (Ca.s.g(j)) {
                    j = null;
                }
                eVar.a(Q.a.c((String) j));
            }
            return Ca.I.a;
        }

        public static final void K(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                s3Var.i().d().b(s3Var.D(webView), ((Long) obj3).longValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void L(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                b = Da.u.e(s3Var.j((WebView) obj2));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void M(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                s3Var.B(((Boolean) obj2).booleanValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void N(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                s3Var.C((WebView) obj2, (WebViewClient) list.get(1));
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void O(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
            try {
                s3Var.c(webView, (m0) obj3);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void P(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                s3Var.x(webView, (String) obj3);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void Q(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                s3Var.z((WebView) obj2, (DownloadListener) list.get(1));
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void R(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                s3Var.A((WebView) obj2, (b4.b) list.get(1));
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void S(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                s3Var.y(webView, ((Long) obj3).longValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void T(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                s3Var.g((WebView) obj2);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void U(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                s3Var.n(webView, (String) obj3, (String) list.get(2), (String) list.get(3));
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void V(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            String str = (String) list.get(1);
            Object obj3 = list.get(2);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                s3Var.o(webView, str, (String) obj3, (String) list.get(3), (String) list.get(4), (String) list.get(5));
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void W(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.t.e(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            try {
                s3Var.p(webView, str, (Map) obj4);
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static /* synthetic */ void a(s3 s3Var, Object obj, a.e eVar) {
            N(s3Var, obj, eVar);
        }

        public static /* synthetic */ void b(s3 s3Var, Object obj, a.e eVar) {
            C(s3Var, obj, eVar);
        }

        public static /* synthetic */ void c(s3 s3Var, Object obj, a.e eVar) {
            z(s3Var, obj, eVar);
        }

        public static /* synthetic */ void d(s3 s3Var, Object obj, a.e eVar) {
            K(s3Var, obj, eVar);
        }

        public static /* synthetic */ void e(s3 s3Var, Object obj, a.e eVar) {
            U(s3Var, obj, eVar);
        }

        public static /* synthetic */ void f(s3 s3Var, Object obj, a.e eVar) {
            S(s3Var, obj, eVar);
        }

        public static /* synthetic */ void g(s3 s3Var, Object obj, a.e eVar) {
            D(s3Var, obj, eVar);
        }

        public static /* synthetic */ void h(s3 s3Var, Object obj, a.e eVar) {
            A(s3Var, obj, eVar);
        }

        public static /* synthetic */ void i(s3 s3Var, Object obj, a.e eVar) {
            P(s3Var, obj, eVar);
        }

        public static /* synthetic */ void j(s3 s3Var, Object obj, a.e eVar) {
            T(s3Var, obj, eVar);
        }

        public static /* synthetic */ void k(s3 s3Var, Object obj, a.e eVar) {
            B(s3Var, obj, eVar);
        }

        public static /* synthetic */ void l(s3 s3Var, Object obj, a.e eVar) {
            R(s3Var, obj, eVar);
        }

        public static /* synthetic */ void m(s3 s3Var, Object obj, a.e eVar) {
            F(s3Var, obj, eVar);
        }

        public static /* synthetic */ void n(s3 s3Var, Object obj, a.e eVar) {
            O(s3Var, obj, eVar);
        }

        public static /* synthetic */ void o(s3 s3Var, Object obj, a.e eVar) {
            I(s3Var, obj, eVar);
        }

        public static /* synthetic */ void p(s3 s3Var, Object obj, a.e eVar) {
            M(s3Var, obj, eVar);
        }

        public static /* synthetic */ void q(s3 s3Var, Object obj, a.e eVar) {
            W(s3Var, obj, eVar);
        }

        public static /* synthetic */ void r(s3 s3Var, Object obj, a.e eVar) {
            L(s3Var, obj, eVar);
        }

        public static /* synthetic */ Ca.I s(a.e eVar, Ca.s sVar) {
            return J(eVar, sVar);
        }

        public static /* synthetic */ void t(s3 s3Var, Object obj, a.e eVar) {
            Q(s3Var, obj, eVar);
        }

        public static /* synthetic */ void u(s3 s3Var, Object obj, a.e eVar) {
            E(s3Var, obj, eVar);
        }

        public static /* synthetic */ void v(s3 s3Var, Object obj, a.e eVar) {
            V(s3Var, obj, eVar);
        }

        public static /* synthetic */ void w(s3 s3Var, Object obj, a.e eVar) {
            G(s3Var, obj, eVar);
        }

        public static /* synthetic */ void x(s3 s3Var, Object obj, a.e eVar) {
            H(s3Var, obj, eVar);
        }

        public static final void z(s3 s3Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                s3Var.i().d().b(s3Var.s(), ((Long) obj2).longValue());
                b = Da.u.e(null);
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final void y(da.b binaryMessenger, s3 s3Var) {
            da.h bVar;
            P i;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            if (s3Var == null || (i = s3Var.i()) == null || (bVar = i.b()) == null) {
                bVar = new b();
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", bVar);
            if (s3Var != null) {
                aVar.e(new U2(s3Var));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", bVar);
            if (s3Var != null) {
                aVar2.e(new W2(s3Var));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", bVar);
            if (s3Var != null) {
                aVar3.e(new a3(s3Var));
            } else {
                aVar3.e(null);
            }
            da.a aVar4 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", bVar);
            if (s3Var != null) {
                aVar4.e(new b3(s3Var));
            } else {
                aVar4.e(null);
            }
            da.a aVar5 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", bVar);
            if (s3Var != null) {
                aVar5.e(new c3(s3Var));
            } else {
                aVar5.e(null);
            }
            da.a aVar6 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", bVar);
            if (s3Var != null) {
                aVar6.e(new d3(s3Var));
            } else {
                aVar6.e(null);
            }
            da.a aVar7 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", bVar);
            if (s3Var != null) {
                aVar7.e(new e3(s3Var));
            } else {
                aVar7.e(null);
            }
            da.a aVar8 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", bVar);
            if (s3Var != null) {
                aVar8.e(new g3(s3Var));
            } else {
                aVar8.e(null);
            }
            da.a aVar9 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", bVar);
            if (s3Var != null) {
                aVar9.e(new h3(s3Var));
            } else {
                aVar9.e(null);
            }
            da.a aVar10 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", bVar);
            if (s3Var != null) {
                aVar10.e(new i3(s3Var));
            } else {
                aVar10.e(null);
            }
            da.a aVar11 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", bVar);
            if (s3Var != null) {
                aVar11.e(new f3(s3Var));
            } else {
                aVar11.e(null);
            }
            da.a aVar12 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", bVar);
            if (s3Var != null) {
                aVar12.e(new k3(s3Var));
            } else {
                aVar12.e(null);
            }
            da.a aVar13 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", bVar);
            if (s3Var != null) {
                aVar13.e(new l3(s3Var));
            } else {
                aVar13.e(null);
            }
            da.a aVar14 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", bVar);
            if (s3Var != null) {
                aVar14.e(new m3(s3Var));
            } else {
                aVar14.e(null);
            }
            da.a aVar15 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", bVar);
            if (s3Var != null) {
                aVar15.e(new n3(s3Var));
            } else {
                aVar15.e(null);
            }
            da.a aVar16 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", bVar);
            if (s3Var != null) {
                aVar16.e(new o3(s3Var));
            } else {
                aVar16.e(null);
            }
            da.a aVar17 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", bVar);
            if (s3Var != null) {
                aVar17.e(new p3(s3Var));
            } else {
                aVar17.e(null);
            }
            da.a aVar18 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", bVar);
            if (s3Var != null) {
                aVar18.e(new q3(s3Var));
            } else {
                aVar18.e(null);
            }
            da.a aVar19 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", bVar);
            if (s3Var != null) {
                aVar19.e(new r3(s3Var));
            } else {
                aVar19.e(null);
            }
            da.a aVar20 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", bVar);
            if (s3Var != null) {
                aVar20.e(new V2(s3Var));
            } else {
                aVar20.e(null);
            }
            da.a aVar21 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", bVar);
            if (s3Var != null) {
                aVar21.e(new X2(s3Var));
            } else {
                aVar21.e(null);
            }
            da.a aVar22 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", bVar);
            if (s3Var != null) {
                aVar22.e(new Y2(s3Var));
            } else {
                aVar22.e(null);
            }
            da.a aVar23 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", bVar);
            if (s3Var != null) {
                aVar23.e(new Z2(s3Var));
            } else {
                aVar23.e(null);
            }
        }

        public a() {
        }
    }

    public s3(P pigeonRegistrar) {
        kotlin.jvm.internal.t.g(pigeonRegistrar, "pigeonRegistrar");
        this.a = pigeonRegistrar;
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        r(lVar, str, obj);
    }

    public static /* synthetic */ void b(Qa.l lVar, String str, Object obj) {
        u(lVar, str, obj);
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

    public static final void u(Qa.l lVar, String str, Object obj) {
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

    public abstract void A(WebView webView, b4.b bVar);

    public abstract void B(boolean z);

    public abstract void C(WebView webView, WebViewClient webViewClient);

    public abstract WebSettings D(WebView webView);

    public abstract void c(WebView webView, m0 m0Var);

    public abstract boolean d(WebView webView);

    public abstract boolean e(WebView webView);

    public abstract void f(WebView webView, boolean z);

    public abstract void g(WebView webView);

    public abstract void h(WebView webView, String str, Qa.l lVar);

    public P i() {
        return this.a;
    }

    public abstract String j(WebView webView);

    public abstract String k(WebView webView);

    public abstract void l(WebView webView);

    public abstract void m(WebView webView);

    public abstract void n(WebView webView, String str, String str2, String str3);

    public abstract void o(WebView webView, String str, String str2, String str3, String str4, String str5);

    public abstract void p(WebView webView, String str, Map map);

    public final void q(WebView pigeon_instanceArg, long j, long j2, long j3, long j4, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (i().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (i().d().f(pigeon_instanceArg)) {
            new da.a(i().a(), "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", i().b()).d(Da.v.q(pigeon_instanceArg, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)), new T2(callback, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged"));
        } else {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("missing-instance-error", "Callback to `WebView.onScrollChanged` failed because native instance was not in the instance manager.", "")))));
        }
    }

    public abstract WebView s();

    public final void t(WebView pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (i().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (i().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            new da.a(i().a(), "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", i().b()).d(Da.u.e(Long.valueOf(i().d().c(pigeon_instanceArg))), new S2(callback, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance"));
        }
    }

    public abstract void v(WebView webView, String str, byte[] bArr);

    public abstract void w(WebView webView);

    public abstract void x(WebView webView, String str);

    public abstract void y(WebView webView, long j);

    public abstract void z(WebView webView, DownloadListener downloadListener);
}
