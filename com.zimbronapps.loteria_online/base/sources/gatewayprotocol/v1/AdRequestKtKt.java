package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdRequestKtKt {
    public static final AdRequestOuterClass.AdRequest -initializeadRequest(l block) {
        t.g(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.Companion;
        AdRequestOuterClass.AdRequest.Builder newBuilder = AdRequestOuterClass.AdRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AdRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdRequestOuterClass.AdRequest copy(AdRequestOuterClass.AdRequest adRequest, l block) {
        t.g(adRequest, "<this>");
        t.g(block, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = adRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        AdRequestKt.Dsl _create = companion._create((AdRequestOuterClass.AdRequest.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdRequestOuterClass.BannerSize getBannerSizeOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        t.g(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasBannerSize()) {
            return adRequestOrBuilder.getBannerSize();
        }
        return null;
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        t.g(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasCampaignState()) {
            return adRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        t.g(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        t.g(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasMediationInfo()) {
            return adRequestOrBuilder.getMediationInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        t.g(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasSessionCounters()) {
            return adRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        t.g(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
