// default package

import Ca.l;
import Ca.m;
import Da.u;
import da.a;
import da.b;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface h {
    public static final a H8 = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final l b = m.b(new e());

        public static /* synthetic */ i a() {
            return d();
        }

        public static /* synthetic */ void b(h hVar, Object obj, a.e eVar) {
            h(hVar, obj, eVar);
        }

        public static /* synthetic */ void c(h hVar, Object obj, a.e eVar) {
            i(hVar, obj, eVar);
        }

        public static final i d() {
            return new i();
        }

        public static /* synthetic */ void g(a aVar, b bVar, h hVar, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            aVar.f(bVar, hVar, str);
        }

        public static final void h(h hVar, Object obj, a.e eVar) {
            List b2;
            t.g(eVar, "reply");
            t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            t.e(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
            try {
                hVar.a((d) obj2);
                b2 = u.e((Object) null);
            } catch (Throwable th) {
                b2 = j.b(th);
            }
            eVar.a(b2);
        }

        public static final void i(h hVar, Object obj, a.e eVar) {
            List b2;
            t.g(eVar, "reply");
            try {
                b2 = u.e(hVar.isEnabled());
            } catch (Throwable th) {
                b2 = j.b(th);
            }
            eVar.a(b2);
        }

        public final da.h e() {
            return (da.h) b.getValue();
        }

        public final void f(b bVar, h hVar, String str) {
            String str2;
            t.g(bVar, "binaryMessenger");
            t.g(str, "messageChannelSuffix");
            if (str.length() > 0) {
                str2 = "." + str;
            } else {
                str2 = "";
            }
            da.a aVar = new da.a(bVar, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle" + str2, e());
            if (hVar != null) {
                aVar.e(new f(hVar));
            } else {
                aVar.e((a.d) null);
            }
            da.a aVar2 = new da.a(bVar, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled" + str2, e());
            if (hVar != null) {
                aVar2.e(new g(hVar));
            } else {
                aVar2.e((a.d) null);
            }
        }
    }

    void a(d dVar);

    c isEnabled();
}
