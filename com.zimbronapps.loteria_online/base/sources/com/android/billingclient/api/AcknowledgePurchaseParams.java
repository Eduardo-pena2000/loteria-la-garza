package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class AcknowledgePurchaseParams {
    public String a;

    public static final class Builder {
        public String a;

        public /* synthetic */ Builder(zza zzaVar) {
        }

        public AcknowledgePurchaseParams build() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams(null);
            AcknowledgePurchaseParams.a(acknowledgePurchaseParams, str);
            return acknowledgePurchaseParams;
        }

        public Builder setPurchaseToken(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ AcknowledgePurchaseParams(zza zzaVar) {
    }

    public static /* bridge */ /* synthetic */ void a(AcknowledgePurchaseParams acknowledgePurchaseParams, String str) {
        acknowledgePurchaseParams.a = str;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getPurchaseToken() {
        return this.a;
    }
}
