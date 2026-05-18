package com.revenuecat.purchases;

import Da.S;
import java.util.Map;
import kotlin.jvm.internal.t;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DebugEvent {
    private final DebugEventName name;
    private final Map properties;

    public DebugEvent(DebugEventName debugEventName, Map map) {
        t.g(debugEventName, "name");
        t.g(map, "properties");
        this.name = debugEventName;
        this.properties = map;
    }

    public final DebugEventName getName() {
        return this.name;
    }

    public final Map getProperties() {
        return this.properties;
    }

    public /* synthetic */ DebugEvent(DebugEventName debugEventName, Map map, int i, kotlin.jvm.internal.k kVar) {
        this(debugEventName, (i & 2) != 0 ? S.h() : map);
    }
}
