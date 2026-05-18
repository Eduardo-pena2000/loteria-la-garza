package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TimestampKtKt {
    public static final Timestamp -initializetimestamp(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder newBuilder = Timestamp.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        TimestampKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Timestamp copy(Timestamp timestamp, Qa.l lVar) {
        kotlin.jvm.internal.t.g(timestamp, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = timestamp.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        TimestampKt.Dsl _create = companion._create((Timestamp.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
