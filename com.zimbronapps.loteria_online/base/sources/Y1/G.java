package y1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import z1.i;
import z1.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final Integer k = 0;
    public y1.c a;
    public boolean b = true;
    public HashMap c = new HashMap();
    public HashMap d = new HashMap();
    public HashMap e = new HashMap();
    public final y1.a f;
    public int g;
    public ArrayList h;
    public ArrayList i;
    public boolean j;

    /* JADX WARN: Enum visitor error
    LI11I1ll1Ii11.IIiLliI1l1li1: Can't remove SSA var: r0v0 y1.g$a, still in use, count: 1, list:
      (r0v0 y1.g$a) from 0x0044: INVOKE (wrap:java.util.Map:0x0040: SGET  A[WRAPPED] (LINE:65) y1.g.a.d java.util.Map), ("spread"), (r0v0 y1.g$a) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object (LINE:69)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.ILIiiIiIILL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:178)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.LIi1LL1Ilill1l(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:22)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
    	at LL11ILIl1lL1ii.i1lLLlIILLIlii.accept(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:5)
    	at java.util.ArrayList.forEach(ArrayList.java:1613)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.IlllI1L11iLLLL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:14)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.iLLIliliLl1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:265)
    	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;

        public static Map d = new HashMap();
        public static Map e = new HashMap();

        static {
            d.put("packed", new a());
            d.put("spread_inside", new a());
            d.put("spread", new a());
            e.put("packed", 2);
            e.put("spread_inside", 1);
            e.put("spread", 0);
        }

        public a() {
        }

        public static int b(String str) {
            if (e.containsKey(str)) {
                return ((Integer) e.get(str)).intValue();
            }
            return -1;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    public enum b {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum c {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum d {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    /* JADX WARN: Enum visitor error
    LI11I1ll1Ii11.IIiLliI1l1li1: Can't remove SSA var: r0v0 y1.g$e, still in use, count: 1, list:
      (r0v0 y1.g$e) from 0x0036: INVOKE (wrap:java.util.Map:0x0032: SGET  A[WRAPPED] (LINE:51) y1.g.e.d java.util.Map), ("none"), (r0v0 y1.g$e) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object (LINE:55)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.ILIiiIiIILL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:178)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.LIi1LL1Ilill1l(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:22)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
    	at LL11ILIl1lL1ii.i1lLLlIILLIlii.accept(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:5)
    	at java.util.ArrayList.forEach(ArrayList.java:1613)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.IlllI1L11iLLLL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:14)
    	at LL11ILIl1lL1ii.i1lii1lllLIL1.iLLIliliLl1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:265)
    	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e {
        NONE,
        CHAIN,
        ALIGNED;

        public static Map d = new HashMap();
        public static Map e = new HashMap();

        static {
            d.put("none", new e());
            d.put("chain", new e());
            d.put("aligned", new e());
            e.put("none", 0);
            e.put("chain", 3);
            e.put("aligned", 2);
        }

        public e() {
        }

        public static int b(String str) {
            if (e.containsKey(str)) {
                return ((Integer) e.get(str)).intValue();
            }
            return -1;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f.clone();
        }
    }

    public g() {
        y1.a aVar = new y1.a(this);
        this.f = aVar;
        this.g = 0;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = true;
        Integer num = k;
        aVar.c(num);
        this.c.put(num, aVar);
    }

    public j A() {
        return (j) n(null, d.VERTICAL_CHAIN);
    }

    public z1.h B(Object obj) {
        return l(obj, 1);
    }

    public g C(y1.d dVar) {
        return z(dVar);
    }

    public void a(B1.f fVar) {
        y1.e eVar;
        B1.j u0;
        B1.j u02;
        fVar.y1();
        this.f.E().a(this, fVar, 0);
        this.f.C().a(this, fVar, 1);
        for (Object obj : this.d.keySet()) {
            B1.j u03 = ((y1.e) this.d.get(obj)).u0();
            if (u03 != null) {
                f fVar2 = (f) this.c.get(obj);
                if (fVar2 == null) {
                    fVar2 = d(obj);
                }
                fVar2.b(u03);
            }
        }
        for (Object obj2 : this.c.keySet()) {
            f fVar3 = (f) this.c.get(obj2);
            if (fVar3 != this.f && (fVar3.d() instanceof y1.e) && (u02 = ((y1.e) fVar3.d()).u0()) != null) {
                f fVar4 = (f) this.c.get(obj2);
                if (fVar4 == null) {
                    fVar4 = d(obj2);
                }
                fVar4.b(u02);
            }
        }
        Iterator it = this.c.keySet().iterator();
        while (it.hasNext()) {
            f fVar5 = (f) this.c.get(it.next());
            if (fVar5 != this.f) {
                B1.e a2 = fVar5.a();
                a2.F0(fVar5.getKey().toString());
                a2.f1(null);
                if (fVar5.d() instanceof z1.h) {
                    fVar5.apply();
                }
                fVar.a(a2);
            } else {
                fVar5.b(fVar);
            }
        }
        Iterator it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            y1.e eVar2 = (y1.e) this.d.get(it2.next());
            if (eVar2.u0() != null) {
                Iterator it3 = eVar2.o0.iterator();
                while (it3.hasNext()) {
                    eVar2.u0().a(((f) this.c.get(it3.next())).a());
                }
                eVar2.apply();
            } else {
                eVar2.apply();
            }
        }
        Iterator it4 = this.c.keySet().iterator();
        while (it4.hasNext()) {
            f fVar6 = (f) this.c.get(it4.next());
            if (fVar6 != this.f && (fVar6.d() instanceof y1.e) && (u0 = (eVar = (y1.e) fVar6.d()).u0()) != null) {
                Iterator it5 = eVar.o0.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    f fVar7 = (f) this.c.get(next);
                    if (fVar7 != null) {
                        u0.a(fVar7.a());
                    } else if (next instanceof f) {
                        u0.a(((f) next).a());
                    } else {
                        System.out.println("couldn't find reference for " + next);
                    }
                }
                fVar6.apply();
            }
        }
        for (Object obj3 : this.c.keySet()) {
            f fVar8 = (f) this.c.get(obj3);
            fVar8.apply();
            B1.e a3 = fVar8.a();
            if (a3 != null && obj3 != null) {
                a3.o = obj3.toString();
            }
        }
    }

    public z1.c b(Object obj, c cVar) {
        y1.a d2 = d(obj);
        if (d2.d() == null || !(d2.d() instanceof z1.c)) {
            z1.c cVar2 = new z1.c(this);
            cVar2.w0(cVar);
            d2.X(cVar2);
        }
        return (z1.c) d2.d();
    }

    public void c(Object obj) {
        this.h.add(obj);
        this.j = true;
    }

    public y1.a d(Object obj) {
        f fVar = (f) this.c.get(obj);
        if (fVar == null) {
            fVar = f(obj);
            this.c.put(obj, fVar);
            fVar.c(obj);
        }
        if (fVar instanceof y1.a) {
            return (y1.a) fVar;
        }
        return null;
    }

    public int e(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public y1.a f(Object obj) {
        return new y1.a(this);
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        sb.append("__HELPER_KEY_");
        int i = this.g;
        this.g = i + 1;
        sb.append(i);
        sb.append("__");
        return sb.toString();
    }

    public y1.c h() {
        return this.a;
    }

    public z1.f i(Object obj, boolean z) {
        y1.a d2 = d(obj);
        if (d2.d() == null || !(d2.d() instanceof z1.f)) {
            d2.X(z ? new z1.f(this, d.VERTICAL_FLOW) : new z1.f(this, d.HORIZONTAL_FLOW));
        }
        return (z1.f) d2.d();
    }

    public z1.g j(Object obj, String str) {
        y1.a d2 = d(obj);
        if (d2.d() == null || !(d2.d() instanceof z1.g)) {
            d dVar = d.GRID;
            if (str.charAt(0) == 'r') {
                dVar = d.ROW;
            } else if (str.charAt(0) == 'c') {
                dVar = d.COLUMN;
            }
            d2.X(new z1.g(this, dVar));
        }
        return (z1.g) d2.d();
    }

    public ArrayList k(String str) {
        if (this.e.containsKey(str)) {
            return (ArrayList) this.e.get(str);
        }
        return null;
    }

    public z1.h l(Object obj, int i) {
        y1.a d2 = d(obj);
        if (d2.d() == null || !(d2.d() instanceof z1.h)) {
            z1.h hVar = new z1.h(this);
            hVar.g(i);
            hVar.c(obj);
            d2.X(hVar);
        }
        return (z1.h) d2.d();
    }

    public g m(y1.d dVar) {
        return w(dVar);
    }

    public y1.e n(Object obj, d dVar) {
        y1.e iVar;
        if (obj == null) {
            obj = g();
        }
        y1.e eVar = (y1.e) this.d.get(obj);
        if (eVar == null) {
            switch (dVar) {
                case HORIZONTAL_CHAIN:
                    iVar = new i(this);
                    eVar = iVar;
                    break;
                case VERTICAL_CHAIN:
                    iVar = new j(this);
                    eVar = iVar;
                    break;
                case ALIGN_HORIZONTALLY:
                    iVar = new z1.a(this);
                    eVar = iVar;
                    break;
                case ALIGN_VERTICALLY:
                    iVar = new z1.b(this);
                    eVar = iVar;
                    break;
                case BARRIER:
                    iVar = new z1.c(this);
                    eVar = iVar;
                    break;
                case LAYER:
                default:
                    eVar = new y1.e(this, dVar);
                    break;
                case HORIZONTAL_FLOW:
                case VERTICAL_FLOW:
                    eVar = new z1.f(this, dVar);
                    break;
                case GRID:
                case ROW:
                case COLUMN:
                    eVar = new z1.g(this, dVar);
                    break;
            }
            eVar.c(obj);
            this.d.put(obj, eVar);
        }
        return eVar;
    }

    public i o() {
        return (i) n(null, d.HORIZONTAL_CHAIN);
    }

    public z1.h p(Object obj) {
        return l(obj, 0);
    }

    public boolean q(B1.e eVar) {
        if (this.j) {
            this.i.clear();
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                B1.e a2 = ((f) this.c.get(it.next())).a();
                if (a2 != null) {
                    this.i.add(a2);
                }
            }
            this.j = false;
        }
        return this.i.contains(eVar);
    }

    public boolean r() {
        return !this.b;
    }

    public void s(Object obj, Object obj2) {
        y1.a d2 = d(obj);
        if (d2 != null) {
            d2.e0(obj2);
        }
    }

    public f t(Object obj) {
        return (f) this.c.get(obj);
    }

    public void u() {
        Iterator it = this.c.keySet().iterator();
        while (it.hasNext()) {
            ((f) this.c.get(it.next())).a().v0();
        }
        this.c.clear();
        this.c.put(k, this.f);
        this.d.clear();
        this.e.clear();
        this.h.clear();
        this.j = true;
    }

    public void v(y1.c cVar) {
        this.a = cVar;
    }

    public g w(y1.d dVar) {
        this.f.Y(dVar);
        return this;
    }

    public void x(boolean z) {
        this.b = !z;
    }

    public void y(String str, String str2) {
        ArrayList arrayList;
        y1.a d2 = d(str);
        if (d2 != null) {
            d2.b0(str2);
            if (this.e.containsKey(str2)) {
                arrayList = (ArrayList) this.e.get(str2);
            } else {
                arrayList = new ArrayList();
                this.e.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public g z(y1.d dVar) {
        this.f.f0(dVar);
        return this;
    }
}
