package com.revenuecat.purchases.hybridcommon.ui;

import Ca.q;
import Da.Q;
import Da.S;
import Qa.l;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import cb.B0;
import cb.x;
import cb.z;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogicParams;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class HybridPurchaseLogicBridge implements PurchaseLogic {
    public static final String EVENT_KEY_PACKAGE_BEING_PURCHASED = "packageBeingPurchased";
    public static final String EVENT_KEY_REQUEST_ID = "requestId";
    public static final String RESULT_CANCELLATION = "CANCELLATION";
    public static final String RESULT_ERROR = "ERROR";
    public static final String RESULT_SUCCESS = "SUCCESS";
    private static final String TAG = "HybridPurchaseLogicBridge";
    private final l onPerformPurchase;
    private final l onPerformRestore;
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap pendingRequests = new ConcurrentHashMap();

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ void resolveResult$default(Companion companion, String str, String str2, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            companion.resolveResult(str, str2, str3);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resolveResult(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            /*
                r4 = this;
                java.lang.String r0 = "requestId"
                kotlin.jvm.internal.t.g(r5, r0)
                java.lang.String r0 = "resultString"
                kotlin.jvm.internal.t.g(r6, r0)
                java.util.concurrent.ConcurrentHashMap r0 = com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge.access$getPendingRequests$cp()
                java.lang.Object r0 = r0.remove(r5)
                com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge$PendingRequest r0 = (com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge.PendingRequest) r0
                if (r0 != 0) goto L32
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "No pending callback for requestId '"
                r6.append(r7)
                r6.append(r5)
                java.lang.String r5 = "'. It may have already been resolved."
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r6 = "HybridPurchaseLogicBridge"
                android.util.Log.w(r6, r5)
                return
            L32:
                int r5 = r6.hashCode()
                r1 = -1149187101(0xffffffffbb80cbe3, float:-0.003930555)
                if (r5 == r1) goto L6c
                r1 = 66247144(0x3f2d9e8, float:1.42735105E-36)
                if (r5 == r1) goto L52
                r1 = 1196388611(0x474f7103, float:53105.01)
                if (r5 == r1) goto L46
                goto L74
            L46:
                java.lang.String r5 = "CANCELLATION"
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L4f
                goto L74
            L4f:
                com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Cancellation r5 = com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult.Cancellation.INSTANCE
                goto L96
            L52:
                java.lang.String r5 = "ERROR"
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L5b
                goto L74
            L5b:
                com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Error r5 = new com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Error
                com.revenuecat.purchases.PurchasesError r6 = new com.revenuecat.purchases.PurchasesError
                com.revenuecat.purchases.PurchasesErrorCode r1 = com.revenuecat.purchases.PurchasesErrorCode.UnknownError
                if (r7 != 0) goto L65
                java.lang.String r7 = "Operation failed"
            L65:
                r6.<init>(r1, r7)
                r5.<init>(r6)
                goto L96
            L6c:
                java.lang.String r5 = "SUCCESS"
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L94
            L74:
                com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Error r5 = new com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Error
                com.revenuecat.purchases.PurchasesError r1 = new com.revenuecat.purchases.PurchasesError
                com.revenuecat.purchases.PurchasesErrorCode r2 = com.revenuecat.purchases.PurchasesErrorCode.UnknownError
                if (r7 != 0) goto L8d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r3 = "Unknown result: "
                r7.append(r3)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
            L8d:
                r1.<init>(r2, r7)
                r5.<init>(r1)
                goto L96
            L94:
                com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult$Success r5 = com.revenuecat.purchases.ui.revenuecatui.PurchaseLogicResult.Success.INSTANCE
            L96:
                cb.x r6 = r0.getDeferred()
                r6.o(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge.Companion.resolveResult(java.lang.String, java.lang.String, java.lang.String):void");
        }

        private Companion() {
        }
    }

    public static abstract class PendingRequest {
        private final x deferred;
        private final HybridPurchaseLogicBridge owner;

        public static final class Purchase extends PendingRequest {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Purchase(x xVar, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
                super(xVar, hybridPurchaseLogicBridge, null);
                t.g(xVar, "deferred");
                t.g(hybridPurchaseLogicBridge, "owner");
            }
        }

        public static final class Restore extends PendingRequest {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Restore(x xVar, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
                super(xVar, hybridPurchaseLogicBridge, null);
                t.g(xVar, "deferred");
                t.g(hybridPurchaseLogicBridge, "owner");
            }
        }

        public /* synthetic */ PendingRequest(x xVar, HybridPurchaseLogicBridge hybridPurchaseLogicBridge, k kVar) {
            this(xVar, hybridPurchaseLogicBridge);
        }

        public final x getDeferred() {
            return this.deferred;
        }

        public final HybridPurchaseLogicBridge getOwner() {
            return this.owner;
        }

        private PendingRequest(x xVar, HybridPurchaseLogicBridge hybridPurchaseLogicBridge) {
            this.deferred = xVar;
            this.owner = hybridPurchaseLogicBridge;
        }
    }

    public HybridPurchaseLogicBridge(l lVar, l lVar2) {
        this.onPerformPurchase = lVar;
        this.onPerformRestore = lVar2;
    }

    public static /* synthetic */ void a(l lVar, Map map) {
        performRestore$lambda$1(lVar, map);
    }

    public static final /* synthetic */ ConcurrentHashMap access$getPendingRequests$cp() {
        return pendingRequests;
    }

    public static /* synthetic */ void b(l lVar, Map map) {
        performPurchase$lambda$0(lVar, map);
    }

    private static final void performPurchase$lambda$0(l lVar, Map map) {
        lVar.invoke(map);
    }

    private static final void performRestore$lambda$1(l lVar, Map map) {
        lVar.invoke(map);
    }

    public static final void resolveResult(String str, String str2, String str3) {
        Companion.resolveResult(str, str2, str3);
    }

    public final void cancelPending() {
        Iterator it = pendingRequests.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            t.f(next, "iterator.next()");
            Map.Entry entry = (Map.Entry) next;
            if (((PendingRequest) entry.getValue()).getOwner() == this) {
                it.remove();
                ((PendingRequest) entry.getValue()).getDeferred().o(PurchaseLogicResult.Cancellation.INSTANCE);
            }
        }
    }

    public Object performPurchase(Activity activity, PaywallPurchaseLogicParams paywallPurchaseLogicParams, Ga.e eVar) {
        return PurchaseLogic.DefaultImpls.performPurchase(this, activity, paywallPurchaseLogicParams, eVar);
    }

    public Object performRestore(CustomerInfo customerInfo, Ga.e eVar) {
        l lVar = this.onPerformRestore;
        if (lVar == null) {
            Log.w("HybridPurchaseLogicBridge", "No onPerformRestore handler registered");
            return new PurchaseLogicResult.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "No onPerformRestore handler registered"));
        }
        String uuid = UUID.randomUUID().toString();
        t.f(uuid, "randomUUID().toString()");
        x b = z.b((B0) null, 1, (Object) null);
        pendingRequests.put(uuid, new PendingRequest.Restore(b, this));
        new Handler(Looper.getMainLooper()).post(new b(lVar, Q.f(Ca.x.a("requestId", uuid))));
        return b.await(eVar);
    }

    public Object performPurchase(Activity activity, Package r6, Ga.e eVar) {
        l lVar = this.onPerformPurchase;
        if (lVar == null) {
            Log.w("HybridPurchaseLogicBridge", "No onPerformPurchase handler registered");
            return new PurchaseLogicResult.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "No onPerformPurchase handler registered"));
        }
        String uuid = UUID.randomUUID().toString();
        t.f(uuid, "randomUUID().toString()");
        x b = z.b((B0) null, 1, (Object) null);
        pendingRequests.put(uuid, new PendingRequest.Purchase(b, this));
        new Handler(Looper.getMainLooper()).post(new a(lVar, S.l(new q[]{Ca.x.a("requestId", uuid), Ca.x.a("packageBeingPurchased", OfferingsMapperKt.map(r6))})));
        return b.await(eVar);
    }
}
