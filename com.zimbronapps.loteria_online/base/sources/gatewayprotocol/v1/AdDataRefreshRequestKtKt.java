package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AdDataRefreshRequestKt;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdDataRefreshRequestKtKt {
    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest -initializeadDataRefreshRequest(l block) {
        t.g(block, "block");
        AdDataRefreshRequestKt.Dsl.Companion companion = AdDataRefreshRequestKt.Dsl.Companion;
        AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder newBuilder = AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AdDataRefreshRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdDataRefreshRequestOuterClass.AdDataRefreshRequest copy(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest, l block) {
        t.g(adDataRefreshRequest, "<this>");
        t.g(block, "block");
        AdDataRefreshRequestKt.Dsl.Companion companion = AdDataRefreshRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = adDataRefreshRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        AdDataRefreshRequestKt.Dsl _create = companion._create((AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        t.g(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasCampaignState()) {
            return adDataRefreshRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        t.g(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adDataRefreshRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        t.g(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasSessionCounters()) {
            return adDataRefreshRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdDataRefreshRequestOuterClass.AdDataRefreshRequestOrBuilder adDataRefreshRequestOrBuilder) {
        t.g(adDataRefreshRequestOrBuilder, "<this>");
        if (adDataRefreshRequestOrBuilder.hasStaticDeviceInfo()) {
            return adDataRefreshRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
