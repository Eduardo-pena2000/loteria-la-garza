package com.revenuecat.purchases.utils.serializers;

import Ca.p;
import Qa.a;
import Qa.l;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import ob.b;
import ob.j;
import qb.e;
import qb.k;
import rb.f;
import tb.C;
import tb.E;
import tb.h;
import tb.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class SealedDeserializerWithDefault implements b {
    private final l defaultValue;
    private final e descriptor;
    private final String serialName;
    private final Map serializerByType;
    private final String typeDiscriminator;

    public SealedDeserializerWithDefault(String serialName, Map serializerByType, l defaultValue, String typeDiscriminator) {
        t.g(serialName, "serialName");
        t.g(serializerByType, "serializerByType");
        t.g(defaultValue, "defaultValue");
        t.g(typeDiscriminator, "typeDiscriminator");
        this.serialName = serialName;
        this.serializerByType = serializerByType;
        this.defaultValue = defaultValue;
        this.typeDiscriminator = typeDiscriminator;
        this.descriptor = k.c(serialName, new e[0], new SealedDeserializerWithDefault$descriptor$1(this));
    }

    public static final /* synthetic */ String access$getTypeDiscriminator$p(SealedDeserializerWithDefault sealedDeserializerWithDefault) {
        return sealedDeserializerWithDefault.typeDiscriminator;
    }

    public Object deserialize(rb.e decoder) {
        a aVar;
        t.g(decoder, "decoder");
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            throw new j("Can only deserialize " + this.serialName + " from JSON, got: " + P.b(decoder.getClass()));
        }
        i i = hVar.i();
        C c = i instanceof C ? (C) i : null;
        if (c == null) {
            return this.defaultValue.invoke("null");
        }
        Object obj = c.get(this.typeDiscriminator);
        E e = obj instanceof E ? (E) obj : null;
        String a = e != null ? e.a() : null;
        if (a == null || (aVar = (a) this.serializerByType.get(a)) == null) {
            return this.defaultValue.invoke(a != null ? a : "null");
        }
        try {
            return hVar.d().c((ob.a) aVar.invoke(), c);
        } catch (Exception unused) {
            return this.defaultValue.invoke(a);
        }
    }

    public e getDescriptor() {
        return this.descriptor;
    }

    public void serialize(f encoder, Object value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        throw new p("Serialization is not implemented because it is not needed.");
    }

    public /* synthetic */ SealedDeserializerWithDefault(String str, Map map, l lVar, String str2, int i, kotlin.jvm.internal.k kVar) {
        this(str, map, lVar, (i & 8) != 0 ? "type" : str2);
    }
}
