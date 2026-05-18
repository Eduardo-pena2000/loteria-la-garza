package vb;

import Ca.o;
import Qa.l;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.t;
import ob.k;
import vb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class c extends e {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z) {
        super(null);
        t.g(class2ContextualFactory, "class2ContextualFactory");
        t.g(polyBase2Serializers, "polyBase2Serializers");
        t.g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        t.g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        t.g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.a = class2ContextualFactory;
        this.b = polyBase2Serializers;
        this.c = polyBase2DefaultSerializerProvider;
        this.d = polyBase2NamedSerializers;
        this.e = polyBase2DefaultDeserializerProvider;
        this.f = z;
    }

    public void a(i collector) {
        t.g(collector, "collector");
        for (Map.Entry entry : this.a.entrySet()) {
            Xa.c cVar = (Xa.c) entry.getKey();
            a aVar = (a) entry.getValue();
            if (aVar instanceof a.a) {
                t.e(cVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                ob.b b = ((a.a) aVar).b();
                t.e(b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.c(cVar, b);
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new o();
                }
                collector.d(cVar, ((a.b) aVar).b());
            }
        }
        for (Map.Entry entry2 : this.b.entrySet()) {
            Xa.c cVar2 = (Xa.c) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                Xa.c cVar3 = (Xa.c) entry3.getKey();
                ob.b bVar = (ob.b) entry3.getValue();
                t.e(cVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                t.e(cVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                t.e(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.e(cVar2, cVar3, bVar);
            }
        }
        for (Map.Entry entry4 : this.c.entrySet()) {
            Xa.c cVar4 = (Xa.c) entry4.getKey();
            l lVar = (l) entry4.getValue();
            t.e(cVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            t.e(lVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.b(cVar4, (l) V.e(lVar, 1));
        }
        for (Map.Entry entry5 : this.e.entrySet()) {
            Xa.c cVar5 = (Xa.c) entry5.getKey();
            l lVar2 = (l) entry5.getValue();
            t.e(cVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            t.e(lVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.a(cVar5, (l) V.e(lVar2, 1));
        }
    }

    public ob.b b(Xa.c kClass, List typeArgumentsSerializers) {
        t.g(kClass, "kClass");
        t.g(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = (a) this.a.get(kClass);
        ob.b a = aVar != null ? aVar.a(typeArgumentsSerializers) : null;
        if (a != null) {
            return a;
        }
        return null;
    }

    public ob.a d(Xa.c baseClass, String str) {
        t.g(baseClass, "baseClass");
        Map map = (Map) this.d.get(baseClass);
        ob.b bVar = map != null ? (ob.b) map.get(str) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.e.get(baseClass);
        l lVar = V.k(obj, 1) ? (l) obj : null;
        if (lVar != null) {
            return (ob.a) lVar.invoke(str);
        }
        return null;
    }

    public k e(Xa.c baseClass, Object value) {
        t.g(baseClass, "baseClass");
        t.g(value, "value");
        if (!baseClass.a(value)) {
            return null;
        }
        Map map = (Map) this.b.get(baseClass);
        ob.b bVar = map != null ? (ob.b) map.get(P.b(value.getClass())) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.c.get(baseClass);
        l lVar = V.k(obj, 1) ? (l) obj : null;
        if (lVar != null) {
            return (k) lVar.invoke(value);
        }
        return null;
    }
}
