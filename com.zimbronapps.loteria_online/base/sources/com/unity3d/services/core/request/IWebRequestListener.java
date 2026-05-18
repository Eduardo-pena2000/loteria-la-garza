package com.unity3d.services.core.request;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface IWebRequestListener {
    void onComplete(String str, String str2, int i, Map map);

    void onFailed(String str, String str2);
}
