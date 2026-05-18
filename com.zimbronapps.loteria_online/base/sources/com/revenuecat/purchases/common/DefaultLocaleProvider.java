package com.revenuecat.purchases.common;

import P1.j;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DefaultLocaleProvider implements LocaleProvider {
    private String preferredLocaleOverride;

    public String getCurrentLocalesLanguageTags() {
        String str = this.preferredLocaleOverride;
        if (str != null) {
            String h = j.d().h();
            t.f(h, "getDefault().toLanguageTags()");
            if (h.length() != 0) {
                str = str + ',' + h;
            }
            if (str != null) {
                return str;
            }
        }
        String h2 = j.d().h();
        t.f(h2, "getDefault().toLanguageTags()");
        return h2;
    }

    public final void setPreferredLocaleOverride(String str) {
        this.preferredLocaleOverride = str;
    }
}
