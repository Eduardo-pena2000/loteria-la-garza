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
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OperativeEventRequestOuterClass {

    public static final class OperativeEventErrorData extends GeneratedMessageLite implements OperativeEventErrorDataOrBuilder {
        private static final OperativeEventErrorData DEFAULT_INSTANCE;
        public static final int ERROR_TYPE_FIELD_NUMBER = 1;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private int errorType_;
        private String message_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements OperativeEventErrorDataOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearErrorType() {
                copyOnWrite();
                OperativeEventErrorData.access$300((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMessage() {
                copyOnWrite();
                OperativeEventErrorData.access$500((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public OperativeEventErrorType getErrorType() {
                return ((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance).getErrorType();
            }

            public int getErrorTypeValue() {
                return ((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance).getErrorTypeValue();
            }

            public String getMessage() {
                return ((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance).getMessage();
            }

            public ByteString getMessageBytes() {
                return ((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance).getMessageBytes();
            }

            public Builder setErrorType(OperativeEventErrorType operativeEventErrorType) {
                copyOnWrite();
                OperativeEventErrorData.access$200((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance, operativeEventErrorType);
                return this;
            }

            public Builder setErrorTypeValue(int i) {
                copyOnWrite();
                OperativeEventErrorData.access$100((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setMessage(String str) {
                copyOnWrite();
                OperativeEventErrorData.access$400((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                copyOnWrite();
                OperativeEventErrorData.access$600((OperativeEventErrorData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(OperativeEventErrorData.access$000());
            }
        }

        static {
            OperativeEventErrorData operativeEventErrorData = new OperativeEventErrorData();
            DEFAULT_INSTANCE = operativeEventErrorData;
            GeneratedMessageLite.registerDefaultInstance(OperativeEventErrorData.class, operativeEventErrorData);
        }

        private OperativeEventErrorData() {
        }

        public static /* synthetic */ OperativeEventErrorData access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(OperativeEventErrorData operativeEventErrorData, int i) {
            operativeEventErrorData.setErrorTypeValue(i);
        }

        public static /* synthetic */ void access$200(OperativeEventErrorData operativeEventErrorData, OperativeEventErrorType operativeEventErrorType) {
            operativeEventErrorData.setErrorType(operativeEventErrorType);
        }

        public static /* synthetic */ void access$300(OperativeEventErrorData operativeEventErrorData) {
            operativeEventErrorData.clearErrorType();
        }

        public static /* synthetic */ void access$400(OperativeEventErrorData operativeEventErrorData, String str) {
            operativeEventErrorData.setMessage(str);
        }

        public static /* synthetic */ void access$500(OperativeEventErrorData operativeEventErrorData) {
            operativeEventErrorData.clearMessage();
        }

        public static /* synthetic */ void access$600(OperativeEventErrorData operativeEventErrorData, ByteString byteString) {
            operativeEventErrorData.setMessageBytes(byteString);
        }

        private void clearErrorType() {
            this.errorType_ = 0;
        }

        private void clearMessage() {
            this.message_ = getDefaultInstance().getMessage();
        }

        public static OperativeEventErrorData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OperativeEventErrorData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperativeEventErrorData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorType(OperativeEventErrorType operativeEventErrorType) {
            this.errorType_ = operativeEventErrorType.getNumber();
        }

        private void setErrorTypeValue(int i) {
            this.errorType_ = i;
        }

        private void setMessage(String str) {
            str.getClass();
            this.message_ = str;
        }

        private void setMessageBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.message_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperativeEventErrorData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"errorType_", "message_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (OperativeEventErrorData.class) {
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

        public OperativeEventErrorType getErrorType() {
            OperativeEventErrorType forNumber = OperativeEventErrorType.forNumber(this.errorType_);
            return forNumber == null ? OperativeEventErrorType.UNRECOGNIZED : forNumber;
        }

        public int getErrorTypeValue() {
            return this.errorType_;
        }

        public String getMessage() {
            return this.message_;
        }

        public ByteString getMessageBytes() {
            return ByteString.copyFromUtf8(this.message_);
        }

        public static Builder newBuilder(OperativeEventErrorData operativeEventErrorData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operativeEventErrorData);
        }

        public static OperativeEventErrorData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperativeEventErrorData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperativeEventErrorData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(InputStream inputStream) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperativeEventErrorData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperativeEventErrorData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OperativeEventErrorData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventErrorData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface OperativeEventErrorDataOrBuilder extends MessageLiteOrBuilder {
        OperativeEventErrorType getErrorType();

        int getErrorTypeValue();

        String getMessage();

        ByteString getMessageBytes();
    }

    public enum OperativeEventErrorType implements Internal.EnumLite {
        OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT(1),
        OPERATIVE_EVENT_ERROR_TYPE_GATEWAY(2),
        OPERATIVE_EVENT_ERROR_TYPE_EXPIRED(3),
        OPERATIVE_EVENT_ERROR_TYPE_ALREADY_SHOWING(4),
        OPERATIVE_EVENT_ERROR_TYPE_INVALID_AD_MARKUP(5),
        OPERATIVE_EVENT_ERROR_TYPE_DOWNLOAD_FAILED(6),
        OPERATIVE_EVENT_ERROR_TYPE_AD_VIEWER(7),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_ERROR_TYPE_AD_VIEWER_VALUE = 7;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_ALREADY_SHOWING_VALUE = 4;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_DOWNLOAD_FAILED_VALUE = 6;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_EXPIRED_VALUE = 3;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_GATEWAY_VALUE = 2;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_INVALID_AD_MARKUP_VALUE = 5;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT_VALUE = 1;
        public static final int OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public OperativeEventErrorType findValueByNumber(int i) {
                return OperativeEventErrorType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return OperativeEventErrorType.forNumber(i) != null;
            }
        }

        OperativeEventErrorType(int i) {
            this.value = i;
        }

        public static OperativeEventErrorType forNumber(int i) {
            switch (i) {
                case 0:
                    return OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                case 1:
                    return OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
                case 2:
                    return OPERATIVE_EVENT_ERROR_TYPE_GATEWAY;
                case 3:
                    return OPERATIVE_EVENT_ERROR_TYPE_EXPIRED;
                case 4:
                    return OPERATIVE_EVENT_ERROR_TYPE_ALREADY_SHOWING;
                case 5:
                    return OPERATIVE_EVENT_ERROR_TYPE_INVALID_AD_MARKUP;
                case 6:
                    return OPERATIVE_EVENT_ERROR_TYPE_DOWNLOAD_FAILED;
                case 7:
                    return OPERATIVE_EVENT_ERROR_TYPE_AD_VIEWER;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static OperativeEventErrorType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class OperativeEventRequest extends GeneratedMessageLite implements OperativeEventRequestOrBuilder {
        public static final int ADDITIONAL_DATA_FIELD_NUMBER = 5;
        public static final int AD_FORMAT_FIELD_NUMBER = 11;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        private static final OperativeEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 9;
        public static final int EVENT_ID_FIELD_NUMBER = 1;
        public static final int EVENT_TYPE_FIELD_NUMBER = 2;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 7;
        public static final int SID_FIELD_NUMBER = 6;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 4;
        private int adFormat_;
        private ByteString additionalData_;
        private int bitField0_;
        private CampaignStateOuterClass.CampaignState campaignState_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private ByteString eventId_;
        private int eventType_;
        private ByteString impressionOpportunityId_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private String sid_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private ByteString trackingToken_;

        public static final class Builder extends GeneratedMessageLite.Builder implements OperativeEventRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                OperativeEventRequest.access$3700((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdditionalData() {
                copyOnWrite();
                OperativeEventRequest.access$1900((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCampaignState() {
                copyOnWrite();
                OperativeEventRequest.access$3400((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                OperativeEventRequest.access$3100((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEventId() {
                copyOnWrite();
                OperativeEventRequest.access$1000((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEventType() {
                copyOnWrite();
                OperativeEventRequest.access$1300((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                OperativeEventRequest.access$1500((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                OperativeEventRequest.access$2500((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSid() {
                copyOnWrite();
                OperativeEventRequest.access$2100((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                OperativeEventRequest.access$2800((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTrackingToken() {
                copyOnWrite();
                OperativeEventRequest.access$1700((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getAdFormat();
            }

            public int getAdFormatValue() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getAdFormatValue();
            }

            public ByteString getAdditionalData() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getAdditionalData();
            }

            public CampaignStateOuterClass.CampaignState getCampaignState() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getCampaignState();
            }

            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getDynamicDeviceInfo();
            }

            public ByteString getEventId() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getEventId();
            }

            public OperativeEventType getEventType() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getEventType();
            }

            public int getEventTypeValue() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getEventTypeValue();
            }

            public ByteString getImpressionOpportunityId() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getImpressionOpportunityId();
            }

            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getSessionCounters();
            }

            public String getSid() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getSid();
            }

            public ByteString getSidBytes() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getSidBytes();
            }

            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getStaticDeviceInfo();
            }

            public ByteString getTrackingToken() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).getTrackingToken();
            }

            public boolean hasAdFormat() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasAdFormat();
            }

            public boolean hasCampaignState() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasCampaignState();
            }

            public boolean hasDynamicDeviceInfo() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasDynamicDeviceInfo();
            }

            public boolean hasSessionCounters() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasSessionCounters();
            }

            public boolean hasStaticDeviceInfo() {
                return ((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasStaticDeviceInfo();
            }

            public Builder mergeCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                OperativeEventRequest.access$3300((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, campaignState);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                OperativeEventRequest.access$3000((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                OperativeEventRequest.access$2400((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                OperativeEventRequest.access$2700((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                OperativeEventRequest.access$3600((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i) {
                copyOnWrite();
                OperativeEventRequest.access$3500((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setAdditionalData(ByteString byteString) {
                copyOnWrite();
                OperativeEventRequest.access$1800((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState campaignState) {
                copyOnWrite();
                OperativeEventRequest.access$3200((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, campaignState);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                OperativeEventRequest.access$2900((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder setEventId(ByteString byteString) {
                copyOnWrite();
                OperativeEventRequest.access$900((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setEventType(OperativeEventType operativeEventType) {
                copyOnWrite();
                OperativeEventRequest.access$1200((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, operativeEventType);
                return this;
            }

            public Builder setEventTypeValue(int i) {
                copyOnWrite();
                OperativeEventRequest.access$1100((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                OperativeEventRequest.access$1400((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                OperativeEventRequest.access$2300((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder setSid(String str) {
                copyOnWrite();
                OperativeEventRequest.access$2000((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setSidBytes(ByteString byteString) {
                copyOnWrite();
                OperativeEventRequest.access$2200((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                OperativeEventRequest.access$2600((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString) {
                copyOnWrite();
                OperativeEventRequest.access$1600((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(OperativeEventRequest.access$800());
            }

            public Builder setCampaignState(CampaignStateOuterClass.CampaignState.Builder builder) {
                copyOnWrite();
                OperativeEventRequest.access$3200((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, (CampaignStateOuterClass.CampaignState) builder.build());
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                OperativeEventRequest.access$2900((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) builder.build());
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                OperativeEventRequest.access$2300((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, (SessionCountersOuterClass.SessionCounters) builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                OperativeEventRequest.access$2600((OperativeEventRequest) ((GeneratedMessageLite.Builder) this).instance, (StaticDeviceInfoOuterClass.StaticDeviceInfo) builder.build());
                return this;
            }
        }

        static {
            OperativeEventRequest operativeEventRequest = new OperativeEventRequest();
            DEFAULT_INSTANCE = operativeEventRequest;
            GeneratedMessageLite.registerDefaultInstance(OperativeEventRequest.class, operativeEventRequest);
        }

        private OperativeEventRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.eventId_ = byteString;
            this.impressionOpportunityId_ = byteString;
            this.trackingToken_ = byteString;
            this.additionalData_ = byteString;
            this.sid_ = "";
        }

        public static /* synthetic */ void access$1000(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearEventId();
        }

        public static /* synthetic */ void access$1100(OperativeEventRequest operativeEventRequest, int i) {
            operativeEventRequest.setEventTypeValue(i);
        }

        public static /* synthetic */ void access$1200(OperativeEventRequest operativeEventRequest, OperativeEventType operativeEventType) {
            operativeEventRequest.setEventType(operativeEventType);
        }

        public static /* synthetic */ void access$1300(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearEventType();
        }

        public static /* synthetic */ void access$1400(OperativeEventRequest operativeEventRequest, ByteString byteString) {
            operativeEventRequest.setImpressionOpportunityId(byteString);
        }

        public static /* synthetic */ void access$1500(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearImpressionOpportunityId();
        }

        public static /* synthetic */ void access$1600(OperativeEventRequest operativeEventRequest, ByteString byteString) {
            operativeEventRequest.setTrackingToken(byteString);
        }

        public static /* synthetic */ void access$1700(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearTrackingToken();
        }

        public static /* synthetic */ void access$1800(OperativeEventRequest operativeEventRequest, ByteString byteString) {
            operativeEventRequest.setAdditionalData(byteString);
        }

        public static /* synthetic */ void access$1900(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearAdditionalData();
        }

        public static /* synthetic */ void access$2000(OperativeEventRequest operativeEventRequest, String str) {
            operativeEventRequest.setSid(str);
        }

        public static /* synthetic */ void access$2100(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearSid();
        }

        public static /* synthetic */ void access$2200(OperativeEventRequest operativeEventRequest, ByteString byteString) {
            operativeEventRequest.setSidBytes(byteString);
        }

        public static /* synthetic */ void access$2300(OperativeEventRequest operativeEventRequest, SessionCountersOuterClass.SessionCounters sessionCounters) {
            operativeEventRequest.setSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$2400(OperativeEventRequest operativeEventRequest, SessionCountersOuterClass.SessionCounters sessionCounters) {
            operativeEventRequest.mergeSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$2500(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearSessionCounters();
        }

        public static /* synthetic */ void access$2600(OperativeEventRequest operativeEventRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            operativeEventRequest.setStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$2700(OperativeEventRequest operativeEventRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            operativeEventRequest.mergeStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$2800(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearStaticDeviceInfo();
        }

        public static /* synthetic */ void access$2900(OperativeEventRequest operativeEventRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            operativeEventRequest.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$3000(OperativeEventRequest operativeEventRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            operativeEventRequest.mergeDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$3100(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearDynamicDeviceInfo();
        }

        public static /* synthetic */ void access$3200(OperativeEventRequest operativeEventRequest, CampaignStateOuterClass.CampaignState campaignState) {
            operativeEventRequest.setCampaignState(campaignState);
        }

        public static /* synthetic */ void access$3300(OperativeEventRequest operativeEventRequest, CampaignStateOuterClass.CampaignState campaignState) {
            operativeEventRequest.mergeCampaignState(campaignState);
        }

        public static /* synthetic */ void access$3400(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearCampaignState();
        }

        public static /* synthetic */ void access$3500(OperativeEventRequest operativeEventRequest, int i) {
            operativeEventRequest.setAdFormatValue(i);
        }

        public static /* synthetic */ void access$3600(OperativeEventRequest operativeEventRequest, AdFormatOuterClass.AdFormat adFormat) {
            operativeEventRequest.setAdFormat(adFormat);
        }

        public static /* synthetic */ void access$3700(OperativeEventRequest operativeEventRequest) {
            operativeEventRequest.clearAdFormat();
        }

        public static /* synthetic */ OperativeEventRequest access$800() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$900(OperativeEventRequest operativeEventRequest, ByteString byteString) {
            operativeEventRequest.setEventId(byteString);
        }

        private void clearAdFormat() {
            this.bitField0_ &= -17;
            this.adFormat_ = 0;
        }

        private void clearAdditionalData() {
            this.additionalData_ = getDefaultInstance().getAdditionalData();
        }

        private void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= -9;
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -5;
        }

        private void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        private void clearEventType() {
            this.eventType_ = 0;
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        private void clearSid() {
            this.sid_ = getDefaultInstance().getSid();
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        public static OperativeEventRequest getDefaultInstance() {
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

        public static OperativeEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperativeEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 16;
        }

        private void setAdFormatValue(int i) {
            this.bitField0_ |= 16;
            this.adFormat_ = i;
        }

        private void setAdditionalData(ByteString byteString) {
            byteString.getClass();
            this.additionalData_ = byteString;
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

        private void setEventId(ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        private void setEventType(OperativeEventType operativeEventType) {
            this.eventType_ = operativeEventType.getNumber();
        }

        private void setEventTypeValue(int i) {
            this.eventType_ = i;
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

        private void setSid(String str) {
            str.getClass();
            this.sid_ = str;
        }

        private void setSidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sid_ = byteString.toStringUtf8();
        }

        private void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 2;
        }

        private void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OperativeEventRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\n\u0002\f\u0003\n\u0004\n\u0005\n\u0006Ȉ\u0007ဉ\u0000\bဉ\u0001\tဉ\u0002\nဉ\u0003\u000bဌ\u0004", new Object[]{"bitField0_", "eventId_", "eventType_", "impressionOpportunityId_", "trackingToken_", "additionalData_", "sid_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "campaignState_", "adFormat_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (OperativeEventRequest.class) {
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

        public AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat forNumber = AdFormatOuterClass.AdFormat.forNumber(this.adFormat_);
            return forNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
        }

        public int getAdFormatValue() {
            return this.adFormat_;
        }

        public ByteString getAdditionalData() {
            return this.additionalData_;
        }

        public CampaignStateOuterClass.CampaignState getCampaignState() {
            CampaignStateOuterClass.CampaignState campaignState = this.campaignState_;
            return campaignState == null ? CampaignStateOuterClass.CampaignState.getDefaultInstance() : campaignState;
        }

        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        public ByteString getEventId() {
            return this.eventId_;
        }

        public OperativeEventType getEventType() {
            OperativeEventType forNumber = OperativeEventType.forNumber(this.eventType_);
            return forNumber == null ? OperativeEventType.UNRECOGNIZED : forNumber;
        }

        public int getEventTypeValue() {
            return this.eventType_;
        }

        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        public String getSid() {
            return this.sid_;
        }

        public ByteString getSidBytes() {
            return ByteString.copyFromUtf8(this.sid_);
        }

        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        public boolean hasAdFormat() {
            return (this.bitField0_ & 16) != 0;
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

        public static Builder newBuilder(OperativeEventRequest operativeEventRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(operativeEventRequest);
        }

        public static OperativeEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OperativeEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OperativeEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OperativeEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OperativeEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OperativeEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (OperativeEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface OperativeEventRequestOrBuilder extends MessageLiteOrBuilder {
        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        ByteString getAdditionalData();

        CampaignStateOuterClass.CampaignState getCampaignState();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        ByteString getEventId();

        OperativeEventType getEventType();

        int getEventTypeValue();

        ByteString getImpressionOpportunityId();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        String getSid();

        ByteString getSidBytes();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTrackingToken();

        boolean hasAdFormat();

        boolean hasCampaignState();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();
    }

    public enum OperativeEventType implements Internal.EnumLite {
        OPERATIVE_EVENT_TYPE_UNSPECIFIED(0),
        OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER(1),
        OPERATIVE_EVENT_TYPE_LOAD_ERROR(2),
        OPERATIVE_EVENT_TYPE_SHOW_ERROR(3),
        UNRECOGNIZED(-1);

        public static final int OPERATIVE_EVENT_TYPE_LOAD_ERROR_VALUE = 2;
        public static final int OPERATIVE_EVENT_TYPE_SHOW_ERROR_VALUE = 3;
        public static final int OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER_VALUE = 1;
        public static final int OPERATIVE_EVENT_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public OperativeEventType findValueByNumber(int i) {
                return OperativeEventType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return OperativeEventType.forNumber(i) != null;
            }
        }

        OperativeEventType(int i) {
            this.value = i;
        }

        public static OperativeEventType forNumber(int i) {
            if (i == 0) {
                return OPERATIVE_EVENT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
            }
            if (i == 2) {
                return OPERATIVE_EVENT_TYPE_LOAD_ERROR;
            }
            if (i != 3) {
                return null;
            }
            return OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static OperativeEventType valueOf(int i) {
            return forNumber(i);
        }
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

    private OperativeEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
