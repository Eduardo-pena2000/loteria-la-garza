package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ScarRequestHandler {
    private final HttpClient httpClient = (HttpClient) Utilities.getService(HttpClient.class);

    public void makeUploadRequest(String str, BiddingSignals biddingSignals, String str2) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", Collections.singletonList("application/json"));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("idfi", Device.getIdfi());
        hashMap2.put("tid", str);
        hashMap2.putAll(biddingSignals.getMap());
        this.httpClient.executeBlocking(new HttpRequest(str2, "", RequestType.POST, new JSONObject(hashMap2).toString().getBytes(StandardCharsets.UTF_8), hashMap));
    }
}
