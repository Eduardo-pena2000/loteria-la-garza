package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ f(ImageView imageView, Uri uri) {
        this.a = imageView;
        this.b = uri;
    }

    public final void run() {
        ImageViewUtils.c(this.a, this.b);
    }
}
