package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import Xa.c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import ob.h;
import rb.d;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ColorScheme {
    private static final b[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final ColorInfo dark;
    private final ColorInfo light;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ColorScheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        c b = P.b(ColorInfo.class);
        c[] cVarArr = {P.b(ColorInfo.Alias.class), P.b(ColorInfo.Gradient.Linear.class), P.b(ColorInfo.Gradient.Radial.class), P.b(ColorInfo.Hex.class)};
        b bVar = ColorInfo$Alias$$serializer.INSTANCE;
        b bVar2 = ColorInfo$Gradient$Linear$$serializer.INSTANCE;
        b bVar3 = ColorInfo$Gradient$Radial$$serializer.INSTANCE;
        b bVar4 = ColorInfo$Hex$$serializer.INSTANCE;
        $childSerializers = new b[]{new h("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", b, cVarArr, new b[]{bVar, bVar2, bVar3, bVar4}, new Annotation[0]), new h("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", P.b(ColorInfo.class), new c[]{P.b(ColorInfo.Alias.class), P.b(ColorInfo.Gradient.Linear.class), P.b(ColorInfo.Gradient.Radial.class), P.b(ColorInfo.Hex.class)}, new b[]{bVar, bVar2, bVar3, bVar4}, new Annotation[0])};
    }

    @e
    public /* synthetic */ ColorScheme(int i, ColorInfo colorInfo, ColorInfo colorInfo2, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, ColorScheme$$serializer.INSTANCE.getDescriptor());
        }
        this.light = colorInfo;
        if ((i & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = colorInfo2;
        }
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ColorScheme colorScheme, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.k(eVar, 0, kVarArr[0], colorScheme.light);
        if (!dVar.e(eVar, 1) && colorScheme.dark == null) {
            return;
        }
        dVar.j(eVar, 1, kVarArr[1], colorScheme.dark);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorScheme)) {
            return false;
        }
        ColorScheme colorScheme = (ColorScheme) obj;
        return t.c(this.light, colorScheme.light) && t.c(this.dark, colorScheme.dark);
    }

    public final /* synthetic */ ColorInfo getDark() {
        return this.dark;
    }

    public final /* synthetic */ ColorInfo getLight() {
        return this.light;
    }

    public int hashCode() {
        int hashCode = this.light.hashCode() * 31;
        ColorInfo colorInfo = this.dark;
        return hashCode + (colorInfo == null ? 0 : colorInfo.hashCode());
    }

    public String toString() {
        return "ColorScheme(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ColorScheme(ColorInfo colorInfo, ColorInfo colorInfo2) {
        t.g(colorInfo, "light");
        this.light = colorInfo;
        this.dark = colorInfo2;
    }

    public /* synthetic */ ColorScheme(ColorInfo colorInfo, ColorInfo colorInfo2, int i, k kVar) {
        this(colorInfo, (i & 2) != 0 ? null : colorInfo2);
    }
}
