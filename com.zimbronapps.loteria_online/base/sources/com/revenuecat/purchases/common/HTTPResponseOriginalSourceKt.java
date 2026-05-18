package com.revenuecat.purchases.common;

import com.revenuecat.purchases.common.networking.HTTPResult;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class HTTPResponseOriginalSourceKt {
    public static final HTTPResponseOriginalSource getOriginalDataSource(HTTPResult hTTPResult) {
        t.g(hTTPResult, "<this>");
        if (hTTPResult.isLoadShedderResponse() && hTTPResult.isFallbackURL()) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Request to fallback URL was handled by load shedder, which should never happen. Defaulting to fallback source.", null);
        }
        return hTTPResult.isFallbackURL() ? HTTPResponseOriginalSource.FALLBACK : hTTPResult.isLoadShedderResponse() ? HTTPResponseOriginalSource.LOAD_SHEDDER : HTTPResponseOriginalSource.MAIN;
    }

    public static /* synthetic */ void getOriginalDataSource$annotations(HTTPResult hTTPResult) {
    }
}
