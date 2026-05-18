package com.revenuecat.purchases.storage;

import Ca.I;
import Qa.l;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class KeyedDeferredValueStore$forgettingFailure$1$1 extends u implements l {
    final /* synthetic */ Object $key;
    final /* synthetic */ KeyedDeferredValueStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedDeferredValueStore$forgettingFailure$1$1(KeyedDeferredValueStore keyedDeferredValueStore, Object obj) {
        super(1);
        this.this$0 = keyedDeferredValueStore;
        this.$key = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.a;
    }

    public final void invoke(Throwable th) {
        if (th != null) {
            KeyedDeferredValueStore keyedDeferredValueStore = this.this$0;
            Object obj = this.$key;
            synchronized (KeyedDeferredValueStore.access$getLock$p(keyedDeferredValueStore)) {
                keyedDeferredValueStore.getDeferred().remove(obj);
                I i = I.a;
            }
        }
    }
}
