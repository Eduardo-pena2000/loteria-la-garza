package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.EnumKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EnumKtKt {
    public static final Enum -initializeenum(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder newBuilder = Enum.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        EnumKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Enum copy(Enum r2, Qa.l lVar) {
        kotlin.jvm.internal.t.g(r2, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = r2.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        EnumKt.Dsl _create = companion._create((Enum.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(EnumOrBuilder enumOrBuilder) {
        kotlin.jvm.internal.t.g(enumOrBuilder, "<this>");
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
