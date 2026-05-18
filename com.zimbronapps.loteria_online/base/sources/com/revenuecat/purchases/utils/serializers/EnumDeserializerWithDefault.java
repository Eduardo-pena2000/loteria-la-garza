package com.revenuecat.purchases.utils.serializers;

import Ca.p;
import Da.Q;
import Qa.l;
import Wa.n;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import qb.d;
import qb.e;
import qb.k;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class EnumDeserializerWithDefault implements b {
    private final Enum defaultValue;
    private final e descriptor;
    private final String enumName;
    private final Map valuesByType;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final String invoke(Enum value) {
            t.g(value, "value");
            String lowerCase = value.name().toLowerCase(Locale.ROOT);
            t.f(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
    }

    public EnumDeserializerWithDefault(Map valuesByType, Enum defaultValue) {
        t.g(valuesByType, "valuesByType");
        t.g(defaultValue, "defaultValue");
        this.valuesByType = valuesByType;
        this.defaultValue = defaultValue;
        String enumName = defaultValue.getClass().getSimpleName();
        this.enumName = enumName;
        t.f(enumName, "enumName");
        this.descriptor = k.b(enumName, d.i.a);
    }

    public e getDescriptor() {
        return this.descriptor;
    }

    public Enum deserialize(rb.e decoder) {
        t.g(decoder, "decoder");
        Enum r2 = (Enum) this.valuesByType.get(decoder.B());
        return r2 == null ? this.defaultValue : r2;
    }

    public void serialize(f encoder, Enum value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        throw new p("Serialization is not implemented because it is not needed.");
    }

    public /* synthetic */ EnumDeserializerWithDefault(Enum r1, l lVar, int i, kotlin.jvm.internal.k kVar) {
        this(r1, (i & 2) != 0 ? 1.INSTANCE : lVar);
    }

    public EnumDeserializerWithDefault(Enum defaultValue, l typeForValue) {
        t.g(defaultValue, "defaultValue");
        t.g(typeForValue, "typeForValue");
        Object[] enumConstants = defaultValue.getClass().getEnumConstants();
        t.f(enumConstants, "defaultValue::class.java.enumConstants");
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(enumConstants.length), 16));
        for (Object obj : enumConstants) {
            linkedHashMap.put(typeForValue.invoke(obj), obj);
        }
        this((Map) linkedHashMap, defaultValue);
    }
}
