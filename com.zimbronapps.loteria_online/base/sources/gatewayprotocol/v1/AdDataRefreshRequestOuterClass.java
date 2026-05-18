package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdDataRefreshRequestOuterClass {

    public static final class AdDataRefreshRequest extends GeneratedMessageLite implements AdDataRefreshRequestOrBuilder {
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 6;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 4;
        private static final AdDataRefreshRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private ByteString adDataRefreshToken_;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString impressionOpportunityId_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        public static final class Builder extends GeneratedMessageLite.Builder implements AdDataRefreshRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdDataRefreshToken() {
                copyOnWrite();
                AdDataRefreshRequest.access$1600((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCampaignState() {
                copyOnWrite();
                AdDataRefreshRequest.access$1200((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                AdDataRefreshRequest.access$900((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                AdDataRefreshRequest.access$1400((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                AdDataRefreshRequest.access$300((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                AdDataRefreshRequest.access$600((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getAdDataRefreshToken() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).getAdDataRefreshToken();
            }

            public CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).getCampaignState();
            }

            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).getDynamicDeviceInfo();
            }

            public ByteString getImpressionOpportunityId() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).getImpressionOpportunityId();
            }

            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).getSessionCounters();
            }

            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).getStaticDeviceInfo();
            }

            public boolean hasCampaignState() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).hasCampaignState();
            }

            public boolean hasDynamicDeviceInfo() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).hasDynamicDeviceInfo();
            }

            public boolean hasSessionCounters() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).hasSessionCounters();
            }

            public boolean hasStaticDeviceInfo() {
                return ((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance).hasStaticDeviceInfo();
            }

            public Builder mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                AdDataRefreshRequest.access$1100((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, campaignState);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                AdDataRefreshRequest.access$800((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                AdDataRefreshRequest.access$200((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                AdDataRefreshRequest.access$500((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString) {
                copyOnWrite();
                AdDataRefreshRequest.access$1500((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                AdDataRefreshRequest.access$1000((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, campaignState);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                AdDataRefreshRequest.access$700((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                AdDataRefreshRequest.access$1300((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                AdDataRefreshRequest.access$100((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                AdDataRefreshRequest.access$400((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            private Builder() {
                super(AdDataRefreshRequest.access$000());
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                AdDataRefreshRequest.access$1000((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, (CampaignStateOuterClass.CampaignState) builder.build());
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                AdDataRefreshRequest.access$700((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) builder.build());
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                AdDataRefreshRequest.access$100((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, (SessionCountersOuterClass.SessionCounters) builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                AdDataRefreshRequest.access$400((AdDataRefreshRequest) ((GeneratedMessageLite.Builder) this).instance, (StaticDeviceInfoOuterClass.StaticDeviceInfo) builder.build());
                return this;
            }
        }

        static {
            AdDataRefreshRequest adDataRefreshRequest = new AdDataRefreshRequest();
            DEFAULT_INSTANCE = adDataRefreshRequest;
            GeneratedMessageLite.registerDefaultInstance(AdDataRefreshRequest.class, adDataRefreshRequest);
        }

        private AdDataRefreshRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.impressionOpportunityId_ = byteString;
            this.adDataRefreshToken_ = byteString;
        }

        public static /* synthetic */ AdDataRefreshRequest access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(AdDataRefreshRequest adDataRefreshRequest, SessionCountersOuterClass.SessionCounters sessionCounters) {
            adDataRefreshRequest.setSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$1000(AdDataRefreshRequest adDataRefreshRequest, CampaignStateOuterClass.CampaignState campaignState) {
            adDataRefreshRequest.setCampaignState(campaignState);
        }

        public static /* synthetic */ void access$1100(AdDataRefreshRequest adDataRefreshRequest, CampaignStateOuterClass.CampaignState campaignState) {
            adDataRefreshRequest.mergeCampaignState(campaignState);
        }

        public static /* synthetic */ void access$1200(AdDataRefreshRequest adDataRefreshRequest) {
            adDataRefreshRequest.clearCampaignState();
        }

        public static /* synthetic */ void access$1300(AdDataRefreshRequest adDataRefreshRequest, ByteString byteString) {
            adDataRefreshRequest.setImpressionOpportunityId(byteString);
        }

        public static /* synthetic */ void access$1400(AdDataRefreshRequest adDataRefreshRequest) {
            adDataRefreshRequest.clearImpressionOpportunityId();
        }

        public static /* synthetic */ void access$1500(AdDataRefreshRequest adDataRefreshRequest, ByteString byteString) {
            adDataRefreshRequest.setAdDataRefreshToken(byteString);
        }

        public static /* synthetic */ void access$1600(AdDataRefreshRequest adDataRefreshRequest) {
            adDataRefreshRequest.clearAdDataRefreshToken();
        }

        public static /* synthetic */ void access$200(AdDataRefreshRequest adDataRefreshRequest, SessionCountersOuterClass.SessionCounters sessionCounters) {
            adDataRefreshRequest.mergeSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$300(AdDataRefreshRequest adDataRefreshRequest) {
            adDataRefreshRequest.clearSessionCounters();
        }

        public static /* synthetic */ void access$400(AdDataRefreshRequest adDataRefreshRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            adDataRefreshRequest.setStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$500(AdDataRefreshRequest adDataRefreshRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            adDataRefreshRequest.mergeStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$600(AdDataRefreshRequest adDataRefreshRequest) {
            adDataRefreshRequest.clearStaticDeviceInfo();
        }

        public static /* synthetic */ void access$700(AdDataRefreshRequest adDataRefreshRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            adDataRefreshRequest.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$800(AdDataRefreshRequest adDataRefreshRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            adDataRefreshRequest.mergeDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$900(AdDataRefreshRequest adDataRefreshRequest) {
            adDataRefreshRequest.clearDynamicDeviceInfo();
        }

        private void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
        }

        private void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= -9;
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -5;
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        public static AdDataRefreshRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            CampaignStateOuterClass.CampaignState campaignState2 = this.campaignState_;
            if (campaignState2 == null || campaignState2 == CampaignStateOuterClass.CampaignState.getDefaultInstance()) {
                this.campaignState_ = campaignState;
            } else {
                this.campaignState_ = (CampaignStateOuterClass.CampaignState) ((CampaignStateOuterClass.CampaignState.Builder) CampaignStateOuterClass.CampaignState.newBuilder(this.campaignState_).mergeFrom(campaignState)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 == null || dynamicDeviceInfo2 == DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            } else {
                this.dynamicDeviceInfo_ = (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) ((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 == null || sessionCounters2 == SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = sessionCounters;
            } else {
                this.sessionCounters_ = (SessionCountersOuterClass.SessionCounters) ((SessionCountersOuterClass.SessionCounters.Builder) SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCounters)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = (StaticDeviceInfoOuterClass.StaticDeviceInfo) ((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AdDataRefreshRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdDataRefreshRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdDataRefreshToken(ByteString byteString) {
            byteString.getClass();
            this.adDataRefreshToken_ = byteString;
        }

        private void setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
            campaignState.getClass();
            this.campaignState_ = campaignState;
            this.bitField0_ |= 8;
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 4;
        }

        private void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        private void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 1;
        }

        private void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdDataRefreshRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\n\u0006\n", new Object[]{"bitField0_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "impressionOpportunityId_", "adDataRefreshToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AdDataRefreshRequest.class) {
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

        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        public CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this.campaignState_;
            return campaignState == null ? CampaignStateOuterClass.CampaignState.getDefaultInstance() : campaignState;
        }

        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        public boolean hasCampaignState() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSessionCounters() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(AdDataRefreshRequest adDataRefreshRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(adDataRefreshRequest);
        }

        public static AdDataRefreshRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdDataRefreshRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdDataRefreshRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdDataRefreshRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdDataRefreshRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdDataRefreshRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdDataRefreshRequest parseFrom(InputStream inputStream) throws IOException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdDataRefreshRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdDataRefreshRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdDataRefreshRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdDataRefreshRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AdDataRefreshRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdDataRefreshToken();

        CampaignStateOuterClass.CampaignState getCampaignState();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        ByteString getImpressionOpportunityId();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();
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

    private AdDataRefreshRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
