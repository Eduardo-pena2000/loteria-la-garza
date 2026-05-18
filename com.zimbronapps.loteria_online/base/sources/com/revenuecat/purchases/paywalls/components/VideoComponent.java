package com.revenuecat.purchases.paywalls.components;

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
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
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
public final class VideoComponent implements PaywallComponent {
    private final boolean autoplay;
    private final Border border;
    private final ColorScheme colorOverlay;
    private final ThemeImageUrls fallbackSource;
    private final FitMode fitMode;
    private final boolean loop;
    private final Padding margin;
    private final MaskShape maskShape;
    private final boolean muteAudio;
    private final String overrideSourceLid;
    private final List overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final boolean showControls;
    private final Size size;
    private final ThemeVideoUrls source;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new e(ComponentOverride.Companion.serializer(PartialVideoComponent$$serializer.INSTANCE)), null};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return VideoComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Ca.e
    public /* synthetic */ VideoComponent(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List list, String str, t0 t0Var, k kVar) {
        this(i, themeVideoUrls, themeImageUrls, bool, z, z2, z3, z4, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, list, str, t0Var);
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
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

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(VideoComponent videoComponent, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.k(eVar, 0, ThemeVideoUrls$$serializer.INSTANCE, videoComponent.source);
        dVar.j(eVar, 1, ThemeImageUrls$$serializer.INSTANCE, videoComponent.fallbackSource);
        dVar.j(eVar, 2, h.a, videoComponent.visible);
        dVar.B(eVar, 3, videoComponent.showControls);
        dVar.B(eVar, 4, videoComponent.autoplay);
        dVar.B(eVar, 5, videoComponent.loop);
        dVar.B(eVar, 6, videoComponent.muteAudio);
        dVar.k(eVar, 7, Size$$serializer.INSTANCE, videoComponent.size);
        dVar.k(eVar, 8, FitModeDeserializer.INSTANCE, videoComponent.fitMode);
        dVar.j(eVar, 9, MaskShapeDeserializer.INSTANCE, videoComponent.maskShape);
        dVar.j(eVar, 10, ColorScheme$$serializer.INSTANCE, videoComponent.colorOverlay);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        dVar.j(eVar, 11, padding$$serializer, videoComponent.padding);
        dVar.j(eVar, 12, padding$$serializer, videoComponent.margin);
        dVar.j(eVar, 13, Border$$serializer.INSTANCE, videoComponent.border);
        dVar.j(eVar, 14, Shadow$$serializer.INSTANCE, videoComponent.shadow);
        dVar.j(eVar, 15, kVarArr[15], videoComponent.overrides);
        if (!dVar.e(eVar, 16) && videoComponent.overrideSourceLid == null) {
            return;
        }
        LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
        String str = videoComponent.overrideSourceLid;
        dVar.j(eVar, 16, localizationKey$$serializer, str != null ? LocalizationKey.box-impl(str) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
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
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.VideoComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.VideoComponent r5 = (com.revenuecat.purchases.paywalls.components.VideoComponent) r5
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
            boolean r1 = r4.showControls
            boolean r3 = r5.showControls
            if (r1 == r3) goto L34
            return r2
        L34:
            boolean r1 = r4.autoplay
            boolean r3 = r5.autoplay
            if (r1 == r3) goto L3b
            return r2
        L3b:
            boolean r1 = r4.loop
            boolean r3 = r5.loop
            if (r1 == r3) goto L42
            return r2
        L42:
            boolean r1 = r4.muteAudio
            boolean r3 = r5.muteAudio
            if (r1 == r3) goto L49
            return r2
        L49:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L54
            return r2
        L54:
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = r4.fitMode
            com.revenuecat.purchases.paywalls.components.properties.FitMode r3 = r5.fitMode
            if (r1 == r3) goto L5b
            return r2
        L5b:
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r1 = r4.maskShape
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r3 = r5.maskShape
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L66
            return r2
        L66:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.colorOverlay
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.colorOverlay
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L71
            return r2
        L71:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L7c
            return r2
        L7c:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L87
            return r2
        L87:
            com.revenuecat.purchases.paywalls.components.properties.Border r1 = r4.border
            com.revenuecat.purchases.paywalls.components.properties.Border r3 = r5.border
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L92
            return r2
        L92:
            com.revenuecat.purchases.paywalls.components.properties.Shadow r1 = r4.shadow
            com.revenuecat.purchases.paywalls.components.properties.Shadow r3 = r5.shadow
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto L9d
            return r2
        L9d:
            java.util.List r1 = r4.overrides
            java.util.List r3 = r5.overrides
            boolean r1 = kotlin.jvm.internal.t.c(r1, r3)
            if (r1 != 0) goto La8
            return r2
        La8:
            java.lang.String r1 = r4.overrideSourceLid
            java.lang.String r5 = r5.overrideSourceLid
            if (r1 != 0) goto Lb4
            if (r5 != 0) goto Lb2
            r5 = r0
            goto Lbb
        Lb2:
            r5 = r2
            goto Lbb
        Lb4:
            if (r5 != 0) goto Lb7
            goto Lb2
        Lb7:
            boolean r5 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.equals-impl0(r1, r5)
        Lbb:
            if (r5 != 0) goto Lbe
            return r2
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.VideoComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ boolean getAutoplay() {
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

    public final /* synthetic */ boolean getLoop() {
        return this.loop;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ MaskShape getMaskShape() {
        return this.maskShape;
    }

    public final /* synthetic */ boolean getMuteAudio() {
        return this.muteAudio;
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

    public final /* synthetic */ boolean getShowControls() {
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
        int hashCode = this.source.hashCode() * 31;
        ThemeImageUrls themeImageUrls = this.fallbackSource;
        int hashCode2 = (hashCode + (themeImageUrls == null ? 0 : themeImageUrls.hashCode())) * 31;
        Boolean bool = this.visible;
        int hashCode3 = (((((((((((((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.showControls)) * 31) + Boolean.hashCode(this.autoplay)) * 31) + Boolean.hashCode(this.loop)) * 31) + Boolean.hashCode(this.muteAudio)) * 31) + this.size.hashCode()) * 31) + this.fitMode.hashCode()) * 31;
        MaskShape maskShape = this.maskShape;
        int hashCode4 = (hashCode3 + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int hashCode5 = (hashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding = this.padding;
        int hashCode6 = (hashCode5 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int hashCode7 = (hashCode6 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Border border = this.border;
        int hashCode8 = (hashCode7 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int hashCode9 = (hashCode8 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        List list = this.overrides;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.overrideSourceLid;
        return hashCode10 + (str != null ? LocalizationKey.hashCode-impl(str) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoComponent(source=");
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
        sb.append(", overrides=");
        sb.append(this.overrides);
        sb.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb.append(str == null ? "null" : LocalizationKey.toString-impl(str));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ VideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List list, String str, k kVar) {
        this(themeVideoUrls, themeImageUrls, bool, z, z2, z3, z4, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, list, str);
    }

    private VideoComponent(int i, ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List list, String str, t0 t0Var) {
        if (65535 != (i & 65535)) {
            f0.a(i, 65535, VideoComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.source = themeVideoUrls;
        this.fallbackSource = themeImageUrls;
        this.visible = bool;
        this.showControls = z;
        this.autoplay = z2;
        this.loop = z3;
        this.muteAudio = z4;
        this.size = size;
        this.fitMode = fitMode;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.border = border;
        this.shadow = shadow;
        this.overrides = list;
        this.overrideSourceLid = (i & 65536) == 0 ? null : str;
    }

    private VideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List list, String str) {
        t.g(themeVideoUrls, "source");
        t.g(size, "size");
        t.g(fitMode, "fitMode");
        this.source = themeVideoUrls;
        this.fallbackSource = themeImageUrls;
        this.visible = bool;
        this.showControls = z;
        this.autoplay = z2;
        this.loop = z3;
        this.muteAudio = z4;
        this.size = size;
        this.fitMode = fitMode;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.border = border;
        this.shadow = shadow;
        this.overrides = list;
        this.overrideSourceLid = str;
    }

    public /* synthetic */ VideoComponent(ThemeVideoUrls themeVideoUrls, ThemeImageUrls themeImageUrls, Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, Size size, FitMode fitMode, MaskShape maskShape, ColorScheme colorScheme, Padding padding, Padding padding2, Border border, Shadow shadow, List list, String str, int i, k kVar) {
        this(themeVideoUrls, themeImageUrls, bool, z, z2, z3, z4, size, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, list, (i & 65536) != 0 ? null : str, null);
    }
}
