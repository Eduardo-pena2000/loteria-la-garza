package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CampaignStateKtKt {
    public static final CampaignStateOuterClass.CampaignState -initializecampaignState(l block) {
        t.g(block, "block");
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder newBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        t.f(newBuilder, "newBuilder()");
        CampaignStateKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final CampaignStateOuterClass.CampaignState copy(CampaignStateOuterClass.CampaignState campaignState, l block) {
        t.g(campaignState, "<this>");
        t.g(block, "block");
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = campaignState.toBuilder();
        t.f(builder, "this.toBuilder()");
        CampaignStateKt.Dsl _create = companion._create((CampaignStateOuterClass.CampaignState.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
