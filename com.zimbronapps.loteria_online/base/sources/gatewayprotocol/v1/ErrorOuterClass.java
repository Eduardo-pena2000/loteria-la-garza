package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class ErrorOuterClass {

    public static final class Error extends GeneratedMessageLite implements ErrorOrBuilder {
        private static final Error DEFAULT_INSTANCE;
        public static final int ERROR_TEXT_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private String errorText_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements ErrorOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearErrorText() {
                copyOnWrite();
                Error.access$200((Error) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public String getErrorText() {
                return ((Error) ((GeneratedMessageLite.Builder) this).instance).getErrorText();
            }

            public ByteString getErrorTextBytes() {
                return ((Error) ((GeneratedMessageLite.Builder) this).instance).getErrorTextBytes();
            }

            public Builder setErrorText(String str) {
                copyOnWrite();
                Error.access$100((Error) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setErrorTextBytes(ByteString byteString) {
                copyOnWrite();
                Error.access$300((Error) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(Error.access$000());
            }
        }

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            GeneratedMessageLite.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        public static /* synthetic */ Error access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(Error error, String str) {
            error.setErrorText(str);
        }

        public static /* synthetic */ void access$200(Error error) {
            error.clearErrorText();
        }

        public static /* synthetic */ void access$300(Error error, ByteString byteString) {
            error.setErrorTextBytes(byteString);
        }

        private void clearErrorText() {
            this.errorText_ = getDefaultInstance().getErrorText();
        }

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorText(String str) {
            str.getClass();
            this.errorText_ = str;
        }

        private void setErrorTextBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorText_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Error();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"errorText_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Error.class) {
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

        public String getErrorText() {
            return this.errorText_;
        }

        public ByteString getErrorTextBytes() {
            return ByteString.copyFromUtf8(this.errorText_);
        }

        public static Builder newBuilder(Error error) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(error);
        }

        public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Error parseFrom(InputStream inputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ErrorOrBuilder extends MessageLiteOrBuilder {
        String getErrorText();

        ByteString getErrorTextBytes();
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

    private ErrorOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
