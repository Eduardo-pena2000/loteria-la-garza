package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.FloatValueKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FloatValueKtKt {
    public static final FloatValue -initializefloatValue(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder newBuilder = FloatValue.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        FloatValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final FloatValue copy(FloatValue floatValue, Qa.l lVar) {
        kotlin.jvm.internal.t.g(floatValue, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = floatValue.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        FloatValueKt.Dsl _create = companion._create((FloatValue.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
