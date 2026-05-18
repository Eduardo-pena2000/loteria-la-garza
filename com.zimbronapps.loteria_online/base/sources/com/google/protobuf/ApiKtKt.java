package com.google.protobuf;

import com.google.protobuf.Api;
import com.google.protobuf.ApiKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ApiKtKt {
    public static final Api -initializeapi(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder newBuilder = Api.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        ApiKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Api copy(Api api, Qa.l lVar) {
        kotlin.jvm.internal.t.g(api, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = api.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        ApiKt.Dsl _create = companion._create((Api.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(ApiOrBuilder apiOrBuilder) {
        kotlin.jvm.internal.t.g(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
