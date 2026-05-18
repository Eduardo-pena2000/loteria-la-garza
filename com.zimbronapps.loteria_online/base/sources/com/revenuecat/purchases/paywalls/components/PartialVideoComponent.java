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
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
import kotlin.jvm.internal.k;
import ob.b;
import rb.d;
import sb.h;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialVideoComponent implements PartialComponent {
    public static final Companion Companion = new Companion(null);
    private final Boolean autoplay;
    private final Border border;
    private final ColorScheme colorOverlay;
    private final ThemeImageUrls fallbackSource;
    private final FitMode fitMode;
    private final Boolean loop;
    private final Padding margin;
    private final MaskShape maskShape;
    private final Boolean muteAudio;
    private final String overrideSourceLid;
    private final Padding padding;
    private final Shadow shadow;
    private final Boolean showControls;
    private final Size size;
    private final ThemeVideoUrls source;
    private final Boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PartialVideoComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ PartialVideoComponent(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str, t0 t0Var, k kVar) {
        this(i, themeVideoUrls, themeImageUrls, bool, bool2, bool3, bool4, bool5, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, str, t0Var);
    }

    public static /* synthetic */ void getAutoplay$annotations() {
    }

    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    public static /* synthetic */ void getFallbackSource$annotations() {
    }

    public static /* synthetic */ void getFitMode$annotations() {
    }

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    public static /* synthetic */ void getMuteAudio$annotations() {
    }

    public static /* synthetic */ void getOverrideSourceLid-sa7TU9Q$annotations() {
    }

    public static /* synthetic */ void getShowControls$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialVideoComponent partialVideoComponent, d dVar, qb.e eVar) {
        if (dVar.e(eVar, 0) || partialVideoComponent.source != null) {
            dVar.j(eVar, 0, ThemeVideoUrls$$serializer.INSTANCE, partialVideoComponent.source);
        }
        if (dVar.e(eVar, 1) || partialVideoComponent.fallbackSource != null) {
            dVar.j(eVar, 1, ThemeImageUrls$$serializer.INSTANCE, partialVideoComponent.fallbackSource);
        }
        if (dVar.e(eVar, 2) || partialVideoComponent.visible != null) {
            dVar.j(eVar, 2, h.a, partialVideoComponent.visible);
        }
        if (dVar.e(eVar, 3) || partialVideoComponent.showControls != null) {
            dVar.j(eVar, 3, h.a, partialVideoComponent.showControls);
        }
        if (dVar.e(eVar, 4) || partialVideoComponent.autoplay != null) {
            dVar.j(eVar, 4, h.a, partialVideoComponent.autoplay);
        }
        if (dVar.e(eVar, 5) || partialVideoComponent.loop != null) {
            dVar.j(eVar, 5, h.a, partialVideoComponent.loop);
        }
        if (dVar.e(eVar, 6) || partialVideoComponent.muteAudio != null) {
            dVar.j(eVar, 6, h.a, partialVideoComponent.muteAudio);
        }
        if (dVar.e(eVar, 7) || partialVideoComponent.size != null) {
            dVar.j(eVar, 7, Size$$serializer.INSTANCE, partialVideoComponent.size);
        }
        if (dVar.e(eVar, 8) || partialVideoComponent.fitMode != null) {
            dVar.j(eVar, 8, FitModeDeserializer.INSTANCE, partialVideoComponent.fitMode);
        }
        if (dVar.e(eVar, 9) || partialVideoComponent.maskShape != null) {
            dVar.j(eVar, 9, MaskShapeDeserializer.INSTANCE, partialVideoComponent.maskShape);
        }
        if (dVar.e(eVar, 10) || partialVideoComponent.colorOverlay != null) {
            dVar.j(eVar, 10, ColorScheme$$serializer.INSTANCE, partialVideoComponent.colorOverlay);
        }
        if (dVar.e(eVar, 11) || partialVideoComponent.padding != null) {
            dVar.j(eVar, 11, Padding$$serializer.INSTANCE, partialVideoComponent.padding);
        }
        if (dVar.e(eVar, 12) || partialVideoComponent.margin != null) {
            dVar.j(eVar, 12, Padding$$serializer.INSTANCE, partialVideoComponent.margin);
        }
        if (dVar.e(eVar, 13) || partialVideoComponent.border != null) {
            dVar.j(eVar, 13, Border$$serializer.INSTANCE, partialVideoComponent.border);
        }
        if (dVar.e(eVar, 14) || partialVideoComponent.shadow != null) {
            dVar.j(eVar, 14, Shadow$$serializer.INSTANCE, partialVideoComponent.shadow);
        }
        if (!dVar.e(eVar, 15) && partialVideoComponent.overrideSourceLid == null) {
            return;
        }
        LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
        String str = partialVideoComponent.overrideSourceLid;
        dVar.j(eVar, 15, localizationKey$$serializer, str != null ? LocalizationKey.box-impl(str) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
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
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.PartialVideoComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.PartialVideoComponent r5 = (com.revenuecat.purchases.paywalls.components.PartialVideoComponent) r5
            com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls r1 = r4.source
            com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls r3 = r5.source
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r1 = r4.fallbackSource
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r3 = r5.fallbackSource
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
            java.lang.Boolean r1 = r4.showControls
            java.lang.Boolean r3 = r5.showControls
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Boolean r1 = r4.autoplay
            java.lang.Boolean r3 = r5.autoplay
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.Boolean r1 = r4.loop
            java.lang.Boolean r3 = r5.loop
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.Boolean r1 = r4.muteAudio
            java.lang.Boolean r3 = r5.muteAudio
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = r4.fitMode
            com.revenuecat.purchases.paywalls.components.properties.FitMode r3 = r5.fitMode
            if (r1 == r3) goto L6b
            return r2
        L6b:
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r1 = r4.maskShape
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r3 = r5.maskShape
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L76
            return r2
        L76:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.colorOverlay
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.colorOverlay
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L81
            return r2
        L81:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L8c
            return r2
        L8c:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L97
            return r2
        L97:
            com.revenuecat.purchases.paywalls.components.properties.Border r1 = r4.border
            com.revenuecat.purchases.paywalls.components.properties.Border r3 = r5.border
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto La2
            return r2
        La2:
            com.revenuecat.purchases.paywalls.components.properties.Shadow r1 = r4.shadow
            com.revenuecat.purchases.paywalls.components.properties.Shadow r3 = r5.shadow
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto Lad
            return r2
        Lad:
            java.lang.String r1 = r4.overrideSourceLid
            java.lang.String r5 = r5.overrideSourceLid
            if (r1 != 0) goto Lb9
            if (r5 != 0) goto Lb7
            r5 = r0
            goto Lc0
        Lb7:
            r5 = r2
            goto Lc0
        Lb9:
            if (r5 != 0) goto Lbc
            goto Lb7
        Lbc:
            boolean r5 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.equals-impl0(r1, r5)
        Lc0:
            if (r5 != 0) goto Lc3
            return r2
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialVideoComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ Boolean getAutoplay() {
        return this.autoplay;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ ColorScheme getColorOverlay() {
        return this.colorOverlay;
    }

    public final /* synthetic */ ThemeImageUrls getFallbackSource() {
        return this.fallbackSource;
    }

    public final /* synthetic */ FitMode getFitMode() {
        return this.fitMode;
    }

    public final /* synthetic */ Boolean getLoop() {
        return this.loop;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ MaskShape getMaskShape() {
        return this.maskShape;
    }

    public final /* synthetic */ Boolean getMuteAudio() {
        return this.muteAudio;
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

    public final /* synthetic */ Boolean getShowControls() {
        return this.showControls;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ ThemeVideoUrls getSource() {
        return this.source;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        ThemeVideoUrls themeVideoUrls = this.source;
        int hashCode = (themeVideoUrls == null ? 0 : themeVideoUrls.hashCode()) * 31;
        ThemeImageUrls themeImageUrls = this.fallbackSource;
        int hashCode2 = (hashCode + (themeImageUrls == null ? 0 : themeImageUrls.hashCode())) * 31;
        Boolean bool = this.visible;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showControls;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.autoplay;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.loop;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.muteAudio;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Size size = this.size;
        int hashCode8 = (hashCode7 + (size == null ? 0 : size.hashCode())) * 31;
        FitMode fitMode = this.fitMode;
        int hashCode9 = (hashCode8 + (fitMode == null ? 0 : fitMode.hashCode())) * 31;
        MaskShape maskShape = this.maskShape;
        int hashCode10 = (hashCode9 + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int hashCode11 = (hashCode10 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding = this.padding;
        int hashCode12 = (hashCode11 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int hashCode13 = (hashCode12 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Border border = this.border;
        int hashCode14 = (hashCode13 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int hashCode15 = (hashCode14 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        String str = this.overrideSourceLid;
        return hashCode15 + (str != null ? LocalizationKey.hashCode-impl(str) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartialVideoComponent(source=");
        sb.append(this.source);
        sb.append(", fallbackSource=");
        sb.append(this.fallbackSource);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", showControls=");
        sb.append(this.showControls);
        sb.append(", autoplay=");
        sb.append(this.autoplay);
        sb.append(", loop=");
        sb.append(this.loop);
        sb.append(", muteAudio=");
        sb.append(this.muteAudio);
        sb.append(", size=");
        sb.append(this.size);
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
        sb.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb.append(str == null ? "null" : LocalizationKey.toString-impl(str));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ PartialVideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str, k kVar) {
        this(themeVideoUrls, themeImageUrls, bool, bool2, bool3, bool4, bool5, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, str);
    }

    private PartialVideoComponent(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str, t0 t0Var) {
        if ((i & 1) == 0) {
            this.source = null;
        } else {
            this.source = themeVideoUrls;
        }
        if ((i & 2) == 0) {
            this.fallbackSource = null;
        } else {
            this.fallbackSource = themeImageUrls;
        }
        if ((i & 4) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 8) == 0) {
            this.showControls = null;
        } else {
            this.showControls = bool2;
        }
        if ((i & 16) == 0) {
            this.autoplay = null;
        } else {
            this.autoplay = bool3;
        }
        if ((i & 32) == 0) {
            this.loop = null;
        } else {
            this.loop = bool4;
        }
        if ((i & 64) == 0) {
            this.muteAudio = null;
        } else {
            this.muteAudio = bool5;
        }
        if ((i & 128) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 256) == 0) {
            this.fitMode = null;
        } else {
            this.fitMode = fitMode;
        }
        if ((i & 512) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i & 1024) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i & 2048) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 4096) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
        if ((i & 8192) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 16384) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i & 32768) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
    }

    private PartialVideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str) {
        this.source = themeVideoUrls;
        this.fallbackSource = themeImageUrls;
        this.visible = bool;
        this.showControls = bool2;
        this.autoplay = bool3;
        this.loop = bool4;
        this.muteAudio = bool5;
        this.size = size;
        this.fitMode = fitMode;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.border = border;
        this.shadow = shadow;
        this.overrideSourceLid = str;
    }

    public /* synthetic */ PartialVideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, String str, int i, k kVar) {
        this((i & 1) != 0 ? null : themeVideoUrls, (i & 2) != 0 ? null : themeImageUrls, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? null : size, (i & 256) != 0 ? null : fitMode, (i & 512) != 0 ? null : maskShape, (i & 1024) != 0 ? null : colorScheme, (i & 2048) != 0 ? null : padding, (i & 4096) != 0 ? null : padding2, (i & 8192) != 0 ? null : border, (i & 16384) != 0 ? null : shadow, (i & 32768) != 0 ? null : str, null);
    }
}
