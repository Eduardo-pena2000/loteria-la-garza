package com.unity3d.ads.core.domain;

import Za.E;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(RemoveUrlQuery removeUrlQuery) {
        t.g(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    public String invoke(String url) {
        t.g(url, "url");
        String invoke = this.removeUrlQuery.invoke(url);
        if (invoke == null) {
            return null;
        }
        String Y0 = E.Y0(invoke, '/', null, 2, null);
        if (!E.S(Y0, '.', false, 2, null)) {
            return null;
        }
        String Y02 = E.Y0(Y0, '.', null, 2, null);
        if (Y02.length() == 0) {
            return null;
        }
        return Y02;
    }
}
