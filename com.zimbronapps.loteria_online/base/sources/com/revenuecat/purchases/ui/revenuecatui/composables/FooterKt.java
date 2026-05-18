package com.revenuecat.purchases.ui.revenuecatui.composables;

import A.i;
import Ca.I;
import Da.D;
import Da.r;
import Da.v;
import F.L;
import F.V;
import F.c;
import F.o;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import U0.f;
import W0.s;
import X.j;
import X.k;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ColorsFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template2TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.UrisKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o0.e;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FooterKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ a $allPlansTapped;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration $templateConfiguration;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TemplateConfiguration templateConfiguration, PaywallViewModel paywallViewModel, e eVar, TemplateConfiguration.Colors colors, a aVar, int i, int i2) {
            super(2);
            this.$templateConfiguration = templateConfiguration;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$colors = colors;
            this.$allPlansTapped = aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            FooterKt.Footer(this.$templateConfiguration, this.$viewModel, this.$childModifier, this.$colors, this.$allPlansTapped, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ a $allPlansTapped;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallData.Configuration $configuration;
        final /* synthetic */ PaywallMode $mode;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(PaywallMode paywallMode, PaywallData.Configuration configuration, TemplateConfiguration.Colors colors, PaywallViewModel paywallViewModel, e eVar, a aVar, int i, int i2) {
            super(2);
            this.$mode = paywallMode;
            this.$configuration = configuration;
            this.$colors = colors;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$allPlansTapped = aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            FooterKt.access$Footer(this.$mode, this.$configuration, this.$colors, this.$viewModel, this.$childModifier, this.$allPlansTapped, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            FooterKt.access$FooterPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context) {
            super(1);
            this.$context = context;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return I.a;
        }

        public final void invoke(Exception exception) {
            t.g(exception, "exception");
            String string = exception instanceof ActivityNotFoundException ? this.$context.getString(R.string.no_browser_cannot_open_link) : this.$context.getString(R.string.cannot_open_link);
            t.f(string, "if (exception is Activit…nnot_open_link)\n        }");
            Toast.makeText(this.$context, string, 0).show();
            Logger.INSTANCE.w(string);
        }
    }

    private static final void Button-sW7UJKQ(V v, long j, e eVar, int[] iArr, a aVar, m mVar, int i) {
        m mVar2;
        m i2 = mVar.i(-806477784);
        int i3 = (i & 6) == 0 ? (i2.U(v) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= i2.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= i2.U(eVar) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            i3 |= i2.E(aVar) ? 16384 : 8192;
        }
        i2.H(2066969951, Integer.valueOf(iArr.length));
        for (int i4 : iArr) {
            i3 |= i2.d(i4) ? 2048 : 0;
        }
        i2.S();
        if ((i3 & 7168) == 0) {
            i3 |= 1024;
        }
        int i5 = i3;
        if ((i5 & 9363) == 9362 && i2.j()) {
            i2.M();
            mVar2 = i2;
        } else {
            if (w.L()) {
                w.U(-806477784, i5, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Button (Footer.kt:192)");
            }
            String a = f.a(r.T(iArr), i2, 0);
            e.a aVar2 = e.a;
            e c = V.c(v, aVar2, 1.0f, false, 2, (Object) null);
            e.a aVar3 = o0.e.a;
            androidx.compose.ui.e b = v.b(c, aVar3.i());
            B a2 = F.l.a(c.a.h(), aVar3.k(), i2, 0);
            int a3 = h.a(i2, 0);
            b0.I r = i2.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i2, b);
            g.a aVar4 = g.E8;
            a a4 = aVar4.a();
            if (i2.k() == null) {
                h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a4);
            } else {
                i2.s();
            }
            m b2 = m2.b(i2);
            m2.e(b2, a2, aVar4.e());
            m2.e(b2, r, aVar4.g());
            p b3 = aVar4.b();
            if (b2.f() || !t.c(b2.C(), Integer.valueOf(a3))) {
                b2.t(Integer.valueOf(a3));
                b2.J(Integer.valueOf(a3), b3);
            }
            m2.e(b2, f, aVar4.f());
            o oVar = o.a;
            i2.V(814442768);
            boolean z = (i5 & 57344) == 16384;
            Object C = i2.C();
            if (z || C == m.a.a()) {
                C = new FooterKt$Button$1$1$1(aVar);
                i2.t(C);
            }
            Xa.f fVar = (Xa.f) C;
            i2.P();
            L a5 = androidx.compose.foundation.layout.f.a(n1.h.g(4));
            androidx.compose.ui.e c2 = oVar.c(aVar2, aVar3.g());
            i2.V(814449071);
            boolean U = i2.U(a);
            Object C2 = i2.C();
            if (U || C2 == m.a.a()) {
                C2 = new FooterKt$Button$1$2$1(a);
                i2.t(C2);
            }
            i2.P();
            mVar2 = i2;
            k.c((a) fVar, s.e(c2, true, (l) C2), false, (E1) null, (X.h) null, (j) null, (i) null, a5, (E.m) null, j0.i.d(365963733, true, new FooterKt$Button$1$3(iArr, eVar, j), i2, 54), mVar2, 817889280, 380);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new FooterKt$Button$2(v, j, eVar, iArr, aVar, i));
        }
    }

    private static final List Button_sW7UJKQ$merge(List list, List list2) {
        return D.v0(list, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Footer(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration r17, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r18, androidx.compose.ui.e r19, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r20, Qa.a r21, b0.m r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt.Footer(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, Qa.a, b0.m, int, int):void");
    }

    private static final void FooterPreview(m mVar, int i) {
        m i2 = mVar.i(-1861228911);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1861228911, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.FooterPreview (Footer.kt:270)");
            }
            PaywallMode paywallMode = PaywallMode.FULL_SCREEN;
            List n = v.n();
            URL url = new URL("https://revenuecat.com/tos");
            URL url2 = new URL("https://revenuecat.com/privacy");
            PaywallData.Configuration.Images images = new PaywallData.Configuration.Images((String) null, (String) null, (String) null, 7, (kotlin.jvm.internal.k) null);
            TestData testData = TestData.INSTANCE;
            Footer(paywallMode, new PaywallData.Configuration(n, (String) null, images, (Map) null, Template2TestDataKt.getTemplate2(testData).getConfig().getColors(), (Map) null, (List) null, false, true, url, url2, 104, (kotlin.jvm.internal.k) null), ColorsFactory.INSTANCE.create(Template2TestDataKt.getTemplate2(testData).getConfig().getColors().getLight()), new MockViewModel(paywallMode, testData.getTemplate2Offering(), null, false, false, 28, null), null, null, i2, 6, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void Separator-RPmYEkk(V v, long j, m mVar, int i) {
        int i2;
        m i3 = mVar.i(1035469312);
        if ((i & 6) == 0) {
            i2 = (i3.U(v) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.e(j) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1035469312, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Separator (Footer.kt:169)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            androidx.compose.ui.e h = androidx.compose.foundation.layout.g.h(aVar, 0.0f, 1, (Object) null);
            e.a aVar2 = o0.e.a;
            androidx.compose.ui.e c = V.c(v, androidx.compose.foundation.layout.g.B(h, aVar2.e(), false, 2, (Object) null), 0.5f, false, 2, (Object) null);
            B a = F.l.a(c.a.h(), aVar2.k(), i3, 0);
            int a2 = h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, c);
            g.a aVar3 = g.E8;
            a a3 = aVar3.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a3);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, a, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar3.f());
            o oVar = o.a;
            F.f.a(androidx.compose.foundation.a.d(s0.h.a(androidx.compose.foundation.layout.g.r(aVar, n1.h.g(5)), M.i.g()), j, (E1) null, 2, (Object) null), i3, 0);
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new FooterKt$Separator$2(v, j, i));
        }
    }

    public static final /* synthetic */ void access$Button-sW7UJKQ(V v, long j, androidx.compose.ui.e eVar, int[] iArr, a aVar, m mVar, int i) {
        Button-sW7UJKQ(v, j, eVar, iArr, aVar, mVar, i);
    }

    public static final /* synthetic */ List access$Button_sW7UJKQ$merge(List list, List list2) {
        return Button_sW7UJKQ$merge(list, list2);
    }

    public static final /* synthetic */ void access$Footer(PaywallMode paywallMode, PaywallData.Configuration configuration, TemplateConfiguration.Colors colors, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, a aVar, m mVar, int i, int i2) {
        Footer(paywallMode, configuration, colors, paywallViewModel, eVar, aVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$FooterPreview(m mVar, int i) {
        FooterPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Separator-RPmYEkk(V v, long j, m mVar, int i) {
        Separator-RPmYEkk(v, j, mVar, i);
    }

    public static final /* synthetic */ void access$openURL(Context context, URL url) {
        openURL(context, url);
    }

    private static final void openURL(Context context, URL url) {
        String url2 = url.toString();
        t.f(url2, "url.toString()");
        UrisKt.openUriOrElse(context, url2, new 1(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void Footer(com.revenuecat.purchases.ui.revenuecatui.PaywallMode r24, com.revenuecat.purchases.paywalls.PaywallData.Configuration r25, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r26, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r27, androidx.compose.ui.e r28, Qa.a r29, b0.m r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt.Footer(com.revenuecat.purchases.ui.revenuecatui.PaywallMode, com.revenuecat.purchases.paywalls.PaywallData$Configuration, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, Qa.a, b0.m, int, int):void");
    }
}
