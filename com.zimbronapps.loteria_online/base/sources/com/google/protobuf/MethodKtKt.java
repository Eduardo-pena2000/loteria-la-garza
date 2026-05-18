package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Method;
import com.google.protobuf.MethodKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class MethodKtKt {
    public static final Method -initializemethod(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder newBuilder = Method.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        MethodKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Method copy(Method method, Qa.l lVar) {
        kotlin.jvm.internal.t.g(method, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = method.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        MethodKt.Dsl _create = companion._create((Method.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
