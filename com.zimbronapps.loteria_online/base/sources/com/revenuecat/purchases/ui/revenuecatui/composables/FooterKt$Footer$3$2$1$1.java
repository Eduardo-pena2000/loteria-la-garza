package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.a;
import android.content.Context;
import java.net.URL;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FooterKt$Footer$3$2$1$1 extends u implements a {
    final /* synthetic */ Context $context;
    final /* synthetic */ URL $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterKt$Footer$3$2$1$1(Context context, URL url) {
        super(0);
        this.$context = context;
        this.$it = url;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        Context context = this.$context;
        t.f(context, "context");
        FooterKt.access$openURL(context, this.$it);
    }
}
