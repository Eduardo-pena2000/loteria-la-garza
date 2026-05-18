package com.revenuecat.purchases.paywalls.components;

import Da.v;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.e;
import sb.f0;
import sb.h;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class IconComponent implements PaywallComponent {
    private final String baseUrl;
    private final ColorScheme color;
    private final Formats formats;
    private final IconBackground iconBackground;
    private final String iconName;
    private final Padding margin;
    private final List overrides;
    private final Padding padding;
    private final Size size;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, new e(ComponentOverride.Companion.serializer(PartialIconComponent$$serializer.INSTANCE))};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return IconComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class Formats {
        public static final Companion Companion = new Companion(null);
        private final String webp;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return IconComponent$Formats$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Ca.e
        public /* synthetic */ Formats(int i, String str, t0 t0Var) {
            if (1 != (i & 1)) {
                f0.a(i, 1, IconComponent$Formats$$serializer.INSTANCE.getDescriptor());
            }
            this.webp = str;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Formats formats, d dVar, qb.e eVar) {
            dVar.v(eVar, 0, formats.webp);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Formats) && t.c(this.webp, ((Formats) obj).webp);
        }

        public final /* synthetic */ String getWebp() {
            return this.webp;
        }

        public int hashCode() {
            return this.webp.hashCode();
        }

        public String toString() {
            return "Formats(webp=" + this.webp + ')';
        }

        public Formats(String str) {
            t.g(str, "webp");
            this.webp = str;
        }
    }

    public static final class IconBackground {
        public static final Companion Companion = new Companion(null);
        private final Border border;
        private final ColorScheme color;
        private final Shadow shadow;
        private final MaskShape shape;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return IconComponent$IconBackground$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Ca.e
        public /* synthetic */ IconBackground(int i, ColorScheme colorScheme, MaskShape maskShape, Border border, Shadow shadow, t0 t0Var) {
            if (3 != (i & 3)) {
                f0.a(i, 3, IconComponent$IconBackground$$serializer.INSTANCE.getDescriptor());
            }
            this.color = colorScheme;
            this.shape = maskShape;
            if ((i & 4) == 0) {
                this.border = null;
            } else {
                this.border = border;
            }
            if ((i & 8) == 0) {
                this.shadow = null;
            } else {
                this.shadow = shadow;
            }
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(IconBackground iconBackground, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, ColorScheme$$serializer.INSTANCE, iconBackground.color);
            dVar.k(eVar, 1, MaskShapeDeserializer.INSTANCE, iconBackground.shape);
            if (dVar.e(eVar, 2) || iconBackground.border != null) {
                dVar.j(eVar, 2, Border$$serializer.INSTANCE, iconBackground.border);
            }
            if (!dVar.e(eVar, 3) && iconBackground.shadow == null) {
                return;
            }
            dVar.j(eVar, 3, Shadow$$serializer.INSTANCE, iconBackground.shadow);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconBackground)) {
                return false;
            }
            IconBackground iconBackground = (IconBackground) obj;
            return t.c(this.color, iconBackground.color) && t.c(this.shape, iconBackground.shape) && t.c(this.border, iconBackground.border) && t.c(this.shadow, iconBackground.shadow);
        }

        public final /* synthetic */ Border getBorder() {
            return this.border;
        }

        public final /* synthetic */ ColorScheme getColor() {
            return this.color;
        }

        public final /* synthetic */ Shadow getShadow() {
            return this.shadow;
        }

        public final /* synthetic */ MaskShape getShape() {
            return this.shape;
        }

        public int hashCode() {
            int hashCode = ((this.color.hashCode() * 31) + this.shape.hashCode()) * 31;
            Border border = this.border;
            int hashCode2 = (hashCode + (border == null ? 0 : border.hashCode())) * 31;
            Shadow shadow = this.shadow;
            return hashCode2 + (shadow != null ? shadow.hashCode() : 0);
        }

        public String toString() {
            return "IconBackground(color=" + this.color + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ')';
        }

        public IconBackground(ColorScheme colorScheme, MaskShape maskShape, Border border, Shadow shadow) {
            t.g(colorScheme, "color");
            t.g(maskShape, "shape");
            this.color = colorScheme;
            this.shape = maskShape;
            this.border = border;
            this.shadow = shadow;
        }

        public /* synthetic */ IconBackground(ColorScheme colorScheme, MaskShape maskShape, Border border, Shadow shadow, int i, k kVar) {
            this(colorScheme, maskShape, (i & 4) != 0 ? null : border, (i & 8) != 0 ? null : shadow);
        }
    }

    @Ca.e
    public /* synthetic */ IconComponent(int i, String str, String str2, Formats formats, Boolean bool, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconBackground iconBackground, List list, t0 t0Var) {
        if (7 != (i & 7)) {
            f0.a(i, 7, IconComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.baseUrl = str;
        this.iconName = str2;
        this.formats = formats;
        if ((i & 8) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 16) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i & 32) == 0) {
            this.color = null;
        } else {
            this.color = colorScheme;
        }
        if ((i & 64) == 0) {
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding;
        }
        if ((i & 128) == 0) {
            this.margin = Padding.Companion.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i & 256) == 0) {
            this.iconBackground = null;
        } else {
            this.iconBackground = iconBackground;
        }
        if ((i & 512) == 0) {
            this.overrides = v.n();
        } else {
            this.overrides = list;
        }
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    public static /* synthetic */ void getIconBackground$annotations() {
    }

    public static /* synthetic */ void getIconName$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(IconComponent iconComponent, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.v(eVar, 0, iconComponent.baseUrl);
        dVar.v(eVar, 1, iconComponent.iconName);
        dVar.k(eVar, 2, IconComponent$Formats$$serializer.INSTANCE, iconComponent.formats);
        if (dVar.e(eVar, 3) || iconComponent.visible != null) {
            dVar.j(eVar, 3, h.a, iconComponent.visible);
        }
        if (dVar.e(eVar, 4) || !t.c(iconComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.k(eVar, 4, Size$$serializer.INSTANCE, iconComponent.size);
        }
        if (dVar.e(eVar, 5) || iconComponent.color != null) {
            dVar.j(eVar, 5, ColorScheme$$serializer.INSTANCE, iconComponent.color);
        }
        if (dVar.e(eVar, 6) || !t.c(iconComponent.padding, Padding.Companion.getZero())) {
            dVar.k(eVar, 6, Padding$$serializer.INSTANCE, iconComponent.padding);
        }
        if (dVar.e(eVar, 7) || !t.c(iconComponent.margin, Padding.Companion.getZero())) {
            dVar.k(eVar, 7, Padding$$serializer.INSTANCE, iconComponent.margin);
        }
        if (dVar.e(eVar, 8) || iconComponent.iconBackground != null) {
            dVar.j(eVar, 8, IconComponent$IconBackground$$serializer.INSTANCE, iconComponent.iconBackground);
        }
        if (!dVar.e(eVar, 9) && t.c(iconComponent.overrides, v.n())) {
            return;
        }
        dVar.k(eVar, 9, kVarArr[9], iconComponent.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconComponent)) {
            return false;
        }
        IconComponent iconComponent = (IconComponent) obj;
        return t.c(this.baseUrl, iconComponent.baseUrl) && t.c(this.iconName, iconComponent.iconName) && t.c(this.formats, iconComponent.formats) && t.c(this.visible, iconComponent.visible) && t.c(this.size, iconComponent.size) && t.c(this.color, iconComponent.color) && t.c(this.padding, iconComponent.padding) && t.c(this.margin, iconComponent.margin) && t.c(this.iconBackground, iconComponent.iconBackground) && t.c(this.overrides, iconComponent.overrides);
    }

    public final /* synthetic */ String getBaseUrl() {
        return this.baseUrl;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ Formats getFormats() {
        return this.formats;
    }

    public final /* synthetic */ IconBackground getIconBackground() {
        return this.iconBackground;
    }

    public final /* synthetic */ String getIconName() {
        return this.iconName;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((((this.baseUrl.hashCode() * 31) + this.iconName.hashCode()) * 31) + this.formats.hashCode()) * 31;
        Boolean bool = this.visible;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.size.hashCode()) * 31;
        ColorScheme colorScheme = this.color;
        int hashCode3 = (((((hashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        IconBackground iconBackground = this.iconBackground;
        return ((hashCode3 + (iconBackground != null ? iconBackground.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "IconComponent(baseUrl=" + this.baseUrl + ", iconName=" + this.iconName + ", formats=" + this.formats + ", visible=" + this.visible + ", size=" + this.size + ", color=" + this.color + ", padding=" + this.padding + ", margin=" + this.margin + ", iconBackground=" + this.iconBackground + ", overrides=" + this.overrides + ')';
    }

    public IconComponent(String str, String str2, Formats formats, Boolean bool, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconBackground iconBackground, List list) {
        t.g(str, "baseUrl");
        t.g(str2, "iconName");
        t.g(formats, "formats");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(padding2, "margin");
        t.g(list, "overrides");
        this.baseUrl = str;
        this.iconName = str2;
        this.formats = formats;
        this.visible = bool;
        this.size = size;
        this.color = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.iconBackground = iconBackground;
        this.overrides = list;
    }

    public /* synthetic */ IconComponent(String str, String str2, Formats formats, Boolean bool, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconBackground iconBackground, List list, int i, k kVar) {
        this(str, str2, formats, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i & 32) != 0 ? null : colorScheme, (i & 64) != 0 ? Padding.Companion.getZero() : padding, (i & 128) != 0 ? Padding.Companion.getZero() : padding2, (i & 256) != 0 ? null : iconBackground, (i & 512) != 0 ? v.n() : list);
    }
}
