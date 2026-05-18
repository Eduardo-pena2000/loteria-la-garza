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
public final class GetTokenEventRequestOuterClass {

    public static final class GetTokenEventRequest extends GeneratedMessageLite implements GetTokenEventRequestOrBuilder {
        public static final int BANNER_FIELD_NUMBER = 3;
        private static final GetTokenEventRequest DEFAULT_INSTANCE;
        public static final int INTERSTITIAL_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int REWARDED_FIELD_NUMBER = 1;
        public static final int TOKEN_ID_FIELD_NUMBER = 4;
        private ByteString banner_;
        private int bitField0_;
        private ByteString interstitial_;
        private ByteString rewarded_;
        private ByteString tokenId_;

        public static final class Builder extends GeneratedMessageLite.Builder implements GetTokenEventRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearBanner() {
                copyOnWrite();
                GetTokenEventRequest.access$600((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearInterstitial() {
                copyOnWrite();
                GetTokenEventRequest.access$400((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearRewarded() {
                copyOnWrite();
                GetTokenEventRequest.access$200((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTokenId() {
                copyOnWrite();
                GetTokenEventRequest.access$800((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getBanner() {
                return ((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance).getBanner();
            }

            public ByteString getInterstitial() {
                return ((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance).getInterstitial();
            }

            public ByteString getRewarded() {
                return ((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance).getRewarded();
            }

            public ByteString getTokenId() {
                return ((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance).getTokenId();
            }

            public boolean hasBanner() {
                return ((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasBanner();
            }

            public boolean hasInterstitial() {
                return ((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasInterstitial();
            }

            public boolean hasRewarded() {
                return ((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasRewarded();
            }

            public Builder setBanner(ByteString byteString) {
                copyOnWrite();
                GetTokenEventRequest.access$500((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setInterstitial(ByteString byteString) {
                copyOnWrite();
                GetTokenEventRequest.access$300((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setRewarded(ByteString byteString) {
                copyOnWrite();
                GetTokenEventRequest.access$100((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTokenId(ByteString byteString) {
                copyOnWrite();
                GetTokenEventRequest.access$700((GetTokenEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(GetTokenEventRequest.access$000());
            }
        }

        static {
            GetTokenEventRequest getTokenEventRequest = new GetTokenEventRequest();
            DEFAULT_INSTANCE = getTokenEventRequest;
            GeneratedMessageLite.registerDefaultInstance(GetTokenEventRequest.class, getTokenEventRequest);
        }

        private GetTokenEventRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.rewarded_ = byteString;
            this.interstitial_ = byteString;
            this.banner_ = byteString;
            this.tokenId_ = byteString;
        }

        public static /* synthetic */ GetTokenEventRequest access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(GetTokenEventRequest getTokenEventRequest, ByteString byteString) {
            getTokenEventRequest.setRewarded(byteString);
        }

        public static /* synthetic */ void access$200(GetTokenEventRequest getTokenEventRequest) {
            getTokenEventRequest.clearRewarded();
        }

        public static /* synthetic */ void access$300(GetTokenEventRequest getTokenEventRequest, ByteString byteString) {
            getTokenEventRequest.setInterstitial(byteString);
        }

        public static /* synthetic */ void access$400(GetTokenEventRequest getTokenEventRequest) {
            getTokenEventRequest.clearInterstitial();
        }

        public static /* synthetic */ void access$500(GetTokenEventRequest getTokenEventRequest, ByteString byteString) {
            getTokenEventRequest.setBanner(byteString);
        }

        public static /* synthetic */ void access$600(GetTokenEventRequest getTokenEventRequest) {
            getTokenEventRequest.clearBanner();
        }

        public static /* synthetic */ void access$700(GetTokenEventRequest getTokenEventRequest, ByteString byteString) {
            getTokenEventRequest.setTokenId(byteString);
        }

        public static /* synthetic */ void access$800(GetTokenEventRequest getTokenEventRequest) {
            getTokenEventRequest.clearTokenId();
        }

        private void clearBanner() {
            this.bitField0_ &= -5;
            this.banner_ = getDefaultInstance().getBanner();
        }

        private void clearInterstitial() {
            this.bitField0_ &= -3;
            this.interstitial_ = getDefaultInstance().getInterstitial();
        }

        private void clearRewarded() {
            this.bitField0_ &= -2;
            this.rewarded_ = getDefaultInstance().getRewarded();
        }

        private void clearTokenId() {
            this.tokenId_ = getDefaultInstance().getTokenId();
        }

        public static GetTokenEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static GetTokenEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTokenEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBanner(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.banner_ = byteString;
        }

        private void setInterstitial(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.interstitial_ = byteString;
        }

        private void setRewarded(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.rewarded_ = byteString;
        }

        private void setTokenId(ByteString byteString) {
            byteString.getClass();
            this.tokenId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetTokenEventRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004\n", new Object[]{"bitField0_", "rewarded_", "interstitial_", "banner_", "tokenId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (GetTokenEventRequest.class) {
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

        public ByteString getBanner() {
            return this.banner_;
        }

        public ByteString getInterstitial() {
            return this.interstitial_;
        }

        public ByteString getRewarded() {
            return this.rewarded_;
        }

        public ByteString getTokenId() {
            return this.tokenId_;
        }

        public boolean hasBanner() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasInterstitial() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRewarded() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(GetTokenEventRequest getTokenEventRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(getTokenEventRequest);
        }

        public static GetTokenEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetTokenEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetTokenEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTokenEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTokenEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetTokenEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GetTokenEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface GetTokenEventRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getBanner();

        ByteString getInterstitial();

        ByteString getRewarded();

        ByteString getTokenId();

        boolean hasBanner();

        boolean hasInterstitial();

        boolean hasRewarded();
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

    private GetTokenEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
