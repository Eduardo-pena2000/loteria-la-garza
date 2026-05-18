package com.google.protobuf;

import com.google.protobuf.Any;
import com.google.protobuf.AnyKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AnyKtKt {
    public static final Any -initializeany(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder newBuilder = Any.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        AnyKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Any copy(Any any, Qa.l lVar) {
        kotlin.jvm.internal.t.g(any, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = any.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        AnyKt.Dsl _create = companion._create((Any.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
