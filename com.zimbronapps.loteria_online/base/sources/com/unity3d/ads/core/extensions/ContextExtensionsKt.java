package com.unity3d.ads.core.extensions;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ContextExtensionsKt {
    public static final File unityAdsDataStoreFile(Context context, String fileName) {
        t.g(context, "<this>");
        t.g(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "unityAdsDatastore/" + fileName);
    }
}
