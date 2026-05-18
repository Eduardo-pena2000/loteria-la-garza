package com.applovin.impl.sdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ Bitmap b;

    public /* synthetic */ d(ImageView imageView, Bitmap bitmap) {
        this.a = imageView;
        this.b = bitmap;
    }

    public final void run() {
        ImageViewUtils.b(this.a, this.b);
    }
}
