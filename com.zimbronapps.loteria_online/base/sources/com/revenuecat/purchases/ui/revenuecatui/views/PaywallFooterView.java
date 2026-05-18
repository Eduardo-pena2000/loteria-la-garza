package com.revenuecat.purchases.ui.revenuecatui.views;

import Ca.e;
import Qa.a;
import android.content.Context;
import android.util.AttributeSet;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PaywallFooterView extends OriginalTemplatePaywallFooterView {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context) {
        this(context, null, null, null, false, null, 62, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering) {
        this(context, offering, null, null, false, null, 60, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener) {
        this(context, offering, paywallListener, null, false, null, 56, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider) {
        this(context, offering, paywallListener, fontProvider, false, null, 48, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z) {
        this(context, offering, paywallListener, fontProvider, z, null, 32, null);
        t.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        t.g(context, "context");
    }

    public /* synthetic */ PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z, a aVar, int i, k kVar) {
        this(context, (i & 2) != 0 ? null : offering, (i & 4) != 0 ? null : paywallListener, (i & 8) != 0 ? null : fontProvider, (i & 16) != 0 ? false : z, (i & 32) == 0 ? aVar : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallFooterView(Context context, Offering offering, PaywallListener paywallListener, FontProvider fontProvider, boolean z, a aVar) {
        this(context, (AttributeSet) null);
        t.g(context, "context");
    }
}
