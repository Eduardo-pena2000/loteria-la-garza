package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$themeVideoUrls$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$themeVideoUrls$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final ThemeVideoUrls invoke() {
        NonEmptyMap sources;
        ThemeVideoUrls themeVideoUrls;
        String localeId = LocalizationKt.toLocaleId((h1.d) VideoComponentState.access$getLocaleProvider$p(this.this$0).invoke());
        PresentedVideoPartial access$getPresentedPartial = VideoComponentState.access$getPresentedPartial(this.this$0);
        if (access$getPresentedPartial != null && (sources = access$getPresentedPartial.getSources()) != null && (themeVideoUrls = (ThemeVideoUrls) sources.getOrDefault(LocaleId.box-impl(localeId), sources.getEntry().getValue())) != null) {
            return themeVideoUrls;
        }
        NonEmptyMap sources2 = VideoComponentState.access$getStyle$p(this.this$0).getSources();
        return (ThemeVideoUrls) sources2.getOrDefault(LocaleId.box-impl(localeId), sources2.getEntry().getValue());
    }
}
