package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.InternalRevenueCatAPI;
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
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.h;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialImageComponent implements PartialComponent {
    public static final Companion Companion = new Companion(null);
    private final Border border;
    private final ColorScheme colorOverlay;
    private final FitMode fitMode;
    private final Padding margin;
    private final MaskShape maskShape;
    private final String overrideSourceLid;
    private final Padding padding;
    private final Shadow shadow;
    private final Size size;
    private final ThemeImageUrls source;
    private final Boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PartialImageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ PartialImageComponent(int i, Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, t0 t0Var, k kVar) {
        this(i, bool, themeImageUrls, size, str, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, t0Var);
    }

    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    public static /* synthetic */ void getFitMode$annotations() {
    }

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    public static /* synthetic */ void getOverrideSourceLid-sa7TU9Q$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialImageComponent partialImageComponent, d dVar, qb.e eVar) {
        if (dVar.e(eVar, 0) || !t.c(partialImageComponent.visible, Boolean.TRUE)) {
            dVar.j(eVar, 0, h.a, partialImageComponent.visible);
        }
        if (dVar.e(eVar, 1) || partialImageComponent.source != null) {
            dVar.j(eVar, 1, ThemeImageUrls$$serializer.INSTANCE, partialImageComponent.source);
        }
        if (dVar.e(eVar, 2) || partialImageComponent.size != null) {
            dVar.j(eVar, 2, Size$$serializer.INSTANCE, partialImageComponent.size);
        }
        if (dVar.e(eVar, 3) || partialImageComponent.overrideSourceLid != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = partialImageComponent.overrideSourceLid;
            dVar.j(eVar, 3, localizationKey$$serializer, str != null ? LocalizationKey.box-impl(str) : null);
        }
        if (dVar.e(eVar, 4) || partialImageComponent.fitMode != null) {
            dVar.j(eVar, 4, FitModeDeserializer.INSTANCE, partialImageComponent.fitMode);
        }
        if (dVar.e(eVar, 5) || partialImageComponent.maskShape != null) {
            dVar.j(eVar, 5, MaskShapeDeserializer.INSTANCE, partialImageComponent.maskShape);
        }
        if (dVar.e(eVar, 6) || partialImageComponent.colorOverlay != null) {
            dVar.j(eVar, 6, ColorScheme$$serializer.INSTANCE, partialImageComponent.colorOverlay);
        }
        if (dVar.e(eVar, 7) || partialImageComponent.padding != null) {
            dVar.j(eVar, 7, Padding$$serializer.INSTANCE, partialImageComponent.padding);
        }
        if (dVar.e(eVar, 8) || partialImageComponent.margin != null) {
            dVar.j(eVar, 8, Padding$$serializer.INSTANCE, partialImageComponent.margin);
        }
        if (dVar.e(eVar, 9) || partialImageComponent.border != null) {
            dVar.j(eVar, 9, Border$$serializer.INSTANCE, partialImageComponent.border);
        }
        if (!dVar.e(eVar, 10) && partialImageComponent.shadow == null) {
            return;
        }
        dVar.j(eVar, 10, Shadow$$serializer.INSTANCE, partialImageComponent.shadow);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
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
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.PartialImageComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.PartialImageComponent r5 = (com.revenuecat.purchases.paywalls.components.PartialImageComponent) r5
            java.lang.Boolean r1 = r4.visible
            java.lang.Boolean r3 = r5.visible
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r1 = r4.source
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r3 = r5.source
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
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = r4.fitMode
            com.revenuecat.purchases.paywalls.components.properties.FitMode r3 = r5.fitMode
            if (r1 == r3) goto L4a
            return r2
        L4a:
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r1 = r4.maskShape
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r3 = r5.maskShape
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.colorOverlay
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.colorOverlay
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L60
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
            com.revenuecat.purchases.paywalls.components.properties.Shadow r5 = r5.shadow
            boolean r5 = kotlin.jvm.internal.t.c(r1, r5)
            if (r5 != 0) goto L8c
            return r2
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialImageComponent.equals(java.lang.Object):boolean");
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
        Boolean bool = this.visible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ThemeImageUrls themeImageUrls = this.source;
        int hashCode2 = (hashCode + (themeImageUrls == null ? 0 : themeImageUrls.hashCode())) * 31;
        Size size = this.size;
        int hashCode3 = (hashCode2 + (size == null ? 0 : size.hashCode())) * 31;
        String str = this.overrideSourceLid;
        int i = (hashCode3 + (str == null ? 0 : LocalizationKey.hashCode-impl(str))) * 31;
        FitMode fitMode = this.fitMode;
        int hashCode4 = (i + (fitMode == null ? 0 : fitMode.hashCode())) * 31;
        MaskShape maskShape = this.maskShape;
        int hashCode5 = (hashCode4 + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int hashCode6 = (hashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding = this.padding;
        int hashCode7 = (hashCode6 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int hashCode8 = (hashCode7 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Border border = this.border;
        int hashCode9 = (hashCode8 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        return hashCode9 + (shadow != null ? shadow.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartialImageComponent(visible=");
        sb.append(this.visible);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb.append(str == null ? "null" : LocalizationKey.toString-impl(str));
        sb.append(", fitMode=");
        sb.append(this.fitMode);
        sb.append(", maskShape=");
        sb.append(this.maskShape);
        sb.append(", colorOverlay=");
        sb.append(this.colorOverlay);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ PartialImageComponent(Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, k kVar) {
        this(bool, themeImageUrls, size, str, fitMode, maskShape, colorScheme, padding, padding2, border, shadow);
    }

    private PartialImageComponent(int i, Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, t0 t0Var) {
        this.visible = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.source = null;
        } else {
            this.source = themeImageUrls;
        }
        if ((i & 4) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 8) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i & 16) == 0) {
            this.fitMode = null;
        } else {
            this.fitMode = fitMode;
        }
        if ((i & 32) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i & 64) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i & 128) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 256) == 0) {
            this.margin = null;
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
    }

    private PartialImageComponent(Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow) {
        this.visible = bool;
        this.source = themeImageUrls;
        this.size = size;
        this.overrideSourceLid = str;
        this.fitMode = fitMode;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.border = border;
        this.shadow = shadow;
    }

    public /* synthetic */ PartialImageComponent(Boolean bool, ThemeImageUrls themeImageUrls, Size size, String str, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, int i, k kVar) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? null : themeImageUrls, (i & 4) != 0 ? null : size, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : fitMode, (i & 32) != 0 ? null : maskShape, (i & 64) != 0 ? null : colorScheme, (i & 128) != 0 ? null : padding, (i & 256) != 0 ? null : padding2, (i & 512) != 0 ? null : border, (i & 1024) == 0 ? shadow : null, null);
    }
}
