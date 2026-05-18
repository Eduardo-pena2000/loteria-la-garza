package com.unity3d.ads.core.data.model;

import Ca.I;
import Ga.e;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.t;
import o2.E;
import o2.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ByteStringSerializer implements E {
    private final ByteStringStoreOuterClass.ByteStringStore defaultValue;

    public ByteStringSerializer() {
        ByteStringStoreOuterClass.ByteStringStore defaultInstance = ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance();
        t.f(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    public Object readFrom(InputStream inputStream, e eVar) {
        try {
            ByteStringStoreOuterClass.ByteStringStore parseFrom = ByteStringStoreOuterClass.ByteStringStore.parseFrom(inputStream);
            t.f(parseFrom, "parseFrom(input)");
            return parseFrom;
        } catch (InvalidProtocolBufferException e) {
            throw new d("Cannot read proto.", e);
        }
    }

    public ByteStringStoreOuterClass.ByteStringStore getDefaultValue() {
        return this.defaultValue;
    }

    public Object writeTo(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OutputStream outputStream, e eVar) {
        byteStringStore.writeTo(outputStream);
        return I.a;
    }
}
