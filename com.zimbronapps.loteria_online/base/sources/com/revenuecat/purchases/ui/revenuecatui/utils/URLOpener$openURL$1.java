package com.revenuecat.purchases.ui.revenuecatui.utils;

import Ca.I;
import Qa.l;
import android.content.Context;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class URLOpener$openURL$1 extends q implements l {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLOpener$openURL$1(Context context) {
        super(1, t.a.class, "handleException", "openURL$handleException(Landroid/content/Context;Ljava/lang/Exception;)V", 0);
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Exception) obj);
        return I.a;
    }

    public final void invoke(Exception p0) {
        t.g(p0, "p0");
        URLOpener.access$openURL$handleException(this.$context, p0);
    }
}
