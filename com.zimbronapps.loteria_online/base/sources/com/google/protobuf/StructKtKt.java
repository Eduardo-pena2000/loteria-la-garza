package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Struct;
import com.google.protobuf.StructKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StructKtKt {
    public static final Struct -initializestruct(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder newBuilder = Struct.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        StructKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Struct copy(Struct struct, Qa.l lVar) {
        kotlin.jvm.internal.t.g(struct, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = struct.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        StructKt.Dsl _create = companion._create((Struct.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
