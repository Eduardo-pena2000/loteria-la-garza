package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$fallbackUrls$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$fallbackUrls$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final ImageUrls invoke() {
        ThemeImageUrls access$getFallbackImageUrls;
        ImageUrls dark;
        if (VideoComponentState.access$getDarkMode(this.this$0)) {
            ThemeImageUrls access$getFallbackImageUrls2 = VideoComponentState.access$getFallbackImageUrls(this.this$0);
            if (access$getFallbackImageUrls2 != null && (dark = access$getFallbackImageUrls2.getDark()) != null) {
                return dark;
            }
            access$getFallbackImageUrls = VideoComponentState.access$getFallbackImageUrls(this.this$0);
            if (access$getFallbackImageUrls == null) {
                return null;
            }
        } else {
            access$getFallbackImageUrls = VideoComponentState.access$getFallbackImageUrls(this.this$0);
            if (access$getFallbackImageUrls == null) {
                return null;
            }
        }
        return access$getFallbackImageUrls.getLight();
    }
}
