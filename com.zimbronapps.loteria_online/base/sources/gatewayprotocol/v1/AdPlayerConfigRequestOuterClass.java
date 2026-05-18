package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdPlayerConfigRequestOuterClass {

    public static final class AdPlayerConfigRequest extends GeneratedMessageLite implements AdPlayerConfigRequestOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 5;
        public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 1;
        private static final AdPlayerConfigRequest DEFAULT_INSTANCE;
        public static final int EXTRAS_FIELD_NUMBER = 7;
        public static final int IMPRESSION_OPPORTUNITY_ID_FIELD_NUMBER = 4;
        public static final int MEDIATION_AD_UNIT_ID_FIELD_NUMBER = 6;
        public static final int MEDIATION_INFO_FIELD_NUMBER = 8;
        private static volatile Parser PARSER = null;
        public static final int PLACEMENT_ID_FIELD_NUMBER = 2;
        public static final int WEBVIEW_VERSION_FIELD_NUMBER = 9;
        private int adFormat_;
        private int bitField0_;
        private ByteString configurationToken_;
        private MapFieldLite extras_ = MapFieldLite.emptyMapField();
        private ByteString impressionOpportunityId_;
        private String mediationAdUnitId_;
        private MediationInfoOuterClass.MediationInfo mediationInfo_;
        private String placementId_;
        private int webviewVersion_;

        public static final class Builder extends GeneratedMessageLite.Builder implements AdPlayerConfigRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                AdPlayerConfigRequest.access$1200((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearConfigurationToken() {
                copyOnWrite();
                AdPlayerConfigRequest.access$200((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearExtras() {
                copyOnWrite();
                AdPlayerConfigRequest.access$1600((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).clear();
                return this;
            }

            public Builder clearImpressionOpportunityId() {
                copyOnWrite();
                AdPlayerConfigRequest.access$900((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationAdUnitId() {
                copyOnWrite();
                AdPlayerConfigRequest.access$1400((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMediationInfo() {
                copyOnWrite();
                AdPlayerConfigRequest.access$1900((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPlacementId() {
                copyOnWrite();
                AdPlayerConfigRequest.access$400((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWebviewVersion() {
                copyOnWrite();
                AdPlayerConfigRequest.access$700((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean containsExtras(String str) {
                str.getClass();
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap().containsKey(str);
            }

            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getAdFormat();
            }

            public int getAdFormatValue() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getAdFormatValue();
            }

            public ByteString getConfigurationToken() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getConfigurationToken();
            }

            @Deprecated
            public Map getExtras() {
                return getExtrasMap();
            }

            public int getExtrasCount() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap().size();
            }

            public Map getExtrasMap() {
                return Collections.unmodifiableMap(((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap());
            }

            public String getExtrasOrDefault(String str, String str2) {
                str.getClass();
                Map extrasMap = ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap();
                return extrasMap.containsKey(str) ? (String) extrasMap.get(str) : str2;
            }

            public String getExtrasOrThrow(String str) {
                str.getClass();
                Map extrasMap = ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getExtrasMap();
                if (extrasMap.containsKey(str)) {
                    return (String) extrasMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public ByteString getImpressionOpportunityId() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getImpressionOpportunityId();
            }

            public String getMediationAdUnitId() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getMediationAdUnitId();
            }

            public ByteString getMediationAdUnitIdBytes() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getMediationAdUnitIdBytes();
            }

            public MediationInfoOuterClass.MediationInfo getMediationInfo() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getMediationInfo();
            }

            public String getPlacementId() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getPlacementId();
            }

            public ByteString getPlacementIdBytes() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getPlacementIdBytes();
            }

            public int getWebviewVersion() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).getWebviewVersion();
            }

            public boolean hasAdFormat() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).hasAdFormat();
            }

            public boolean hasMediationAdUnitId() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).hasMediationAdUnitId();
            }

            public boolean hasMediationInfo() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).hasMediationInfo();
            }

            public boolean hasWebviewVersion() {
                return ((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).hasWebviewVersion();
            }

            public Builder mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                AdPlayerConfigRequest.access$1800((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, mediationInfo);
                return this;
            }

            public Builder putAllExtras(Map map) {
                copyOnWrite();
                AdPlayerConfigRequest.access$1600((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).putAll(map);
                return this;
            }

            public Builder putExtras(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                AdPlayerConfigRequest.access$1600((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).put(str, str2);
                return this;
            }

            public Builder removeExtras(String str) {
                str.getClass();
                copyOnWrite();
                AdPlayerConfigRequest.access$1600((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance).remove(str);
                return this;
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                AdPlayerConfigRequest.access$1100((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i) {
                copyOnWrite();
                AdPlayerConfigRequest.access$1000((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setConfigurationToken(ByteString byteString) {
                copyOnWrite();
                AdPlayerConfigRequest.access$100((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setImpressionOpportunityId(ByteString byteString) {
                copyOnWrite();
                AdPlayerConfigRequest.access$800((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setMediationAdUnitId(String str) {
                copyOnWrite();
                AdPlayerConfigRequest.access$1300((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setMediationAdUnitIdBytes(ByteString byteString) {
                copyOnWrite();
                AdPlayerConfigRequest.access$1500((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
                copyOnWrite();
                AdPlayerConfigRequest.access$1700((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, mediationInfo);
                return this;
            }

            public Builder setPlacementId(String str) {
                copyOnWrite();
                AdPlayerConfigRequest.access$300((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setPlacementIdBytes(ByteString byteString) {
                copyOnWrite();
                AdPlayerConfigRequest.access$500((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setWebviewVersion(int i) {
                copyOnWrite();
                AdPlayerConfigRequest.access$600((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(AdPlayerConfigRequest.access$000());
            }

            public Builder setMediationInfo(MediationInfoOuterClass.MediationInfo.Builder builder) {
                copyOnWrite();
                AdPlayerConfigRequest.access$1700((AdPlayerConfigRequest) ((GeneratedMessageLite.Builder) this).instance, (MediationInfoOuterClass.MediationInfo) builder.build());
                return this;
            }
        }

        public static final class a {
            public static final MapEntryLite a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
            }
        }

        static {
            AdPlayerConfigRequest adPlayerConfigRequest = new AdPlayerConfigRequest();
            DEFAULT_INSTANCE = adPlayerConfigRequest;
            GeneratedMessageLite.registerDefaultInstance(AdPlayerConfigRequest.class, adPlayerConfigRequest);
        }

        private AdPlayerConfigRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.configurationToken_ = byteString;
            this.placementId_ = "";
            this.impressionOpportunityId_ = byteString;
            this.mediationAdUnitId_ = "";
        }

        public static /* synthetic */ AdPlayerConfigRequest access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(AdPlayerConfigRequest adPlayerConfigRequest, ByteString byteString) {
            adPlayerConfigRequest.setConfigurationToken(byteString);
        }

        public static /* synthetic */ void access$1000(AdPlayerConfigRequest adPlayerConfigRequest, int i) {
            adPlayerConfigRequest.setAdFormatValue(i);
        }

        public static /* synthetic */ void access$1100(AdPlayerConfigRequest adPlayerConfigRequest, AdFormatOuterClass.AdFormat adFormat) {
            adPlayerConfigRequest.setAdFormat(adFormat);
        }

        public static /* synthetic */ void access$1200(AdPlayerConfigRequest adPlayerConfigRequest) {
            adPlayerConfigRequest.clearAdFormat();
        }

        public static /* synthetic */ void access$1300(AdPlayerConfigRequest adPlayerConfigRequest, String str) {
            adPlayerConfigRequest.setMediationAdUnitId(str);
        }

        public static /* synthetic */ void access$1400(AdPlayerConfigRequest adPlayerConfigRequest) {
            adPlayerConfigRequest.clearMediationAdUnitId();
        }

        public static /* synthetic */ void access$1500(AdPlayerConfigRequest adPlayerConfigRequest, ByteString byteString) {
            adPlayerConfigRequest.setMediationAdUnitIdBytes(byteString);
        }

        public static /* synthetic */ Map access$1600(AdPlayerConfigRequest adPlayerConfigRequest) {
            return adPlayerConfigRequest.getMutableExtrasMap();
        }

        public static /* synthetic */ void access$1700(AdPlayerConfigRequest adPlayerConfigRequest, MediationInfoOuterClass.MediationInfo mediationInfo) {
            adPlayerConfigRequest.setMediationInfo(mediationInfo);
        }

        public static /* synthetic */ void access$1800(AdPlayerConfigRequest adPlayerConfigRequest, MediationInfoOuterClass.MediationInfo mediationInfo) {
            adPlayerConfigRequest.mergeMediationInfo(mediationInfo);
        }

        public static /* synthetic */ void access$1900(AdPlayerConfigRequest adPlayerConfigRequest) {
            adPlayerConfigRequest.clearMediationInfo();
        }

        public static /* synthetic */ void access$200(AdPlayerConfigRequest adPlayerConfigRequest) {
            adPlayerConfigRequest.clearConfigurationToken();
        }

        public static /* synthetic */ void access$300(AdPlayerConfigRequest adPlayerConfigRequest, String str) {
            adPlayerConfigRequest.setPlacementId(str);
        }

        public static /* synthetic */ void access$400(AdPlayerConfigRequest adPlayerConfigRequest) {
            adPlayerConfigRequest.clearPlacementId();
        }

        public static /* synthetic */ void access$500(AdPlayerConfigRequest adPlayerConfigRequest, ByteString byteString) {
            adPlayerConfigRequest.setPlacementIdBytes(byteString);
        }

        public static /* synthetic */ void access$600(AdPlayerConfigRequest adPlayerConfigRequest, int i) {
            adPlayerConfigRequest.setWebviewVersion(i);
        }

        public static /* synthetic */ void access$700(AdPlayerConfigRequest adPlayerConfigRequest) {
            adPlayerConfigRequest.clearWebviewVersion();
        }

        public static /* synthetic */ void access$800(AdPlayerConfigRequest adPlayerConfigRequest, ByteString byteString) {
            adPlayerConfigRequest.setImpressionOpportunityId(byteString);
        }

        public static /* synthetic */ void access$900(AdPlayerConfigRequest adPlayerConfigRequest) {
            adPlayerConfigRequest.clearImpressionOpportunityId();
        }

        private void clearAdFormat() {
            this.bitField0_ &= -3;
            this.adFormat_ = 0;
        }

        private void clearConfigurationToken() {
            this.configurationToken_ = getDefaultInstance().getConfigurationToken();
        }

        private void clearImpressionOpportunityId() {
            this.impressionOpportunityId_ = getDefaultInstance().getImpressionOpportunityId();
        }

        private void clearMediationAdUnitId() {
            this.bitField0_ &= -5;
            this.mediationAdUnitId_ = getDefaultInstance().getMediationAdUnitId();
        }

        private void clearMediationInfo() {
            this.mediationInfo_ = null;
            this.bitField0_ &= -9;
        }

        private void clearPlacementId() {
            this.placementId_ = getDefaultInstance().getPlacementId();
        }

        private void clearWebviewVersion() {
            this.bitField0_ &= -2;
            this.webviewVersion_ = 0;
        }

        public static AdPlayerConfigRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map getMutableExtrasMap() {
            return internalGetMutableExtras();
        }

        private MapFieldLite internalGetExtras() {
            return this.extras_;
        }

        private MapFieldLite internalGetMutableExtras() {
            if (!this.extras_.isMutable()) {
                this.extras_ = this.extras_.mutableCopy();
            }
            return this.extras_;
        }

        private void mergeMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            MediationInfoOuterClass.MediationInfo mediationInfo2 = this.mediationInfo_;
            if (mediationInfo2 == null || mediationInfo2 == MediationInfoOuterClass.MediationInfo.getDefaultInstance()) {
                this.mediationInfo_ = mediationInfo;
            } else {
                this.mediationInfo_ = (MediationInfoOuterClass.MediationInfo) ((MediationInfoOuterClass.MediationInfo.Builder) MediationInfoOuterClass.MediationInfo.newBuilder(this.mediationInfo_).mergeFrom(mediationInfo)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AdPlayerConfigRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
            this.bitField0_ |= 2;
        }

        private void setAdFormatValue(int i) {
            this.bitField0_ |= 2;
            this.adFormat_ = i;
        }

        private void setConfigurationToken(ByteString byteString) {
            byteString.getClass();
            this.configurationToken_ = byteString;
        }

        private void setImpressionOpportunityId(ByteString byteString) {
            byteString.getClass();
            this.impressionOpportunityId_ = byteString;
        }

        private void setMediationAdUnitId(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.mediationAdUnitId_ = str;
        }

        private void setMediationAdUnitIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.mediationAdUnitId_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setMediationInfo(MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            this.mediationInfo_ = mediationInfo;
            this.bitField0_ |= 8;
        }

        private void setPlacementId(String str) {
            str.getClass();
            this.placementId_ = str;
        }

        private void setPlacementIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.placementId_ = byteString.toStringUtf8();
        }

        private void setWebviewVersion(int i) {
            this.bitField0_ |= 1;
            this.webviewVersion_ = i;
        }

        public boolean containsExtras(String str) {
            str.getClass();
            return internalGetExtras().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdPlayerConfigRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\t\b\u0001\u0000\u0000\u0001\n\u0002Ȉ\u0004\n\u0005ဌ\u0001\u0006ለ\u0002\u00072\bဉ\u0003\tင\u0000", new Object[]{"bitField0_", "configurationToken_", "placementId_", "impressionOpportunityId_", "adFormat_", "mediationAdUnitId_", "extras_", a.a, "mediationInfo_", "webviewVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AdPlayerConfigRequest.class) {
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

        public ByteString getConfigurationToken() {
            return this.configurationToken_;
        }

        @Deprecated
        public Map getExtras() {
            return getExtrasMap();
        }

        public int getExtrasCount() {
            return internalGetExtras().size();
        }

        public Map getExtrasMap() {
            return Collections.unmodifiableMap(internalGetExtras());
        }

        public String getExtrasOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite internalGetExtras = internalGetExtras();
            return internalGetExtras.containsKey(str) ? (String) internalGetExtras.get(str) : str2;
        }

        public String getExtrasOrThrow(String str) {
            str.getClass();
            MapFieldLite internalGetExtras = internalGetExtras();
            if (internalGetExtras.containsKey(str)) {
                return (String) internalGetExtras.get(str);
            }
            throw new IllegalArgumentException();
        }

        public ByteString getImpressionOpportunityId() {
            return this.impressionOpportunityId_;
        }

        public String getMediationAdUnitId() {
            return this.mediationAdUnitId_;
        }

        public ByteString getMediationAdUnitIdBytes() {
            return ByteString.copyFromUtf8(this.mediationAdUnitId_);
        }

        public MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this.mediationInfo_;
            return mediationInfo == null ? MediationInfoOuterClass.MediationInfo.getDefaultInstance() : mediationInfo;
        }

        public String getPlacementId() {
            return this.placementId_;
        }

        public ByteString getPlacementIdBytes() {
            return ByteString.copyFromUtf8(this.placementId_);
        }

        public int getWebviewVersion() {
            return this.webviewVersion_;
        }

        public boolean hasAdFormat() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMediationAdUnitId() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMediationInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasWebviewVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AdPlayerConfigRequest adPlayerConfigRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(adPlayerConfigRequest);
        }

        public static AdPlayerConfigRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdPlayerConfigRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdPlayerConfigRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(InputStream inputStream) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdPlayerConfigRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdPlayerConfigRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdPlayerConfigRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdPlayerConfigRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AdPlayerConfigRequestOrBuilder extends MessageLiteOrBuilder {
        boolean containsExtras(String str);

        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();

        ByteString getConfigurationToken();

        @Deprecated
        Map getExtras();

        int getExtrasCount();

        Map getExtrasMap();

        String getExtrasOrDefault(String str, String str2);

        String getExtrasOrThrow(String str);

        ByteString getImpressionOpportunityId();

        String getMediationAdUnitId();

        ByteString getMediationAdUnitIdBytes();

        MediationInfoOuterClass.MediationInfo getMediationInfo();

        String getPlacementId();

        ByteString getPlacementIdBytes();

        int getWebviewVersion();

        boolean hasAdFormat();

        boolean hasMediationAdUnitId();

        boolean hasMediationInfo();

        boolean hasWebviewVersion();
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

    private AdPlayerConfigRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
