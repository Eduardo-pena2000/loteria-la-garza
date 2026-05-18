package com.revenuecat.purchases.paywalls.components.common;

import Qa.l;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import pb.a;
import qb.e;
import rb.f;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class VariableLocalizationKeyMapSerializer implements b {
    public static final VariableLocalizationKeyMapSerializer INSTANCE = new VariableLocalizationKeyMapSerializer();
    private static final b delegate;
    private static final e descriptor;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final VariableLocalizationKey invoke(Map.Entry entry) {
            t.g(entry, "<name for destructuring parameter 0>");
            try {
                String upperCase = ((String) entry.getKey()).toUpperCase(Locale.ROOT);
                t.f(upperCase, "toUpperCase(...)");
                return VariableLocalizationKey.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    static {
        U u = U.a;
        b i = a.i(a.F(u), a.F(u));
        delegate = i;
        descriptor = i.getDescriptor();
    }

    private VariableLocalizationKeyMapSerializer() {
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
        return MapExtensionsKt.mapNotNullKeys((Map) eVar.p(delegate), 1.INSTANCE);
    }
}
