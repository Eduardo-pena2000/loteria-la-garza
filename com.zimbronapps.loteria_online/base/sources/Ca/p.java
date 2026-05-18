package ca;

import da.j;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p {
    public final da.j a;
    public b b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        private void a(da.i iVar, j.d dVar) {
            try {
                p.a(p.this).d(((Integer) iVar.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e) {
                dVar.b("error", p.b(e), null);
            }
        }

        private void b(da.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                p.a(p.this).f(l.a(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), ((Integer) map.get("direction")).intValue(), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null));
                dVar.a(null);
            } catch (IllegalStateException e) {
                dVar.b("error", p.b(e), null);
            }
        }

        private void c(da.i iVar, j.d dVar) {
            try {
                p.a(p.this).b(((Integer) ((Map) iVar.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e) {
                dVar.b("error", p.b(e), null);
            }
        }

        private void e(da.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                p.a(p.this).a(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e) {
                dVar.b("error", p.b(e), null);
            }
        }

        private void f(da.i iVar, j.d dVar) {
            j.d dVar2;
            List list = (List) iVar.b();
            try {
                p.a(p.this).c(new m(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e) {
                e = e;
                dVar2 = dVar;
            }
            try {
                dVar2.a(null);
            } catch (IllegalStateException e2) {
                e = e2;
                dVar2.b("error", p.b(e), null);
            }
        }

        public final void d(da.i iVar, j.d dVar) {
            dVar.a(Boolean.valueOf(p.a(p.this).e()));
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            if (p.a(p.this) == null) {
            }
            Q9.b.f("PlatformViewsChannel2", "Received '" + iVar.a + "' message.");
            String str = iVar.a;
            str.hashCode();
            switch (str) {
                case "create":
                    b(iVar, dVar);
                    break;
                case "clearFocus":
                    a(iVar, dVar);
                    break;
                case "touch":
                    f(iVar, dVar);
                    break;
                case "setDirection":
                    e(iVar, dVar);
                    break;
                case "isSurfaceControlEnabled":
                    d(iVar, dVar);
                    break;
                case "dispose":
                    c(iVar, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        void a(int i, int i2);

        void b(int i);

        void c(m mVar);

        void d(int i);

        boolean e();

        void f(l lVar);
    }

    public p(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/platform_views_2", da.p.b);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ b a(p pVar) {
        return pVar.b;
    }

    public static /* synthetic */ String b(Exception exc) {
        return c(exc);
    }

    public static String c(Exception exc) {
        return Q9.b.d(exc);
    }

    public void d(int i) {
        da.j jVar = this.a;
        if (jVar == null) {
            return;
        }
        jVar.c("viewFocused", Integer.valueOf(i));
    }

    public void e(b bVar) {
        this.b = bVar;
    }
}
