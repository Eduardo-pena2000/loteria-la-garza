package com.revenuecat.purchases;

import Ca.I;
import Da.D;
import Da.S;
import Da.w;
import com.revenuecat.purchases.SyncPendingPurchaseResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1 extends u implements Qa.l {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ Qa.l $callback;
    final /* synthetic */ PostPendingTransactionsHelper this$0;

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ boolean $allowSharingPlayStoreAccount;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Qa.l $callback;
        final /* synthetic */ Set $pendingTransactionsTokens;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        public static final class 1 extends u implements Qa.a {
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(Qa.l lVar) {
                super(0);
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(SyncPendingPurchaseResult.NoPendingPurchasesToSync.INSTANCE);
                }
            }
        }

        public static final class 2 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(Qa.l lVar) {
                super(1);
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                t.g(purchasesError, "it");
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new SyncPendingPurchaseResult.Error(purchasesError));
                }
            }
        }

        public static final class 3 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(Qa.l lVar) {
                super(1);
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return I.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                t.g(customerInfo, "it");
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new SyncPendingPurchaseResult.Success(customerInfo));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, Set set, Qa.l lVar) {
            super(0);
            this.this$0 = postPendingTransactionsHelper;
            this.$appUserID = str;
            this.$allowSharingPlayStoreAccount = z;
            this.$pendingTransactionsTokens = set;
            this.$callback = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            PostPendingTransactionsHelper.access$getPostReceiptHelper$p(this.this$0).postRemainingCachedTransactionMetadata(this.$appUserID, this.$allowSharingPlayStoreAccount, this.$pendingTransactionsTokens, new 1(this.$callback), new 2(this.$callback), new 3(this.$callback));
        }
    }

    public static final class 3 extends u implements Qa.l {
        final /* synthetic */ boolean $allowSharingPlayStoreAccount;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Qa.l $callback;
        final /* synthetic */ Set $pendingTransactionsTokens;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        public static final class 1 extends u implements Qa.a {
            final /* synthetic */ Qa.l $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(Qa.l lVar, PurchasesError purchasesError) {
                super(0);
                this.$callback = lVar;
                this.$error = purchasesError;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                LogHandler currentLogHandler;
                String str;
                String str2;
                LogIntent logIntent = LogIntent.DEBUG;
                PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$3$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new SyncPendingPurchaseResult.Error(this.$error));
                }
            }
        }

        public static final class 2 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;
            final /* synthetic */ PurchasesError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(Qa.l lVar, PurchasesError purchasesError) {
                super(1);
                this.$callback = lVar;
                this.$error = purchasesError;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                t.g(purchasesError, "it");
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new SyncPendingPurchaseResult.Error(this.$error));
                }
            }
        }

        public static final class 3 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(Qa.l lVar) {
                super(1);
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return I.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                t.g(customerInfo, "it");
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new SyncPendingPurchaseResult.Success(customerInfo));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, Set set, Qa.l lVar) {
            super(1);
            this.this$0 = postPendingTransactionsHelper;
            this.$appUserID = str;
            this.$allowSharingPlayStoreAccount = z;
            this.$pendingTransactionsTokens = set;
            this.$callback = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            PostPendingTransactionsHelper.access$getPostReceiptHelper$p(this.this$0).postRemainingCachedTransactionMetadata(this.$appUserID, this.$allowSharingPlayStoreAccount, this.$pendingTransactionsTokens, new 1(this.$callback, purchasesError), new 2(this.$callback, purchasesError), new 3(this.$callback));
        }
    }

    public static final class 4 extends u implements Qa.l {
        final /* synthetic */ boolean $allowSharingPlayStoreAccount;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Qa.l $callback;
        final /* synthetic */ Set $pendingTransactionsTokens;
        final /* synthetic */ PostPendingTransactionsHelper this$0;

        public static final class 1 extends u implements Qa.a {
            final /* synthetic */ Qa.l $callback;
            final /* synthetic */ CustomerInfo $customerInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(Qa.l lVar, CustomerInfo customerInfo) {
                super(0);
                this.$callback = lVar;
                this.$customerInfo = customerInfo;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                LogHandler currentLogHandler;
                String str;
                String str2;
                LogIntent logIntent = LogIntent.DEBUG;
                PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1(logIntent);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            str2 = (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke();
                            currentLogHandler.d(str, str2);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                            currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke());
                            break;
                        }
                        break;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$4$1$invoke$$inlined$log$1.invoke(), null);
                        break;
                }
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new SyncPendingPurchaseResult.Success(this.$customerInfo));
                }
            }
        }

        public static final class 2 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(Qa.l lVar) {
                super(1);
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                t.g(purchasesError, "it");
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new SyncPendingPurchaseResult.Error(purchasesError));
                }
            }
        }

        public static final class 3 extends u implements Qa.l {
            final /* synthetic */ Qa.l $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(Qa.l lVar) {
                super(1);
                this.$callback = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return I.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                t.g(customerInfo, "it");
                Qa.l lVar = this.$callback;
                if (lVar != null) {
                    lVar.invoke(new SyncPendingPurchaseResult.Success(customerInfo));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, Set set, Qa.l lVar) {
            super(1);
            this.this$0 = postPendingTransactionsHelper;
            this.$appUserID = str;
            this.$allowSharingPlayStoreAccount = z;
            this.$pendingTransactionsTokens = set;
            this.$callback = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            PostPendingTransactionsHelper.access$getPostReceiptHelper$p(this.this$0).postRemainingCachedTransactionMetadata(this.$appUserID, this.$allowSharingPlayStoreAccount, this.$pendingTransactionsTokens, new 1(this.$callback, customerInfo), new 2(this.$callback), new 3(this.$callback));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z, String str, Qa.l lVar) {
        super(1);
        this.this$0 = postPendingTransactionsHelper;
        this.$allowSharingPlayStoreAccount = z;
        this.$appUserID = str;
        this.$callback = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return I.a;
    }

    public final void invoke(Map map) {
        LogHandler currentLogHandler;
        String str;
        Object invoke;
        t.g(map, "purchasesByHashedToken");
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            StoreTransaction storeTransaction = (StoreTransaction) entry.getValue();
            LogIntent logIntent = LogIntent.DEBUG;
            PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1 postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1 = new PostPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1(logIntent, storeTransaction, str2);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        invoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    }
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        invoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    }
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        invoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    }
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        invoke = postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke();
                        break;
                    }
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke());
                    } else {
                        continue;
                    }
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) postPendingTransactionsHelper$syncPendingPurchaseQueue$3$1$invoke$lambda$1$$inlined$log$1.invoke(), null);
                    continue;
            }
            currentLogHandler.d(str, (String) invoke);
        }
        PostPendingTransactionsHelper.access$getDeviceCache$p(this.this$0).cleanPreviouslySentTokens$purchases_defaultsBc8Release(map.keySet());
        List activePurchasesNotInCache$purchases_defaultsBc8Release = PostPendingTransactionsHelper.access$getDeviceCache$p(this.this$0).getActivePurchasesNotInCache$purchases_defaultsBc8Release(map);
        List purchasesWithAutoRenewingChange$purchases_defaultsBc8Release = PostPendingTransactionsHelper.access$getDeviceCache$p(this.this$0).getPurchasesWithAutoRenewingChange$purchases_defaultsBc8Release(map);
        ArrayList arrayList = new ArrayList(w.y(purchasesWithAutoRenewingChange$purchases_defaultsBc8Release, 10));
        Iterator it = purchasesWithAutoRenewingChange$purchases_defaultsBc8Release.iterator();
        while (it.hasNext()) {
            arrayList.add(UtilsKt.sha1(((StoreTransaction) it.next()).getPurchaseToken()));
        }
        PostPendingTransactionsHelper.access$getDeviceCache$p(this.this$0).saveAutoRenewingStatus$purchases_defaultsBc8Release(S.m(map, D.Q0(arrayList)));
        List v0 = D.v0(activePurchasesNotInCache$purchases_defaultsBc8Release, purchasesWithAutoRenewingChange$purchases_defaultsBc8Release);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : v0) {
            if (hashSet.add(((StoreTransaction) obj).getPurchaseToken())) {
                arrayList2.add(obj);
            }
        }
        Iterable values = map.values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : values) {
            if (((StoreTransaction) obj2).getPurchaseState() == PurchaseState.PENDING) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(w.y(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((StoreTransaction) it2.next()).getPurchaseToken());
        }
        Set Q0 = D.Q0(arrayList4);
        PostPendingTransactionsHelper postPendingTransactionsHelper = this.this$0;
        boolean z = this.$allowSharingPlayStoreAccount;
        String str3 = this.$appUserID;
        PostPendingTransactionsHelper.access$postTransactionsWithCompletion(postPendingTransactionsHelper, arrayList2, z, str3, new 2(postPendingTransactionsHelper, str3, z, Q0, this.$callback), new 3(this.this$0, this.$appUserID, this.$allowSharingPlayStoreAccount, Q0, this.$callback), new 4(this.this$0, this.$appUserID, this.$allowSharingPlayStoreAccount, Q0, this.$callback));
    }
}
