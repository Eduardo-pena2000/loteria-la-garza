package com.revenuecat.purchases.models;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum RecurrenceMode {
    INFINITE_RECURRING(1),
    FINITE_RECURRING(2),
    NON_RECURRING(3),
    UNKNOWN(null);

    private final Integer identifier;

    RecurrenceMode(Integer num) {
        this.identifier = num;
    }

    public final Integer getIdentifier() {
        return this.identifier;
    }
}
