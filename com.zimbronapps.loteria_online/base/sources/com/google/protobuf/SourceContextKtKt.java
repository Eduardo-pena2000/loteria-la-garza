package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.SourceContext;
import com.google.protobuf.SourceContextKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SourceContextKtKt {
    public static final SourceContext -initializesourceContext(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder newBuilder = SourceContext.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        SourceContextKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final SourceContext copy(SourceContext sourceContext, Qa.l lVar) {
        kotlin.jvm.internal.t.g(sourceContext, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = sourceContext.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        SourceContextKt.Dsl _create = companion._create((SourceContext.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
