package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AudienceManagementRequestKt;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AudienceManagementRequestKtKt {
    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest -initializeaudienceManagementRequest(l block) {
        t.g(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.Companion;
        AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder newBuilder = AudienceManagementRequestOuterClass.AudienceManagementRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AudienceManagementRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AudienceManagementRequestOuterClass.AudienceManagementRequest copy(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest, l block) {
        t.g(audienceManagementRequest, "<this>");
        t.g(block, "block");
        AudienceManagementRequestKt.Dsl.Companion companion = AudienceManagementRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = audienceManagementRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        AudienceManagementRequestKt.Dsl _create = companion._create((AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        t.g(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasDynamicDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        t.g(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasSessionCounters()) {
            return audienceManagementRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AudienceManagementRequestOuterClass.AudienceManagementRequestOrBuilder audienceManagementRequestOrBuilder) {
        t.g(audienceManagementRequestOrBuilder, "<this>");
        if (audienceManagementRequestOrBuilder.hasStaticDeviceInfo()) {
            return audienceManagementRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
