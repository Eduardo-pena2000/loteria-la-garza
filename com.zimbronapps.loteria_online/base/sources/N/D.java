package N;

import Z0.T0;
import Z0.Y0;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.b;
import b0.C0;
import b0.g1;
import d1.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v0.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ String a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ Y0 c;
        public final /* synthetic */ Qa.l d;
        public final /* synthetic */ int e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;
        public final /* synthetic */ t0 i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, androidx.compose.ui.e eVar, Y0 y0, Qa.l lVar, int i, boolean z, int i2, int i3, t0 t0Var, int i4, int i5) {
            super(2);
            this.a = str;
            this.b = eVar;
            this.c = y0;
            this.d = lVar;
            this.e = i;
            this.f = z;
            this.g = i2;
            this.h = i3;
            this.i = t0Var;
            this.j = i4;
            this.k = i5;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            d.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, mVar, g1.a(this.j | 1), this.k);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ C0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0 c0) {
            super(1);
            this.a = c0;
        }

        public final void a(b.a aVar) {
            d.f(this.a, aVar.d() ? aVar.c() : aVar.b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((b.a) obj);
            return Ca.I.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Z0.e a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ Y0 c;
        public final /* synthetic */ Qa.l d;
        public final /* synthetic */ int e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;
        public final /* synthetic */ Map i;
        public final /* synthetic */ t0 j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Z0.e eVar, androidx.compose.ui.e eVar2, Y0 y0, Qa.l lVar, int i, boolean z, int i2, int i3, Map map, t0 t0Var, int i4, int i5) {
            super(2);
            this.a = eVar;
            this.b = eVar2;
            this.c = y0;
            this.d = lVar;
            this.e = i;
            this.f = z;
            this.g = i2;
            this.h = i3;
            this.i = map;
            this.j = t0Var;
            this.k = i4;
            this.l = i5;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            d.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, mVar, g1.a(this.k | 1), this.l);
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ c0 a;
        public final /* synthetic */ Qa.l b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c0 c0Var, Qa.l lVar) {
            super(1);
            this.a = c0Var;
            this.b = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((T0) obj);
            return Ca.I.a;
        }

        public final void invoke(T0 t0) {
            c0 c0Var = this.a;
            if (c0Var != null) {
                c0Var.u(t0);
            }
            Qa.l lVar = this.b;
            if (lVar != null) {
                lVar.invoke(t0);
            }
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ c0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c0 c0Var) {
            super(0);
            this.a = c0Var;
        }

        public final Boolean invoke() {
            c0 c0Var = this.a;
            return Boolean.valueOf(c0Var != null ? ((Boolean) c0Var.o().invoke()).booleanValue() : false);
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ c0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c0 c0Var) {
            super(0);
            this.a = c0Var;
        }

        public final Boolean invoke() {
            c0 c0Var = this.a;
            return Boolean.valueOf(c0Var != null ? ((Boolean) c0Var.o().invoke()).booleanValue() : false);
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ C0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C0 c0) {
            super(0);
            this.a = c0;
        }

        public final List invoke() {
            C0 c0 = this.a;
            if (c0 != null) {
                return (List) c0.getValue();
            }
            return null;
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Z0.e b;
        public final /* synthetic */ Qa.l c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ Y0 f;
        public final /* synthetic */ int g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;
        public final /* synthetic */ u.b k;
        public final /* synthetic */ S.g l;
        public final /* synthetic */ t0 m;
        public final /* synthetic */ Qa.l n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.compose.ui.e eVar, Z0.e eVar2, Qa.l lVar, boolean z, Map map, Y0 y0, int i, boolean z2, int i2, int i3, u.b bVar, S.g gVar, t0 t0Var, Qa.l lVar2, int i4, int i5, int i6) {
            super(2);
            this.a = eVar;
            this.b = eVar2;
            this.c = lVar;
            this.d = z;
            this.e = map;
            this.f = y0;
            this.g = i;
            this.h = z2;
            this.i = i2;
            this.j = i3;
            this.k = bVar;
            this.m = t0Var;
            this.n = lVar2;
            this.o = i4;
            this.p = i5;
            this.q = i6;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            d.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, mVar, g1.a(this.o | 1), g1.a(this.p), this.q);
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ C0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C0 c0) {
            super(1);
            this.a = c0;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List) obj);
            return Ca.I.a;
        }

        public final void invoke(List list) {
            C0 c0 = this.a;
            if (c0 == null) {
                return;
            }
            c0.setValue(list);
        }
    }

    public static final class j extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ c0 a;
        public final /* synthetic */ Z0.e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(c0 c0Var, Z0.e eVar) {
            super(0);
            this.a = c0Var;
            this.b = eVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.e invoke() {
            Z0.e n;
            c0 c0Var = this.a;
            return (c0Var == null || (n = c0Var.n()) == null) ? this.b : n;
        }
    }

    public static final class k extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ Z0.e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Z0.e eVar) {
            super(0);
            this.a = eVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.e invoke() {
            return this.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(Z0.e r52, androidx.compose.ui.e r53, Z0.Y0 r54, Qa.l r55, int r56, boolean r57, int r58, int r59, java.util.Map r60, v0.t0 r61, b0.m r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.d.a(Z0.e, androidx.compose.ui.e, Z0.Y0, Qa.l, int, boolean, int, int, java.util.Map, v0.t0, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r42, androidx.compose.ui.e r43, Z0.Y0 r44, Qa.l r45, int r46, boolean r47, int r48, int r49, v0.t0 r50, b0.m r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.d.b(java.lang.String, androidx.compose.ui.e, Z0.Y0, Qa.l, int, boolean, int, int, v0.t0, b0.m, int, int):void");
    }

    public static final Z0.e c(C0 c0) {
        return (Z0.e) c0.getValue();
    }

    public static final void d(C0 c0, Z0.e eVar) {
        c0.setValue(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.e r46, Z0.e r47, Qa.l r48, boolean r49, java.util.Map r50, Z0.Y0 r51, int r52, boolean r53, int r54, int r55, d1.u.b r56, S.g r57, v0.t0 r58, Qa.l r59, b0.m r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.d.e(androidx.compose.ui.e, Z0.e, Qa.l, boolean, java.util.Map, Z0.Y0, int, boolean, int, int, d1.u$b, S.g, v0.t0, Qa.l, b0.m, int, int, int):void");
    }

    public static final /* synthetic */ void f(C0 c0, Z0.e eVar) {
        d(c0, eVar);
    }

    public static final /* synthetic */ void g(androidx.compose.ui.e eVar, Z0.e eVar2, Qa.l lVar, boolean z, Map map, Y0 y0, int i2, boolean z2, int i3, int i4, u.b bVar, S.g gVar, t0 t0Var, Qa.l lVar2, b0.m mVar, int i5, int i6, int i7) {
        e(eVar, eVar2, lVar, z, map, y0, i2, z2, i3, i4, bVar, gVar, t0Var, lVar2, mVar, i5, i6, i7);
    }

    public static final /* synthetic */ List h(List list, Qa.a aVar) {
        return i(list, aVar);
    }

    public static final List i(List list, Qa.a aVar) {
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            return null;
        }
        g0 g0Var = new g0();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            M0.A a2 = (M0.A) list.get(i2);
            Object j2 = a2.j();
            kotlin.jvm.internal.t.e(j2, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            f0 a3 = ((h0) j2).b().a(g0Var);
            arrayList.add(new Ca.q(a2.C0(n1.b.b.b(a3.c(), a3.c(), a3.a(), a3.a())), a3.b()));
        }
        return arrayList;
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, Z0.e eVar2, Y0 y0, Qa.l lVar, int i2, boolean z, int i3, int i4, u.b bVar, List list, Qa.l lVar2, S.g gVar, t0 t0Var, Qa.l lVar3) {
        return eVar.then(androidx.compose.ui.e.a).then(new TextAnnotatedStringElement(eVar2, y0, bVar, lVar, i2, z, i3, i4, list, lVar2, null, t0Var, lVar3, null));
    }
}
