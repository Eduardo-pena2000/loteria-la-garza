package com.unity3d.ads.core.data.model;

import Ca.I;
import Ga.e;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.t;
import o2.E;
import o2.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebViewConfigurationStoreSerializer implements E {
    private final WebviewConfigurationStore.WebViewConfigurationStore defaultValue;

    public WebViewConfigurationStoreSerializer() {
        WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
        t.f(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    public Object readFrom(InputStream inputStream, e eVar) {
        try {
            WebviewConfigurationStore.WebViewConfigurationStore parseFrom = WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(inputStream);
            t.f(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new d("Cannot read proto.", e);
        }
    }

    public WebviewConfigurationStore.WebViewConfigurationStore getDefaultValue() {
        return this.defaultValue;
    }

    public Object writeTo(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OutputStream outputStream, e eVar) {
        webViewConfigurationStore.writeTo(outputStream);
        return I.a;
    }
}
