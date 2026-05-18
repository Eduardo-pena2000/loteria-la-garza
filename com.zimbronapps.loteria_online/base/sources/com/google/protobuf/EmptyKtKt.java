package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.EmptyKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EmptyKtKt {
    public static final Empty -initializeempty(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder newBuilder = Empty.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        EmptyKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Empty copy(Empty empty, Qa.l lVar) {
        kotlin.jvm.internal.t.g(empty, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = empty.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        EmptyKt.Dsl _create = companion._create((Empty.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
