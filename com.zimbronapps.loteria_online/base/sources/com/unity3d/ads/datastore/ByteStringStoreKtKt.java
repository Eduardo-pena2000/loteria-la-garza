package com.unity3d.ads.datastore;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ByteStringStoreKtKt {
    public static final ByteStringStoreOuterClass.ByteStringStore -initializebyteStringStore(l block) {
        t.g(block, "block");
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder newBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        t.f(newBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ByteStringStoreOuterClass.ByteStringStore copy(ByteStringStoreOuterClass.ByteStringStore byteStringStore, l block) {
        t.g(byteStringStore, "<this>");
        t.g(block, "block");
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = byteStringStore.toBuilder();
        t.f(builder, "this.toBuilder()");
        ByteStringStoreKt.Dsl _create = companion._create((ByteStringStoreOuterClass.ByteStringStore.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
