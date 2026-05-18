package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HeaderBiddingAdMarkupOuterClass {

    public static final class HeaderBiddingAdMarkup extends GeneratedMessageLite implements HeaderBiddingAdMarkupOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 1;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
        public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 3;
        private static final HeaderBiddingAdMarkup DEFAULT_INSTANCE;
        private static volatile Parser PARSER;
        private int adDataVersion_;
        private ByteString adData_;
        private ByteString configurationToken_;

        public static final class Builder extends GeneratedMessageLite.Builder implements HeaderBiddingAdMarkupOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdData() {
                copyOnWrite();
                HeaderBiddingAdMarkup.access$200((HeaderBiddingAdMarkup) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdDataVersion() {
                copyOnWrite();
                HeaderBiddingAdMarkup.access$400((HeaderBiddingAdMarkup) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearConfigurationToken() {
                copyOnWrite();
                HeaderBiddingAdMarkup.access$600((HeaderBiddingAdMarkup) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getAdData() {
                return ((HeaderBiddingAdMarkup) ((GeneratedMessageLite.Builder) this).instance).getAdData();
            }

            public int getAdDataVersion() {
                return ((HeaderBiddingAdMarkup) ((GeneratedMessageLite.Builder) this).instance).getAdDataVersion();
            }

            public ByteString getConfigurationToken() {
                return ((HeaderBiddingAdMarkup) ((GeneratedMessageLite.Builder) this).instance).getConfigurationToken();
            }

            public Builder setAdData(ByteString byteString) {
                copyOnWrite();
                HeaderBiddingAdMarkup.access$100((HeaderBiddingAdMarkup) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setAdDataVersion(int i) {
                copyOnWrite();
                HeaderBiddingAdMarkup.access$300((HeaderBiddingAdMarkup) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setConfigurationToken(ByteString byteString) {
                copyOnWrite();
                HeaderBiddingAdMarkup.access$500((HeaderBiddingAdMarkup) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(HeaderBiddingAdMarkup.access$000());
            }
        }

        static {
            HeaderBiddingAdMarkup headerBiddingAdMarkup = new HeaderBiddingAdMarkup();
            DEFAULT_INSTANCE = headerBiddingAdMarkup;
            GeneratedMessageLite.registerDefaultInstance(HeaderBiddingAdMarkup.class, headerBiddingAdMarkup);
        }

        private HeaderBiddingAdMarkup() {
            ByteString byteString = ByteString.EMPTY;
            this.adData_ = byteString;
            this.configurationToken_ = byteString;
        }

        public static /* synthetic */ HeaderBiddingAdMarkup access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString) {
            headerBiddingAdMarkup.setAdData(byteString);
        }

        public static /* synthetic */ void access$200(HeaderBiddingAdMarkup headerBiddingAdMarkup) {
            headerBiddingAdMarkup.clearAdData();
        }

        public static /* synthetic */ void access$300(HeaderBiddingAdMarkup headerBiddingAdMarkup, int i) {
            headerBiddingAdMarkup.setAdDataVersion(i);
        }

        public static /* synthetic */ void access$400(HeaderBiddingAdMarkup headerBiddingAdMarkup) {
            headerBiddingAdMarkup.clearAdDataVersion();
        }

        public static /* synthetic */ void access$500(HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString) {
            headerBiddingAdMarkup.setConfigurationToken(byteString);
        }

        public static /* synthetic */ void access$600(HeaderBiddingAdMarkup headerBiddingAdMarkup) {
            headerBiddingAdMarkup.clearConfigurationToken();
        }

        private void clearAdData() {
            this.adData_ = getDefaultInstance().getAdData();
        }

        private void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        private void clearConfigurationToken() {
            this.configurationToken_ = getDefaultInstance().getConfigurationToken();
        }

        public static HeaderBiddingAdMarkup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HeaderBiddingAdMarkup parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdData(ByteString byteString) {
            byteString.getClass();
            this.adData_ = byteString;
        }

        private void setAdDataVersion(int i) {
            this.adDataVersion_ = i;
        }

        private void setConfigurationToken(ByteString byteString) {
            byteString.getClass();
            this.configurationToken_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeaderBiddingAdMarkup();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n", new Object[]{"adData_", "adDataVersion_", "configurationToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HeaderBiddingAdMarkup.class) {
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

        public ByteString getAdData() {
            return this.adData_;
        }

        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        public ByteString getConfigurationToken() {
            return this.configurationToken_;
        }

        public static Builder newBuilder(HeaderBiddingAdMarkup headerBiddingAdMarkup) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(headerBiddingAdMarkup);
        }

        public static HeaderBiddingAdMarkup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeaderBiddingAdMarkup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingAdMarkup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeaderBiddingAdMarkup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface HeaderBiddingAdMarkupOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        int getAdDataVersion();

        ByteString getConfigurationToken();
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

    private HeaderBiddingAdMarkupOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
