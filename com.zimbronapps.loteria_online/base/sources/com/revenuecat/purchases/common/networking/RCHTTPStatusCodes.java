package com.revenuecat.purchases.common.networking;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class RCHTTPStatusCodes {
    public static final int BAD_REQUEST = 400;
    public static final int CREATED = 201;
    public static final int ERROR = 500;
    public static final int FORBIDDEN = 403;
    public static final RCHTTPStatusCodes INSTANCE = new RCHTTPStatusCodes();
    public static final int NOT_FOUND = 404;
    public static final int NOT_MODIFIED = 304;
    public static final int SUCCESS = 200;
    public static final int UNAUTHORIZED = 401;
    public static final int UNSUCCESSFUL = 300;

    private RCHTTPStatusCodes() {
    }

    public final boolean isServerError(int i) {
        return i >= 500;
    }

    public final boolean isSuccessful(int i) {
        return i < 400;
    }

    public final boolean isSynced(int i) {
        return isSuccessful(i) || !(isServerError(i) || i == 404);
    }
}
