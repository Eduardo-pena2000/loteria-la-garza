package androidx.compose.foundation.lazy.layout;

import I.o;
import I.x;
import O0.Y;
import O0.t;
import P0.N0;
import androidx.compose.ui.e;
import cb.O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import n1.n;
import n1.r;
import n1.s;
import v0.Z0;
import w.P;
import w.Q;
import w.d0;
import w.f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class LazyLayoutItemAnimator {
    public androidx.compose.foundation.lazy.layout.b b;
    public int c;
    public t j;
    public final P a = d0.b();
    public final Q d = f0.b();
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public final List g = new ArrayList();
    public final List h = new ArrayList();
    public final List i = new ArrayList();
    public final androidx.compose.ui.e k = new DisplayingDisappearingItemsElement(this);

    public static final class DisplayingDisappearingItemsElement extends Y {
        public final LazyLayoutItemAnimator b;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.b = lazyLayoutItemAnimator;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && kotlin.jvm.internal.t.c(this.b, ((DisplayingDisappearingItemsElement) obj).b);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a create() {
            return new a(this.b);
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void update(a aVar) {
            aVar.E1(this.b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public void inspectableProperties(N0 n0) {
            n0.d("DisplayingDisappearingItemsElement");
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.b + ')';
        }
    }

    public static final class a extends e.c implements t {
        public LazyLayoutItemAnimator a;

        public a(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.a = lazyLayoutItemAnimator;
        }

        public final void E1(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            if (kotlin.jvm.internal.t.c(this.a, lazyLayoutItemAnimator) || !getNode().isAttached()) {
                return;
            }
            this.a.n();
            LazyLayoutItemAnimator.c(lazyLayoutItemAnimator, this);
            this.a = lazyLayoutItemAnimator;
        }

        public void draw(x0.c cVar) {
            List b = LazyLayoutItemAnimator.b(this.a);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.foundation.lazy.layout.a aVar = (androidx.compose.foundation.lazy.layout.a) b.get(i);
                y0.c g = aVar.g();
                if (g != null) {
                    float k = n.k(aVar.f());
                    float k2 = k - n.k(g.x());
                    float l = n.l(aVar.f()) - n.l(g.x());
                    cVar.m1().d().d(k2, l);
                    try {
                        y0.e.a(cVar, g);
                    } finally {
                        cVar.m1().d().d(-k2, -l);
                    }
                }
            }
            cVar.B1();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.t.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public void onAttach() {
            LazyLayoutItemAnimator.c(this.a, this);
        }

        public void onDetach() {
            this.a.n();
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.a + ')';
        }
    }

    public final class b {
        public n1.b b;
        public int c;
        public int d;
        public int f;
        public int g;
        public androidx.compose.foundation.lazy.layout.a[] a = o.a();
        public int e = 1;

        public b() {
        }

        public static /* synthetic */ void l(b bVar, x xVar, O o, Z0 z0, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 32) != 0) {
                i3 = LazyLayoutItemAnimator.a(LazyLayoutItemAnimator.this, xVar);
            }
            bVar.k(xVar, o, z0, i, i2, i3);
        }

        public final androidx.compose.foundation.lazy.layout.a[] a() {
            return this.a;
        }

        public final n1.b b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public final int e() {
            return this.g;
        }

        public final int f() {
            return this.f;
        }

        public final int g() {
            return this.e;
        }

        public final boolean h() {
            for (androidx.compose.foundation.lazy.layout.a aVar : this.a) {
            }
            return false;
        }

        public final void i(int i) {
            this.d = i;
        }

        public final void j(int i) {
            this.e = i;
        }

        public final void k(x xVar, O o, Z0 z0, int i, int i2, int i3) {
            if (!h()) {
                this.f = i;
                this.g = i2;
            }
            int length = this.a.length;
            for (int c = xVar.c(); c < length; c++) {
                androidx.compose.foundation.lazy.layout.a aVar = this.a[c];
            }
            if (this.a.length != xVar.c()) {
                Object[] copyOf = Arrays.copyOf(this.a, xVar.c());
                kotlin.jvm.internal.t.f(copyOf, "copyOf(this, newSize)");
                this.a = (androidx.compose.foundation.lazy.layout.a[]) copyOf;
            }
            this.b = n1.b.a(xVar.f());
            this.c = i3;
            this.d = xVar.m();
            this.e = xVar.e();
            int c2 = xVar.c();
            for (int i4 = 0; i4 < c2; i4++) {
                o.b(xVar.k(i4));
                androidx.compose.foundation.lazy.layout.a aVar2 = this.a[i4];
                this.a[i4] = null;
            }
        }
    }

    public static final class c implements Comparator {
        public final /* synthetic */ androidx.compose.foundation.lazy.layout.b a;

        public c(androidx.compose.foundation.lazy.layout.b bVar) {
            this.a = bVar;
        }

        public final int compare(Object obj, Object obj2) {
            return Fa.b.d(Integer.valueOf(this.a.b(((x) obj).getKey())), Integer.valueOf(this.a.b(((x) obj2).getKey())));
        }
    }

    public static final class d implements Comparator {
        public final /* synthetic */ androidx.compose.foundation.lazy.layout.b a;

        public d(androidx.compose.foundation.lazy.layout.b bVar) {
            this.a = bVar;
        }

        public final int compare(Object obj, Object obj2) {
            return Fa.b.d(Integer.valueOf(this.a.b(((x) obj).getKey())), Integer.valueOf(this.a.b(((x) obj2).getKey())));
        }
    }

    public static final class e implements Comparator {
        public final /* synthetic */ androidx.compose.foundation.lazy.layout.b a;

        public e(androidx.compose.foundation.lazy.layout.b bVar) {
            this.a = bVar;
        }

        public final int compare(Object obj, Object obj2) {
            return Fa.b.d(Integer.valueOf(this.a.b(((x) obj2).getKey())), Integer.valueOf(this.a.b(((x) obj).getKey())));
        }
    }

    public static final class f implements Comparator {
        public final /* synthetic */ androidx.compose.foundation.lazy.layout.b a;

        public f(androidx.compose.foundation.lazy.layout.b bVar) {
            this.a = bVar;
        }

        public final int compare(Object obj, Object obj2) {
            return Fa.b.d(Integer.valueOf(this.a.b(((x) obj2).getKey())), Integer.valueOf(this.a.b(((x) obj).getKey())));
        }
    }

    public static final /* synthetic */ int a(LazyLayoutItemAnimator lazyLayoutItemAnimator, x xVar) {
        return lazyLayoutItemAnimator.e(xVar);
    }

    public static final /* synthetic */ List b(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
        return lazyLayoutItemAnimator.i;
    }

    public static final /* synthetic */ void c(LazyLayoutItemAnimator lazyLayoutItemAnimator, t tVar) {
        lazyLayoutItemAnimator.j = tVar;
    }

    public static /* synthetic */ void k(LazyLayoutItemAnimator lazyLayoutItemAnimator, x xVar, int i, b bVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            Object e2 = lazyLayoutItemAnimator.a.e(xVar.getKey());
            kotlin.jvm.internal.t.d(e2);
            bVar = (b) e2;
        }
        lazyLayoutItemAnimator.j(xVar, i, bVar);
    }

    public static /* synthetic */ void p(LazyLayoutItemAnimator lazyLayoutItemAnimator, x xVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        lazyLayoutItemAnimator.o(xVar, z);
    }

    public final androidx.compose.foundation.lazy.layout.a d(Object obj, int i) {
        androidx.compose.foundation.lazy.layout.a[] a2;
        b bVar = (b) this.a.e(obj);
        if (bVar == null || (a2 = bVar.a()) == null) {
            return null;
        }
        return a2[i];
    }

    public final int e(x xVar) {
        long l = xVar.l(0);
        return !xVar.h() ? n.l(l) : n.k(l);
    }

    public final boolean f(x xVar) {
        int c2 = xVar.c();
        for (int i = 0; i < c2; i++) {
            o.b(xVar.k(i));
        }
        return false;
    }

    public final int g(x xVar) {
        long l = xVar.l(0);
        return xVar.h() ? n.l(l) : n.k(l);
    }

    public final long h() {
        long a2 = r.b.a();
        List list = this.i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.foundation.lazy.layout.a aVar = (androidx.compose.foundation.lazy.layout.a) list.get(i);
            y0.c g = aVar.g();
            if (g != null) {
                a2 = s.a(Math.max(r.g(a2), n.k(aVar.j()) + r.g(g.w())), Math.max(r.f(a2), n.l(aVar.j()) + r.f(g.w())));
            }
        }
        return a2;
    }

    public final androidx.compose.ui.e i() {
        return this.k;
    }

    public final void j(x xVar, int i, b bVar) {
        long l = xVar.l(0);
        if (xVar.h()) {
            n.h(l, 0, i, 1, null);
        } else {
            n.h(l, i, 0, 2, null);
        }
        for (androidx.compose.foundation.lazy.layout.a aVar : bVar.a()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0226, code lost:
    
        r31 = r3;
        r14 = r5;
        Da.p.v(r31, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0242, code lost:
    
        if (r35.f.isEmpty() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0244, code lost:
    
        r0 = r35.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024b, code lost:
    
        if (r0.size() <= 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x024d, code lost:
    
        Da.z.C(r0, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.c(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0255, code lost:
    
        r12 = r35.f;
        r5 = r12.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025c, code lost:
    
        if (r4 >= r5) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x025e, code lost:
    
        r3 = (I.x) r12.get(r4);
        k(r35, r3, (r47 + q(r31, r3)) - r3.j(), null, 4, null);
        p(r35, r3, false, r14, null);
        r4 = r4 + 1;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r35.c = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0299, code lost:
    
        Da.p.v(r31, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ac, code lost:
    
        r0 = r35.d;
        r1 = r0.b;
        r0 = r0.a;
        r2 = r0.length - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b4, code lost:
    
        if (r2 < 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02b6, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b7, code lost:
    
        r12 = r0[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02c1, code lost:
    
        if (((((~r12) << 7) & r12) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02c3, code lost:
    
        r3 = 8 - ((~(r4 - r2)) >>> 31);
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02cd, code lost:
    
        if (r5 >= r3) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02d3, code lost:
    
        if ((r12 & 255) >= 128) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r42 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02d5, code lost:
    
        r7 = r1[(r4 << 3) + r5];
        r8 = r35.a.e(r7);
        kotlin.jvm.internal.t.d(r8);
        r8 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r8;
        r14 = r40.b(r7);
        r33 = r0;
        r8.j(java.lang.Math.min(r11, r8.g()));
        r34 = r1;
        r8.i(java.lang.Math.min(r11 - r8.g(), r8.d()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x030a, code lost:
    
        if (r14 != (-1)) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x030c, code lost:
    
        r1 = r8.a();
        r8 = r1.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0312, code lost:
    
        if (r14 >= r8) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0314, code lost:
    
        r24 = r1[r14];
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x031b, code lost:
    
        m(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0383, code lost:
    
        r12 = r12 >> 8;
        r5 = r5 + 1;
        r11 = r44;
        r0 = r33;
        r1 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x031f, code lost:
    
        r1 = r8.b();
        kotlin.jvm.internal.t.d(r1);
        r1 = r41.a(r14, r8.d(), r8.g(), r1.r());
        r1.d(true);
        r0 = r8.a();
        r11 = r0.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        n1.o.a(0, r36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0344, code lost:
    
        if (r9 >= r11) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0346, code lost:
    
        r24 = r0[r9];
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x034d, code lost:
    
        if (r15 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0353, code lost:
    
        if (r14 != r15.b(r7)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0355, code lost:
    
        m(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0359, code lost:
    
        r8.k(r1, r48, r49, r46, r47, r8.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x036e, code lost:
    
        if (r14 >= r35.c) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0370, code lost:
    
        r35.g.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r43 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0376, code lost:
    
        r35.h.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x037e, code lost:
    
        r33 = r0;
        r34 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0390, code lost:
    
        r33 = r0;
        r34 = r1;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0397, code lost:
    
        if (r3 != 8) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03a1, code lost:
    
        if (r4 == r2) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03a3, code lost:
    
        r4 = r4 + r1;
        r11 = r44;
        r0 = r33;
        r1 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03b9, code lost:
    
        if (r35.g.isEmpty() != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r45 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03bb, code lost:
    
        r0 = r35.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03c1, code lost:
    
        if (r0.size() <= r1) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03c3, code lost:
    
        Da.z.C(r0, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.f(r40));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03cb, code lost:
    
        r0 = r35.g;
        r1 = r0.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03d2, code lost:
    
        if (r4 >= r1) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03d4, code lost:
    
        r2 = (I.x) r0.get(r4);
        r3 = r35.a.e(r2.getKey());
        kotlin.jvm.internal.t.d(r3);
        r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r3;
        r5 = r31;
        r7 = q(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03ef, code lost:
    
        if (r43 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03f1, code lost:
    
        r8 = g((I.x) Da.D.f0(r39));
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0400, code lost:
    
        r2.i(r8 - r7, r3.c(), r37, r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x040d, code lost:
    
        if (r42 == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x040f, code lost:
    
        o(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0412, code lost:
    
        r4 = r4 + 1;
        r31 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03fc, code lost:
    
        r8 = r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0416, code lost:
    
        r7 = r37;
        r9 = r38;
        r5 = r31;
        Da.p.v(r5, 0, 0, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0438, code lost:
    
        if (r35.h.isEmpty() != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x043a, code lost:
    
        r0 = r35.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r0 = r35.a;
        r2 = r0.b;
        r0 = r0.a;
        r3 = r0.length - 2;
        r4 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0441, code lost:
    
        if (r0.size() <= 1) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0443, code lost:
    
        Da.z.C(r0, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.d(r40));
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x044b, code lost:
    
        r0 = r35.h;
        r1 = r0.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0452, code lost:
    
        if (r4 >= r1) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0454, code lost:
    
        r2 = (I.x) r0.get(r4);
        r3 = r35.a.e(r2.getKey());
        kotlin.jvm.internal.t.d(r3);
        r3 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r3;
        r8 = q(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x046d, code lost:
    
        if (r43 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x046f, code lost:
    
        r10 = g((I.x) Da.D.p0(r39));
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0483, code lost:
    
        r2.i(r10 + r8, r3.c(), r7, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x048c, code lost:
    
        if (r42 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x048e, code lost:
    
        o(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (r3 < 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0491, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x047a, code lost:
    
        r10 = r3.e() - r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0493, code lost:
    
        r0 = r35.g;
        Da.C.V(r0);
        r1 = Ca.I.a;
        r39.addAll(0, r0);
        r39.addAll(r35.h);
        r35.e.clear();
        r35.f.clear();
        r35.g.clear();
        r35.h.clear();
        r35.d.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x04be, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x042c, code lost:
    
        r7 = r37;
        r9 = r38;
        r5 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        r5 = 0;
        r42 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x039a, code lost:
    
        r33 = r0;
        r34 = r1;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03b2, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0239, code lost:
    
        r31 = r3;
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02a9, code lost:
    
        r31 = r3;
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00b0, code lost:
    
        r25 = r0;
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00bc, code lost:
    
        r24 = r13;
        r42 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0058, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x004e, code lost:
    
        n1.o.a(r36, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0045, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        r14 = r0[r5];
        r24 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (((((~r14) << 7) & r14) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        r12 = 8 - ((~(r5 - r3)) >>> 31);
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r13 >= r12) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if ((r14 & 255) >= 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        r25 = r0;
        r35.d.h(r2[(r5 << 3) + r13]);
        r4 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        r14 = r14 >> r4;
        r13 = r13 + 1;
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        r25 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        r25 = r0;
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (r12 != r4) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        if (r5 == r3) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        r5 = r5 + r0;
        r13 = r24;
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        r0 = r39.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r2 >= r0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r3 = (I.x) r39.get(r2);
        r35.d.y(r3.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (f(r3) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
    
        r5 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r35.a.e(r3.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
    
        if (r24 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
    
        r15 = r24;
        r14 = r15.b(r3.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        if (r14 != (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        if (r15 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        if (r5 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        r5 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b(r35);
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.l(r5, r3, r48, r49, r46, r47, 0, 32, null);
        r35.a.x(r3.getKey(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012c, code lost:
    
        if (r3.getIndex() == r14) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
    
        if (r14 == (-1)) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
    
        if (r14 >= r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
    
        r35.e.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0137, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b1, code lost:
    
        r2 = r2 + r12;
        r24 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        r35.f.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0142, code lost:
    
        r12 = r3.l(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014b, code lost:
    
        if (r3.h() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
    
        r4 = n1.n.l(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0156, code lost:
    
        j(r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0159, code lost:
    
        if (r24 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        r3 = r5.a();
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
    
        if (r5 >= r4) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0163, code lost:
    
        r12 = r3[r5];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
    
        r4 = n1.n.k(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
    
        if (r42 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b.l(r5, r3, r48, r49, r46, r47, 0, 32, null);
        r4 = r5.a();
        r12 = r4.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0185, code lost:
    
        if (r14 >= r12) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0187, code lost:
    
        r25 = r4[r14];
        r14 = r14 + 1;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0190, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0191, code lost:
    
        if (r24 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
    
        r4 = r5.a();
        r5 = r4.length;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0199, code lost:
    
        if (r14 >= r5) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
    
        r23 = r4[r14];
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019f, code lost:
    
        p(r35, r3, false, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        r1 = r35.c;
        r2 = (I.x) Da.D.h0(r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0101, code lost:
    
        r24 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f7, code lost:
    
        r15 = r24;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a5, code lost:
    
        r15 = r24;
        r12 = 1;
        m(r3.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b8, code lost:
    
        r15 = r24;
        r4 = 0;
        r5 = 2;
        r3 = new int[r11];
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c1, code lost:
    
        if (r0 >= r11) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c3, code lost:
    
        r3[r0] = r4;
        r0 = r0 + 1;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c8, code lost:
    
        if (r42 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ca, code lost:
    
        if (r15 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d2, code lost:
    
        if (r35.e.isEmpty() != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d4, code lost:
    
        r0 = r35.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
    
        if (r0.size() <= 1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
    
        Da.z.C(r0, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.e(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e4, code lost:
    
        r12 = r35.e;
        r4 = r12.size();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01eb, code lost:
    
        if (r2 >= r4) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
    
        r1 = (I.x) r12.get(r2);
        r14 = r5;
        k(r35, r1, r46 - q(r3, r1), null, 4, null);
        p(r35, r1, false, r14, null);
        r2 = r2 + 1;
        r5 = r14;
        r4 = r4;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r2 = r2.getIndex();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r36, int r37, int r38, java.util.List r39, androidx.compose.foundation.lazy.layout.b r40, I.y r41, boolean r42, boolean r43, int r44, boolean r45, int r46, int r47, cb.O r48, v0.Z0 r49) {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.l(int, int, int, java.util.List, androidx.compose.foundation.lazy.layout.b, I.y, boolean, boolean, int, boolean, int, int, cb.O, v0.Z0):void");
    }

    public final void m(Object obj) {
        androidx.compose.foundation.lazy.layout.a[] a2;
        b bVar = (b) this.a.u(obj);
        if (bVar == null || (a2 = bVar.a()) == null) {
            return;
        }
        for (androidx.compose.foundation.lazy.layout.a aVar : a2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r14 = this;
            w.P r0 = r14.a
            boolean r0 = r0.i()
            if (r0 == 0) goto L5e
            w.P r0 = r14.a
            java.lang.Object[] r1 = r0.c
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L59
            r3 = 0
            r4 = r3
        L15:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2f:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$b r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.b) r10
            androidx.compose.foundation.lazy.layout.a[] r10 = r10.a()
            int r11 = r10.length
            r12 = r3
        L47:
            if (r12 >= r11) goto L4e
            r13 = r10[r12]
            int r12 = r12 + 1
            goto L47
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2f
        L52:
            if (r7 != r8) goto L59
        L54:
            if (r4 == r2) goto L59
            int r4 = r4 + 1
            goto L15
        L59:
            w.P r0 = r14.a
            r0.k()
        L5e:
            androidx.compose.foundation.lazy.layout.b$a r0 = androidx.compose.foundation.lazy.layout.b.a
            r14.b = r0
            r0 = -1
            r14.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.n():void");
    }

    public final void o(x xVar, boolean z) {
        Object e2 = this.a.e(xVar.getKey());
        kotlin.jvm.internal.t.d(e2);
        for (androidx.compose.foundation.lazy.layout.a aVar : ((b) e2).a()) {
        }
    }

    public final int q(int[] iArr, x xVar) {
        int m = xVar.m();
        int e2 = xVar.e() + m;
        int i = 0;
        while (m < e2) {
            int j = iArr[m] + xVar.j();
            iArr[m] = j;
            i = Math.max(i, j);
            m++;
        }
        return i;
    }
}
