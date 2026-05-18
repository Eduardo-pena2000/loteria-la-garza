package com.unity3d.ads.core.data.repository;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.S;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import fb.P;
import fb.z;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidCampaignRepository implements CampaignRepository {
    private final z campaigns;
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(GetSharedDataTimestamps getSharedDataTimestamps) {
        t.g(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.campaigns = P.a(S.h());
    }

    public CampaignStateOuterClass.Campaign getCampaign(ByteString opportunityId) {
        t.g(opportunityId, "opportunityId");
        return (CampaignStateOuterClass.Campaign) ((Map) this.campaigns.getValue()).get(opportunityId.toStringUtf8());
    }

    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Iterable values = ((Map) this.campaigns.getValue()).values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : values) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        q qVar = new q(arrayList, arrayList2);
        Iterable iterable = (List) qVar.a();
        Iterable iterable2 = (List) qVar.b();
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder newBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        t.f(newBuilder, "newBuilder()");
        CampaignStateKt.Dsl _create = companion._create(newBuilder);
        _create.addAllShownCampaigns(_create.getShownCampaigns(), iterable);
        _create.addAllLoadedCampaigns(_create.getLoadedCampaigns(), iterable2);
        return _create._build();
    }

    public void removeState(ByteString opportunityId) {
        Object value;
        String stringUtf8;
        t.g(opportunityId, "opportunityId");
        z zVar = this.campaigns;
        do {
            value = zVar.getValue();
            stringUtf8 = opportunityId.toStringUtf8();
            t.f(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!zVar.e(value, S.n((Map) value, stringUtf8)));
    }

    public void setCampaign(ByteString opportunityId, CampaignStateOuterClass.Campaign campaign) {
        Object value;
        t.g(opportunityId, "opportunityId");
        t.g(campaign, "campaign");
        z zVar = this.campaigns;
        do {
            value = zVar.getValue();
        } while (!zVar.e(value, S.q((Map) value, x.a(opportunityId.toStringUtf8(), campaign))));
    }

    public void setLoadTimestamp(ByteString opportunityId) {
        t.g(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = campaign.toBuilder();
            t.f(builder, "this.toBuilder()");
            CampaignKt.Dsl _create = companion._create((CampaignStateOuterClass.Campaign.Builder) builder);
            _create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            I i = I.a;
            setCampaign(opportunityId, _create._build());
        }
    }

    public void setShowTimestamp(ByteString opportunityId) {
        t.g(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            GeneratedMessageLite.Builder builder = campaign.toBuilder();
            t.f(builder, "this.toBuilder()");
            CampaignKt.Dsl _create = companion._create((CampaignStateOuterClass.Campaign.Builder) builder);
            _create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            I i = I.a;
            setCampaign(opportunityId, _create._build());
        }
    }
}
