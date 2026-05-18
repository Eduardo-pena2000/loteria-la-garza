package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetLatestWebViewConfiguration {
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    @f(c = "com.unity3d.ads.core.domain.GetLatestWebViewConfiguration", f = "GetLatestWebViewConfiguration.kt", l = {17, 33}, m = "invoke")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetLatestWebViewConfiguration.this.invoke(null, null, null, null, this);
        }
    }

    public GetLatestWebViewConfiguration(WebviewConfigurationDataSource webviewConfigurationDataSource) {
        t.g(webviewConfigurationDataSource, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    public static /* synthetic */ Object invoke$default(GetLatestWebViewConfiguration getLatestWebViewConfiguration, String str, Integer num, List list, String str2, e eVar, int i, Object obj) {
        return getLatestWebViewConfiguration.invoke((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.String r10, java.lang.Integer r11, java.util.List r12, java.lang.String r13, Ga.e r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.invoke(java.lang.String, java.lang.Integer, java.util.List, java.lang.String, Ga.e):java.lang.Object");
    }
}
