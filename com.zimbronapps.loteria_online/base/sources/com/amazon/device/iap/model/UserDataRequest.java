package com.amazon.device.iap.model;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class UserDataRequest {
    private boolean fetchLWAConsentStatus;

    public static class Builder {
        private boolean fetchLWAConsentStatus;

        public /* synthetic */ Builder(1 r1) {
            this();
        }

        public static /* synthetic */ boolean access$000(Builder builder) {
            return builder.fetchLWAConsentStatus;
        }

        public UserDataRequest build() {
            return new UserDataRequest(this);
        }

        public Builder setFetchLWAConsentStatus(boolean z) {
            this.fetchLWAConsentStatus = z;
            return this;
        }

        private Builder() {
        }
    }

    public UserDataRequest(Builder builder) {
        this.fetchLWAConsentStatus = Builder.access$000(builder);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean getFetchLWAConsentStatus() {
        return this.fetchLWAConsentStatus;
    }
}
