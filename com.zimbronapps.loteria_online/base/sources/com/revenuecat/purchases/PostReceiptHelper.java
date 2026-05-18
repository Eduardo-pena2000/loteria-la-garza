package com.revenuecat.purchases;

import Ca.I;
import Da.X;
import Da.v;
import Qa.p;
import Qa.q;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadata;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadataStore;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.utils.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostReceiptHelper {
    private final AppConfig appConfig;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final LocalTransactionMetadataStore localTransactionMetadataStore;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PaywallPresentedCache paywallPresentedCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    public static final class CachedDataToPost {
        private final boolean didCacheData;
        private final LocalTransactionMetadata localTransactionMetadata;
        private final PaywallEvent paywallEvent;

        public CachedDataToPost(LocalTransactionMetadata localTransactionMetadata, PaywallEvent paywallEvent, boolean z) {
            this.localTransactionMetadata = localTransactionMetadata;
            this.paywallEvent = paywallEvent;
            this.didCacheData = z;
        }

        public static /* synthetic */ CachedDataToPost copy$default(CachedDataToPost cachedDataToPost, LocalTransactionMetadata localTransactionMetadata, PaywallEvent paywallEvent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                localTransactionMetadata = cachedDataToPost.localTransactionMetadata;
            }
            if ((i & 2) != 0) {
                paywallEvent = cachedDataToPost.paywallEvent;
            }
            if ((i & 4) != 0) {
                z = cachedDataToPost.didCacheData;
            }
            return cachedDataToPost.copy(localTransactionMetadata, paywallEvent, z);
        }

        public final LocalTransactionMetadata component1() {
            return this.localTransactionMetadata;
        }

        public final PaywallEvent component2() {
            return this.paywallEvent;
        }

        public final boolean component3() {
            return this.didCacheData;
        }

        public final CachedDataToPost copy(LocalTransactionMetadata localTransactionMetadata, PaywallEvent paywallEvent, boolean z) {
            return new CachedDataToPost(localTransactionMetadata, paywallEvent, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CachedDataToPost)) {
                return false;
            }
            CachedDataToPost cachedDataToPost = (CachedDataToPost) obj;
            return t.c(this.localTransactionMetadata, cachedDataToPost.localTransactionMetadata) && t.c(this.paywallEvent, cachedDataToPost.paywallEvent) && this.didCacheData == cachedDataToPost.didCacheData;
        }

        public final boolean getDidCacheData() {
            return this.didCacheData;
        }

        public final LocalTransactionMetadata getLocalTransactionMetadata() {
            return this.localTransactionMetadata;
        }

        public final PaywallEvent getPaywallEvent() {
            return this.paywallEvent;
        }

        public int hashCode() {
            LocalTransactionMetadata localTransactionMetadata = this.localTransactionMetadata;
            int hashCode = (localTransactionMetadata == null ? 0 : localTransactionMetadata.hashCode()) * 31;
            PaywallEvent paywallEvent = this.paywallEvent;
            return ((hashCode + (paywallEvent != null ? paywallEvent.hashCode() : 0)) * 31) + Boolean.hashCode(this.didCacheData);
        }

        public String toString() {
            return "CachedDataToPost(localTransactionMetadata=" + this.localTransactionMetadata + ", paywallEvent=" + this.paywallEvent + ", didCacheData=" + this.didCacheData + ')';
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ Qa.l $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.l lVar) {
            super(1);
            this.$onSuccess = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            PostReceiptHelper.access$getCustomerInfoUpdateHandler$p(PostReceiptHelper.this).notifyListeners(customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    public static final class 2 extends u implements Qa.l {
        final /* synthetic */ Qa.l $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Qa.l lVar) {
            super(1);
            this.$onError = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ boolean $hasCachedTransactionMetadata;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ q $onError;
        final /* synthetic */ Qa.l $onSuccess;
        final /* synthetic */ PaywallPostReceiptData $paywallData;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ PurchasesAreCompletedBy $purchasesAreCompletedBy;
        final /* synthetic */ ReceiptInfo $receiptInfo;

        public static final class 1 extends u implements Qa.l {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ boolean $hasCachedTransactionMetadata;
            final /* synthetic */ Qa.l $onSuccess;
            final /* synthetic */ String $purchaseToken;
            final /* synthetic */ Map $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(boolean z, PostReceiptHelper postReceiptHelper, String str, String str2, Map map, Qa.l lVar) {
                super(1);
                this.$hasCachedTransactionMetadata = z;
                this.this$0 = postReceiptHelper;
                this.$purchaseToken = str;
                this.$appUserID = str2;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onSuccess = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PostReceiptResponse) obj);
                return I.a;
            }

            public final void invoke(PostReceiptResponse postReceiptResponse) {
                t.g(postReceiptResponse, "postReceiptResponse");
                if (this.$hasCachedTransactionMetadata) {
                    PostReceiptHelper.access$getLocalTransactionMetadataStore$p(this.this$0).clearLocalTransactionMetadata(X.a(this.$purchaseToken));
                }
                PostReceiptHelper.access$getOfflineEntitlementsManager$p(this.this$0).resetOfflineCustomerInfoCache();
                PostReceiptHelper.access$getSubscriberAttributesManager$p(this.this$0).markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(postReceiptResponse.getBody()));
                PostReceiptHelper.access$getCustomerInfoUpdateHandler$p(this.this$0).cacheAndNotifyListeners(postReceiptResponse.getCustomerInfo());
                this.$onSuccess.invoke(postReceiptResponse);
            }
        }

        public static final class 2 extends u implements q {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ boolean $hasCachedTransactionMetadata;
            final /* synthetic */ q $onError;
            final /* synthetic */ String $purchaseToken;
            final /* synthetic */ Map $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(boolean z, PostReceiptHelper postReceiptHelper, String str, String str2, Map map, q qVar) {
                super(3);
                this.$hasCachedTransactionMetadata = z;
                this.this$0 = postReceiptHelper;
                this.$purchaseToken = str;
                this.$appUserID = str2;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onError = qVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
                t.g(purchasesError, "error");
                t.g(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
                if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                    if (this.$hasCachedTransactionMetadata) {
                        PostReceiptHelper.access$getLocalTransactionMetadataStore$p(this.this$0).clearLocalTransactionMetadata(X.a(this.$purchaseToken));
                    }
                    PostReceiptHelper.access$getSubscriberAttributesManager$p(this.this$0).markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                }
                this.$onError.invoke(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, String str2, boolean z, ReceiptInfo receiptInfo, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z2, Qa.l lVar, q qVar) {
            super(1);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$isRestore = z;
            this.$receiptInfo = receiptInfo;
            this.$initiationSource = postReceiptInitiationSource;
            this.$paywallData = paywallPostReceiptData;
            this.$purchasesAreCompletedBy = purchasesAreCompletedBy;
            this.$hasCachedTransactionMetadata = z2;
            this.$onSuccess = lVar;
            this.$onError = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map) obj);
            return I.a;
        }

        public final void invoke(Map map) {
            t.g(map, "unsyncedSubscriberAttributesByKey");
            PostReceiptHelper.access$getBackend$p(PostReceiptHelper.this).postReceiptData(this.$purchaseToken, this.$appUserID, this.$isRestore, PostReceiptHelper.access$getFinishTransactions(PostReceiptHelper.this), BackendHelpersKt.toBackendMap(map), this.$receiptInfo, this.$initiationSource, this.$paywallData, this.$purchasesAreCompletedBy, new 1(this.$hasCachedTransactionMetadata, PostReceiptHelper.this, this.$purchaseToken, this.$appUserID, map, this.$onSuccess), new 2(this.$hasCachedTransactionMetadata, PostReceiptHelper.this, this.$purchaseToken, this.$appUserID, map, this.$onError));
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ Boolean $isAutoRenewing;
        final /* synthetic */ Qa.l $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, Boolean bool, Qa.l lVar) {
            super(1);
            this.$purchaseToken = str;
            this.$isAutoRenewing = bool;
            this.$onSuccess = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PostReceiptResponse) obj);
            return I.a;
        }

        public final void invoke(PostReceiptResponse postReceiptResponse) {
            t.g(postReceiptResponse, "postReceiptResponse");
            PostReceiptHelper.access$getDeviceCache$p(PostReceiptHelper.this).addSuccessfullyPostedToken(this.$purchaseToken, this.$isAutoRenewing);
            this.$onSuccess.invoke(postReceiptResponse.getCustomerInfo());
        }
    }

    public static final class 2 extends u implements q {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Boolean $isAutoRenewing;
        final /* synthetic */ Qa.l $onError;
        final /* synthetic */ Qa.l $onSuccess;
        final /* synthetic */ String $purchaseToken;

        public static final class 1 extends u implements Qa.l {
            final /* synthetic */ Qa.l $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(Qa.l lVar) {
                super(1);
                this.$onSuccess = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return I.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                t.g(customerInfo, "it");
                this.$onSuccess.invoke(customerInfo);
            }
        }

        public static final class 2 extends u implements Qa.a {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ Qa.l $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(Qa.l lVar, PurchasesError purchasesError) {
                super(0);
                this.$onError = lVar;
                this.$backendError = purchasesError;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                this.$onError.invoke(this.$backendError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, Boolean bool, String str2, Qa.l lVar, Qa.l lVar2) {
            super(3);
            this.$purchaseToken = str;
            this.$isAutoRenewing = bool;
            this.$appUserID = str2;
            this.$onSuccess = lVar;
            this.$onError = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            t.g(purchasesError, "backendError");
            t.g(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
            if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.access$getDeviceCache$p(PostReceiptHelper.this).addSuccessfullyPostedToken(this.$purchaseToken, this.$isAutoRenewing);
            }
            PostReceiptHelper.access$useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptHelper.this, postReceiptErrorHandlingBehavior, this.$appUserID, new 1(this.$onSuccess), new 2(this.$onError, purchasesError));
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ p $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, p pVar) {
            super(1);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$onSuccess = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PostReceiptResponse) obj);
            return I.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse r7) {
            /*
                r6 = this;
                java.lang.String r0 = "postReceiptResponse"
                kotlin.jvm.internal.t.g(r7, r0)
                java.util.Map r0 = r7.getProductInfoByProductId()
                if (r0 == 0) goto L5d
                com.revenuecat.purchases.models.StoreTransaction r1 = r6.$purchase
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L1a:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L42
                java.lang.Object r3 = r0.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getKey()
                java.lang.String r4 = (java.lang.String) r4
                java.util.List r5 = r1.getProductIds()
                boolean r4 = r5.contains(r4)
                if (r4 == 0) goto L1a
                java.lang.Object r4 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                r2.put(r4, r3)
                goto L1a
            L42:
                java.util.Collection r0 = r2.values()
                if (r0 == 0) goto L5d
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = Da.D.g0(r0)
                com.revenuecat.purchases.common.networking.PostReceiptProductInfo r0 = (com.revenuecat.purchases.common.networking.PostReceiptProductInfo) r0
                if (r0 == 0) goto L5d
                java.lang.Boolean r0 = r0.getShouldConsume()
                if (r0 == 0) goto L5d
                boolean r0 = r0.booleanValue()
                goto L5e
            L5d:
                r0 = 0
            L5e:
                com.revenuecat.purchases.PostReceiptHelper r1 = com.revenuecat.purchases.PostReceiptHelper.this
                com.revenuecat.purchases.common.BillingAbstract r1 = com.revenuecat.purchases.PostReceiptHelper.access$getBilling$p(r1)
                com.revenuecat.purchases.PostReceiptHelper r2 = com.revenuecat.purchases.PostReceiptHelper.this
                boolean r2 = com.revenuecat.purchases.PostReceiptHelper.access$getFinishTransactions(r2)
                com.revenuecat.purchases.models.StoreTransaction r3 = r6.$purchase
                com.revenuecat.purchases.PostReceiptInitiationSource r4 = r6.$initiationSource
                r1.consumeAndSave(r2, r3, r0, r4)
                Qa.p r0 = r6.$onSuccess
                if (r0 == 0) goto L7e
                com.revenuecat.purchases.models.StoreTransaction r1 = r6.$purchase
                com.revenuecat.purchases.CustomerInfo r7 = r7.getCustomerInfo()
                r0.invoke(r1, r7)
            L7e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PostReceiptHelper.postTransactionAndConsumeIfNeeded.1.invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse):void");
        }
    }

    public static final class 2 extends u implements q {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ p $onError;
        final /* synthetic */ p $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        public static final class 1 extends u implements Qa.l {
            final /* synthetic */ p $onSuccess;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(p pVar, StoreTransaction storeTransaction) {
                super(1);
                this.$onSuccess = pVar;
                this.$purchase = storeTransaction;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return I.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                t.g(customerInfo, "customerInfo");
                p pVar = this.$onSuccess;
                if (pVar != null) {
                    pVar.invoke(this.$purchase, customerInfo);
                }
            }
        }

        public static final class 2 extends u implements Qa.a {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ p $onError;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(p pVar, StoreTransaction storeTransaction, PurchasesError purchasesError) {
                super(0);
                this.$onError = pVar;
                this.$purchase = storeTransaction;
                this.$backendError = purchasesError;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                p pVar = this.$onError;
                if (pVar != null) {
                    pVar.invoke(this.$purchase, this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, String str, p pVar, p pVar2) {
            super(3);
            this.$purchase = storeTransaction;
            this.$initiationSource = postReceiptInitiationSource;
            this.$appUserID = str;
            this.$onSuccess = pVar;
            this.$onError = pVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            t.g(purchasesError, "backendError");
            t.g(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
            if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_MARKED_SYNCED) {
                PostReceiptHelper.access$getBilling$p(PostReceiptHelper.this).consumeAndSave(PostReceiptHelper.access$getFinishTransactions(PostReceiptHelper.this), this.$purchase, false, this.$initiationSource);
            }
            PostReceiptHelper.access$useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptHelper.this, postReceiptErrorHandlingBehavior, this.$appUserID, new 1(this.$onSuccess, this.$purchase), new 2(this.$onError, this.$purchase, purchasesError));
        }
    }

    public static final class 1 extends u implements Qa.l {
        final /* synthetic */ Qa.a $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.a aVar) {
            super(1);
            this.$onError = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
            this.$onError.invoke();
        }
    }

    public PostReceiptHelper(AppConfig appConfig, Backend backend, BillingAbstract billingAbstract, CustomerInfoUpdateHandler customerInfoUpdateHandler, DeviceCache deviceCache, SubscriberAttributesManager subscriberAttributesManager, OfflineEntitlementsManager offlineEntitlementsManager, PaywallPresentedCache paywallPresentedCache, LocalTransactionMetadataStore localTransactionMetadataStore) {
        t.g(appConfig, "appConfig");
        t.g(backend, "backend");
        t.g(billingAbstract, "billing");
        t.g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        t.g(deviceCache, "deviceCache");
        t.g(subscriberAttributesManager, "subscriberAttributesManager");
        t.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        t.g(paywallPresentedCache, "paywallPresentedCache");
        t.g(localTransactionMetadataStore, "localTransactionMetadataStore");
        this.appConfig = appConfig;
        this.backend = backend;
        this.billing = billingAbstract;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.deviceCache = deviceCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.paywallPresentedCache = paywallPresentedCache;
        this.localTransactionMetadataStore = localTransactionMetadataStore;
    }

    public static final /* synthetic */ void access$callTransactionMetadataCompletionFromResults(PostReceiptHelper postReceiptHelper, List list, ConcurrentLinkedQueue concurrentLinkedQueue, Qa.l lVar, Qa.l lVar2) {
        postReceiptHelper.callTransactionMetadataCompletionFromResults(list, concurrentLinkedQueue, lVar, lVar2);
    }

    public static final /* synthetic */ Backend access$getBackend$p(PostReceiptHelper postReceiptHelper) {
        return postReceiptHelper.backend;
    }

    public static final /* synthetic */ BillingAbstract access$getBilling$p(PostReceiptHelper postReceiptHelper) {
        return postReceiptHelper.billing;
    }

    public static final /* synthetic */ CustomerInfoUpdateHandler access$getCustomerInfoUpdateHandler$p(PostReceiptHelper postReceiptHelper) {
        return postReceiptHelper.customerInfoUpdateHandler;
    }

    public static final /* synthetic */ DeviceCache access$getDeviceCache$p(PostReceiptHelper postReceiptHelper) {
        return postReceiptHelper.deviceCache;
    }

    public static final /* synthetic */ boolean access$getFinishTransactions(PostReceiptHelper postReceiptHelper) {
        return postReceiptHelper.getFinishTransactions();
    }

    public static final /* synthetic */ LocalTransactionMetadataStore access$getLocalTransactionMetadataStore$p(PostReceiptHelper postReceiptHelper) {
        return postReceiptHelper.localTransactionMetadataStore;
    }

    public static final /* synthetic */ OfflineEntitlementsManager access$getOfflineEntitlementsManager$p(PostReceiptHelper postReceiptHelper) {
        return postReceiptHelper.offlineEntitlementsManager;
    }

    public static final /* synthetic */ SubscriberAttributesManager access$getSubscriberAttributesManager$p(PostReceiptHelper postReceiptHelper) {
        return postReceiptHelper.subscriberAttributesManager;
    }

    public static final /* synthetic */ void access$useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptHelper postReceiptHelper, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, String str, Qa.l lVar, Qa.a aVar) {
        postReceiptHelper.useOfflineEntitlementsCustomerInfoIfNeeded(postReceiptErrorHandlingBehavior, str, lVar, aVar);
    }

    private final void calculateOfflineCustomerInfo(String str, Qa.l lVar, Qa.l lVar2) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(str, new 1(lVar), new 2(lVar2));
    }

    private final void callTransactionMetadataCompletionFromResults(List list, ConcurrentLinkedQueue concurrentLinkedQueue, Qa.l lVar, Qa.l lVar2) {
        if (list.size() == concurrentLinkedQueue.size()) {
            int i = 0;
            for (Object obj : concurrentLinkedQueue) {
                int i2 = i + 1;
                if (i < 0) {
                    v.x();
                }
                Result.Success success = (Result) obj;
                if (success instanceof Result.Error) {
                    if (lVar != null) {
                        lVar.invoke(((Result.Error) success).getValue());
                        return;
                    }
                    return;
                } else {
                    if (i == concurrentLinkedQueue.size() - 1 && lVar2 != null) {
                        t.e(success, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        lVar2.invoke(success.getValue());
                    }
                    i = i2;
                }
            }
        }
    }

    public static /* synthetic */ void callTransactionMetadataCompletionFromResults$default(PostReceiptHelper postReceiptHelper, List list, ConcurrentLinkedQueue concurrentLinkedQueue, Qa.l lVar, Qa.l lVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        if ((i & 8) != 0) {
            lVar2 = null;
        }
        postReceiptHelper.callTransactionMetadataCompletionFromResults(list, concurrentLinkedQueue, lVar, lVar2);
    }

    private final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final synchronized CachedDataToPost getOrPutDataToPost(LocalTransactionMetadataStore localTransactionMetadataStore, String str, ReceiptInfo receiptInfo, PostReceiptInitiationSource postReceiptInitiationSource) {
        LocalTransactionMetadata localTransactionMetadata;
        boolean z;
        PaywallEvent andRemovePurchaseInitiatedEventIfNeeded;
        PaywallEvent.Data data;
        try {
            localTransactionMetadata = localTransactionMetadataStore.getLocalTransactionMetadata(str);
            z = localTransactionMetadata == null && postReceiptInitiationSource == PostReceiptInitiationSource.PURCHASE;
            andRemovePurchaseInitiatedEventIfNeeded = localTransactionMetadata == null ? this.paywallPresentedCache.getAndRemovePurchaseInitiatedEventIfNeeded(receiptInfo.getProductIDs(), receiptInfo.getPurchaseTime()) : null;
            if (z) {
                PresentedOfferingContext presentedOfferingContext = (andRemovePurchaseInitiatedEventIfNeeded == null || (data = andRemovePurchaseInitiatedEventIfNeeded.getData()) == null) ? null : data.getPresentedOfferingContext();
                localTransactionMetadataStore.cacheLocalTransactionMetadata(str, new LocalTransactionMetadata(str, (receiptInfo.getPresentedOfferingContext() != null || presentedOfferingContext == null) ? receiptInfo : ReceiptInfo.copy$default(receiptInfo, null, null, presentedOfferingContext, null, null, null, null, null, null, null, false, null, null, 8187, null), andRemovePurchaseInitiatedEventIfNeeded != null ? andRemovePurchaseInitiatedEventIfNeeded.toPaywallPostReceiptData$purchases_defaultsBc8Release() : null, getPurchasesAreCompletedBy()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return new CachedDataToPost(localTransactionMetadata, andRemovePurchaseInitiatedEventIfNeeded, z);
    }

    private final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.appConfig.getPurchasesAreCompletedBy();
    }

    private final void performPostReceipt(String str, String str2, boolean z, ReceiptInfo receiptInfo, PostReceiptInitiationSource postReceiptInitiationSource, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, boolean z2, Qa.l lVar, q qVar) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(str, new 1(str2, str, z, receiptInfo, postReceiptInitiationSource, paywallPostReceiptData, purchasesAreCompletedBy, z2, lVar, qVar));
    }

    private final void postReceiptAndSubscriberAttributes(String str, String str2, boolean z, ReceiptInfo receiptInfo, PostReceiptInitiationSource postReceiptInitiationSource, PurchaseState purchaseState, Qa.l lVar, q qVar) {
        PaywallPostReceiptData paywallPostReceiptData$purchases_defaultsBc8Release;
        ReceiptInfo receiptInfo2;
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        CachedDataToPost orPutDataToPost = getOrPutDataToPost(this.localTransactionMetadataStore, str2, receiptInfo, postReceiptInitiationSource);
        LocalTransactionMetadata component1 = orPutDataToPost.component1();
        PaywallEvent component2 = orPutDataToPost.component2();
        boolean component3 = orPutDataToPost.component3();
        if (component1 == null || (paywallPostReceiptData$purchases_defaultsBc8Release = component1.getPaywallPostReceiptData()) == null) {
            paywallPostReceiptData$purchases_defaultsBc8Release = component2 != null ? component2.toPaywallPostReceiptData$purchases_defaultsBc8Release() : null;
        }
        if (component1 == null || (receiptInfo2 = component1.getReceiptInfo()) == null) {
            receiptInfo2 = receiptInfo;
        }
        if (component1 == null || (purchasesAreCompletedBy = component1.getPurchasesAreCompletedBy()) == null) {
            purchasesAreCompletedBy = getPurchasesAreCompletedBy();
        }
        PurchasesAreCompletedBy purchasesAreCompletedBy2 = purchasesAreCompletedBy;
        if (purchaseState != PurchaseState.PENDING) {
            performPostReceipt(str, str2, z, receiptInfo2, postReceiptInitiationSource, paywallPostReceiptData$purchases_defaultsBc8Release, purchasesAreCompletedBy2, component1 != null || component3, lVar, qVar);
            return;
        }
        PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, null, 2, null);
        LogUtilsKt.errorLog(purchasesError);
        qVar.invoke(purchasesError, PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME, (Object) null);
    }

    public static /* synthetic */ void postTokenWithoutConsuming$default(PostReceiptHelper postReceiptHelper, String str, ReceiptInfo receiptInfo, boolean z, String str2, PostReceiptInitiationSource postReceiptInitiationSource, Qa.l lVar, Qa.l lVar2, Boolean bool, int i, Object obj) {
        postReceiptHelper.postTokenWithoutConsuming(str, receiptInfo, z, str2, postReceiptInitiationSource, lVar, lVar2, (i & 128) != 0 ? null : bool);
    }

    public static /* synthetic */ void postTransactionAndConsumeIfNeeded$default(PostReceiptHelper postReceiptHelper, StoreTransaction storeTransaction, StoreProduct storeProduct, Map map, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z2, p pVar, p pVar2, int i, Object obj) {
        postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, storeProduct, map, z, str, postReceiptInitiationSource, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? null : pVar, (i & 256) != 0 ? null : pVar2);
    }

    private final void useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, String str, Qa.l lVar, Qa.a aVar) {
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME)) {
            calculateOfflineCustomerInfo(str, lVar, new 1(aVar));
        } else {
            aVar.invoke();
        }
    }

    public final void postRemainingCachedTransactionMetadata(String str, boolean z, Set set, Qa.a aVar, Qa.l lVar, Qa.l lVar2) {
        t.g(str, "appUserID");
        t.g(set, "pendingTransactionsTokens");
        t.g(aVar, "onNoTransactionsToSync");
        t.g(lVar, "onError");
        t.g(lVar2, "onSuccess");
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        List allLocalTransactionMetadata = this.localTransactionMetadataStore.getAllLocalTransactionMetadata();
        ArrayList<LocalTransactionMetadata> arrayList = new ArrayList();
        for (Object obj : allLocalTransactionMetadata) {
            if (!set.contains(((LocalTransactionMetadata) obj).getToken())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            aVar.invoke();
            return;
        }
        for (LocalTransactionMetadata localTransactionMetadata : arrayList) {
            ArrayList arrayList2 = arrayList;
            performPostReceipt(str, localTransactionMetadata.getToken(), z, localTransactionMetadata.getReceiptInfo(), PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, localTransactionMetadata.getPaywallPostReceiptData(), localTransactionMetadata.getPurchasesAreCompletedBy(), true, new PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1(concurrentLinkedQueue, this, arrayList2, lVar, lVar2), new PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2(concurrentLinkedQueue, this, arrayList2, lVar, lVar2));
            arrayList = arrayList;
        }
    }

    public final void postTokenWithoutConsuming(String str, ReceiptInfo receiptInfo, boolean z, String str2, PostReceiptInitiationSource postReceiptInitiationSource, Qa.l lVar, Qa.l lVar2, Boolean bool) {
        t.g(str, "purchaseToken");
        t.g(receiptInfo, "receiptInfo");
        t.g(str2, "appUserID");
        t.g(postReceiptInitiationSource, "initiationSource");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        postReceiptAndSubscriberAttributes(str2, str, z, receiptInfo, postReceiptInitiationSource, PurchaseState.UNSPECIFIED_STATE, new 1(str, bool, lVar), new 2(str, bool, str2, lVar, lVar2));
    }

    public final void postTransactionAndConsumeIfNeeded(StoreTransaction storeTransaction, StoreProduct storeProduct, Map map, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z2, p pVar, p pVar2) {
        t.g(storeTransaction, "purchase");
        t.g(str, "appUserID");
        t.g(postReceiptInitiationSource, "initiationSource");
        postReceiptAndSubscriberAttributes(str, storeTransaction.getPurchaseToken(), z, ReceiptInfo.Companion.from(storeTransaction, storeProduct, map, z2), postReceiptInitiationSource, storeTransaction.getPurchaseState(), new 1(storeTransaction, postReceiptInitiationSource, pVar), new 2(storeTransaction, postReceiptInitiationSource, str, pVar, pVar2));
    }
}
