package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.TimestampsOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CampaignStateOuterClass {

    public static final class Campaign extends GeneratedMessageLite implements CampaignOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int DATA_VERSION_FIELD_NUMBER = 1;
        private static final Campaign DEFAULT_INSTANCE;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
        public static final int LOAD_TIMESTAMP_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 3;
        public static final int SHOW_TIMESTAMP_FIELD_NUMBER = 6;
        private int bitField0_;
        private int dataVersion_;
        private ByteString data_;
        private ByteString impressionOpportunityId_;
        private TimestampsOuterClass.Timestamps loadTimestamp_;
        private String placementId_;
        private TimestampsOuterClass.Timestamps showTimestamp_;

        public static final class Builder extends GeneratedMessageLite.Builder implements CampaignOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                Campaign.access$400((Campaign) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDataVersion() {
                copyOnWrite();
                Campaign.access$200((Campaign) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                Campaign.access$900((Campaign) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLoadTimestamp() {
                copyOnWrite();
                Campaign.access$1200((Campaign) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                Campaign.access$600((Campaign) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearShowTimestamp() {
                copyOnWrite();
                Campaign.access$1500((Campaign) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getData() {
                return ((Campaign) ((GeneratedMessageLite.Builder) this).instance).getData();
            }

            public int getDataVersion() {
                return ((Campaign) ((GeneratedMessageLite.Builder) this).instance).getDataVersion();
            }

            public ByteString getImpressionOpportunityId() {
                return ((Campaign) ((GeneratedMessageLite.Builder) this).instance).getImpressionOpportunityId();
            }

            public TimestampsOuterClass.Timestamps getLoadTimestamp() {
                return ((Campaign) ((GeneratedMessageLite.Builder) this).instance).getLoadTimestamp();
            }

            public String getPlacementId() {
                return ((Campaign) ((GeneratedMessageLite.Builder) this).instance).getPlacementId();
            }

            public ByteString getPlacementIdBytes() {
                return ((Campaign) ((GeneratedMessageLite.Builder) this).instance).getPlacementIdBytes();
            }

            public TimestampsOuterClass.Timestamps getShowTimestamp() {
                return ((Campaign) ((GeneratedMessageLite.Builder) this).instance).getShowTimestamp();
            }

            public boolean hasLoadTimestamp() {
                return ((Campaign) ((GeneratedMessageLite.Builder) this).instance).hasLoadTimestamp();
            }

            public boolean hasShowTimestamp() {
                return ((Campaign) ((GeneratedMessageLite.Builder) this).instance).hasShowTimestamp();
            }

            public Builder mergeLoadTimestamp(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                Campaign.access$1100((Campaign) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                return this;
            }

            public Builder mergeShowTimestamp(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                Campaign.access$1400((Campaign) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                return this;
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                Campaign.access$300((Campaign) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setDataVersion(int i) {
                copyOnWrite();
                Campaign.access$100((Campaign) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                Campaign.access$800((Campaign) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setLoadTimestamp(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                Campaign.access$1000((Campaign) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                return this;
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                Campaign.access$500((Campaign) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) {
                copyOnWrite();
                Campaign.access$700((Campaign) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setShowTimestamp(TimestampsOuterClass.Timestamps timestamps) {
                copyOnWrite();
                Campaign.access$1300((Campaign) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                return this;
            }

            private Builder() {
                super(Campaign.access$000());
            }

            public Builder setLoadTimestamp(TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                Campaign.access$1000((Campaign) ((GeneratedMessageLite.Builder) this).instance, (TimestampsOuterClass.Timestamps) builder.build());
                return this;
            }

            public Builder setShowTimestamp(TimestampsOuterClass.Timestamps.Builder builder) {
                copyOnWrite();
                Campaign.access$1300((Campaign) ((GeneratedMessageLite.Builder) this).instance, (TimestampsOuterClass.Timestamps) builder.build());
                return this;
            }
        }

        static {
            Campaign campaign = new Campaign();
            DEFAULT_INSTANCE = campaign;
            GeneratedMessageLite.registerDefaultInstance(Campaign.class, campaign);
        }

        private Campaign() {
            ByteString byteString = ByteString.EMPTY;
            this.data_ = byteString;
            this.placementId_ = "";
            this.impressionOpportunityId_ = byteString;
        }

        public static /* synthetic */ Campaign access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(Campaign campaign, int i) {
            campaign.setDataVersion(i);
        }

        public static /* synthetic */ void access$1000(Campaign campaign, TimestampsOuterClass.Timestamps timestamps) {
            campaign.setLoadTimestamp(timestamps);
        }

        public static /* synthetic */ void access$1100(Campaign campaign, TimestampsOuterClass.Timestamps timestamps) {
            campaign.mergeLoadTimestamp(timestamps);
        }

        public static /* synthetic */ void access$1200(Campaign campaign) {
            campaign.clearLoadTimestamp();
        }

        public static /* synthetic */ void access$1300(Campaign campaign, TimestampsOuterClass.Timestamps timestamps) {
            campaign.setShowTimestamp(timestamps);
        }

        public static /* synthetic */ void access$1400(Campaign campaign, TimestampsOuterClass.Timestamps timestamps) {
            campaign.mergeShowTimestamp(timestamps);
        }

        public static /* synthetic */ void access$1500(Campaign campaign) {
            campaign.clearShowTimestamp();
        }

        public static /* synthetic */ void access$200(Campaign campaign) {
            campaign.clearDataVersion();
        }

        public static /* synthetic */ void access$300(Campaign campaign, ByteString byteString) {
            campaign.setData(byteString);
        }

        public static /* synthetic */ void access$400(Campaign campaign) {
            campaign.clearData();
        }

        public static /* synthetic */ void access$500(Campaign campaign, String str) {
            campaign.setPlacementId(str);
        }

        public static /* synthetic */ void access$600(Campaign campaign) {
            campaign.clearPlacementId();
        }

        public static /* synthetic */ void access$700(Campaign campaign, ByteString byteString) {
            campaign.setPlacementIdBytes(byteString);
        }

        public static /* synthetic */ void access$800(Campaign campaign, ByteString byteString) {
            campaign.setImpressionOpportunityId(byteString);
        }

        public static /* synthetic */ void access$900(Campaign campaign) {
            campaign.clearImpressionOpportunityId();
        }

        private void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        private void clearDataVersion() {
            this.dataVersion_ = 0;
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearLoadTimestamp() {
            this.loadTimestamp_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPlacementId() {
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        private void clearShowTimestamp() {
            this.showTimestamp_ = null;
            this.bitField0_ &= -3;
        }

        public static Campaign getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeLoadTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            TimestampsOuterClass.Timestamps timestamps2 = this.loadTimestamp_;
            if (timestamps2 == null || timestamps2 == TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.loadTimestamp_ = timestamps;
            } else {
                this.loadTimestamp_ = (TimestampsOuterClass.Timestamps) ((TimestampsOuterClass.Timestamps.Builder) TimestampsOuterClass.Timestamps.newBuilder(this.loadTimestamp_).mergeFrom(timestamps)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeShowTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            TimestampsOuterClass.Timestamps timestamps2 = this.showTimestamp_;
            if (timestamps2 == null || timestamps2 == TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                this.showTimestamp_ = timestamps;
            } else {
                this.showTimestamp_ = (TimestampsOuterClass.Timestamps) ((TimestampsOuterClass.Timestamps.Builder) TimestampsOuterClass.Timestamps.newBuilder(this.showTimestamp_).mergeFrom(timestamps)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Campaign parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Campaign) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Campaign parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        private void setDataVersion(int i) {
            this.dataVersion_ = i;
        }

        private void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        private void setLoadTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.loadTimestamp_ = timestamps;
            this.bitField0_ |= 1;
        }

        private void setPlacementId(String str) {
            str.getClass();
            this.placementId_ = str;
        }

        private void setPlacementIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
        }

        private void setShowTimestamp(TimestampsOuterClass.Timestamps timestamps) {
            timestamps.getClass();
            this.showTimestamp_ = timestamps;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Campaign();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003Ȉ\u0004\n\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "dataVersion_", "data_", "placementId_", "impressionOpportunityId_", "loadTimestamp_", "showTimestamp_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Campaign.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } finally {
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ByteString getData() {
            return this.data_;
        }

        public int getDataVersion() {
            return this.dataVersion_;
        }

        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        public TimestampsOuterClass.Timestamps getLoadTimestamp() {
            TimestampsOuterClass.Timestamps timestamps = this.loadTimestamp_;
            return timestamps == null ? TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        public String getPlacementId() {
            return this.placementId_;
        }

        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        public TimestampsOuterClass.Timestamps getShowTimestamp() {
            TimestampsOuterClass.Timestamps timestamps = this.showTimestamp_;
            return timestamps == null ? TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
        }

        public boolean hasLoadTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasShowTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(Campaign campaign) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(campaign);
        }

        public static Campaign parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Campaign) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Campaign parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Campaign parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Campaign parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Campaign parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Campaign parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Campaign parseFrom(InputStream inputStream) throws IOException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Campaign parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Campaign parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Campaign parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Campaign) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface CampaignOrBuilder extends MessageLiteOrBuilder {
        ByteString getData();

        int getDataVersion();

        ByteString getImpressionOpportunityId();

        TimestampsOuterClass.Timestamps getLoadTimestamp();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        TimestampsOuterClass.Timestamps getShowTimestamp();

        boolean hasLoadTimestamp();

        boolean hasShowTimestamp();
    }

    public static final class CampaignState extends GeneratedMessageLite implements CampaignStateOrBuilder {
        private static final CampaignState DEFAULT_INSTANCE;
        public static final int LOADED_CAMPAIGNS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int SHOWN_CAMPAIGNS_FIELD_NUMBER = 2;
        private Internal.ProtobufList loadedCampaigns_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList shownCampaigns_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder implements CampaignStateOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllLoadedCampaigns(Iterable iterable) {
                copyOnWrite();
                CampaignState.access$2100((CampaignState) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addAllShownCampaigns(Iterable iterable) {
                copyOnWrite();
                CampaignState.access$2700((CampaignState) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addLoadedCampaigns(Campaign campaign) {
                copyOnWrite();
                CampaignState.access$1900((CampaignState) ((GeneratedMessageLite.Builder) this).instance, campaign);
                return this;
            }

            public Builder addShownCampaigns(Campaign campaign) {
                copyOnWrite();
                CampaignState.access$2500((CampaignState) ((GeneratedMessageLite.Builder) this).instance, campaign);
                return this;
            }

            public Builder clearLoadedCampaigns() {
                copyOnWrite();
                CampaignState.access$2200((CampaignState) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearShownCampaigns() {
                copyOnWrite();
                CampaignState.access$2800((CampaignState) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Campaign getLoadedCampaigns(int i) {
                return ((CampaignState) ((GeneratedMessageLite.Builder) this).instance).getLoadedCampaigns(i);
            }

            public int getLoadedCampaignsCount() {
                return ((CampaignState) ((GeneratedMessageLite.Builder) this).instance).getLoadedCampaignsCount();
            }

            public List getLoadedCampaignsList() {
                return Collections.unmodifiableList(((CampaignState) ((GeneratedMessageLite.Builder) this).instance).getLoadedCampaignsList());
            }

            public Campaign getShownCampaigns(int i) {
                return ((CampaignState) ((GeneratedMessageLite.Builder) this).instance).getShownCampaigns(i);
            }

            public int getShownCampaignsCount() {
                return ((CampaignState) ((GeneratedMessageLite.Builder) this).instance).getShownCampaignsCount();
            }

            public List getShownCampaignsList() {
                return Collections.unmodifiableList(((CampaignState) ((GeneratedMessageLite.Builder) this).instance).getShownCampaignsList());
            }

            public Builder removeLoadedCampaigns(int i) {
                copyOnWrite();
                CampaignState.access$2300((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder removeShownCampaigns(int i) {
                copyOnWrite();
                CampaignState.access$2900((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setLoadedCampaigns(int i, Campaign campaign) {
                copyOnWrite();
                CampaignState.access$1800((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i, campaign);
                return this;
            }

            public Builder setShownCampaigns(int i, Campaign campaign) {
                copyOnWrite();
                CampaignState.access$2400((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i, campaign);
                return this;
            }

            private Builder() {
                super(CampaignState.access$1700());
            }

            public Builder addLoadedCampaigns(int i, Campaign campaign) {
                copyOnWrite();
                CampaignState.access$2000((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i, campaign);
                return this;
            }

            public Builder addShownCampaigns(int i, Campaign campaign) {
                copyOnWrite();
                CampaignState.access$2600((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i, campaign);
                return this;
            }

            public Builder setLoadedCampaigns(int i, Campaign.Builder builder) {
                copyOnWrite();
                CampaignState.access$1800((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i, (Campaign) builder.build());
                return this;
            }

            public Builder setShownCampaigns(int i, Campaign.Builder builder) {
                copyOnWrite();
                CampaignState.access$2400((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i, (Campaign) builder.build());
                return this;
            }

            public Builder addLoadedCampaigns(Campaign.Builder builder) {
                copyOnWrite();
                CampaignState.access$1900((CampaignState) ((GeneratedMessageLite.Builder) this).instance, (Campaign) builder.build());
                return this;
            }

            public Builder addShownCampaigns(Campaign.Builder builder) {
                copyOnWrite();
                CampaignState.access$2500((CampaignState) ((GeneratedMessageLite.Builder) this).instance, (Campaign) builder.build());
                return this;
            }

            public Builder addLoadedCampaigns(int i, Campaign.Builder builder) {
                copyOnWrite();
                CampaignState.access$2000((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i, (Campaign) builder.build());
                return this;
            }

            public Builder addShownCampaigns(int i, Campaign.Builder builder) {
                copyOnWrite();
                CampaignState.access$2600((CampaignState) ((GeneratedMessageLite.Builder) this).instance, i, (Campaign) builder.build());
                return this;
            }
        }

        static {
            CampaignState campaignState = new CampaignState();
            DEFAULT_INSTANCE = campaignState;
            GeneratedMessageLite.registerDefaultInstance(CampaignState.class, campaignState);
        }

        private CampaignState() {
        }

        public static /* synthetic */ CampaignState access$1700() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$1800(CampaignState campaignState, int i, Campaign campaign) {
            campaignState.setLoadedCampaigns(i, campaign);
        }

        public static /* synthetic */ void access$1900(CampaignState campaignState, Campaign campaign) {
            campaignState.addLoadedCampaigns(campaign);
        }

        public static /* synthetic */ void access$2000(CampaignState campaignState, int i, Campaign campaign) {
            campaignState.addLoadedCampaigns(i, campaign);
        }

        public static /* synthetic */ void access$2100(CampaignState campaignState, Iterable iterable) {
            campaignState.addAllLoadedCampaigns(iterable);
        }

        public static /* synthetic */ void access$2200(CampaignState campaignState) {
            campaignState.clearLoadedCampaigns();
        }

        public static /* synthetic */ void access$2300(CampaignState campaignState, int i) {
            campaignState.removeLoadedCampaigns(i);
        }

        public static /* synthetic */ void access$2400(CampaignState campaignState, int i, Campaign campaign) {
            campaignState.setShownCampaigns(i, campaign);
        }

        public static /* synthetic */ void access$2500(CampaignState campaignState, Campaign campaign) {
            campaignState.addShownCampaigns(campaign);
        }

        public static /* synthetic */ void access$2600(CampaignState campaignState, int i, Campaign campaign) {
            campaignState.addShownCampaigns(i, campaign);
        }

        public static /* synthetic */ void access$2700(CampaignState campaignState, Iterable iterable) {
            campaignState.addAllShownCampaigns(iterable);
        }

        public static /* synthetic */ void access$2800(CampaignState campaignState) {
            campaignState.clearShownCampaigns();
        }

        public static /* synthetic */ void access$2900(CampaignState campaignState, int i) {
            campaignState.removeShownCampaigns(i);
        }

        private void addAllLoadedCampaigns(Iterable iterable) {
            ensureLoadedCampaignsIsMutable();
            AbstractMessageLite.addAll(iterable, this.loadedCampaigns_);
        }

        private void addAllShownCampaigns(Iterable iterable) {
            ensureShownCampaignsIsMutable();
            AbstractMessageLite.addAll(iterable, this.shownCampaigns_);
        }

        private void addLoadedCampaigns(Campaign campaign) {
            campaign.getClass();
            ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.add(campaign);
        }

        private void addShownCampaigns(Campaign campaign) {
            campaign.getClass();
            ensureShownCampaignsIsMutable();
            this.shownCampaigns_.add(campaign);
        }

        private void clearLoadedCampaigns() {
            this.loadedCampaigns_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearShownCampaigns() {
            this.shownCampaigns_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureLoadedCampaignsIsMutable() {
            Internal.ProtobufList protobufList = this.loadedCampaigns_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.loadedCampaigns_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureShownCampaignsIsMutable() {
            Internal.ProtobufList protobufList = this.shownCampaigns_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.shownCampaigns_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static CampaignState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CampaignState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CampaignState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CampaignState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeLoadedCampaigns(int i) {
            ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.remove(i);
        }

        private void removeShownCampaigns(int i) {
            ensureShownCampaignsIsMutable();
            this.shownCampaigns_.remove(i);
        }

        private void setLoadedCampaigns(int i, Campaign campaign) {
            campaign.getClass();
            ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.set(i, campaign);
        }

        private void setShownCampaigns(int i, Campaign campaign) {
            campaign.getClass();
            ensureShownCampaignsIsMutable();
            this.shownCampaigns_.set(i, campaign);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CampaignState();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"loadedCampaigns_", Campaign.class, "shownCampaigns_", Campaign.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (CampaignState.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } finally {
                            }
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public Campaign getLoadedCampaigns(int i) {
            return (Campaign) this.loadedCampaigns_.get(i);
        }

        public int getLoadedCampaignsCount() {
            return this.loadedCampaigns_.size();
        }

        public List getLoadedCampaignsList() {
            return this.loadedCampaigns_;
        }

        public CampaignOrBuilder getLoadedCampaignsOrBuilder(int i) {
            return (CampaignOrBuilder) this.loadedCampaigns_.get(i);
        }

        public List getLoadedCampaignsOrBuilderList() {
            return this.loadedCampaigns_;
        }

        public Campaign getShownCampaigns(int i) {
            return (Campaign) this.shownCampaigns_.get(i);
        }

        public int getShownCampaignsCount() {
            return this.shownCampaigns_.size();
        }

        public List getShownCampaignsList() {
            return this.shownCampaigns_;
        }

        public CampaignOrBuilder getShownCampaignsOrBuilder(int i) {
            return (CampaignOrBuilder) this.shownCampaigns_.get(i);
        }

        public List getShownCampaignsOrBuilderList() {
            return this.shownCampaigns_;
        }

        public static Builder newBuilder(CampaignState campaignState) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(campaignState);
        }

        public static CampaignState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CampaignState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CampaignState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CampaignState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addLoadedCampaigns(int i, Campaign campaign) {
            campaign.getClass();
            ensureLoadedCampaignsIsMutable();
            this.loadedCampaigns_.add(i, campaign);
        }

        private void addShownCampaigns(int i, Campaign campaign) {
            campaign.getClass();
            ensureShownCampaignsIsMutable();
            this.shownCampaigns_.add(i, campaign);
        }

        public static CampaignState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CampaignState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CampaignState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CampaignState parseFrom(InputStream inputStream) throws IOException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CampaignState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CampaignState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CampaignState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CampaignState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface CampaignStateOrBuilder extends MessageLiteOrBuilder {
        Campaign getLoadedCampaigns(int i);

        int getLoadedCampaignsCount();

        List getLoadedCampaignsList();

        Campaign getShownCampaigns(int i);

        int getShownCampaignsCount();

        List getShownCampaignsList();
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private CampaignStateOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
