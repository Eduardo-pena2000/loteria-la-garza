package com.unity3d.services.core.network.core;

import Ga.e;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, e eVar);

    HttpResponse executeBlocking(HttpRequest httpRequest) throws Exception;
}
