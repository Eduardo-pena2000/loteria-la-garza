package com.revenuecat.purchases.paywalls.components;

import Da.v;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
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
public final class ImageComponent implements PaywallComponent {
    private final Border border;
    private final ColorScheme colorOverlay;
    private final FitMode fitMode;
    private final Padding margin;
    private final MaskShape maskShape;
    private final String overrideSourceLid;
    private final List overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Size size;
    private final ThemeImageUrls source;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new e(ComponentOverride.Companion.serializer(PartialImageComponent$$serializer.INSTANCE))};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return ImageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Ca.e
    public /* synthetic */ ImageComponent(int i, ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, t0 t0Var, k kVar) {
        this(i, themeImageUrls, bool, size, str, maskShape, colorScheme, fitMode, padding, padding2, border, shadow, list, t0Var);
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    public static /* synthetic */ void getFitMode$annotations() {
    }

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    public static /* synthetic */ void getOverrideSourceLid-sa7TU9Q$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ImageComponent imageComponent, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.k(eVar, 0, ThemeImageUrls$$serializer.INSTANCE, imageComponent.source);
        if (dVar.e(eVar, 1) || imageComponent.visible != null) {
            dVar.j(eVar, 1, h.a, imageComponent.visible);
        }
        if (dVar.e(eVar, 2) || !t.c(imageComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.k(eVar, 2, Size$$serializer.INSTANCE, imageComponent.size);
        }
        if (dVar.e(eVar, 3) || imageComponent.overrideSourceLid != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = imageComponent.overrideSourceLid;
            dVar.j(eVar, 3, localizationKey$$serializer, str != null ? LocalizationKey.box-impl(str) : null);
        }
        if (dVar.e(eVar, 4) || imageComponent.maskShape != null) {
            dVar.j(eVar, 4, MaskShapeDeserializer.INSTANCE, imageComponent.maskShape);
        }
        if (dVar.e(eVar, 5) || imageComponent.colorOverlay != null) {
            dVar.j(eVar, 5, ColorScheme$$serializer.INSTANCE, imageComponent.colorOverlay);
        }
        if (dVar.e(eVar, 6) || imageComponent.fitMode != FitMode.FIT) {
            dVar.k(eVar, 6, FitModeDeserializer.INSTANCE, imageComponent.fitMode);
        }
        if (dVar.e(eVar, 7) || !t.c(imageComponent.padding, Padding.Companion.getZero())) {
            dVar.k(eVar, 7, Padding$$serializer.INSTANCE, imageComponent.padding);
        }
        if (dVar.e(eVar, 8) || !t.c(imageComponent.margin, Padding.Companion.getZero())) {
            dVar.k(eVar, 8, Padding$$serializer.INSTANCE, imageComponent.margin);
        }
        if (dVar.e(eVar, 9) || imageComponent.border != null) {
            dVar.j(eVar, 9, Border$$serializer.INSTANCE, imageComponent.border);
        }
        if (dVar.e(eVar, 10) || imageComponent.shadow != null) {
            dVar.j(eVar, 10, Shadow$$serializer.INSTANCE, imageComponent.shadow);
        }
        if (!dVar.e(eVar, 11) && t.c(imageComponent.overrides, v.n())) {
            return;
        }
        dVar.k(eVar, 11, kVarArr[11], imageComponent.overrides);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0037  */
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
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.ImageComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.ImageComponent r5 = (com.revenuecat.purchases.paywalls.components.ImageComponent) r5
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r1 = r4.source
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r3 = r5.source
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Boolean r1 = r4.visible
            java.lang.Boolean r3 = r5.visible
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.overrideSourceLid
            java.lang.String r3 = r5.overrideSourceLid
            if (r1 != 0) goto L39
            if (r3 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r3 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.equals-impl0(r1, r3)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r1 = r4.maskShape
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r3 = r5.maskShape
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.colorOverlay
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.colorOverlay
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = r4.fitMode
            com.revenuecat.purchases.paywalls.components.properties.FitMode r3 = r5.fitMode
            if (r1 == r3) goto L60
            return r2
        L60:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L6b
            return r2
        L6b:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L76
            return r2
        L76:
            com.revenuecat.purchases.paywalls.components.properties.Border r1 = r4.border
            com.revenuecat.purchases.paywalls.components.properties.Border r3 = r5.border
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L81
            return r2
        L81:
            com.revenuecat.purchases.paywalls.components.properties.Shadow r1 = r4.shadow
            com.revenuecat.purchases.paywalls.components.properties.Shadow r3 = r5.shadow
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L8c
            return r2
        L8c:
            java.util.List r1 = r4.overrides
            java.util.List r5 = r5.overrides
            boolean r5 = kotlin.jvm.internal.t.c(r1, r5)
            if (r5 != 0) goto L97
            return r2
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ImageComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ ColorScheme getColorOverlay() {
        return this.colorOverlay;
    }

    public final /* synthetic */ FitMode getFitMode() {
        return this.fitMode;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ MaskShape getMaskShape() {
        return this.maskShape;
    }

    public final /* synthetic */ String getOverrideSourceLid-sa7TU9Q() {
        return this.overrideSourceLid;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ ThemeImageUrls getSource() {
        return this.source;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        Boolean bool = this.visible;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.size.hashCode()) * 31;
        String str = this.overrideSourceLid;
        int i = (hashCode2 + (str == null ? 0 : LocalizationKey.hashCode-impl(str))) * 31;
        MaskShape maskShape = this.maskShape;
        int hashCode3 = (i + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int hashCode4 = (((((((hashCode3 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31) + this.fitMode.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Border border = this.border;
        int hashCode5 = (hashCode4 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        return ((hashCode5 + (shadow != null ? shadow.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImageComponent(source=");
        sb.append(this.source);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb.append(str == null ? "null" : LocalizationKey.toString-impl(str));
        sb.append(", maskShape=");
        sb.append(this.maskShape);
        sb.append(", colorOverlay=");
        sb.append(this.colorOverlay);
        sb.append(", fitMode=");
        sb.append(this.fitMode);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", overrides=");
        sb.append(this.overrides);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ImageComponent(ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, k kVar) {
        this(themeImageUrls, bool, size, str, maskShape, colorScheme, fitMode, padding, padding2, border, shadow, list);
    }

    private ImageComponent(int i, ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, ImageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.source = themeImageUrls;
        if ((i & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 4) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i & 8) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i & 16) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i & 32) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i & 64) == 0) {
            this.fitMode = FitMode.FIT;
        } else {
            this.fitMode = fitMode;
        }
        if ((i & 128) == 0) {
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding;
        }
        if ((i & 256) == 0) {
            this.margin = Padding.Companion.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i & 512) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 1024) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i & 2048) == 0) {
            this.overrides = v.n();
        } else {
            this.overrides = list;
        }
    }

    private ImageComponent(ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list) {
        t.g(themeImageUrls, "source");
        t.g(size, "size");
        t.g(fitMode, "fitMode");
        t.g(padding, "padding");
        t.g(padding2, "margin");
        t.g(list, "overrides");
        this.source = themeImageUrls;
        this.visible = bool;
        this.size = size;
        this.overrideSourceLid = str;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.fitMode = fitMode;
        this.padding = padding;
        this.margin = padding2;
        this.border = border;
        this.shadow = shadow;
        this.overrides = list;
    }

    public /* synthetic */ ImageComponent(ThemeImageUrls themeImageUrls, Boolean bool, Size size, String str, MaskShape maskShape, ColorScheme colorScheme, FitMode fitMode, Padding padding, Padding padding2, Border border, Shadow shadow, List list, int i, k kVar) {
        this(themeImageUrls, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : maskShape, (i & 32) != 0 ? null : colorScheme, (i & 64) != 0 ? FitMode.FIT : fitMode, (i & 128) != 0 ? Padding.Companion.getZero() : padding, (i & 256) != 0 ? Padding.Companion.getZero() : padding2, (i & 512) != 0 ? null : border, (i & 1024) != 0 ? null : shadow, (i & 2048) != 0 ? v.n() : list, null);
    }
}
