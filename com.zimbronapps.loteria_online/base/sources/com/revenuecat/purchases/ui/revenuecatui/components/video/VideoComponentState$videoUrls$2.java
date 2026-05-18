package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState$videoUrls$2 extends u implements Qa.a {
    final /* synthetic */ VideoComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentState$videoUrls$2(VideoComponentState videoComponentState) {
        super(0);
        this.this$0 = videoComponentState;
    }

    public final VideoUrls invoke() {
        VideoUrls dark;
        return (!VideoComponentState.access$getDarkMode(this.this$0) || (dark = VideoComponentState.access$getThemeVideoUrls(this.this$0).getDark()) == null) ? VideoComponentState.access$getThemeVideoUrls(this.this$0).getLight() : dark;
    }
}
