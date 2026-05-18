package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.StringValue;
import com.google.protobuf.StringValueKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StringValueKtKt {
    public static final StringValue -initializestringValue(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder newBuilder = StringValue.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        StringValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final StringValue copy(StringValue stringValue, Qa.l lVar) {
        kotlin.jvm.internal.t.g(stringValue, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = stringValue.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        StringValueKt.Dsl _create = companion._create((StringValue.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
