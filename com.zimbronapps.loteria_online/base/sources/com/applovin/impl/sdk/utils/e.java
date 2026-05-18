package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.applovin.impl.sdk.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ k a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ ImageView c;

    public /* synthetic */ e(k kVar, Bitmap bitmap, ImageView imageView) {
        this.a = kVar;
        this.b = bitmap;
        this.c = imageView;
    }

    public final void run() {
        ImageViewUtils.g(this.a, this.b, this.c);
    }
}
