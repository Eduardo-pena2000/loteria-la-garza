package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Ca.A;
import Ga.e;
import V4.f;
import Z4.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c5.c;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import e5.q;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentViewKt$previewImageLoader$1$1$1 implements b {
    final /* synthetic */ Context $context;
    final /* synthetic */ ImageUrls $imageUrls;
    final /* synthetic */ int $resource;

    public ImageComponentViewKt$previewImageLoader$1$1$1(Context context, int i, ImageUrls imageUrls) {
        this.$context = context;
        this.$resource = i;
        this.$imageUrls = imageUrls;
    }

    public final Object intercept(b.a aVar, e eVar) {
        Resources resources = aVar.a().l().getResources();
        Drawable drawable = this.$context.getDrawable(this.$resource);
        t.d(drawable);
        int i = this.$imageUrls.getWidth-pVg5ArA();
        int i2 = this.$imageUrls.getHeight-pVg5ArA();
        ImageUrls imageUrls = this.$imageUrls;
        return new q(new BitmapDrawable(resources, ImageComponentViewKt.toBitmap-gd2BlFg(drawable, i, i2, ImageComponentViewKt.access$toRgbColor(imageUrls.getOriginal() + ':' + A.e(imageUrls.getWidth-pVg5ArA()) + A.e(imageUrls.getHeight-pVg5ArA())))), aVar.a(), f.b, (c.b) null, (String) null, false, false, 120, (k) null);
    }
}
