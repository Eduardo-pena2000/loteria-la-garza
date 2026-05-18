package com.unity3d.ads.datastore;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.datastore.UniversalRequestStoreKt;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UniversalRequestStoreKtKt {
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore -initializeuniversalRequestStore(l block) {
        t.g(block, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.Companion;
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder newBuilder = UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder();
        t.f(newBuilder, "newBuilder()");
        UniversalRequestStoreKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UniversalRequestStoreOuterClass.UniversalRequestStore copy(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, l block) {
        t.g(universalRequestStore, "<this>");
        t.g(block, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = universalRequestStore.toBuilder();
        t.f(builder, "this.toBuilder()");
        UniversalRequestStoreKt.Dsl _create = companion._create((UniversalRequestStoreOuterClass.UniversalRequestStore.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
