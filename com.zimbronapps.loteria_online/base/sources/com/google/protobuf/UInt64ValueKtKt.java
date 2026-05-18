package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UInt64Value;
import com.google.protobuf.UInt64ValueKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UInt64ValueKtKt {
    public static final UInt64Value -initializeuInt64Value(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder newBuilder = UInt64Value.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        UInt64ValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final UInt64Value copy(UInt64Value uInt64Value, Qa.l lVar) {
        kotlin.jvm.internal.t.g(uInt64Value, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = uInt64Value.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        UInt64ValueKt.Dsl _create = companion._create((UInt64Value.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
