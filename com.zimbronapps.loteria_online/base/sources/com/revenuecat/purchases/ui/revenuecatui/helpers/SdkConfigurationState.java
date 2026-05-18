package com.revenuecat.purchases.ui.revenuecatui.helpers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.EntitlementVerificationMode;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.Store;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SdkConfigurationState implements Parcelable {
    private final String apiKey;
    private final String appUserId;
    private final DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final boolean pendingTransactionsForPrepaidPlansEnabled;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final EntitlementVerificationMode verificationMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final SdkConfigurationState from(PurchasesConfiguration configuration) {
            t.g(configuration, "configuration");
            return new SdkConfigurationState(configuration.getApiKey(), configuration.getAppUserID(), configuration.getPurchasesAreCompletedBy(), configuration.getShowInAppMessagesAutomatically(), configuration.getStore(), configuration.getDiagnosticsEnabled(), configuration.getVerificationMode(), configuration.getDangerousSettings(), configuration.getPendingTransactionsForPrepaidPlansEnabled());
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator {
        public final SdkConfigurationState createFromParcel(Parcel parcel) {
            t.g(parcel, "parcel");
            return new SdkConfigurationState(parcel.readString(), parcel.readString(), PurchasesAreCompletedBy.valueOf(parcel.readString()), parcel.readInt() != 0, Store.valueOf(parcel.readString()), parcel.readInt() != 0, EntitlementVerificationMode.valueOf(parcel.readString()), parcel.readParcelable(SdkConfigurationState.class.getClassLoader()), parcel.readInt() != 0);
        }

        public final SdkConfigurationState[] newArray(int i) {
            return new SdkConfigurationState[i];
        }
    }

    public SdkConfigurationState(String apiKey, String str, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z, Store store, boolean z2, EntitlementVerificationMode verificationMode, DangerousSettings dangerousSettings, boolean z3) {
        t.g(apiKey, "apiKey");
        t.g(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        t.g(store, "store");
        t.g(verificationMode, "verificationMode");
        t.g(dangerousSettings, "dangerousSettings");
        this.apiKey = apiKey;
        this.appUserId = str;
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        this.showInAppMessagesAutomatically = z;
        this.store = store;
        this.diagnosticsEnabled = z2;
        this.verificationMode = verificationMode;
        this.dangerousSettings = dangerousSettings;
        this.pendingTransactionsForPrepaidPlansEnabled = z3;
    }

    public static /* synthetic */ SdkConfigurationState copy$default(SdkConfigurationState sdkConfigurationState, String str, String str2, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z, Store store, boolean z2, EntitlementVerificationMode entitlementVerificationMode, DangerousSettings dangerousSettings, boolean z3, int i, Object obj) {
        return sdkConfigurationState.copy((i & 1) != 0 ? sdkConfigurationState.apiKey : str, (i & 2) != 0 ? sdkConfigurationState.appUserId : str2, (i & 4) != 0 ? sdkConfigurationState.purchasesAreCompletedBy : purchasesAreCompletedBy, (i & 8) != 0 ? sdkConfigurationState.showInAppMessagesAutomatically : z, (i & 16) != 0 ? sdkConfigurationState.store : store, (i & 32) != 0 ? sdkConfigurationState.diagnosticsEnabled : z2, (i & 64) != 0 ? sdkConfigurationState.verificationMode : entitlementVerificationMode, (i & 128) != 0 ? sdkConfigurationState.dangerousSettings : dangerousSettings, (i & 256) != 0 ? sdkConfigurationState.pendingTransactionsForPrepaidPlansEnabled : z3);
    }

    public final String component1() {
        return this.apiKey;
    }

    public final String component2() {
        return this.appUserId;
    }

    public final PurchasesAreCompletedBy component3() {
        return this.purchasesAreCompletedBy;
    }

    public final boolean component4() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store component5() {
        return this.store;
    }

    public final boolean component6() {
        return this.diagnosticsEnabled;
    }

    public final EntitlementVerificationMode component7() {
        return this.verificationMode;
    }

    public final DangerousSettings component8() {
        return this.dangerousSettings;
    }

    public final boolean component9() {
        return this.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final SdkConfigurationState copy(String apiKey, String str, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z, Store store, boolean z2, EntitlementVerificationMode verificationMode, DangerousSettings dangerousSettings, boolean z3) {
        t.g(apiKey, "apiKey");
        t.g(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        t.g(store, "store");
        t.g(verificationMode, "verificationMode");
        t.g(dangerousSettings, "dangerousSettings");
        return new SdkConfigurationState(apiKey, str, purchasesAreCompletedBy, z, store, z2, verificationMode, dangerousSettings, z3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkConfigurationState)) {
            return false;
        }
        SdkConfigurationState sdkConfigurationState = (SdkConfigurationState) obj;
        return t.c(this.apiKey, sdkConfigurationState.apiKey) && t.c(this.appUserId, sdkConfigurationState.appUserId) && this.purchasesAreCompletedBy == sdkConfigurationState.purchasesAreCompletedBy && this.showInAppMessagesAutomatically == sdkConfigurationState.showInAppMessagesAutomatically && this.store == sdkConfigurationState.store && this.diagnosticsEnabled == sdkConfigurationState.diagnosticsEnabled && this.verificationMode == sdkConfigurationState.verificationMode && t.c(this.dangerousSettings, sdkConfigurationState.dangerousSettings) && this.pendingTransactionsForPrepaidPlansEnabled == sdkConfigurationState.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserId() {
        return this.appUserId;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final boolean getPendingTransactionsForPrepaidPlansEnabled() {
        return this.pendingTransactionsForPrepaidPlansEnabled;
    }

    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    public int hashCode() {
        int hashCode = this.apiKey.hashCode() * 31;
        String str = this.appUserId;
        return ((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.purchasesAreCompletedBy.hashCode()) * 31) + Boolean.hashCode(this.showInAppMessagesAutomatically)) * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.diagnosticsEnabled)) * 31) + this.verificationMode.hashCode()) * 31) + this.dangerousSettings.hashCode()) * 31) + Boolean.hashCode(this.pendingTransactionsForPrepaidPlansEnabled);
    }

    public final PurchasesConfiguration toConfiguration(Context context) {
        t.g(context, "context");
        return new PurchasesConfiguration.Builder(context, this.apiKey).appUserID(this.appUserId).purchasesAreCompletedBy(this.purchasesAreCompletedBy).showInAppMessagesAutomatically(this.showInAppMessagesAutomatically).store(this.store).diagnosticsEnabled(this.diagnosticsEnabled).entitlementVerificationMode(this.verificationMode).dangerousSettings(this.dangerousSettings).pendingTransactionsForPrepaidPlansEnabled(this.pendingTransactionsForPrepaidPlansEnabled).build();
    }

    public String toString() {
        return "SdkConfigurationState(apiKey=" + this.apiKey + ", appUserId=" + this.appUserId + ", purchasesAreCompletedBy=" + this.purchasesAreCompletedBy + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", store=" + this.store + ", diagnosticsEnabled=" + this.diagnosticsEnabled + ", verificationMode=" + this.verificationMode + ", dangerousSettings=" + this.dangerousSettings + ", pendingTransactionsForPrepaidPlansEnabled=" + this.pendingTransactionsForPrepaidPlansEnabled + ')';
    }

    public void writeToParcel(Parcel out, int i) {
        t.g(out, "out");
        out.writeString(this.apiKey);
        out.writeString(this.appUserId);
        out.writeString(this.purchasesAreCompletedBy.name());
        out.writeInt(this.showInAppMessagesAutomatically ? 1 : 0);
        out.writeString(this.store.name());
        out.writeInt(this.diagnosticsEnabled ? 1 : 0);
        out.writeString(this.verificationMode.name());
        out.writeParcelable(this.dangerousSettings, i);
        out.writeInt(this.pendingTransactionsForPrepaidPlansEnabled ? 1 : 0);
    }
}
