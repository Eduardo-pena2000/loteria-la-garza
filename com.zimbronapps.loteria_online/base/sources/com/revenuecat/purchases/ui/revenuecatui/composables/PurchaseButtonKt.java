package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.h;
import Qa.p;
import Qa.q;
import X.L;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.g1;
import b0.h2;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import j0.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.r0;
import y.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseButtonKt {

    public static final class 1 extends u implements q {
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ h $this_LoadingSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(TemplateConfiguration.Colors colors, h hVar) {
            super(3);
            this.$colors = colors;
            this.$this_LoadingSpinner = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(f AnimatedVisibility, m mVar, int i) {
            t.g(AnimatedVisibility, "$this$AnimatedVisibility");
            if (w.L()) {
                w.U(-1498164238, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.LoadingSpinner.<anonymous> (PurchaseButton.kt:190)");
            }
            L.a(this.$this_LoadingSpinner.a(e.a, o0.e.a.e()), this.$colors.getCallToActionForeground-0d7_KjU(), 0.0f, 0L, 0, mVar, 0, 28);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $shouldShow;
        final /* synthetic */ h $this_LoadingSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(h hVar, boolean z, TemplateConfiguration.Colors colors, int i) {
            super(2);
            this.$this_LoadingSpinner = hVar;
            this.$shouldShow = z;
            this.$colors = colors;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PurchaseButtonKt.access$LoadingSpinner(this.$this_LoadingSpinner, this.$shouldShow, this.$colors, mVar, g1.a(this.$$changed | 1));
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
            PurchaseButtonKt.access$PurchaseButtonPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    private static final void LoadingSpinner(h hVar, boolean z, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-268216038);
        if ((i & 6) == 0) {
            i2 = (i3.U(hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(colors) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-268216038, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.LoadingSpinner (PurchaseButton.kt:182)");
            }
            e a = hVar.a(e.a, o0.e.a.e());
            UIConstant uIConstant = UIConstant.INSTANCE;
            y.e.e(z, a, androidx.compose.animation.e.m(uIConstant.defaultAnimation(), 0.0f, 2, (Object) null), androidx.compose.animation.e.o(uIConstant.defaultAnimation(), 0.0f, 2, (Object) null), "PurchaseButton.LoadingSpinner", i.d(-1498164238, true, new 1(colors, hVar), i3, 54), i3, ((i2 >> 3) & 14) | 221184, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(hVar, z, colors, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void PurchaseButton-WH-ejsw(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r32, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageConfiguration r33, b0.C0 r34, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r35, float r36, androidx.compose.ui.e r37, b0.m r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt.PurchaseButton-WH-ejsw(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$PackageConfiguration, b0.C0, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, float, androidx.compose.ui.e, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PurchaseButton-hGBTI10(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r16, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r17, androidx.compose.ui.e r18, float r19, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r20, b0.m r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt.PurchaseButton-hGBTI10(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, float, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, b0.m, int, int):void");
    }

    private static final void PurchaseButtonPreview(m mVar, int i) {
        m i2 = mVar.i(1498117025);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1498117025, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonPreview (PurchaseButton.kt:199)");
            }
            MockViewModel mockViewModel = new MockViewModel(null, TestData.INSTANCE.getTemplate2Offering(), null, true, false, 21, null);
            PaywallState.Loaded.Legacy loadedLegacyState = mockViewModel.loadedLegacyState();
            if (loadedLegacyState != null) {
                PurchaseButton-hGBTI10(loadedLegacyState, mockViewModel, null, 0.0f, null, i2, 0, 28);
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final float PurchaseButton_WH_ejsw$lambda$6$lambda$0(h2 h2Var) {
        return ((Number) h2Var.getValue()).floatValue();
    }

    private static final long PurchaseButton_WH_ejsw$lambda$6$lambda$1(h2 h2Var) {
        return ((r0) h2Var.getValue()).A();
    }

    private static final long PurchaseButton_WH_ejsw$lambda$6$lambda$2(h2 h2Var) {
        return ((r0) h2Var.getValue()).A();
    }

    public static final /* synthetic */ void access$LoadingSpinner(h hVar, boolean z, TemplateConfiguration.Colors colors, m mVar, int i) {
        LoadingSpinner(hVar, z, colors, mVar, i);
    }

    public static final /* synthetic */ void access$PurchaseButton-WH-ejsw(TemplateConfiguration.Colors colors, TemplateConfiguration.PackageConfiguration packageConfiguration, C0 c0, PaywallViewModel paywallViewModel, float f, e eVar, m mVar, int i, int i2) {
        PurchaseButton-WH-ejsw(colors, packageConfiguration, c0, paywallViewModel, f, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$PurchaseButtonPreview(m mVar, int i) {
        PurchaseButtonPreview(mVar, i);
    }

    public static final /* synthetic */ float access$PurchaseButton_WH_ejsw$lambda$6$lambda$0(h2 h2Var) {
        return PurchaseButton_WH_ejsw$lambda$6$lambda$0(h2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final v0.h0 buttonBrush-A47ccPs(long r7, v0.r0 r9, b0.m r10, int r11) {
        /*
            boolean r10 = b0.w.L()
            if (r10 == 0) goto Lf
            r10 = -1
            java.lang.String r0 = "com.revenuecat.purchases.ui.revenuecatui.composables.buttonBrush (PurchaseButton.kt:170)"
            r1 = -58833710(0xfffffffffc7e44d2, float:-5.280957E36)
            b0.w.U(r1, r11, r10, r0)
        Lf:
            if (r9 == 0) goto L33
            long r9 = r9.A()
            v0.h0$a r0 = v0.h0.Companion
            v0.r0 r11 = v0.r0.m(r7)
            v0.r0 r9 = v0.r0.m(r9)
            v0.r0[] r9 = new v0.r0[]{r11, r9}
            java.util.List r1 = Da.v.q(r9)
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            v0.h0 r9 = v0.h0.a.c(r0, r1, r2, r3, r4, r5, r6)
            if (r9 != 0) goto L39
        L33:
            v0.F1 r9 = new v0.F1
            r10 = 0
            r9.<init>(r7, r10)
        L39:
            boolean r7 = b0.w.L()
            if (r7 == 0) goto L42
            b0.w.T()
        L42:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt.buttonBrush-A47ccPs(long, v0.r0, b0.m, int):v0.h0");
    }
}
