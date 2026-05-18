package com.unity3d.services.core.di;

import Ca.l;
import Xa.c;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface IServicesRegistry {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(IServicesRegistry iServicesRegistry, String str, c cVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return iServicesRegistry.getService(str, cVar);
        }
    }

    Object getService(String str, c cVar);

    Map getServices();

    Object resolveService(ServiceKey serviceKey);

    Object resolveServiceOrNull(ServiceKey serviceKey);

    void updateService(ServiceKey serviceKey, l lVar);
}
