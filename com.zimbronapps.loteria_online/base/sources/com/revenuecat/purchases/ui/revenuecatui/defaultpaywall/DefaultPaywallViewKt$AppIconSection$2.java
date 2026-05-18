package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import Qa.p;
import android.graphics.Bitmap;
import androidx.compose.ui.e;
import b0.g1;
import b0.m;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt$AppIconSection$2 extends u implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $appName;
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ e $modifier;
    final /* synthetic */ long $shadowColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$AppIconSection$2(Bitmap bitmap, String str, long j, e eVar, int i, int i2) {
        super(2);
        this.$bitmap = bitmap;
        this.$appName = str;
        this.$shadowColor = j;
        this.$modifier = eVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        DefaultPaywallViewKt.access$AppIconSection-cf5BqRc(this.$bitmap, this.$appName, this.$shadowColor, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
    }
}
