package com.amazon.device.simplesignin.a;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface b {
    void a(Context context, Intent intent);

    void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest);

    void a(RequestId requestId, SSIEventRequest sSIEventRequest);

    void a(RequestId requestId, String str);

    void a(RequestId requestId, Map map);
}
