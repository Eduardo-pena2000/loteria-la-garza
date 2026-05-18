package ua;

import da.a;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface w {
    public static final a Z8 = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Ca.l b = Ca.m.b(new k());

        public static final void A(w wVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            wVar.c(new m(reply));
        }

        public static final Ca.I B(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(I.a.b(e));
            } else {
                eVar.a(I.a.c(null));
            }
            return Ca.I.a;
        }

        public static /* synthetic */ Ca.I a(a.e eVar, Ca.s sVar) {
            return B(eVar, sVar);
        }

        public static /* synthetic */ H b() {
            return m();
        }

        public static /* synthetic */ void c(w wVar, Object obj, a.e eVar) {
            v(wVar, obj, eVar);
        }

        public static /* synthetic */ Ca.I d(a.e eVar, Ca.s sVar) {
            return u(eVar, sVar);
        }

        public static /* synthetic */ Ca.I e(a.e eVar, Ca.s sVar) {
            return s(eVar, sVar);
        }

        public static /* synthetic */ void f(w wVar, Object obj, a.e eVar) {
            r(wVar, obj, eVar);
        }

        public static /* synthetic */ void g(w wVar, Object obj, a.e eVar) {
            A(wVar, obj, eVar);
        }

        public static /* synthetic */ Ca.I h(a.e eVar, Ca.s sVar) {
            return w(eVar, sVar);
        }

        public static /* synthetic */ Ca.I i(a.e eVar, Ca.s sVar) {
            return z(eVar, sVar);
        }

        public static /* synthetic */ void j(w wVar, Object obj, a.e eVar) {
            x(wVar, obj, eVar);
        }

        public static /* synthetic */ void k(w wVar, Object obj, a.e eVar) {
            y(wVar, obj, eVar);
        }

        public static /* synthetic */ void l(w wVar, Object obj, a.e eVar) {
            t(wVar, obj, eVar);
        }

        public static final H m() {
            return new H();
        }

        public static /* synthetic */ void q(a aVar, da.b bVar, w wVar, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            aVar.p(bVar, wVar, str);
        }

        public static final void r(w wVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            wVar.e((String) obj2, new v(reply));
        }

        public static final Ca.I s(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(I.a.b(e));
            } else {
                eVar.a(I.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void t(w wVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
            Object obj3 = list.get(1);
            kotlin.jvm.internal.t.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            wVar.b((J) obj2, ((Boolean) obj3).booleanValue(), new l(reply));
        }

        public static final Ca.I u(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(I.a.b(e));
            } else {
                Object j = sVar.j();
                if (Ca.s.g(j)) {
                    j = null;
                }
                eVar.a(I.a.c((c) j));
            }
            return Ca.I.a;
        }

        public static final void v(w wVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
            wVar.f((M) obj2, new t(reply));
        }

        public static final Ca.I w(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(I.a.b(e));
            } else {
                eVar.a(I.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void x(w wVar, Object obj, a.e reply) {
            List b2;
            kotlin.jvm.internal.t.g(reply, "reply");
            try {
                b2 = Da.u.e(wVar.d());
            } catch (Throwable th) {
                b2 = I.a.b(th);
            }
            reply.a(b2);
        }

        public static final void y(w wVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
            wVar.a((h) obj2, new u(reply));
        }

        public static final Ca.I z(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(I.a.b(e));
            } else {
                Object j = sVar.j();
                if (Ca.s.g(j)) {
                    j = null;
                }
                eVar.a(I.a.c((i) j));
            }
            return Ca.I.a;
        }

        public final da.h n() {
            return (da.h) b.getValue();
        }

        public final void o(da.b binaryMessenger, w wVar) {
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            q(this, binaryMessenger, wVar, null, 4, null);
        }

        public final void p(da.b binaryMessenger, w wVar, String messageChannelSuffix) {
            String str;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.t.g(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = "." + messageChannelSuffix;
            } else {
                str = "";
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getGoogleServicesJsonServerClientId" + str, n());
            if (wVar != null) {
                aVar.e(new n(wVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getCredential" + str, n());
            if (wVar != null) {
                aVar2.e(new o(wVar));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(binaryMessenger, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearCredentialState" + str, n());
            if (wVar != null) {
                aVar3.e(new p(wVar));
            } else {
                aVar3.e(null);
            }
            da.a aVar4 = new da.a(binaryMessenger, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthorizationToken" + str, n());
            if (wVar != null) {
                aVar4.e(new q(wVar));
            } else {
                aVar4.e(null);
            }
            da.a aVar5 = new da.a(binaryMessenger, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.authorize" + str, n());
            if (wVar != null) {
                aVar5.e(new r(wVar));
            } else {
                aVar5.e(null);
            }
            da.a aVar6 = new da.a(binaryMessenger, "dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.revokeAccess" + str, n());
            if (wVar != null) {
                aVar6.e(new s(wVar));
            } else {
                aVar6.e(null);
            }
        }
    }

    void a(h hVar, Qa.l lVar);

    void b(J j, boolean z, Qa.l lVar);

    void c(Qa.l lVar);

    String d();

    void e(String str, Qa.l lVar);

    void f(M m, Qa.l lVar);
}
