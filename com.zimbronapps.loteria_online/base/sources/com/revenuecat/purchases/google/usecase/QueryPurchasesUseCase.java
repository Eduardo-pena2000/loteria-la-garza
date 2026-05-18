package com.revenuecat.purchases.google.usecase;

import Ca.I;
import Da.S;
import Qa.l;
import Qa.p;
import com.android.billingclient.api.BillingClient;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class QueryPurchasesUseCase extends BillingClientUseCase {
    private final l onError;
    private final l onSuccess;
    private final QueryPurchasesUseCaseParams useCaseParams;
    private final l withConnectedClient;

    public static final class 1 extends u implements l {

        public static final class 1 extends u implements l {
            final /* synthetic */ QueryPurchasesUseCase this$0;

            public static final class 1 extends u implements l {
                final /* synthetic */ Map $activeSubs;
                final /* synthetic */ QueryPurchasesUseCase this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(QueryPurchasesUseCase queryPurchasesUseCase, Map map) {
                    super(1);
                    this.this$0 = queryPurchasesUseCase;
                    this.$activeSubs = map;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Map) obj);
                    return I.a;
                }

                public final void invoke(Map map) {
                    t.g(map, "unconsumedInApps");
                    this.this$0.onOk(S.r(this.$activeSubs, map));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(QueryPurchasesUseCase queryPurchasesUseCase) {
                super(1);
                this.this$0 = queryPurchasesUseCase;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Map) obj);
                return I.a;
            }

            public final void invoke(Map map) {
                t.g(map, "activeSubs");
                QueryPurchasesUseCase queryPurchasesUseCase = this.this$0;
                QueryPurchasesUseCase.access$queryInApps(queryPurchasesUseCase, new 1(queryPurchasesUseCase, map), this.this$0.getOnError());
            }
        }

        public 1() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BillingClient) obj);
            return I.a;
        }

        public final void invoke(BillingClient billingClient) {
            t.g(billingClient, "$this$invoke");
            QueryPurchasesUseCase queryPurchasesUseCase = QueryPurchasesUseCase.this;
            QueryPurchasesUseCase.access$querySubscriptions(queryPurchasesUseCase, new 1(queryPurchasesUseCase), QueryPurchasesUseCase.this.getOnError());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesUseCase(QueryPurchasesUseCaseParams queryPurchasesUseCaseParams, l lVar, l lVar2, l lVar3, p pVar) {
        super(queryPurchasesUseCaseParams, lVar2, pVar);
        t.g(queryPurchasesUseCaseParams, "useCaseParams");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        t.g(lVar3, "withConnectedClient");
        t.g(pVar, "executeRequestOnUIThread");
        this.useCaseParams = queryPurchasesUseCaseParams;
        this.onSuccess = lVar;
        this.onError = lVar2;
        this.withConnectedClient = lVar3;
    }

    public static final /* synthetic */ void access$queryInApps(QueryPurchasesUseCase queryPurchasesUseCase, l lVar, l lVar2) {
        queryPurchasesUseCase.queryInApps(lVar, lVar2);
    }

    public static final /* synthetic */ void access$querySubscriptions(QueryPurchasesUseCase queryPurchasesUseCase, l lVar, l lVar2) {
        queryPurchasesUseCase.querySubscriptions(lVar, lVar2);
    }

    private final void queryInApps(l lVar, l lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "inapp"), lVar, lVar2, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    private final void querySubscriptions(l lVar, l lVar2) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "subs"), lVar, lVar2, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    public void executeAsync() {
        this.withConnectedClient.invoke(new 1());
    }

    public String getErrorMessage() {
        return "Error when querying purchases";
    }

    public final l getOnError() {
        return this.onError;
    }

    public final l getOnSuccess() {
        return this.onSuccess;
    }

    public final l getWithConnectedClient() {
        return this.withConnectedClient;
    }

    public void onOk(Map map) {
        t.g(map, "received");
        this.onSuccess.invoke(map);
    }
}
