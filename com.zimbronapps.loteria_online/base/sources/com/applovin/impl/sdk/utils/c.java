package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ Uri a;
    public final /* synthetic */ ImageView b;

    public /* synthetic */ c(Uri uri, ImageView imageView) {
        this.a = uri;
        this.b = imageView;
    }

    public final void run() {
        ImageViewUtils.f(this.a, this.b);
    }
}
