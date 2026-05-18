package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ComponentsConfig {
    public static final Companion Companion = new Companion(null);
    private final PaywallComponentsConfig base;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ComponentsConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ ComponentsConfig(int i, PaywallComponentsConfig paywallComponentsConfig, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, ComponentsConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.base = paywallComponentsConfig;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ComponentsConfig componentsConfig, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, PaywallComponentsConfig$$serializer.INSTANCE, componentsConfig.base);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentsConfig) && t.c(this.base, ((ComponentsConfig) obj).base);
    }

    public final /* synthetic */ PaywallComponentsConfig getBase() {
        return this.base;
    }

    public int hashCode() {
        return this.base.hashCode();
    }

    public String toString() {
        return "ComponentsConfig(base=" + this.base + ')';
    }

    public ComponentsConfig(PaywallComponentsConfig paywallComponentsConfig) {
        t.g(paywallComponentsConfig, "base");
        this.base = paywallComponentsConfig;
    }
}
