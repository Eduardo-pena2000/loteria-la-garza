package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Value;
import com.google.protobuf.ValueKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ValueKtKt {
    public static final Value -initializevalue(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder newBuilder = Value.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        ValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Value copy(Value value, Qa.l lVar) {
        kotlin.jvm.internal.t.g(value, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = value.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        ValueKt.Dsl _create = companion._create((Value.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final ListValue getListValueOrNull(ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.t.g(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }

    public static final Struct getStructValueOrNull(ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.t.g(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }
}
