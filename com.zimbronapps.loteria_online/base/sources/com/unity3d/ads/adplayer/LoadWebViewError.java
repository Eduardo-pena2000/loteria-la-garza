package com.unity3d.ads.adplayer;

import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LoadWebViewError extends AdPlayerError {
    private final List errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(List errors) {
        super("AdPlayer was not able to load the webview.", null);
        t.g(errors, "errors");
        this.errors = errors;
    }

    public final List getErrors() {
        return this.errors;
    }
}
