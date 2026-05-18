package com.revenuecat.purchases.ui.revenuecatui.activity;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallActivityNonSerializableArgsStore {
    public static final PaywallActivityNonSerializableArgsStore INSTANCE = new PaywallActivityNonSerializableArgsStore();
    private static final Map argsByHashCode = new LinkedHashMap();
    public static final int $stable = 8;

    private PaywallActivityNonSerializableArgsStore() {
    }

    public final synchronized void clear() {
        argsByHashCode.clear();
    }

    public final synchronized PaywallActivityNonSerializableArgs get(int i) {
        return (PaywallActivityNonSerializableArgs) argsByHashCode.get(Integer.valueOf(i));
    }

    public final synchronized void remove(int i) {
        argsByHashCode.remove(Integer.valueOf(i));
    }

    public final synchronized int store(PaywallActivityNonSerializableArgs args) {
        int identityHashCode;
        t.g(args, "args");
        identityHashCode = System.identityHashCode(args);
        argsByHashCode.put(Integer.valueOf(identityHashCode), args);
        return identityHashCode;
    }
}
