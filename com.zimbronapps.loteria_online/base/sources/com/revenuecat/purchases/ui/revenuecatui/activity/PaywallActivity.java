package com.revenuecat.purchases.ui.revenuecatui.activity;

import Ca.I;
import Ca.o;
import Da.Q;
import Da.S;
import F.L;
import F.f;
import F.g0;
import M0.B;
import O0.g;
import Qa.p;
import Qa.q;
import X.F;
import X.T;
import X.X;
import X.l;
import X.r0;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.b0;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import b0.y;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.GoogleFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFont;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import com.revenuecat.purchases.ui.revenuecatui.fonts.TypographyType;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.SdkConfigurationStateKt;
import d.M;
import d.j;
import d.s;
import d1.H;
import d1.K;
import d1.u;
import d1.v;
import e1.c;
import g.d;
import j0.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallActivity extends j {
    public static final String ARGS_EXTRA = "paywall_args";
    public static final String RESULT_EXTRA = "paywall_result";
    private final d exitOfferLauncher = registerForActivityResult(new PaywallContract(), new b(this));
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class 1 implements FontProvider {
        final /* synthetic */ Map $fontsMap;

        public 1(Map map) {
            this.$fontsMap = map;
        }

        public u getFont(TypographyType type) {
            t.g(type, "type");
            return (u) this.$fontsMap.get(type);
        }
    }

    public static final class 1 extends kotlin.jvm.internal.u implements p {
        final /* synthetic */ PaywallActivityArgs $args;
        final /* synthetic */ PaywallActivity$onCreate$compositeListener$1 $compositeListener;
        final /* synthetic */ OfferingSelection.IdAndPresentedOfferingContext $offeringSelection;
        final /* synthetic */ PaywallPurchaseLogic $purchaseLogic;
        final /* synthetic */ PaywallActivity this$0;

        public static final class 1 extends kotlin.jvm.internal.u implements p {
            final /* synthetic */ PaywallActivityArgs $args;
            final /* synthetic */ PaywallActivity$onCreate$compositeListener$1 $compositeListener;
            final /* synthetic */ OfferingSelection.IdAndPresentedOfferingContext $offeringSelection;
            final /* synthetic */ PaywallPurchaseLogic $purchaseLogic;
            final /* synthetic */ PaywallActivity this$0;

            public static final class 1 extends kotlin.jvm.internal.u implements q {
                final /* synthetic */ PaywallActivityArgs $args;
                final /* synthetic */ PaywallActivity$onCreate$compositeListener$1 $compositeListener;
                final /* synthetic */ OfferingSelection.IdAndPresentedOfferingContext $offeringSelection;
                final /* synthetic */ PaywallPurchaseLogic $purchaseLogic;
                final /* synthetic */ PaywallActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, PaywallActivity paywallActivity, PaywallActivityArgs paywallActivityArgs, PaywallActivity$onCreate$compositeListener$1 paywallActivity$onCreate$compositeListener$1, PaywallPurchaseLogic paywallPurchaseLogic) {
                    super(3);
                    this.$offeringSelection = idAndPresentedOfferingContext;
                    this.this$0 = paywallActivity;
                    this.$args = paywallActivityArgs;
                    this.$compositeListener = paywallActivity$onCreate$compositeListener$1;
                    this.$purchaseLogic = paywallPurchaseLogic;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((L) obj, (m) obj2, ((Number) obj3).intValue());
                    return I.a;
                }

                public final void invoke(L anonymous$parameter$0$, m mVar, int i) {
                    Map h;
                    t.g(anonymous$parameter$0$, "$anonymous$parameter$0$");
                    if ((i & 17) == 16 && mVar.j()) {
                        mVar.M();
                        return;
                    }
                    if (w.L()) {
                        w.U(2025926559, i, -1, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (PaywallActivity.kt:200)");
                    }
                    e f = g.f(e.a, 0.0f, 1, (Object) null);
                    OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext = this.$offeringSelection;
                    PaywallActivity paywallActivity = this.this$0;
                    PaywallActivityArgs paywallActivityArgs = this.$args;
                    PaywallActivity$onCreate$compositeListener$1 paywallActivity$onCreate$compositeListener$1 = this.$compositeListener;
                    PaywallPurchaseLogic paywallPurchaseLogic = this.$purchaseLogic;
                    B h2 = f.h(o0.e.a.o(), false);
                    int a = h.a(mVar, 0);
                    b0.I r = mVar.r();
                    e f2 = c.f(mVar, f);
                    g.a aVar = O0.g.E8;
                    Qa.a a2 = aVar.a();
                    if (mVar.k() == null) {
                        h.d();
                    }
                    mVar.I();
                    if (mVar.f()) {
                        mVar.p(a2);
                    } else {
                        mVar.s();
                    }
                    m b = m2.b(mVar);
                    m2.e(b, h2, aVar.e());
                    m2.e(b, r, aVar.g());
                    p b2 = aVar.b();
                    if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                        b.t(Integer.valueOf(a));
                        b.J(Integer.valueOf(a), b2);
                    }
                    m2.e(b, f2, aVar.f());
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
                    PaywallOptions.Builder purchaseLogic = new PaywallOptions.Builder(PaywallActivity$onCreate$1$1$1$1$paywallOptions$1.INSTANCE).setOfferingSelection$revenuecatui_defaultsBc8Release((OfferingSelection) idAndPresentedOfferingContext).setFontProvider(PaywallActivity.access$getFontProvider(paywallActivity)).setShouldDisplayDismissButton(paywallActivityArgs != null ? paywallActivityArgs.getShouldDisplayDismissButton() : true).setListener(paywallActivity$onCreate$compositeListener$1).setPurchaseLogic(paywallPurchaseLogic);
                    mVar.V(1035106284);
                    boolean E = mVar.E(paywallActivity);
                    Object C = mVar.C();
                    if (E || C == m.a.a()) {
                        C = new PaywallActivity$onCreate$1$1$1$1$paywallOptions$2$1(paywallActivity);
                        mVar.t(C);
                    }
                    mVar.P();
                    PaywallOptions.Builder dismissRequestWithExitOffering$revenuecatui_defaultsBc8Release = purchaseLogic.setDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release((p) ((Xa.f) C));
                    if (paywallActivityArgs == null || (h = paywallActivityArgs.getCustomVariables()) == null) {
                        h = S.h();
                    }
                    PaywallOptions build = dismissRequestWithExitOffering$revenuecatui_defaultsBc8Release.setCustomVariables(h).build();
                    PaywallViewModel paywallViewModel = InternalPaywallKt.getPaywallViewModel(build, null, mVar, 0, 2);
                    I i2 = I.a;
                    mVar.V(1035114801);
                    boolean U = mVar.U(paywallViewModel);
                    Object C2 = mVar.C();
                    if (U || C2 == m.a.a()) {
                        C2 = new PaywallActivity$onCreate$1$1$1$1$1$1(paywallViewModel, null);
                        mVar.t(C2);
                    }
                    mVar.P();
                    b0.d(i2, (p) C2, mVar, 6);
                    PaywallKt.Paywall(build, mVar, 0);
                    mVar.v();
                    if (w.L()) {
                        w.T();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, PaywallActivity paywallActivity, PaywallActivityArgs paywallActivityArgs, PaywallActivity$onCreate$compositeListener$1 paywallActivity$onCreate$compositeListener$1, PaywallPurchaseLogic paywallPurchaseLogic) {
                super(2);
                this.$offeringSelection = idAndPresentedOfferingContext;
                this.this$0 = paywallActivity;
                this.$args = paywallActivityArgs;
                this.$compositeListener = paywallActivity$onCreate$compositeListener$1;
                this.$purchaseLogic = paywallPurchaseLogic;
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
                    w.U(-588670640, i, -1, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous>.<anonymous> (PaywallActivity.kt:197)");
                }
                T.a((e) null, (p) null, (p) null, (p) null, (p) null, 0, 0L, 0L, g0.a(0, 0, 0, 0), i.d(2025926559, true, new 1(this.$offeringSelection, this.this$0, this.$args, this.$compositeListener, this.$purchaseLogic), mVar, 54), mVar, 805306368, 255);
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext, PaywallActivity paywallActivity, PaywallActivityArgs paywallActivityArgs, PaywallActivity$onCreate$compositeListener$1 paywallActivity$onCreate$compositeListener$1, PaywallPurchaseLogic paywallPurchaseLogic) {
            super(2);
            this.$offeringSelection = idAndPresentedOfferingContext;
            this.this$0 = paywallActivity;
            this.$args = paywallActivityArgs;
            this.$compositeListener = paywallActivity$onCreate$compositeListener$1;
            this.$purchaseLogic = paywallPurchaseLogic;
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
                w.U(2032214180, i, -1, "com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity.onCreate.<anonymous> (PaywallActivity.kt:194)");
            }
            F.a((l) null, (X) null, (r0) null, i.d(-588670640, true, new 1(this.$offeringSelection, this.this$0, this.$args, this.$compositeListener, this.$purchaseLogic), mVar, 54), mVar, 3072, 7);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static /* synthetic */ void W(PaywallActivity paywallActivity, PaywallResult paywallResult) {
        exitOfferLauncher$lambda$0(paywallActivity, paywallResult);
    }

    public static final /* synthetic */ Intent access$createResultIntent(PaywallActivity paywallActivity, PaywallResult paywallResult) {
        return paywallActivity.createResultIntent(paywallResult);
    }

    public static final /* synthetic */ FontProvider access$getFontProvider(PaywallActivity paywallActivity) {
        return paywallActivity.getFontProvider();
    }

    public static final /* synthetic */ void access$onDismissRequest(PaywallActivity paywallActivity, Offering offering, PaywallResult paywallResult) {
        paywallActivity.onDismissRequest(offering, paywallResult);
    }

    private final Intent createResultIntent(PaywallResult paywallResult) {
        Intent putExtra = new Intent().putExtra("paywall_result", paywallResult);
        t.f(putExtra, "Intent().putExtra(RESULT_EXTRA, result)");
        return putExtra;
    }

    private static final void exitOfferLauncher$lambda$0(PaywallActivity paywallActivity, PaywallResult result) {
        t.g(result, "result");
        paywallActivity.setResult(-1, paywallActivity.createResultIntent(result));
        paywallActivity.finish();
    }

    private final PaywallActivityArgs getArgs() {
        return Build.VERSION.SDK_INT >= 33 ? (PaywallActivityArgs) a.a(getIntent(), "paywall_args", PaywallActivityArgs.class) : (PaywallActivityArgs) getIntent().getParcelableExtra("paywall_args");
    }

    private final FontProvider getFontProvider() {
        Map fonts;
        ArrayList arrayList;
        List<PaywallFont> fonts2;
        d1.t a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PaywallActivityArgs args = getArgs();
        if (args == null || (fonts = args.getFonts()) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Q.e(fonts.size()));
        for (Map.Entry entry : fonts.entrySet()) {
            Object key = entry.getKey();
            PaywallFontFamily paywallFontFamily = (PaywallFontFamily) entry.getValue();
            if (paywallFontFamily == null || (fonts2 = paywallFontFamily.getFonts()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(Da.w.y(fonts2, 10));
                for (PaywallFont paywallFont : fonts2) {
                    if (paywallFont instanceof PaywallFont.ResourceFont) {
                        PaywallFont.ResourceFont resourceFont = (PaywallFont.ResourceFont) paywallFont;
                        a = d1.B.b(resourceFont.getResourceId(), resourceFont.getFontWeight(), H.d(resourceFont.getFontStyle()), 0, 8, (Object) null);
                    } else if (paywallFont instanceof PaywallFont.AssetFont) {
                        PaywallFont.AssetFont assetFont = (PaywallFont.AssetFont) paywallFont;
                        String path = assetFont.getPath();
                        AssetManager assets = getAssets();
                        t.f(assets, "assets");
                        a = d1.d.d(path, assets, assetFont.getFontWeight(), H.d(assetFont.getFontStyle()), (K.d) null, 16, (Object) null);
                    } else {
                        if (!(paywallFont instanceof PaywallFont.GoogleFont)) {
                            throw new o();
                        }
                        PaywallFont.GoogleFont googleFont = (PaywallFont.GoogleFont) paywallFont;
                        GoogleFontProvider fontProvider = googleFont.getFontProvider();
                        Object obj = linkedHashMap.get(fontProvider);
                        if (obj == null) {
                            obj = fontProvider.toGoogleProvider();
                            linkedHashMap.put(fontProvider, obj);
                        }
                        a = e1.e.a(new e1.c(googleFont.getFontName(), false, 2, (k) null), (c.a) obj, googleFont.getFontWeight(), H.d(googleFont.getFontStyle()));
                    }
                    arrayList.add(a);
                }
            }
            linkedHashMap2.put(key, arrayList != null ? v.b(arrayList) : null);
        }
        return new 1(linkedHashMap2);
    }

    private final void launchExitOfferActivity(Offering offering) {
        PaywallActivityArgs args = getArgs();
        if (args == null) {
            finish();
        } else {
            this.exitOfferLauncher.a(PaywallActivityArgs.copy$default(args, null, new OfferingSelection.IdAndPresentedOfferingContext(offering.getIdentifier(), null), null, false, false, false, null, null, 253, null));
        }
    }

    private final void onDismissRequest(Offering offering, PaywallResult paywallResult) {
        if (paywallResult != null) {
            setResult(-1, createResultIntent(paywallResult));
        }
        if (offering != null) {
            launchExitOfferActivity(offering);
        } else {
            finish();
        }
    }

    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public void onCreate(Bundle bundle) {
        Integer nonSerializableArgsKey;
        requestWindowFeature(1);
        super.onCreate(bundle);
        SdkConfigurationStateKt.restoreSdkConfigurationIfNeeded(this, bundle);
        PaywallActivityArgs args = getArgs();
        boolean z = false;
        if (!(args != null ? args.getWasLaunchedThroughSDK() : false) && !Purchases.Companion.isConfigured()) {
            Logger.INSTANCE.e("PaywallActivity was launched incorrectly. Please use PaywallActivityLauncher, or Paywall/PaywallDialog/PaywallFooter composables to display the Paywall.");
            finish();
            return;
        }
        PaywallActivityNonSerializableArgs paywallActivityNonSerializableArgs = (args == null || (nonSerializableArgsKey = args.getNonSerializableArgsKey()) == null) ? null : PaywallActivityNonSerializableArgsStore.INSTANCE.get(nonSerializableArgsKey.intValue());
        if ((args != null ? args.getNonSerializableArgsKey() : null) != null && paywallActivityNonSerializableArgs == null) {
            Logger.INSTANCE.w("PaywallActivity was recreated after process death causing PurchaseLogic and/or PaywallListener to be lost. Finishing activity.");
            setResult(-1, createResultIntent(PaywallResult.Cancelled.INSTANCE));
            finish();
            return;
        }
        PaywallListener listener = paywallActivityNonSerializableArgs != null ? paywallActivityNonSerializableArgs.getListener() : null;
        PaywallPurchaseLogic purchaseLogic = paywallActivityNonSerializableArgs != null ? paywallActivityNonSerializableArgs.getPurchaseLogic() : null;
        PaywallActivity$onCreate$compositeListener$1 paywallActivity$onCreate$compositeListener$1 = new PaywallActivity$onCreate$compositeListener$1(listener, this, args);
        if (args != null && args.getEdgeToEdge()) {
            z = true;
        }
        if (z) {
            s.b(this, (M) null, (M) null, 3, (Object) null);
        }
        e.b.b(this, (y) null, i.b(2032214180, true, new 1(args != null ? args.getOfferingIdAndPresentedOfferingContext() : null, this, args, paywallActivity$onCreate$compositeListener$1, purchaseLogic)), 1, (Object) null);
    }

    public void onSaveInstanceState(Bundle outState) {
        t.g(outState, "outState");
        SdkConfigurationStateKt.saveSdkConfiguration(outState);
        super.onSaveInstanceState(outState);
    }
}
