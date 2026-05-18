package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ErrorOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AudienceManagementResponseOuterClass {

    public static final class AudienceManagementResponse extends GeneratedMessageLite implements AudienceManagementResponseOrBuilder {
        public static final int AUDIENCE_MANAGEMENT_DATA_FIELD_NUMBER = 1;
        private static final AudienceManagementResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private ByteString audienceManagementData_ = ByteString.EMPTY;
        private int bitField0_;
        private ErrorOuterClass.Error error_;

        public static final class Builder extends GeneratedMessageLite.Builder implements AudienceManagementResponseOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAudienceManagementData() {
                copyOnWrite();
                AudienceManagementResponse.access$200((AudienceManagementResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                AudienceManagementResponse.access$500((AudienceManagementResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getAudienceManagementData() {
                return ((AudienceManagementResponse) ((GeneratedMessageLite.Builder) this).instance).getAudienceManagementData();
            }

            public ErrorOuterClass.Error getError() {
                return ((AudienceManagementResponse) ((GeneratedMessageLite.Builder) this).instance).getError();
            }

            public boolean hasError() {
                return ((AudienceManagementResponse) ((GeneratedMessageLite.Builder) this).instance).hasError();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                AudienceManagementResponse.access$400((AudienceManagementResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            public Builder setAudienceManagementData(ByteString byteString) {
                copyOnWrite();
                AudienceManagementResponse.access$100((AudienceManagementResponse) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                AudienceManagementResponse.access$300((AudienceManagementResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            private Builder() {
                super(AudienceManagementResponse.access$000());
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                AudienceManagementResponse.access$300((AudienceManagementResponse) ((GeneratedMessageLite.Builder) this).instance, (ErrorOuterClass.Error) builder.build());
                return this;
            }
        }

        static {
            AudienceManagementResponse audienceManagementResponse = new AudienceManagementResponse();
            DEFAULT_INSTANCE = audienceManagementResponse;
            GeneratedMessageLite.registerDefaultInstance(AudienceManagementResponse.class, audienceManagementResponse);
        }

        private AudienceManagementResponse() {
        }

        public static /* synthetic */ AudienceManagementResponse access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(AudienceManagementResponse audienceManagementResponse, ByteString byteString) {
            audienceManagementResponse.setAudienceManagementData(byteString);
        }

        public static /* synthetic */ void access$200(AudienceManagementResponse audienceManagementResponse) {
            audienceManagementResponse.clearAudienceManagementData();
        }

        public static /* synthetic */ void access$300(AudienceManagementResponse audienceManagementResponse, ErrorOuterClass.Error error) {
            audienceManagementResponse.setError(error);
        }

        public static /* synthetic */ void access$400(AudienceManagementResponse audienceManagementResponse, ErrorOuterClass.Error error) {
            audienceManagementResponse.mergeError(error);
        }

        public static /* synthetic */ void access$500(AudienceManagementResponse audienceManagementResponse) {
            audienceManagementResponse.clearError();
        }

        private void clearAudienceManagementData() {
            this.audienceManagementData_ = getDefaultInstance().getAudienceManagementData();
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        public static AudienceManagementResponse getDefaultInstance() {
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
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AudienceManagementResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAudienceManagementData(ByteString byteString) {
            byteString.getClass();
            this.audienceManagementData_ = byteString;
        }

        private void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AudienceManagementResponse();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002ဉ\u0000", new Object[]{"bitField0_", "audienceManagementData_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AudienceManagementResponse.class) {
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

        public ByteString getAudienceManagementData() {
            return this.audienceManagementData_;
        }

        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            return error == null ? ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AudienceManagementResponse audienceManagementResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(audienceManagementResponse);
        }

        public static AudienceManagementResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AudienceManagementResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AudienceManagementResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(InputStream inputStream) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AudienceManagementResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AudienceManagementResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAudienceManagementData();

        ErrorOuterClass.Error getError();

        boolean hasError();
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

    private AudienceManagementResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
