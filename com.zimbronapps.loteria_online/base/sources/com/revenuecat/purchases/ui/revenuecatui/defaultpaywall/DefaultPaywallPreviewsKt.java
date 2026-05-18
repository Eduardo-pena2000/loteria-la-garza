package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import A.q;
import Ca.I;
import Da.D;
import Da.v;
import Qa.a;
import Qa.l;
import Qa.p;
import X.E;
import X.F;
import X.X;
import X.r0;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DualColorImageGenerator;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import j0.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallPreviewsKt {
    private static final List previewPackages;

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
            DefaultPaywallPreviewsKt.access$DefaultPaywallBlueGreenPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ DualColorImageGenerator.PreviewAppIcon $icon;
        final /* synthetic */ PaywallWarning $warning;

        public static final class 1 extends u implements l {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(1);
            }

            public final void invoke(TemplateConfiguration.PackageInfo it) {
                t.g(it, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((TemplateConfiguration.PackageInfo) obj);
                return I.a;
            }
        }

        public static final class 2 extends u implements a {
            public static final 2 INSTANCE = new 2();

            public 2() {
                super(0);
            }

            public final void invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }
        }

        public static final class 3 extends u implements a {
            public static final 3 INSTANCE = new 3();

            public 3() {
                super(0);
            }

            public final void invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallWarning paywallWarning, DualColorImageGenerator.PreviewAppIcon previewAppIcon) {
            super(2);
            this.$warning = paywallWarning;
            this.$icon = previewAppIcon;
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
                w.U(2020893435, i, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreview.<anonymous> (DefaultPaywallPreviews.kt:117)");
            }
            DefaultPaywallViewKt.DefaultPaywallView(DefaultPaywallPreviewsKt.access$getPreviewPackages$p(), (TemplateConfiguration.PackageInfo) D.f0(DefaultPaywallPreviewsKt.access$getPreviewPackages$p()), this.$warning, 1.INSTANCE, 2.INSTANCE, 3.INSTANCE, androidx.compose.foundation.a.d(e.a, E.a.a(mVar, E.b).c(), (E1) null, 2, (Object) null), new DefaultPaywallPreviewOverrides("RevenueCat", this.$icon.getBitmap(), this.$icon.getProminentColors(), Boolean.TRUE), mVar, 224256, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ DualColorImageGenerator.PreviewAppIcon $icon;
        final /* synthetic */ PaywallWarning $warning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(DualColorImageGenerator.PreviewAppIcon previewAppIcon, PaywallWarning paywallWarning, int i) {
            super(2);
            this.$icon = previewAppIcon;
            this.$warning = paywallWarning;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            DefaultPaywallPreviewsKt.access$DefaultPaywallPreview(this.$icon, this.$warning, mVar, g1.a(this.$$changed | 1));
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
            DefaultPaywallPreviewsKt.access$DefaultPaywallPurpleOrangePreview(mVar, g1.a(this.$$changed | 1));
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
            DefaultPaywallPreviewsKt.access$DefaultPaywallRedGreenPreview(mVar, g1.a(this.$$changed | 1));
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
            DefaultPaywallPreviewsKt.access$DefaultPaywallWarningLocalizationPreview(mVar, g1.a(this.$$changed | 1));
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
            DefaultPaywallPreviewsKt.access$DefaultPaywallWarningNoPaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    static {
        TestData.Packages packages = TestData.Packages.INSTANCE;
        List<Package> q = v.q(packages.getAnnual(), packages.getMonthly());
        ArrayList arrayList = new ArrayList(Da.w.y(q, 10));
        for (Package r2 : q) {
            arrayList.add(new TemplateConfiguration.PackageInfo(r2, new ProcessedLocalizedConfiguration(r2.getProduct().getName(), null, "Continue", null, null, null, null, null, r2.getProduct().getName(), null, null, null, 1024, null), null));
        }
        previewPackages = arrayList;
    }

    private static final void DefaultPaywallBlueGreenPreview(m mVar, int i) {
        m i2 = mVar.i(657651692);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(657651692, i, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallBlueGreenPreview (DefaultPaywallPreviews.kt:61)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getBlueGreen(), null, i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void DefaultPaywallPreview(DualColorImageGenerator.PreviewAppIcon previewAppIcon, PaywallWarning paywallWarning, m mVar, int i) {
        int i2;
        m i3 = mVar.i(1946056999);
        if ((i & 6) == 0) {
            i2 = (i3.E(previewAppIcon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(paywallWarning) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1946056999, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPreview (DefaultPaywallPreviews.kt:114)");
            }
            F.a(q.a(i3, 0) ? X.m.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, (Object) null) : X.m.j(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, (Object) null), (X) null, (r0) null, i.d(2020893435, true, new 1(paywallWarning, previewAppIcon), i3, 54), i3, 3072, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(previewAppIcon, paywallWarning, i));
        }
    }

    private static final void DefaultPaywallPurpleOrangePreview(m mVar, int i) {
        m i2 = mVar.i(361581643);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(361581643, i, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallPurpleOrangePreview (DefaultPaywallPreviews.kt:75)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getPurpleOrange(), null, i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void DefaultPaywallRedGreenPreview(m mVar, int i) {
        m i2 = mVar.i(-848283725);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-848283725, i, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallRedGreenPreview (DefaultPaywallPreviews.kt:47)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getRedGreen(), null, i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void DefaultPaywallWarningLocalizationPreview(m mVar, int i) {
        m i2 = mVar.i(-197693384);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-197693384, i, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallWarningLocalizationPreview (DefaultPaywallPreviews.kt:89)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getRedGreen(), PaywallWarning.MissingLocalization.INSTANCE, i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void DefaultPaywallWarningNoPaywallPreview(m mVar, int i) {
        m i2 = mVar.i(-684325386);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-684325386, i, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallWarningNoPaywallPreview (DefaultPaywallPreviews.kt:103)");
            }
            DefaultPaywallPreview(DualColorImageGenerator.INSTANCE.getPurpleOrange(), new PaywallWarning.NoPaywall("WAT"), i2, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final /* synthetic */ void access$DefaultPaywallBlueGreenPreview(m mVar, int i) {
        DefaultPaywallBlueGreenPreview(mVar, i);
    }

    public static final /* synthetic */ void access$DefaultPaywallPreview(DualColorImageGenerator.PreviewAppIcon previewAppIcon, PaywallWarning paywallWarning, m mVar, int i) {
        DefaultPaywallPreview(previewAppIcon, paywallWarning, mVar, i);
    }

    public static final /* synthetic */ void access$DefaultPaywallPurpleOrangePreview(m mVar, int i) {
        DefaultPaywallPurpleOrangePreview(mVar, i);
    }

    public static final /* synthetic */ void access$DefaultPaywallRedGreenPreview(m mVar, int i) {
        DefaultPaywallRedGreenPreview(mVar, i);
    }

    public static final /* synthetic */ void access$DefaultPaywallWarningLocalizationPreview(m mVar, int i) {
        DefaultPaywallWarningLocalizationPreview(mVar, i);
    }

    public static final /* synthetic */ void access$DefaultPaywallWarningNoPaywallPreview(m mVar, int i) {
        DefaultPaywallWarningNoPaywallPreview(mVar, i);
    }

    public static final /* synthetic */ List access$getPreviewPackages$p() {
        return previewPackages;
    }
}
