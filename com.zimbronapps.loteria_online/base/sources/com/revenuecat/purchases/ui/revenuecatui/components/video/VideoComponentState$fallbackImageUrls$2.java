package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$fallbackImageUrls$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$fallbackImageUrls$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final ThemeImageUrls invoke() {
        NonEmptyMap fallbackSources;
        String localeId = LocalizationKt.toLocaleId((h1.d) VideoComponentState.access$getLocaleProvider$p(this.this$0).invoke());
        PresentedVideoPartial access$getPresentedPartial = VideoComponentState.access$getPresentedPartial(this.this$0);
        if (access$getPresentedPartial == null || (fallbackSources = access$getPresentedPartial.getFallbackSources()) == null) {
            fallbackSources = VideoComponentState.access$getStyle$p(this.this$0).getFallbackSources();
        }
        if (fallbackSources != null) {
            return (ThemeImageUrls) fallbackSources.getOrDefault(LocaleId.box-impl(localeId), fallbackSources.getEntry().getValue());
        }
        return null;
    }
}
