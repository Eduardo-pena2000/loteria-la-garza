package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.TokenCountersKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TokenCountersKtKt {
    public static final HeaderBiddingTokenOuterClass.TokenCounters -initializetokenCounters(l block) {
        t.g(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        t.f(newBuilder, "newBuilder()");
        TokenCountersKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters copy(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters, l block) {
        t.g(tokenCounters, "<this>");
        t.g(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = tokenCounters.toBuilder();
        t.f(builder, "this.toBuilder()");
        TokenCountersKt.Dsl _create = companion._create((HeaderBiddingTokenOuterClass.TokenCounters.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
