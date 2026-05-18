package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdResponseKtKt {
    public static final AdResponseOuterClass.AdResponse -initializeadResponse(l block) {
        t.g(block, "block");
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
        AdResponseOuterClass.AdResponse.Builder newBuilder = AdResponseOuterClass.AdResponse.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AdResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdResponseOuterClass.AdResponse copy(AdResponseOuterClass.AdResponse adResponse, l block) {
        t.g(adResponse, "<this>");
        t.g(block, "block");
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = adResponse.toBuilder();
        t.f(builder, "this.toBuilder()");
        AdResponseKt.Dsl _create = companion._create((AdResponseOuterClass.AdResponse.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        t.g(adResponseOrBuilder, "<this>");
        if (adResponseOrBuilder.hasError()) {
            return adResponseOrBuilder.getError();
        }
        return null;
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        t.g(adResponseOrBuilder, "<this>");
        if (adResponseOrBuilder.hasWebviewConfiguration()) {
            return adResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }
}
