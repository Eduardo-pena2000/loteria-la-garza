package ia;

import da.a;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface y {
    public static final a S8 = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Ca.l b = Ca.m.b(new b());

        public static /* synthetic */ void A(a aVar, da.b bVar, y yVar, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            aVar.z(bVar, yVar, str);
        }

        public static final void B(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            yVar.h(((Boolean) obj2).booleanValue(), new i(reply));
        }

        public static final Ca.I C(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                eVar.a(Z.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void D(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            yVar.d(new g(reply));
        }

        public static final Ca.I E(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                eVar.a(Z.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void F(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.Long");
            yVar.i(((Long) obj2).longValue(), new p(reply));
        }

        public static final Ca.I G(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                eVar.a(Z.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void H(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean?>");
            yVar.e((Map) obj2, new l(reply));
        }

        public static final Ca.I I(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                eVar.a(Z.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void J(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            yVar.f((Map) ((List) obj).get(0), new h(reply));
        }

        public static final Ca.I K(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                eVar.a(Z.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void L(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            yVar.g(new o(reply));
        }

        public static final Ca.I M(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                Object j = sVar.j();
                if (Ca.s.g(j)) {
                    j = null;
                }
                eVar.a(Z.a.c((String) j));
            }
            return Ca.I.a;
        }

        public static final void N(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            yVar.j((Map) obj2, new j(reply));
        }

        public static final Ca.I O(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                eVar.a(Z.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void P(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            yVar.a(new e(reply));
        }

        public static final Ca.I Q(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                Object j = sVar.j();
                if (Ca.s.g(j)) {
                    j = null;
                }
                eVar.a(Z.a.c((Long) j));
            }
            return Ca.I.a;
        }

        public static final void R(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String?>");
            yVar.b((Map) obj2, new f(reply));
        }

        public static final Ca.I S(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                eVar.a(Z.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void T(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            yVar.c((String) ((List) obj).get(0), new n(reply));
        }

        public static final Ca.I U(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                eVar.a(Z.a.c(null));
            }
            return Ca.I.a;
        }

        public static final void V(y yVar, Object obj, a.e reply) {
            kotlin.jvm.internal.t.g(reply, "reply");
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            kotlin.jvm.internal.t.e(obj2, "null cannot be cast to non-null type kotlin.String");
            yVar.k((String) obj2, (String) list.get(1), new k(reply));
        }

        public static final Ca.I W(a.e eVar, Ca.s sVar) {
            Throwable e = Ca.s.e(sVar.j());
            if (e != null) {
                eVar.a(Z.a.b(e));
            } else {
                eVar.a(Z.a.c(null));
            }
            return Ca.I.a;
        }

        public static /* synthetic */ void a(y yVar, Object obj, a.e eVar) {
            V(yVar, obj, eVar);
        }

        public static /* synthetic */ Ca.I b(a.e eVar, Ca.s sVar) {
            return U(eVar, sVar);
        }

        public static /* synthetic */ Ca.I c(a.e eVar, Ca.s sVar) {
            return E(eVar, sVar);
        }

        public static /* synthetic */ void d(y yVar, Object obj, a.e eVar) {
            T(yVar, obj, eVar);
        }

        public static /* synthetic */ void e(y yVar, Object obj, a.e eVar) {
            J(yVar, obj, eVar);
        }

        public static /* synthetic */ Ca.I f(a.e eVar, Ca.s sVar) {
            return G(eVar, sVar);
        }

        public static /* synthetic */ void g(y yVar, Object obj, a.e eVar) {
            P(yVar, obj, eVar);
        }

        public static /* synthetic */ Ca.I h(a.e eVar, Ca.s sVar) {
            return O(eVar, sVar);
        }

        public static /* synthetic */ Ca.I i(a.e eVar, Ca.s sVar) {
            return I(eVar, sVar);
        }

        public static /* synthetic */ void j(y yVar, Object obj, a.e eVar) {
            L(yVar, obj, eVar);
        }

        public static /* synthetic */ Ca.I k(a.e eVar, Ca.s sVar) {
            return C(eVar, sVar);
        }

        public static /* synthetic */ Ca.I l(a.e eVar, Ca.s sVar) {
            return M(eVar, sVar);
        }

        public static /* synthetic */ void m(y yVar, Object obj, a.e eVar) {
            D(yVar, obj, eVar);
        }

        public static /* synthetic */ Ca.I n(a.e eVar, Ca.s sVar) {
            return Q(eVar, sVar);
        }

        public static /* synthetic */ void o(y yVar, Object obj, a.e eVar) {
            H(yVar, obj, eVar);
        }

        public static /* synthetic */ void p(y yVar, Object obj, a.e eVar) {
            F(yVar, obj, eVar);
        }

        public static /* synthetic */ Ca.I q(a.e eVar, Ca.s sVar) {
            return S(eVar, sVar);
        }

        public static /* synthetic */ Ca.I r(a.e eVar, Ca.s sVar) {
            return K(eVar, sVar);
        }

        public static /* synthetic */ void s(y yVar, Object obj, a.e eVar) {
            B(yVar, obj, eVar);
        }

        public static /* synthetic */ Ca.I t(a.e eVar, Ca.s sVar) {
            return W(eVar, sVar);
        }

        public static /* synthetic */ Y u() {
            return x();
        }

        public static /* synthetic */ void v(y yVar, Object obj, a.e eVar) {
            R(yVar, obj, eVar);
        }

        public static /* synthetic */ void w(y yVar, Object obj, a.e eVar) {
            N(yVar, obj, eVar);
        }

        public static final Y x() {
            return new Y();
        }

        public final da.h y() {
            return (da.h) b.getValue();
        }

        public final void z(da.b binaryMessenger, y yVar, String messageChannelSuffix) {
            String str;
            kotlin.jvm.internal.t.g(binaryMessenger, "binaryMessenger");
            kotlin.jvm.internal.t.g(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = "." + messageChannelSuffix;
            } else {
                str = "";
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.logEvent" + str, y());
            if (yVar != null) {
                aVar.e(new m(yVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserId" + str, y());
            if (yVar != null) {
                aVar2.e(new r(yVar));
            } else {
                aVar2.e(null);
            }
            da.a aVar3 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setUserProperty" + str, y());
            if (yVar != null) {
                aVar3.e(new s(yVar));
            } else {
                aVar3.e(null);
            }
            da.a aVar4 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setAnalyticsCollectionEnabled" + str, y());
            if (yVar != null) {
                aVar4.e(new t(yVar));
            } else {
                aVar4.e(null);
            }
            da.a aVar5 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.resetAnalyticsData" + str, y());
            if (yVar != null) {
                aVar5.e(new u(yVar));
            } else {
                aVar5.e(null);
            }
            da.a aVar6 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setSessionTimeoutDuration" + str, y());
            if (yVar != null) {
                aVar6.e(new v(yVar));
            } else {
                aVar6.e(null);
            }
            da.a aVar7 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setConsent" + str, y());
            if (yVar != null) {
                aVar7.e(new w(yVar));
            } else {
                aVar7.e(null);
            }
            da.a aVar8 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.setDefaultEventParameters" + str, y());
            if (yVar != null) {
                aVar8.e(new x(yVar));
            } else {
                aVar8.e(null);
            }
            da.a aVar9 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getAppInstanceId" + str, y());
            if (yVar != null) {
                aVar9.e(new c(yVar));
            } else {
                aVar9.e(null);
            }
            da.a aVar10 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.getSessionId" + str, y());
            if (yVar != null) {
                aVar10.e(new d(yVar));
            } else {
                aVar10.e(null);
            }
            da.a aVar11 = new da.a(binaryMessenger, "dev.flutter.pigeon.firebase_analytics_platform_interface.FirebaseAnalyticsHostApi.initiateOnDeviceConversionMeasurement" + str, y());
            if (yVar != null) {
                aVar11.e(new q(yVar));
            } else {
                aVar11.e(null);
            }
        }
    }

    void a(Qa.l lVar);

    void b(Map map, Qa.l lVar);

    void c(String str, Qa.l lVar);

    void d(Qa.l lVar);

    void e(Map map, Qa.l lVar);

    void f(Map map, Qa.l lVar);

    void g(Qa.l lVar);

    void h(boolean z, Qa.l lVar);

    void i(long j, Qa.l lVar);

    void j(Map map, Qa.l lVar);

    void k(String str, String str2, Qa.l lVar);
}
