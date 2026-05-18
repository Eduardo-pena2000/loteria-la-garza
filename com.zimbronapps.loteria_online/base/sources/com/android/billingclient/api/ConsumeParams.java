package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ConsumeParams {
    public String a;

    public static final class Builder {
        public String a;

        public /* synthetic */ Builder(zzck zzckVar) {
        }

        public ConsumeParams build() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams(null);
            ConsumeParams.a(consumeParams, str);
            return consumeParams;
        }

        public Builder setPurchaseToken(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ ConsumeParams(zzck zzckVar) {
    }

    public static /* bridge */ /* synthetic */ void a(ConsumeParams consumeParams, String str) {
        consumeParams.a = str;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getPurchaseToken() {
        return this.a;
    }
}
