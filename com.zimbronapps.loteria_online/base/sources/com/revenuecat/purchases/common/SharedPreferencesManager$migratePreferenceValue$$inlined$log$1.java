package com.revenuecat.purchases.common;

import Da.D;
import Qa.l;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SharedPreferencesManager$migratePreferenceValue$$inlined$log$1 extends u implements Qa.a {
    final /* synthetic */ LogIntent $intent;
    final /* synthetic */ String $key$inlined;
    final /* synthetic */ Object $value$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesManager$migratePreferenceValue$$inlined$log$1(LogIntent logIntent, String str, Object obj) {
        super(0);
        this.$intent = logIntent;
        this.$key$inlined = str;
        this.$value$inlined = obj;
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(D.n0(this.$intent.getEmojiList(), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unknown preference type for key ");
        sb2.append(this.$key$inlined);
        sb2.append(": ");
        Object obj = this.$value$inlined;
        sb2.append(obj != null ? obj.getClass().getSimpleName() : null);
        sb.append(sb2.toString());
        return sb.toString();
    }
}
