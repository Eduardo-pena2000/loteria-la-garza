package com.revenuecat.purchases.paywalls.components.properties;

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
public final class Border {
    public static final Companion Companion = new Companion(null);
    private final ColorScheme color;
    private final double width;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return Border$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ Border(int i, ColorScheme colorScheme, double d, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, Border$$serializer.INSTANCE.getDescriptor());
        }
        this.color = colorScheme;
        this.width = d;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Border border, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, ColorScheme$$serializer.INSTANCE, border.color);
        dVar.q(eVar, 1, border.width);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Border)) {
            return false;
        }
        Border border = (Border) obj;
        return t.c(this.color, border.color) && Double.compare(this.width, border.width) == 0;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + Double.hashCode(this.width);
    }

    public String toString() {
        return "Border(color=" + this.color + ", width=" + this.width + ')';
    }

    public Border(ColorScheme colorScheme, double d) {
        t.g(colorScheme, "color");
        this.color = colorScheme;
        this.width = d;
    }
}
