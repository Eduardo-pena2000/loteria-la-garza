package androidx.compose.ui.focus;

import G0.c;
import O0.c0;
import O0.g0;
import O0.p0;
import android.view.KeyEvent;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.j;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import t0.u;
import w.J;
import w.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class FocusOwnerImpl implements t0.k {
    public final u a;
    public final p0 b;
    public final t0.g d;
    public J f;
    public FocusTargetNode h;
    public boolean i;
    public FocusTargetNode c = new FocusTargetNode(q.a.b(), null, null, 6, null);
    public final androidx.compose.ui.e e = new FocusOwnerImpl$modifier$1(this);
    public final L g = new L(1);

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t0.b.values().length];
            try {
                iArr[t0.b.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.b.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t0.b.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ FocusTargetNode a;
        public final /* synthetic */ FocusOwnerImpl b;
        public final /* synthetic */ Qa.l c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Qa.l lVar) {
            super(1);
            this.a = focusTargetNode;
            this.b = focusOwnerImpl;
            this.c = lVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean booleanValue;
            if (t.c(focusTargetNode, this.a)) {
                booleanValue = false;
            } else {
                if (t.c(focusTargetNode, this.b.y())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                booleanValue = ((Boolean) this.c.invoke(focusTargetNode)).booleanValue();
            }
            return Boolean.valueOf(booleanValue);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ O a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O o, int i) {
            super(1);
            this.a = o;
            this.b = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.a.a = Boolean.valueOf(focusTargetNode.q(this.b));
            return (Boolean) this.a.a;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(1);
            this.a = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.q(this.a));
        }
    }

    public FocusOwnerImpl(u uVar, p0 p0Var) {
        this.a = uVar;
        this.b = p0Var;
        this.d = new t0.g(this, p0Var);
    }

    public void A(boolean z) {
        if (!((z && f() == null) ? false : true)) {
            L0.a.a("Cannot capture focus when the active focus target node is unset");
        }
        this.i = z;
    }

    public boolean B(int i, u0.h hVar) {
        Boolean d2 = d(i, hVar, new d(i));
        if (d2 != null) {
            return d2.booleanValue();
        }
        return false;
    }

    public final boolean C(KeyEvent keyEvent) {
        long a2 = G0.d.a(keyEvent);
        int b2 = G0.d.b(keyEvent);
        c.a aVar = G0.c.a;
        if (G0.c.e(b2, aVar.a())) {
            J j = this.f;
            if (j == null) {
                j = new J(3);
                this.f = j;
            }
            j.l(a2);
        } else if (G0.c.e(b2, aVar.b())) {
            J j2 = this.f;
            if (j2 == null || !j2.a(a2)) {
                return false;
            }
            J j3 = this.f;
            if (j3 != null) {
                j3.m(a2);
            }
        }
        return true;
    }

    public boolean a(int i) {
        if (o0.h.d && this.a.e(i)) {
            return true;
        }
        O o = new O();
        o.a = Boolean.FALSE;
        FocusTargetNode f = f();
        Boolean d2 = d(i, this.a.getEmbeddedViewFocusRect(), new c(o, i));
        if (t.c(d2, Boolean.TRUE) && f != f()) {
            return true;
        }
        if (d2 == null || o.a == null) {
            return false;
        }
        if (d2.booleanValue() && ((Boolean) o.a).booleanValue()) {
            return true;
        }
        return g.a(i) ? m(false, true, false, i) && B(i, null) : !o0.h.d && this.a.e(i);
    }

    public void b() {
        this.a.b();
    }

    public boolean c(androidx.compose.ui.focus.c cVar, u0.h hVar) {
        return this.a.c(cVar, hVar);
    }

    public Boolean d(int i, u0.h hVar, Qa.l lVar) {
        FocusTargetNode x = x();
        if (x != null) {
            j a2 = p.a(x, i, this.b.getLayoutDirection());
            j.a aVar = j.b;
            if (t.c(a2, aVar.a())) {
                return null;
            }
            if (t.c(a2, aVar.c())) {
                FocusTargetNode x2 = x();
                if (x2 != null) {
                    return (Boolean) lVar.invoke(x2);
                }
                return null;
            }
            if (!t.c(a2, aVar.b())) {
                return Boolean.valueOf(a2.d(lVar));
            }
        } else {
            x = null;
        }
        return p.e(this.c, i, this.b.getLayoutDirection(), hVar, new b(x, this, lVar));
    }

    public boolean e(KeyEvent keyEvent) {
        c0 s0;
        if (this.d.b()) {
            System.out.println("FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode b2 = p.b(this.c);
        if (b2 != null) {
            int a2 = g0.a(131072);
            if (!b2.getNode().isAttached()) {
                L0.a.b("visitAncestors called on an unattached node");
            }
            e.c node = b2.getNode();
            O0.J n = O0.k.n(b2);
            while (n != null) {
                if ((n.s0().k().getAggregateChildKindSet$ui_release() & a2) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & a2) != 0) {
                            e.c cVar = node;
                            d0.c cVar2 = null;
                            while (cVar != null) {
                                if ((cVar.getKindSet$ui_release() & a2) == 0 || !(cVar instanceof O0.m)) {
                                    cVar = O0.k.b(cVar2);
                                } else {
                                    int i = 0;
                                    for (e.c F1 = ((O0.m) cVar).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                        if ((F1.getKindSet$ui_release() & a2) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar = F1;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new d0.c(new e.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    cVar2.b(cVar);
                                                    cVar = null;
                                                }
                                                cVar2.b(F1);
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                        cVar = O0.k.b(cVar2);
                                    }
                                }
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                n = n.z0();
                node = (n == null || (s0 = n.s0()) == null) ? null : s0.o();
            }
            android.support.v4.media.session.b.a(null);
        }
        return false;
    }

    public FocusTargetNode f() {
        return this.h;
    }

    public void g(FocusTargetNode focusTargetNode) {
        this.d.f(focusTargetNode);
    }

    public void h() {
        this.d.e();
    }

    public androidx.compose.ui.e i() {
        return this.e;
    }

    public boolean j(F0.c cVar, Qa.a aVar) {
        c0 s0;
        if (this.d.b()) {
            System.out.println("FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode x = x();
        if (x != null) {
            int a2 = g0.a(2097152);
            if (!x.getNode().isAttached()) {
                L0.a.b("visitAncestors called on an unattached node");
            }
            e.c node = x.getNode();
            O0.J n = O0.k.n(x);
            while (n != null) {
                if ((n.s0().k().getAggregateChildKindSet$ui_release() & a2) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & a2) != 0) {
                            e.c cVar2 = node;
                            d0.c cVar3 = null;
                            while (cVar2 != null) {
                                if ((cVar2.getKindSet$ui_release() & a2) == 0 || !(cVar2 instanceof O0.m)) {
                                    cVar2 = O0.k.b(cVar3);
                                } else {
                                    int i = 0;
                                    for (e.c F1 = ((O0.m) cVar2).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                        if ((F1.getKindSet$ui_release() & a2) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar2 = F1;
                                            } else {
                                                if (cVar3 == null) {
                                                    cVar3 = new d0.c(new e.c[16], 0);
                                                }
                                                if (cVar2 != null) {
                                                    cVar3.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                cVar3.b(F1);
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                        cVar2 = O0.k.b(cVar3);
                                    }
                                }
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                n = n.z0();
                node = (n == null || (s0 = n.s0()) == null) ? null : s0.o();
            }
            android.support.v4.media.session.b.a(null);
        }
        return false;
    }

    public boolean k() {
        return this.i;
    }

    public boolean m(boolean z, boolean z2, boolean z3, int i) {
        boolean w;
        if (z) {
            w = w(z, z2);
        } else {
            int i2 = a.a[o.e(this.c, i).ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                w = false;
            } else {
                if (i2 != 4) {
                    throw new Ca.o();
                }
                w = w(z, z2);
            }
        }
        if (w && z3) {
            b();
        }
        return w;
    }

    /* JADX WARN: Removed duplicated region for block: B:280:0x00e2 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:9:0x0021, B:13:0x002b, B:16:0x0038, B:19:0x018c, B:21:0x019a, B:22:0x019d, B:24:0x01ac, B:27:0x01bd, B:31:0x01c8, B:66:0x01ce, B:67:0x01d3, B:60:0x0214, B:33:0x01d7, B:35:0x01de, B:37:0x01e2, B:39:0x01ec, B:41:0x01f3, B:43:0x01f6, B:47:0x01fc, B:49:0x0205, B:50:0x0209, B:45:0x020c, B:69:0x0219, B:72:0x021e, B:74:0x0224, B:81:0x022a, B:86:0x0235, B:88:0x023d, B:96:0x0254, B:97:0x0256, B:98:0x0266, B:100:0x026a, B:139:0x026e, B:134:0x02cc, B:102:0x027a, B:104:0x0283, B:106:0x0289, B:108:0x0292, B:110:0x0299, B:112:0x029c, B:115:0x02a1, B:117:0x02a7, B:118:0x02ae, B:120:0x02b6, B:121:0x02bb, B:123:0x02c1, B:114:0x02c4, B:145:0x02d7, B:149:0x02e7, B:150:0x02f7, B:152:0x02fb, B:191:0x02ff, B:186:0x035d, B:154:0x030b, B:156:0x0314, B:158:0x031a, B:160:0x0323, B:162:0x032a, B:164:0x032d, B:167:0x0332, B:169:0x0338, B:170:0x033f, B:172:0x0347, B:173:0x034c, B:175:0x0352, B:166:0x0355, B:198:0x036a, B:200:0x0371, B:207:0x0383, B:208:0x0385, B:212:0x0040, B:214:0x004e, B:215:0x0051, B:217:0x005b, B:220:0x006c, B:224:0x0077, B:259:0x00d8, B:261:0x00dc, B:226:0x007d, B:228:0x0084, B:230:0x0088, B:232:0x0092, B:234:0x0099, B:236:0x009c, B:240:0x00a2, B:242:0x00ab, B:243:0x00af, B:238:0x00b2, B:249:0x00ba, B:263:0x00bf, B:266:0x00c4, B:268:0x00ca, B:275:0x00d0, B:280:0x00e2, B:282:0x00f2, B:283:0x00f5, B:285:0x0103, B:288:0x0114, B:292:0x011f, B:327:0x0180, B:329:0x0184, B:294:0x0125, B:296:0x012c, B:298:0x0130, B:300:0x013a, B:302:0x0141, B:304:0x0144, B:308:0x014a, B:310:0x0153, B:311:0x0157, B:306:0x015a, B:317:0x0162, B:332:0x0167, B:335:0x016c, B:337:0x0172, B:344:0x0178), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean n(android.view.KeyEvent r17, Qa.a r18) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.n(android.view.KeyEvent, Qa.a):boolean");
    }

    public t0.p o() {
        return this.c.L1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public boolean p(K0.c cVar, Qa.a aVar) {
        K0.a aVar2;
        int size;
        c0 s0;
        O0.m mVar;
        c0 s02;
        if (this.d.b()) {
            System.out.println("FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode x = x();
        if (x != null) {
            int a2 = g0.a(16384);
            if (!x.getNode().isAttached()) {
                L0.a.b("visitAncestors called on an unattached node");
            }
            e.c node = x.getNode();
            O0.J n = O0.k.n(x);
            loop0: while (true) {
                if (n == null) {
                    mVar = 0;
                    break;
                }
                if ((n.s0().k().getAggregateChildKindSet$ui_release() & a2) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & a2) != 0) {
                            ?? r12 = 0;
                            mVar = node;
                            while (mVar != 0) {
                                if (mVar instanceof K0.a) {
                                    break loop0;
                                }
                                if ((mVar.getKindSet$ui_release() & a2) == 0 || !(mVar instanceof O0.m)) {
                                    mVar = O0.k.b(r12);
                                } else {
                                    e.c F1 = mVar.F1();
                                    int i = 0;
                                    mVar = mVar;
                                    r12 = r12;
                                    while (F1 != null) {
                                        if ((F1.getKindSet$ui_release() & a2) != 0) {
                                            i++;
                                            r12 = r12;
                                            if (i == 1) {
                                                mVar = F1;
                                            } else {
                                                if (r12 == 0) {
                                                    r12 = new d0.c(new e.c[16], 0);
                                                }
                                                if (mVar != 0) {
                                                    r12.b(mVar);
                                                    mVar = 0;
                                                }
                                                r12.b(F1);
                                            }
                                        }
                                        F1 = F1.getChild$ui_release();
                                        mVar = mVar;
                                        r12 = r12;
                                    }
                                    if (i != 1) {
                                        mVar = O0.k.b(r12);
                                    }
                                }
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                n = n.z0();
                node = (n == null || (s02 = n.s0()) == null) ? null : s02.o();
            }
            aVar2 = (K0.a) mVar;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            int a3 = g0.a(16384);
            if (!aVar2.getNode().isAttached()) {
                L0.a.b("visitAncestors called on an unattached node");
            }
            e.c parent$ui_release = aVar2.getNode().getParent$ui_release();
            O0.J n2 = O0.k.n(aVar2);
            Collection collection = null;
            while (n2 != null) {
                if ((n2.s0().k().getAggregateChildKindSet$ui_release() & a3) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & a3) != 0) {
                            e.c cVar2 = parent$ui_release;
                            d0.c cVar3 = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof K0.a) {
                                    if (collection == null) {
                                        collection = new ArrayList();
                                    }
                                    collection.add(cVar2);
                                } else if ((cVar2.getKindSet$ui_release() & a3) != 0 && (cVar2 instanceof O0.m)) {
                                    int i2 = 0;
                                    for (e.c F12 = ((O0.m) cVar2).F1(); F12 != null; F12 = F12.getChild$ui_release()) {
                                        if ((F12.getKindSet$ui_release() & a3) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVar2 = F12;
                                            } else {
                                                if (cVar3 == null) {
                                                    cVar3 = new d0.c(new e.c[16], 0);
                                                }
                                                if (cVar2 != null) {
                                                    cVar3.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                cVar3.b(F12);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVar2 = O0.k.b(cVar3);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                n2 = n2.z0();
                parent$ui_release = (n2 == null || (s0 = n2.s0()) == null) ? null : s0.o();
            }
            if (collection != null && collection.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((K0.a) collection.get(size)).v0(cVar)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            O0.m node2 = aVar2.getNode();
            ?? r5 = 0;
            while (node2 != 0) {
                if (node2 instanceof K0.a) {
                    if (((K0.a) node2).v0(cVar)) {
                        return true;
                    }
                } else if ((node2.getKindSet$ui_release() & a3) != 0 && (node2 instanceof O0.m)) {
                    e.c F13 = node2.F1();
                    int i4 = 0;
                    node2 = node2;
                    r5 = r5;
                    while (F13 != null) {
                        if ((F13.getKindSet$ui_release() & a3) != 0) {
                            i4++;
                            r5 = r5;
                            if (i4 == 1) {
                                node2 = F13;
                            } else {
                                if (r5 == 0) {
                                    r5 = new d0.c(new e.c[16], 0);
                                }
                                if (node2 != 0) {
                                    r5.b(node2);
                                    node2 = 0;
                                }
                                r5.b(F13);
                            }
                        }
                        F13 = F13.getChild$ui_release();
                        node2 = node2;
                        r5 = r5;
                    }
                    if (i4 == 1) {
                    }
                }
                node2 = O0.k.b(r5);
            }
            if (((Boolean) aVar.invoke()).booleanValue()) {
                return true;
            }
            O0.m node3 = aVar2.getNode();
            ?? r52 = 0;
            while (node3 != 0) {
                if (node3 instanceof K0.a) {
                    if (((K0.a) node3).B0(cVar)) {
                        return true;
                    }
                } else if ((node3.getKindSet$ui_release() & a3) != 0 && (node3 instanceof O0.m)) {
                    e.c F14 = node3.F1();
                    int i5 = 0;
                    node3 = node3;
                    r52 = r52;
                    while (F14 != null) {
                        if ((F14.getKindSet$ui_release() & a3) != 0) {
                            i5++;
                            r52 = r52;
                            if (i5 == 1) {
                                node3 = F14;
                            } else {
                                if (r52 == 0) {
                                    r52 = new d0.c(new e.c[16], 0);
                                }
                                if (node3 != 0) {
                                    r52.b(node3);
                                    node3 = 0;
                                }
                                r52.b(F14);
                            }
                        }
                        F14 = F14.getChild$ui_release();
                        node3 = node3;
                        r52 = r52;
                    }
                    if (i5 == 1) {
                    }
                }
                node3 = O0.k.b(r52);
            }
            if (collection != null) {
                int size2 = collection.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((K0.a) collection.get(i6)).B0(cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public u0.h q() {
        FocusTargetNode x = x();
        if (x != null) {
            return p.d(x);
        }
        return null;
    }

    public void r(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.h;
        this.h = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            A(false);
        }
        if (o0.h.c) {
            L u = u();
            Object[] objArr = u.a;
            int i = u.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((t0.h) objArr[i2]).b(focusTargetNode2, focusTargetNode);
            }
        }
    }

    public void s() {
        o.b(this.c, true, true);
    }

    public void t(t0.e eVar) {
        this.d.g(eVar);
    }

    public L u() {
        return this.g;
    }

    public void v(boolean z) {
        m(z, true, true, androidx.compose.ui.focus.c.b.c());
    }

    public final boolean w(boolean z, boolean z2) {
        c0 s0;
        if (f() == null) {
            return true;
        }
        if (k() && !z) {
            return false;
        }
        FocusTargetNode f = f();
        r(null);
        if (z2 && f != null) {
            f.I1(k() ? t0.q.c : t0.q.a, t0.q.d);
            int a2 = g0.a(1024);
            if (!f.getNode().isAttached()) {
                L0.a.b("visitAncestors called on an unattached node");
            }
            e.c parent$ui_release = f.getNode().getParent$ui_release();
            O0.J n = O0.k.n(f);
            while (n != null) {
                if ((n.s0().k().getAggregateChildKindSet$ui_release() & a2) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & a2) != 0) {
                            d0.c cVar = null;
                            e.c cVar2 = parent$ui_release;
                            while (cVar2 != null) {
                                if (cVar2 instanceof FocusTargetNode) {
                                    ((FocusTargetNode) cVar2).I1(t0.q.b, t0.q.d);
                                } else if ((cVar2.getKindSet$ui_release() & a2) != 0 && (cVar2 instanceof O0.m)) {
                                    int i = 0;
                                    for (e.c F1 = ((O0.m) cVar2).F1(); F1 != null; F1 = F1.getChild$ui_release()) {
                                        if ((F1.getKindSet$ui_release() & a2) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar2 = F1;
                                            } else {
                                                if (cVar == null) {
                                                    cVar = new d0.c(new e.c[16], 0);
                                                }
                                                if (cVar2 != null) {
                                                    cVar.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                cVar.b(F1);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVar2 = O0.k.b(cVar);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                n = n.z0();
                parent$ui_release = (n == null || (s0 = n.s0()) == null) ? null : s0.o();
            }
        }
        return true;
    }

    public final FocusTargetNode x() {
        return p.b(this.c);
    }

    public final FocusTargetNode y() {
        return this.c;
    }

    public final e.c z(O0.j jVar) {
        int a2 = g0.a(1024) | g0.a(8192);
        if (!jVar.getNode().isAttached()) {
            L0.a.b("visitLocalDescendants called on an unattached node");
        }
        e.c node = jVar.getNode();
        e.c cVar = null;
        if ((node.getAggregateChildKindSet$ui_release() & a2) != 0) {
            for (e.c child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & a2) != 0) {
                    if ((g0.a(1024) & child$ui_release.getKindSet$ui_release()) != 0) {
                        return cVar;
                    }
                    cVar = child$ui_release;
                }
            }
        }
        return cVar;
    }
}
