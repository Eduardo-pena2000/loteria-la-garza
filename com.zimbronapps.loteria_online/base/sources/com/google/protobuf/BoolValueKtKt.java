package com.google.protobuf;

import com.google.protobuf.BoolValue;
import com.google.protobuf.BoolValueKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BoolValueKtKt {
    public static final BoolValue -initializeboolValue(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder newBuilder = BoolValue.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        BoolValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final BoolValue copy(BoolValue boolValue, Qa.l lVar) {
        kotlin.jvm.internal.t.g(boolValue, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = boolValue.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        BoolValueKt.Dsl _create = companion._create((BoolValue.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
