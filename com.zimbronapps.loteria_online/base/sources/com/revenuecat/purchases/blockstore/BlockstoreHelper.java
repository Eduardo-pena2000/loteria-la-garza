package com.revenuecat.purchases.blockstore;

import Ca.I;
import Da.S;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.h;
import Ia.l;
import Qa.p;
import android.content.Context;
import cb.B0;
import cb.O;
import cb.P;
import cb.Q;
import cb.W0;
import cb.e0;
import cb.i;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.identity.IdentityManager;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import q6.c;
import q6.d;
import q6.e;
import q6.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BlockstoreHelper {

    @Deprecated
    public static final int BLOCKSTORE_MAX_ENTRIES = 16;

    @Deprecated
    public static final String BLOCKSTORE_USER_ID_KEY = "com.revenuecat.purchases.app_user_id";
    private static final Companion Companion = new Companion(null);
    private final q6.b blockstoreClient;
    private final IdentityManager identityManager;
    private final O ioScope;
    private final O mainScope;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final q6.b initializeBlockstoreClient(Context context) {
            t.g(context, "applicationContext");
            try {
                return q6.a.a(context);
            } catch (NoClassDefFoundError e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Cannot find Blockstore at runtime. Disabling automatic backups.", e);
                return null;
            }
        }

        private Companion() {
        }
    }

    @f(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$1", f = "BlockstoreHelper.kt", l = {87, 100}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Qa.a $callback;
        final /* synthetic */ String $currentUserId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, Qa.a aVar, e eVar) {
            super(2, eVar);
            this.$currentUserId = str;
            this.$callback = aVar;
        }

        public final e create(Object obj, e eVar) {
            return BlockstoreHelper.this.new 1(this.$currentUserId, this.$callback, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            byte[] M1;
            Object f = c.f();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Ca.t.b(obj);
                        BlockstoreHelper blockstoreHelper = BlockstoreHelper.this;
                        this.label = 1;
                        obj = BlockstoreHelper.access$getBlockstoreData(blockstoreHelper, this);
                        if (obj == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Ca.t.b(obj);
                            BlockstoreHelper.access$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(BlockstoreHelper.this, this.$callback);
                            return I.a;
                        }
                        Ca.t.b(obj);
                    }
                    e.a aVar = (e.a) ((Map) obj).get("com.revenuecat.purchases.app_user_id");
                    String str = (aVar == null || (M1 = aVar.M1()) == null) ? null : new String(M1, Za.c.b);
                    if (str == null || t.c(str, this.$currentUserId)) {
                        BlockstoreHelper.access$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(BlockstoreHelper.this, this.$callback);
                        return I.a;
                    }
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), "Aliasing Blockstore user ID: " + str + " with current UserID");
                    }
                    IdentityManager access$getIdentityManager$p = BlockstoreHelper.access$getIdentityManager$p(BlockstoreHelper.this);
                    this.label = 2;
                    if (access$getIdentityManager$p.aliasCurrentUserIdTo(str, this) == f) {
                        return f;
                    }
                    BlockstoreHelper.access$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(BlockstoreHelper.this, this.$callback);
                    return I.a;
                } catch (PurchasesException e) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to alias Block store user ID: " + e.getMessage() + ". Underlying error: " + e.getUnderlyingErrorMessage() + ". Any purchases on previous anonymous user will not be recovered.", e);
                    BlockstoreHelper.access$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(BlockstoreHelper.this, this.$callback);
                    return I.a;
                }
            } catch (Exception e2) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to retrieve Block store data. Will not recover userId. Error: " + e2.getMessage(), e2);
                BlockstoreHelper.access$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(BlockstoreHelper.this, this.$callback);
                return I.a;
            }
        }
    }

    @f(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$clearUserIdBackupIfNeeded$1", f = "BlockstoreHelper.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ q6.b $blockstoreClient;
        final /* synthetic */ Qa.a $callback;
        final /* synthetic */ q6.c $request;
        int label;

        public static final class 1 extends u implements Qa.l {
            final /* synthetic */ Qa.a $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(Qa.a aVar) {
                super(1);
                this.$callback = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return I.a;
            }

            public final void invoke(Boolean bool) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Block store cached UserID cleared if any");
                }
                this.$callback.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(q6.b bVar, q6.c cVar, Qa.a aVar, Ga.e eVar) {
            super(2, eVar);
            this.$blockstoreClient = bVar;
            this.$request = cVar;
            this.$callback = aVar;
        }

        public static /* synthetic */ void a(Qa.a aVar, Exception exc) {
            invokeSuspend$lambda$2(aVar, exc);
        }

        public static /* synthetic */ void i(Qa.l lVar, Object obj) {
            invokeSuspend$lambda$0(lVar, obj);
        }

        private static final void invokeSuspend$lambda$0(Qa.l lVar, Object obj) {
            lVar.invoke(obj);
        }

        private static final void invokeSuspend$lambda$2(Qa.a aVar, Exception exc) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Tried to clear Block store cached UserID but failed: " + exc.getMessage(), exc);
            aVar.invoke();
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new 1(this.$blockstoreClient, this.$request, this.$callback, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            this.$blockstoreClient.deleteBytes(this.$request).addOnSuccessListener(new a(new 1(this.$callback))).addOnFailureListener(new b(this.$callback));
            return I.a;
        }
    }

    @f(c = "com.revenuecat.purchases.blockstore.BlockstoreHelper$storeUserIdIfNeeded$1", f = "BlockstoreHelper.kt", l = {61, 67}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ String $currentUserId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, Ga.e eVar) {
            super(2, eVar);
            this.$currentUserId = str;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return BlockstoreHelper.this.new 1(this.$currentUserId, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            try {
                try {
                } catch (Exception e) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to store user Id in Block store: " + e.getMessage(), e);
                }
                if (i == 0) {
                    Ca.t.b(obj);
                    BlockstoreHelper blockstoreHelper = BlockstoreHelper.this;
                    this.label = 1;
                    obj = BlockstoreHelper.access$getBlockstoreData(blockstoreHelper, this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                        return I.a;
                    }
                    Ca.t.b(obj);
                }
                Map map = (Map) obj;
                BlockstoreHelper blockstoreHelper2 = BlockstoreHelper.this;
                String str = this.$currentUserId;
                this.label = 2;
                if (BlockstoreHelper.access$storeUserIdIfNeeded(blockstoreHelper2, map, str, this) == f) {
                    return f;
                }
                return I.a;
            } catch (Exception e2) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to retrieve Block store data. Will not store userId. Error: " + e2.getMessage(), e2);
                return I.a;
            }
        }
    }

    public BlockstoreHelper(Context context, IdentityManager identityManager, q6.b bVar, O o, O o2) {
        t.g(context, "applicationContext");
        t.g(identityManager, "identityManager");
        t.g(o, "ioScope");
        t.g(o2, "mainScope");
        this.identityManager = identityManager;
        this.blockstoreClient = bVar;
        this.ioScope = o;
        this.mainScope = o2;
    }

    public static final /* synthetic */ void access$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(BlockstoreHelper blockstoreHelper, Qa.a aVar) {
        aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(blockstoreHelper, aVar);
    }

    public static final /* synthetic */ Object access$getBlockstoreData(BlockstoreHelper blockstoreHelper, Ga.e eVar) {
        return blockstoreHelper.getBlockstoreData(eVar);
    }

    public static final /* synthetic */ IdentityManager access$getIdentityManager$p(BlockstoreHelper blockstoreHelper) {
        return blockstoreHelper.identityManager;
    }

    public static final /* synthetic */ Object access$storeUserIdIfNeeded(BlockstoreHelper blockstoreHelper, Map map, String str, Ga.e eVar) {
        return blockstoreHelper.storeUserIdIfNeeded(map, str, eVar);
    }

    private static final void aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(BlockstoreHelper blockstoreHelper, Qa.a aVar) {
        i.d(blockstoreHelper.mainScope, (Ga.i) null, (Q) null, new BlockstoreHelper$aliasCurrentAndStoredUserIdsIfNeeded$callCompletion$1(aVar, null), 3, (Object) null);
    }

    private final Object getBlockstoreData(Ga.e eVar) {
        q6.b bVar = this.blockstoreClient;
        if (bVar == null) {
            return S.h();
        }
        d a = new d.a().b(true).a();
        t.f(a, "Builder()\n            .s…rue)\n            .build()");
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        bVar.retrieveBytes(a).addOnSuccessListener(new BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(new BlockstoreHelper$getBlockstoreData$2$1(kVar))).addOnFailureListener(new BlockstoreHelper$getBlockstoreData$2$2(kVar));
        Object a2 = kVar.a();
        if (a2 == c.f()) {
            h.c(eVar);
        }
        return a2;
    }

    public final void aliasCurrentAndStoredUserIdsIfNeeded(Qa.a aVar) {
        t.g(aVar, "callback");
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        if (IdentityManager.Companion.isUserIDAnonymous(currentAppUserID)) {
            i.d(this.ioScope, (Ga.i) null, (Q) null, new 1(currentAppUserID, aVar, null), 3, (Object) null);
        } else {
            aliasCurrentAndStoredUserIdsIfNeeded$callCompletion(this, aVar);
        }
    }

    public final void clearUserIdBackupIfNeeded(Qa.a aVar) {
        t.g(aVar, "callback");
        q6.b bVar = this.blockstoreClient;
        if (bVar == null) {
            aVar.invoke();
            return;
        }
        q6.c a = new c.a().b(Da.u.e("com.revenuecat.purchases.app_user_id")).a();
        t.f(a, "Builder()\n            .s…EY))\n            .build()");
        i.d(this.ioScope, (Ga.i) null, (Q) null, new 1(bVar, a, aVar, null), 3, (Object) null);
    }

    public final void storeUserIdIfNeeded(CustomerInfo customerInfo) {
        t.g(customerInfo, "customerInfo");
        if (this.blockstoreClient == null) {
            return;
        }
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        if (!IdentityManager.Companion.isUserIDAnonymous(currentAppUserID) || customerInfo.getAllPurchasedProductIds().isEmpty()) {
            return;
        }
        i.d(this.ioScope, (Ga.i) null, (Q) null, new 1(currentAppUserID, null), 3, (Object) null);
    }

    public /* synthetic */ BlockstoreHelper(Context context, IdentityManager identityManager, q6.b bVar, O o, O o2, int i, k kVar) {
        this(context, identityManager, (i & 4) != 0 ? Companion.initializeBlockstoreClient(context) : bVar, (i & 8) != 0 ? P.a(W0.b((B0) null, 1, (Object) null).plus(e0.b().A(1))) : o, (i & 16) != 0 ? P.a(W0.b((B0) null, 1, (Object) null).plus(e0.c())) : o2);
    }

    private final Object storeUserIdIfNeeded(Map map, String str, Ga.e eVar) {
        q6.b bVar = this.blockstoreClient;
        if (bVar == null) {
            return I.a;
        }
        if (map.get("com.revenuecat.purchases.app_user_id") != null) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Block store: Not storing user id since there is one already present.");
            }
            return I.a;
        }
        if (map.size() >= 16) {
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Block store: Not storing user id since block store is already full.");
            }
            return I.a;
        }
        LogLevel logLevel3 = LogLevel.DEBUG;
        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
            currentLogHandler3.d("[Purchases] - " + logLevel3.name(), "Block store: Storing UserID: " + str + " in Block store.");
        }
        f.a aVar = new f.a();
        byte[] bytes = str.getBytes(Za.c.b);
        t.f(bytes, "getBytes(...)");
        q6.f a = aVar.b(bytes).c("com.revenuecat.purchases.app_user_id").d(true).a();
        t.f(a, "Builder()\n            .s…rue)\n            .build()");
        Ga.k kVar = new Ga.k(Ha.b.c(eVar));
        bVar.storeBytes(a).addOnSuccessListener(new BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(new BlockstoreHelper$storeUserIdIfNeeded$6$1(kVar, str))).addOnFailureListener(new BlockstoreHelper$storeUserIdIfNeeded$6$2(kVar));
        Object a2 = kVar.a();
        if (a2 == Ha.c.f()) {
            h.c(eVar);
        }
        return a2 == Ha.c.f() ? a2 : I.a;
    }
}
