package za;

import Ca.s;
import android.net.http.SslCertificate;
import da.a;
import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class w1 {
    public static final a b = new a(null);
    public final P a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a(w1 w1Var, Object obj, a.e eVar) {
            k(w1Var, obj, eVar);
        }

        public static /* synthetic */ void b(w1 w1Var, Object obj, a.e eVar) {
            i(w1Var, obj, eVar);
        }

        public static /* synthetic */ void c(w1 w1Var, Object obj, a.e eVar) {
            g(w1Var, obj, eVar);
        }

        public static /* synthetic */ void d(w1 w1Var, Object obj, a.e eVar) {
            j(w1Var, obj, eVar);
        }

        public static /* synthetic */ void e(w1 w1Var, Object obj, a.e eVar) {
            h(w1Var, obj, eVar);
        }

        public static final void g(w1 w1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                b = Da.u.e(w1Var.b((SslCertificate) obj2));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void h(w1 w1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                b = Da.u.e(w1Var.c((SslCertificate) obj2));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void i(w1 w1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                b = Da.u.e(w1Var.e((SslCertificate) obj2));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void j(w1 w1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                b = Da.u.e(w1Var.f((SslCertificate) obj2));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public static final void k(w1 w1Var, Object obj, a.e reply) {
            List b;
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type android.net.http.SslCertificate");
            try {
                b = Da.u.e(w1Var.g((SslCertificate) obj2));
            } catch (Throwable th) {
                b = Q.a.b(th);
            }
            reply.a(b);
        }

        public final void f(da.b binaryMessenger, w1 w1Var) {
            da.h bVar;
            P d;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            if (w1Var == null || (d = w1Var.d()) == null || (bVar = d.b()) == null) {
                bVar = new b();
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", bVar);
            if (w1Var != null) {
                aVar.e(new r1(w1Var));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", bVar);
            if (w1Var != null) {
                aVar2.e(new s1(w1Var));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", bVar);
            if (w1Var != null) {
                aVar3.e(new t1(w1Var));
            } else {
                aVar3.e(null);
            }
            da.a aVar4 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", bVar);
            if (w1Var != null) {
                aVar4.e(new u1(w1Var));
            } else {
                aVar4.e(null);
            }
            da.a aVar5 = new da.a(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", bVar);
            if (w1Var != null) {
                aVar5.e(new v1(w1Var));
            } else {
                aVar5.e(null);
            }
        }

        public a() {
        }
    }

    public w1(P pigeonRegistrar) {
        kotlin.jvm.internal.t.g(pigeonRegistrar, "pigeonRegistrar");
        this.a = pigeonRegistrar;
    }

    public static /* synthetic */ void a(Qa.l lVar, String str, Object obj) {
        i(lVar, str, obj);
    }

    public static final void i(Qa.l lVar, String str, Object obj) {
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

    public abstract SslCertificate.DName b(SslCertificate sslCertificate);

    public abstract SslCertificate.DName c(SslCertificate sslCertificate);

    public P d() {
        return this.a;
    }

    public abstract Long e(SslCertificate sslCertificate);

    public abstract Long f(SslCertificate sslCertificate);

    public abstract X509Certificate g(SslCertificate sslCertificate);

    public final void h(SslCertificate pigeon_instanceArg, Qa.l callback) {
        kotlin.jvm.internal.t.g(pigeon_instanceArg, "pigeon_instanceArg");
        kotlin.jvm.internal.t.g(callback, "callback");
        if (d().c()) {
            s.a aVar = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.t.a(new za.a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (d().d().f(pigeon_instanceArg)) {
            s.a aVar2 = Ca.s.b;
            callback.invoke(Ca.s.a(Ca.s.b(Ca.I.a)));
        } else {
            new da.a(d().a(), "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", d().b()).d(Da.u.e(Long.valueOf(d().d().c(pigeon_instanceArg))), new q1(callback, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance"));
        }
    }
}
