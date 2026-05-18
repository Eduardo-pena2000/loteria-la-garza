package com.revenuecat.purchases.common;

import Da.u;
import Da.v;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum LogIntent {
    DEBUG(u.e("ℹ️")),
    GOOGLE_ERROR(v.q(new String[]{"🤖", "‼️"})),
    GOOGLE_WARNING(v.q(new String[]{"🤖", "‼️"})),
    INFO(u.e("ℹ️")),
    PURCHASE(u.e("💰")),
    RC_ERROR(v.q(new String[]{"😿", "‼️"})),
    RC_PURCHASE_SUCCESS(v.q(new String[]{"😻", "💰"})),
    RC_SUCCESS(u.e("😻")),
    USER(u.e("👤")),
    WARNING(u.e("⚠️")),
    AMAZON_WARNING(v.q(new String[]{"📦", "‼️"})),
    AMAZON_ERROR(v.q(new String[]{"📦", "‼️"})),
    GALAXY_WARNING(v.q(new String[]{"✨", "‼️"})),
    GALAXY_ERROR(v.q(new String[]{"✨", "‼️"}));

    private final List emojiList;

    LogIntent(List list) {
        this.emojiList = list;
    }

    public final List getEmojiList() {
        return this.emojiList;
    }
}
