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
public final class Shadow {
    public static final Companion Companion = new Companion(null);
    private final ColorScheme color;
    private final double radius;
    private final double x;
    private final double y;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return Shadow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ Shadow(int i, ColorScheme colorScheme, double d, double d2, double d3, t0 t0Var) {
        if (15 != (i & 15)) {
            f0.a(i, 15, Shadow$$serializer.INSTANCE.getDescriptor());
        }
        this.color = colorScheme;
        this.radius = d;
        this.x = d2;
        this.y = d3;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Shadow shadow, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, ColorScheme$$serializer.INSTANCE, shadow.color);
        dVar.q(eVar, 1, shadow.radius);
        dVar.q(eVar, 2, shadow.x);
        dVar.q(eVar, 3, shadow.y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return t.c(this.color, shadow.color) && Double.compare(this.radius, shadow.radius) == 0 && Double.compare(this.x, shadow.x) == 0 && Double.compare(this.y, shadow.y) == 0;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ double getRadius() {
        return this.radius;
    }

    public final /* synthetic */ double getX() {
        return this.x;
    }

    public final /* synthetic */ double getY() {
        return this.y;
    }

    public int hashCode() {
        return (((((this.color.hashCode() * 31) + Double.hashCode(this.radius)) * 31) + Double.hashCode(this.x)) * 31) + Double.hashCode(this.y);
    }

    public String toString() {
        return "Shadow(color=" + this.color + ", radius=" + this.radius + ", x=" + this.x + ", y=" + this.y + ')';
    }

    public Shadow(ColorScheme colorScheme, double d, double d2, double d3) {
        t.g(colorScheme, "color");
        this.color = colorScheme;
        this.radius = d;
        this.x = d2;
        this.y = d3;
    }
}
