package com.google.protobuf;

import com.google.protobuf.Duration;
import com.google.protobuf.DurationKt;
import com.google.protobuf.GeneratedMessageLite;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DurationKtKt {
    public static final Duration -initializeduration(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder newBuilder = Duration.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        DurationKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Duration copy(Duration duration, Qa.l lVar) {
        kotlin.jvm.internal.t.g(duration, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = duration.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        DurationKt.Dsl _create = companion._create((Duration.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
