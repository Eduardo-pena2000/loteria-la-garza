package com.google.protobuf;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.DoubleValueKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DoubleValueKtKt {
    public static final DoubleValue -initializedoubleValue(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        DoubleValue.Builder newBuilder = DoubleValue.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        DoubleValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final DoubleValue copy(DoubleValue doubleValue, Qa.l lVar) {
        kotlin.jvm.internal.t.g(doubleValue, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = doubleValue.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        DoubleValueKt.Dsl _create = companion._create((DoubleValue.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
