package com.revenuecat.purchases.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.Date;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DefaultDateProvider implements DateProvider {
    public Date getNow() {
        return new Date();
    }
}
