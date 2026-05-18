package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AudienceManagementResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UniversalResponseOuterClass {

    public static final class UniversalResponse extends GeneratedMessageLite implements UniversalResponseOrBuilder {
        private static final UniversalResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int MUTABLE_DATA_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private MutableDataOuterClass.MutableData mutableData_;
        private Payload payload_;

        public static final class Builder extends GeneratedMessageLite.Builder implements UniversalResponseOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearError() {
                copyOnWrite();
                UniversalResponse.access$3000((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMutableData() {
                copyOnWrite();
                UniversalResponse.access$2700((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                UniversalResponse.access$2400((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ErrorOuterClass.Error getError() {
                return ((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance).getError();
            }

            public MutableDataOuterClass.MutableData getMutableData() {
                return ((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance).getMutableData();
            }

            public Payload getPayload() {
                return ((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance).getPayload();
            }

            public boolean hasError() {
                return ((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance).hasError();
            }

            public boolean hasMutableData() {
                return ((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance).hasMutableData();
            }

            public boolean hasPayload() {
                return ((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance).hasPayload();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                UniversalResponse.access$2900((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            public Builder mergeMutableData(MutableDataOuterClass.MutableData mutableData) {
                copyOnWrite();
                UniversalResponse.access$2600((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance, mutableData);
                return this;
            }

            public Builder mergePayload(Payload payload) {
                copyOnWrite();
                UniversalResponse.access$2300((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance, payload);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                UniversalResponse.access$2800((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            public Builder setMutableData(MutableDataOuterClass.MutableData mutableData) {
                copyOnWrite();
                UniversalResponse.access$2500((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance, mutableData);
                return this;
            }

            public Builder setPayload(Payload payload) {
                copyOnWrite();
                UniversalResponse.access$2200((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance, payload);
                return this;
            }

            private Builder() {
                super(UniversalResponse.access$2100());
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                UniversalResponse.access$2800((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance, (ErrorOuterClass.Error) builder.build());
                return this;
            }

            public Builder setMutableData(MutableDataOuterClass.MutableData.Builder builder) {
                copyOnWrite();
                UniversalResponse.access$2500((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance, (MutableDataOuterClass.MutableData) builder.build());
                return this;
            }

            public Builder setPayload(Payload.Builder builder) {
                copyOnWrite();
                UniversalResponse.access$2200((UniversalResponse) ((GeneratedMessageLite.Builder) this).instance, (Payload) builder.build());
                return this;
            }
        }

        public static final class Payload extends GeneratedMessageLite implements PayloadOrBuilder {
            public static final int AD_DATA_REFRESH_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_PLAYER_CONFIG_RESPONSE_FIELD_NUMBER = 3;
            public static final int AD_RESPONSE_FIELD_NUMBER = 2;
            public static final int AUDIENCE_MANAGEMENT_RESPONSE_FIELD_NUMBER = 6;
            private static final Payload DEFAULT_INSTANCE;
            public static final int INITIALIZATION_RESPONSE_FIELD_NUMBER = 1;
            private static volatile Parser PARSER = null;
            public static final int PRIVACY_UPDATE_RESPONSE_FIELD_NUMBER = 5;
            private int valueCase_ = 0;
            private Object value_;

            public static final class Builder extends GeneratedMessageLite.Builder implements PayloadOrBuilder {
                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                public Builder clearAdDataRefreshResponse() {
                    copyOnWrite();
                    Payload.access$1300((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearAdPlayerConfigResponse() {
                    copyOnWrite();
                    Payload.access$1000((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearAdResponse() {
                    copyOnWrite();
                    Payload.access$700((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearAudienceManagementResponse() {
                    copyOnWrite();
                    Payload.access$1900((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearInitializationResponse() {
                    copyOnWrite();
                    Payload.access$400((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearPrivacyUpdateResponse() {
                    copyOnWrite();
                    Payload.access$1600((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    Payload.access$100((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getAdDataRefreshResponse();
                }

                public AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getAdPlayerConfigResponse();
                }

                public AdResponseOuterClass.AdResponse getAdResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getAdResponse();
                }

                public AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getAudienceManagementResponse();
                }

                public InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getInitializationResponse();
                }

                public PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getPrivacyUpdateResponse();
                }

                public ValueCase getValueCase() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getValueCase();
                }

                public boolean hasAdDataRefreshResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasAdDataRefreshResponse();
                }

                public boolean hasAdPlayerConfigResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasAdPlayerConfigResponse();
                }

                public boolean hasAdResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasAdResponse();
                }

                public boolean hasAudienceManagementResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasAudienceManagementResponse();
                }

                public boolean hasInitializationResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasInitializationResponse();
                }

                public boolean hasPrivacyUpdateResponse() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasPrivacyUpdateResponse();
                }

                public Builder mergeAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    copyOnWrite();
                    Payload.access$1200((Payload) ((GeneratedMessageLite.Builder) this).instance, adDataRefreshResponse);
                    return this;
                }

                public Builder mergeAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    copyOnWrite();
                    Payload.access$900((Payload) ((GeneratedMessageLite.Builder) this).instance, adPlayerConfigResponse);
                    return this;
                }

                public Builder mergeAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                    copyOnWrite();
                    Payload.access$600((Payload) ((GeneratedMessageLite.Builder) this).instance, adResponse);
                    return this;
                }

                public Builder mergeAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                    copyOnWrite();
                    Payload.access$1800((Payload) ((GeneratedMessageLite.Builder) this).instance, audienceManagementResponse);
                    return this;
                }

                public Builder mergeInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    copyOnWrite();
                    Payload.access$300((Payload) ((GeneratedMessageLite.Builder) this).instance, initializationResponse);
                    return this;
                }

                public Builder mergePrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    copyOnWrite();
                    Payload.access$1500((Payload) ((GeneratedMessageLite.Builder) this).instance, privacyUpdateResponse);
                    return this;
                }

                public Builder setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                    copyOnWrite();
                    Payload.access$1100((Payload) ((GeneratedMessageLite.Builder) this).instance, adDataRefreshResponse);
                    return this;
                }

                public Builder setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                    copyOnWrite();
                    Payload.access$800((Payload) ((GeneratedMessageLite.Builder) this).instance, adPlayerConfigResponse);
                    return this;
                }

                public Builder setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                    copyOnWrite();
                    Payload.access$500((Payload) ((GeneratedMessageLite.Builder) this).instance, adResponse);
                    return this;
                }

                public Builder setAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                    copyOnWrite();
                    Payload.access$1700((Payload) ((GeneratedMessageLite.Builder) this).instance, audienceManagementResponse);
                    return this;
                }

                public Builder setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                    copyOnWrite();
                    Payload.access$200((Payload) ((GeneratedMessageLite.Builder) this).instance, initializationResponse);
                    return this;
                }

                public Builder setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                    copyOnWrite();
                    Payload.access$1400((Payload) ((GeneratedMessageLite.Builder) this).instance, privacyUpdateResponse);
                    return this;
                }

                private Builder() {
                    super(Payload.access$000());
                }

                public Builder setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder) {
                    copyOnWrite();
                    Payload.access$1100((Payload) ((GeneratedMessageLite.Builder) this).instance, (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) builder.build());
                    return this;
                }

                public Builder setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder) {
                    copyOnWrite();
                    Payload.access$800((Payload) ((GeneratedMessageLite.Builder) this).instance, (AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse) builder.build());
                    return this;
                }

                public Builder setAdResponse(AdResponseOuterClass.AdResponse.Builder builder) {
                    copyOnWrite();
                    Payload.access$500((Payload) ((GeneratedMessageLite.Builder) this).instance, (AdResponseOuterClass.AdResponse) builder.build());
                    return this;
                }

                public Builder setAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
                    copyOnWrite();
                    Payload.access$1700((Payload) ((GeneratedMessageLite.Builder) this).instance, (AudienceManagementResponseOuterClass.AudienceManagementResponse) builder.build());
                    return this;
                }

                public Builder setInitializationResponse(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                    copyOnWrite();
                    Payload.access$200((Payload) ((GeneratedMessageLite.Builder) this).instance, (InitializationResponseOuterClass.InitializationResponse) builder.build());
                    return this;
                }

                public Builder setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                    copyOnWrite();
                    Payload.access$1400((Payload) ((GeneratedMessageLite.Builder) this).instance, (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) builder.build());
                    return this;
                }
            }

            public enum ValueCase {
                INITIALIZATION_RESPONSE(1),
                AD_RESPONSE(2),
                AD_PLAYER_CONFIG_RESPONSE(3),
                AD_DATA_REFRESH_RESPONSE(4),
                PRIVACY_UPDATE_RESPONSE(5),
                AUDIENCE_MANAGEMENT_RESPONSE(6),
                VALUE_NOT_SET(0);

                private final int value;

                ValueCase(int i) {
                    this.value = i;
                }

                public static ValueCase forNumber(int i) {
                    switch (i) {
                        case 0:
                            return VALUE_NOT_SET;
                        case 1:
                            return INITIALIZATION_RESPONSE;
                        case 2:
                            return AD_RESPONSE;
                        case 3:
                            return AD_PLAYER_CONFIG_RESPONSE;
                        case 4:
                            return AD_DATA_REFRESH_RESPONSE;
                        case 5:
                            return PRIVACY_UPDATE_RESPONSE;
                        case 6:
                            return AUDIENCE_MANAGEMENT_RESPONSE;
                        default:
                            return null;
                    }
                }

                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static ValueCase valueOf(int i) {
                    return forNumber(i);
                }
            }

            static {
                Payload payload = new Payload();
                DEFAULT_INSTANCE = payload;
                GeneratedMessageLite.registerDefaultInstance(Payload.class, payload);
            }

            private Payload() {
            }

            public static /* synthetic */ Payload access$000() {
                return DEFAULT_INSTANCE;
            }

            public static /* synthetic */ void access$100(Payload payload) {
                payload.clearValue();
            }

            public static /* synthetic */ void access$1000(Payload payload) {
                payload.clearAdPlayerConfigResponse();
            }

            public static /* synthetic */ void access$1100(Payload payload, AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                payload.setAdDataRefreshResponse(adDataRefreshResponse);
            }

            public static /* synthetic */ void access$1200(Payload payload, AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                payload.mergeAdDataRefreshResponse(adDataRefreshResponse);
            }

            public static /* synthetic */ void access$1300(Payload payload) {
                payload.clearAdDataRefreshResponse();
            }

            public static /* synthetic */ void access$1400(Payload payload, PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                payload.setPrivacyUpdateResponse(privacyUpdateResponse);
            }

            public static /* synthetic */ void access$1500(Payload payload, PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                payload.mergePrivacyUpdateResponse(privacyUpdateResponse);
            }

            public static /* synthetic */ void access$1600(Payload payload) {
                payload.clearPrivacyUpdateResponse();
            }

            public static /* synthetic */ void access$1700(Payload payload, AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                payload.setAudienceManagementResponse(audienceManagementResponse);
            }

            public static /* synthetic */ void access$1800(Payload payload, AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                payload.mergeAudienceManagementResponse(audienceManagementResponse);
            }

            public static /* synthetic */ void access$1900(Payload payload) {
                payload.clearAudienceManagementResponse();
            }

            public static /* synthetic */ void access$200(Payload payload, InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                payload.setInitializationResponse(initializationResponse);
            }

            public static /* synthetic */ void access$300(Payload payload, InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                payload.mergeInitializationResponse(initializationResponse);
            }

            public static /* synthetic */ void access$400(Payload payload) {
                payload.clearInitializationResponse();
            }

            public static /* synthetic */ void access$500(Payload payload, AdResponseOuterClass.AdResponse adResponse) {
                payload.setAdResponse(adResponse);
            }

            public static /* synthetic */ void access$600(Payload payload, AdResponseOuterClass.AdResponse adResponse) {
                payload.mergeAdResponse(adResponse);
            }

            public static /* synthetic */ void access$700(Payload payload) {
                payload.clearAdResponse();
            }

            public static /* synthetic */ void access$800(Payload payload, AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                payload.setAdPlayerConfigResponse(adPlayerConfigResponse);
            }

            public static /* synthetic */ void access$900(Payload payload, AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                payload.mergeAdPlayerConfigResponse(adPlayerConfigResponse);
            }

            private void clearAdDataRefreshResponse() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdPlayerConfigResponse() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdResponse() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAudienceManagementResponse() {
                if (this.valueCase_ == 6) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearInitializationResponse() {
                if (this.valueCase_ == 1) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearPrivacyUpdateResponse() {
                if (this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
            }

            public static Payload getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                if (this.valueCase_ != 4 || this.value_ == AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance()) {
                    this.value_ = adDataRefreshResponse;
                } else {
                    this.value_ = ((AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder) AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder((AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.value_).mergeFrom(adDataRefreshResponse)).buildPartial();
                }
                this.valueCase_ = 4;
            }

            private void mergeAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                if (this.valueCase_ != 3 || this.value_ == AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance()) {
                    this.value_ = adPlayerConfigResponse;
                } else {
                    this.value_ = ((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder) AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.newBuilder((AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse) this.value_).mergeFrom(adPlayerConfigResponse)).buildPartial();
                }
                this.valueCase_ = 3;
            }

            private void mergeAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                if (this.valueCase_ != 2 || this.value_ == AdResponseOuterClass.AdResponse.getDefaultInstance()) {
                    this.value_ = adResponse;
                } else {
                    this.value_ = ((AdResponseOuterClass.AdResponse.Builder) AdResponseOuterClass.AdResponse.newBuilder((AdResponseOuterClass.AdResponse) this.value_).mergeFrom(adResponse)).buildPartial();
                }
                this.valueCase_ = 2;
            }

            private void mergeAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                audienceManagementResponse.getClass();
                if (this.valueCase_ != 6 || this.value_ == AudienceManagementResponseOuterClass.AudienceManagementResponse.getDefaultInstance()) {
                    this.value_ = audienceManagementResponse;
                } else {
                    this.value_ = ((AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder) AudienceManagementResponseOuterClass.AudienceManagementResponse.newBuilder((AudienceManagementResponseOuterClass.AudienceManagementResponse) this.value_).mergeFrom(audienceManagementResponse)).buildPartial();
                }
                this.valueCase_ = 6;
            }

            private void mergeInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                if (this.valueCase_ != 1 || this.value_ == InitializationResponseOuterClass.InitializationResponse.getDefaultInstance()) {
                    this.value_ = initializationResponse;
                } else {
                    this.value_ = ((InitializationResponseOuterClass.InitializationResponse.Builder) InitializationResponseOuterClass.InitializationResponse.newBuilder((InitializationResponseOuterClass.InitializationResponse) this.value_).mergeFrom(initializationResponse)).buildPartial();
                }
                this.valueCase_ = 1;
            }

            private void mergePrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                if (this.valueCase_ != 5 || this.value_ == PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance()) {
                    this.value_ = privacyUpdateResponse;
                } else {
                    this.value_ = ((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder) PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) this.value_).mergeFrom(privacyUpdateResponse)).buildPartial();
                }
                this.valueCase_ = 5;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Payload parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAdDataRefreshResponse(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse) {
                adDataRefreshResponse.getClass();
                this.value_ = adDataRefreshResponse;
                this.valueCase_ = 4;
            }

            private void setAdPlayerConfigResponse(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse) {
                adPlayerConfigResponse.getClass();
                this.value_ = adPlayerConfigResponse;
                this.valueCase_ = 3;
            }

            private void setAdResponse(AdResponseOuterClass.AdResponse adResponse) {
                adResponse.getClass();
                this.value_ = adResponse;
                this.valueCase_ = 2;
            }

            private void setAudienceManagementResponse(AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponse) {
                audienceManagementResponse.getClass();
                this.value_ = audienceManagementResponse;
                this.valueCase_ = 6;
            }

            private void setInitializationResponse(InitializationResponseOuterClass.InitializationResponse initializationResponse) {
                initializationResponse.getClass();
                this.value_ = initializationResponse;
                this.valueCase_ = 1;
            }

            private void setPrivacyUpdateResponse(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse) {
                privacyUpdateResponse.getClass();
                this.value_ = privacyUpdateResponse;
                this.valueCase_ = 5;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (a.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Payload();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"value_", "valueCase_", InitializationResponseOuterClass.InitializationResponse.class, AdResponseOuterClass.AdResponse.class, AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.class, AdDataRefreshResponseOuterClass.AdDataRefreshResponse.class, PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.class, AudienceManagementResponseOuterClass.AudienceManagementResponse.class});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (Payload.class) {
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

            public AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse() {
                return this.valueCase_ == 4 ? (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) this.value_ : AdDataRefreshResponseOuterClass.AdDataRefreshResponse.getDefaultInstance();
            }

            public AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse() {
                return this.valueCase_ == 3 ? (AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse) this.value_ : AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.getDefaultInstance();
            }

            public AdResponseOuterClass.AdResponse getAdResponse() {
                return this.valueCase_ == 2 ? (AdResponseOuterClass.AdResponse) this.value_ : AdResponseOuterClass.AdResponse.getDefaultInstance();
            }

            public AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponse() {
                return this.valueCase_ == 6 ? (AudienceManagementResponseOuterClass.AudienceManagementResponse) this.value_ : AudienceManagementResponseOuterClass.AudienceManagementResponse.getDefaultInstance();
            }

            public InitializationResponseOuterClass.InitializationResponse getInitializationResponse() {
                return this.valueCase_ == 1 ? (InitializationResponseOuterClass.InitializationResponse) this.value_ : InitializationResponseOuterClass.InitializationResponse.getDefaultInstance();
            }

            public PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse() {
                return this.valueCase_ == 5 ? (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) this.value_ : PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.getDefaultInstance();
            }

            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            public boolean hasAdDataRefreshResponse() {
                return this.valueCase_ == 4;
            }

            public boolean hasAdPlayerConfigResponse() {
                return this.valueCase_ == 3;
            }

            public boolean hasAdResponse() {
                return this.valueCase_ == 2;
            }

            public boolean hasAudienceManagementResponse() {
                return this.valueCase_ == 6;
            }

            public boolean hasInitializationResponse() {
                return this.valueCase_ == 1;
            }

            public boolean hasPrivacyUpdateResponse() {
                return this.valueCase_ == 5;
            }

            public static Builder newBuilder(Payload payload) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(payload);
            }

            public static Payload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Payload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Payload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Payload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Payload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Payload parseFrom(InputStream inputStream) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Payload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Payload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public interface PayloadOrBuilder extends MessageLiteOrBuilder {
            AdDataRefreshResponseOuterClass.AdDataRefreshResponse getAdDataRefreshResponse();

            AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse getAdPlayerConfigResponse();

            AdResponseOuterClass.AdResponse getAdResponse();

            AudienceManagementResponseOuterClass.AudienceManagementResponse getAudienceManagementResponse();

            InitializationResponseOuterClass.InitializationResponse getInitializationResponse();

            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse getPrivacyUpdateResponse();

            Payload.ValueCase getValueCase();

            boolean hasAdDataRefreshResponse();

            boolean hasAdPlayerConfigResponse();

            boolean hasAdResponse();

            boolean hasAudienceManagementResponse();

            boolean hasInitializationResponse();

            boolean hasPrivacyUpdateResponse();
        }

        static {
            UniversalResponse universalResponse = new UniversalResponse();
            DEFAULT_INSTANCE = universalResponse;
            GeneratedMessageLite.registerDefaultInstance(UniversalResponse.class, universalResponse);
        }

        private UniversalResponse() {
        }

        public static /* synthetic */ UniversalResponse access$2100() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$2200(UniversalResponse universalResponse, Payload payload) {
            universalResponse.setPayload(payload);
        }

        public static /* synthetic */ void access$2300(UniversalResponse universalResponse, Payload payload) {
            universalResponse.mergePayload(payload);
        }

        public static /* synthetic */ void access$2400(UniversalResponse universalResponse) {
            universalResponse.clearPayload();
        }

        public static /* synthetic */ void access$2500(UniversalResponse universalResponse, MutableDataOuterClass.MutableData mutableData) {
            universalResponse.setMutableData(mutableData);
        }

        public static /* synthetic */ void access$2600(UniversalResponse universalResponse, MutableDataOuterClass.MutableData mutableData) {
            universalResponse.mergeMutableData(mutableData);
        }

        public static /* synthetic */ void access$2700(UniversalResponse universalResponse) {
            universalResponse.clearMutableData();
        }

        public static /* synthetic */ void access$2800(UniversalResponse universalResponse, ErrorOuterClass.Error error) {
            universalResponse.setError(error);
        }

        public static /* synthetic */ void access$2900(UniversalResponse universalResponse, ErrorOuterClass.Error error) {
            universalResponse.mergeError(error);
        }

        public static /* synthetic */ void access$3000(UniversalResponse universalResponse) {
            universalResponse.clearError();
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -5;
        }

        private void clearMutableData() {
            this.mutableData_ = null;
            this.bitField0_ &= -3;
        }

        private void clearPayload() {
            this.payload_ = null;
            this.bitField0_ &= -2;
        }

        public static UniversalResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeError(ErrorOuterClass.Error error) {
            error.getClass();
            ErrorOuterClass.Error error2 = this.error_;
            if (error2 == null || error2 == ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = error;
            } else {
                this.error_ = (ErrorOuterClass.Error) ((ErrorOuterClass.Error.Builder) ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom(error)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeMutableData(MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            MutableDataOuterClass.MutableData mutableData2 = this.mutableData_;
            if (mutableData2 == null || mutableData2 == MutableDataOuterClass.MutableData.getDefaultInstance()) {
                this.mutableData_ = mutableData;
            } else {
                this.mutableData_ = (MutableDataOuterClass.MutableData) ((MutableDataOuterClass.MutableData.Builder) MutableDataOuterClass.MutableData.newBuilder(this.mutableData_).mergeFrom(mutableData)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergePayload(Payload payload) {
            payload.getClass();
            Payload payload2 = this.payload_;
            if (payload2 == null || payload2 == Payload.getDefaultInstance()) {
                this.payload_ = payload;
            } else {
                this.payload_ = (Payload) ((Payload.Builder) Payload.newBuilder(this.payload_).mergeFrom(payload)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 4;
        }

        private void setMutableData(MutableDataOuterClass.MutableData mutableData) {
            mutableData.getClass();
            this.mutableData_ = mutableData;
            this.bitField0_ |= 2;
        }

        private void setPayload(Payload payload) {
            payload.getClass();
            this.payload_ = payload;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new UniversalResponse();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "payload_", "mutableData_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (UniversalResponse.class) {
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

        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            return error == null ? ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        public MutableDataOuterClass.MutableData getMutableData() {
            MutableDataOuterClass.MutableData mutableData = this.mutableData_;
            return mutableData == null ? MutableDataOuterClass.MutableData.getDefaultInstance() : mutableData;
        }

        public Payload getPayload() {
            Payload payload = this.payload_;
            return payload == null ? Payload.getDefaultInstance() : payload;
        }

        public boolean hasError() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMutableData() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPayload() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(UniversalResponse universalResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(universalResponse);
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UniversalResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UniversalResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(InputStream inputStream) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface UniversalResponseOrBuilder extends MessageLiteOrBuilder {
        ErrorOuterClass.Error getError();

        MutableDataOuterClass.MutableData getMutableData();

        UniversalResponse.Payload getPayload();

        boolean hasError();

        boolean hasMutableData();

        boolean hasPayload();
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

    private UniversalResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
