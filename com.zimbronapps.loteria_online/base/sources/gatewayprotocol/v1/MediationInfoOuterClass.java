package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ClientInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MediationInfoOuterClass {

    public static final class MediationInfo extends GeneratedMessageLite implements MediationInfoOrBuilder {
        public static final int ADAPTER_VERSION_FIELD_NUMBER = 4;
        public static final int CUSTOM_NAME_FIELD_NUMBER = 2;
        private static final MediationInfo DEFAULT_INSTANCE;
        private static volatile Parser PARSER = null;
        public static final int PROVIDER_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 3;
        private int bitField0_;
        private int provider_;
        private String customName_ = "";
        private String version_ = "";
        private String adapterVersion_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements MediationInfoOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdapterVersion() {
                copyOnWrite();
                MediationInfo.access$1100((MediationInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCustomName() {
                copyOnWrite();
                MediationInfo.access$500((MediationInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearProvider() {
                copyOnWrite();
                MediationInfo.access$300((MediationInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                MediationInfo.access$800((MediationInfo) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public String getAdapterVersion() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).getAdapterVersion();
            }

            public ByteString getAdapterVersionBytes() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).getAdapterVersionBytes();
            }

            public String getCustomName() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).getCustomName();
            }

            public ByteString getCustomNameBytes() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).getCustomNameBytes();
            }

            public ClientInfoOuterClass.MediationProvider getProvider() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).getProvider();
            }

            public int getProviderValue() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).getProviderValue();
            }

            public String getVersion() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).getVersion();
            }

            public ByteString getVersionBytes() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).getVersionBytes();
            }

            public boolean hasAdapterVersion() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).hasAdapterVersion();
            }

            public boolean hasCustomName() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).hasCustomName();
            }

            public boolean hasVersion() {
                return ((MediationInfo) ((GeneratedMessageLite.Builder) this).instance).hasVersion();
            }

            public Builder setAdapterVersion(String str) {
                copyOnWrite();
                MediationInfo.access$1000((MediationInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setAdapterVersionBytes(ByteString byteString) {
                copyOnWrite();
                MediationInfo.access$1200((MediationInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setCustomName(String str) {
                copyOnWrite();
                MediationInfo.access$400((MediationInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setCustomNameBytes(ByteString byteString) {
                copyOnWrite();
                MediationInfo.access$600((MediationInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
                copyOnWrite();
                MediationInfo.access$200((MediationInfo) ((GeneratedMessageLite.Builder) this).instance, mediationProvider);
                return this;
            }

            public Builder setProviderValue(int i) {
                copyOnWrite();
                MediationInfo.access$100((MediationInfo) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setVersion(String str) {
                copyOnWrite();
                MediationInfo.access$700((MediationInfo) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setVersionBytes(ByteString byteString) {
                copyOnWrite();
                MediationInfo.access$900((MediationInfo) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(MediationInfo.access$000());
            }
        }

        static {
            MediationInfo mediationInfo = new MediationInfo();
            DEFAULT_INSTANCE = mediationInfo;
            GeneratedMessageLite.registerDefaultInstance(MediationInfo.class, mediationInfo);
        }

        private MediationInfo() {
        }

        public static /* synthetic */ MediationInfo access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(MediationInfo mediationInfo, int i) {
            mediationInfo.setProviderValue(i);
        }

        public static /* synthetic */ void access$1000(MediationInfo mediationInfo, String str) {
            mediationInfo.setAdapterVersion(str);
        }

        public static /* synthetic */ void access$1100(MediationInfo mediationInfo) {
            mediationInfo.clearAdapterVersion();
        }

        public static /* synthetic */ void access$1200(MediationInfo mediationInfo, ByteString byteString) {
            mediationInfo.setAdapterVersionBytes(byteString);
        }

        public static /* synthetic */ void access$200(MediationInfo mediationInfo, ClientInfoOuterClass.MediationProvider mediationProvider) {
            mediationInfo.setProvider(mediationProvider);
        }

        public static /* synthetic */ void access$300(MediationInfo mediationInfo) {
            mediationInfo.clearProvider();
        }

        public static /* synthetic */ void access$400(MediationInfo mediationInfo, String str) {
            mediationInfo.setCustomName(str);
        }

        public static /* synthetic */ void access$500(MediationInfo mediationInfo) {
            mediationInfo.clearCustomName();
        }

        public static /* synthetic */ void access$600(MediationInfo mediationInfo, ByteString byteString) {
            mediationInfo.setCustomNameBytes(byteString);
        }

        public static /* synthetic */ void access$700(MediationInfo mediationInfo, String str) {
            mediationInfo.setVersion(str);
        }

        public static /* synthetic */ void access$800(MediationInfo mediationInfo) {
            mediationInfo.clearVersion();
        }

        public static /* synthetic */ void access$900(MediationInfo mediationInfo, ByteString byteString) {
            mediationInfo.setVersionBytes(byteString);
        }

        private void clearAdapterVersion() {
            this.bitField0_ &= -5;
            this.adapterVersion_ = getDefaultInstance().getAdapterVersion();
        }

        private void clearCustomName() {
            this.bitField0_ &= -2;
            this.customName_ = getDefaultInstance().getCustomName();
        }

        private void clearProvider() {
            this.provider_ = 0;
        }

        private void clearVersion() {
            this.bitField0_ &= -3;
            this.version_ = getDefaultInstance().getVersion();
        }

        public static MediationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MediationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdapterVersion(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.adapterVersion_ = str;
        }

        private void setAdapterVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.adapterVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setCustomName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.customName_ = str;
        }

        private void setCustomNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customName_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            this.provider_ = mediationProvider.getNumber();
        }

        private void setProviderValue(int i) {
            this.provider_ = i;
        }

        private void setVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.version_ = str;
        }

        private void setVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MediationInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002", new Object[]{"bitField0_", "provider_", "customName_", "version_", "adapterVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MediationInfo.class) {
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

        public String getAdapterVersion() {
            return this.adapterVersion_;
        }

        public ByteString getAdapterVersionBytes() {
            return ByteString.copyFromUtf8(this.adapterVersion_);
        }

        public String getCustomName() {
            return this.customName_;
        }

        public ByteString getCustomNameBytes() {
            return ByteString.copyFromUtf8(this.customName_);
        }

        public ClientInfoOuterClass.MediationProvider getProvider() {
            ClientInfoOuterClass.MediationProvider forNumber = ClientInfoOuterClass.MediationProvider.forNumber(this.provider_);
            return forNumber == null ? ClientInfoOuterClass.MediationProvider.UNRECOGNIZED : forNumber;
        }

        public int getProviderValue() {
            return this.provider_;
        }

        public String getVersion() {
            return this.version_;
        }

        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        public boolean hasAdapterVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCustomName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(MediationInfo mediationInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(mediationInfo);
        }

        public static MediationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MediationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MediationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(InputStream inputStream) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MediationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MediationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MediationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MediationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MediationInfoOrBuilder extends MessageLiteOrBuilder {
        String getAdapterVersion();

        ByteString getAdapterVersionBytes();

        String getCustomName();

        ByteString getCustomNameBytes();

        ClientInfoOuterClass.MediationProvider getProvider();

        int getProviderValue();

        String getVersion();

        ByteString getVersionBytes();

        boolean hasAdapterVersion();

        boolean hasCustomName();

        boolean hasVersion();
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

    private MediationInfoOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
