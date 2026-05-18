package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState$imageUrls$2 extends u implements a {
    final /* synthetic */ ImageComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageComponentState$imageUrls$2(ImageComponentState imageComponentState) {
        super(0);
        this.this$0 = imageComponentState;
    }

    public final ImageUrls invoke() {
        ImageUrls dark;
        return (!ImageComponentState.access$getDarkMode(this.this$0) || (dark = ImageComponentState.access$getThemeImageUrls(this.this$0).getDark()) == null) ? ImageComponentState.access$getThemeImageUrls(this.this$0).getLight() : dark;
    }
}
