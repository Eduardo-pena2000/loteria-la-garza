package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import F.L;
import F.Y;
import F.f;
import F.i0;
import F.o;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import X.E;
import X.i;
import X.j;
import X.k;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o0.e;
import v0.E1;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt {
    private static final long RevenueCatBrandRed = s0.d(4294071387L);

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ a $onPurchase;
        final /* synthetic */ a $onRestore;
        final /* synthetic */ l $onSelectPackage;
        final /* synthetic */ List $packages;
        final /* synthetic */ DefaultPaywallPreviewOverrides $previewOverrides;
        final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage;
        final /* synthetic */ PaywallWarning $warning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(List list, TemplateConfiguration.PackageInfo packageInfo, PaywallWarning paywallWarning, l lVar, a aVar, a aVar2, e eVar, DefaultPaywallPreviewOverrides defaultPaywallPreviewOverrides, int i, int i2) {
            super(2);
            this.$packages = list;
            this.$selectedPackage = packageInfo;
            this.$warning = paywallWarning;
            this.$onSelectPackage = lVar;
            this.$onPurchase = aVar;
            this.$onRestore = aVar2;
            this.$modifier = eVar;
            this.$previewOverrides = defaultPaywallPreviewOverrides;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            DefaultPaywallViewKt.DefaultPaywallView(this.$packages, this.$selectedPackage, this.$warning, this.$onSelectPackage, this.$onPurchase, this.$onRestore, this.$modifier, this.$previewOverrides, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void AppIconSection-cf5BqRc(android.graphics.Bitmap r36, java.lang.String r37, long r38, androidx.compose.ui.e r40, b0.m r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.AppIconSection-cf5BqRc(android.graphics.Bitmap, java.lang.String, long, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void DefaultPaywallFooter-ZkgLGzA(a aVar, a aVar2, boolean z, long j, long j2, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-1968152504);
        if ((i & 6) == 0) {
            i2 = (i3.E(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(aVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.a(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.e(j2) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1968152504, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallFooter (DefaultPaywallView.kt:245)");
            }
            e.a aVar3 = e.a;
            e h = g.h(aVar3, 0.0f, 1, (Object) null);
            E e = E.a;
            int i4 = E.b;
            e d = androidx.compose.foundation.a.d(h, r0.q(e.a(i3, i4).H(), 0.95f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (E1) null, 2, (Object) null);
            e.a aVar4 = o0.e.a;
            B h2 = f.h(aVar4.e(), false);
            int a = h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = c.f(i3, d);
            g.a aVar5 = O0.g.E8;
            a a2 = aVar5.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h2, aVar5.e());
            m2.e(b, r, aVar5.g());
            p b2 = aVar5.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar5.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            androidx.compose.ui.e i5 = androidx.compose.foundation.layout.f.i(i0.a(androidx.compose.foundation.layout.g.h(androidx.compose.foundation.layout.g.x(aVar3, 0.0f, ReadableContentWidth.INSTANCE.getDp-D9Ej5fM(), 1, (Object) null), 0.0f, 1, (Object) null)), n1.h.g(16));
            B a3 = F.l.a(F.c.a.h(), aVar4.g(), i3, 48);
            int a4 = h.a(i3, 0);
            b0.I r2 = i3.r();
            androidx.compose.ui.e f2 = c.f(i3, i5);
            a a5 = aVar5.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a5);
            } else {
                i3.s();
            }
            m b3 = m2.b(i3);
            m2.e(b3, a3, aVar5.e());
            m2.e(b3, r2, aVar5.g());
            p b4 = aVar5.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a4))) {
                b3.t(Integer.valueOf(a4));
                b3.J(Integer.valueOf(a4), b4);
            }
            m2.e(b3, f2, aVar5.f());
            o oVar = o.a;
            i iVar = i.a;
            int i6 = i.o;
            X.h b5 = iVar.b(j, j2, 0L, 0L, i3, ((i2 >> 9) & 126) | (i6 << 12), 12);
            androidx.compose.ui.e i7 = androidx.compose.foundation.layout.g.i(androidx.compose.foundation.layout.g.h(androidx.compose.foundation.layout.g.x(aVar3, 0.0f, n1.h.g(480), 1, (Object) null), 0.0f, 1, (Object) null), n1.h.g(52));
            ComposableSingletons$DefaultPaywallViewKt composableSingletons$DefaultPaywallViewKt = ComposableSingletons$DefaultPaywallViewKt.INSTANCE;
            k.a(aVar, i7, z, (E1) null, b5, (j) null, (A.i) null, (L) null, (E.m) null, composableSingletons$DefaultPaywallViewKt.getLambda-2$revenuecatui_defaultsBc8Release(), i3, (i2 & 14) | 805306416 | (i2 & 896), 488);
            Y.a(androidx.compose.foundation.layout.g.i(aVar3, n1.h.g(8)), i3, 6);
            k.c(aVar2, (androidx.compose.ui.e) null, false, (E1) null, iVar.r(0L, e.a(i3, i4).w(), 0L, 0L, i3, i6 << 12, 13), (j) null, (A.i) null, (L) null, (E.m) null, composableSingletons$DefaultPaywallViewKt.getLambda-3$revenuecatui_defaultsBc8Release(), i3, ((i2 >> 3) & 14) | 805306368, 494);
            i3.v();
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new DefaultPaywallViewKt$DefaultPaywallFooter$2(aVar, aVar2, z, j, j2, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DefaultPaywallView(java.util.List r40, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageInfo r41, com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning r42, Qa.l r43, Qa.a r44, Qa.a r45, androidx.compose.ui.e r46, com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewOverrides r47, b0.m r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt.DefaultPaywallView(java.util.List, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$PackageInfo, com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning, Qa.l, Qa.a, Qa.a, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreviewOverrides, b0.m, int, int):void");
    }

    private static final Bitmap DefaultPaywallView$lambda$3(C0 c0) {
        return (Bitmap) c0.getValue();
    }

    private static final void DefaultPaywallView$lambda$4(C0 c0, Bitmap bitmap) {
        c0.setValue(bitmap);
    }

    private static final List DefaultPaywallView$lambda$6(C0 c0) {
        return (List) c0.getValue();
    }

    private static final void DefaultPaywallView$lambda$7(C0 c0, List list) {
        c0.setValue(list);
    }

    public static final /* synthetic */ void access$AppIconSection-cf5BqRc(Bitmap bitmap, String str, long j, androidx.compose.ui.e eVar, m mVar, int i, int i2) {
        AppIconSection-cf5BqRc(bitmap, str, j, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$DefaultPaywallFooter-ZkgLGzA(a aVar, a aVar2, boolean z, long j, long j2, m mVar, int i) {
        DefaultPaywallFooter-ZkgLGzA(aVar, aVar2, z, j, j2, mVar, i);
    }

    public static final /* synthetic */ Bitmap access$DefaultPaywallView$lambda$3(C0 c0) {
        return DefaultPaywallView$lambda$3(c0);
    }

    public static final /* synthetic */ void access$DefaultPaywallView$lambda$4(C0 c0, Bitmap bitmap) {
        DefaultPaywallView$lambda$4(c0, bitmap);
    }

    public static final /* synthetic */ void access$DefaultPaywallView$lambda$7(C0 c0, List list) {
        DefaultPaywallView$lambda$7(c0, list);
    }

    public static final /* synthetic */ long access$getRevenueCatBrandRed$p() {
        return RevenueCatBrandRed;
    }

    private static /* synthetic */ void getRevenueCatBrandRed$annotations() {
    }
}
