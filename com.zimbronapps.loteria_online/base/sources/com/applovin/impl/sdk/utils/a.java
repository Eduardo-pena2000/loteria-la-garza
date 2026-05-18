package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;
import com.applovin.impl.sdk.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ k b;
    public final /* synthetic */ ImageView c;
    public final /* synthetic */ Uri d;

    public /* synthetic */ a(String str, k kVar, ImageView imageView, Uri uri) {
        this.a = str;
        this.b = kVar;
        this.c = imageView;
        this.d = uri;
    }

    public final void run() {
        ImageViewUtils.e(this.a, this.b, this.c, this.d);
    }
}
