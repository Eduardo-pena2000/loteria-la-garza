package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.m;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StoreWebViewError extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(Enum r2, String str, Object... errorArguments) {
        super(r2, str, Arrays.copyOf(errorArguments, errorArguments.length));
        t.g(errorArguments, "errorArguments");
    }

    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
