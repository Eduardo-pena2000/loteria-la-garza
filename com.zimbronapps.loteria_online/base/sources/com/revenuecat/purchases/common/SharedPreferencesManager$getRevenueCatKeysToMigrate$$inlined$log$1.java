package com.revenuecat.purchases.common;

import Da.D;
import Qa.l;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ List $revenueCatKeys$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1(LogIntent logIntent, List list) {
        super(0);
        this.$intent = logIntent;
        this.$revenueCatKeys$inlined = list;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        sb.append("Found " + this.$revenueCatKeys$inlined.size() + " RevenueCat keys to migrate: " + this.$revenueCatKeys$inlined);
        return sb.toString();
    }
}
