package com.revenuecat.purchases.ui.revenuecatui.errors;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PackageConfigurationError extends Throwable {
    public static final int $stable = 0;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageConfigurationError(String message) {
        super(message);
        t.g(message, "message");
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
