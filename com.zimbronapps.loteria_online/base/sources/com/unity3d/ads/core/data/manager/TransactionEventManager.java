package com.unity3d.ads.core.data.manager;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.h;
import Ia.l;
import Qa.p;
import cb.O;
import cb.i;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.billing.IsBillingClientAvailable;
import com.unity3d.ads.core.domain.billing.ProductDetailsFetcher;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionEventManager {
    public static final Companion Companion = new Companion(null);
    private static final String INAPP = "inapp";
    private static final String SUBS = "subs";
    private final BillingClientAdapter billingClientAdapter;
    private final GetTransactionData getTransactionData;
    private final GetTransactionRequest getTransactionRequest;
    private final ByteStringDataSource iapTransactionStore;
    private final IsBillingClientAvailable isBillingClientAvailable;
    private final ProductDetailsFetcher productDetailsFetcher;
    private final O scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final TransactionEventRepository transactionEventRepository;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {162}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        Object L$0;
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public static /* synthetic */ void a(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            invokeSuspend$lambda$2(transactionEventManager, billingResultBridge, list);
        }

        public static /* synthetic */ void i(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            invokeSuspend$lambda$1(transactionEventManager, billingResultBridge, list);
        }

        private static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            TransactionEventManager.access$onPurchasesReceived(transactionEventManager, billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        private static final void invokeSuspend$lambda$2(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
            TransactionEventManager.access$onPurchasesReceived(transactionEventManager, billingResultBridge, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_HISTORICAL);
        }

        public final e create(Object obj, e eVar) {
            return TransactionEventManager.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            try {
            } catch (Exception unused) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(TransactionEventManager.access$getSendDiagnosticEvent$p(TransactionEventManager.this), "billing_service_unavailable", null, null, null, null, null, 62, null);
            }
            if (i == 0) {
                t.b(obj);
                if (!TransactionEventManager.access$getBillingClientAdapter$p(TransactionEventManager.this).isInitialized()) {
                    TransactionEventManager transactionEventManager = TransactionEventManager.this;
                    this.L$0 = transactionEventManager;
                    this.label = 1;
                    cb.p pVar = new cb.p(Ha.b.c(this), 1);
                    pVar.E();
                    TransactionEventManager.access$getBillingClientAdapter$p(transactionEventManager).initialize(new TransactionEventManager$invoke$1$1$1(pVar, transactionEventManager));
                    Object w = pVar.w();
                    if (w == c.f()) {
                        h.c(this);
                    }
                    if (w == f) {
                        return f;
                    }
                }
                return I.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            if (TransactionEventManager.access$getSessionRepository$p(TransactionEventManager.this).getNativeConfiguration().getFeatureFlags().getShouldSendIapHistory()) {
                TransactionEventManager.access$getBillingClientAdapter$p(TransactionEventManager.this).queryPurchasesAsync("inapp", new a(TransactionEventManager.this));
                TransactionEventManager.access$getBillingClientAdapter$p(TransactionEventManager.this).queryPurchasesAsync("subs", new b(TransactionEventManager.this));
            }
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {132, 135, 148, 151}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ List $purchases;
        final /* synthetic */ TransactionEventRequestOuterClass.TransactionOrigin $transactionOrigin;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ TransactionEventManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(List list, TransactionEventManager transactionEventManager, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, e eVar) {
            super(2, eVar);
            this.$purchases = list;
            this.this$0 = transactionEventManager;
            this.$transactionOrigin = transactionOrigin;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$purchases, this.this$0, this.$transactionOrigin, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(21:34|(1:36)|37|38|39|40|41|42|43|(1:45)|(2:85|86)(1:47)|48|(1:50)(1:84)|(2:56|(1:58)(4:59|60|61|(5:63|64|65|66|(1:68)(10:69|24|25|(0)|28|29|30|31|32|(2:93|(1:95)(5:96|15|(0)|9|10))(0)))(7:74|28|29|30|31|32|(0)(0))))|77|78|79|80|31|32|(0)(0)) */
        /* JADX WARN: Can't wrap try/catch for region: R(5:63|64|65|66|(1:68)(10:69|24|25|(0)|28|29|30|31|32|(2:93|(1:95)(5:96|15|(0)|9|10))(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01a9, code lost:
        
            r12 = r5;
            r11 = r13;
            r13 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01c1, code lost:
        
            r6 = r3;
            r3 = r5;
            r9 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x01c0, code lost:
        
            r14 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x01d3, code lost:
        
            r14 = r7;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0197 A[Catch: Exception -> 0x01d5, TryCatch #5 {Exception -> 0x01d5, blocks: (B:25:0x0191, B:27:0x0197, B:28:0x01b3), top: B:24:0x0191 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x016d A[Catch: Exception -> 0x01ad, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ad, blocks: (B:61:0x0153, B:63:0x016d), top: B:60:0x0153 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x018d -> B:24:0x0191). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01d5 -> B:29:0x01be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01af -> B:28:0x01b3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01d1 -> B:31:0x01e2). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 576
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager.onPurchasesReceived.1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TransactionEventManager(O scope, BillingClientAdapter billingClientAdapter, GetTransactionData getTransactionData, GetTransactionRequest getTransactionRequest, TransactionEventRepository transactionEventRepository, ByteStringDataSource iapTransactionStore, SendDiagnosticEvent sendDiagnosticEvent, IsBillingClientAvailable isBillingClientAvailable, SessionRepository sessionRepository, ProductDetailsFetcher productDetailsFetcher) {
        kotlin.jvm.internal.t.g(scope, "scope");
        kotlin.jvm.internal.t.g(getTransactionData, "getTransactionData");
        kotlin.jvm.internal.t.g(getTransactionRequest, "getTransactionRequest");
        kotlin.jvm.internal.t.g(transactionEventRepository, "transactionEventRepository");
        kotlin.jvm.internal.t.g(iapTransactionStore, "iapTransactionStore");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.t.g(isBillingClientAvailable, "isBillingClientAvailable");
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.t.g(productDetailsFetcher, "productDetailsFetcher");
        this.scope = scope;
        this.billingClientAdapter = billingClientAdapter;
        this.getTransactionData = getTransactionData;
        this.getTransactionRequest = getTransactionRequest;
        this.transactionEventRepository = transactionEventRepository;
        this.iapTransactionStore = iapTransactionStore;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.isBillingClientAvailable = isBillingClientAvailable;
        this.sessionRepository = sessionRepository;
        this.productDetailsFetcher = productDetailsFetcher;
    }

    public static final /* synthetic */ BillingClientAdapter access$getBillingClientAdapter$p(TransactionEventManager transactionEventManager) {
        return transactionEventManager.billingClientAdapter;
    }

    public static final /* synthetic */ GetTransactionData access$getGetTransactionData$p(TransactionEventManager transactionEventManager) {
        return transactionEventManager.getTransactionData;
    }

    public static final /* synthetic */ GetTransactionRequest access$getGetTransactionRequest$p(TransactionEventManager transactionEventManager) {
        return transactionEventManager.getTransactionRequest;
    }

    public static final /* synthetic */ ByteStringDataSource access$getIapTransactionStore$p(TransactionEventManager transactionEventManager) {
        return transactionEventManager.iapTransactionStore;
    }

    public static final /* synthetic */ ProductDetailsFetcher access$getProductDetailsFetcher$p(TransactionEventManager transactionEventManager) {
        return transactionEventManager.productDetailsFetcher;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(TransactionEventManager transactionEventManager) {
        return transactionEventManager.sendDiagnosticEvent;
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(TransactionEventManager transactionEventManager) {
        return transactionEventManager.sessionRepository;
    }

    public static final /* synthetic */ TransactionEventRepository access$getTransactionEventRepository$p(TransactionEventManager transactionEventManager) {
        return transactionEventManager.transactionEventRepository;
    }

    public static final /* synthetic */ void access$onPurchasesReceived(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list, transactionOrigin);
    }

    private final void onPurchasesReceived(BillingResultBridge billingResultBridge, List list, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin) {
        if (billingResultBridge.getResponseCode() != BillingResultResponseCode.OK || list == null || list.isEmpty() || this.billingClientAdapter == null) {
            return;
        }
        i.d(this.scope, null, null, new 1(list, this, transactionOrigin, null), 3, null);
    }

    public final void invoke() {
        if (!this.isBillingClientAvailable.invoke() || this.billingClientAdapter == null) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "billing_service_unavailable", null, null, null, null, null, 62, null);
        } else {
            i.d(this.scope, null, null, new 1(null), 3, null);
        }
    }
}
