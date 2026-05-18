package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationResponseOuterClass {

    public static final class InitializationResponse extends GeneratedMessageLite implements InitializationResponseOrBuilder {
        public static final int COUNT_OF_LAST_SHOWN_CAMPAIGNS_FIELD_NUMBER = 5;
        private static final InitializationResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int NATIVE_CONFIGURATION_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int SCAR_ELIGIBLE_FORMATS_FIELD_NUMBER = 7;
        public static final int SCAR_PLACEMENTS_FIELD_NUMBER = 6;
        public static final int TRIGGER_INITIALIZATION_COMPLETED_REQUEST_FIELD_NUMBER = 4;
        public static final int UNIVERSAL_REQUEST_URL_FIELD_NUMBER = 2;
        private static final Internal.ListAdapter.Converter scarEligibleFormats_converter_ = new a();
        private int bitField0_;
        private int countOfLastShownCampaigns_;
        private ErrorOuterClass.Error error_;
        private NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration_;
        private int scarEligibleFormatsMemoizedSerializedSize;
        private boolean triggerInitializationCompletedRequest_;
        private MapFieldLite scarPlacements_ = MapFieldLite.emptyMapField();
        private String universalRequestUrl_ = "";
        private Internal.IntList scarEligibleFormats_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.Builder implements InitializationResponseOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllScarEligibleFormats(Iterable iterable) {
                copyOnWrite();
                InitializationResponse.access$2200((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addAllScarEligibleFormatsValue(Iterable iterable) {
                copyOnWrite();
                InitializationResponse.access$2600((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addScarEligibleFormats(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                InitializationResponse.access$2100((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, adFormat);
                return this;
            }

            public Builder addScarEligibleFormatsValue(int i) {
                copyOnWrite();
                InitializationResponse.access$2500((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder clearCountOfLastShownCampaigns() {
                copyOnWrite();
                InitializationResponse.access$1800((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                InitializationResponse.access$1400((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearNativeConfiguration() {
                copyOnWrite();
                InitializationResponse.access$800((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScarEligibleFormats() {
                copyOnWrite();
                InitializationResponse.access$2300((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearScarPlacements() {
                copyOnWrite();
                InitializationResponse.access$1900((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).clear();
                return this;
            }

            public Builder clearTriggerInitializationCompletedRequest() {
                copyOnWrite();
                InitializationResponse.access$1600((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearUniversalRequestUrl() {
                copyOnWrite();
                InitializationResponse.access$1000((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean containsScarPlacements(String str) {
                str.getClass();
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarPlacementsMap().containsKey(str);
            }

            public int getCountOfLastShownCampaigns() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getCountOfLastShownCampaigns();
            }

            public ErrorOuterClass.Error getError() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getError();
            }

            public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getNativeConfiguration();
            }

            public AdFormatOuterClass.AdFormat getScarEligibleFormats(int i) {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarEligibleFormats(i);
            }

            public int getScarEligibleFormatsCount() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarEligibleFormatsCount();
            }

            public List getScarEligibleFormatsList() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarEligibleFormatsList();
            }

            public int getScarEligibleFormatsValue(int i) {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarEligibleFormatsValue(i);
            }

            public List getScarEligibleFormatsValueList() {
                return Collections.unmodifiableList(((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarEligibleFormatsValueList());
            }

            @Deprecated
            public Map getScarPlacements() {
                return getScarPlacementsMap();
            }

            public int getScarPlacementsCount() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarPlacementsMap().size();
            }

            public Map getScarPlacementsMap() {
                return Collections.unmodifiableMap(((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarPlacementsMap());
            }

            public Placement getScarPlacementsOrDefault(String str, Placement placement) {
                str.getClass();
                Map scarPlacementsMap = ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarPlacementsMap();
                return scarPlacementsMap.containsKey(str) ? (Placement) scarPlacementsMap.get(str) : placement;
            }

            public Placement getScarPlacementsOrThrow(String str) {
                str.getClass();
                Map scarPlacementsMap = ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getScarPlacementsMap();
                if (scarPlacementsMap.containsKey(str)) {
                    return (Placement) scarPlacementsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public boolean getTriggerInitializationCompletedRequest() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getTriggerInitializationCompletedRequest();
            }

            public String getUniversalRequestUrl() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getUniversalRequestUrl();
            }

            public ByteString getUniversalRequestUrlBytes() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).getUniversalRequestUrlBytes();
            }

            public boolean hasError() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).hasError();
            }

            public boolean hasNativeConfiguration() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).hasNativeConfiguration();
            }

            public boolean hasUniversalRequestUrl() {
                return ((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).hasUniversalRequestUrl();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                InitializationResponse.access$1300((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            public Builder mergeNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
                copyOnWrite();
                InitializationResponse.access$700((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, nativeConfiguration);
                return this;
            }

            public Builder putAllScarPlacements(Map map) {
                copyOnWrite();
                InitializationResponse.access$1900((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).putAll(map);
                return this;
            }

            public Builder putScarPlacements(String str, Placement placement) {
                str.getClass();
                placement.getClass();
                copyOnWrite();
                InitializationResponse.access$1900((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).put(str, placement);
                return this;
            }

            public Builder removeScarPlacements(String str) {
                str.getClass();
                copyOnWrite();
                InitializationResponse.access$1900((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance).remove(str);
                return this;
            }

            public Builder setCountOfLastShownCampaigns(int i) {
                copyOnWrite();
                InitializationResponse.access$1700((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                InitializationResponse.access$1200((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            public Builder setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
                copyOnWrite();
                InitializationResponse.access$600((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, nativeConfiguration);
                return this;
            }

            public Builder setScarEligibleFormats(int i, AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                InitializationResponse.access$2000((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, i, adFormat);
                return this;
            }

            public Builder setScarEligibleFormatsValue(int i, int i2) {
                copyOnWrite();
                InitializationResponse.access$2400((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, i, i2);
                return this;
            }

            public Builder setTriggerInitializationCompletedRequest(boolean z) {
                copyOnWrite();
                InitializationResponse.access$1500((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setUniversalRequestUrl(String str) {
                copyOnWrite();
                InitializationResponse.access$900((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setUniversalRequestUrlBytes(ByteString byteString) {
                copyOnWrite();
                InitializationResponse.access$1100((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(InitializationResponse.access$500());
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                InitializationResponse.access$1200((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, (ErrorOuterClass.Error) builder.build());
                return this;
            }

            public Builder setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                copyOnWrite();
                InitializationResponse.access$600((InitializationResponse) ((GeneratedMessageLite.Builder) this).instance, (NativeConfigurationOuterClass.NativeConfiguration) builder.build());
                return this;
            }
        }

        public class a implements Internal.ListAdapter.Converter {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AdFormatOuterClass.AdFormat convert(Integer num) {
                AdFormatOuterClass.AdFormat forNumber = AdFormatOuterClass.AdFormat.forNumber(num.intValue());
                return forNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
            }
        }

        public static final class b {
            public static final MapEntryLite a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Placement.getDefaultInstance());
        }

        static {
            InitializationResponse initializationResponse = new InitializationResponse();
            DEFAULT_INSTANCE = initializationResponse;
            GeneratedMessageLite.registerDefaultInstance(InitializationResponse.class, initializationResponse);
        }

        private InitializationResponse() {
        }

        public static /* synthetic */ void access$1000(InitializationResponse initializationResponse) {
            initializationResponse.clearUniversalRequestUrl();
        }

        public static /* synthetic */ void access$1100(InitializationResponse initializationResponse, ByteString byteString) {
            initializationResponse.setUniversalRequestUrlBytes(byteString);
        }

        public static /* synthetic */ void access$1200(InitializationResponse initializationResponse, ErrorOuterClass.Error error) {
            initializationResponse.setError(error);
        }

        public static /* synthetic */ void access$1300(InitializationResponse initializationResponse, ErrorOuterClass.Error error) {
            initializationResponse.mergeError(error);
        }

        public static /* synthetic */ void access$1400(InitializationResponse initializationResponse) {
            initializationResponse.clearError();
        }

        public static /* synthetic */ void access$1500(InitializationResponse initializationResponse, boolean z) {
            initializationResponse.setTriggerInitializationCompletedRequest(z);
        }

        public static /* synthetic */ void access$1600(InitializationResponse initializationResponse) {
            initializationResponse.clearTriggerInitializationCompletedRequest();
        }

        public static /* synthetic */ void access$1700(InitializationResponse initializationResponse, int i) {
            initializationResponse.setCountOfLastShownCampaigns(i);
        }

        public static /* synthetic */ void access$1800(InitializationResponse initializationResponse) {
            initializationResponse.clearCountOfLastShownCampaigns();
        }

        public static /* synthetic */ Map access$1900(InitializationResponse initializationResponse) {
            return initializationResponse.getMutableScarPlacementsMap();
        }

        public static /* synthetic */ void access$2000(InitializationResponse initializationResponse, int i, AdFormatOuterClass.AdFormat adFormat) {
            initializationResponse.setScarEligibleFormats(i, adFormat);
        }

        public static /* synthetic */ void access$2100(InitializationResponse initializationResponse, AdFormatOuterClass.AdFormat adFormat) {
            initializationResponse.addScarEligibleFormats(adFormat);
        }

        public static /* synthetic */ void access$2200(InitializationResponse initializationResponse, Iterable iterable) {
            initializationResponse.addAllScarEligibleFormats(iterable);
        }

        public static /* synthetic */ void access$2300(InitializationResponse initializationResponse) {
            initializationResponse.clearScarEligibleFormats();
        }

        public static /* synthetic */ void access$2400(InitializationResponse initializationResponse, int i, int i2) {
            initializationResponse.setScarEligibleFormatsValue(i, i2);
        }

        public static /* synthetic */ void access$2500(InitializationResponse initializationResponse, int i) {
            initializationResponse.addScarEligibleFormatsValue(i);
        }

        public static /* synthetic */ void access$2600(InitializationResponse initializationResponse, Iterable iterable) {
            initializationResponse.addAllScarEligibleFormatsValue(iterable);
        }

        public static /* synthetic */ InitializationResponse access$500() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$600(InitializationResponse initializationResponse, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            initializationResponse.setNativeConfiguration(nativeConfiguration);
        }

        public static /* synthetic */ void access$700(InitializationResponse initializationResponse, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            initializationResponse.mergeNativeConfiguration(nativeConfiguration);
        }

        public static /* synthetic */ void access$800(InitializationResponse initializationResponse) {
            initializationResponse.clearNativeConfiguration();
        }

        public static /* synthetic */ void access$900(InitializationResponse initializationResponse, String str) {
            initializationResponse.setUniversalRequestUrl(str);
        }

        private void addAllScarEligibleFormats(Iterable iterable) {
            ensureScarEligibleFormatsIsMutable();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.scarEligibleFormats_.addInt(((AdFormatOuterClass.AdFormat) it.next()).getNumber());
            }
        }

        private void addAllScarEligibleFormatsValue(Iterable iterable) {
            ensureScarEligibleFormatsIsMutable();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.scarEligibleFormats_.addInt(((Integer) it.next()).intValue());
            }
        }

        private void addScarEligibleFormats(AdFormatOuterClass.AdFormat adFormat) {
            adFormat.getClass();
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(adFormat.getNumber());
        }

        private void addScarEligibleFormatsValue(int i) {
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.addInt(i);
        }

        private void clearCountOfLastShownCampaigns() {
            this.countOfLastShownCampaigns_ = 0;
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -5;
        }

        private void clearNativeConfiguration() {
            this.nativeConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        private void clearScarEligibleFormats() {
            this.scarEligibleFormats_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearTriggerInitializationCompletedRequest() {
            this.triggerInitializationCompletedRequest_ = false;
        }

        private void clearUniversalRequestUrl() {
            this.bitField0_ &= -3;
            this.universalRequestUrl_ = getDefaultInstance().getUniversalRequestUrl();
        }

        private void ensureScarEligibleFormatsIsMutable() {
            Internal.IntList intList = this.scarEligibleFormats_;
            if (intList.isModifiable()) {
                return;
            }
            this.scarEligibleFormats_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static InitializationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map getMutableScarPlacementsMap() {
            return internalGetMutableScarPlacements();
        }

        private MapFieldLite internalGetMutableScarPlacements() {
            if (!this.scarPlacements_.isMutable()) {
                this.scarPlacements_ = this.scarPlacements_.mutableCopy();
            }
            return this.scarPlacements_;
        }

        private MapFieldLite internalGetScarPlacements() {
            return this.scarPlacements_;
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

        private void mergeNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            nativeConfiguration.getClass();
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration2 = this.nativeConfiguration_;
            if (nativeConfiguration2 == null || nativeConfiguration2 == NativeConfigurationOuterClass.NativeConfiguration.getDefaultInstance()) {
                this.nativeConfiguration_ = nativeConfiguration;
            } else {
                this.nativeConfiguration_ = (NativeConfigurationOuterClass.NativeConfiguration) ((NativeConfigurationOuterClass.NativeConfiguration.Builder) NativeConfigurationOuterClass.NativeConfiguration.newBuilder(this.nativeConfiguration_).mergeFrom(nativeConfiguration)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCountOfLastShownCampaigns(int i) {
            this.countOfLastShownCampaigns_ = i;
        }

        private void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 4;
        }

        private void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            nativeConfiguration.getClass();
            this.nativeConfiguration_ = nativeConfiguration;
            this.bitField0_ |= 1;
        }

        private void setScarEligibleFormats(int i, AdFormatOuterClass.AdFormat adFormat) {
            adFormat.getClass();
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(i, adFormat.getNumber());
        }

        private void setScarEligibleFormatsValue(int i, int i2) {
            ensureScarEligibleFormatsIsMutable();
            this.scarEligibleFormats_.setInt(i, i2);
        }

        private void setTriggerInitializationCompletedRequest(boolean z) {
            this.triggerInitializationCompletedRequest_ = z;
        }

        private void setUniversalRequestUrl(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.universalRequestUrl_ = str;
        }

        private void setUniversalRequestUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.universalRequestUrl_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        public boolean containsScarPlacements(String str) {
            str.getClass();
            return internalGetScarPlacements().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationResponse();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004\u0007\u0005\u0004\u00062\u0007,", new Object[]{"bitField0_", "nativeConfiguration_", "universalRequestUrl_", "error_", "triggerInitializationCompletedRequest_", "countOfLastShownCampaigns_", "scarPlacements_", b.a, "scarEligibleFormats_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (InitializationResponse.class) {
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

        public int getCountOfLastShownCampaigns() {
            return this.countOfLastShownCampaigns_;
        }

        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            return error == null ? ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this.nativeConfiguration_;
            return nativeConfiguration == null ? NativeConfigurationOuterClass.NativeConfiguration.getDefaultInstance() : nativeConfiguration;
        }

        public AdFormatOuterClass.AdFormat getScarEligibleFormats(int i) {
            AdFormatOuterClass.AdFormat forNumber = AdFormatOuterClass.AdFormat.forNumber(this.scarEligibleFormats_.getInt(i));
            return forNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : forNumber;
        }

        public int getScarEligibleFormatsCount() {
            return this.scarEligibleFormats_.size();
        }

        public List getScarEligibleFormatsList() {
            return new Internal.ListAdapter(this.scarEligibleFormats_, scarEligibleFormats_converter_);
        }

        public int getScarEligibleFormatsValue(int i) {
            return this.scarEligibleFormats_.getInt(i);
        }

        public List getScarEligibleFormatsValueList() {
            return this.scarEligibleFormats_;
        }

        @Deprecated
        public Map getScarPlacements() {
            return getScarPlacementsMap();
        }

        public int getScarPlacementsCount() {
            return internalGetScarPlacements().size();
        }

        public Map getScarPlacementsMap() {
            return Collections.unmodifiableMap(internalGetScarPlacements());
        }

        public Placement getScarPlacementsOrDefault(String str, Placement placement) {
            str.getClass();
            MapFieldLite internalGetScarPlacements = internalGetScarPlacements();
            return internalGetScarPlacements.containsKey(str) ? (Placement) internalGetScarPlacements.get(str) : placement;
        }

        public Placement getScarPlacementsOrThrow(String str) {
            str.getClass();
            MapFieldLite internalGetScarPlacements = internalGetScarPlacements();
            if (internalGetScarPlacements.containsKey(str)) {
                return (Placement) internalGetScarPlacements.get(str);
            }
            throw new IllegalArgumentException();
        }

        public boolean getTriggerInitializationCompletedRequest() {
            return this.triggerInitializationCompletedRequest_;
        }

        public String getUniversalRequestUrl() {
            return this.universalRequestUrl_;
        }

        public ByteString getUniversalRequestUrlBytes() {
            return ByteString.copyFromUtf8(this.universalRequestUrl_);
        }

        public boolean hasError() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasNativeConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUniversalRequestUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(InitializationResponse initializationResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(initializationResponse);
        }

        public static InitializationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(InputStream inputStream) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface InitializationResponseOrBuilder extends MessageLiteOrBuilder {
        boolean containsScarPlacements(String str);

        int getCountOfLastShownCampaigns();

        ErrorOuterClass.Error getError();

        NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

        AdFormatOuterClass.AdFormat getScarEligibleFormats(int i);

        int getScarEligibleFormatsCount();

        List getScarEligibleFormatsList();

        int getScarEligibleFormatsValue(int i);

        List getScarEligibleFormatsValueList();

        @Deprecated
        Map getScarPlacements();

        int getScarPlacementsCount();

        Map getScarPlacementsMap();

        Placement getScarPlacementsOrDefault(String str, Placement placement);

        Placement getScarPlacementsOrThrow(String str);

        boolean getTriggerInitializationCompletedRequest();

        String getUniversalRequestUrl();

        ByteString getUniversalRequestUrlBytes();

        boolean hasError();

        boolean hasNativeConfiguration();

        boolean hasUniversalRequestUrl();
    }

    public static final class Placement extends GeneratedMessageLite implements PlacementOrBuilder {
        public static final int AD_FORMAT_FIELD_NUMBER = 1;
        private static final Placement DEFAULT_INSTANCE;
        private static volatile Parser PARSER;
        private int adFormat_;

        public static final class Builder extends GeneratedMessageLite.Builder implements PlacementOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdFormat() {
                copyOnWrite();
                Placement.access$300((Placement) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public AdFormatOuterClass.AdFormat getAdFormat() {
                return ((Placement) ((GeneratedMessageLite.Builder) this).instance).getAdFormat();
            }

            public int getAdFormatValue() {
                return ((Placement) ((GeneratedMessageLite.Builder) this).instance).getAdFormatValue();
            }

            public Builder setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
                copyOnWrite();
                Placement.access$200((Placement) ((GeneratedMessageLite.Builder) this).instance, adFormat);
                return this;
            }

            public Builder setAdFormatValue(int i) {
                copyOnWrite();
                Placement.access$100((Placement) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(Placement.access$000());
            }
        }

        static {
            Placement placement = new Placement();
            DEFAULT_INSTANCE = placement;
            GeneratedMessageLite.registerDefaultInstance(Placement.class, placement);
        }

        private Placement() {
        }

        public static /* synthetic */ Placement access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(Placement placement, int i) {
            placement.setAdFormatValue(i);
        }

        public static /* synthetic */ void access$200(Placement placement, AdFormatOuterClass.AdFormat adFormat) {
            placement.setAdFormat(adFormat);
        }

        public static /* synthetic */ void access$300(Placement placement) {
            placement.clearAdFormat();
        }

        private void clearAdFormat() {
            this.adFormat_ = 0;
        }

        public static Placement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Placement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormatOuterClass.AdFormat adFormat) {
            this.adFormat_ = adFormat.getNumber();
        }

        private void setAdFormatValue(int i) {
            this.adFormat_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Placement();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"adFormat_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Placement.class) {
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

        public static Builder newBuilder(Placement placement) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(placement);
        }

        public static Placement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Placement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Placement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Placement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Placement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Placement parseFrom(InputStream inputStream) throws IOException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Placement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Placement parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Placement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Placement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PlacementOrBuilder extends MessageLiteOrBuilder {
        AdFormatOuterClass.AdFormat getAdFormat();

        int getAdFormatValue();
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

    private InitializationResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
