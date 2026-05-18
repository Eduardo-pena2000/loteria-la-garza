package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.util.Map;
import kotlin.jvm.internal.t;
import ob.b;
import pb.a;
import qb.e;
import rb.f;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class LocalizedVariableLocalizationKeyMapSerializer implements b {
    public static final LocalizedVariableLocalizationKeyMapSerializer INSTANCE = new LocalizedVariableLocalizationKeyMapSerializer();
    private static final b delegate;
    private static final e descriptor;

    static {
        b i = a.i(LocaleId.Companion.serializer(), VariableLocalizationKeyMapSerializer.INSTANCE);
        delegate = i;
        descriptor = i.getDescriptor();
    }

    private LocalizedVariableLocalizationKeyMapSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Map map) {
        t.g(fVar, "encoder");
        t.g(map, "value");
    }

    public Map deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        return (Map) delegate.deserialize(eVar);
    }
}
