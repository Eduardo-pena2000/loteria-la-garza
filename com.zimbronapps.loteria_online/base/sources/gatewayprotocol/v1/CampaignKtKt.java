package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CampaignKtKt {
    public static final CampaignStateOuterClass.Campaign -initializecampaign(l block) {
        t.g(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
        CampaignStateOuterClass.Campaign.Builder newBuilder = CampaignStateOuterClass.Campaign.newBuilder();
        t.f(newBuilder, "newBuilder()");
        CampaignKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.Campaign copy(CampaignStateOuterClass.Campaign campaign, l block) {
        t.g(campaign, "<this>");
        t.g(block, "block");
        CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = campaign.toBuilder();
        t.f(builder, "this.toBuilder()");
        CampaignKt.Dsl _create = companion._create((CampaignStateOuterClass.Campaign.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps getLoadTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        t.g(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasLoadTimestamp()) {
            return campaignOrBuilder.getLoadTimestamp();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getShowTimestampOrNull(CampaignStateOuterClass.CampaignOrBuilder campaignOrBuilder) {
        t.g(campaignOrBuilder, "<this>");
        if (campaignOrBuilder.hasShowTimestamp()) {
            return campaignOrBuilder.getShowTimestamp();
        }
        return null;
    }
}
