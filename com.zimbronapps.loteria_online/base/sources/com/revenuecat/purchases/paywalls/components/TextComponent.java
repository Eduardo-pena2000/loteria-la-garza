package com.revenuecat.purchases.paywalls.components;

import Da.v;
import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.FontAlias$$serializer;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignmentDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.J;
import sb.e;
import sb.f0;
import sb.h;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TextComponent implements PaywallComponent {
    private final ColorScheme backgroundColor;
    private final ColorScheme color;
    private final String fontName;
    private final int fontSize;
    private final FontWeight fontWeight;
    private final Integer fontWeightInt;
    private final HorizontalAlignment horizontalAlignment;
    private final Padding margin;
    private final List overrides;
    private final Padding padding;
    private final Size size;
    private final String text;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new e(ComponentOverride.Companion.serializer(PartialTextComponent$$serializer.INSTANCE))};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return TextComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Ca.e
    public /* synthetic */ TextComponent(int i, String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i2, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, t0 t0Var, k kVar) {
        this(i, str, colorScheme, bool, colorScheme2, str2, fontWeight, num, i2, horizontalAlignment, size, padding, padding2, list, t0Var);
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getFontName-ARcRonI$annotations() {
    }

    public static /* synthetic */ void getFontSize$annotations() {
    }

    public static /* synthetic */ void getFontWeight$annotations() {
    }

    public static /* synthetic */ void getFontWeightInt$annotations() {
    }

    public static /* synthetic */ void getHorizontalAlignment$annotations() {
    }

    public static /* synthetic */ void getText-z7Tp-4o$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(TextComponent textComponent, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.k(eVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.box-impl(textComponent.text));
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        dVar.k(eVar, 1, colorScheme$$serializer, textComponent.color);
        if (dVar.e(eVar, 2) || textComponent.visible != null) {
            dVar.j(eVar, 2, h.a, textComponent.visible);
        }
        if (dVar.e(eVar, 3) || textComponent.backgroundColor != null) {
            dVar.j(eVar, 3, colorScheme$$serializer, textComponent.backgroundColor);
        }
        if (dVar.e(eVar, 4) || textComponent.fontName != null) {
            FontAlias$$serializer fontAlias$$serializer = FontAlias$$serializer.INSTANCE;
            String str = textComponent.fontName;
            dVar.j(eVar, 4, fontAlias$$serializer, str != null ? FontAlias.box-impl(str) : null);
        }
        if (dVar.e(eVar, 5) || textComponent.fontWeight != FontWeight.REGULAR) {
            dVar.k(eVar, 5, FontWeightDeserializer.INSTANCE, textComponent.fontWeight);
        }
        if (dVar.e(eVar, 6) || textComponent.fontWeightInt != null) {
            dVar.j(eVar, 6, J.a, textComponent.fontWeightInt);
        }
        if (dVar.e(eVar, 7) || textComponent.fontSize != 15) {
            dVar.k(eVar, 7, FontSizeSerializer.INSTANCE, Integer.valueOf(textComponent.fontSize));
        }
        if (dVar.e(eVar, 8) || textComponent.horizontalAlignment != HorizontalAlignment.CENTER) {
            dVar.k(eVar, 8, HorizontalAlignmentDeserializer.INSTANCE, textComponent.horizontalAlignment);
        }
        if (dVar.e(eVar, 9) || !t.c(textComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.k(eVar, 9, Size$$serializer.INSTANCE, textComponent.size);
        }
        if (dVar.e(eVar, 10) || !t.c(textComponent.padding, Padding.Companion.getZero())) {
            dVar.k(eVar, 10, Padding$$serializer.INSTANCE, textComponent.padding);
        }
        if (dVar.e(eVar, 11) || !t.c(textComponent.margin, Padding.Companion.getZero())) {
            dVar.k(eVar, 11, Padding$$serializer.INSTANCE, textComponent.margin);
        }
        if (!dVar.e(eVar, 12) && t.c(textComponent.overrides, v.n())) {
            return;
        }
        dVar.k(eVar, 12, kVarArr[12], textComponent.overrides);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.TextComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.TextComponent r5 = (com.revenuecat.purchases.paywalls.components.TextComponent) r5
            java.lang.String r1 = r4.text
            java.lang.String r3 = r5.text
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.equals-impl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.color
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.color
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Boolean r1 = r4.visible
            java.lang.Boolean r3 = r5.visible
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.backgroundColor
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.backgroundColor
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.fontName
            java.lang.String r3 = r5.fontName
            if (r1 != 0) goto L44
            if (r3 != 0) goto L42
            r1 = r0
            goto L4b
        L42:
            r1 = r2
            goto L4b
        L44:
            if (r3 != 0) goto L47
            goto L42
        L47:
            boolean r1 = com.revenuecat.purchases.FontAlias.equals-impl0(r1, r3)
        L4b:
            if (r1 != 0) goto L4e
            return r2
        L4e:
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r1 = r4.fontWeight
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r3 = r5.fontWeight
            if (r1 == r3) goto L55
            return r2
        L55:
            java.lang.Integer r1 = r4.fontWeightInt
            java.lang.Integer r3 = r5.fontWeightInt
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            int r1 = r4.fontSize
            int r3 = r5.fontSize
            if (r1 == r3) goto L67
            return r2
        L67:
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r1 = r4.horizontalAlignment
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r3 = r5.horizontalAlignment
            if (r1 == r3) goto L6e
            return r2
        L6e:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L79
            return r2
        L79:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L84
            return r2
        L84:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L8f
            return r2
        L8f:
            java.util.List r1 = r4.overrides
            java.util.List r5 = r5.overrides
            boolean r5 = kotlin.jvm.internal.t.c(r1, r5)
            if (r5 != 0) goto L9a
            return r2
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TextComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ String getFontName-ARcRonI() {
        return this.fontName;
    }

    public final /* synthetic */ int getFontSize() {
        return this.fontSize;
    }

    public final /* synthetic */ FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final /* synthetic */ Integer getFontWeightInt() {
        return this.fontWeightInt;
    }

    public final /* synthetic */ HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
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

    public final /* synthetic */ String getText-z7Tp-4o() {
        return this.text;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int i = ((LocalizationKey.hashCode-impl(this.text) * 31) + this.color.hashCode()) * 31;
        Boolean bool = this.visible;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode2 = (hashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        String str = this.fontName;
        int i2 = (((hashCode2 + (str == null ? 0 : FontAlias.hashCode-impl(str))) * 31) + this.fontWeight.hashCode()) * 31;
        Integer num = this.fontWeightInt;
        return ((((((((((((i2 + (num != null ? num.hashCode() : 0)) * 31) + this.fontSize) * 31) + this.horizontalAlignment.hashCode()) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextComponent(text=");
        sb.append(LocalizationKey.toString-impl(this.text));
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", fontName=");
        String str = this.fontName;
        sb.append(str == null ? "null" : FontAlias.toString-impl(str));
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontWeightInt=");
        sb.append(this.fontWeightInt);
        sb.append(", fontSize=");
        sb.append(this.fontSize);
        sb.append(", horizontalAlignment=");
        sb.append(this.horizontalAlignment);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", overrides=");
        sb.append(this.overrides);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TextComponent(String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, k kVar) {
        this(str, colorScheme, bool, colorScheme2, str2, fontWeight, num, i, horizontalAlignment, size, padding, padding2, list);
    }

    private TextComponent(int i, String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i2, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, TextComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.color = colorScheme;
        if ((i & 4) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 8) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme2;
        }
        if ((i & 16) == 0) {
            this.fontName = null;
        } else {
            this.fontName = str2;
        }
        this.fontWeight = (i & 32) == 0 ? FontWeight.REGULAR : fontWeight;
        if ((i & 64) == 0) {
            this.fontWeightInt = null;
        } else {
            this.fontWeightInt = num;
        }
        this.fontSize = (i & 128) == 0 ? 15 : i2;
        this.horizontalAlignment = (i & 256) == 0 ? HorizontalAlignment.CENTER : horizontalAlignment;
        this.size = (i & 512) == 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size;
        this.padding = (i & 1024) == 0 ? Padding.Companion.getZero() : padding;
        this.margin = (i & 2048) == 0 ? Padding.Companion.getZero() : padding2;
        this.overrides = (i & 4096) == 0 ? v.n() : list;
    }

    private TextComponent(String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list) {
        t.g(str, "text");
        t.g(colorScheme, "color");
        t.g(fontWeight, "fontWeight");
        t.g(horizontalAlignment, "horizontalAlignment");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(padding2, "margin");
        t.g(list, "overrides");
        this.text = str;
        this.color = colorScheme;
        this.visible = bool;
        this.backgroundColor = colorScheme2;
        this.fontName = str2;
        this.fontWeight = fontWeight;
        this.fontWeightInt = num;
        this.fontSize = i;
        this.horizontalAlignment = horizontalAlignment;
        this.size = size;
        this.padding = padding;
        this.margin = padding2;
        this.overrides = list;
    }

    public /* synthetic */ TextComponent(String str, ColorScheme colorScheme, Boolean bool, ColorScheme colorScheme2, String str2, FontWeight fontWeight, Integer num, int i, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, List list, int i2, k kVar) {
        this(str, colorScheme, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : colorScheme2, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? FontWeight.REGULAR : fontWeight, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? 15 : i, (i2 & 256) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (i2 & 512) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i2 & 1024) != 0 ? Padding.Companion.getZero() : padding, (i2 & 2048) != 0 ? Padding.Companion.getZero() : padding2, (i2 & 4096) != 0 ? v.n() : list, null);
    }
}
