package com.android.billingclient.api;

@zzn
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class PendingPurchasesParams {
    public final boolean a;
    public final boolean b;

    @zzn
    public static final class Builder {
        public boolean a;
        public boolean b;

        public Builder() {
        }

        public PendingPurchasesParams build() {
            if (this.a) {
                return new PendingPurchasesParams(true, this.b, null);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        public Builder enableOneTimeProducts() {
            this.a = true;
            return this;
        }

        public Builder enablePrepaidPlans() {
            this.b = true;
            return this;
        }

        public /* synthetic */ Builder(zzcr zzcrVar) {
            this();
        }
    }

    public PendingPurchasesParams(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public /* synthetic */ PendingPurchasesParams(boolean z, boolean z2, zzcr zzcrVar) {
        this(z, z2);
    }
}
