package com.revenuecat.purchases.ui.revenuecatui.components.style;

import F.L;
import M0.f;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final boolean autoplay;
    private final BorderStyles border;
    private final f contentScale;
    private final NonEmptyMap fallbackSources;
    private final boolean ignoreTopWindowInsets;
    private final boolean loop;
    private final L margin;
    private final boolean muteAudio;
    private final OfferEligibility offerEligibility;
    private final ColorStyles overlay;
    private final List overrides;
    private final L padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final ShadowStyles shadow;
    private final E1 shape;
    private final boolean showControls;
    private final Size size;
    private final NonEmptyMap sources;
    private final Integer tabIndex;
    private final boolean visible;

    public VideoComponentStyle(NonEmptyMap sources, NonEmptyMap nonEmptyMap, boolean z, boolean z2, boolean z3, boolean z4, Size size, boolean z5, L padding, L margin, E1 e1, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, f contentScale, Package r24, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, boolean z6, List overrides) {
        t.g(sources, "sources");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(contentScale, "contentScale");
        t.g(overrides, "overrides");
        this.sources = sources;
        this.fallbackSources = nonEmptyMap;
        this.showControls = z;
        this.autoplay = z2;
        this.loop = z3;
        this.muteAudio = z4;
        this.size = size;
        this.visible = z5;
        this.padding = padding;
        this.margin = margin;
        this.shape = e1;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.overlay = colorStyles;
        this.contentScale = contentScale;
        this.rcPackage = r24;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.ignoreTopWindowInsets = z6;
        this.overrides = overrides;
    }

    public static /* synthetic */ VideoComponentStyle copy$default(VideoComponentStyle videoComponentStyle, NonEmptyMap nonEmptyMap, NonEmptyMap nonEmptyMap2, boolean z, boolean z2, boolean z3, boolean z4, Size size, boolean z5, L l, L l2, E1 e1, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, f fVar, Package r33, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, boolean z6, List list, int i, Object obj) {
        return videoComponentStyle.copy((i & 1) != 0 ? videoComponentStyle.sources : nonEmptyMap, (i & 2) != 0 ? videoComponentStyle.fallbackSources : nonEmptyMap2, (i & 4) != 0 ? videoComponentStyle.showControls : z, (i & 8) != 0 ? videoComponentStyle.autoplay : z2, (i & 16) != 0 ? videoComponentStyle.loop : z3, (i & 32) != 0 ? videoComponentStyle.muteAudio : z4, (i & 64) != 0 ? videoComponentStyle.size : size, (i & 128) != 0 ? videoComponentStyle.visible : z5, (i & 256) != 0 ? videoComponentStyle.padding : l, (i & 512) != 0 ? videoComponentStyle.margin : l2, (i & 1024) != 0 ? videoComponentStyle.shape : e1, (i & 2048) != 0 ? videoComponentStyle.border : borderStyles, (i & 4096) != 0 ? videoComponentStyle.shadow : shadowStyles, (i & 8192) != 0 ? videoComponentStyle.overlay : colorStyles, (i & 16384) != 0 ? videoComponentStyle.contentScale : fVar, (i & 32768) != 0 ? videoComponentStyle.rcPackage : r33, (i & 65536) != 0 ? videoComponentStyle.resolvedOffer : resolvedOffer, (i & 131072) != 0 ? videoComponentStyle.tabIndex : num, (i & 262144) != 0 ? videoComponentStyle.offerEligibility : offerEligibility, (i & 524288) != 0 ? videoComponentStyle.ignoreTopWindowInsets : z6, (i & 1048576) != 0 ? videoComponentStyle.overrides : list);
    }

    public final NonEmptyMap component1() {
        return this.sources;
    }

    public final L component10() {
        return this.margin;
    }

    public final E1 component11() {
        return this.shape;
    }

    public final BorderStyles component12() {
        return this.border;
    }

    public final ShadowStyles component13() {
        return this.shadow;
    }

    public final ColorStyles component14() {
        return this.overlay;
    }

    public final f component15() {
        return this.contentScale;
    }

    public final Package component16() {
        return this.rcPackage;
    }

    public final ResolvedOffer component17() {
        return this.resolvedOffer;
    }

    public final Integer component18() {
        return this.tabIndex;
    }

    public final OfferEligibility component19() {
        return this.offerEligibility;
    }

    public final NonEmptyMap component2() {
        return this.fallbackSources;
    }

    public final boolean component20() {
        return this.ignoreTopWindowInsets;
    }

    public final List component21() {
        return this.overrides;
    }

    public final boolean component3() {
        return this.showControls;
    }

    public final boolean component4() {
        return this.autoplay;
    }

    public final boolean component5() {
        return this.loop;
    }

    public final boolean component6() {
        return this.muteAudio;
    }

    public final Size component7() {
        return this.size;
    }

    public final boolean component8() {
        return this.visible;
    }

    public final L component9() {
        return this.padding;
    }

    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i);
    }

    public final VideoComponentStyle copy(NonEmptyMap sources, NonEmptyMap nonEmptyMap, boolean z, boolean z2, boolean z3, boolean z4, Size size, boolean z5, L padding, L margin, E1 e1, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, f contentScale, Package r40, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, boolean z6, List overrides) {
        t.g(sources, "sources");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(contentScale, "contentScale");
        t.g(overrides, "overrides");
        return new VideoComponentStyle(sources, nonEmptyMap, z, z2, z3, z4, size, z5, padding, margin, e1, borderStyles, shadowStyles, colorStyles, contentScale, r40, resolvedOffer, num, offerEligibility, z6, overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoComponentStyle)) {
            return false;
        }
        VideoComponentStyle videoComponentStyle = (VideoComponentStyle) obj;
        return t.c(this.sources, videoComponentStyle.sources) && t.c(this.fallbackSources, videoComponentStyle.fallbackSources) && this.showControls == videoComponentStyle.showControls && this.autoplay == videoComponentStyle.autoplay && this.loop == videoComponentStyle.loop && this.muteAudio == videoComponentStyle.muteAudio && t.c(this.size, videoComponentStyle.size) && this.visible == videoComponentStyle.visible && t.c(this.padding, videoComponentStyle.padding) && t.c(this.margin, videoComponentStyle.margin) && t.c(this.shape, videoComponentStyle.shape) && t.c(this.border, videoComponentStyle.border) && t.c(this.shadow, videoComponentStyle.shadow) && t.c(this.overlay, videoComponentStyle.overlay) && t.c(this.contentScale, videoComponentStyle.contentScale) && t.c(this.rcPackage, videoComponentStyle.rcPackage) && t.c(this.resolvedOffer, videoComponentStyle.resolvedOffer) && t.c(this.tabIndex, videoComponentStyle.tabIndex) && t.c(this.offerEligibility, videoComponentStyle.offerEligibility) && this.ignoreTopWindowInsets == videoComponentStyle.ignoreTopWindowInsets && t.c(this.overrides, videoComponentStyle.overrides);
    }

    public final /* synthetic */ boolean getAutoplay() {
        return this.autoplay;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ f getContentScale() {
        return this.contentScale;
    }

    public final /* synthetic */ NonEmptyMap getFallbackSources() {
        return this.fallbackSources;
    }

    public final /* synthetic */ boolean getIgnoreTopWindowInsets() {
        return this.ignoreTopWindowInsets;
    }

    public final /* synthetic */ boolean getLoop() {
        return this.loop;
    }

    public final /* synthetic */ L getMargin() {
        return this.margin;
    }

    public final /* synthetic */ boolean getMuteAudio() {
        return this.muteAudio;
    }

    public /* synthetic */ OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final /* synthetic */ ColorStyles getOverlay() {
        return this.overlay;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public String getPackageUniqueId() {
        return PackageContext.DefaultImpls.getPackageUniqueId(this);
    }

    public final /* synthetic */ L getPadding() {
        return this.padding;
    }

    public /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    public /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ E1 getShape() {
        return this.shape;
    }

    public final /* synthetic */ boolean getShowControls() {
        return this.showControls;
    }

    public /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ NonEmptyMap getSources() {
        return this.sources;
    }

    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = this.sources.hashCode() * 31;
        NonEmptyMap nonEmptyMap = this.fallbackSources;
        int hashCode2 = (((((((((((((((((hashCode + (nonEmptyMap == null ? 0 : nonEmptyMap.hashCode())) * 31) + Boolean.hashCode(this.showControls)) * 31) + Boolean.hashCode(this.autoplay)) * 31) + Boolean.hashCode(this.loop)) * 31) + Boolean.hashCode(this.muteAudio)) * 31) + this.size.hashCode()) * 31) + Boolean.hashCode(this.visible)) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        E1 e1 = this.shape;
        int hashCode3 = (hashCode2 + (e1 == null ? 0 : e1.hashCode())) * 31;
        BorderStyles borderStyles = this.border;
        int hashCode4 = (hashCode3 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        int hashCode5 = (hashCode4 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        ColorStyles colorStyles = this.overlay;
        int hashCode6 = (((hashCode5 + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31) + this.contentScale.hashCode()) * 31;
        Package r1 = this.rcPackage;
        int hashCode7 = (hashCode6 + (r1 == null ? 0 : r1.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int hashCode8 = (hashCode7 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        return ((((hashCode9 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + Boolean.hashCode(this.ignoreTopWindowInsets)) * 31) + this.overrides.hashCode();
    }

    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "VideoComponentStyle(sources=" + this.sources + ", fallbackSources=" + this.fallbackSources + ", showControls=" + this.showControls + ", autoplay=" + this.autoplay + ", loop=" + this.loop + ", muteAudio=" + this.muteAudio + ", size=" + this.size + ", visible=" + this.visible + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", overlay=" + this.overlay + ", contentScale=" + this.contentScale + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", ignoreTopWindowInsets=" + this.ignoreTopWindowInsets + ", overrides=" + this.overrides + ')';
    }

    public /* synthetic */ VideoComponentStyle(NonEmptyMap nonEmptyMap, NonEmptyMap nonEmptyMap2, boolean z, boolean z2, boolean z3, boolean z4, Size size, boolean z5, L l, L l2, E1 e1, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, f fVar, Package r40, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, boolean z6, List list, int i, k kVar) {
        this(nonEmptyMap, nonEmptyMap2, z, z2, z3, z4, size, z5, l, l2, e1, borderStyles, shadowStyles, colorStyles, fVar, r40, (i & 65536) != 0 ? null : resolvedOffer, num, (i & 262144) != 0 ? null : offerEligibility, (i & 524288) != 0 ? false : z6, list);
    }
}
