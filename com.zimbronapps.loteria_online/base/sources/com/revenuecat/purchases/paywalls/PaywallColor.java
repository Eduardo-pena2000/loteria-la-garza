package com.revenuecat.purchases.paywalls;

import android.graphics.Color;
import android.os.Build;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import ob.b;
import qb.d;
import qb.e;
import qb.k;
import rb.f;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallColor {
    private final int colorInt;
    private final String stringRepresentation;
    private final Color underlyingColor;

    public static final class Serializer implements b {
        public static final Serializer INSTANCE = new Serializer();
        private static final e descriptor = k.b("PaywallColor", d.i.a);

        private Serializer() {
        }

        public e getDescriptor() {
            return descriptor;
        }

        public PaywallColor deserialize(rb.e eVar) {
            t.g(eVar, "decoder");
            return new PaywallColor(eVar.B());
        }

        public void serialize(f fVar, PaywallColor paywallColor) {
            t.g(fVar, "encoder");
            t.g(paywallColor, "value");
            fVar.F(paywallColor.toString());
        }
    }

    public PaywallColor(String str, Color color) {
        t.g(str, "stringRepresentation");
        this.stringRepresentation = str;
        this.underlyingColor = color;
        this.colorInt = ColorUtilsKt.parseRGBAColor(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallColor)) {
            return false;
        }
        PaywallColor paywallColor = (PaywallColor) obj;
        return t.c(this.stringRepresentation, paywallColor.stringRepresentation) && t.c(this.underlyingColor, paywallColor.underlyingColor);
    }

    public final int getColorInt() {
        return this.colorInt;
    }

    public final String getStringRepresentation() {
        return this.stringRepresentation;
    }

    public final Color getUnderlyingColor() {
        return this.underlyingColor;
    }

    public int hashCode() {
        int hashCode = this.stringRepresentation.hashCode() * 31;
        Color color = this.underlyingColor;
        return hashCode + (color == null ? 0 : color.hashCode());
    }

    public String toString() {
        return "PaywallColor(stringRepresentation=" + this.stringRepresentation + ", underlyingColor=" + this.underlyingColor + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallColor(String str) {
        this(str, Build.VERSION.SDK_INT >= 26 ? a.a(ColorUtilsKt.parseRGBAColor(str)) : null);
        t.g(str, "stringRepresentation");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaywallColor(int i) {
        U u = U.a;
        String format = String.format(Locale.US, "#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & i)}, 1));
        t.f(format, "format(...)");
        this(format, Build.VERSION.SDK_INT >= 26 ? a.a(i) : null);
    }
}
