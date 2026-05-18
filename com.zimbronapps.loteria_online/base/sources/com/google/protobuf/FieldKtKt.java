package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.FieldKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FieldKtKt {
    public static final Field -initializefield(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder newBuilder = Field.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        FieldKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Field copy(Field field, Qa.l lVar) {
        kotlin.jvm.internal.t.g(field, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = field.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        FieldKt.Dsl _create = companion._create((Field.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
