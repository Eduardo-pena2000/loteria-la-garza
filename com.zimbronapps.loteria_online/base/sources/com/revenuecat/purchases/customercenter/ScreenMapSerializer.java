package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import ob.b;
import pb.a;
import qb.e;
import rb.f;
import tb.h;
import tb.i;
import tb.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ScreenMapSerializer implements b {
    public static final ScreenMapSerializer INSTANCE = new ScreenMapSerializer();
    private static final e descriptor = a.i(CustomerCenterConfigData.Screen.ScreenType.Companion.serializer(), CustomerCenterConfigData.Screen.Companion.serializer()).getDescriptor();

    private ScreenMapSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public Map deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar == null) {
            throw new IllegalStateException("Can be deserialized only by JSON");
        }
        for (Map.Entry entry : j.n(hVar.i()).entrySet()) {
            String str = (String) entry.getKey();
            try {
                linkedHashMap.put(CustomerCenterConfigData.Screen.ScreenType.valueOf(str), hVar.d().c(CustomerCenterConfigData.Screen.Companion.serializer(), (i) entry.getValue()));
            } catch (IllegalArgumentException unused) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Unknown CustomerCenter ScreenType: " + str + ". Ignoring.");
                }
            }
        }
        return linkedHashMap;
    }

    public void serialize(f fVar, Map map) {
        t.g(fVar, "encoder");
        t.g(map, "value");
        a.i(CustomerCenterConfigData.Screen.ScreenType.Companion.serializer(), CustomerCenterConfigData.Screen.Companion.serializer()).serialize(fVar, map);
    }
}
