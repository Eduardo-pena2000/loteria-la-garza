package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationDataOuterClass {

    public static final class InitializationData extends GeneratedMessageLite implements InitializationDataOrBuilder {
        private static final InitializationData DEFAULT_INSTANCE;
        public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int SHARED_DATA_FIELD_NUMBER = 2;
        private int bitField0_;
        private InitializationRequestOuterClass.InitializationRequest initializationRequest_;
        private UniversalRequestOuterClass.UniversalRequest.SharedData sharedData_;

        public static final class Builder extends GeneratedMessageLite.Builder implements InitializationDataOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearInitializationRequest() {
                copyOnWrite();
                InitializationData.access$300((InitializationData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSharedData() {
                copyOnWrite();
                InitializationData.access$600((InitializationData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                return ((InitializationData) ((GeneratedMessageLite.Builder) this).instance).getInitializationRequest();
            }

            public UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
                return ((InitializationData) ((GeneratedMessageLite.Builder) this).instance).getSharedData();
            }

            public boolean hasInitializationRequest() {
                return ((InitializationData) ((GeneratedMessageLite.Builder) this).instance).hasInitializationRequest();
            }

            public boolean hasSharedData() {
                return ((InitializationData) ((GeneratedMessageLite.Builder) this).instance).hasSharedData();
            }

            public Builder mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                copyOnWrite();
                InitializationData.access$200((InitializationData) ((GeneratedMessageLite.Builder) this).instance, initializationRequest);
                return this;
            }

            public Builder mergeSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                InitializationData.access$500((InitializationData) ((GeneratedMessageLite.Builder) this).instance, sharedData);
                return this;
            }

            public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                copyOnWrite();
                InitializationData.access$100((InitializationData) ((GeneratedMessageLite.Builder) this).instance, initializationRequest);
                return this;
            }

            public Builder setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                InitializationData.access$400((InitializationData) ((GeneratedMessageLite.Builder) this).instance, sharedData);
                return this;
            }

            private Builder() {
                super(InitializationData.access$000());
            }

            public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                copyOnWrite();
                InitializationData.access$100((InitializationData) ((GeneratedMessageLite.Builder) this).instance, (InitializationRequestOuterClass.InitializationRequest) builder.build());
                return this;
            }

            public Builder setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                copyOnWrite();
                InitializationData.access$400((InitializationData) ((GeneratedMessageLite.Builder) this).instance, (UniversalRequestOuterClass.UniversalRequest.SharedData) builder.build());
                return this;
            }
        }

        static {
            InitializationData initializationData = new InitializationData();
            DEFAULT_INSTANCE = initializationData;
            GeneratedMessageLite.registerDefaultInstance(InitializationData.class, initializationData);
        }

        private InitializationData() {
        }

        public static /* synthetic */ InitializationData access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(InitializationData initializationData, InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationData.setInitializationRequest(initializationRequest);
        }

        public static /* synthetic */ void access$200(InitializationData initializationData, InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationData.mergeInitializationRequest(initializationRequest);
        }

        public static /* synthetic */ void access$300(InitializationData initializationData) {
            initializationData.clearInitializationRequest();
        }

        public static /* synthetic */ void access$400(InitializationData initializationData, UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            initializationData.setSharedData(sharedData);
        }

        public static /* synthetic */ void access$500(InitializationData initializationData, UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            initializationData.mergeSharedData(sharedData);
        }

        public static /* synthetic */ void access$600(InitializationData initializationData) {
            initializationData.clearSharedData();
        }

        private void clearInitializationRequest() {
            this.initializationRequest_ = null;
            this.bitField0_ &= -2;
        }

        private void clearSharedData() {
            this.sharedData_ = null;
            this.bitField0_ &= -3;
        }

        public static InitializationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationRequest.getClass();
            InitializationRequestOuterClass.InitializationRequest initializationRequest2 = this.initializationRequest_;
            if (initializationRequest2 == null || initializationRequest2 == InitializationRequestOuterClass.InitializationRequest.getDefaultInstance()) {
                this.initializationRequest_ = initializationRequest;
            } else {
                this.initializationRequest_ = (InitializationRequestOuterClass.InitializationRequest) ((InitializationRequestOuterClass.InitializationRequest.Builder) InitializationRequestOuterClass.InitializationRequest.newBuilder(this.initializationRequest_).mergeFrom(initializationRequest)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData2 = this.sharedData_;
            if (sharedData2 == null || sharedData2 == UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance()) {
                this.sharedData_ = sharedData;
            } else {
                this.sharedData_ = (UniversalRequestOuterClass.UniversalRequest.SharedData) ((UniversalRequestOuterClass.UniversalRequest.SharedData.Builder) UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder(this.sharedData_).mergeFrom(sharedData)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationRequest.getClass();
            this.initializationRequest_ = initializationRequest;
            this.bitField0_ |= 1;
        }

        private void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            this.sharedData_ = sharedData;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "initializationRequest_", "sharedData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (InitializationData.class) {
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

        public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            InitializationRequestOuterClass.InitializationRequest initializationRequest = this.initializationRequest_;
            return initializationRequest == null ? InitializationRequestOuterClass.InitializationRequest.getDefaultInstance() : initializationRequest;
        }

        public UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this.sharedData_;
            return sharedData == null ? UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance() : sharedData;
        }

        public boolean hasInitializationRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSharedData() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(InitializationData initializationData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(initializationData);
        }

        public static InitializationData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationData parseFrom(InputStream inputStream) throws IOException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface InitializationDataOrBuilder extends MessageLiteOrBuilder {
        InitializationRequestOuterClass.InitializationRequest getInitializationRequest();

        UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData();

        boolean hasInitializationRequest();

        boolean hasSharedData();
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

    private InitializationDataOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
