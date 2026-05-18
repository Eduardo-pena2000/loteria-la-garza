package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.h;
import sb.t0;
import sb.x0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialIconComponent implements PartialComponent {
    public static final Companion Companion = new Companion(null);
    private final String baseUrl;
    private final ColorScheme color;
    private final IconComponent.Formats formats;
    private final IconComponent.IconBackground iconBackground;
    private final String iconName;
    private final Padding margin;
    private final Padding padding;
    private final Size size;
    private final Boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PartialIconComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialIconComponent() {
        this((Boolean) null, (String) null, (String) null, (IconComponent.Formats) null, (Size) null, (ColorScheme) null, (Padding) null, (Padding) null, (IconComponent.IconBackground) null, 511, (k) null);
    }

    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    public static /* synthetic */ void getIconBackground$annotations() {
    }

    public static /* synthetic */ void getIconName$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialIconComponent partialIconComponent, d dVar, e eVar) {
        if (dVar.e(eVar, 0) || !t.c(partialIconComponent.visible, Boolean.TRUE)) {
            dVar.j(eVar, 0, h.a, partialIconComponent.visible);
        }
        if (dVar.e(eVar, 1) || partialIconComponent.baseUrl != null) {
            dVar.j(eVar, 1, x0.a, partialIconComponent.baseUrl);
        }
        if (dVar.e(eVar, 2) || partialIconComponent.iconName != null) {
            dVar.j(eVar, 2, x0.a, partialIconComponent.iconName);
        }
        if (dVar.e(eVar, 3) || partialIconComponent.formats != null) {
            dVar.j(eVar, 3, IconComponent$Formats$$serializer.INSTANCE, partialIconComponent.formats);
        }
        if (dVar.e(eVar, 4) || partialIconComponent.size != null) {
            dVar.j(eVar, 4, Size$$serializer.INSTANCE, partialIconComponent.size);
        }
        if (dVar.e(eVar, 5) || partialIconComponent.color != null) {
            dVar.j(eVar, 5, ColorScheme$$serializer.INSTANCE, partialIconComponent.color);
        }
        if (dVar.e(eVar, 6) || partialIconComponent.padding != null) {
            dVar.j(eVar, 6, Padding$$serializer.INSTANCE, partialIconComponent.padding);
        }
        if (dVar.e(eVar, 7) || partialIconComponent.margin != null) {
            dVar.j(eVar, 7, Padding$$serializer.INSTANCE, partialIconComponent.margin);
        }
        if (!dVar.e(eVar, 8) && partialIconComponent.iconBackground == null) {
            return;
        }
        dVar.j(eVar, 8, IconComponent$IconBackground$$serializer.INSTANCE, partialIconComponent.iconBackground);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialIconComponent)) {
            return false;
        }
        PartialIconComponent partialIconComponent = (PartialIconComponent) obj;
        return t.c(this.visible, partialIconComponent.visible) && t.c(this.baseUrl, partialIconComponent.baseUrl) && t.c(this.iconName, partialIconComponent.iconName) && t.c(this.formats, partialIconComponent.formats) && t.c(this.size, partialIconComponent.size) && t.c(this.color, partialIconComponent.color) && t.c(this.padding, partialIconComponent.padding) && t.c(this.margin, partialIconComponent.margin) && t.c(this.iconBackground, partialIconComponent.iconBackground);
    }

    public final /* synthetic */ String getBaseUrl() {
        return this.baseUrl;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ IconComponent.Formats getFormats() {
        return this.formats;
    }

    public final /* synthetic */ IconComponent.IconBackground getIconBackground() {
        return this.iconBackground;
    }

    public final /* synthetic */ String getIconName() {
        return this.iconName;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
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
        Boolean bool = this.visible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.baseUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconComponent.Formats formats = this.formats;
        int hashCode4 = (hashCode3 + (formats == null ? 0 : formats.hashCode())) * 31;
        Size size = this.size;
        int hashCode5 = (hashCode4 + (size == null ? 0 : size.hashCode())) * 31;
        ColorScheme colorScheme = this.color;
        int hashCode6 = (hashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding = this.padding;
        int hashCode7 = (hashCode6 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int hashCode8 = (hashCode7 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        IconComponent.IconBackground iconBackground = this.iconBackground;
        return hashCode8 + (iconBackground != null ? iconBackground.hashCode() : 0);
    }

    public String toString() {
        return "PartialIconComponent(visible=" + this.visible + ", baseUrl=" + this.baseUrl + ", iconName=" + this.iconName + ", formats=" + this.formats + ", size=" + this.size + ", color=" + this.color + ", padding=" + this.padding + ", margin=" + this.margin + ", iconBackground=" + this.iconBackground + ')';
    }

    @Ca.e
    public /* synthetic */ PartialIconComponent(int i, Boolean bool, String str, String str2, IconComponent.Formats formats, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconComponent.IconBackground iconBackground, t0 t0Var) {
        this.visible = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.baseUrl = null;
        } else {
            this.baseUrl = str;
        }
        if ((i & 4) == 0) {
            this.iconName = null;
        } else {
            this.iconName = str2;
        }
        if ((i & 8) == 0) {
            this.formats = null;
        } else {
            this.formats = formats;
        }
        if ((i & 16) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 32) == 0) {
            this.color = null;
        } else {
            this.color = colorScheme;
        }
        if ((i & 64) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 128) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
        if ((i & 256) == 0) {
            this.iconBackground = null;
        } else {
            this.iconBackground = iconBackground;
        }
    }

    public PartialIconComponent(Boolean bool, String str, String str2, IconComponent.Formats formats, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconComponent.IconBackground iconBackground) {
        this.visible = bool;
        this.baseUrl = str;
        this.iconName = str2;
        this.formats = formats;
        this.size = size;
        this.color = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.iconBackground = iconBackground;
    }

    public /* synthetic */ PartialIconComponent(Boolean bool, String str, String str2, IconComponent.Formats formats, Size size, ColorScheme colorScheme, Padding padding, Padding padding2, IconComponent.IconBackground iconBackground, int i, k kVar) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : formats, (i & 16) != 0 ? null : size, (i & 32) != 0 ? null : colorScheme, (i & 64) != 0 ? null : padding, (i & 128) != 0 ? null : padding2, (i & 256) == 0 ? iconBackground : null);
    }
}
