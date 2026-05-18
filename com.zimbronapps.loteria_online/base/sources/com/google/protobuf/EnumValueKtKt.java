package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.EnumValueKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EnumValueKtKt {
    public static final EnumValue -initializeenumValue(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder newBuilder = EnumValue.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        EnumValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final EnumValue copy(EnumValue enumValue, Qa.l lVar) {
        kotlin.jvm.internal.t.g(enumValue, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = enumValue.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        EnumValueKt.Dsl _create = companion._create((EnumValue.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
