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
public final class AdDataRefreshResponseOuterClass {

    public static final class AdDataRefreshResponse extends GeneratedMessageLite implements AdDataRefreshResponseOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 1;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 4;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
        private static final AdDataRefreshResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 3;
        private ByteString adDataRefreshToken_;
        private int adDataVersion_;
        private ByteString adData_;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private ByteString trackingToken_;

        public static final class Builder extends GeneratedMessageLite.Builder implements AdDataRefreshResponseOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdData() {
                copyOnWrite();
                AdDataRefreshResponse.access$200((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdDataRefreshToken() {
                copyOnWrite();
                AdDataRefreshResponse.access$800((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdDataVersion() {
                copyOnWrite();
                AdDataRefreshResponse.access$400((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                AdDataRefreshResponse.access$1100((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTrackingToken() {
                copyOnWrite();
                AdDataRefreshResponse.access$600((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getAdData() {
                return ((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance).getAdData();
            }

            public ByteString getAdDataRefreshToken() {
                return ((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance).getAdDataRefreshToken();
            }

            public int getAdDataVersion() {
                return ((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance).getAdDataVersion();
            }

            public ErrorOuterClass.Error getError() {
                return ((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance).getError();
            }

            public ByteString getTrackingToken() {
                return ((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance).getTrackingToken();
            }

            public boolean hasError() {
                return ((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance).hasError();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                AdDataRefreshResponse.access$1000((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            public Builder setAdData(ByteString byteString) {
                copyOnWrite();
                AdDataRefreshResponse.access$100((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString) {
                copyOnWrite();
                AdDataRefreshResponse.access$700((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setAdDataVersion(int i) {
                copyOnWrite();
                AdDataRefreshResponse.access$300((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                AdDataRefreshResponse.access$900((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString) {
                copyOnWrite();
                AdDataRefreshResponse.access$500((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(AdDataRefreshResponse.access$000());
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                AdDataRefreshResponse.access$900((AdDataRefreshResponse) ((GeneratedMessageLite.Builder) this).instance, (ErrorOuterClass.Error) builder.build());
                return this;
            }
        }

        static {
            AdDataRefreshResponse adDataRefreshResponse = new AdDataRefreshResponse();
            DEFAULT_INSTANCE = adDataRefreshResponse;
            GeneratedMessageLite.registerDefaultInstance(AdDataRefreshResponse.class, adDataRefreshResponse);
        }

        private AdDataRefreshResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.adData_ = byteString;
            this.trackingToken_ = byteString;
            this.adDataRefreshToken_ = byteString;
        }

        public static /* synthetic */ AdDataRefreshResponse access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(AdDataRefreshResponse adDataRefreshResponse, ByteString byteString) {
            adDataRefreshResponse.setAdData(byteString);
        }

        public static /* synthetic */ void access$1000(AdDataRefreshResponse adDataRefreshResponse, ErrorOuterClass.Error error) {
            adDataRefreshResponse.mergeError(error);
        }

        public static /* synthetic */ void access$1100(AdDataRefreshResponse adDataRefreshResponse) {
            adDataRefreshResponse.clearError();
        }

        public static /* synthetic */ void access$200(AdDataRefreshResponse adDataRefreshResponse) {
            adDataRefreshResponse.clearAdData();
        }

        public static /* synthetic */ void access$300(AdDataRefreshResponse adDataRefreshResponse, int i) {
            adDataRefreshResponse.setAdDataVersion(i);
        }

        public static /* synthetic */ void access$400(AdDataRefreshResponse adDataRefreshResponse) {
            adDataRefreshResponse.clearAdDataVersion();
        }

        public static /* synthetic */ void access$500(AdDataRefreshResponse adDataRefreshResponse, ByteString byteString) {
            adDataRefreshResponse.setTrackingToken(byteString);
        }

        public static /* synthetic */ void access$600(AdDataRefreshResponse adDataRefreshResponse) {
            adDataRefreshResponse.clearTrackingToken();
        }

        public static /* synthetic */ void access$700(AdDataRefreshResponse adDataRefreshResponse, ByteString byteString) {
            adDataRefreshResponse.setAdDataRefreshToken(byteString);
        }

        public static /* synthetic */ void access$800(AdDataRefreshResponse adDataRefreshResponse) {
            adDataRefreshResponse.clearAdDataRefreshToken();
        }

        public static /* synthetic */ void access$900(AdDataRefreshResponse adDataRefreshResponse, ErrorOuterClass.Error error) {
            adDataRefreshResponse.setError(error);
        }

        private void clearAdData() {
            this.adData_ = getDefaultInstance().getAdData();
        }

        private void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
        }

        private void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        private void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        public static AdDataRefreshResponse getDefaultInstance() {
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

        public static AdDataRefreshResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdDataRefreshResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdData(ByteString byteString) {
            byteString.getClass();
            this.adData_ = byteString;
        }

        private void setAdDataRefreshToken(ByteString byteString) {
            byteString.getClass();
            this.adDataRefreshToken_ = byteString;
        }

        private void setAdDataVersion(int i) {
            this.adDataVersion_ = i;
        }

        private void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        private void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdDataRefreshResponse();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004\n\u0005ဉ\u0000", new Object[]{"bitField0_", "adData_", "adDataVersion_", "trackingToken_", "adDataRefreshToken_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AdDataRefreshResponse.class) {
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

        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            return error == null ? ErrorOuterClass.Error.getDefaultInstance() : error;
        }

        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AdDataRefreshResponse adDataRefreshResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(adDataRefreshResponse);
        }

        public static AdDataRefreshResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdDataRefreshResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdDataRefreshResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(InputStream inputStream) throws IOException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdDataRefreshResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdDataRefreshResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AdDataRefreshResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        ErrorOuterClass.Error getError();

        ByteString getTrackingToken();

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

    private AdDataRefreshResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
