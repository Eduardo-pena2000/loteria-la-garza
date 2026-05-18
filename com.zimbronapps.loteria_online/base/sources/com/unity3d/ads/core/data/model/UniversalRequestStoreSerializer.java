package com.unity3d.ads.core.data.model;

import Ca.I;
import Ga.e;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.t;
import o2.E;
import o2.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UniversalRequestStoreSerializer implements E {
    private final UniversalRequestStoreOuterClass.UniversalRequestStore defaultValue;

    public UniversalRequestStoreSerializer() {
        UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
        t.f(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    public Object readFrom(InputStream inputStream, e eVar) {
        try {
            UniversalRequestStoreOuterClass.UniversalRequestStore parseFrom = UniversalRequestStoreOuterClass.UniversalRequestStore.parseFrom(inputStream);
            t.f(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new d("Cannot read proto.", e);
        }
    }

    public UniversalRequestStoreOuterClass.UniversalRequestStore getDefaultValue() {
        return this.defaultValue;
    }

    public Object writeTo(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, OutputStream outputStream, e eVar) {
        universalRequestStore.writeTo(outputStream);
        return I.a;
    }
}
