package com.unity3d.ads.core.data.repository;

import Ga.e;
import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OmidOptions;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, e eVar);

    Object finishSession(ByteString byteString, e eVar);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z, e eVar);

    boolean isOMActive();

    void setOMActive(boolean z);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, e eVar);
}
