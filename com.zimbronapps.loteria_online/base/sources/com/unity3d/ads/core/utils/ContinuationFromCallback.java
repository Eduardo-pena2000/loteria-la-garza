package com.unity3d.ads.core.utils;

import Ca.s;
import Ga.e;
import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    private final e continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(e continuation) {
        super("", 0);
        t.g(continuation, "continuation");
        this.continuation = continuation;
    }

    public void error(Enum r5, Object... params) {
        t.g(params, "params");
        e eVar = this.continuation;
        s.a aVar = s.b;
        eVar.resumeWith(s.b(Ca.t.a(new ExposureException("Invocation failed with: " + r5, params))));
    }

    public void invoke(Object... params) {
        t.g(params, "params");
        this.continuation.resumeWith(s.b(params));
    }
}
