package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AudienceManagementRequestOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TimestampsOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UniversalRequestOuterClass {

    public static final class LimitedSessionToken extends GeneratedMessageLite implements LimitedSessionTokenOrBuilder {
        public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 11;
        private static final LimitedSessionToken DEFAULT_INSTANCE;
        public static final int DEVICE_MAKE_FIELD_NUMBER = 1;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 2;
        public static final int GAME_ID_FIELD_NUMBER = 8;
        public static final int IDFI_FIELD_NUMBER = 4;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 10;
        public static final int MEDIATION_VERSION_FIELD_NUMBER = 12;
        public static final int OS_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 9;
        public static final int SDK_VERSION_FIELD_NUMBER = 5;
        public static final int SDK_VERSION_NAME_FIELD_NUMBER = 7;
        public static final int SESSION_ID_FIELD_NUMBER = 13;
        private int bitField0_;
        private int mediationProvider_;
        private int platform_;
        private int sdkVersion_;
        private String deviceMake_ = "";
        private String deviceModel_ = "";
        private String osVersion_ = "";
        private String idfi_ = "";
        private String sdkVersionName_ = "";
        private String gameId_ = "";
        private String customMediationName_ = "";
        private String mediationVersion_ = "";
        private ByteString sessionId_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.Builder implements LimitedSessionTokenOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearCustomMediationName() {
                copyOnWrite();
                LimitedSessionToken.access$2800((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDeviceMake() {
                copyOnWrite();
                LimitedSessionToken.access$200((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                LimitedSessionToken.access$500((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearGameId() {
                copyOnWrite();
                LimitedSessionToken.access$1900((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearIdfi() {
                copyOnWrite();
                LimitedSessionToken.access$1100((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationProvider() {
                copyOnWrite();
                LimitedSessionToken.access$2600((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationVersion() {
                copyOnWrite();
                LimitedSessionToken.access$3100((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                LimitedSessionToken.access$800((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                LimitedSessionToken.access$2300((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSdkVersion() {
                copyOnWrite();
                LimitedSessionToken.access$1400((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSdkVersionName() {
                copyOnWrite();
                LimitedSessionToken.access$1600((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                LimitedSessionToken.access$3400((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public String getCustomMediationName() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getCustomMediationName();
            }

            public ByteString getCustomMediationNameBytes() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getCustomMediationNameBytes();
            }

            public String getDeviceMake() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getDeviceMake();
            }

            public ByteString getDeviceMakeBytes() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getDeviceMakeBytes();
            }

            public String getDeviceModel() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getDeviceModel();
            }

            public ByteString getDeviceModelBytes() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getDeviceModelBytes();
            }

            public String getGameId() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getGameId();
            }

            public ByteString getGameIdBytes() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getGameIdBytes();
            }

            public String getIdfi() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getIdfi();
            }

            public ByteString getIdfiBytes() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getIdfiBytes();
            }

            public ClientInfoOuterClass.MediationProvider getMediationProvider() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getMediationProvider();
            }

            public int getMediationProviderValue() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getMediationProviderValue();
            }

            public String getMediationVersion() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getMediationVersion();
            }

            public ByteString getMediationVersionBytes() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getMediationVersionBytes();
            }

            public String getOsVersion() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getOsVersion();
            }

            public ByteString getOsVersionBytes() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getOsVersionBytes();
            }

            public ClientInfoOuterClass.Platform getPlatform() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getPlatform();
            }

            public int getPlatformValue() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getPlatformValue();
            }

            public int getSdkVersion() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getSdkVersion();
            }

            public String getSdkVersionName() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getSdkVersionName();
            }

            public ByteString getSdkVersionNameBytes() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getSdkVersionNameBytes();
            }

            public ByteString getSessionId() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).getSessionId();
            }

            public boolean hasCustomMediationName() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).hasCustomMediationName();
            }

            public boolean hasMediationVersion() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).hasMediationVersion();
            }

            public boolean hasSessionId() {
                return ((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance).hasSessionId();
            }

            public Builder setCustomMediationName(String str) {
                copyOnWrite();
                LimitedSessionToken.access$2700((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setCustomMediationNameBytes(ByteString byteString) {
                copyOnWrite();
                LimitedSessionToken.access$2900((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setDeviceMake(String str) {
                copyOnWrite();
                LimitedSessionToken.access$100((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setDeviceMakeBytes(ByteString byteString) {
                copyOnWrite();
                LimitedSessionToken.access$300((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                LimitedSessionToken.access$400((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                copyOnWrite();
                LimitedSessionToken.access$600((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setGameId(String str) {
                copyOnWrite();
                LimitedSessionToken.access$1800((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString) {
                copyOnWrite();
                LimitedSessionToken.access$2000((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setIdfi(String str) {
                copyOnWrite();
                LimitedSessionToken.access$1000((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setIdfiBytes(ByteString byteString) {
                copyOnWrite();
                LimitedSessionToken.access$1200((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
                copyOnWrite();
                LimitedSessionToken.access$2500((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, mediationProvider);
                return this;
            }

            public Builder setMediationProviderValue(int i) {
                copyOnWrite();
                LimitedSessionToken.access$2400((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setMediationVersion(String str) {
                copyOnWrite();
                LimitedSessionToken.access$3000((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setMediationVersionBytes(ByteString byteString) {
                copyOnWrite();
                LimitedSessionToken.access$3200((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                LimitedSessionToken.access$700((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setOsVersionBytes(ByteString byteString) {
                copyOnWrite();
                LimitedSessionToken.access$900((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setPlatform(ClientInfoOuterClass.Platform platform) {
                copyOnWrite();
                LimitedSessionToken.access$2200((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, platform);
                return this;
            }

            public Builder setPlatformValue(int i) {
                copyOnWrite();
                LimitedSessionToken.access$2100((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setSdkVersion(int i) {
                copyOnWrite();
                LimitedSessionToken.access$1300((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setSdkVersionName(String str) {
                copyOnWrite();
                LimitedSessionToken.access$1500((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setSdkVersionNameBytes(ByteString byteString) {
                copyOnWrite();
                LimitedSessionToken.access$1700((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSessionId(ByteString byteString) {
                copyOnWrite();
                LimitedSessionToken.access$3300((LimitedSessionToken) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(LimitedSessionToken.access$000());
            }
        }

        static {
            LimitedSessionToken limitedSessionToken = new LimitedSessionToken();
            DEFAULT_INSTANCE = limitedSessionToken;
            GeneratedMessageLite.registerDefaultInstance(LimitedSessionToken.class, limitedSessionToken);
        }

        private LimitedSessionToken() {
        }

        public static /* synthetic */ LimitedSessionToken access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(LimitedSessionToken limitedSessionToken, String str) {
            limitedSessionToken.setDeviceMake(str);
        }

        public static /* synthetic */ void access$1000(LimitedSessionToken limitedSessionToken, String str) {
            limitedSessionToken.setIdfi(str);
        }

        public static /* synthetic */ void access$1100(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearIdfi();
        }

        public static /* synthetic */ void access$1200(LimitedSessionToken limitedSessionToken, ByteString byteString) {
            limitedSessionToken.setIdfiBytes(byteString);
        }

        public static /* synthetic */ void access$1300(LimitedSessionToken limitedSessionToken, int i) {
            limitedSessionToken.setSdkVersion(i);
        }

        public static /* synthetic */ void access$1400(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearSdkVersion();
        }

        public static /* synthetic */ void access$1500(LimitedSessionToken limitedSessionToken, String str) {
            limitedSessionToken.setSdkVersionName(str);
        }

        public static /* synthetic */ void access$1600(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearSdkVersionName();
        }

        public static /* synthetic */ void access$1700(LimitedSessionToken limitedSessionToken, ByteString byteString) {
            limitedSessionToken.setSdkVersionNameBytes(byteString);
        }

        public static /* synthetic */ void access$1800(LimitedSessionToken limitedSessionToken, String str) {
            limitedSessionToken.setGameId(str);
        }

        public static /* synthetic */ void access$1900(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearGameId();
        }

        public static /* synthetic */ void access$200(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearDeviceMake();
        }

        public static /* synthetic */ void access$2000(LimitedSessionToken limitedSessionToken, ByteString byteString) {
            limitedSessionToken.setGameIdBytes(byteString);
        }

        public static /* synthetic */ void access$2100(LimitedSessionToken limitedSessionToken, int i) {
            limitedSessionToken.setPlatformValue(i);
        }

        public static /* synthetic */ void access$2200(LimitedSessionToken limitedSessionToken, ClientInfoOuterClass.Platform platform) {
            limitedSessionToken.setPlatform(platform);
        }

        public static /* synthetic */ void access$2300(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearPlatform();
        }

        public static /* synthetic */ void access$2400(LimitedSessionToken limitedSessionToken, int i) {
            limitedSessionToken.setMediationProviderValue(i);
        }

        public static /* synthetic */ void access$2500(LimitedSessionToken limitedSessionToken, ClientInfoOuterClass.MediationProvider mediationProvider) {
            limitedSessionToken.setMediationProvider(mediationProvider);
        }

        public static /* synthetic */ void access$2600(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearMediationProvider();
        }

        public static /* synthetic */ void access$2700(LimitedSessionToken limitedSessionToken, String str) {
            limitedSessionToken.setCustomMediationName(str);
        }

        public static /* synthetic */ void access$2800(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearCustomMediationName();
        }

        public static /* synthetic */ void access$2900(LimitedSessionToken limitedSessionToken, ByteString byteString) {
            limitedSessionToken.setCustomMediationNameBytes(byteString);
        }

        public static /* synthetic */ void access$300(LimitedSessionToken limitedSessionToken, ByteString byteString) {
            limitedSessionToken.setDeviceMakeBytes(byteString);
        }

        public static /* synthetic */ void access$3000(LimitedSessionToken limitedSessionToken, String str) {
            limitedSessionToken.setMediationVersion(str);
        }

        public static /* synthetic */ void access$3100(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearMediationVersion();
        }

        public static /* synthetic */ void access$3200(LimitedSessionToken limitedSessionToken, ByteString byteString) {
            limitedSessionToken.setMediationVersionBytes(byteString);
        }

        public static /* synthetic */ void access$3300(LimitedSessionToken limitedSessionToken, ByteString byteString) {
            limitedSessionToken.setSessionId(byteString);
        }

        public static /* synthetic */ void access$3400(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearSessionId();
        }

        public static /* synthetic */ void access$400(LimitedSessionToken limitedSessionToken, String str) {
            limitedSessionToken.setDeviceModel(str);
        }

        public static /* synthetic */ void access$500(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearDeviceModel();
        }

        public static /* synthetic */ void access$600(LimitedSessionToken limitedSessionToken, ByteString byteString) {
            limitedSessionToken.setDeviceModelBytes(byteString);
        }

        public static /* synthetic */ void access$700(LimitedSessionToken limitedSessionToken, String str) {
            limitedSessionToken.setOsVersion(str);
        }

        public static /* synthetic */ void access$800(LimitedSessionToken limitedSessionToken) {
            limitedSessionToken.clearOsVersion();
        }

        public static /* synthetic */ void access$900(LimitedSessionToken limitedSessionToken, ByteString byteString) {
            limitedSessionToken.setOsVersionBytes(byteString);
        }

        private void clearCustomMediationName() {
            this.bitField0_ &= -2;
            this.customMediationName_ = getDefaultInstance().getCustomMediationName();
        }

        private void clearDeviceMake() {
            this.deviceMake_ = getDefaultInstance().getDeviceMake();
        }

        private void clearDeviceModel() {
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        private void clearGameId() {
            this.gameId_ = getDefaultInstance().getGameId();
        }

        private void clearIdfi() {
            this.idfi_ = getDefaultInstance().getIdfi();
        }

        private void clearMediationProvider() {
            this.mediationProvider_ = 0;
        }

        private void clearMediationVersion() {
            this.bitField0_ &= -3;
            this.mediationVersion_ = getDefaultInstance().getMediationVersion();
        }

        private void clearOsVersion() {
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        private void clearPlatform() {
            this.platform_ = 0;
        }

        private void clearSdkVersion() {
            this.sdkVersion_ = 0;
        }

        private void clearSdkVersionName() {
            this.sdkVersionName_ = getDefaultInstance().getSdkVersionName();
        }

        private void clearSessionId() {
            this.bitField0_ &= -5;
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static LimitedSessionToken getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LimitedSessionToken parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LimitedSessionToken parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCustomMediationName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customMediationName_ = str;
        }

        private void setCustomMediationNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customMediationName_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setDeviceMake(String str) {
            str.getClass();
            this.deviceMake_ = str;
        }

        private void setDeviceMakeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceMake_ = byteString.toStringUtf8();
        }

        private void setDeviceModel(String str) {
            str.getClass();
            this.deviceModel_ = str;
        }

        private void setDeviceModelBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString.toStringUtf8();
        }

        private void setGameId(String str) {
            str.getClass();
            this.gameId_ = str;
        }

        private void setGameIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.gameId_ = byteString.toStringUtf8();
        }

        private void setIdfi(String str) {
            str.getClass();
            this.idfi_ = str;
        }

        private void setIdfiBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.idfi_ = byteString.toStringUtf8();
        }

        private void setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            this.mediationProvider_ = mediationProvider.getNumber();
        }

        private void setMediationProviderValue(int i) {
            this.mediationProvider_ = i;
        }

        private void setMediationVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.mediationVersion_ = str;
        }

        private void setMediationVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mediationVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
        }

        private void setOsVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString.toStringUtf8();
        }

        private void setPlatform(ClientInfoOuterClass.Platform platform) {
            this.platform_ = platform.getNumber();
        }

        private void setPlatformValue(int i) {
            this.platform_ = i;
        }

        private void setSdkVersion(int i) {
            this.sdkVersion_ = i;
        }

        private void setSdkVersionName(String str) {
            str.getClass();
            this.sdkVersionName_ = str;
        }

        private void setSdkVersionNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sdkVersionName_ = byteString.toStringUtf8();
        }

        private void setSessionId(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.sessionId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new LimitedSessionToken();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u000b\u0007Ȉ\bȈ\t\f\n\f\u000bለ\u0000\fለ\u0001\rည\u0002", new Object[]{"bitField0_", "deviceMake_", "deviceModel_", "osVersion_", "idfi_", "sdkVersion_", "sdkVersionName_", "gameId_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_", "sessionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (LimitedSessionToken.class) {
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

        public String getCustomMediationName() {
            return this.customMediationName_;
        }

        public ByteString getCustomMediationNameBytes() {
            return ByteString.copyFromUtf8(this.customMediationName_);
        }

        public String getDeviceMake() {
            return this.deviceMake_;
        }

        public ByteString getDeviceMakeBytes() {
            return ByteString.copyFromUtf8(this.deviceMake_);
        }

        public String getDeviceModel() {
            return this.deviceModel_;
        }

        public ByteString getDeviceModelBytes() {
            return ByteString.copyFromUtf8(this.deviceModel_);
        }

        public String getGameId() {
            return this.gameId_;
        }

        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8(this.gameId_);
        }

        public String getIdfi() {
            return this.idfi_;
        }

        public ByteString getIdfiBytes() {
            return ByteString.copyFromUtf8(this.idfi_);
        }

        public ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider forNumber = ClientInfoOuterClass.MediationProvider.forNumber(this.mediationProvider_);
            return forNumber == null ? ClientInfoOuterClass.MediationProvider.UNRECOGNIZED : forNumber;
        }

        public int getMediationProviderValue() {
            return this.mediationProvider_;
        }

        public String getMediationVersion() {
            return this.mediationVersion_;
        }

        public ByteString getMediationVersionBytes() {
            return ByteString.copyFromUtf8(this.mediationVersion_);
        }

        public String getOsVersion() {
            return this.osVersion_;
        }

        public ByteString getOsVersionBytes() {
            return ByteString.copyFromUtf8(this.osVersion_);
        }

        public ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform forNumber = ClientInfoOuterClass.Platform.forNumber(this.platform_);
            return forNumber == null ? ClientInfoOuterClass.Platform.UNRECOGNIZED : forNumber;
        }

        public int getPlatformValue() {
            return this.platform_;
        }

        public int getSdkVersion() {
            return this.sdkVersion_;
        }

        public String getSdkVersionName() {
            return this.sdkVersionName_;
        }

        public ByteString getSdkVersionNameBytes() {
            return ByteString.copyFromUtf8(this.sdkVersionName_);
        }

        public ByteString getSessionId() {
            return this.sessionId_;
        }

        public boolean hasCustomMediationName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMediationVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(LimitedSessionToken limitedSessionToken) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(limitedSessionToken);
        }

        public static LimitedSessionToken parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static LimitedSessionToken parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static LimitedSessionToken parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(InputStream inputStream) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LimitedSessionToken parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static LimitedSessionToken parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static LimitedSessionToken parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LimitedSessionToken) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface LimitedSessionTokenOrBuilder extends MessageLiteOrBuilder {
        String getCustomMediationName();

        ByteString getCustomMediationNameBytes();

        String getDeviceMake();

        ByteString getDeviceMakeBytes();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getGameId();

        ByteString getGameIdBytes();

        String getIdfi();

        ByteString getIdfiBytes();

        ClientInfoOuterClass.MediationProvider getMediationProvider();

        int getMediationProviderValue();

        String getMediationVersion();

        ByteString getMediationVersionBytes();

        String getOsVersion();

        ByteString getOsVersionBytes();

        ClientInfoOuterClass.Platform getPlatform();

        int getPlatformValue();

        int getSdkVersion();

        String getSdkVersionName();

        ByteString getSdkVersionNameBytes();

        ByteString getSessionId();

        boolean hasCustomMediationName();

        boolean hasMediationVersion();

        boolean hasSessionId();
    }

    public static final class UniversalRequest extends GeneratedMessageLite implements UniversalRequestOrBuilder {
        private static final UniversalRequest DEFAULT_INSTANCE;
        private static volatile Parser PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 2;
        public static final int SHARED_DATA_FIELD_NUMBER = 1;
        private int bitField0_;
        private Payload payload_;
        private SharedData sharedData_;

        public static final class Builder extends GeneratedMessageLite.Builder implements UniversalRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearPayload() {
                copyOnWrite();
                UniversalRequest.access$10700((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSharedData() {
                copyOnWrite();
                UniversalRequest.access$10400((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Payload getPayload() {
                return ((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance).getPayload();
            }

            public SharedData getSharedData() {
                return ((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance).getSharedData();
            }

            public boolean hasPayload() {
                return ((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance).hasPayload();
            }

            public boolean hasSharedData() {
                return ((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance).hasSharedData();
            }

            public Builder mergePayload(Payload payload) {
                copyOnWrite();
                UniversalRequest.access$10600((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance, payload);
                return this;
            }

            public Builder mergeSharedData(SharedData sharedData) {
                copyOnWrite();
                UniversalRequest.access$10300((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance, sharedData);
                return this;
            }

            public Builder setPayload(Payload payload) {
                copyOnWrite();
                UniversalRequest.access$10500((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance, payload);
                return this;
            }

            public Builder setSharedData(SharedData sharedData) {
                copyOnWrite();
                UniversalRequest.access$10200((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance, sharedData);
                return this;
            }

            private Builder() {
                super(UniversalRequest.access$10100());
            }

            public Builder setPayload(Payload.Builder builder) {
                copyOnWrite();
                UniversalRequest.access$10500((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance, (Payload) builder.build());
                return this;
            }

            public Builder setSharedData(SharedData.Builder builder) {
                copyOnWrite();
                UniversalRequest.access$10200((UniversalRequest) ((GeneratedMessageLite.Builder) this).instance, (SharedData) builder.build());
                return this;
            }
        }

        public static final class Payload extends GeneratedMessageLite implements PayloadOrBuilder {
            public static final int AD_DATA_REFRESH_REQUEST_FIELD_NUMBER = 9;
            public static final int AD_PLAYER_CONFIG_REQUEST_FIELD_NUMBER = 6;
            public static final int AD_REQUEST_FIELD_NUMBER = 3;
            public static final int AUDIENCE_MANAGEMENT_REQUEST_FIELD_NUMBER = 12;
            private static final Payload DEFAULT_INSTANCE;
            public static final int DIAGNOSTIC_EVENT_REQUEST_FIELD_NUMBER = 5;
            public static final int GET_TOKEN_EVENT_REQUEST_FIELD_NUMBER = 7;
            public static final int INITIALIZATION_COMPLETED_EVENT_REQUEST_FIELD_NUMBER = 10;
            public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 2;
            public static final int OPERATIVE_EVENT_FIELD_NUMBER = 4;
            private static volatile Parser PARSER = null;
            public static final int PRIVACY_UPDATE_REQUEST_FIELD_NUMBER = 8;
            public static final int TRANSACTION_EVENT_REQUEST_FIELD_NUMBER = 11;
            private int valueCase_ = 0;
            private Object value_;

            public static final class Builder extends GeneratedMessageLite.Builder implements PayloadOrBuilder {
                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                public Builder clearAdDataRefreshRequest() {
                    copyOnWrite();
                    Payload.access$9000((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearAdPlayerConfigRequest() {
                    copyOnWrite();
                    Payload.access$8100((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearAdRequest() {
                    copyOnWrite();
                    Payload.access$7200((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearAudienceManagementRequest() {
                    copyOnWrite();
                    Payload.access$9900((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearDiagnosticEventRequest() {
                    copyOnWrite();
                    Payload.access$7800((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearGetTokenEventRequest() {
                    copyOnWrite();
                    Payload.access$8400((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearInitializationCompletedEventRequest() {
                    copyOnWrite();
                    Payload.access$9300((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearInitializationRequest() {
                    copyOnWrite();
                    Payload.access$6900((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearOperativeEvent() {
                    copyOnWrite();
                    Payload.access$7500((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearPrivacyUpdateRequest() {
                    copyOnWrite();
                    Payload.access$8700((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearTransactionEventRequest() {
                    copyOnWrite();
                    Payload.access$9600((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    Payload.access$6600((Payload) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getAdDataRefreshRequest();
                }

                public AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getAdPlayerConfigRequest();
                }

                public AdRequestOuterClass.AdRequest getAdRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getAdRequest();
                }

                public AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getAudienceManagementRequest();
                }

                public DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getDiagnosticEventRequest();
                }

                public GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getGetTokenEventRequest();
                }

                public InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getInitializationCompletedEventRequest();
                }

                public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getInitializationRequest();
                }

                public OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getOperativeEvent();
                }

                public PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getPrivacyUpdateRequest();
                }

                public TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getTransactionEventRequest();
                }

                public ValueCase getValueCase() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).getValueCase();
                }

                public boolean hasAdDataRefreshRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasAdDataRefreshRequest();
                }

                public boolean hasAdPlayerConfigRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasAdPlayerConfigRequest();
                }

                public boolean hasAdRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasAdRequest();
                }

                public boolean hasAudienceManagementRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasAudienceManagementRequest();
                }

                public boolean hasDiagnosticEventRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasDiagnosticEventRequest();
                }

                public boolean hasGetTokenEventRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasGetTokenEventRequest();
                }

                public boolean hasInitializationCompletedEventRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasInitializationCompletedEventRequest();
                }

                public boolean hasInitializationRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasInitializationRequest();
                }

                public boolean hasOperativeEvent() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasOperativeEvent();
                }

                public boolean hasPrivacyUpdateRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasPrivacyUpdateRequest();
                }

                public boolean hasTransactionEventRequest() {
                    return ((Payload) ((GeneratedMessageLite.Builder) this).instance).hasTransactionEventRequest();
                }

                public Builder mergeAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                    copyOnWrite();
                    Payload.access$8900((Payload) ((GeneratedMessageLite.Builder) this).instance, adDataRefreshRequest);
                    return this;
                }

                public Builder mergeAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                    copyOnWrite();
                    Payload.access$8000((Payload) ((GeneratedMessageLite.Builder) this).instance, adPlayerConfigRequest);
                    return this;
                }

                public Builder mergeAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                    copyOnWrite();
                    Payload.access$7100((Payload) ((GeneratedMessageLite.Builder) this).instance, adRequest);
                    return this;
                }

                public Builder mergeAudienceManagementRequest(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest) {
                    copyOnWrite();
                    Payload.access$9800((Payload) ((GeneratedMessageLite.Builder) this).instance, audienceManagementRequest);
                    return this;
                }

                public Builder mergeDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                    copyOnWrite();
                    Payload.access$7700((Payload) ((GeneratedMessageLite.Builder) this).instance, diagnosticEventRequest);
                    return this;
                }

                public Builder mergeGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                    copyOnWrite();
                    Payload.access$8300((Payload) ((GeneratedMessageLite.Builder) this).instance, getTokenEventRequest);
                    return this;
                }

                public Builder mergeInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                    copyOnWrite();
                    Payload.access$9200((Payload) ((GeneratedMessageLite.Builder) this).instance, initializationCompletedEventRequest);
                    return this;
                }

                public Builder mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                    copyOnWrite();
                    Payload.access$6800((Payload) ((GeneratedMessageLite.Builder) this).instance, initializationRequest);
                    return this;
                }

                public Builder mergeOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                    copyOnWrite();
                    Payload.access$7400((Payload) ((GeneratedMessageLite.Builder) this).instance, operativeEventRequest);
                    return this;
                }

                public Builder mergePrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                    copyOnWrite();
                    Payload.access$8600((Payload) ((GeneratedMessageLite.Builder) this).instance, privacyUpdateRequest);
                    return this;
                }

                public Builder mergeTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                    copyOnWrite();
                    Payload.access$9500((Payload) ((GeneratedMessageLite.Builder) this).instance, transactionEventRequest);
                    return this;
                }

                public Builder setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                    copyOnWrite();
                    Payload.access$8800((Payload) ((GeneratedMessageLite.Builder) this).instance, adDataRefreshRequest);
                    return this;
                }

                public Builder setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                    copyOnWrite();
                    Payload.access$7900((Payload) ((GeneratedMessageLite.Builder) this).instance, adPlayerConfigRequest);
                    return this;
                }

                public Builder setAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                    copyOnWrite();
                    Payload.access$7000((Payload) ((GeneratedMessageLite.Builder) this).instance, adRequest);
                    return this;
                }

                public Builder setAudienceManagementRequest(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest) {
                    copyOnWrite();
                    Payload.access$9700((Payload) ((GeneratedMessageLite.Builder) this).instance, audienceManagementRequest);
                    return this;
                }

                public Builder setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                    copyOnWrite();
                    Payload.access$7600((Payload) ((GeneratedMessageLite.Builder) this).instance, diagnosticEventRequest);
                    return this;
                }

                public Builder setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                    copyOnWrite();
                    Payload.access$8200((Payload) ((GeneratedMessageLite.Builder) this).instance, getTokenEventRequest);
                    return this;
                }

                public Builder setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                    copyOnWrite();
                    Payload.access$9100((Payload) ((GeneratedMessageLite.Builder) this).instance, initializationCompletedEventRequest);
                    return this;
                }

                public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                    copyOnWrite();
                    Payload.access$6700((Payload) ((GeneratedMessageLite.Builder) this).instance, initializationRequest);
                    return this;
                }

                public Builder setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                    copyOnWrite();
                    Payload.access$7300((Payload) ((GeneratedMessageLite.Builder) this).instance, operativeEventRequest);
                    return this;
                }

                public Builder setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                    copyOnWrite();
                    Payload.access$8500((Payload) ((GeneratedMessageLite.Builder) this).instance, privacyUpdateRequest);
                    return this;
                }

                public Builder setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                    copyOnWrite();
                    Payload.access$9400((Payload) ((GeneratedMessageLite.Builder) this).instance, transactionEventRequest);
                    return this;
                }

                private Builder() {
                    super(Payload.access$6500());
                }

                public Builder setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$8800((Payload) ((GeneratedMessageLite.Builder) this).instance, (AdDataRefreshRequestOuterClass.AdDataRefreshRequest) builder.build());
                    return this;
                }

                public Builder setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$7900((Payload) ((GeneratedMessageLite.Builder) this).instance, (AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) builder.build());
                    return this;
                }

                public Builder setAdRequest(AdRequestOuterClass.AdRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$7000((Payload) ((GeneratedMessageLite.Builder) this).instance, (AdRequestOuterClass.AdRequest) builder.build());
                    return this;
                }

                public Builder setAudienceManagementRequest(AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$9700((Payload) ((GeneratedMessageLite.Builder) this).instance, (AudienceManagementRequestOuterClass.AudienceManagementRequest) builder.build());
                    return this;
                }

                public Builder setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$7600((Payload) ((GeneratedMessageLite.Builder) this).instance, (DiagnosticEventRequestOuterClass.DiagnosticEventRequest) builder.build());
                    return this;
                }

                public Builder setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$8200((Payload) ((GeneratedMessageLite.Builder) this).instance, (GetTokenEventRequestOuterClass.GetTokenEventRequest) builder.build());
                    return this;
                }

                public Builder setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$9100((Payload) ((GeneratedMessageLite.Builder) this).instance, (InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest) builder.build());
                    return this;
                }

                public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$6700((Payload) ((GeneratedMessageLite.Builder) this).instance, (InitializationRequestOuterClass.InitializationRequest) builder.build());
                    return this;
                }

                public Builder setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$7300((Payload) ((GeneratedMessageLite.Builder) this).instance, (OperativeEventRequestOuterClass.OperativeEventRequest) builder.build());
                    return this;
                }

                public Builder setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$8500((Payload) ((GeneratedMessageLite.Builder) this).instance, (PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) builder.build());
                    return this;
                }

                public Builder setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                    copyOnWrite();
                    Payload.access$9400((Payload) ((GeneratedMessageLite.Builder) this).instance, (TransactionEventRequestOuterClass.TransactionEventRequest) builder.build());
                    return this;
                }
            }

            public enum ValueCase {
                INITIALIZATION_REQUEST(2),
                AD_REQUEST(3),
                OPERATIVE_EVENT(4),
                DIAGNOSTIC_EVENT_REQUEST(5),
                AD_PLAYER_CONFIG_REQUEST(6),
                GET_TOKEN_EVENT_REQUEST(7),
                PRIVACY_UPDATE_REQUEST(8),
                AD_DATA_REFRESH_REQUEST(9),
                INITIALIZATION_COMPLETED_EVENT_REQUEST(10),
                TRANSACTION_EVENT_REQUEST(11),
                AUDIENCE_MANAGEMENT_REQUEST(12),
                VALUE_NOT_SET(0);

                private final int value;

                ValueCase(int i) {
                    this.value = i;
                }

                public static ValueCase forNumber(int i) {
                    if (i == 0) {
                        return VALUE_NOT_SET;
                    }
                    switch (i) {
                        case 2:
                            return INITIALIZATION_REQUEST;
                        case 3:
                            return AD_REQUEST;
                        case 4:
                            return OPERATIVE_EVENT;
                        case 5:
                            return DIAGNOSTIC_EVENT_REQUEST;
                        case 6:
                            return AD_PLAYER_CONFIG_REQUEST;
                        case 7:
                            return GET_TOKEN_EVENT_REQUEST;
                        case 8:
                            return PRIVACY_UPDATE_REQUEST;
                        case 9:
                            return AD_DATA_REFRESH_REQUEST;
                        case 10:
                            return INITIALIZATION_COMPLETED_EVENT_REQUEST;
                        case 11:
                            return TRANSACTION_EVENT_REQUEST;
                        case 12:
                            return AUDIENCE_MANAGEMENT_REQUEST;
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

            public static /* synthetic */ Payload access$6500() {
                return DEFAULT_INSTANCE;
            }

            public static /* synthetic */ void access$6600(Payload payload) {
                payload.clearValue();
            }

            public static /* synthetic */ void access$6700(Payload payload, InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                payload.setInitializationRequest(initializationRequest);
            }

            public static /* synthetic */ void access$6800(Payload payload, InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                payload.mergeInitializationRequest(initializationRequest);
            }

            public static /* synthetic */ void access$6900(Payload payload) {
                payload.clearInitializationRequest();
            }

            public static /* synthetic */ void access$7000(Payload payload, AdRequestOuterClass.AdRequest adRequest) {
                payload.setAdRequest(adRequest);
            }

            public static /* synthetic */ void access$7100(Payload payload, AdRequestOuterClass.AdRequest adRequest) {
                payload.mergeAdRequest(adRequest);
            }

            public static /* synthetic */ void access$7200(Payload payload) {
                payload.clearAdRequest();
            }

            public static /* synthetic */ void access$7300(Payload payload, OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                payload.setOperativeEvent(operativeEventRequest);
            }

            public static /* synthetic */ void access$7400(Payload payload, OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                payload.mergeOperativeEvent(operativeEventRequest);
            }

            public static /* synthetic */ void access$7500(Payload payload) {
                payload.clearOperativeEvent();
            }

            public static /* synthetic */ void access$7600(Payload payload, DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                payload.setDiagnosticEventRequest(diagnosticEventRequest);
            }

            public static /* synthetic */ void access$7700(Payload payload, DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                payload.mergeDiagnosticEventRequest(diagnosticEventRequest);
            }

            public static /* synthetic */ void access$7800(Payload payload) {
                payload.clearDiagnosticEventRequest();
            }

            public static /* synthetic */ void access$7900(Payload payload, AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                payload.setAdPlayerConfigRequest(adPlayerConfigRequest);
            }

            public static /* synthetic */ void access$8000(Payload payload, AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                payload.mergeAdPlayerConfigRequest(adPlayerConfigRequest);
            }

            public static /* synthetic */ void access$8100(Payload payload) {
                payload.clearAdPlayerConfigRequest();
            }

            public static /* synthetic */ void access$8200(Payload payload, GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                payload.setGetTokenEventRequest(getTokenEventRequest);
            }

            public static /* synthetic */ void access$8300(Payload payload, GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                payload.mergeGetTokenEventRequest(getTokenEventRequest);
            }

            public static /* synthetic */ void access$8400(Payload payload) {
                payload.clearGetTokenEventRequest();
            }

            public static /* synthetic */ void access$8500(Payload payload, PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                payload.setPrivacyUpdateRequest(privacyUpdateRequest);
            }

            public static /* synthetic */ void access$8600(Payload payload, PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                payload.mergePrivacyUpdateRequest(privacyUpdateRequest);
            }

            public static /* synthetic */ void access$8700(Payload payload) {
                payload.clearPrivacyUpdateRequest();
            }

            public static /* synthetic */ void access$8800(Payload payload, AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                payload.setAdDataRefreshRequest(adDataRefreshRequest);
            }

            public static /* synthetic */ void access$8900(Payload payload, AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                payload.mergeAdDataRefreshRequest(adDataRefreshRequest);
            }

            public static /* synthetic */ void access$9000(Payload payload) {
                payload.clearAdDataRefreshRequest();
            }

            public static /* synthetic */ void access$9100(Payload payload, InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                payload.setInitializationCompletedEventRequest(initializationCompletedEventRequest);
            }

            public static /* synthetic */ void access$9200(Payload payload, InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                payload.mergeInitializationCompletedEventRequest(initializationCompletedEventRequest);
            }

            public static /* synthetic */ void access$9300(Payload payload) {
                payload.clearInitializationCompletedEventRequest();
            }

            public static /* synthetic */ void access$9400(Payload payload, TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                payload.setTransactionEventRequest(transactionEventRequest);
            }

            public static /* synthetic */ void access$9500(Payload payload, TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                payload.mergeTransactionEventRequest(transactionEventRequest);
            }

            public static /* synthetic */ void access$9600(Payload payload) {
                payload.clearTransactionEventRequest();
            }

            public static /* synthetic */ void access$9700(Payload payload, AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest) {
                payload.setAudienceManagementRequest(audienceManagementRequest);
            }

            public static /* synthetic */ void access$9800(Payload payload, AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest) {
                payload.mergeAudienceManagementRequest(audienceManagementRequest);
            }

            public static /* synthetic */ void access$9900(Payload payload) {
                payload.clearAudienceManagementRequest();
            }

            private void clearAdDataRefreshRequest() {
                if (this.valueCase_ == 9) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdPlayerConfigRequest() {
                if (this.valueCase_ == 6) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdRequest() {
                if (this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAudienceManagementRequest() {
                if (this.valueCase_ == 12) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearDiagnosticEventRequest() {
                if (this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearGetTokenEventRequest() {
                if (this.valueCase_ == 7) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearInitializationCompletedEventRequest() {
                if (this.valueCase_ == 10) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearInitializationRequest() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearOperativeEvent() {
                if (this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearPrivacyUpdateRequest() {
                if (this.valueCase_ == 8) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearTransactionEventRequest() {
                if (this.valueCase_ == 11) {
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

            private void mergeAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                adDataRefreshRequest.getClass();
                if (this.valueCase_ != 9 || this.value_ == AdDataRefreshRequestOuterClass.AdDataRefreshRequest.getDefaultInstance()) {
                    this.value_ = adDataRefreshRequest;
                } else {
                    this.value_ = ((AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder) AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder((AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.value_).mergeFrom(adDataRefreshRequest)).buildPartial();
                }
                this.valueCase_ = 9;
            }

            private void mergeAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                adPlayerConfigRequest.getClass();
                if (this.valueCase_ != 6 || this.value_ == AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.getDefaultInstance()) {
                    this.value_ = adPlayerConfigRequest;
                } else {
                    this.value_ = ((AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder) AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder((AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.value_).mergeFrom(adPlayerConfigRequest)).buildPartial();
                }
                this.valueCase_ = 6;
            }

            private void mergeAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                adRequest.getClass();
                if (this.valueCase_ != 3 || this.value_ == AdRequestOuterClass.AdRequest.getDefaultInstance()) {
                    this.value_ = adRequest;
                } else {
                    this.value_ = ((AdRequestOuterClass.AdRequest.Builder) AdRequestOuterClass.AdRequest.newBuilder((AdRequestOuterClass.AdRequest) this.value_).mergeFrom(adRequest)).buildPartial();
                }
                this.valueCase_ = 3;
            }

            private void mergeAudienceManagementRequest(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest) {
                audienceManagementRequest.getClass();
                if (this.valueCase_ != 12 || this.value_ == AudienceManagementRequestOuterClass.AudienceManagementRequest.getDefaultInstance()) {
                    this.value_ = audienceManagementRequest;
                } else {
                    this.value_ = ((AudienceManagementRequestOuterClass.AudienceManagementRequest.Builder) AudienceManagementRequestOuterClass.AudienceManagementRequest.newBuilder((AudienceManagementRequestOuterClass.AudienceManagementRequest) this.value_).mergeFrom(audienceManagementRequest)).buildPartial();
                }
                this.valueCase_ = 12;
            }

            private void mergeDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                diagnosticEventRequest.getClass();
                if (this.valueCase_ != 5 || this.value_ == DiagnosticEventRequestOuterClass.DiagnosticEventRequest.getDefaultInstance()) {
                    this.value_ = diagnosticEventRequest;
                } else {
                    this.value_ = ((DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder) DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder((DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.value_).mergeFrom(diagnosticEventRequest)).buildPartial();
                }
                this.valueCase_ = 5;
            }

            private void mergeGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                getTokenEventRequest.getClass();
                if (this.valueCase_ != 7 || this.value_ == GetTokenEventRequestOuterClass.GetTokenEventRequest.getDefaultInstance()) {
                    this.value_ = getTokenEventRequest;
                } else {
                    this.value_ = ((GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder) GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder((GetTokenEventRequestOuterClass.GetTokenEventRequest) this.value_).mergeFrom(getTokenEventRequest)).buildPartial();
                }
                this.valueCase_ = 7;
            }

            private void mergeInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                initializationCompletedEventRequest.getClass();
                if (this.valueCase_ != 10 || this.value_ == InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance()) {
                    this.value_ = initializationCompletedEventRequest;
                } else {
                    this.value_ = ((InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder) InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder((InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest) this.value_).mergeFrom(initializationCompletedEventRequest)).buildPartial();
                }
                this.valueCase_ = 10;
            }

            private void mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                initializationRequest.getClass();
                if (this.valueCase_ != 2 || this.value_ == InitializationRequestOuterClass.InitializationRequest.getDefaultInstance()) {
                    this.value_ = initializationRequest;
                } else {
                    this.value_ = ((InitializationRequestOuterClass.InitializationRequest.Builder) InitializationRequestOuterClass.InitializationRequest.newBuilder((InitializationRequestOuterClass.InitializationRequest) this.value_).mergeFrom(initializationRequest)).buildPartial();
                }
                this.valueCase_ = 2;
            }

            private void mergeOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                operativeEventRequest.getClass();
                if (this.valueCase_ != 4 || this.value_ == OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance()) {
                    this.value_ = operativeEventRequest;
                } else {
                    this.value_ = ((OperativeEventRequestOuterClass.OperativeEventRequest.Builder) OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder((OperativeEventRequestOuterClass.OperativeEventRequest) this.value_).mergeFrom(operativeEventRequest)).buildPartial();
                }
                this.valueCase_ = 4;
            }

            private void mergePrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                privacyUpdateRequest.getClass();
                if (this.valueCase_ != 8 || this.value_ == PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance()) {
                    this.value_ = privacyUpdateRequest;
                } else {
                    this.value_ = ((PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder) PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder((PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.value_).mergeFrom(privacyUpdateRequest)).buildPartial();
                }
                this.valueCase_ = 8;
            }

            private void mergeTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                transactionEventRequest.getClass();
                if (this.valueCase_ != 11 || this.value_ == TransactionEventRequestOuterClass.TransactionEventRequest.getDefaultInstance()) {
                    this.value_ = transactionEventRequest;
                } else {
                    this.value_ = ((TransactionEventRequestOuterClass.TransactionEventRequest.Builder) TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder((TransactionEventRequestOuterClass.TransactionEventRequest) this.value_).mergeFrom(transactionEventRequest)).buildPartial();
                }
                this.valueCase_ = 11;
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

            private void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                adDataRefreshRequest.getClass();
                this.value_ = adDataRefreshRequest;
                this.valueCase_ = 9;
            }

            private void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                adPlayerConfigRequest.getClass();
                this.value_ = adPlayerConfigRequest;
                this.valueCase_ = 6;
            }

            private void setAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                adRequest.getClass();
                this.value_ = adRequest;
                this.valueCase_ = 3;
            }

            private void setAudienceManagementRequest(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest) {
                audienceManagementRequest.getClass();
                this.value_ = audienceManagementRequest;
                this.valueCase_ = 12;
            }

            private void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                diagnosticEventRequest.getClass();
                this.value_ = diagnosticEventRequest;
                this.valueCase_ = 5;
            }

            private void setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                getTokenEventRequest.getClass();
                this.value_ = getTokenEventRequest;
                this.valueCase_ = 7;
            }

            private void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                initializationCompletedEventRequest.getClass();
                this.value_ = initializationCompletedEventRequest;
                this.valueCase_ = 10;
            }

            private void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                initializationRequest.getClass();
                this.value_ = initializationRequest;
                this.valueCase_ = 2;
            }

            private void setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                operativeEventRequest.getClass();
                this.value_ = operativeEventRequest;
                this.valueCase_ = 4;
            }

            private void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                privacyUpdateRequest.getClass();
                this.value_ = privacyUpdateRequest;
                this.valueCase_ = 8;
            }

            private void setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                transactionEventRequest.getClass();
                this.value_ = transactionEventRequest;
                this.valueCase_ = 11;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (a.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Payload();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0002\f\u000b\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"value_", "valueCase_", InitializationRequestOuterClass.InitializationRequest.class, AdRequestOuterClass.AdRequest.class, OperativeEventRequestOuterClass.OperativeEventRequest.class, DiagnosticEventRequestOuterClass.DiagnosticEventRequest.class, AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.class, GetTokenEventRequestOuterClass.GetTokenEventRequest.class, PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.class, AdDataRefreshRequestOuterClass.AdDataRefreshRequest.class, InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.class, TransactionEventRequestOuterClass.TransactionEventRequest.class, AudienceManagementRequestOuterClass.AudienceManagementRequest.class});
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

            public AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                return this.valueCase_ == 9 ? (AdDataRefreshRequestOuterClass.AdDataRefreshRequest) this.value_ : AdDataRefreshRequestOuterClass.AdDataRefreshRequest.getDefaultInstance();
            }

            public AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                return this.valueCase_ == 6 ? (AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest) this.value_ : AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.getDefaultInstance();
            }

            public AdRequestOuterClass.AdRequest getAdRequest() {
                return this.valueCase_ == 3 ? (AdRequestOuterClass.AdRequest) this.value_ : AdRequestOuterClass.AdRequest.getDefaultInstance();
            }

            public AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequest() {
                return this.valueCase_ == 12 ? (AudienceManagementRequestOuterClass.AudienceManagementRequest) this.value_ : AudienceManagementRequestOuterClass.AudienceManagementRequest.getDefaultInstance();
            }

            public DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                return this.valueCase_ == 5 ? (DiagnosticEventRequestOuterClass.DiagnosticEventRequest) this.value_ : DiagnosticEventRequestOuterClass.DiagnosticEventRequest.getDefaultInstance();
            }

            public GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                return this.valueCase_ == 7 ? (GetTokenEventRequestOuterClass.GetTokenEventRequest) this.value_ : GetTokenEventRequestOuterClass.GetTokenEventRequest.getDefaultInstance();
            }

            public InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                return this.valueCase_ == 10 ? (InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest) this.value_ : InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.getDefaultInstance();
            }

            public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                return this.valueCase_ == 2 ? (InitializationRequestOuterClass.InitializationRequest) this.value_ : InitializationRequestOuterClass.InitializationRequest.getDefaultInstance();
            }

            public OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                return this.valueCase_ == 4 ? (OperativeEventRequestOuterClass.OperativeEventRequest) this.value_ : OperativeEventRequestOuterClass.OperativeEventRequest.getDefaultInstance();
            }

            public PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                return this.valueCase_ == 8 ? (PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest) this.value_ : PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.getDefaultInstance();
            }

            public TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                return this.valueCase_ == 11 ? (TransactionEventRequestOuterClass.TransactionEventRequest) this.value_ : TransactionEventRequestOuterClass.TransactionEventRequest.getDefaultInstance();
            }

            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            public boolean hasAdDataRefreshRequest() {
                return this.valueCase_ == 9;
            }

            public boolean hasAdPlayerConfigRequest() {
                return this.valueCase_ == 6;
            }

            public boolean hasAdRequest() {
                return this.valueCase_ == 3;
            }

            public boolean hasAudienceManagementRequest() {
                return this.valueCase_ == 12;
            }

            public boolean hasDiagnosticEventRequest() {
                return this.valueCase_ == 5;
            }

            public boolean hasGetTokenEventRequest() {
                return this.valueCase_ == 7;
            }

            public boolean hasInitializationCompletedEventRequest() {
                return this.valueCase_ == 10;
            }

            public boolean hasInitializationRequest() {
                return this.valueCase_ == 2;
            }

            public boolean hasOperativeEvent() {
                return this.valueCase_ == 4;
            }

            public boolean hasPrivacyUpdateRequest() {
                return this.valueCase_ == 8;
            }

            public boolean hasTransactionEventRequest() {
                return this.valueCase_ == 11;
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
            AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest();

            AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest();

            AdRequestOuterClass.AdRequest getAdRequest();

            AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequest();

            DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest();

            GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest();

            InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest();

            InitializationRequestOuterClass.InitializationRequest getInitializationRequest();

            OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent();

            PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest();

            TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest();

            Payload.ValueCase getValueCase();

            boolean hasAdDataRefreshRequest();

            boolean hasAdPlayerConfigRequest();

            boolean hasAdRequest();

            boolean hasAudienceManagementRequest();

            boolean hasDiagnosticEventRequest();

            boolean hasGetTokenEventRequest();

            boolean hasInitializationCompletedEventRequest();

            boolean hasInitializationRequest();

            boolean hasOperativeEvent();

            boolean hasPrivacyUpdateRequest();

            boolean hasTransactionEventRequest();
        }

        public static final class SharedData extends GeneratedMessageLite implements SharedDataOrBuilder {
            public static final int APP_START_TIME_FIELD_NUMBER = 8;
            public static final int CURRENT_STATE_FIELD_NUMBER = 6;
            private static final SharedData DEFAULT_INSTANCE;
            public static final int DEVELOPER_CONSENT_FIELD_NUMBER = 4;
            public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 10;
            private static volatile Parser PARSER = null;
            public static final int PII_FIELD_NUMBER = 3;
            public static final int SDK_START_TIME_FIELD_NUMBER = 9;
            public static final int SESSION_TOKEN_FIELD_NUMBER = 1;
            public static final int TEST_DATA_FIELD_NUMBER = 7;
            public static final int TIMESTAMPS_FIELD_NUMBER = 2;
            public static final int WEBVIEW_VERSION_FIELD_NUMBER = 5;
            private Timestamp appStartTime_;
            private int bitField0_;
            private ByteString currentState_;
            private DeveloperConsentOuterClass.DeveloperConsent developerConsent_;
            private LimitedSessionToken limitedSessionToken_;
            private PiiOuterClass.Pii pii_;
            private Timestamp sdkStartTime_;
            private ByteString sessionToken_;
            private TestDataOuterClass.TestData testData_;
            private TimestampsOuterClass.Timestamps timestamps_;
            private int webviewVersion_;

            public static final class Builder extends GeneratedMessageLite.Builder implements SharedDataOrBuilder {
                public /* synthetic */ Builder(a aVar) {
                    this();
                }

                public Builder clearAppStartTime() {
                    copyOnWrite();
                    SharedData.access$5700((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearCurrentState() {
                    copyOnWrite();
                    SharedData.access$5100((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearDeveloperConsent() {
                    copyOnWrite();
                    SharedData.access$4700((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearLimitedSessionToken() {
                    copyOnWrite();
                    SharedData.access$6300((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearPii() {
                    copyOnWrite();
                    SharedData.access$4400((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearSdkStartTime() {
                    copyOnWrite();
                    SharedData.access$6000((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearSessionToken() {
                    copyOnWrite();
                    SharedData.access$3800((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearTestData() {
                    copyOnWrite();
                    SharedData.access$5400((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearTimestamps() {
                    copyOnWrite();
                    SharedData.access$4100((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Builder clearWebviewVersion() {
                    copyOnWrite();
                    SharedData.access$4900((SharedData) ((GeneratedMessageLite.Builder) this).instance);
                    return this;
                }

                public Timestamp getAppStartTime() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getAppStartTime();
                }

                public ByteString getCurrentState() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getCurrentState();
                }

                public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getDeveloperConsent();
                }

                public LimitedSessionToken getLimitedSessionToken() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getLimitedSessionToken();
                }

                public PiiOuterClass.Pii getPii() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getPii();
                }

                public Timestamp getSdkStartTime() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getSdkStartTime();
                }

                public ByteString getSessionToken() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getSessionToken();
                }

                public TestDataOuterClass.TestData getTestData() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getTestData();
                }

                public TimestampsOuterClass.Timestamps getTimestamps() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getTimestamps();
                }

                public int getWebviewVersion() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).getWebviewVersion();
                }

                public boolean hasAppStartTime() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasAppStartTime();
                }

                public boolean hasCurrentState() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasCurrentState();
                }

                public boolean hasDeveloperConsent() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasDeveloperConsent();
                }

                public boolean hasLimitedSessionToken() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasLimitedSessionToken();
                }

                public boolean hasPii() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasPii();
                }

                public boolean hasSdkStartTime() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasSdkStartTime();
                }

                public boolean hasSessionToken() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasSessionToken();
                }

                public boolean hasTestData() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasTestData();
                }

                public boolean hasTimestamps() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasTimestamps();
                }

                public boolean hasWebviewVersion() {
                    return ((SharedData) ((GeneratedMessageLite.Builder) this).instance).hasWebviewVersion();
                }

                public Builder mergeAppStartTime(Timestamp timestamp) {
                    copyOnWrite();
                    SharedData.access$5600((SharedData) ((GeneratedMessageLite.Builder) this).instance, timestamp);
                    return this;
                }

                public Builder mergeDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                    copyOnWrite();
                    SharedData.access$4600((SharedData) ((GeneratedMessageLite.Builder) this).instance, developerConsent);
                    return this;
                }

                public Builder mergeLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                    copyOnWrite();
                    SharedData.access$6200((SharedData) ((GeneratedMessageLite.Builder) this).instance, limitedSessionToken);
                    return this;
                }

                public Builder mergePii(PiiOuterClass.Pii pii) {
                    copyOnWrite();
                    SharedData.access$4300((SharedData) ((GeneratedMessageLite.Builder) this).instance, pii);
                    return this;
                }

                public Builder mergeSdkStartTime(Timestamp timestamp) {
                    copyOnWrite();
                    SharedData.access$5900((SharedData) ((GeneratedMessageLite.Builder) this).instance, timestamp);
                    return this;
                }

                public Builder mergeTestData(TestDataOuterClass.TestData testData) {
                    copyOnWrite();
                    SharedData.access$5300((SharedData) ((GeneratedMessageLite.Builder) this).instance, testData);
                    return this;
                }

                public Builder mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                    copyOnWrite();
                    SharedData.access$4000((SharedData) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                    return this;
                }

                public Builder setAppStartTime(Timestamp timestamp) {
                    copyOnWrite();
                    SharedData.access$5500((SharedData) ((GeneratedMessageLite.Builder) this).instance, timestamp);
                    return this;
                }

                public Builder setCurrentState(ByteString byteString) {
                    copyOnWrite();
                    SharedData.access$5000((SharedData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                    copyOnWrite();
                    SharedData.access$4500((SharedData) ((GeneratedMessageLite.Builder) this).instance, developerConsent);
                    return this;
                }

                public Builder setLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                    copyOnWrite();
                    SharedData.access$6100((SharedData) ((GeneratedMessageLite.Builder) this).instance, limitedSessionToken);
                    return this;
                }

                public Builder setPii(PiiOuterClass.Pii pii) {
                    copyOnWrite();
                    SharedData.access$4200((SharedData) ((GeneratedMessageLite.Builder) this).instance, pii);
                    return this;
                }

                public Builder setSdkStartTime(Timestamp timestamp) {
                    copyOnWrite();
                    SharedData.access$5800((SharedData) ((GeneratedMessageLite.Builder) this).instance, timestamp);
                    return this;
                }

                public Builder setSessionToken(ByteString byteString) {
                    copyOnWrite();
                    SharedData.access$3700((SharedData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                    return this;
                }

                public Builder setTestData(TestDataOuterClass.TestData testData) {
                    copyOnWrite();
                    SharedData.access$5200((SharedData) ((GeneratedMessageLite.Builder) this).instance, testData);
                    return this;
                }

                public Builder setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                    copyOnWrite();
                    SharedData.access$3900((SharedData) ((GeneratedMessageLite.Builder) this).instance, timestamps);
                    return this;
                }

                public Builder setWebviewVersion(int i) {
                    copyOnWrite();
                    SharedData.access$4800((SharedData) ((GeneratedMessageLite.Builder) this).instance, i);
                    return this;
                }

                private Builder() {
                    super(SharedData.access$3600());
                }

                public Builder setAppStartTime(Timestamp.Builder builder) {
                    copyOnWrite();
                    SharedData.access$5500((SharedData) ((GeneratedMessageLite.Builder) this).instance, builder.build());
                    return this;
                }

                public Builder setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent.Builder builder) {
                    copyOnWrite();
                    SharedData.access$4500((SharedData) ((GeneratedMessageLite.Builder) this).instance, (DeveloperConsentOuterClass.DeveloperConsent) builder.build());
                    return this;
                }

                public Builder setLimitedSessionToken(LimitedSessionToken.Builder builder) {
                    copyOnWrite();
                    SharedData.access$6100((SharedData) ((GeneratedMessageLite.Builder) this).instance, (LimitedSessionToken) builder.build());
                    return this;
                }

                public Builder setPii(PiiOuterClass.Pii.Builder builder) {
                    copyOnWrite();
                    SharedData.access$4200((SharedData) ((GeneratedMessageLite.Builder) this).instance, (PiiOuterClass.Pii) builder.build());
                    return this;
                }

                public Builder setSdkStartTime(Timestamp.Builder builder) {
                    copyOnWrite();
                    SharedData.access$5800((SharedData) ((GeneratedMessageLite.Builder) this).instance, builder.build());
                    return this;
                }

                public Builder setTestData(TestDataOuterClass.TestData.Builder builder) {
                    copyOnWrite();
                    SharedData.access$5200((SharedData) ((GeneratedMessageLite.Builder) this).instance, (TestDataOuterClass.TestData) builder.build());
                    return this;
                }

                public Builder setTimestamps(TimestampsOuterClass.Timestamps.Builder builder) {
                    copyOnWrite();
                    SharedData.access$3900((SharedData) ((GeneratedMessageLite.Builder) this).instance, (TimestampsOuterClass.Timestamps) builder.build());
                    return this;
                }
            }

            static {
                SharedData sharedData = new SharedData();
                DEFAULT_INSTANCE = sharedData;
                GeneratedMessageLite.registerDefaultInstance(SharedData.class, sharedData);
            }

            private SharedData() {
                ByteString byteString = ByteString.EMPTY;
                this.sessionToken_ = byteString;
                this.currentState_ = byteString;
            }

            public static /* synthetic */ SharedData access$3600() {
                return DEFAULT_INSTANCE;
            }

            public static /* synthetic */ void access$3700(SharedData sharedData, ByteString byteString) {
                sharedData.setSessionToken(byteString);
            }

            public static /* synthetic */ void access$3800(SharedData sharedData) {
                sharedData.clearSessionToken();
            }

            public static /* synthetic */ void access$3900(SharedData sharedData, TimestampsOuterClass.Timestamps timestamps) {
                sharedData.setTimestamps(timestamps);
            }

            public static /* synthetic */ void access$4000(SharedData sharedData, TimestampsOuterClass.Timestamps timestamps) {
                sharedData.mergeTimestamps(timestamps);
            }

            public static /* synthetic */ void access$4100(SharedData sharedData) {
                sharedData.clearTimestamps();
            }

            public static /* synthetic */ void access$4200(SharedData sharedData, PiiOuterClass.Pii pii) {
                sharedData.setPii(pii);
            }

            public static /* synthetic */ void access$4300(SharedData sharedData, PiiOuterClass.Pii pii) {
                sharedData.mergePii(pii);
            }

            public static /* synthetic */ void access$4400(SharedData sharedData) {
                sharedData.clearPii();
            }

            public static /* synthetic */ void access$4500(SharedData sharedData, DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                sharedData.setDeveloperConsent(developerConsent);
            }

            public static /* synthetic */ void access$4600(SharedData sharedData, DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                sharedData.mergeDeveloperConsent(developerConsent);
            }

            public static /* synthetic */ void access$4700(SharedData sharedData) {
                sharedData.clearDeveloperConsent();
            }

            public static /* synthetic */ void access$4800(SharedData sharedData, int i) {
                sharedData.setWebviewVersion(i);
            }

            public static /* synthetic */ void access$4900(SharedData sharedData) {
                sharedData.clearWebviewVersion();
            }

            public static /* synthetic */ void access$5000(SharedData sharedData, ByteString byteString) {
                sharedData.setCurrentState(byteString);
            }

            public static /* synthetic */ void access$5100(SharedData sharedData) {
                sharedData.clearCurrentState();
            }

            public static /* synthetic */ void access$5200(SharedData sharedData, TestDataOuterClass.TestData testData) {
                sharedData.setTestData(testData);
            }

            public static /* synthetic */ void access$5300(SharedData sharedData, TestDataOuterClass.TestData testData) {
                sharedData.mergeTestData(testData);
            }

            public static /* synthetic */ void access$5400(SharedData sharedData) {
                sharedData.clearTestData();
            }

            public static /* synthetic */ void access$5500(SharedData sharedData, Timestamp timestamp) {
                sharedData.setAppStartTime(timestamp);
            }

            public static /* synthetic */ void access$5600(SharedData sharedData, Timestamp timestamp) {
                sharedData.mergeAppStartTime(timestamp);
            }

            public static /* synthetic */ void access$5700(SharedData sharedData) {
                sharedData.clearAppStartTime();
            }

            public static /* synthetic */ void access$5800(SharedData sharedData, Timestamp timestamp) {
                sharedData.setSdkStartTime(timestamp);
            }

            public static /* synthetic */ void access$5900(SharedData sharedData, Timestamp timestamp) {
                sharedData.mergeSdkStartTime(timestamp);
            }

            public static /* synthetic */ void access$6000(SharedData sharedData) {
                sharedData.clearSdkStartTime();
            }

            public static /* synthetic */ void access$6100(SharedData sharedData, LimitedSessionToken limitedSessionToken) {
                sharedData.setLimitedSessionToken(limitedSessionToken);
            }

            public static /* synthetic */ void access$6200(SharedData sharedData, LimitedSessionToken limitedSessionToken) {
                sharedData.mergeLimitedSessionToken(limitedSessionToken);
            }

            public static /* synthetic */ void access$6300(SharedData sharedData) {
                sharedData.clearLimitedSessionToken();
            }

            private void clearAppStartTime() {
                this.appStartTime_ = null;
                this.bitField0_ &= -129;
            }

            private void clearCurrentState() {
                this.bitField0_ &= -33;
                this.currentState_ = getDefaultInstance().getCurrentState();
            }

            private void clearDeveloperConsent() {
                this.developerConsent_ = null;
                this.bitField0_ &= -9;
            }

            private void clearLimitedSessionToken() {
                this.limitedSessionToken_ = null;
                this.bitField0_ &= -513;
            }

            private void clearPii() {
                this.pii_ = null;
                this.bitField0_ &= -5;
            }

            private void clearSdkStartTime() {
                this.sdkStartTime_ = null;
                this.bitField0_ &= -257;
            }

            private void clearSessionToken() {
                this.bitField0_ &= -2;
                this.sessionToken_ = getDefaultInstance().getSessionToken();
            }

            private void clearTestData() {
                this.testData_ = null;
                this.bitField0_ &= -65;
            }

            private void clearTimestamps() {
                this.timestamps_ = null;
                this.bitField0_ &= -3;
            }

            private void clearWebviewVersion() {
                this.bitField0_ &= -17;
                this.webviewVersion_ = 0;
            }

            public static SharedData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeAppStartTime(Timestamp timestamp) {
                timestamp.getClass();
                Timestamp timestamp2 = this.appStartTime_;
                if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                    this.appStartTime_ = timestamp;
                } else {
                    this.appStartTime_ = Timestamp.newBuilder(this.appStartTime_).mergeFrom(timestamp).buildPartial();
                }
                this.bitField0_ |= 128;
            }

            private void mergeDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                developerConsent.getClass();
                DeveloperConsentOuterClass.DeveloperConsent developerConsent2 = this.developerConsent_;
                if (developerConsent2 == null || developerConsent2 == DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance()) {
                    this.developerConsent_ = developerConsent;
                } else {
                    this.developerConsent_ = (DeveloperConsentOuterClass.DeveloperConsent) ((DeveloperConsentOuterClass.DeveloperConsent.Builder) DeveloperConsentOuterClass.DeveloperConsent.newBuilder(this.developerConsent_).mergeFrom(developerConsent)).buildPartial();
                }
                this.bitField0_ |= 8;
            }

            private void mergeLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                limitedSessionToken.getClass();
                LimitedSessionToken limitedSessionToken2 = this.limitedSessionToken_;
                if (limitedSessionToken2 == null || limitedSessionToken2 == LimitedSessionToken.getDefaultInstance()) {
                    this.limitedSessionToken_ = limitedSessionToken;
                } else {
                    this.limitedSessionToken_ = (LimitedSessionToken) ((LimitedSessionToken.Builder) LimitedSessionToken.newBuilder(this.limitedSessionToken_).mergeFrom(limitedSessionToken)).buildPartial();
                }
                this.bitField0_ |= 512;
            }

            private void mergePii(PiiOuterClass.Pii pii) {
                pii.getClass();
                PiiOuterClass.Pii pii2 = this.pii_;
                if (pii2 == null || pii2 == PiiOuterClass.Pii.getDefaultInstance()) {
                    this.pii_ = pii;
                } else {
                    this.pii_ = (PiiOuterClass.Pii) ((PiiOuterClass.Pii.Builder) PiiOuterClass.Pii.newBuilder(this.pii_).mergeFrom(pii)).buildPartial();
                }
                this.bitField0_ |= 4;
            }

            private void mergeSdkStartTime(Timestamp timestamp) {
                timestamp.getClass();
                Timestamp timestamp2 = this.sdkStartTime_;
                if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                    this.sdkStartTime_ = timestamp;
                } else {
                    this.sdkStartTime_ = Timestamp.newBuilder(this.sdkStartTime_).mergeFrom(timestamp).buildPartial();
                }
                this.bitField0_ |= 256;
            }

            private void mergeTestData(TestDataOuterClass.TestData testData) {
                testData.getClass();
                TestDataOuterClass.TestData testData2 = this.testData_;
                if (testData2 == null || testData2 == TestDataOuterClass.TestData.getDefaultInstance()) {
                    this.testData_ = testData;
                } else {
                    this.testData_ = (TestDataOuterClass.TestData) ((TestDataOuterClass.TestData.Builder) TestDataOuterClass.TestData.newBuilder(this.testData_).mergeFrom(testData)).buildPartial();
                }
                this.bitField0_ |= 64;
            }

            private void mergeTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                timestamps.getClass();
                TimestampsOuterClass.Timestamps timestamps2 = this.timestamps_;
                if (timestamps2 == null || timestamps2 == TimestampsOuterClass.Timestamps.getDefaultInstance()) {
                    this.timestamps_ = timestamps;
                } else {
                    this.timestamps_ = (TimestampsOuterClass.Timestamps) ((TimestampsOuterClass.Timestamps.Builder) TimestampsOuterClass.Timestamps.newBuilder(this.timestamps_).mergeFrom(timestamps)).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static SharedData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (SharedData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SharedData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAppStartTime(Timestamp timestamp) {
                timestamp.getClass();
                this.appStartTime_ = timestamp;
                this.bitField0_ |= 128;
            }

            private void setCurrentState(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 32;
                this.currentState_ = byteString;
            }

            private void setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                developerConsent.getClass();
                this.developerConsent_ = developerConsent;
                this.bitField0_ |= 8;
            }

            private void setLimitedSessionToken(LimitedSessionToken limitedSessionToken) {
                limitedSessionToken.getClass();
                this.limitedSessionToken_ = limitedSessionToken;
                this.bitField0_ |= 512;
            }

            private void setPii(PiiOuterClass.Pii pii) {
                pii.getClass();
                this.pii_ = pii;
                this.bitField0_ |= 4;
            }

            private void setSdkStartTime(Timestamp timestamp) {
                timestamp.getClass();
                this.sdkStartTime_ = timestamp;
                this.bitField0_ |= 256;
            }

            private void setSessionToken(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.sessionToken_ = byteString;
            }

            private void setTestData(TestDataOuterClass.TestData testData) {
                testData.getClass();
                this.testData_ = testData;
                this.bitField0_ |= 64;
            }

            private void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                timestamps.getClass();
                this.timestamps_ = timestamps;
                this.bitField0_ |= 2;
            }

            private void setWebviewVersion(int i) {
                this.bitField0_ |= 16;
                this.webviewVersion_ = i;
            }

            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (a.a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new SharedData();
                    case 2:
                        return new Builder(null);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ည\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t", new Object[]{"bitField0_", "sessionToken_", "timestamps_", "pii_", "developerConsent_", "webviewVersion_", "currentState_", "testData_", "appStartTime_", "sdkStartTime_", "limitedSessionToken_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            synchronized (SharedData.class) {
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

            public Timestamp getAppStartTime() {
                Timestamp timestamp = this.appStartTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            public ByteString getCurrentState() {
                return this.currentState_;
            }

            public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent = this.developerConsent_;
                return developerConsent == null ? DeveloperConsentOuterClass.DeveloperConsent.getDefaultInstance() : developerConsent;
            }

            public LimitedSessionToken getLimitedSessionToken() {
                LimitedSessionToken limitedSessionToken = this.limitedSessionToken_;
                return limitedSessionToken == null ? LimitedSessionToken.getDefaultInstance() : limitedSessionToken;
            }

            public PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii = this.pii_;
                return pii == null ? PiiOuterClass.Pii.getDefaultInstance() : pii;
            }

            public Timestamp getSdkStartTime() {
                Timestamp timestamp = this.sdkStartTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }

            public ByteString getSessionToken() {
                return this.sessionToken_;
            }

            public TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData = this.testData_;
                return testData == null ? TestDataOuterClass.TestData.getDefaultInstance() : testData;
            }

            public TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps = this.timestamps_;
                return timestamps == null ? TimestampsOuterClass.Timestamps.getDefaultInstance() : timestamps;
            }

            public int getWebviewVersion() {
                return this.webviewVersion_;
            }

            public boolean hasAppStartTime() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasCurrentState() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasDeveloperConsent() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasLimitedSessionToken() {
                return (this.bitField0_ & 512) != 0;
            }

            public boolean hasPii() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSdkStartTime() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasSessionToken() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasTestData() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasTimestamps() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasWebviewVersion() {
                return (this.bitField0_ & 16) != 0;
            }

            public static Builder newBuilder(SharedData sharedData) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(sharedData);
            }

            public static SharedData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SharedData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SharedData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static SharedData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static SharedData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static SharedData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static SharedData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static SharedData parseFrom(InputStream inputStream) throws IOException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static SharedData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static SharedData parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static SharedData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (SharedData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public interface SharedDataOrBuilder extends MessageLiteOrBuilder {
            Timestamp getAppStartTime();

            ByteString getCurrentState();

            DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent();

            LimitedSessionToken getLimitedSessionToken();

            PiiOuterClass.Pii getPii();

            Timestamp getSdkStartTime();

            ByteString getSessionToken();

            TestDataOuterClass.TestData getTestData();

            TimestampsOuterClass.Timestamps getTimestamps();

            int getWebviewVersion();

            boolean hasAppStartTime();

            boolean hasCurrentState();

            boolean hasDeveloperConsent();

            boolean hasLimitedSessionToken();

            boolean hasPii();

            boolean hasSdkStartTime();

            boolean hasSessionToken();

            boolean hasTestData();

            boolean hasTimestamps();

            boolean hasWebviewVersion();
        }

        static {
            UniversalRequest universalRequest = new UniversalRequest();
            DEFAULT_INSTANCE = universalRequest;
            GeneratedMessageLite.registerDefaultInstance(UniversalRequest.class, universalRequest);
        }

        private UniversalRequest() {
        }

        public static /* synthetic */ UniversalRequest access$10100() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$10200(UniversalRequest universalRequest, SharedData sharedData) {
            universalRequest.setSharedData(sharedData);
        }

        public static /* synthetic */ void access$10300(UniversalRequest universalRequest, SharedData sharedData) {
            universalRequest.mergeSharedData(sharedData);
        }

        public static /* synthetic */ void access$10400(UniversalRequest universalRequest) {
            universalRequest.clearSharedData();
        }

        public static /* synthetic */ void access$10500(UniversalRequest universalRequest, Payload payload) {
            universalRequest.setPayload(payload);
        }

        public static /* synthetic */ void access$10600(UniversalRequest universalRequest, Payload payload) {
            universalRequest.mergePayload(payload);
        }

        public static /* synthetic */ void access$10700(UniversalRequest universalRequest) {
            universalRequest.clearPayload();
        }

        private void clearPayload() {
            this.payload_ = null;
            this.bitField0_ &= -3;
        }

        private void clearSharedData() {
            this.sharedData_ = null;
            this.bitField0_ &= -2;
        }

        public static UniversalRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergePayload(Payload payload) {
            payload.getClass();
            Payload payload2 = this.payload_;
            if (payload2 == null || payload2 == Payload.getDefaultInstance()) {
                this.payload_ = payload;
            } else {
                this.payload_ = (Payload) ((Payload.Builder) Payload.newBuilder(this.payload_).mergeFrom(payload)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeSharedData(SharedData sharedData) {
            sharedData.getClass();
            SharedData sharedData2 = this.sharedData_;
            if (sharedData2 == null || sharedData2 == SharedData.getDefaultInstance()) {
                this.sharedData_ = sharedData;
            } else {
                this.sharedData_ = (SharedData) ((SharedData.Builder) SharedData.newBuilder(this.sharedData_).mergeFrom(sharedData)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UniversalRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setPayload(Payload payload) {
            payload.getClass();
            this.payload_ = payload;
            this.bitField0_ |= 2;
        }

        private void setSharedData(SharedData sharedData) {
            sharedData.getClass();
            this.sharedData_ = sharedData;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new UniversalRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "sharedData_", "payload_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (UniversalRequest.class) {
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

        public Payload getPayload() {
            Payload payload = this.payload_;
            return payload == null ? Payload.getDefaultInstance() : payload;
        }

        public SharedData getSharedData() {
            SharedData sharedData = this.sharedData_;
            return sharedData == null ? SharedData.getDefaultInstance() : sharedData;
        }

        public boolean hasPayload() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSharedData() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(UniversalRequest universalRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(universalRequest);
        }

        public static UniversalRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UniversalRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UniversalRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(InputStream inputStream) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UniversalRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface UniversalRequestOrBuilder extends MessageLiteOrBuilder {
        UniversalRequest.Payload getPayload();

        UniversalRequest.SharedData getSharedData();

        boolean hasPayload();

        boolean hasSharedData();
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

    private UniversalRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
