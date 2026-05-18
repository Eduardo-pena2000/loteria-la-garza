package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value;
import com.google.protobuf.Int64ValueKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Int64ValueKtKt {
    public static final Int64Value -initializeint64Value(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder newBuilder = Int64Value.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        Int64ValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Int64Value copy(Int64Value int64Value, Qa.l lVar) {
        kotlin.jvm.internal.t.g(int64Value, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = int64Value.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        Int64ValueKt.Dsl _create = companion._create((Int64Value.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
