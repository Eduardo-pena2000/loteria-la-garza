package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HeaderBiddingTokenKtKt {
    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken -initializeheaderBiddingToken(l block) {
        t.g(block, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder newBuilder = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
        t.f(newBuilder, "newBuilder()");
        HeaderBiddingTokenKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken copy(HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken, l block) {
        t.g(headerBiddingToken, "<this>");
        t.g(block, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = headerBiddingToken.toBuilder();
        t.f(builder, "this.toBuilder()");
        HeaderBiddingTokenKt.Dsl _create = companion._create((HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasCampaignState()) {
            return headerBiddingTokenOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasClientInfo()) {
            return headerBiddingTokenOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasDynamicDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasInitializationData()) {
            return headerBiddingTokenOrBuilder.getInitializationData();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasLimitedSessionToken()) {
            return headerBiddingTokenOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasMediationInfo()) {
            return headerBiddingTokenOrBuilder.getMediationInfo();
        }
        return null;
    }

    public static final PiiOuterClass.Pii getPiiOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasPii()) {
            return headerBiddingTokenOrBuilder.getPii();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasSessionCounters()) {
            return headerBiddingTokenOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasStaticDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final TestDataOuterClass.TestData getTestDataOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTestData()) {
            return headerBiddingTokenOrBuilder.getTestData();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTimestamps()) {
            return headerBiddingTokenOrBuilder.getTimestamps();
        }
        return null;
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        t.g(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTokenCounters()) {
            return headerBiddingTokenOrBuilder.getTokenCounters();
        }
        return null;
    }
}
