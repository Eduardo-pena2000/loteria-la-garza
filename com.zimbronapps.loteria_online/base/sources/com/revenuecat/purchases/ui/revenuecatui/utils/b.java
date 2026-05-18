package com.revenuecat.purchases.ui.revenuecatui.utils;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ZonedDateTime a(Instant instant, ZoneId zoneId) {
        return instant.atZone(zoneId);
    }
}
