package com.revenuecat.purchases.utils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface UrlConnectionFactory {

    public static final class DefaultImpls {
        public static /* synthetic */ UrlConnection createConnection$default(UrlConnectionFactory urlConnectionFactory, String str, String str2, int i, Object obj) {
            return UrlConnectionFactory.createConnection$default(urlConnectionFactory, str, str2, i, obj);
        }
    }

    static /* synthetic */ UrlConnection createConnection$default(UrlConnectionFactory urlConnectionFactory, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConnection");
        }
        if ((i & 2) != 0) {
            str2 = "GET";
        }
        return urlConnectionFactory.createConnection(str, str2);
    }

    UrlConnection createConnection(String str, String str2);
}
