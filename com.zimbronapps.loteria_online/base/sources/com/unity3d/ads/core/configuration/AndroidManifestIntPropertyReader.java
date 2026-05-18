package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        t.g(context, "context");
        this.context = context;
    }

    public final Integer getPropertyByName(String propertyName) {
        t.g(propertyName, "propertyName");
        try {
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            Integer valueOf = Integer.valueOf(bundle.getInt(propertyName));
            if (bundle.containsKey(propertyName)) {
                return valueOf;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
