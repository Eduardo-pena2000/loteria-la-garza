package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import Za.E;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidCacheWebViewAssets implements CacheWebViewAssets {
    private final ConcurrentHashMap _cached;
    private final CacheRepository cacheRepository;
    private final SessionRepository sessionRepository;

    @f(c = "com.unity3d.ads.core.domain.AndroidCacheWebViewAssets", f = "AndroidCacheWebViewAssets.kt", l = {35, 45}, m = "invoke")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidCacheWebViewAssets.this.invoke(null, this);
        }
    }

    public AndroidCacheWebViewAssets(CacheRepository cacheRepository, SessionRepository sessionRepository) {
        t.g(cacheRepository, "cacheRepository");
        t.g(sessionRepository, "sessionRepository");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this._cached = new ConcurrentHashMap();
    }

    private final String getFilename(String str, String str2) {
        return str2 + '/' + E.Y0(E.c1(str, '?', null, 2, null), '/', null, 2, null);
    }

    public Map getCached() {
        return this._cached;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e7 -> B:11:0x00ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.WebViewConfiguration r8, Ga.e r9) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidCacheWebViewAssets.invoke(com.unity3d.ads.core.data.model.WebViewConfiguration, Ga.e):java.lang.Object");
    }
}
