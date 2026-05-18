package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AudienceManagementResponseKt;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AudienceManagementResponseKtKt {
    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse -initializeaudienceManagementResponse(l block) {
        t.g(block, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.Companion;
        AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder newBuilder = AudienceManagementResponseOuterClass.AudienceManagementResponse.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AudienceManagementResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AudienceManagementResponseOuterClass.AudienceManagementResponse copy(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse, l block) {
        t.g(audienceManagementResponse, "<this>");
        t.g(block, "block");
        AudienceManagementResponseKt.Dsl.Companion companion = AudienceManagementResponseKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = audienceManagementResponse.toBuilder();
        t.f(builder, "this.toBuilder()");
        AudienceManagementResponseKt.Dsl _create = companion._create((AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AudienceManagementResponseOuterClass.AudienceManagementResponseOrBuilder audienceManagementResponseOrBuilder) {
        t.g(audienceManagementResponseOrBuilder, "<this>");
        if (audienceManagementResponseOrBuilder.hasError()) {
            return audienceManagementResponseOrBuilder.getError();
        }
        return null;
    }
}
