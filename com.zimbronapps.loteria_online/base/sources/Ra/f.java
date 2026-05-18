package ra;

import Ca.l;
import Ca.m;
import Da.u;
import da.a;
import da.h;
import da.o;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface f {
    public static final a Y8 = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final l b = m.b(new c());

        public static /* synthetic */ void a(f fVar, Object obj, a.e eVar) {
            h(fVar, obj, eVar);
        }

        public static /* synthetic */ void b(f fVar, Object obj, a.e eVar) {
            i(fVar, obj, eVar);
        }

        public static /* synthetic */ o c() {
            return d();
        }

        public static final o d() {
            return new o();
        }

        public static /* synthetic */ void g(a aVar, da.b bVar, f fVar, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            aVar.f(bVar, fVar, str);
        }

        public static final void h(f fVar, Object obj, a.e reply) {
            List a2;
            t.g(reply, "reply");
            t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            t.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                fVar.a(((Boolean) obj2).booleanValue());
                a2 = u.e(null);
            } catch (Throwable th) {
                a2 = g.a(th);
            }
            reply.a(a2);
        }

        public static final void i(f fVar, Object obj, a.e reply) {
            List a2;
            t.g(reply, "reply");
            t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            t.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                fVar.b(((Boolean) obj2).booleanValue());
                a2 = u.e(null);
            } catch (Throwable th) {
                a2 = g.a(th);
            }
            reply.a(a2);
        }

        public final h e() {
            return (h) b.getValue();
        }

        public final void f(da.b binaryMessenger, f fVar, String messageChannelSuffix) {
            String str;
            t.g(binaryMessenger, "binaryMessenger");
            t.g(messageChannelSuffix, "messageChannelSuffix");
            if (messageChannelSuffix.length() > 0) {
                str = "." + messageChannelSuffix;
            } else {
                str = "";
            }
            da.a aVar = new da.a(binaryMessenger, "dev.flutter.pigeon.gma_mediation_unity.UnityPrivacyApi.setGDPRConsent" + str, e());
            if (fVar != null) {
                aVar.e(new d(fVar));
            } else {
                aVar.e(null);
            }
            da.a aVar2 = new da.a(binaryMessenger, "dev.flutter.pigeon.gma_mediation_unity.UnityPrivacyApi.setCCPAConsent" + str, e());
            if (fVar != null) {
                aVar2.e(new e(fVar));
            } else {
                aVar2.e(null);
            }
        }
    }

    void a(boolean z);

    void b(boolean z);
}
