package com.revenuecat.purchases.common.networking;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostReceiptProductInfo {
    private final Boolean shouldConsume;

    public PostReceiptProductInfo(Boolean bool) {
        this.shouldConsume = bool;
    }

    public static /* synthetic */ PostReceiptProductInfo copy$default(PostReceiptProductInfo postReceiptProductInfo, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = postReceiptProductInfo.shouldConsume;
        }
        return postReceiptProductInfo.copy(bool);
    }

    public final Boolean component1() {
        return this.shouldConsume;
    }

    public final PostReceiptProductInfo copy(Boolean bool) {
        return new PostReceiptProductInfo(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostReceiptProductInfo) && t.c(this.shouldConsume, ((PostReceiptProductInfo) obj).shouldConsume);
    }

    public final Boolean getShouldConsume() {
        return this.shouldConsume;
    }

    public int hashCode() {
        Boolean bool = this.shouldConsume;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "PostReceiptProductInfo(shouldConsume=" + this.shouldConsume + ')';
    }
}
