package com.unity3d.services.core.di;

import Ca.l;
import Ca.m;
import Qa.a;
import Xa.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ServicesRegistry implements IServicesRegistry {
    private final ConcurrentHashMap _services = new ConcurrentHashMap();

    public static /* synthetic */ ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, a instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        t.g(named, "named");
        t.g(instance, "instance");
        t.l(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, P.b(Object.class));
        servicesRegistry.updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public static /* synthetic */ Object get$default(ServicesRegistry servicesRegistry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        t.g(named, "named");
        t.l(4, "T");
        return servicesRegistry.resolveService(new ServiceKey(named, P.b(Object.class)));
    }

    public static /* synthetic */ Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        t.g(named, "named");
        t.l(4, "T");
        return servicesRegistry.resolveServiceOrNull(new ServiceKey(named, P.b(Object.class)));
    }

    public static /* synthetic */ ServiceKey single$default(ServicesRegistry servicesRegistry, String named, a instance, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        t.g(named, "named");
        t.g(instance, "instance");
        t.l(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, P.b(Object.class));
        servicesRegistry.updateService(serviceKey, m.b(instance));
        return serviceKey;
    }

    public final /* synthetic */ ServiceKey factory(String named, a instance) {
        t.g(named, "named");
        t.g(instance, "instance");
        t.l(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, P.b(Object.class));
        updateService(serviceKey, ServiceFactoryKt.factoryOf(instance));
        return serviceKey;
    }

    public final /* synthetic */ Object get(String named) {
        t.g(named, "named");
        t.l(4, "T");
        return resolveService(new ServiceKey(named, P.b(Object.class)));
    }

    public final /* synthetic */ Object getOrNull(String named) {
        t.g(named, "named");
        t.l(4, "T");
        return resolveServiceOrNull(new ServiceKey(named, P.b(Object.class)));
    }

    public Object getService(String named, c instance) {
        t.g(named, "named");
        t.g(instance, "instance");
        return resolveService(new ServiceKey(named, instance));
    }

    public Map getServices() {
        return this._services;
    }

    public Object resolveService(ServiceKey key) {
        t.g(key, "key");
        l lVar = (l) getServices().get(key);
        if (lVar != null) {
            return lVar.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    public Object resolveServiceOrNull(ServiceKey key) {
        t.g(key, "key");
        l lVar = (l) getServices().get(key);
        if (lVar == null) {
            return null;
        }
        return lVar.getValue();
    }

    public final /* synthetic */ ServiceKey single(String named, a instance) {
        t.g(named, "named");
        t.g(instance, "instance");
        t.l(4, "T");
        ServiceKey serviceKey = new ServiceKey(named, P.b(Object.class));
        updateService(serviceKey, m.b(instance));
        return serviceKey;
    }

    public void updateService(ServiceKey key, l instance) {
        t.g(key, "key");
        t.g(instance, "instance");
        if (!getServices().containsKey(key)) {
            this._services.put(key, instance);
            return;
        }
        throw new IllegalStateException(("Cannot have multiple identical services: " + key).toString());
    }
}
