package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Mixin;
import com.google.protobuf.MixinKt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class MixinKtKt {
    public static final Mixin -initializemixin(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder newBuilder = Mixin.newBuilder();
        kotlin.jvm.internal.t.f(newBuilder, "newBuilder()");
        MixinKt.Dsl _create = companion._create(newBuilder);
        lVar.invoke(_create);
        return _create._build();
    }

    public static final Mixin copy(Mixin mixin, Qa.l lVar) {
        kotlin.jvm.internal.t.g(mixin, "<this>");
        kotlin.jvm.internal.t.g(lVar, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = mixin.toBuilder();
        kotlin.jvm.internal.t.f(builder, "this.toBuilder()");
        MixinKt.Dsl _create = companion._create((Mixin.Builder) builder);
        lVar.invoke(_create);
        return _create._build();
    }
}
