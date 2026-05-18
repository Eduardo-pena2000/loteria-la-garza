package com.revenuecat.purchases.paywalls.components;

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
public final class StickyFooterComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final StackComponent stack;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return StickyFooterComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ StickyFooterComponent(int i, StackComponent stackComponent, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, StickyFooterComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.stack = stackComponent;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(StickyFooterComponent stickyFooterComponent, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, StackComponent$$serializer.INSTANCE, stickyFooterComponent.stack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickyFooterComponent) && t.c(this.stack, ((StickyFooterComponent) obj).stack);
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        return this.stack.hashCode();
    }

    public String toString() {
        return "StickyFooterComponent(stack=" + this.stack + ')';
    }

    public StickyFooterComponent(StackComponent stackComponent) {
        t.g(stackComponent, "stack");
        this.stack = stackComponent;
    }
}
