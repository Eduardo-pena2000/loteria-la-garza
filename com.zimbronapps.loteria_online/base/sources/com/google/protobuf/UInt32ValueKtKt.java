package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.UInt32ValueKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UInt32ValueKtKt {
    public static final UInt32Value -initializeuInt32Value(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder newBuilder = UInt32Value.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        UInt32ValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final UInt32Value copy(UInt32Value uInt32Value, Qa.l lVar) {
        kotlin.jvm.internal.t.g(uInt32Value, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = uInt32Value.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        UInt32ValueKt.Dsl _create = companion._create((UInt32Value.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
