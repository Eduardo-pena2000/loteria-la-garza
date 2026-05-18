package vb;

import Da.U;
import Qa.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;
import sb.d0;
import vb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class f implements i {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public boolean f;

    public static /* synthetic */ void j(f fVar, Xa.c cVar, Xa.c cVar2, ob.b bVar, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        fVar.i(cVar, cVar2, bVar, z);
    }

    public static /* synthetic */ void l(f fVar, Xa.c cVar, a aVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        fVar.k(cVar, aVar, z);
    }

    public void a(Xa.c baseClass, l defaultDeserializerProvider) {
        t.g(baseClass, "baseClass");
        t.g(defaultDeserializerProvider, "defaultDeserializerProvider");
        g(baseClass, defaultDeserializerProvider, false);
    }

    public void b(Xa.c baseClass, l defaultSerializerProvider) {
        t.g(baseClass, "baseClass");
        t.g(defaultSerializerProvider, "defaultSerializerProvider");
        h(baseClass, defaultSerializerProvider, false);
    }

    public void c(Xa.c kClass, ob.b serializer) {
        t.g(kClass, "kClass");
        t.g(serializer, "serializer");
        l(this, kClass, new a.a(serializer), false, 4, null);
    }

    public void d(Xa.c kClass, l provider) {
        t.g(kClass, "kClass");
        t.g(provider, "provider");
        l(this, kClass, new a.b(provider), false, 4, null);
    }

    public void e(Xa.c baseClass, Xa.c actualClass, ob.b actualSerializer) {
        t.g(baseClass, "baseClass");
        t.g(actualClass, "actualClass");
        t.g(actualSerializer, "actualSerializer");
        j(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    public final e f() {
        return new c(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void g(Xa.c baseClass, l defaultDeserializerProvider, boolean z) {
        t.g(baseClass, "baseClass");
        t.g(defaultDeserializerProvider, "defaultDeserializerProvider");
        l lVar = (l) this.e.get(baseClass);
        if (lVar == null || t.c(lVar, defaultDeserializerProvider) || z) {
            this.e.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + lVar);
    }

    public final void h(Xa.c baseClass, l defaultSerializerProvider, boolean z) {
        t.g(baseClass, "baseClass");
        t.g(defaultSerializerProvider, "defaultSerializerProvider");
        l lVar = (l) this.c.get(baseClass);
        if (lVar == null || t.c(lVar, defaultSerializerProvider) || z) {
            this.c.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + lVar);
    }

    public final void i(Xa.c baseClass, Xa.c concreteClass, ob.b concreteSerializer, boolean z) {
        Object obj;
        t.g(baseClass, "baseClass");
        t.g(concreteClass, "concreteClass");
        t.g(concreteSerializer, "concreteSerializer");
        String h = concreteSerializer.getDescriptor().h();
        Map map = this.b;
        Object obj2 = map.get(baseClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            map.put(baseClass, obj2);
        }
        Map map2 = (Map) obj2;
        ob.b bVar = (ob.b) map2.get(concreteClass);
        Map map3 = this.d;
        Object obj3 = map3.get(baseClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            map3.put(baseClass, obj3);
        }
        Map map4 = (Map) obj3;
        if (z) {
            if (bVar != null) {
                map4.remove(bVar.getDescriptor().h());
            }
            map2.put(concreteClass, concreteSerializer);
            map4.put(h, concreteSerializer);
            return;
        }
        if (bVar != null) {
            if (!t.c(bVar, concreteSerializer)) {
                throw new d(baseClass, concreteClass);
            }
        }
        ob.b bVar2 = (ob.b) map4.get(h);
        if (bVar2 == null) {
            map2.put(concreteClass, concreteSerializer);
            map4.put(h, concreteSerializer);
            return;
        }
        Object obj4 = this.b.get(baseClass);
        t.d(obj4);
        Iterator it = U.D((Map) obj4).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map.Entry) obj).getValue() == bVar2) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + h + "': '" + concreteClass + "' and '" + ((Map.Entry) obj) + '\'');
    }

    public final void k(Xa.c forClass, a provider, boolean z) {
        a aVar;
        t.g(forClass, "forClass");
        t.g(provider, "provider");
        if (z || (aVar = (a) this.a.get(forClass)) == null || t.c(aVar, provider)) {
            this.a.put(forClass, provider);
            if (d0.b(forClass)) {
                this.f = true;
                return;
            }
            return;
        }
        throw new d("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }
}
