package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AdDataRefreshResponseKt;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdDataRefreshResponseKtKt {
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse -initializeadDataRefreshResponse(l block) {
        t.g(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.Companion;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder newBuilder = AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AdDataRefreshResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse copy(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse, l block) {
        t.g(adDataRefreshResponse, "<this>");
        t.g(block, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = adDataRefreshResponse.toBuilder();
        t.f(builder, "this.toBuilder()");
        AdDataRefreshResponseKt.Dsl _create = companion._create((AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        t.g(adDataRefreshResponseOrBuilder, "<this>");
        if (adDataRefreshResponseOrBuilder.hasError()) {
            return adDataRefreshResponseOrBuilder.getError();
        }
        return null;
    }
}
