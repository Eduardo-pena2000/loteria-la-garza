package ca;

import da.j;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class o {
    public final da.j a;
    public e b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        public static /* synthetic */ void a(j.d dVar, c cVar) {
            e(dVar, cVar);
        }

        public static /* synthetic */ void e(j.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.a));
            hashMap.put("height", Double.valueOf(cVar.b));
            dVar.a(hashMap);
        }

        public final void b(da.i iVar, j.d dVar) {
            try {
                o.a(o.this).d(((Integer) iVar.b()).intValue());
                dVar.a(null);
            } catch (IllegalStateException e) {
                dVar.b("error", o.b(e), null);
            }
        }

        public final void c(da.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            boolean z = false;
            boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z2) {
                    o.a(o.this).g(l.b(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), ((Integer) map.get("direction")).intValue(), wrap));
                    dVar.a(null);
                    return;
                }
                if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z = true;
                }
                long l = o.a(o.this).l(l.c(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z, wrap));
                if (l != -2) {
                    dVar.a(Long.valueOf(l));
                } else {
                    if (!z) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    dVar.a(null);
                }
            } catch (IllegalStateException e) {
                dVar.b("error", o.b(e), null);
            }
        }

        public final void d(da.i iVar, j.d dVar) {
            try {
                o.a(o.this).b(((Integer) ((Map) iVar.b()).get("id")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e) {
                dVar.b("error", o.b(e), null);
            }
        }

        public final void f(da.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                o.a(o.this).j(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.a(null);
            } catch (IllegalStateException e) {
                dVar.b("error", o.b(e), null);
            }
        }

        public final void g(da.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                o.a(o.this).i(new d(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new n(dVar));
            } catch (IllegalStateException e) {
                dVar.b("error", o.b(e), null);
            }
        }

        public final void h(da.i iVar, j.d dVar) {
            Map map = (Map) iVar.b();
            try {
                o.a(o.this).a(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.a(null);
            } catch (IllegalStateException e) {
                dVar.b("error", o.b(e), null);
            }
        }

        public final void i(da.i iVar, j.d dVar) {
            try {
                o.a(o.this).e(((Boolean) iVar.b()).booleanValue());
                dVar.a(null);
            } catch (IllegalStateException e) {
                dVar.b("error", o.b(e), null);
            }
        }

        public final void j(da.i iVar, j.d dVar) {
            j.d dVar2;
            List list = (List) iVar.b();
            try {
                o.a(o.this).c(new m(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e) {
                e = e;
                dVar2 = dVar;
            }
            try {
                dVar2.a(null);
            } catch (IllegalStateException e2) {
                e = e2;
                dVar2.b("error", o.b(e), null);
            }
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            if (o.a(o.this) == null) {
            }
            Q9.b.f("PlatformViewsChannel", "Received '" + iVar.a + "' message.");
            String str = iVar.a;
            str.hashCode();
            switch (str) {
                case "create":
                    c(iVar, dVar);
                    break;
                case "offset":
                    f(iVar, dVar);
                    break;
                case "resize":
                    g(iVar, dVar);
                    break;
                case "clearFocus":
                    b(iVar, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    i(iVar, dVar);
                    break;
                case "touch":
                    j(iVar, dVar);
                    break;
                case "setDirection":
                    h(iVar, dVar);
                    break;
                case "dispose":
                    d(iVar, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static class d {
        public final int a;
        public final double b;
        public final double c;

        public d(int i, double d, double d2) {
            this.a = i;
            this.b = d;
            this.c = d2;
        }
    }

    public interface e {
        void a(int i, int i2);

        void b(int i);

        void c(m mVar);

        void d(int i);

        void e(boolean z);

        void g(l lVar);

        void i(d dVar, b bVar);

        void j(int i, double d, double d2);

        long l(l lVar);
    }

    public o(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/platform_views", da.p.b);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ e a(o oVar) {
        return oVar.b;
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

    public void e(e eVar) {
        this.b = eVar;
    }
}
