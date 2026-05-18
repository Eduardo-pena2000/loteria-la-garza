package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Qa.a;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentState$url$2 extends u implements a {
    final /* synthetic */ IconComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconComponentState$url$2(IconComponentState iconComponentState) {
        super(0);
        this.this$0 = iconComponentState;
    }

    public final String invoke() {
        return IconComponentState.access$getBaseUrl(this.this$0) + '/' + IconComponentState.access$getFormats(this.this$0).getWebp();
    }
}
