package com.revenuecat.purchases.common.caching;

import Da.w;
import Za.B;
import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.JsonTools;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.j;
import tb.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocalTransactionMetadataStore {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_PREFIX = "local_transaction_metadata_";
    private final String apiKey;
    private final b json;
    private final SharedPreferences sharedPreferences;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context, String str) {
            t.g(context, "context");
            t.g(str, "apiKey");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.revenuecat.purchases.transaction_metadata." + str, 0);
            t.f(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    public LocalTransactionMetadataStore(Context context, String str, SharedPreferences sharedPreferences, b bVar) {
        t.g(context, "context");
        t.g(str, "apiKey");
        t.g(sharedPreferences, "sharedPreferences");
        t.g(bVar, "json");
        this.apiKey = str;
        this.sharedPreferences = sharedPreferences;
        this.json = bVar;
    }

    private final String getTokenHash(String str) {
        return UtilsKt.sha1(str);
    }

    private final boolean hasCachedData(String str) {
        return this.sharedPreferences.contains("local_transaction_metadata_" + str);
    }

    public final synchronized void cacheLocalTransactionMetadata(String str, LocalTransactionMetadata localTransactionMetadata) {
        t.g(str, "purchaseToken");
        t.g(localTransactionMetadata, "data");
        String tokenHash = getTokenHash(str);
        if (hasCachedData(tokenHash)) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Purchase data already cached for token: " + str + ". Skipping cache.");
            }
            return;
        }
        try {
            String str2 = "local_transaction_metadata_" + tokenHash;
            String b = this.json.b(LocalTransactionMetadata.Companion.serializer(), localTransactionMetadata);
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            t.f(edit, "editor");
            edit.putString(str2, b);
            edit.apply();
            LogLevel logLevel2 = LogLevel.DEBUG;
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "Local transaction metadata cache updated");
            }
        } catch (j e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to serialize local transaction metadata", e);
        }
    }

    public final synchronized void clearLocalTransactionMetadata(Set set) {
        try {
            t.g(set, "purchaseTokens");
            if (set.isEmpty()) {
                return;
            }
            Iterable iterable = (Iterable) set;
            ArrayList arrayList = new ArrayList(w.y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(getTokenHash((String) it.next()));
            }
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            t.f(edit, "editor");
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                String str = "local_transaction_metadata_" + ((String) it2.next());
                if (this.sharedPreferences.contains(str)) {
                    edit.remove(str);
                    i++;
                }
            }
            edit.apply();
            if (i > 0) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Cleared local transaction metadata for " + i + " token(s)");
                }
            } else {
                LogLevel logLevel2 = LogLevel.DEBUG;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.d("[Purchases] - " + logLevel2.name(), "No transaction metadata found to clear from local cache.");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final List getAllLocalTransactionMetadata() {
        Iterable keySet = this.sharedPreferences.getAll().keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            t.f(str, "it");
            if (B.N(str, "local_transaction_metadata_", false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            String string = this.sharedPreferences.getString(str2, (String) null);
            if (string != null) {
                try {
                    arrayList2.add((LocalTransactionMetadata) this.json.d(LocalTransactionMetadata.Companion.serializer(), string));
                } catch (j e) {
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to deserialize transaction metadata for key: " + str2, e);
                    SharedPreferences.Editor edit = this.sharedPreferences.edit();
                    t.f(edit, "editor");
                    edit.remove(str2);
                    edit.apply();
                }
            }
        }
        return arrayList2;
    }

    public final LocalTransactionMetadata getLocalTransactionMetadata(String str) {
        t.g(str, "purchaseToken");
        String str2 = "local_transaction_metadata_" + getTokenHash(str);
        String string = this.sharedPreferences.getString(str2, (String) null);
        if (string == null) {
            return null;
        }
        try {
            return (LocalTransactionMetadata) this.json.d(LocalTransactionMetadata.Companion.serializer(), string);
        } catch (j e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to deserialize local transaction metadata. Clearing cache.", e);
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            t.f(edit, "editor");
            edit.remove(str2);
            edit.apply();
            return null;
        }
    }

    public /* synthetic */ LocalTransactionMetadataStore(Context context, String str, SharedPreferences sharedPreferences, b bVar, int i, k kVar) {
        this(context, str, (i & 4) != 0 ? Companion.initializeSharedPreferences(context, str) : sharedPreferences, (i & 8) != 0 ? JsonTools.INSTANCE.getJson() : bVar);
    }
}
