package com.unity3d.services.core.request;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface IWebRequestProgressListener {
    void onRequestProgress(String str, long j, long j2);

    void onRequestStart(String str, long j, int i, Map map);
}
