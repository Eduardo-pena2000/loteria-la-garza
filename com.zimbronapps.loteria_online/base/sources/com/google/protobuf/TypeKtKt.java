package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Type;
import com.google.protobuf.TypeKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TypeKtKt {
    public static final Type -initializetype(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder newBuilder = Type.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        TypeKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Type copy(Type type, Qa.l lVar) {
        kotlin.jvm.internal.t.g(type, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = type.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        TypeKt.Dsl _create = companion._create((Type.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(TypeOrBuilder typeOrBuilder) {
        kotlin.jvm.internal.t.g(typeOrBuilder, "<this>");
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
