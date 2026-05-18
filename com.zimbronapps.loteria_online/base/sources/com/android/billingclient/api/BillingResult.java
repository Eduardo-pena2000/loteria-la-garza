package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class BillingResult {
    public int a;
    public int b;
    public String c;

    public static class Builder {
        public int a;
        public int b = 0;
        public String c = "";

        public /* synthetic */ Builder(zzci zzciVar) {
        }

        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            BillingResult.c(billingResult, this.a);
            BillingResult.b(billingResult, this.b);
            BillingResult.a(billingResult, this.c);
            return billingResult;
        }

        public Builder setDebugMessage(String str) {
            this.c = str;
            return this;
        }

        @zzk
        public Builder setOnPurchasesUpdatedSubResponseCode(int i) {
            this.b = i;
            return this;
        }

        public Builder setResponseCode(int i) {
            this.a = i;
            return this;
        }
    }

    public static /* bridge */ /* synthetic */ void a(BillingResult billingResult, String str) {
        billingResult.c = str;
    }

    public static /* bridge */ /* synthetic */ void b(BillingResult billingResult, int i) {
        billingResult.b = i;
    }

    public static /* bridge */ /* synthetic */ void c(BillingResult billingResult, int i) {
        billingResult.a = i;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getDebugMessage() {
        return this.c;
    }

    @zzk
    public int getOnPurchasesUpdatedSubResponseCode() {
        return this.b;
    }

    public int getResponseCode() {
        return this.a;
    }

    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.zzc.zzk(this.a) + ", Debug Message: " + this.c;
    }
}
