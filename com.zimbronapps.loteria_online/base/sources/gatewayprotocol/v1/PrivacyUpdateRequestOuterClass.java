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
public final class PrivacyUpdateRequestOuterClass {

    public static final class PrivacyUpdateRequest extends GeneratedMessageLite implements PrivacyUpdateRequestOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final PrivacyUpdateRequest DEFAULT_INSTANCE;
        private static volatile Parser PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private ByteString content_ = ByteString.EMPTY;
        private int version_;

        public static final class Builder extends GeneratedMessageLite.Builder implements PrivacyUpdateRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearContent() {
                copyOnWrite();
                PrivacyUpdateRequest.access$400((PrivacyUpdateRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                PrivacyUpdateRequest.access$200((PrivacyUpdateRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getContent() {
                return ((PrivacyUpdateRequest) ((GeneratedMessageLite.Builder) this).instance).getContent();
            }

            public int getVersion() {
                return ((PrivacyUpdateRequest) ((GeneratedMessageLite.Builder) this).instance).getVersion();
            }

            public Builder setContent(ByteString byteString) {
                copyOnWrite();
                PrivacyUpdateRequest.access$300((PrivacyUpdateRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                PrivacyUpdateRequest.access$100((PrivacyUpdateRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(PrivacyUpdateRequest.access$000());
            }
        }

        static {
            PrivacyUpdateRequest privacyUpdateRequest = new PrivacyUpdateRequest();
            DEFAULT_INSTANCE = privacyUpdateRequest;
            GeneratedMessageLite.registerDefaultInstance(PrivacyUpdateRequest.class, privacyUpdateRequest);
        }

        private PrivacyUpdateRequest() {
        }

        public static /* synthetic */ PrivacyUpdateRequest access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(PrivacyUpdateRequest privacyUpdateRequest, int i) {
            privacyUpdateRequest.setVersion(i);
        }

        public static /* synthetic */ void access$200(PrivacyUpdateRequest privacyUpdateRequest) {
            privacyUpdateRequest.clearVersion();
        }

        public static /* synthetic */ void access$300(PrivacyUpdateRequest privacyUpdateRequest, ByteString byteString) {
            privacyUpdateRequest.setContent(byteString);
        }

        public static /* synthetic */ void access$400(PrivacyUpdateRequest privacyUpdateRequest) {
            privacyUpdateRequest.clearContent();
        }

        private void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        private void clearVersion() {
            this.version_ = 0;
        }

        public static PrivacyUpdateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static PrivacyUpdateRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrivacyUpdateRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContent(ByteString byteString) {
            byteString.getClass();
            this.content_ = byteString;
        }

        private void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new PrivacyUpdateRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"version_", "content_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PrivacyUpdateRequest.class) {
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

        public ByteString getContent() {
            return this.content_;
        }

        public int getVersion() {
            return this.version_;
        }

        public static Builder newBuilder(PrivacyUpdateRequest privacyUpdateRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(privacyUpdateRequest);
        }

        public static PrivacyUpdateRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PrivacyUpdateRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PrivacyUpdateRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(InputStream inputStream) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PrivacyUpdateRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PrivacyUpdateRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PrivacyUpdateRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PrivacyUpdateRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PrivacyUpdateRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getContent();

        int getVersion();
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

    private PrivacyUpdateRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
