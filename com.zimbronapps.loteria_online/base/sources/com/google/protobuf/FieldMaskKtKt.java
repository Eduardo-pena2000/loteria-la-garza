package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.FieldMaskKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FieldMaskKtKt {
    public static final FieldMask -initializefieldMask(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder newBuilder = FieldMask.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        FieldMaskKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final FieldMask copy(FieldMask fieldMask, Qa.l lVar) {
        kotlin.jvm.internal.t.g(fieldMask, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = fieldMask.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        FieldMaskKt.Dsl _create = companion._create((FieldMask.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
