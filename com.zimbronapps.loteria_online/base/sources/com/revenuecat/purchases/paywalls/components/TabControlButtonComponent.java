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
public final class TabControlButtonComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final StackComponent stack;
    private final String tabId;
    private final int tabIndex;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return TabControlButtonComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ TabControlButtonComponent(int i, int i2, String str, StackComponent stackComponent, t0 t0Var) {
        if (7 != (i & 7)) {
            f0.a(i, 7, TabControlButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.tabIndex = i2;
        this.tabId = str;
        this.stack = stackComponent;
    }

    public static /* synthetic */ void getTabId$annotations() {
    }

    public static /* synthetic */ void getTabIndex$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(TabControlButtonComponent tabControlButtonComponent, d dVar, qb.e eVar) {
        dVar.n(eVar, 0, tabControlButtonComponent.tabIndex);
        dVar.v(eVar, 1, tabControlButtonComponent.tabId);
        dVar.k(eVar, 2, StackComponent$$serializer.INSTANCE, tabControlButtonComponent.stack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabControlButtonComponent)) {
            return false;
        }
        TabControlButtonComponent tabControlButtonComponent = (TabControlButtonComponent) obj;
        return this.tabIndex == tabControlButtonComponent.tabIndex && t.c(this.tabId, tabControlButtonComponent.tabId) && t.c(this.stack, tabControlButtonComponent.stack);
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public final /* synthetic */ int getTabIndex() {
        return this.tabIndex;
    }

    public int hashCode() {
        return (((this.tabIndex * 31) + this.tabId.hashCode()) * 31) + this.stack.hashCode();
    }

    public String toString() {
        return "TabControlButtonComponent(tabIndex=" + this.tabIndex + ", tabId=" + this.tabId + ", stack=" + this.stack + ')';
    }

    public TabControlButtonComponent(int i, String str, StackComponent stackComponent) {
        t.g(str, "tabId");
        t.g(stackComponent, "stack");
        this.tabIndex = i;
        this.tabId = str;
        this.stack = stackComponent;
    }
}
