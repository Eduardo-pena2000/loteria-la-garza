package com.revenuecat.purchases.ui.revenuecatui.components;

import Ga.e;
import V4.f;
import Z4.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import c5.c;
import e5.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PreviewHelpersKt$previewImageLoader$1$1$1 implements b {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $resource;

    public PreviewHelpersKt$previewImageLoader$1$1$1(Context context, int i) {
        this.$context = context;
        this.$resource = i;
    }

    public final Object intercept(b.a aVar, e eVar) {
        Drawable drawable = this.$context.getDrawable(this.$resource);
        t.d(drawable);
        return new q(drawable, aVar.a(), f.b, (c.b) null, (String) null, false, false, 120, (k) null);
    }
}
