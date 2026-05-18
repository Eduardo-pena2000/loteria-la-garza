package B;

import Ca.I;
import F.n;
import Qa.l;
import Qa.p;
import Qa.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;
import r1.s;
import r1.t;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k {
    public static final t a = new t(true, false, false, false, 14, (kotlin.jvm.internal.k) null);
    public static final B.b b;

    public static final class a extends u implements p {
        public final /* synthetic */ B.b a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ q c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B.b bVar, androidx.compose.ui.e eVar, q qVar, int i, int i2) {
            super(2);
            this.a = bVar;
            this.b = eVar;
            this.c = qVar;
            this.d = i;
            this.e = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            k.a(this.a, this.b, this.c, mVar, g1.a(this.d | 1), this.e);
        }
    }

    public static final class b extends u implements Qa.a {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Qa.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, Qa.a aVar) {
            super(0);
            this.a = z;
            this.b = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            if (this.a) {
                this.b.invoke();
            }
        }
    }

    public static final class c extends u implements p {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ B.b c;
        public final /* synthetic */ androidx.compose.ui.e d;
        public final /* synthetic */ q e;
        public final /* synthetic */ Qa.a f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z, B.b bVar, androidx.compose.ui.e eVar, q qVar, Qa.a aVar, int i, int i2) {
            super(2);
            this.a = str;
            this.b = z;
            this.c = bVar;
            this.d = eVar;
            this.e = qVar;
            this.f = aVar;
            this.g = i;
            this.h = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            k.b(this.a, this.b, this.c, this.d, this.e, this.f, mVar, g1.a(this.g | 1), this.h);
        }
    }

    public static final class d extends u implements p {
        public final /* synthetic */ s a;
        public final /* synthetic */ Qa.a b;
        public final /* synthetic */ androidx.compose.ui.e c;
        public final /* synthetic */ l d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s sVar, Qa.a aVar, androidx.compose.ui.e eVar, l lVar, int i, int i2) {
            super(2);
            this.a = sVar;
            this.b = aVar;
            this.c = eVar;
            this.d = lVar;
            this.e = i;
            this.f = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            k.d(this.a, this.b, this.c, this.d, mVar, g1.a(this.e | 1), this.f);
        }
    }

    public static final class e extends u implements p {
        public final /* synthetic */ B.b a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ l c;

        public static final class a extends u implements q {
            public final /* synthetic */ l a;
            public final /* synthetic */ B.b b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, B.b bVar) {
                super(3);
                this.a = lVar;
                this.b = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((n) obj, (m) obj2, ((Number) obj3).intValue());
                return I.a;
            }

            public final void invoke(n nVar, m mVar, int i) {
                if ((i & 17) == 16 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (w.L()) {
                    w.U(1156688164, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)");
                }
                Object C = mVar.C();
                if (C == m.a.a()) {
                    C = new g();
                    mVar.t(C);
                }
                g gVar = (g) C;
                l lVar = this.a;
                B.b bVar = this.b;
                gVar.b();
                lVar.invoke(gVar);
                gVar.a(bVar, mVar, 0);
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(B.b bVar, androidx.compose.ui.e eVar, l lVar) {
            super(2);
            this.a = bVar;
            this.b = eVar;
            this.c = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(795909757, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.android.kt:127)");
            }
            B.b bVar = this.a;
            k.a(bVar, this.b, j0.i.d(1156688164, true, new a(this.c, bVar), mVar, 54), mVar, 384, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class f extends u implements p {
        public final /* synthetic */ s a;
        public final /* synthetic */ Qa.a b;
        public final /* synthetic */ androidx.compose.ui.e c;
        public final /* synthetic */ B.b d;
        public final /* synthetic */ l e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(s sVar, Qa.a aVar, androidx.compose.ui.e eVar, B.b bVar, l lVar, int i, int i2) {
            super(2);
            this.a = sVar;
            this.b = aVar;
            this.c = eVar;
            this.d = bVar;
            this.e = lVar;
            this.f = i;
            this.g = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            k.c(this.a, this.b, this.c, this.d, this.e, mVar, g1.a(this.f | 1), this.g);
        }
    }

    static {
        r0.a aVar = r0.b;
        b = new B.b(aVar.k(), aVar.a(), aVar.a(), r0.q(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), r0.q(aVar.a(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(B.b r23, androidx.compose.ui.e r24, Qa.q r25, b0.m r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.k.a(B.b, androidx.compose.ui.e, Qa.q, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r30, boolean r31, B.b r32, androidx.compose.ui.e r33, Qa.q r34, Qa.a r35, b0.m r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.k.b(java.lang.String, boolean, B.b, androidx.compose.ui.e, Qa.q, Qa.a, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(r1.s r16, Qa.a r17, androidx.compose.ui.e r18, B.b r19, Qa.l r20, b0.m r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.k.c(r1.s, Qa.a, androidx.compose.ui.e, B.b, Qa.l, b0.m, int, int):void");
    }

    public static final void d(s sVar, Qa.a aVar, androidx.compose.ui.e eVar, l lVar, m mVar, int i, int i2) {
        int i3;
        m i4 = mVar.i(712057293);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.U(sVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.E(aVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.U(eVar) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= i4.E(lVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                eVar = androidx.compose.ui.e.a;
            }
            if (w.L()) {
                w.U(712057293, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            c(sVar, aVar, eVar, e(0, 0, i4, 0, 3), lVar, i4, (i3 & 1022) | ((i3 << 3) & 57344), 0);
            if (w.L()) {
                w.T();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        B1 l = i4.l();
        if (l != null) {
            l.a(new d(sVar, aVar, eVar2, lVar, i, i2));
        }
    }

    public static final B.b e(int i, int i2, m mVar, int i3, int i4) {
        int i5 = (i4 & 1) != 0 ? 16973958 : i;
        int i6 = (i4 & 2) != 0 ? 16973952 : i2;
        if (w.L()) {
            w.U(1689505294, i3, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)");
        }
        Context context = (Context) mVar.x(AndroidCompositionLocals_androidKt.g());
        boolean U = mVar.U((Configuration) mVar.x(AndroidCompositionLocals_androidKt.f())) | mVar.U(context);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            B.b bVar = b;
            long h = h(context, i5, 16842801, bVar.a());
            ColorStateList i7 = i(context, i6, 16842806);
            long g = g(i7, bVar.e());
            long f2 = f(i7, bVar.c());
            C = new B.b(h, g, g, f2, f2, null);
            mVar.t(C);
        }
        B.b bVar2 = (B.b) C;
        if (w.L()) {
            w.T();
        }
        return bVar2;
    }

    public static final long f(ColorStateList colorStateList, long j) {
        int k = s0.k(j);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, k)) : null;
        return (valueOf == null || valueOf.intValue() == k) ? j : s0.b(valueOf.intValue());
    }

    public static final long g(ColorStateList colorStateList, long j) {
        int k = s0.k(j);
        Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{16842910}, k)) : null;
        return (valueOf == null || valueOf.intValue() == k) ? j : s0.b(valueOf.intValue());
    }

    public static final long h(Context context, int i, int i2, long j) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        int k = s0.k(j);
        int color = obtainStyledAttributes.getColor(0, k);
        obtainStyledAttributes.recycle();
        return color == k ? j : s0.b(color);
    }

    public static final ColorStateList i(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        obtainStyledAttributes.recycle();
        return colorStateList;
    }
}
