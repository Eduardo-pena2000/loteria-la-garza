package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;

    public AndroidHandleOpenUrl(Context context) {
        t.g(context, "context");
        this.context = context;
    }

    public void invoke(String url, String str) {
        t.g(url, "url");
        Intent intent = new Intent();
        if (str == null || str.length() <= 0) {
            str = null;
        }
        intent.setPackage(str);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        intent.setFlags(268435456);
        this.context.startActivity(intent);
    }
}
