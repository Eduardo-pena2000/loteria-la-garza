package com.revenuecat.purchases.google.usecase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GetBillingConfigUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;

    public GetBillingConfigUseCaseParams(boolean z) {
        this.appInBackground = z;
    }

    public static /* synthetic */ GetBillingConfigUseCaseParams copy$default(GetBillingConfigUseCaseParams getBillingConfigUseCaseParams, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getBillingConfigUseCaseParams.appInBackground;
        }
        return getBillingConfigUseCaseParams.copy(z);
    }

    public final boolean component1() {
        return this.appInBackground;
    }

    public final GetBillingConfigUseCaseParams copy(boolean z) {
        return new GetBillingConfigUseCaseParams(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBillingConfigUseCaseParams) && this.appInBackground == ((GetBillingConfigUseCaseParams) obj).appInBackground;
    }

    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public int hashCode() {
        return Boolean.hashCode(this.appInBackground);
    }

    public String toString() {
        return "GetBillingConfigUseCaseParams(appInBackground=" + this.appInBackground + ')';
    }
}
