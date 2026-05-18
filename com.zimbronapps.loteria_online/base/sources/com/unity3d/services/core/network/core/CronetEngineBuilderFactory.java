package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.jvm.internal.t;
import org.chromium.net.CronetEngine;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CronetEngineBuilderFactory {
    public final CronetEngine.Builder createCronetEngineBuilder(Context context) {
        t.g(context, "context");
        return new CronetEngine.Builder(context);
    }
}
