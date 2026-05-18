package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Da.u;
import M0.B;
import Nb.c;
import O0.g;
import Qa.l;
import Qa.p;
import Sb.A;
import Sb.b;
import Sb.d;
import Sb.f;
import Sb.h;
import Sb.o;
import Sb.s;
import Sb.v;
import Sb.z;
import Tb.e;
import Z0.F;
import Z0.G;
import Z0.I0;
import Z0.U0;
import Z0.Y0;
import Z0.e;
import Z0.j;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.m2;
import b0.w;
import d1.H;
import d1.L;
import j0.i;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.t;
import l1.a;
import l1.j;
import l1.k;
import l1.q;
import v0.C1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MarkdownKt {
    private static final e parser = e.a().i(u.e(c.c())).g();

    public static final class 2 extends kotlin.jvm.internal.u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ h $fencedCodeBlock;
        final /* synthetic */ androidx.compose.ui.e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(h hVar, androidx.compose.ui.e eVar, int i, int i2) {
            super(2);
            this.$fencedCodeBlock = hVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            MarkdownKt.access$MDFencedCodeBlock(this.$fencedCodeBlock, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends kotlin.jvm.internal.u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final androidx.compose.ui.e invoke(androidx.compose.ui.e conditional) {
            t.g(conditional, "$this$conditional");
            return g.h(conditional, 0.0f, 1, (Object) null);
        }
    }

    public static final class 2 extends kotlin.jvm.internal.u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Y0 $style;
        final /* synthetic */ Z0.e $text;
        final /* synthetic */ boolean $textFillMaxWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Z0.e eVar, Y0 y0, boolean z, androidx.compose.ui.e eVar2, int i, int i2) {
            super(2);
            this.$text = eVar;
            this.$style = y0;
            this.$textFillMaxWidth = z;
            this.$modifier = eVar2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            MarkdownKt.access$MarkdownText(this.$text, this.$style, this.$textFillMaxWidth, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    private static final void MDBlockChildren-d8Fo1UA(s sVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, boolean z3, m mVar, int i) {
        int i2;
        int i3;
        m i4 = mVar.i(2035102511);
        if ((i & 6) == 0) {
            i2 = (i4.E(sVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i4.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i4.U(y0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i4.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i4.U(l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= i4.U(uVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= i4.U(jVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= i4.a(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= i4.a(z2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= i4.a(z3) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && i4.j()) {
            i4.M();
        } else {
            if (w.L()) {
                w.U(2035102511, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDBlockChildren (Markdown.kt:457)");
            }
            s c = sVar.c();
            while (c != null) {
                if (c instanceof b) {
                    i4.V(-1935094073);
                    i3 = i2;
                    MDBlockQuote-8V94_ZQ((b) c, j, z, l, null, i4, (i2 & 112) | ((i2 >> 15) & 896) | ((i2 >> 3) & 7168), 16);
                    i4.P();
                } else {
                    i3 = i2;
                    if (c instanceof Sb.j) {
                        i4.V(-1935090826);
                        MDHeading-JFVkrdg((Sb.j) c, j, y0, j2, l, uVar, jVar, z, z2, z3, null, i4, i3 & 2147483632, 0, 1024);
                        i4.P();
                    } else if (c instanceof v) {
                        i4.V(-1935080104);
                        MDParagraph-d8Fo1UA((v) c, j, y0, j2, l, uVar, jVar, z, z2, z3, i4, i3 & 2147483632);
                        i4.P();
                    } else {
                        if (c instanceof h) {
                            i4.V(-1935069412);
                            MDFencedCodeBlock((h) c, null, i4, 0, 2);
                            i4.P();
                        } else if (c instanceof Sb.c) {
                            i4.V(-1935067441);
                            MDBulletList-lzeOXFE((Sb.c) c, j, y0, j2, l, uVar, jVar, z, z2, i4, i3 & 268435440);
                            i4.P();
                        } else if (c instanceof Sb.u) {
                            i4.V(-1935057904);
                            MDOrderedList-lzeOXFE((Sb.u) c, j, y0, j2, l, uVar, jVar, z, z2, i4, i3 & 268435440);
                            i4.P();
                        } else {
                            i4.V(143014590);
                            i4.P();
                        }
                        c = c.e();
                        i2 = i3;
                    }
                }
                c = c.e();
                i2 = i3;
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = i4.l();
        if (l2 != null) {
            l2.a(new MarkdownKt$MDBlockChildren$1(sVar, j, y0, j2, l, uVar, jVar, z, z2, z3, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void MDBlockQuote-8V94_ZQ(Sb.b r39, long r40, boolean r42, d1.L r43, androidx.compose.ui.e r44, b0.m r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.MDBlockQuote-8V94_ZQ(Sb.b, long, boolean, d1.L, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void MDBulletList-lzeOXFE(Sb.c cVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1037984523);
        if ((i & 6) == 0) {
            i2 = (i3.E(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(y0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.U(l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= i3.U(uVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= i3.U(jVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= i3.a(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= i3.a(z2) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1037984523, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDBulletList (Markdown.kt:257)");
            }
            mVar2 = i3;
            MDListItems-JFVkrdg(cVar, j, y0, j2, l, uVar, jVar, z, z2, null, i.d(1682895250, true, new MarkdownKt$MDBulletList$1(resolveMarkdownTextStyle(y0, new Y0(j, j2, l, (H) null, (d1.I) null, uVar, (String) null, 0L, (a) null, (q) null, (h1.e) null, 0L, (k) null, (C1) null, (x0.g) null, jVar != null ? jVar.n() : j.b.g(), 0, 0L, (l1.s) null, (G) null, (l1.h) null, 0, 0, (l1.u) null, 16744408, (kotlin.jvm.internal.k) null)), z2, cVar.p(), j, z, l), i3, 54), mVar2, i2 & 268435454, 6, 512);
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = mVar2.l();
        if (l2 != null) {
            l2.a(new MarkdownKt$MDBulletList$2(cVar, j, y0, j2, l, uVar, jVar, z, z2, i));
        }
    }

    private static final void MDDocument-d8Fo1UA(f fVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, boolean z3, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-196481521);
        if ((i & 6) == 0) {
            i2 = (i3.E(fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(y0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.U(l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= i3.U(uVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= i3.U(jVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= i3.a(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= i3.a(z2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= i3.a(z3) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-196481521, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDDocument (Markdown.kt:129)");
            }
            MDBlockChildren-d8Fo1UA(fVar, j, y0, j2, l, uVar, jVar, z, z2, z3, i3, i2 & 2147483646);
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = i3.l();
        if (l2 != null) {
            l2.a(new MarkdownKt$MDDocument$1(fVar, j, y0, j2, l, uVar, jVar, z, z2, z3, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void MDFencedCodeBlock(Sb.h r58, androidx.compose.ui.e r59, b0.m r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.MDFencedCodeBlock(Sb.h, androidx.compose.ui.e, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void MDHeading-JFVkrdg(Sb.j r54, long r55, Z0.Y0 r57, long r58, d1.L r60, d1.u r61, l1.j r62, boolean r63, boolean r64, boolean r65, androidx.compose.ui.e r66, b0.m r67, int r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.MDHeading-JFVkrdg(Sb.j, long, Z0.Y0, long, d1.L, d1.u, l1.j, boolean, boolean, boolean, androidx.compose.ui.e, b0.m, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void MDListItems-JFVkrdg(Sb.q r31, long r32, Z0.Y0 r34, long r35, d1.L r37, d1.u r38, l1.j r39, boolean r40, boolean r41, androidx.compose.ui.e r42, Qa.q r43, b0.m r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.MDListItems-JFVkrdg(Sb.q, long, Z0.Y0, long, d1.L, d1.u, l1.j, boolean, boolean, androidx.compose.ui.e, Qa.q, b0.m, int, int, int):void");
    }

    private static final void MDOrderedList-lzeOXFE(Sb.u uVar, long j, Y0 y0, long j2, L l, d1.u uVar2, j jVar, boolean z, boolean z2, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1401481105);
        if ((i & 6) == 0) {
            i2 = (i3.E(uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(y0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.U(l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= i3.U(uVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= i3.U(jVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= i3.a(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= i3.a(z2) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1401481105, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDOrderedList (Markdown.kt:306)");
            }
            M m = new M();
            m.a = uVar.q();
            mVar2 = i3;
            MDListItems-JFVkrdg(uVar, j, y0, j2, l, uVar2, jVar, z, z2, null, i.d(-1609568168, true, new MarkdownKt$MDOrderedList$1(resolveMarkdownTextStyle(y0, new Y0(j, j2, l, (H) null, (d1.I) null, uVar2, (String) null, 0L, (a) null, (q) null, (h1.e) null, 0L, (k) null, (C1) null, (x0.g) null, jVar != null ? jVar.n() : j.b.g(), 0, 0L, (l1.s) null, (G) null, (l1.h) null, 0, 0, (l1.u) null, 16744408, (kotlin.jvm.internal.k) null)), z2, m, uVar.p(), j, z, l), i3, 54), mVar2, i2 & 268435454, 6, 512);
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = mVar2.l();
        if (l2 != null) {
            l2.a(new MarkdownKt$MDOrderedList$2(uVar, j, y0, j2, l, uVar2, jVar, z, z2, i));
        }
    }

    private static final void MDParagraph-d8Fo1UA(v vVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, boolean z3, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-581921093);
        if ((i & 6) == 0) {
            i2 = (i3.E(vVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(y0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.e(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.U(l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= i3.U(uVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= i3.U(jVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= i3.a(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= i3.a(z2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= i3.a(z3) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-581921093, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.MDParagraph (Markdown.kt:220)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, aVar);
            g.a aVar2 = O0.g.E8;
            int i4 = i2;
            Qa.a a2 = aVar2.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            Y0 resolveMarkdownTextStyle = resolveMarkdownTextStyle(y0, new Y0(j, z3 ? j2 : n1.v.b.a(), l, (H) null, (d1.I) null, uVar, (String) null, 0L, (a) null, (q) null, (h1.e) null, 0L, (k) null, (C1) null, (x0.g) null, jVar != null ? jVar.n() : j.b.g(), 0, 0L, (l1.s) null, (G) null, (l1.h) null, 0, 0, (l1.u) null, 16744408, (kotlin.jvm.internal.k) null));
            e.b bVar = new e.b(0, 1, (kotlin.jvm.internal.k) null);
            bVar.k(resolveMarkdownTextStyle.O());
            t.e(vVar, "null cannot be cast to non-null type org.commonmark.node.Node");
            appendMarkdownChildren-XO-JAsU(bVar, vVar, j, z, l);
            bVar.h();
            MarkdownText(bVar.l(), resolveMarkdownTextStyle, z2, null, i3, (i4 >> 18) & 896, 8);
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = i3.l();
        if (l2 != null) {
            l2.a(new MarkdownKt$MDParagraph$2(vVar, j, y0, j2, l, uVar, jVar, z, z2, z3, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Markdown-DkhmgE0(java.lang.String r32, androidx.compose.ui.e r33, long r34, Z0.Y0 r36, long r37, d1.L r39, d1.u r40, o0.e.b r41, l1.j r42, boolean r43, boolean r44, boolean r45, b0.m r46, int r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.Markdown-DkhmgE0(java.lang.String, androidx.compose.ui.e, long, Z0.Y0, long, d1.L, d1.u, o0.e$b, l1.j, boolean, boolean, boolean, b0.m, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void MarkdownText(Z0.e r32, Z0.Y0 r33, boolean r34, androidx.compose.ui.e r35, b0.m r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt.MarkdownText(Z0.e, Z0.Y0, boolean, androidx.compose.ui.e, b0.m, int, int):void");
    }

    public static final /* synthetic */ void access$MDBlockChildren-d8Fo1UA(s sVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, boolean z3, m mVar, int i) {
        MDBlockChildren-d8Fo1UA(sVar, j, y0, j2, l, uVar, jVar, z, z2, z3, mVar, i);
    }

    public static final /* synthetic */ void access$MDBlockQuote-8V94_ZQ(b bVar, long j, boolean z, L l, androidx.compose.ui.e eVar, m mVar, int i, int i2) {
        MDBlockQuote-8V94_ZQ(bVar, j, z, l, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$MDBulletList-lzeOXFE(Sb.c cVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, m mVar, int i) {
        MDBulletList-lzeOXFE(cVar, j, y0, j2, l, uVar, jVar, z, z2, mVar, i);
    }

    public static final /* synthetic */ void access$MDDocument-d8Fo1UA(f fVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, boolean z3, m mVar, int i) {
        MDDocument-d8Fo1UA(fVar, j, y0, j2, l, uVar, jVar, z, z2, z3, mVar, i);
    }

    public static final /* synthetic */ void access$MDFencedCodeBlock(h hVar, androidx.compose.ui.e eVar, m mVar, int i, int i2) {
        MDFencedCodeBlock(hVar, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$MDHeading-JFVkrdg(Sb.j jVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar2, boolean z, boolean z2, boolean z3, androidx.compose.ui.e eVar, m mVar, int i, int i2, int i3) {
        MDHeading-JFVkrdg(jVar, j, y0, j2, l, uVar, jVar2, z, z2, z3, eVar, mVar, i, i2, i3);
    }

    public static final /* synthetic */ void access$MDListItems-JFVkrdg(Sb.q qVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, androidx.compose.ui.e eVar, Qa.q qVar2, m mVar, int i, int i2, int i3) {
        MDListItems-JFVkrdg(qVar, j, y0, j2, l, uVar, jVar, z, z2, eVar, qVar2, mVar, i, i2, i3);
    }

    public static final /* synthetic */ void access$MDOrderedList-lzeOXFE(Sb.u uVar, long j, Y0 y0, long j2, L l, d1.u uVar2, j jVar, boolean z, boolean z2, m mVar, int i) {
        MDOrderedList-lzeOXFE(uVar, j, y0, j2, l, uVar2, jVar, z, z2, mVar, i);
    }

    public static final /* synthetic */ void access$MDParagraph-d8Fo1UA(v vVar, long j, Y0 y0, long j2, L l, d1.u uVar, j jVar, boolean z, boolean z2, boolean z3, m mVar, int i) {
        MDParagraph-d8Fo1UA(vVar, j, y0, j2, l, uVar, jVar, z, z2, z3, mVar, i);
    }

    public static final /* synthetic */ void access$MarkdownText(Z0.e eVar, Y0 y0, boolean z, androidx.compose.ui.e eVar2, m mVar, int i, int i2) {
        MarkdownText(eVar, y0, z, eVar2, mVar, i, i2);
    }

    public static final /* synthetic */ void access$appendMarkdownChildren-XO-JAsU(e.b bVar, s sVar, long j, boolean z, L l) {
        appendMarkdownChildren-XO-JAsU(bVar, sVar, j, z, l);
    }

    private static final void appendMarkdownChildren-XO-JAsU(e.b bVar, s sVar, long j, boolean z, L l) {
        for (s c = sVar.c(); c != null; c = c.e()) {
            if (c instanceof v) {
                appendMarkdownChildren-XO-JAsU(bVar, c, j, z, l);
            } else if (c instanceof A) {
                String n = ((A) c).n();
                t.f(n, "child.literal");
                bVar.g(n);
            } else if (c instanceof Sb.g) {
                bVar.k(new I0(0L, 0L, (L) null, H.c(H.b.a()), (d1.I) null, (d1.u) null, (String) null, 0L, (a) null, (q) null, (h1.e) null, 0L, (k) null, (C1) null, (F) null, (x0.g) null, 65527, (kotlin.jvm.internal.k) null));
                appendMarkdownChildren-XO-JAsU(bVar, c, j, z, l);
                bVar.h();
            } else if (c instanceof z) {
                int o = l != null ? l.o() : 0;
                L.a aVar = L.b;
                L b = o > aVar.b().o() ? l : aVar.b();
                bVar.k(new I0(0L, 0L, b, (H) null, (d1.I) null, (d1.u) null, (String) null, 0L, (a) null, (q) null, (h1.e) null, 0L, (k) null, (C1) null, (F) null, (x0.g) null, 65531, (kotlin.jvm.internal.k) null));
                appendMarkdownChildren-XO-JAsU(bVar, c, j, z, b);
                bVar.h();
            } else if (c instanceof d) {
                bVar.k(new Y0(0L, 0L, (L) null, (H) null, (d1.I) null, d1.u.b.c(), (String) null, 0L, (a) null, (q) null, (h1.e) null, 0L, (k) null, (C1) null, (x0.g) null, 0, 0, 0L, (l1.s) null, (G) null, (l1.h) null, 0, 0, (l1.u) null, 16777183, (kotlin.jvm.internal.k) null).O());
                String n2 = ((d) c).n();
                t.f(n2, "child.literal");
                bVar.g(n2);
                bVar.h();
            } else if (c instanceof Sb.i ? true : c instanceof Sb.w) {
                t.f(bVar.append('\n'), "append(...)");
            } else if (c instanceof o) {
                if (z) {
                    I0 i0 = new I0(j, 0L, (L) null, (H) null, (d1.I) null, (d1.u) null, (String) null, 0L, (a) null, (q) null, (h1.e) null, 0L, k.b.d(), (C1) null, (F) null, (x0.g) null, 61438, (kotlin.jvm.internal.k) null);
                    String n3 = ((o) c).n();
                    t.f(n3, "child.destination");
                    int j2 = bVar.j(new j.b(n3, new U0(i0, (I0) null, (I0) null, (I0) null, 14, (kotlin.jvm.internal.k) null), (Z0.k) null, 4, (kotlin.jvm.internal.k) null));
                    try {
                        appendMarkdownChildren-XO-JAsU(bVar, c, j, true, l);
                        I i = I.a;
                    } finally {
                        bVar.i(j2);
                    }
                } else {
                    appendMarkdownChildren-XO-JAsU(bVar, c, j, false, l);
                }
            } else if (c instanceof Nb.a) {
                bVar.k(new Y0(0L, 0L, (L) null, (H) null, (d1.I) null, (d1.u) null, (String) null, 0L, (a) null, (q) null, (h1.e) null, 0L, k.b.b(), (C1) null, (x0.g) null, 0, 0, 0L, (l1.s) null, (G) null, (l1.h) null, 0, 0, (l1.u) null, 16773119, (kotlin.jvm.internal.k) null).O());
                appendMarkdownChildren-XO-JAsU(bVar, c, j, z, l);
                bVar.h();
            }
        }
    }

    private static final Y0 resolveMarkdownTextStyle(Y0 y0, Y0 y02) {
        return y0.K(y02);
    }
}
