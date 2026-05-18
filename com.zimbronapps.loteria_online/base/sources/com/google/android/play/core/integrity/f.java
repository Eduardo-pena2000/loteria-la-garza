package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {
    private String a;

    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new h(this.a, null);
    }

    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.a = str;
        return this;
    }
}
