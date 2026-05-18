package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import h1.d;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$themeImageUrls$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$themeImageUrls$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final ThemeImageUrls invoke() {
        NonEmptyMap sources;
        ThemeImageUrls themeImageUrls;
        String localeId = LocalizationKt.toLocaleId((d) ImageComponentState.access$getLocaleProvider$p(this.this$0).invoke());
        PresentedImagePartial access$getPresentedPartial = ImageComponentState.access$getPresentedPartial(this.this$0);
        if (access$getPresentedPartial != null && (sources = access$getPresentedPartial.getSources()) != null && (themeImageUrls = (ThemeImageUrls) sources.getOrDefault(LocaleId.box-impl(localeId), sources.getEntry().getValue())) != null) {
            return themeImageUrls;
        }
        NonEmptyMap sources2 = ImageComponentState.access$getStyle$p(this.this$0).getSources();
        return (ThemeImageUrls) sources2.getOrDefault(LocaleId.box-impl(localeId), sources2.getEntry().getValue());
    }
}
