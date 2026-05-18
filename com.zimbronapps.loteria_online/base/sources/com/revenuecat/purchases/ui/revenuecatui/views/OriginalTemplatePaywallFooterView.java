package com.revenuecat.purchases.ui.revenuecatui.views;

import Ca.I;
import Ca.e;
import Qa.a;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader;
import j0.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class OriginalTemplatePaywallFooterView extends FrameLayout {
    public static final int $stable = 8;
    private a dismissHandler;
    private boolean initialCondensed;
    private FontProvider initialFontProvider;
    private OfferingSelection.IdAndPresentedOfferingContext initialOfferingInfo;
    private PaywallListener internalListener;
    private PaywallListener listener;
    private final C0 paywallOptionsState;

    public static final class 1 extends u implements a {
        public 1() {
            super(0);
        }

        public final void invoke() {
            a access$getDismissHandler$p = OriginalTemplatePaywallFooterView.access$getDismissHandler$p(OriginalTemplatePaywallFooterView.this);
            if (access$getDismissHandler$p != null) {
                access$getDismissHandler$p.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 2 extends CompatComposeView {
        final /* synthetic */ OriginalTemplatePaywallFooterView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Context context, OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView) {
            super(context, null, 0, 6, null);
            this.this$0 = originalTemplatePaywallFooterView;
        }

        private static final PaywallOptions Content$lambda$1(C0 c0) {
            return (PaywallOptions) c0.getValue();
        }

        public static final /* synthetic */ PaywallOptions access$Content$lambda$1(C0 c0) {
            return Content$lambda$1(c0);
        }

        public void Content(m mVar, int i) {
            mVar.V(951143030);
            if (w.L()) {
                w.U(951143030, i, -1, "com.revenuecat.purchases.ui.revenuecatui.views.OriginalTemplatePaywallFooterView.init.<no name provided>.Content (OriginalTemplatePaywallFooterView.kt:188)");
            }
            mVar.V(-704724338);
            OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView = this.this$0;
            Object C = mVar.C();
            if (C == m.a.a()) {
                C = OriginalTemplatePaywallFooterView.access$getPaywallOptionsState$p(originalTemplatePaywallFooterView);
                mVar.t(C);
            }
            mVar.P();
            RevenueCatThemeKt.RevenueCatTheme(i.d(-1757622246, true, new OriginalTemplatePaywallFooterView$init$2$Content$1(this.this$0, (C0) C), mVar, 54), mVar, 6);
            if (w.L()) {
                w.T();
            }
            mVar.P();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context) {
        this(context, null, null, null, false, null, 62, null);
        t.g(context, "context");
    }

    public static final /* synthetic */ a access$getDismissHandler$p(OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView) {
        return originalTemplatePaywallFooterView.dismissHandler;
    }

    public static final /* synthetic */ boolean access$getInitialCondensed$p(OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView) {
        return originalTemplatePaywallFooterView.initialCondensed;
    }

    public static final /* synthetic */ PaywallListener access$getListener$p(OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView) {
        return originalTemplatePaywallFooterView.listener;
    }

    public static final /* synthetic */ C0 access$getPaywallOptionsState$p(OriginalTemplatePaywallFooterView originalTemplatePaywallFooterView) {
        return originalTemplatePaywallFooterView.paywallOptionsState;
    }

    private final PaywallOptions getPaywallOptions() {
        return (PaywallOptions) this.paywallOptionsState.getValue();
    }

    private final void init(Context context, AttributeSet attributeSet) {
        parseAttributes(context, attributeSet);
        setPaywallOptions(new PaywallOptions.Builder(new 1()).setListener(this.internalListener).setFontProvider(this.initialFontProvider).setOfferingIdAndPresentedOfferingContext$revenuecatui_defaultsBc8Release(this.initialOfferingInfo).build());
        addView(new 2(context, this));
    }

    private final void parseAttributes(Context context, AttributeSet attributeSet) {
        PaywallViewAttributesReader.Companion companion = PaywallViewAttributesReader.Companion;
        int[] PaywallFooterView = R.styleable.PaywallFooterView;
        t.f(PaywallFooterView, "PaywallFooterView");
        PaywallViewAttributesReader.PaywallViewAttributes parseAttributes = companion.parseAttributes(context, attributeSet, PaywallFooterView);
        if (parseAttributes == null) {
            return;
        }
        String component1 = parseAttributes.component1();
        FontProvider component2 = parseAttributes.component2();
        Boolean component4 = parseAttributes.component4();
        this.initialOfferingInfo = component1 != null ? new OfferingSelection.IdAndPresentedOfferingContext(component1, null) : null;
        this.initialFontProvider = component2;
        if (component4 != null) {
            this.initialCondensed = component4.booleanValue();
        }
    }

    private final void setPaywallOptions(PaywallOptions paywallOptions) {
        this.paywallOptionsState.setValue(paywallOptions);
    }

    public final void setDismissHandler(a aVar) {
        this.dismissHandler = aVar;
    }

    public final void setFontProvider(FontProvider fontProvider) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), null, false, fontProvider, null, null, null, null, null, null, 507, null));
    }

    @e
    public final void setOfferingId(String str) {
        setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), str == null ? OfferingSelection.None.INSTANCE : new OfferingSelection.IdAndPresentedOfferingContext(str, null), false, null, null, null, null, null, null, null, 510, null));
    }

    @InternalRevenueCatAPI
    public final void setOfferingIdAndPresentedOfferingContext(String str, PresentedOfferingContext presentedOfferingContext) {
        if (str == null) {
            setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), OfferingSelection.None.INSTANCE, false, null, null, null, null, null, null, null, 510, null));
        } else {
            setPaywallOptions(PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(getPaywallOptions(), new OfferingSelection.IdAndPresentedOfferingContext(str, presentedOfferingContext), false, null, null, null, null, null, null, null, 510, null));
        }
    }

    public final void setPaywallListener(PaywallListener paywallListener) {
        this.listener = paywallListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering) {
        this(context, offering, null, null, false, null, 60, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener) {
        this(context, offering, paywallListener, null, false, null, 56, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider) {
        this(context, offering, paywallListener, fontProvider, false, null, 48, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z) {
        this(context, offering, paywallListener, fontProvider, z, null, 32, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t.g(context, "context");
        this.paywallOptionsState = U1.i(new PaywallOptions.Builder(new OriginalTemplatePaywallFooterView$paywallOptionsState$1(this)).build(), (T1) null, 2, (Object) null);
        this.internalListener = new OriginalTemplatePaywallFooterView$internalListener$1(this);
        init(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t.g(context, "context");
        this.paywallOptionsState = U1.i(new PaywallOptions.Builder(new OriginalTemplatePaywallFooterView$paywallOptionsState$1(this)).build(), (T1) null, 2, (Object) null);
        this.internalListener = new OriginalTemplatePaywallFooterView$internalListener$1(this);
        init(context, attributeSet);
    }

    public /* synthetic */ OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z, a aVar, int i, k kVar) {
        this(context, (i & 2) != 0 ? null : offering, (i & 4) != 0 ? null : paywallListener, (i & 8) != 0 ? null : fontProvider, (i & 16) != 0 ? false : z, (i & 32) == 0 ? aVar : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalTemplatePaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z, a aVar) {
        super(context);
        t.g(context, "context");
        this.paywallOptionsState = U1.i(new PaywallOptions.Builder(new OriginalTemplatePaywallFooterView$paywallOptionsState$1(this)).build(), (T1) null, 2, (Object) null);
        this.internalListener = new OriginalTemplatePaywallFooterView$internalListener$1(this);
        setPaywallListener(paywallListener);
        setDismissHandler(aVar);
        setOfferingId(offering != null ? offering.getIdentifier() : null);
        this.initialFontProvider = fontProvider;
        this.initialCondensed = z;
        init(context, null);
    }
}
