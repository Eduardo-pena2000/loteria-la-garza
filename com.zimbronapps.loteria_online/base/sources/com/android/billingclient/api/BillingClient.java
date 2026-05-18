package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;
import o5.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int NETWORK_ERROR = 12;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;

        @Deprecated
        public static final int SERVICE_TIMEOUT = -3;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;
    }

    public static final class Builder {
        public volatile PendingPurchasesParams a;
        public final Context b;
        public volatile PurchasesUpdatedListener c;
        public volatile UserChoiceBillingListener d;
        public volatile boolean e;
        public volatile boolean f;
        public volatile boolean g;

        public /* synthetic */ Builder(Context context, zzt zztVar) {
            this.b = context;
        }

        public final boolean a() {
            try {
                Context context = this.b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e) {
                com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
                return false;
            }
        }

        public BillingClient build() {
            BillingClient jVar;
            Context context = this.b;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.c == null) {
                if (this.d != null) {
                    throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
                }
                if (this.e || this.f) {
                    return a() ? new j(null, context, null, null, this) : new a(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.a == null || !this.a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.c == null) {
                PendingPurchasesParams pendingPurchasesParams = this.a;
                return a() ? new j(null, pendingPurchasesParams, context, null, null, null, this) : new a(null, pendingPurchasesParams, context, null, null, null, this);
            }
            if (this.d == null) {
                PendingPurchasesParams pendingPurchasesParams2 = this.a;
                PurchasesUpdatedListener purchasesUpdatedListener = this.c;
                jVar = a() ? new j((String) null, pendingPurchasesParams2, context, purchasesUpdatedListener, (zzb) null, (m) null, (ExecutorService) null, this) : new a((String) null, pendingPurchasesParams2, context, purchasesUpdatedListener, (zzb) null, (m) null, (ExecutorService) null, this);
            } else {
                PendingPurchasesParams pendingPurchasesParams3 = this.a;
                PurchasesUpdatedListener purchasesUpdatedListener2 = this.c;
                UserChoiceBillingListener userChoiceBillingListener = this.d;
                jVar = a() ? new j((String) null, pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, (m) null, (ExecutorService) null, this) : new a((String) null, pendingPurchasesParams3, context, purchasesUpdatedListener2, userChoiceBillingListener, (m) null, (ExecutorService) null, this);
            }
            return jVar;
        }

        @zzf
        public Builder enableAlternativeBillingOnly() {
            this.e = true;
            return this;
        }

        @zzg
        public Builder enableAutoServiceReconnection() {
            this.g = true;
            return this;
        }

        @zzh
        public Builder enableExternalOffer() {
            this.f = true;
            return this;
        }

        @zzn
        public Builder enablePendingPurchases(PendingPurchasesParams pendingPurchasesParams) {
            this.a = pendingPurchasesParams;
            return this;
        }

        @zzp
        public Builder enableUserChoiceBilling(UserChoiceBillingListener userChoiceBillingListener) {
            this.d = userChoiceBillingListener;
            return this;
        }

        public Builder setListener(PurchasesUpdatedListener purchasesUpdatedListener) {
            this.c = purchasesUpdatedListener;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {

        @zzf
        public static final String ALTERNATIVE_BILLING_ONLY = "jjj";

        @zzi
        public static final String BILLING_CONFIG = "ggg";

        @zzh
        public static final String EXTERNAL_OFFER = "kkk";
        public static final String IN_APP_MESSAGING = "bbb";
        public static final String PRICE_CHANGE_CONFIRMATION = "priceChangeConfirmation";
        public static final String PRODUCT_DETAILS = "fff";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";
    }

    @zzk
    @Retention(RetentionPolicy.SOURCE)
    public @interface OnPurchasesUpdatedSubResponseCode {
        public static final int NO_APPLICABLE_SUB_RESPONSE_CODE = 0;
        public static final int PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS = 1;
        public static final int USER_INELIGIBLE = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context, null);
    }

    public abstract void acknowledgePurchase(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener);

    public abstract void consumeAsync(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener);

    @zzf
    public abstract void createAlternativeBillingOnlyReportingDetailsAsync(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener);

    @zzh
    public abstract void createExternalOfferReportingDetailsAsync(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener);

    public abstract void endConnection();

    @zzi
    public abstract void getBillingConfigAsync(GetBillingConfigParams getBillingConfigParams, BillingConfigResponseListener billingConfigResponseListener);

    public abstract int getConnectionState();

    @zzf
    public abstract void isAlternativeBillingOnlyAvailableAsync(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener);

    @zzh
    public abstract void isExternalOfferAvailableAsync(ExternalOfferAvailabilityListener externalOfferAvailabilityListener);

    public abstract BillingResult isFeatureSupported(String str);

    public abstract boolean isReady();

    public abstract BillingResult launchBillingFlow(Activity activity, BillingFlowParams billingFlowParams);

    public abstract void queryProductDetailsAsync(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener);

    public abstract void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener);

    @zzf
    public abstract BillingResult showAlternativeBillingOnlyInformationDialog(Activity activity, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener);

    @zzh
    public abstract BillingResult showExternalOfferInformationDialog(Activity activity, ExternalOfferInformationDialogListener externalOfferInformationDialogListener);

    public abstract BillingResult showInAppMessages(Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener);

    public abstract void startConnection(BillingClientStateListener billingClientStateListener);
}
