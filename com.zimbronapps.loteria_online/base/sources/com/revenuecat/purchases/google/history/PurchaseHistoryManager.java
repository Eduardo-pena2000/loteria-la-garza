package com.revenuecat.purchases.google.history;

import Ca.I;
import Ca.q;
import Da.D;
import Da.v;
import Ga.e;
import Ia.d;
import Ia.f;
import Qa.l;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import cb.B0;
import cb.x;
import cb.z;
import com.android.vending.billing.IInAppBillingService;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.google.history.PurchaseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.t;
import lb.a;
import lb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseHistoryManager {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_PAGINATION_PAGES = 50;
    private IInAppBillingService billingService;
    private x connectDeferred;
    private final Context context;
    private final a operationsMutex;
    private final Map queryDeferreds;
    private ServiceConnection serviceConnection;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.revenuecat.purchases.google.history.PurchaseHistoryManager", f = "PurchaseHistoryManager.kt", l = {347, 374, 379, 347, 347}, m = "connect")
    public static final class 1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PurchaseHistoryManager.this.connect(this);
        }
    }

    @f(c = "com.revenuecat.purchases.google.history.PurchaseHistoryManager", f = "PurchaseHistoryManager.kt", l = {346}, m = "disconnect")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PurchaseHistoryManager.this.disconnect(this);
        }
    }

    @f(c = "com.revenuecat.purchases.google.history.PurchaseHistoryManager", f = "PurchaseHistoryManager.kt", l = {355, 382, 355, 355}, m = "queryAllPurchaseHistory")
    public static final class 1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PurchaseHistoryManager.this.queryAllPurchaseHistory(null, this);
        }
    }

    public PurchaseHistoryManager(Context context) {
        t.g(context, "context");
        this.context = context;
        this.operationsMutex = g.b(false, 1, (Object) null);
        this.queryDeferreds = new LinkedHashMap();
    }

    public static final /* synthetic */ void access$cleanup(PurchaseHistoryManager purchaseHistoryManager) {
        purchaseHistoryManager.cleanup();
    }

    public static final /* synthetic */ x access$getConnectDeferred$p(PurchaseHistoryManager purchaseHistoryManager) {
        return purchaseHistoryManager.connectDeferred;
    }

    public static final /* synthetic */ Context access$getContext$p(PurchaseHistoryManager purchaseHistoryManager) {
        return purchaseHistoryManager.context;
    }

    public static final /* synthetic */ a access$getOperationsMutex$p(PurchaseHistoryManager purchaseHistoryManager) {
        return purchaseHistoryManager.operationsMutex;
    }

    public static final /* synthetic */ Map access$getQueryDeferreds$p(PurchaseHistoryManager purchaseHistoryManager) {
        return purchaseHistoryManager.queryDeferreds;
    }

    public static final /* synthetic */ PurchaseHistoryResult access$queryPurchaseHistory(PurchaseHistoryManager purchaseHistoryManager, String str, String str2) {
        return purchaseHistoryManager.queryPurchaseHistory(str, str2);
    }

    public static final /* synthetic */ void access$setBillingService$p(PurchaseHistoryManager purchaseHistoryManager, IInAppBillingService iInAppBillingService) {
        purchaseHistoryManager.billingService = iInAppBillingService;
    }

    public static final /* synthetic */ void access$setConnectDeferred$p(PurchaseHistoryManager purchaseHistoryManager, x xVar) {
        purchaseHistoryManager.connectDeferred = xVar;
    }

    public static final /* synthetic */ void access$setServiceConnection$p(PurchaseHistoryManager purchaseHistoryManager, ServiceConnection serviceConnection) {
        purchaseHistoryManager.serviceConnection = serviceConnection;
    }

    private final void cleanup() {
        x xVar = this.connectDeferred;
        if (xVar != null) {
            B0.a.b(xVar, (CancellationException) null, 1, (Object) null);
        }
        Iterator it = this.queryDeferreds.entrySet().iterator();
        while (it.hasNext()) {
            B0.a.b((B0) ((Map.Entry) it.next()).getValue(), (CancellationException) null, 1, (Object) null);
        }
        ServiceConnection serviceConnection = this.serviceConnection;
        if (serviceConnection != null) {
            try {
                this.context.unbindService(serviceConnection);
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "AIDL Billing service disconnected");
                }
            } catch (Throwable th) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error disconnecting from AIDL Billing service", th);
            }
        }
        this.billingService = null;
        this.serviceConnection = null;
        this.connectDeferred = null;
        this.queryDeferreds.clear();
    }

    private final Object getOrExecute(Qa.a aVar, l lVar, String str, boolean z, l lVar2, e eVar) {
        q a;
        a access$getOperationsMutex$p = access$getOperationsMutex$p(this);
        r.c(0);
        access$getOperationsMutex$p.d((Object) null, eVar);
        r.c(1);
        try {
            x xVar = (x) aVar.invoke();
            if (xVar != null) {
                if (xVar.isCompleted()) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), str + " (already completed)");
                        I i = I.a;
                    }
                } else {
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel2.name(), str);
                        I i2 = I.a;
                    }
                }
                a = Ca.x.a(xVar, Boolean.FALSE);
            } else {
                x b = z.b((B0) null, 1, (Object) null);
                lVar.invoke(b);
                a = Ca.x.a(b, Boolean.TRUE);
            }
            r.b(1);
            access$getOperationsMutex$p.e((Object) null);
            r.a(1);
            x xVar2 = (x) a.a();
            try {
                if (!((Boolean) a.b()).booleanValue()) {
                    r.c(0);
                    Object await = xVar2.await(eVar);
                    r.c(1);
                    return await;
                }
                try {
                    try {
                        Object invoke = lVar2.invoke(eVar);
                        xVar2.o(invoke);
                        r.b(1);
                        if (z) {
                            access$getOperationsMutex$p = access$getOperationsMutex$p(this);
                            r.c(0);
                            access$getOperationsMutex$p.d((Object) null, eVar);
                            r.c(1);
                            try {
                                lVar.invoke((Object) null);
                                I i3 = I.a;
                            } finally {
                            }
                        }
                        r.a(1);
                        return invoke;
                    } catch (CancellationException e) {
                        B0.a.b(xVar2, (CancellationException) null, 1, (Object) null);
                        throw e;
                    }
                } catch (Throwable th) {
                    xVar2.b(th);
                    throw th;
                }
            } catch (Throwable th2) {
                r.b(1);
                if (z) {
                    access$getOperationsMutex$p = access$getOperationsMutex$p(this);
                    r.c(0);
                    access$getOperationsMutex$p.d((Object) null, eVar);
                    r.c(1);
                    try {
                        lVar.invoke((Object) null);
                        I i4 = I.a;
                    } finally {
                    }
                }
                r.a(1);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static /* synthetic */ Object getOrExecute$default(PurchaseHistoryManager purchaseHistoryManager, Qa.a aVar, l lVar, String str, boolean z, l lVar2, e eVar, int i, Object obj) {
        q a;
        if ((i & 8) != 0) {
            z = true;
        }
        a access$getOperationsMutex$p = access$getOperationsMutex$p(purchaseHistoryManager);
        r.c(0);
        access$getOperationsMutex$p.d((Object) null, eVar);
        r.c(1);
        try {
            x xVar = (x) aVar.invoke();
            if (xVar != null) {
                if (xVar.isCompleted()) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), str + " (already completed)");
                    }
                } else {
                    LogLevel logLevel2 = LogLevel.DEBUG;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.d("[Purchases] - " + logLevel2.name(), str);
                    }
                }
                a = Ca.x.a(xVar, Boolean.FALSE);
            } else {
                x b = z.b((B0) null, 1, (Object) null);
                lVar.invoke(b);
                a = Ca.x.a(b, Boolean.TRUE);
            }
            r.b(1);
            access$getOperationsMutex$p.e((Object) null);
            r.a(1);
            x xVar2 = (x) a.a();
            try {
                if (!((Boolean) a.b()).booleanValue()) {
                    r.c(0);
                    Object await = xVar2.await(eVar);
                    r.c(1);
                    return await;
                }
                try {
                    r.c(0);
                    Object invoke = lVar2.invoke(eVar);
                    r.c(1);
                    xVar2.o(invoke);
                    r.b(1);
                    if (z) {
                        access$getOperationsMutex$p = access$getOperationsMutex$p(purchaseHistoryManager);
                        r.c(0);
                        access$getOperationsMutex$p.d((Object) null, eVar);
                        r.c(1);
                        try {
                            lVar.invoke((Object) null);
                            I i2 = I.a;
                        } finally {
                        }
                    }
                    r.a(1);
                    return invoke;
                } catch (CancellationException e) {
                    B0.a.b(xVar2, (CancellationException) null, 1, (Object) null);
                    throw e;
                } catch (Throwable th) {
                    xVar2.b(th);
                    throw th;
                }
            } catch (Throwable th2) {
                r.b(1);
                if (z) {
                    access$getOperationsMutex$p = access$getOperationsMutex$p(purchaseHistoryManager);
                    r.c(0);
                    access$getOperationsMutex$p.d((Object) null, eVar);
                    r.c(1);
                    try {
                        lVar.invoke((Object) null);
                        I i3 = I.a;
                    } finally {
                    }
                }
                r.a(1);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private final PurchaseHistoryResult parseResponse(Bundle bundle) {
        PurchaseHistoryRecord purchaseHistoryRecord;
        int i = bundle.getInt("RESPONSE_CODE", -1);
        if (i != 0) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Purchase history query returned non-OK response: " + ErrorsKt.getBillingResponseCodeName(i));
            }
            return new PurchaseHistoryResult(i, v.n(), null);
        }
        ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        if (stringArrayList == null) {
            stringArrayList = new ArrayList();
        }
        ArrayList stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList2 == null) {
            stringArrayList2 = new ArrayList();
        }
        String string = bundle.getString("INAPP_CONTINUATION_TOKEN");
        List<q> S0 = D.S0(stringArrayList, stringArrayList2);
        ArrayList arrayList = new ArrayList();
        for (q qVar : S0) {
            String str = (String) qVar.a();
            String str2 = (String) qVar.b();
            PurchaseData.Companion companion = PurchaseData.Companion;
            t.f(str, "purchaseJson");
            PurchaseData fromJson = companion.fromJson(str);
            if (fromJson != null) {
                t.f(str2, "signature");
                purchaseHistoryRecord = new PurchaseHistoryRecord(fromJson, str2, str);
            } else {
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), "Failed to parse purchase data: " + str);
                }
                purchaseHistoryRecord = null;
            }
            if (purchaseHistoryRecord != null) {
                arrayList.add(purchaseHistoryRecord);
            }
        }
        LogLevel logLevel3 = LogLevel.DEBUG;
        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Parsed " + arrayList.size() + " purchase history records from AIDL.");
        }
        return new PurchaseHistoryResult(i, arrayList, string);
    }

    public static /* synthetic */ Object queryAllPurchaseHistory$default(PurchaseHistoryManager purchaseHistoryManager, String str, e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "inapp";
        }
        return purchaseHistoryManager.queryAllPurchaseHistory(str, eVar);
    }

    private final PurchaseHistoryResult queryPurchaseHistory(String str, String str2) {
        if (this.billingService == null) {
            return new PurchaseHistoryResult(2, v.n(), null);
        }
        try {
            Bundle bundle = new Bundle();
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Calling getPurchaseHistory via AIDL with API version 7, type=" + str);
            }
            IInAppBillingService iInAppBillingService = this.billingService;
            t.d(iInAppBillingService);
            Bundle purchaseHistory = iInAppBillingService.getPurchaseHistory(7, this.context.getPackageName(), str, str2, bundle);
            t.f(purchaseHistory, "response");
            return parseResponse(purchaseHistory);
        } catch (Throwable th) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error querying purchase history via AIDL", th);
            return new PurchaseHistoryResult(6, v.n(), null);
        }
    }

    public static /* synthetic */ PurchaseHistoryResult queryPurchaseHistory$default(PurchaseHistoryManager purchaseHistoryManager, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "inapp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return purchaseHistoryManager.queryPurchaseHistory(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object connect(Ga.e r19) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.history.PurchaseHistoryManager.connect(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object disconnect(Ga.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.revenuecat.purchases.google.history.PurchaseHistoryManager.disconnect.1
            if (r0 == 0) goto L13
            r0 = r6
            com.revenuecat.purchases.google.history.PurchaseHistoryManager$disconnect$1 r0 = (com.revenuecat.purchases.google.history.PurchaseHistoryManager.disconnect.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.google.history.PurchaseHistoryManager$disconnect$1 r0 = new com.revenuecat.purchases.google.history.PurchaseHistoryManager$disconnect$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            lb.a r1 = (lb.a) r1
            java.lang.Object r0 = r0.L$0
            com.revenuecat.purchases.google.history.PurchaseHistoryManager r0 = (com.revenuecat.purchases.google.history.PurchaseHistoryManager) r0
            Ca.t.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            Ca.t.b(r6)
            lb.a r6 = r5.operationsMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.d(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            r0.cleanup()     // Catch: java.lang.Throwable -> L59
            Ca.I r6 = Ca.I.a     // Catch: java.lang.Throwable -> L59
            r1.e(r4)
            Ca.I r6 = Ca.I.a
            return r6
        L59:
            r6 = move-exception
            r1.e(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.history.PurchaseHistoryManager.disconnect(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:(1:(1:(1:(2:12|13)(5:15|16|17|18|19))(5:24|25|26|27|28))(2:33|34))(1:35))(2:130|(1:132)(1:133))|39|(3:41|(2:43|(1:45))(2:115|(1:117))|46)(3:118|(1:120)(1:123)|121)|47|48|(2:50|(1:52)(1:53))(10:54|55|(4:56|57|58|(3:94|95|(1:97)(0))(2:60|(2:90|91)(3:62|(1:64)|(1:68)(1:89))))|71|(1:73)(1:88)|74|(2:77|75)|78|79|(2:81|(1:83)(5:84|25|26|27|28))(2:85|86))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(1:5)(1:134))(0)|6|(6:(1:(1:(1:(1:(2:12|13)(5:15|16|17|18|19))(5:24|25|26|27|28))(2:33|34))(1:35))(2:130|(1:132)(1:133))|39|(3:41|(2:43|(1:45))(2:115|(1:117))|46)(3:118|(1:120)(1:123)|121)|47|48|(2:50|(1:52)(1:53))(10:54|55|(4:56|57|58|(3:94|95|(1:97)(0))(2:60|(2:90|91)(3:62|(1:64)|(1:68)(1:89))))|71|(1:73)(1:88)|74|(2:77|75)|78|79|(2:81|(1:83)(5:84|25|26|27|28))(2:85|86)))|36|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d8, code lost:
    
        if (r2 != 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02da, code lost:
    
        r2 = access$getOperationsMutex$p(r13);
        r3.L$0 = r13;
        r3.L$1 = r12;
        r3.L$2 = r0;
        r3.L$3 = r2;
        r3.label = 4;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02ee, code lost:
    
        if (r2.d((java.lang.Object) null, r3) == r4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02f0, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02f1, code lost:
    
        r4 = r0;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0306, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0307, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0308, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object queryAllPurchaseHistory(java.lang.String r18, Ga.e r19) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.history.PurchaseHistoryManager.queryAllPurchaseHistory(java.lang.String, Ga.e):java.lang.Object");
    }
}
