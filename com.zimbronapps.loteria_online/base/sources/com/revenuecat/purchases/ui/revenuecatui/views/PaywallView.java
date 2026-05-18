package com.revenuecat.purchases.ui.revenuecatui.views;

import Ca.I;
import Da.D;
import Qa.a;
import Qa.p;
import android.content.Context;
import android.util.AttributeSet;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableKeyValidator;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader;
import j0.i;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallView extends CompatComposeView {
    public static final int $stable = 8;
    private a dismissHandler;
    private FontProvider initialFontProvider;
    private OfferingSelection.IdAndPresentedOfferingContext initialOfferingInfo;
    private PaywallListener internalListener;
    private PaywallListener listener;
    private final C0 paywallOptionsState;
    private PaywallPurchaseLogic purchaseLogic;
    private Boolean shouldDisplayDismissButton;

    public static final class 1 extends u implements p {
        final /* synthetic */ C0 $paywallOptions$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(C0 c0) {
            super(2);
            this.$paywallOptions$delegate = c0;
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
                w.U(226220304, i, -1, "com.revenuecat.purchases.ui.revenuecatui.views.PaywallView.Content.<anonymous> (PaywallView.kt:230)");
            }
            PaywallKt.Paywall(PaywallView.access$Content$lambda$4(this.$paywallOptions$delegate), mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 1 extends u implements a {
        public 1() {
            super(0);
        }

        public final void invoke() {
            PaywallView.access$dismiss(PaywallView.this);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context) {
        this(context, null, null, null, null, null, null, 126, null);
        t.g(context, "context");
    }

    private static final PaywallOptions Content$lambda$4(C0 c0) {
        return (PaywallOptions) c0.getValue();
    }

    public static final /* synthetic */ PaywallOptions access$Content$lambda$4(C0 c0) {
        return Content$lambda$4(c0);
    }

    public static final /* synthetic */ void access$dismiss(PaywallView paywallView) {
        paywallView.dismiss();
    }

    public static final /* synthetic */ PaywallListener access$getListener$p(PaywallView paywallView) {
        return paywallView.listener;
    }

    private final void dismiss() {
        a aVar = this.dismissHandler;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final PaywallOptions getPaywallOptions() {
        return (PaywallOptions) this.paywallOptionsState.getValue();
    }

    private final void init(Context context, AttributeSet attributeSet) {
        parseAttributes(context, attributeSet);
        PaywallOptions.Builder offeringIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release = new PaywallOptions.Builder(new 1()).setListener(this.internalListener).setFontProvider(this.initialFontProvider).setOfferingIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release(this.initialOfferingInfo);
        Boolean bool = this.shouldDisplayDismissButton;
        setPaywallOptions(offeringIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release.setShouldDisplayDismissButton(bool != null ? bool.booleanValue() : false).setPurchaseLogic(this.purchaseLogic).build());
    }

    private final void parseAttributes(Context context, AttributeSet attributeSet) {
        PaywallViewAttributesReader.Companion companion = PaywallViewAttributesReader.Companion;
        int[] PaywallView = R.styleable.PaywallView;
        t.f(PaywallView, "PaywallView");
        PaywallViewAttributesReader.PaywallViewAttributes parseAttributes = companion.parseAttributes(context, attributeSet, PaywallView);
        if (parseAttributes == null) {
            return;
        }
        String component1 = parseAttributes.component1();
        FontProvider component2 = parseAttributes.component2();
        Boolean component3 = parseAttributes.component3();
        this.initialOfferingInfo = component1 != null ? new OfferingSelection.IdAndPresentedOfferingContext(component1, null) : null;
        this.initialFontProvider = component2;
        this.shouldDisplayDismissButton = component3;
    }

    public static /* synthetic */ void setOfferingId$default(PaywallView paywallView, String str, PresentedOfferingContext presentedOfferingContext, int i, Object obj) {
        if ((i & 2) != 0) {
            presentedOfferingContext = null;
        }
        paywallView.setOfferingId(str, presentedOfferingContext);
    }

    private final void setPaywallOptions(PaywallOptions paywallOptions) {
        this.paywallOptionsState.setValue(paywallOptions);
    }

    public void Content(m mVar, int i) {
        mVar.V(1456977972);
        if (w.L()) {
            w.U(1456977972, i, -1, "com.revenuecat.purchases.ui.revenuecatui.views.PaywallView.Content (PaywallView.kt:225)");
        }
        mVar.V(502094413);
        Object C = mVar.C();
        if (C == m.a.a()) {
            C = this.paywallOptionsState;
            mVar.t(C);
        }
        mVar.P();
        RevenueCatThemeKt.RevenueCatTheme(i.d(226220304, true, new 1((C0) C), mVar, 54), mVar, 6);
        if (w.L()) {
            w.T();
        }
        mVar.P();
    }

    public void onBackPressed() {
        I i;
        if (this.dismissHandler != null) {
            dismiss();
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            super.onBackPressed();
        }
    }

    public final void setCustomVariables(Map variables) {
        t.g(variables, "variables");
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, false, null, null, null, null, null, null, CustomVariableKeyValidator.INSTANCE.validateAndFilter(variables), 255, null));
    }

    public final void setDismissHandler(a aVar) {
        this.dismissHandler = aVar;
    }

    public final void setDisplayDismissButton(boolean z) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, z, null, null, null, null, null, null, null, 509, null));
    }

    public final void setFontProvider(FontProvider fontProvider) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, false, fontProvider, null, null, null, null, null, null, 507, null));
    }

    public final void setOfferingId(String str) {
        setOfferingId$default(this, str, null, 2, null);
    }

    public final void setPaywallListener(PaywallListener paywallListener) {
        this.listener = paywallListener;
    }

    public final void setPurchaseLogic(PaywallPurchaseLogic paywallPurchaseLogic) {
        this.purchaseLogic = paywallPurchaseLogic;
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, false, null, null, paywallPurchaseLogic, null, null, null, null, 495, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering) {
        this(context, offering, null, null, null, null, null, 124, null);
        t.g(context, "context");
    }

    public final void setOfferingId(String str, PresentedOfferingContext presentedOfferingContext) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), str == null ? OfferingSelection.None.INSTANCE : new OfferingSelection.IdAndPresentedOfferingContext(str, presentedOfferingContext), false, null, null, null, null, null, null, null, 510, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener) {
        this(context, offering, paywallListener, null, null, null, null, 120, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider) {
        this(context, offering, paywallListener, fontProvider, null, null, null, 112, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool) {
        this(context, offering, paywallListener, fontProvider, bool, null, null, 96, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, PaywallPurchaseLogic paywallPurchaseLogic) {
        this(context, offering, paywallListener, fontProvider, bool, paywallPurchaseLogic, null, 64, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        t.g(context, "context");
        this.paywallOptionsState = U1.i(new PaywallOptions.Builder(new PaywallView$paywallOptionsState$1(this)).build(), (T1) null, 2, (Object) null);
        this.internalListener = new PaywallView$internalListener$1(this);
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t.g(context, "context");
        this.paywallOptionsState = U1.i(new PaywallOptions.Builder(new PaywallView$paywallOptionsState$1(this)).build(), (T1) null, 2, (Object) null);
        this.internalListener = new PaywallView$internalListener$1(this);
        init(context, attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, a aVar) {
        this(context, offering, paywallListener, fontProvider, bool, null, aVar);
        t.g(context, "context");
    }

    public /* synthetic */ PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, PaywallPurchaseLogic paywallPurchaseLogic, a aVar, int i, k kVar) {
        this(context, (i & 2) != 0 ? null : offering, (i & 4) != 0 ? null : paywallListener, (i & 8) != 0 ? null : fontProvider, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : paywallPurchaseLogic, (i & 64) == 0 ? aVar : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, Boolean bool, PaywallPurchaseLogic paywallPurchaseLogic, a aVar) {
        super(context, null, 0, 6, null);
        t.g(context, "context");
        this.paywallOptionsState = U1.i(new PaywallOptions.Builder(new PaywallView$paywallOptionsState$1(this)).build(), (T1) null, 2, (Object) null);
        this.internalListener = new PaywallView$internalListener$1(this);
        setPaywallListener(paywallListener);
        setDismissHandler(aVar);
        setPurchaseLogic(paywallPurchaseLogic);
        if (offering != null) {
            String identifier = offering.getIdentifier();
            Package r9 = (Package) D.h0(offering.getAvailablePackages());
            setOfferingId(identifier, r9 != null ? r9.getPresentedOfferingContext() : null);
        }
        this.shouldDisplayDismissButton = bool;
        this.initialFontProvider = fontProvider;
        init(context, null);
    }
}
