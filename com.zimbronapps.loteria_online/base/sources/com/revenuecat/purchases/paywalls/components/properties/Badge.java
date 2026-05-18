package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent$$serializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Badge {
    public static final Companion Companion = new Companion(null);
    private final TwoDimensionalAlignment alignment;
    private final StackComponent stack;
    private final Style style;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return Badge$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InternalRevenueCatAPI
    public enum Style {
        Overlay,
        EdgeToEdge,
        Nested;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return BadgeStyleSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @e
    public /* synthetic */ Badge(int i, StackComponent stackComponent, Style style, TwoDimensionalAlignment twoDimensionalAlignment, t0 t0Var) {
        if (7 != (i & 7)) {
            f0.a(i, 7, Badge$$serializer.INSTANCE.getDescriptor());
        }
        this.stack = stackComponent;
        this.style = style;
        this.alignment = twoDimensionalAlignment;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Badge badge, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, StackComponent$$serializer.INSTANCE, badge.stack);
        dVar.k(eVar, 1, BadgeStyleSerializer.INSTANCE, badge.style);
        dVar.k(eVar, 2, TwoDimensionalAlignmentDeserializer.INSTANCE, badge.alignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) obj;
        return t.c(this.stack, badge.stack) && this.style == badge.style && this.alignment == badge.alignment;
    }

    public final /* synthetic */ TwoDimensionalAlignment getAlignment() {
        return this.alignment;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public final /* synthetic */ Style getStyle() {
        return this.style;
    }

    public int hashCode() {
        return (((this.stack.hashCode() * 31) + this.style.hashCode()) * 31) + this.alignment.hashCode();
    }

    public String toString() {
        return "Badge(stack=" + this.stack + ", style=" + this.style + ", alignment=" + this.alignment + ')';
    }

    public Badge(StackComponent stackComponent, Style style, TwoDimensionalAlignment twoDimensionalAlignment) {
        t.g(stackComponent, "stack");
        t.g(style, "style");
        t.g(twoDimensionalAlignment, "alignment");
        this.stack = stackComponent;
        this.style = style;
        this.alignment = twoDimensionalAlignment;
    }
}
