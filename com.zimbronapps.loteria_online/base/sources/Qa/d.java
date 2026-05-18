package qa;

import Ca.l;
import Ca.m;
import Da.u;
import da.a;
import da.h;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface d {
    public static final a X8 = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final l b = m.b(new qa.a());

        public static /* synthetic */ void a(d dVar, Object obj, a.e eVar) {
            h(dVar, obj, eVar);
        }

        public static /* synthetic */ e b() {
            return d();
        }

        public static /* synthetic */ void c(d dVar, Object obj, a.e eVar) {
            i(dVar, obj, eVar);
        }

        public static final e d() {
            return new e();
        }

        public static /* synthetic */ void g(a aVar, da.b bVar, d dVar, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            aVar.f(bVar, dVar, str);
        }

        public static final void h(d dVar, Object obj, a.e reply) {
            List a2;
            t.g(reply, "reply");
            t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            t.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                dVar.b(((Boolean) obj2).booleanValue());
                a2 = u.e(null);
            } catch (Throwable th) {
                a2 = f.a(th);
            }
            reply.a(a2);
        }

        public static final void i(d dVar, Object obj, a.e reply) {
            List a2;
            t.g(reply, "reply");
            t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            t.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                dVar.a(((Boolean) obj2).booleanValue());
                a2 = u.e(null);
            } catch (Throwable th) {
                a2 = f.a(th);
            }
            reply.a(a2);
        }

        public final h e() {
            return (h) b.getValue();
        }

        public final void f(da.b binaryMessenger, d dVar, String messageChannelSuffix) {
            String str;
            t.g(binaryMessenger, "binaryMessenger");
            t.g(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = "." + messageChannelSuffix;
            } else {
                str = "";
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.gma_mediation_applovin.AppLovinSDKApi.setHasUserConsent" + str, e());
            if (dVar != null) {
                aVar.e(new b(dVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.gma_mediation_applovin.AppLovinSDKApi.setDoNotSell" + str, e());
            if (dVar != null) {
                aVar2.e(new c(dVar));
            } else {
                aVar2.e(null);
            }
        }
    }

    void a(boolean z);

    void b(boolean z);
}
