package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Option;
import com.google.protobuf.OptionKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OptionKtKt {
    public static final Option -initializeoption(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder newBuilder = Option.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        OptionKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Option copy(Option option, Qa.l lVar) {
        kotlin.jvm.internal.t.g(option, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = option.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        OptionKt.Dsl _create = companion._create((Option.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Any getValueOrNull(OptionOrBuilder optionOrBuilder) {
        kotlin.jvm.internal.t.g(optionOrBuilder, "<this>");
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
