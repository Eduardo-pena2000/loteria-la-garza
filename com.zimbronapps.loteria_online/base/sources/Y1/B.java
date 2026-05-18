package y1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import x1.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {

    public static class a implements b {
        public float a;
        public float b;
        public float c;
        public String e;
        public String f;
        public float h;
        public float i;
        public boolean d = false;
        public float g = 0.0f;

        public a(float f, float f2, float f3, String str, String str2) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.e = str == null ? "" : str;
            this.f = str2 == null ? "" : str2;
            this.i = f2;
            this.h = f;
        }

        public ArrayList a() {
            ArrayList arrayList = new ArrayList();
            int i = (int) this.h;
            int i2 = (int) this.i;
            int i3 = i;
            while (i <= i2) {
                arrayList.add(this.e + i3 + this.f);
                i3 += (int) this.c;
                i++;
            }
            return arrayList;
        }

        public float value() {
            float f = this.g;
            if (f >= this.i) {
                this.d = true;
            }
            if (!this.d) {
                this.g = f + this.c;
            }
            return this.g;
        }
    }

    public interface b {
        float value();
    }

    public static class c implements b {
        public float a;
        public float b;
        public float c;
        public boolean d = false;

        public c(float f, float f2) {
            this.a = f;
            this.b = f2;
            this.c = f;
        }

        public float value() {
            if (!this.d) {
                this.c += this.b;
            }
            return this.c;
        }
    }

    public static class d {
        public HashMap a = new HashMap();
        public HashMap b = new HashMap();
        public HashMap c = new HashMap();

        public float a(Object obj) {
            if (!(obj instanceof i)) {
                if (obj instanceof x1.e) {
                    return ((x1.e) obj).c();
                }
                return 0.0f;
            }
            String b = ((i) obj).b();
            if (this.b.containsKey(b)) {
                return ((b) this.b.get(b)).value();
            }
            if (this.a.containsKey(b)) {
                return ((Integer) this.a.get(b)).floatValue();
            }
            return 0.0f;
        }

        public ArrayList b(String str) {
            if (this.c.containsKey(str)) {
                return (ArrayList) this.c.get(str);
            }
            return null;
        }

        public void c(String str, float f, float f2) {
            if (this.b.containsKey(str)) {
                this.b.get(str);
            }
            this.b.put(str, new c(f, f2));
        }

        public void d(String str, float f, float f2, float f3, String str2, String str3) {
            if (this.b.containsKey(str)) {
                this.b.get(str);
            }
            a aVar = new a(f, f2, f3, str2, str3);
            this.b.put(str, aVar);
            this.c.put(str, aVar.a());
        }

        public void e(String str, int i) {
            this.a.put(str, Integer.valueOf(i));
        }

        public void f(String str, ArrayList arrayList) {
            this.c.put(str, arrayList);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(y1.g r8, y1.b.d r9, y1.a r10, x1.f r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.a(y1.g, y1.b$d, y1.a, x1.f, java.lang.String):void");
    }

    public static int b(String str, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static String c(x1.f fVar) {
        Iterator it = fVar.D().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals("type")) {
                return fVar.z("type");
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(y1.g r9, java.lang.String r10, x1.f r11) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.d(y1.g, java.lang.String, x1.f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(int r6, y1.g r7, y1.b.d r8, x1.a r9) {
        /*
            r0 = 1
            if (r6 != 0) goto L8
            z1.i r6 = r7.o()
            goto Lc
        L8:
            z1.j r6 = r7.A()
        Lc:
            x1.c r1 = r9.n(r0)
            boolean r2 = r1 instanceof x1.a
            if (r2 == 0) goto Lae
            x1.a r1 = (x1.a) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L1e
            goto Lae
        L1e:
            r2 = 0
            r3 = r2
        L20:
            int r4 = r1.size()
            if (r3 >= r4) goto L33
            java.lang.String r4 = r1.y(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.s0(r4)
            int r3 = r3 + r0
            goto L20
        L33:
            int r1 = r9.size()
            r3 = 2
            if (r1 <= r3) goto Lae
            x1.c r9 = r9.n(r3)
            boolean r1 = r9 instanceof x1.f
            if (r1 != 0) goto L43
            return
        L43:
            x1.f r9 = (x1.f) r9
            java.util.ArrayList r1 = r9.D()
            java.util.Iterator r1 = r1.iterator()
        L4d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.hashCode()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L68
            h(r7, r8, r9, r6, r3)
            goto L4d
        L68:
            x1.c r3 = r9.o(r3)
            boolean r4 = r3 instanceof x1.a
            if (r4 == 0) goto L85
            r4 = r3
            x1.a r4 = (x1.a) r4
            int r5 = r4.size()
            if (r5 <= r0) goto L85
            java.lang.String r3 = r4.y(r2)
            float r4 = r4.getFloat(r0)
            r6.x0(r4)
            goto L89
        L85:
            java.lang.String r3 = r3.b()
        L89:
            r3.hashCode()
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto La8
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La2
            y1.g$a r3 = y1.g.a.a
            r6.D0(r3)
            goto L4d
        La2:
            y1.g$a r3 = y1.g.a.b
            r6.D0(r3)
            goto L4d
        La8:
            y1.g$a r3 = y1.g.a.c
            r6.D0(r3)
            goto L4d
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.e(int, y1.g, y1.b$d, x1.a):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(java.lang.String r21, y1.g r22, java.lang.String r23, y1.b.d r24, x1.f r25) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.f(java.lang.String, y1.g, java.lang.String, y1.b$d, x1.f):void");
    }

    public static long g(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String substring = str.substring(1);
        if (substring.length() == 6) {
            substring = "FF" + substring;
        }
        return Long.parseLong(substring, 16);
    }

    /*  JADX ERROR: Type inference failed
        LI11I1ll1Ii11.iliLiI1iLLIL: Type inference error: updates count limit reached
        	at LL11ILIl1lL1ii.LiiI1lLILii.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
        	at LL11ILIl1lL1ii.LiiI1lLILii.L1IlILiL1l11Ll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:21)
        */
    public static void h(y1.g r20, y1.b.d r21, x1.f r22, y1.a r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.h(y1.g, y1.b$d, x1.f, y1.a, java.lang.String):void");
    }

    public static void i(x1.f fVar, y1.a aVar, String str) {
        ArrayList D;
        x1.f v = fVar.v(str);
        if (v == null || (D = v.D()) == null) {
            return;
        }
        Iterator it = D.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            x1.c o = v.o(str2);
            if (o instanceof x1.e) {
                aVar.f(str2, o.c());
            } else if (o instanceof i) {
                long g = g(o.b());
                if (g != -1) {
                    aVar.e(str2, (int) g);
                }
            }
        }
    }

    public static y1.d j(x1.f fVar, String str, g gVar, y1.c cVar) {
        x1.c o = fVar.o(str);
        y1.d b2 = y1.d.b(0);
        if (o instanceof i) {
            return k(o.b());
        }
        if (o instanceof x1.e) {
            return y1.d.b(gVar.e(Float.valueOf(cVar.a(fVar.r(str)))));
        }
        if (!(o instanceof x1.f)) {
            return b2;
        }
        x1.f fVar2 = (x1.f) o;
        String B = fVar2.B("value");
        if (B != null) {
            b2 = k(B);
        }
        x1.c x = fVar2.x("min");
        if (x != null) {
            if (x instanceof x1.e) {
                b2.n(gVar.e(Float.valueOf(cVar.a(((x1.e) x).c()))));
            } else if (x instanceof i) {
                b2.o(y1.d.j);
            }
        }
        x1.c x2 = fVar2.x("max");
        if (x2 == null) {
            return b2;
        }
        if (x2 instanceof x1.e) {
            b2.l(gVar.e(Float.valueOf(cVar.a(((x1.e) x2).c()))));
            return b2;
        }
        if (!(x2 instanceof i)) {
            return b2;
        }
        b2.m(y1.d.j);
        return b2;
    }

    public static y1.d k(String str) {
        y1.d b2;
        b2 = y1.d.b(0);
        str.hashCode();
        switch (str) {
            case "preferWrap":
                return y1.d.g(y1.d.j);
            case "parent":
                return y1.d.d();
            case "spread":
                return y1.d.g(y1.d.k);
            case "wrap":
                return y1.d.h();
            default:
                return str.endsWith("%") ? y1.d.e(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).r(0) : str.contains(":") ? y1.d.f(str).s(y1.d.k) : b2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(java.lang.String r17, y1.g r18, java.lang.String r19, y1.b.d r20, x1.f r21) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.l(java.lang.String, y1.g, java.lang.String, y1.b$d, x1.f):void");
    }

    public static void m(g gVar, d dVar, x1.f fVar) {
        ArrayList D = fVar.D();
        if (D == null) {
            return;
        }
        Iterator it = D.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            x1.c o = fVar.o(str);
            ArrayList b2 = dVar.b(str);
            if (b2 != null && (o instanceof x1.f)) {
                Iterator it2 = b2.iterator();
                while (it2.hasNext()) {
                    t(gVar, dVar, (String) it2.next(), (x1.f) o);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void n(java.lang.String r10, y1.g r11, java.lang.String r12, y1.b.d r13, x1.f r14) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.n(java.lang.String, y1.g, java.lang.String, y1.b$d, x1.f):void");
    }

    public static void o(int i, g gVar, x1.a aVar) {
        x1.f fVar;
        String B;
        x1.c n = aVar.n(1);
        if ((n instanceof x1.f) && (B = (fVar = (x1.f) n).B("id")) != null) {
            p(i, gVar, B, fVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x0107. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(int r18, y1.g r19, java.lang.String r20, x1.f r21) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.p(int, y1.g, java.lang.String, x1.f):void");
    }

    public static void q(g gVar, d dVar, x1.a aVar) {
        for (int i = 0; i < aVar.size(); i++) {
            x1.c n = aVar.n(i);
            if (n instanceof x1.a) {
                x1.a aVar2 = (x1.a) n;
                if (aVar2.size() > 1) {
                    String y = aVar2.y(0);
                    y.hashCode();
                    switch (y) {
                        case "vGuideline":
                            o(1, gVar, aVar2);
                            break;
                        case "hChain":
                            e(0, gVar, dVar, aVar2);
                            break;
                        case "vChain":
                            e(1, gVar, dVar, aVar2);
                            break;
                        case "hGuideline":
                            o(0, gVar, aVar2);
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r(x1.c r13, y1.a r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.r(x1.c, y1.a):void");
    }

    public static void s(g gVar, d dVar, x1.f fVar) {
        ArrayList D = fVar.D();
        if (D == null) {
            return;
        }
        Iterator it = D.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            x1.c o = fVar.o(str);
            if (o instanceof x1.e) {
                dVar.e(str, o.e());
            } else if (o instanceof x1.f) {
                x1.f fVar2 = (x1.f) o;
                if (fVar2.C("from") && fVar2.C("to")) {
                    dVar.d(str, dVar.a(fVar2.o("from")), dVar.a(fVar2.o("to")), 1.0f, fVar2.B("prefix"), fVar2.B("postfix"));
                } else if (fVar2.C("from") && fVar2.C("step")) {
                    dVar.c(str, dVar.a(fVar2.o("from")), dVar.a(fVar2.o("step")));
                } else if (fVar2.C("ids")) {
                    x1.a p = fVar2.p("ids");
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < p.size(); i++) {
                        arrayList.add(p.y(i));
                    }
                    dVar.f(str, arrayList);
                } else if (fVar2.C("tag")) {
                    dVar.f(str, gVar.k(fVar2.z("tag")));
                }
            }
        }
    }

    public static void t(g gVar, d dVar, String str, x1.f fVar) {
        u(gVar, dVar, gVar.d(str), fVar);
    }

    public static void u(g gVar, d dVar, y1.a aVar, x1.f fVar) {
        if (aVar.E() == null) {
            aVar.f0(y1.d.h());
        }
        if (aVar.C() == null) {
            aVar.Y(y1.d.h());
        }
        ArrayList D = fVar.D();
        if (D == null) {
            return;
        }
        Iterator it = D.iterator();
        while (it.hasNext()) {
            a(gVar, dVar, aVar, fVar, (String) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void v(x1.f r9, y1.g r10, y1.b.d r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.v(x1.f, y1.g, y1.b$d):void");
    }

    public static float w(g gVar, float f) {
        return gVar.h().a(f);
    }
}
