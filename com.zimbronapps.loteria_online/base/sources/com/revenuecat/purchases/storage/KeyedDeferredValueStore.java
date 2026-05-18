package com.revenuecat.purchases.storage;

import Qa.a;
import cb.W;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class KeyedDeferredValueStore {
    private final Map deferred;
    private final Object lock;

    public static final class 1 {
    }

    public KeyedDeferredValueStore() {
        this(null, 1, null);
    }

    public static final /* synthetic */ Object access$getLock$p(KeyedDeferredValueStore keyedDeferredValueStore) {
        return keyedDeferredValueStore.lock;
    }

    private final W forgettingFailure(Object obj, a aVar) {
        W w = (W) aVar.invoke();
        w.invokeOnCompletion(new KeyedDeferredValueStore$forgettingFailure$1$1(this, obj));
        return w;
    }

    public final Map getDeferred() {
        return this.deferred;
    }

    public final W getOrPut(Object obj, a aVar) {
        W w;
        t.g(aVar, "task");
        synchronized (this.lock) {
            w = (W) this.deferred.get(obj);
            if (w == null) {
                w = forgettingFailure(obj, aVar);
                this.deferred.put(obj, w);
            }
        }
        return w;
    }

    public KeyedDeferredValueStore(Object obj) {
        t.g(obj, "lock");
        this.lock = obj;
        this.deferred = new LinkedHashMap();
    }

    public /* synthetic */ KeyedDeferredValueStore(Object obj, int i, k kVar) {
        this((i & 1) != 0 ? new 1() : obj);
    }
}
