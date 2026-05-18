package com.revenuecat.purchases.models;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class RecurrenceModeKt {
    public static final RecurrenceMode toRecurrenceMode(Integer num) {
        RecurrenceMode recurrenceMode;
        RecurrenceMode[] values = RecurrenceMode.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                recurrenceMode = null;
                break;
            }
            recurrenceMode = values[i];
            if (t.c(recurrenceMode.getIdentifier(), num)) {
                break;
            }
            i++;
        }
        return recurrenceMode == null ? RecurrenceMode.UNKNOWN : recurrenceMode;
    }
}
