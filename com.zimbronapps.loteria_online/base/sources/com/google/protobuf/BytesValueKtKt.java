package com.google.protobuf;

import com.google.protobuf.BytesValue;
import com.google.protobuf.BytesValueKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BytesValueKtKt {
    public static final BytesValue -initializebytesValue(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder newBuilder = BytesValue.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        BytesValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final BytesValue copy(BytesValue bytesValue, Qa.l lVar) {
        kotlin.jvm.internal.t.g(bytesValue, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = bytesValue.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        BytesValueKt.Dsl _create = companion._create((BytesValue.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
