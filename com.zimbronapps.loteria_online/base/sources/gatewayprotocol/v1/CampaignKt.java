package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CampaignKt {
    public static final CampaignKt INSTANCE = new CampaignKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.Campaign.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.Campaign.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.Campaign.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.Campaign _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (CampaignStateOuterClass.Campaign) build;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final void clearDataVersion() {
            this._builder.clearDataVersion();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearLoadTimestamp() {
            this._builder.clearLoadTimestamp();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearShowTimestamp() {
            this._builder.clearShowTimestamp();
        }

        public final ByteString getData() {
            ByteString data = this._builder.getData();
            t.f(data, "_builder.getData()");
            return data;
        }

        public final int getDataVersion() {
            return this._builder.getDataVersion();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            t.f(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final TimestampsOuterClass.Timestamps getLoadTimestamp() {
            TimestampsOuterClass.Timestamps loadTimestamp = this._builder.getLoadTimestamp();
            t.f(loadTimestamp, "_builder.getLoadTimestamp()");
            return loadTimestamp;
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            t.f(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestamp() {
            TimestampsOuterClass.Timestamps showTimestamp = this._builder.getShowTimestamp();
            t.f(showTimestamp, "_builder.getShowTimestamp()");
            return showTimestamp;
        }

        public final TimestampsOuterClass.Timestamps getShowTimestampOrNull(Dsl dsl) {
            t.g(dsl, "<this>");
            return CampaignKtKt.getShowTimestampOrNull(dsl._builder);
        }

        public final boolean hasLoadTimestamp() {
            return this._builder.hasLoadTimestamp();
        }

        public final boolean hasShowTimestamp() {
            return this._builder.hasShowTimestamp();
        }

        public final void setData(ByteString value) {
            t.g(value, "value");
            this._builder.setData(value);
        }

        public final void setDataVersion(int i) {
            this._builder.setDataVersion(i);
        }

        public final void setImpressionOpportunityId(ByteString value) {
            t.g(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void setLoadTimestamp(TimestampsOuterClass.Timestamps value) {
            t.g(value, "value");
            this._builder.setLoadTimestamp(value);
        }

        public final void setPlacementId(String value) {
            t.g(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void setShowTimestamp(TimestampsOuterClass.Timestamps value) {
            t.g(value, "value");
            this._builder.setShowTimestamp(value);
        }

        private Dsl(CampaignStateOuterClass.Campaign.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignKt() {
    }
}
