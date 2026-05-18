package Pb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class q extends Ub.a {
    public final Sb.q a;
    public boolean b;
    public int c;

    public static class a extends Ub.b {
        public Ub.f a(Ub.h hVar, Ub.g gVar) {
            Ub.d a = gVar.a();
            if (hVar.d() >= Rb.f.a) {
                return Ub.f.c();
            }
            b j = q.j(hVar.c().a(), hVar.e(), hVar.b() + hVar.d(), !gVar.b().f());
            if (j == null) {
                return Ub.f.c();
            }
            int i = j.b;
            r rVar = new r(i - hVar.b());
            if ((a instanceof q) && q.k((Sb.q) a.f(), j.a)) {
                return Ub.f.d(rVar).a(i);
            }
            q qVar = new q(j.a);
            j.a.o(true);
            return Ub.f.d(qVar, rVar).a(i);
        }
    }

    public static class b {
        public final Sb.q a;
        public final int b;

        public b(Sb.q qVar, int i) {
            this.a = qVar;
            this.b = i;
        }
    }

    public static class c {
        public final Sb.q a;
        public final int b;

        public c(Sb.q qVar, int i) {
            this.a = qVar;
            this.b = i;
        }
    }

    public q(Sb.q qVar) {
        this.a = qVar;
    }

    public static /* synthetic */ b j(CharSequence charSequence, int i, int i2, boolean z) {
        return o(charSequence, i, i2, z);
    }

    public static /* synthetic */ boolean k(Sb.q qVar, Sb.q qVar2) {
        return n(qVar, qVar2);
    }

    public static boolean l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean m(CharSequence charSequence, int i) {
        char charAt;
        return i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\t' || charAt == ' ';
    }

    public static boolean n(Sb.q qVar, Sb.q qVar2) {
        if ((qVar instanceof Sb.c) && (qVar2 instanceof Sb.c)) {
            return l(Character.valueOf(((Sb.c) qVar).p()), Character.valueOf(((Sb.c) qVar2).p()));
        }
        if ((qVar instanceof Sb.u) && (qVar2 instanceof Sb.u)) {
            return l(Character.valueOf(((Sb.u) qVar).p()), Character.valueOf(((Sb.u) qVar2).p()));
        }
        return false;
    }

    public static b o(CharSequence charSequence, int i, int i2, boolean z) {
        boolean z2;
        c p = p(charSequence, i);
        if (p == null) {
            return null;
        }
        Sb.q qVar = p.a;
        int i3 = p.b;
        int i4 = i2 + (i3 - i);
        int length = charSequence.length();
        int i5 = i4;
        while (true) {
            if (i3 >= length) {
                z2 = false;
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    z2 = true;
                    break;
                }
                i5++;
            } else {
                i5 += Rb.f.a(i5);
            }
            i3++;
        }
        if (z && (((qVar instanceof Sb.u) && ((Sb.u) qVar).q() != 1) || !z2)) {
            return null;
        }
        if (!z2 || i5 - i4 > Rb.f.a) {
            i5 = i4 + 1;
        }
        return new b(qVar, i5);
    }

    public static c p(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt != '*' && charAt != '+' && charAt != '-') {
            return q(charSequence, i);
        }
        int i2 = i + 1;
        if (!m(charSequence, i2)) {
            return null;
        }
        Sb.c cVar = new Sb.c();
        cVar.q(charAt);
        return new c(cVar, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Pb.q.c q(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = 0
            r2 = r7
        L6:
            r3 = 0
            if (r2 >= r0) goto L4b
            char r4 = r6.charAt(r2)
            r5 = 41
            if (r4 == r5) goto L23
            r5 = 46
            if (r4 == r5) goto L23
            switch(r4) {
                case 48: goto L19;
                case 49: goto L19;
                case 50: goto L19;
                case 51: goto L19;
                case 52: goto L19;
                case 53: goto L19;
                case 54: goto L19;
                case 55: goto L19;
                case 56: goto L19;
                case 57: goto L19;
                default: goto L18;
            }
        L18:
            return r3
        L19:
            int r1 = r1 + 1
            r4 = 9
            if (r1 <= r4) goto L20
            return r3
        L20:
            int r2 = r2 + 1
            goto L6
        L23:
            r0 = 1
            if (r1 < r0) goto L4b
            int r0 = r2 + 1
            boolean r1 = m(r6, r0)
            if (r1 == 0) goto L4b
            java.lang.CharSequence r6 = r6.subSequence(r7, r2)
            java.lang.String r6 = r6.toString()
            Sb.u r7 = new Sb.u
            r7.<init>()
            int r6 = java.lang.Integer.parseInt(r6)
            r7.s(r6)
            r7.r(r4)
            Pb.q$c r6 = new Pb.q$c
            r6.<init>(r7, r0)
            return r6
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Pb.q.q(java.lang.CharSequence, int):Pb.q$c");
    }

    public boolean a(Sb.a aVar) {
        if (!(aVar instanceof Sb.r)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.a.o(false);
            this.b = false;
        }
        return true;
    }

    public boolean b() {
        return true;
    }

    public Ub.c c(Ub.h hVar) {
        if (hVar.a()) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return Ub.c.b(hVar.getIndex());
    }

    public Sb.a f() {
        return this.a;
    }
}
