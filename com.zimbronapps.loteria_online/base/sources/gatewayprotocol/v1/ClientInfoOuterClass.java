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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ClientInfoOuterClass {

    public static final class ClientInfo extends GeneratedMessageLite implements ClientInfoOrBuilder {
        public static final int AD_QUALITY_SDK_VERSION_FIELD_NUMBER = 16;
        public static final int CUSTOM_MEDIATION_NAME_FIELD_NUMBER = 7;
        private static final ClientInfo DEFAULT_INSTANCE;
        public static final int GAME_ID_FIELD_NUMBER = 3;
        public static final int IS_FID_AVAILABLE_FIELD_NUMBER = 14;
        public static final int MEDIATION_ADAPTER_VERSION_FIELD_NUMBER = 15;
        public static final int MEDIATION_PROVIDER_FIELD_NUMBER = 6;
        public static final int MEDIATION_VERSION_FIELD_NUMBER = 8;
        public static final int OFFERWALL_VERSION_FIELD_NUMBER = 13;
        public static final int OMID_PARTNER_VERSION_FIELD_NUMBER = 9;
        public static final int OMID_VERSION_FIELD_NUMBER = 10;
        private static volatile Parser PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 5;
        public static final int SCAR_VERSION_NAME_FIELD_NUMBER = 12;
        public static final int SDK_DEVELOPMENT_PLATFORM_FIELD_NUMBER = 11;
        public static final int SDK_VERSION_FIELD_NUMBER = 1;
        public static final int SDK_VERSION_NAME_FIELD_NUMBER = 2;
        public static final int TEST_FIELD_NUMBER = 4;
        private int bitField0_;
        private boolean isFidAvailable_;
        private int mediationProvider_;
        private int platform_;
        private int sdkVersion_;
        private boolean test_;
        private String sdkVersionName_ = "";
        private String gameId_ = "";
        private String customMediationName_ = "";
        private String mediationVersion_ = "";
        private String omidPartnerVersion_ = "";
        private String omidVersion_ = "";
        private String sdkDevelopmentPlatform_ = "";
        private String scarVersionName_ = "";
        private String offerwallVersion_ = "";
        private String mediationAdapterVersion_ = "";
        private String adQualitySdkVersion_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements ClientInfoOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdQualitySdkVersion() {
                copyOnWrite();
                ClientInfo.access$4400((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCustomMediationName() {
                copyOnWrite();
                ClientInfo.access$1800((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearGameId() {
                copyOnWrite();
                ClientInfo.access$700((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearIsFidAvailable() {
                copyOnWrite();
                ClientInfo.access$3900((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationAdapterVersion() {
                copyOnWrite();
                ClientInfo.access$4100((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationProvider() {
                copyOnWrite();
                ClientInfo.access$1600((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationVersion() {
                copyOnWrite();
                ClientInfo.access$2100((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOfferwallVersion() {
                copyOnWrite();
                ClientInfo.access$3600((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOmidPartnerVersion() {
                copyOnWrite();
                ClientInfo.access$2400((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOmidVersion() {
                copyOnWrite();
                ClientInfo.access$2700((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                ClientInfo.access$1300((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScarVersionName() {
                copyOnWrite();
                ClientInfo.access$3300((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSdkDevelopmentPlatform() {
                copyOnWrite();
                ClientInfo.access$3000((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSdkVersion() {
                copyOnWrite();
                ClientInfo.access$200((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSdkVersionName() {
                copyOnWrite();
                ClientInfo.access$400((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTest() {
                copyOnWrite();
                ClientInfo.access$1000((ClientInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public String getAdQualitySdkVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getAdQualitySdkVersion();
            }

            public ByteString getAdQualitySdkVersionBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getAdQualitySdkVersionBytes();
            }

            public String getCustomMediationName() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getCustomMediationName();
            }

            public ByteString getCustomMediationNameBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getCustomMediationNameBytes();
            }

            public String getGameId() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getGameId();
            }

            public ByteString getGameIdBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getGameIdBytes();
            }

            public boolean getIsFidAvailable() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getIsFidAvailable();
            }

            public String getMediationAdapterVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getMediationAdapterVersion();
            }

            public ByteString getMediationAdapterVersionBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getMediationAdapterVersionBytes();
            }

            public MediationProvider getMediationProvider() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getMediationProvider();
            }

            public int getMediationProviderValue() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getMediationProviderValue();
            }

            public String getMediationVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getMediationVersion();
            }

            public ByteString getMediationVersionBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getMediationVersionBytes();
            }

            public String getOfferwallVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getOfferwallVersion();
            }

            public ByteString getOfferwallVersionBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getOfferwallVersionBytes();
            }

            public String getOmidPartnerVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getOmidPartnerVersion();
            }

            public ByteString getOmidPartnerVersionBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getOmidPartnerVersionBytes();
            }

            public String getOmidVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getOmidVersion();
            }

            public ByteString getOmidVersionBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getOmidVersionBytes();
            }

            public Platform getPlatform() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getPlatform();
            }

            public int getPlatformValue() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getPlatformValue();
            }

            public String getScarVersionName() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getScarVersionName();
            }

            public ByteString getScarVersionNameBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getScarVersionNameBytes();
            }

            public String getSdkDevelopmentPlatform() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getSdkDevelopmentPlatform();
            }

            public ByteString getSdkDevelopmentPlatformBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getSdkDevelopmentPlatformBytes();
            }

            public int getSdkVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getSdkVersion();
            }

            public String getSdkVersionName() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getSdkVersionName();
            }

            public ByteString getSdkVersionNameBytes() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getSdkVersionNameBytes();
            }

            public boolean getTest() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).getTest();
            }

            public boolean hasAdQualitySdkVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasAdQualitySdkVersion();
            }

            public boolean hasCustomMediationName() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasCustomMediationName();
            }

            public boolean hasIsFidAvailable() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasIsFidAvailable();
            }

            public boolean hasMediationAdapterVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasMediationAdapterVersion();
            }

            public boolean hasMediationVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasMediationVersion();
            }

            public boolean hasOfferwallVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasOfferwallVersion();
            }

            public boolean hasOmidPartnerVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasOmidPartnerVersion();
            }

            public boolean hasOmidVersion() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasOmidVersion();
            }

            public boolean hasScarVersionName() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasScarVersionName();
            }

            public boolean hasSdkDevelopmentPlatform() {
                return ((ClientInfo) ((GeneratedMessageLite.Builder) this).instance).hasSdkDevelopmentPlatform();
            }

            public Builder setAdQualitySdkVersion(String str) {
                copyOnWrite();
                ClientInfo.access$4300((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setAdQualitySdkVersionBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$4500((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setCustomMediationName(String str) {
                copyOnWrite();
                ClientInfo.access$1700((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setCustomMediationNameBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$1900((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setGameId(String str) {
                copyOnWrite();
                ClientInfo.access$600((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setGameIdBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$800((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setIsFidAvailable(boolean z) {
                copyOnWrite();
                ClientInfo.access$3800((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setMediationAdapterVersion(String str) {
                copyOnWrite();
                ClientInfo.access$4000((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setMediationAdapterVersionBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$4200((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setMediationProvider(MediationProvider mediationProvider) {
                copyOnWrite();
                ClientInfo.access$1500((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, mediationProvider);
                return this;
            }

            public Builder setMediationProviderValue(int i) {
                copyOnWrite();
                ClientInfo.access$1400((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setMediationVersion(String str) {
                copyOnWrite();
                ClientInfo.access$2000((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setMediationVersionBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$2200((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setOfferwallVersion(String str) {
                copyOnWrite();
                ClientInfo.access$3500((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setOfferwallVersionBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$3700((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setOmidPartnerVersion(String str) {
                copyOnWrite();
                ClientInfo.access$2300((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setOmidPartnerVersionBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$2500((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setOmidVersion(String str) {
                copyOnWrite();
                ClientInfo.access$2600((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setOmidVersionBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$2800((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setPlatform(Platform platform) {
                copyOnWrite();
                ClientInfo.access$1200((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, platform);
                return this;
            }

            public Builder setPlatformValue(int i) {
                copyOnWrite();
                ClientInfo.access$1100((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setScarVersionName(String str) {
                copyOnWrite();
                ClientInfo.access$3200((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setScarVersionNameBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$3400((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSdkDevelopmentPlatform(String str) {
                copyOnWrite();
                ClientInfo.access$2900((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setSdkDevelopmentPlatformBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$3100((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSdkVersion(int i) {
                copyOnWrite();
                ClientInfo.access$100((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setSdkVersionName(String str) {
                copyOnWrite();
                ClientInfo.access$300((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setSdkVersionNameBytes(ByteString byteString) {
                copyOnWrite();
                ClientInfo.access$500((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTest(boolean z) {
                copyOnWrite();
                ClientInfo.access$900((ClientInfo) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            private Builder() {
                super(ClientInfo.access$000());
            }
        }

        static {
            ClientInfo clientInfo = new ClientInfo();
            DEFAULT_INSTANCE = clientInfo;
            GeneratedMessageLite.registerDefaultInstance(ClientInfo.class, clientInfo);
        }

        private ClientInfo() {
        }

        public static /* synthetic */ ClientInfo access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(ClientInfo clientInfo, int i) {
            clientInfo.setSdkVersion(i);
        }

        public static /* synthetic */ void access$1000(ClientInfo clientInfo) {
            clientInfo.clearTest();
        }

        public static /* synthetic */ void access$1100(ClientInfo clientInfo, int i) {
            clientInfo.setPlatformValue(i);
        }

        public static /* synthetic */ void access$1200(ClientInfo clientInfo, Platform platform) {
            clientInfo.setPlatform(platform);
        }

        public static /* synthetic */ void access$1300(ClientInfo clientInfo) {
            clientInfo.clearPlatform();
        }

        public static /* synthetic */ void access$1400(ClientInfo clientInfo, int i) {
            clientInfo.setMediationProviderValue(i);
        }

        public static /* synthetic */ void access$1500(ClientInfo clientInfo, MediationProvider mediationProvider) {
            clientInfo.setMediationProvider(mediationProvider);
        }

        public static /* synthetic */ void access$1600(ClientInfo clientInfo) {
            clientInfo.clearMediationProvider();
        }

        public static /* synthetic */ void access$1700(ClientInfo clientInfo, String str) {
            clientInfo.setCustomMediationName(str);
        }

        public static /* synthetic */ void access$1800(ClientInfo clientInfo) {
            clientInfo.clearCustomMediationName();
        }

        public static /* synthetic */ void access$1900(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setCustomMediationNameBytes(byteString);
        }

        public static /* synthetic */ void access$200(ClientInfo clientInfo) {
            clientInfo.clearSdkVersion();
        }

        public static /* synthetic */ void access$2000(ClientInfo clientInfo, String str) {
            clientInfo.setMediationVersion(str);
        }

        public static /* synthetic */ void access$2100(ClientInfo clientInfo) {
            clientInfo.clearMediationVersion();
        }

        public static /* synthetic */ void access$2200(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setMediationVersionBytes(byteString);
        }

        public static /* synthetic */ void access$2300(ClientInfo clientInfo, String str) {
            clientInfo.setOmidPartnerVersion(str);
        }

        public static /* synthetic */ void access$2400(ClientInfo clientInfo) {
            clientInfo.clearOmidPartnerVersion();
        }

        public static /* synthetic */ void access$2500(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setOmidPartnerVersionBytes(byteString);
        }

        public static /* synthetic */ void access$2600(ClientInfo clientInfo, String str) {
            clientInfo.setOmidVersion(str);
        }

        public static /* synthetic */ void access$2700(ClientInfo clientInfo) {
            clientInfo.clearOmidVersion();
        }

        public static /* synthetic */ void access$2800(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setOmidVersionBytes(byteString);
        }

        public static /* synthetic */ void access$2900(ClientInfo clientInfo, String str) {
            clientInfo.setSdkDevelopmentPlatform(str);
        }

        public static /* synthetic */ void access$300(ClientInfo clientInfo, String str) {
            clientInfo.setSdkVersionName(str);
        }

        public static /* synthetic */ void access$3000(ClientInfo clientInfo) {
            clientInfo.clearSdkDevelopmentPlatform();
        }

        public static /* synthetic */ void access$3100(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setSdkDevelopmentPlatformBytes(byteString);
        }

        public static /* synthetic */ void access$3200(ClientInfo clientInfo, String str) {
            clientInfo.setScarVersionName(str);
        }

        public static /* synthetic */ void access$3300(ClientInfo clientInfo) {
            clientInfo.clearScarVersionName();
        }

        public static /* synthetic */ void access$3400(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setScarVersionNameBytes(byteString);
        }

        public static /* synthetic */ void access$3500(ClientInfo clientInfo, String str) {
            clientInfo.setOfferwallVersion(str);
        }

        public static /* synthetic */ void access$3600(ClientInfo clientInfo) {
            clientInfo.clearOfferwallVersion();
        }

        public static /* synthetic */ void access$3700(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setOfferwallVersionBytes(byteString);
        }

        public static /* synthetic */ void access$3800(ClientInfo clientInfo, boolean z) {
            clientInfo.setIsFidAvailable(z);
        }

        public static /* synthetic */ void access$3900(ClientInfo clientInfo) {
            clientInfo.clearIsFidAvailable();
        }

        public static /* synthetic */ void access$400(ClientInfo clientInfo) {
            clientInfo.clearSdkVersionName();
        }

        public static /* synthetic */ void access$4000(ClientInfo clientInfo, String str) {
            clientInfo.setMediationAdapterVersion(str);
        }

        public static /* synthetic */ void access$4100(ClientInfo clientInfo) {
            clientInfo.clearMediationAdapterVersion();
        }

        public static /* synthetic */ void access$4200(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setMediationAdapterVersionBytes(byteString);
        }

        public static /* synthetic */ void access$4300(ClientInfo clientInfo, String str) {
            clientInfo.setAdQualitySdkVersion(str);
        }

        public static /* synthetic */ void access$4400(ClientInfo clientInfo) {
            clientInfo.clearAdQualitySdkVersion();
        }

        public static /* synthetic */ void access$4500(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setAdQualitySdkVersionBytes(byteString);
        }

        public static /* synthetic */ void access$500(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setSdkVersionNameBytes(byteString);
        }

        public static /* synthetic */ void access$600(ClientInfo clientInfo, String str) {
            clientInfo.setGameId(str);
        }

        public static /* synthetic */ void access$700(ClientInfo clientInfo) {
            clientInfo.clearGameId();
        }

        public static /* synthetic */ void access$800(ClientInfo clientInfo, ByteString byteString) {
            clientInfo.setGameIdBytes(byteString);
        }

        public static /* synthetic */ void access$900(ClientInfo clientInfo, boolean z) {
            clientInfo.setTest(z);
        }

        private void clearAdQualitySdkVersion() {
            this.bitField0_ &= -513;
            this.adQualitySdkVersion_ = getDefaultInstance().getAdQualitySdkVersion();
        }

        private void clearCustomMediationName() {
            this.bitField0_ &= -2;
            this.customMediationName_ = getDefaultInstance().getCustomMediationName();
        }

        private void clearGameId() {
            this.gameId_ = getDefaultInstance().getGameId();
        }

        private void clearIsFidAvailable() {
            this.bitField0_ &= -129;
            this.isFidAvailable_ = false;
        }

        private void clearMediationAdapterVersion() {
            this.bitField0_ &= -257;
            this.mediationAdapterVersion_ = getDefaultInstance().getMediationAdapterVersion();
        }

        private void clearMediationProvider() {
            this.mediationProvider_ = 0;
        }

        private void clearMediationVersion() {
            this.bitField0_ &= -3;
            this.mediationVersion_ = getDefaultInstance().getMediationVersion();
        }

        private void clearOfferwallVersion() {
            this.bitField0_ &= -65;
            this.offerwallVersion_ = getDefaultInstance().getOfferwallVersion();
        }

        private void clearOmidPartnerVersion() {
            this.bitField0_ &= -5;
            this.omidPartnerVersion_ = getDefaultInstance().getOmidPartnerVersion();
        }

        private void clearOmidVersion() {
            this.bitField0_ &= -9;
            this.omidVersion_ = getDefaultInstance().getOmidVersion();
        }

        private void clearPlatform() {
            this.platform_ = 0;
        }

        private void clearScarVersionName() {
            this.bitField0_ &= -33;
            this.scarVersionName_ = getDefaultInstance().getScarVersionName();
        }

        private void clearSdkDevelopmentPlatform() {
            this.bitField0_ &= -17;
            this.sdkDevelopmentPlatform_ = getDefaultInstance().getSdkDevelopmentPlatform();
        }

        private void clearSdkVersion() {
            this.sdkVersion_ = 0;
        }

        private void clearSdkVersionName() {
            this.sdkVersionName_ = getDefaultInstance().getSdkVersionName();
        }

        private void clearTest() {
            this.test_ = false;
        }

        public static ClientInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdQualitySdkVersion(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.adQualitySdkVersion_ = str;
        }

        private void setAdQualitySdkVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.adQualitySdkVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 512;
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

        private void setGameId(String str) {
            str.getClass();
            this.gameId_ = str;
        }

        private void setGameIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.gameId_ = byteString.toStringUtf8();
        }

        private void setIsFidAvailable(boolean z) {
            this.bitField0_ |= 128;
            this.isFidAvailable_ = z;
        }

        private void setMediationAdapterVersion(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.mediationAdapterVersion_ = str;
        }

        private void setMediationAdapterVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mediationAdapterVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 256;
        }

        private void setMediationProvider(MediationProvider mediationProvider) {
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

        private void setOfferwallVersion(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.offerwallVersion_ = str;
        }

        private void setOfferwallVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.offerwallVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        private void setOmidPartnerVersion(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.omidPartnerVersion_ = str;
        }

        private void setOmidPartnerVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.omidPartnerVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setOmidVersion(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.omidVersion_ = str;
        }

        private void setOmidVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.omidVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        private void setPlatform(Platform platform) {
            this.platform_ = platform.getNumber();
        }

        private void setPlatformValue(int i) {
            this.platform_ = i;
        }

        private void setScarVersionName(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.scarVersionName_ = str;
        }

        private void setScarVersionNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.scarVersionName_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        private void setSdkDevelopmentPlatform(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.sdkDevelopmentPlatform_ = str;
        }

        private void setSdkDevelopmentPlatformBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.sdkDevelopmentPlatform_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
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

        private void setTest(boolean z) {
            this.test_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003Ȉ\u0004\u0007\u0005\f\u0006\f\u0007ለ\u0000\bለ\u0001\tለ\u0002\nለ\u0003\u000bለ\u0004\fለ\u0005\rለ\u0006\u000eဇ\u0007\u000fለ\b\u0010ለ\t", new Object[]{"bitField0_", "sdkVersion_", "sdkVersionName_", "gameId_", "test_", "platform_", "mediationProvider_", "customMediationName_", "mediationVersion_", "omidPartnerVersion_", "omidVersion_", "sdkDevelopmentPlatform_", "scarVersionName_", "offerwallVersion_", "isFidAvailable_", "mediationAdapterVersion_", "adQualitySdkVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ClientInfo.class) {
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

        public String getAdQualitySdkVersion() {
            return this.adQualitySdkVersion_;
        }

        public ByteString getAdQualitySdkVersionBytes() {
            return ByteString.copyFromUtf8(this.adQualitySdkVersion_);
        }

        public String getCustomMediationName() {
            return this.customMediationName_;
        }

        public ByteString getCustomMediationNameBytes() {
            return ByteString.copyFromUtf8(this.customMediationName_);
        }

        public String getGameId() {
            return this.gameId_;
        }

        public ByteString getGameIdBytes() {
            return ByteString.copyFromUtf8(this.gameId_);
        }

        public boolean getIsFidAvailable() {
            return this.isFidAvailable_;
        }

        public String getMediationAdapterVersion() {
            return this.mediationAdapterVersion_;
        }

        public ByteString getMediationAdapterVersionBytes() {
            return ByteString.copyFromUtf8(this.mediationAdapterVersion_);
        }

        public MediationProvider getMediationProvider() {
            MediationProvider forNumber = MediationProvider.forNumber(this.mediationProvider_);
            return forNumber == null ? MediationProvider.UNRECOGNIZED : forNumber;
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

        public String getOfferwallVersion() {
            return this.offerwallVersion_;
        }

        public ByteString getOfferwallVersionBytes() {
            return ByteString.copyFromUtf8(this.offerwallVersion_);
        }

        public String getOmidPartnerVersion() {
            return this.omidPartnerVersion_;
        }

        public ByteString getOmidPartnerVersionBytes() {
            return ByteString.copyFromUtf8(this.omidPartnerVersion_);
        }

        public String getOmidVersion() {
            return this.omidVersion_;
        }

        public ByteString getOmidVersionBytes() {
            return ByteString.copyFromUtf8(this.omidVersion_);
        }

        public Platform getPlatform() {
            Platform forNumber = Platform.forNumber(this.platform_);
            return forNumber == null ? Platform.UNRECOGNIZED : forNumber;
        }

        public int getPlatformValue() {
            return this.platform_;
        }

        public String getScarVersionName() {
            return this.scarVersionName_;
        }

        public ByteString getScarVersionNameBytes() {
            return ByteString.copyFromUtf8(this.scarVersionName_);
        }

        public String getSdkDevelopmentPlatform() {
            return this.sdkDevelopmentPlatform_;
        }

        public ByteString getSdkDevelopmentPlatformBytes() {
            return ByteString.copyFromUtf8(this.sdkDevelopmentPlatform_);
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

        public boolean getTest() {
            return this.test_;
        }

        public boolean hasAdQualitySdkVersion() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasCustomMediationName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIsFidAvailable() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasMediationAdapterVersion() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasMediationVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOfferwallVersion() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasOmidPartnerVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasOmidVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasScarVersionName() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSdkDevelopmentPlatform() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(ClientInfo clientInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(clientInfo);
        }

        public static ClientInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ClientInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(InputStream inputStream) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ClientInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ClientInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClientInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ClientInfoOrBuilder extends MessageLiteOrBuilder {
        String getAdQualitySdkVersion();

        ByteString getAdQualitySdkVersionBytes();

        String getCustomMediationName();

        ByteString getCustomMediationNameBytes();

        String getGameId();

        ByteString getGameIdBytes();

        boolean getIsFidAvailable();

        String getMediationAdapterVersion();

        ByteString getMediationAdapterVersionBytes();

        MediationProvider getMediationProvider();

        int getMediationProviderValue();

        String getMediationVersion();

        ByteString getMediationVersionBytes();

        String getOfferwallVersion();

        ByteString getOfferwallVersionBytes();

        String getOmidPartnerVersion();

        ByteString getOmidPartnerVersionBytes();

        String getOmidVersion();

        ByteString getOmidVersionBytes();

        Platform getPlatform();

        int getPlatformValue();

        String getScarVersionName();

        ByteString getScarVersionNameBytes();

        String getSdkDevelopmentPlatform();

        ByteString getSdkDevelopmentPlatformBytes();

        int getSdkVersion();

        String getSdkVersionName();

        ByteString getSdkVersionNameBytes();

        boolean getTest();

        boolean hasAdQualitySdkVersion();

        boolean hasCustomMediationName();

        boolean hasIsFidAvailable();

        boolean hasMediationAdapterVersion();

        boolean hasMediationVersion();

        boolean hasOfferwallVersion();

        boolean hasOmidPartnerVersion();

        boolean hasOmidVersion();

        boolean hasScarVersionName();

        boolean hasSdkDevelopmentPlatform();
    }

    public enum MediationProvider implements Internal.EnumLite {
        MEDIATION_PROVIDER_UNSPECIFIED(0),
        MEDIATION_PROVIDER_CUSTOM(1),
        MEDIATION_PROVIDER_ADMOB(2),
        MEDIATION_PROVIDER_MAX(3),
        MEDIATION_PROVIDER_LEVELPLAY(4),
        UNRECOGNIZED(-1);

        public static final int MEDIATION_PROVIDER_ADMOB_VALUE = 2;
        public static final int MEDIATION_PROVIDER_CUSTOM_VALUE = 1;
        public static final int MEDIATION_PROVIDER_LEVELPLAY_VALUE = 4;
        public static final int MEDIATION_PROVIDER_MAX_VALUE = 3;
        public static final int MEDIATION_PROVIDER_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediationProvider findValueByNumber(int i) {
                return MediationProvider.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return MediationProvider.forNumber(i) != null;
            }
        }

        MediationProvider(int i) {
            this.value = i;
        }

        public static MediationProvider forNumber(int i) {
            if (i == 0) {
                return MEDIATION_PROVIDER_UNSPECIFIED;
            }
            if (i == 1) {
                return MEDIATION_PROVIDER_CUSTOM;
            }
            if (i == 2) {
                return MEDIATION_PROVIDER_ADMOB;
            }
            if (i == 3) {
                return MEDIATION_PROVIDER_MAX;
            }
            if (i != 4) {
                return null;
            }
            return MEDIATION_PROVIDER_LEVELPLAY;
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
        public static MediationProvider valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum Platform implements Internal.EnumLite {
        PLATFORM_UNSPECIFIED(0),
        PLATFORM_ANDROID(1),
        PLATFORM_IOS(2),
        UNRECOGNIZED(-1);

        public static final int PLATFORM_ANDROID_VALUE = 1;
        public static final int PLATFORM_IOS_VALUE = 2;
        public static final int PLATFORM_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Platform findValueByNumber(int i) {
                return Platform.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return Platform.forNumber(i) != null;
            }
        }

        Platform(int i) {
            this.value = i;
        }

        public static Platform forNumber(int i) {
            if (i == 0) {
                return PLATFORM_UNSPECIFIED;
            }
            if (i == 1) {
                return PLATFORM_ANDROID;
            }
            if (i != 2) {
                return null;
            }
            return PLATFORM_IOS;
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
        public static Platform valueOf(int i) {
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

    private ClientInfoOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
