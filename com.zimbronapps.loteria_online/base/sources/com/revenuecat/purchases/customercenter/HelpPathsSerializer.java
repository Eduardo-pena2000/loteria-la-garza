package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import ob.b;
import pb.a;
import qb.e;
import rb.f;
import tb.h;
import tb.i;
import tb.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class HelpPathsSerializer implements b {
    public static final HelpPathsSerializer INSTANCE = new HelpPathsSerializer();
    private static final e descriptor = a.g(CustomerCenterConfigData.HelpPath.Companion.serializer()).getDescriptor();

    private HelpPathsSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public List deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        ArrayList arrayList = new ArrayList();
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar == null) {
            throw new IllegalStateException("Can be deserialized only by JSON");
        }
        Iterator it = j.m(hVar.i()).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(hVar.d().c(CustomerCenterConfigData.HelpPath.Companion.serializer(), (i) it.next()));
            } catch (IllegalArgumentException e) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Issue deserializing CustomerCenter HelpPath. Ignoring. Error: " + e);
                }
            }
        }
        return arrayList;
    }

    public void serialize(f fVar, List list) {
        t.g(fVar, "encoder");
        t.g(list, "value");
        a.g(CustomerCenterConfigData.HelpPath.Companion.serializer()).serialize(fVar, list);
    }
}
