package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ListValue;
import com.google.protobuf.ListValueKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ListValueKtKt {
    public static final ListValue -initializelistValue(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder newBuilder = ListValue.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        ListValueKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final ListValue copy(ListValue listValue, Qa.l lVar) {
        kotlin.jvm.internal.t.g(listValue, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = listValue.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        ListValueKt.Dsl _create = companion._create((ListValue.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
