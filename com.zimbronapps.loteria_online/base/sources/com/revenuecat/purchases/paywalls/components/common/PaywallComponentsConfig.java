package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent$$serializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallComponentsConfig {
    public static final Companion Companion = new Companion(null);
    private final Background background;
    private final StackComponent stack;
    private final StickyFooterComponent stickyFooter;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PaywallComponentsConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ PaywallComponentsConfig(int i, StackComponent stackComponent, Background background, StickyFooterComponent stickyFooterComponent, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, PaywallComponentsConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.stack = stackComponent;
        this.background = background;
        if ((i & 4) == 0) {
            this.stickyFooter = null;
        } else {
            this.stickyFooter = stickyFooterComponent;
        }
    }

    public static /* synthetic */ void getStickyFooter$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallComponentsConfig paywallComponentsConfig, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, StackComponent$$serializer.INSTANCE, paywallComponentsConfig.stack);
        dVar.k(eVar, 1, BackgroundDeserializer.INSTANCE, paywallComponentsConfig.background);
        if (!dVar.e(eVar, 2) && paywallComponentsConfig.stickyFooter == null) {
            return;
        }
        dVar.j(eVar, 2, StickyFooterComponent$$serializer.INSTANCE, paywallComponentsConfig.stickyFooter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsConfig)) {
            return false;
        }
        PaywallComponentsConfig paywallComponentsConfig = (PaywallComponentsConfig) obj;
        return t.c(this.stack, paywallComponentsConfig.stack) && t.c(this.background, paywallComponentsConfig.background) && t.c(this.stickyFooter, paywallComponentsConfig.stickyFooter);
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public final /* synthetic */ StickyFooterComponent getStickyFooter() {
        return this.stickyFooter;
    }

    public int hashCode() {
        int hashCode = ((this.stack.hashCode() * 31) + this.background.hashCode()) * 31;
        StickyFooterComponent stickyFooterComponent = this.stickyFooter;
        return hashCode + (stickyFooterComponent == null ? 0 : stickyFooterComponent.hashCode());
    }

    public String toString() {
        return "PaywallComponentsConfig(stack=" + this.stack + ", background=" + this.background + ", stickyFooter=" + this.stickyFooter + ')';
    }

    public PaywallComponentsConfig(StackComponent stackComponent, Background background, StickyFooterComponent stickyFooterComponent) {
        t.g(stackComponent, "stack");
        t.g(background, "background");
        this.stack = stackComponent;
        this.background = background;
        this.stickyFooter = stickyFooterComponent;
    }

    public /* synthetic */ PaywallComponentsConfig(StackComponent stackComponent, Background background, StickyFooterComponent stickyFooterComponent, int i, k kVar) {
        this(stackComponent, background, (i & 4) != 0 ? null : stickyFooterComponent);
    }
}
