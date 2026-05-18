package com.unity3d.services.core.di;

import Xa.c;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ServiceKey {
    private final c instanceClass;
    private final String named;

    public ServiceKey(String named, c instanceClass) {
        t.g(named, "named");
        t.g(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    public static /* synthetic */ ServiceKey copy$default(ServiceKey serviceKey, String str, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serviceKey.named;
        }
        if ((i & 2) != 0) {
            cVar = serviceKey.instanceClass;
        }
        return serviceKey.copy(str, cVar);
    }

    public final String component1() {
        return this.named;
    }

    public final c component2() {
        return this.instanceClass;
    }

    public final ServiceKey copy(String named, c instanceClass) {
        t.g(named, "named");
        t.g(instanceClass, "instanceClass");
        return new ServiceKey(named, instanceClass);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceKey)) {
            return false;
        }
        ServiceKey serviceKey = (ServiceKey) obj;
        return t.c(this.named, serviceKey.named) && t.c(this.instanceClass, serviceKey.instanceClass);
    }

    public final c getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    public String toString() {
        return "ServiceKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ ServiceKey(String str, c cVar, int i, k kVar) {
        this((i & 1) != 0 ? "" : str, cVar);
    }
}
