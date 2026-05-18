package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.HeaderBiddingAdMarkupKt;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HeaderBiddingAdMarkupKtKt {
    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup -initializeheaderBiddingAdMarkup(l block) {
        t.g(block, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.Companion;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder newBuilder = HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.newBuilder();
        t.f(newBuilder, "newBuilder()");
        HeaderBiddingAdMarkupKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup copy(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, l block) {
        t.g(headerBiddingAdMarkup, "<this>");
        t.g(block, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = headerBiddingAdMarkup.toBuilder();
        t.f(builder, "this.toBuilder()");
        HeaderBiddingAdMarkupKt.Dsl _create = companion._create((HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
