package com.revenuecat.purchases.google.usecase;

import ab.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingClientUseCaseKt {
    private static final int MAX_RETRIES_DEFAULT = 3;
    private static final long RETRY_TIMER_MAX_TIME;
    private static final long RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND;
    private static final long RETRY_TIMER_START;

    static {
        b.a aVar = ab.b.b;
        RETRY_TIMER_START = ab.d.s(878, ab.e.d);
        RETRY_TIMER_MAX_TIME = ab.d.s(15, ab.e.f);
        RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND = ab.d.s(4, ab.e.e);
    }

    public static final /* synthetic */ long access$getRETRY_TIMER_START$p() {
        return RETRY_TIMER_START;
    }

    public static final long getRETRY_TIMER_MAX_TIME() {
        return RETRY_TIMER_MAX_TIME;
    }

    public static final long getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND() {
        return RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND;
    }
}
