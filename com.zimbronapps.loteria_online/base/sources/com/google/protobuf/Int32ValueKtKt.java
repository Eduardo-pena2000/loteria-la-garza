package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int32ValueKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Int32ValueKtKt {
    public static final Int32Value -initializeint32Value(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        Int32Value.Builder newBuilder = Int32Value.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        Int32ValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Int32Value copy(Int32Value int32Value, Qa.l lVar) {
        kotlin.jvm.internal.t.g(int32Value, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = int32Value.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        Int32ValueKt.Dsl _create = companion._create((Int32Value.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
