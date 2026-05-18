package com.revenuecat.purchases.hybridcommon.ui;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallFragmentNonSerializableArgsStore {
    public static final PaywallFragmentNonSerializableArgsStore INSTANCE = new PaywallFragmentNonSerializableArgsStore();
    private static final ConcurrentHashMap store = new ConcurrentHashMap();

    private PaywallFragmentNonSerializableArgsStore() {
    }

    public final PaywallFragmentNonSerializableArgs get(String str) {
        t.g(str, "key");
        return (PaywallFragmentNonSerializableArgs) store.get(str);
    }

    public final void put(String str, PaywallFragmentNonSerializableArgs paywallFragmentNonSerializableArgs) {
        t.g(str, "key");
        t.g(paywallFragmentNonSerializableArgs, "args");
        store.put(str, paywallFragmentNonSerializableArgs);
    }

    public final void remove(String str) {
        t.g(str, "key");
        store.remove(str);
    }
}
