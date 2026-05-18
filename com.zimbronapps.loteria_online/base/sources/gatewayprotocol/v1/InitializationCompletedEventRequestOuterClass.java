package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializationCompletedEventRequestOuterClass {

    public static final class InitializationCompletedEventRequest extends GeneratedMessageLite implements InitializationCompletedEventRequestOrBuilder {
        private static final InitializationCompletedEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        public static final class Builder extends GeneratedMessageLite.Builder implements InitializationCompletedEventRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                InitializationCompletedEventRequest.access$600((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                InitializationCompletedEventRequest.access$300((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance).getDynamicDeviceInfo();
            }

            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance).getStaticDeviceInfo();
            }

            public boolean hasDynamicDeviceInfo() {
                return ((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasDynamicDeviceInfo();
            }

            public boolean hasStaticDeviceInfo() {
                return ((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasStaticDeviceInfo();
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                InitializationCompletedEventRequest.access$500((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                InitializationCompletedEventRequest.access$200((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                InitializationCompletedEventRequest.access$400((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                InitializationCompletedEventRequest.access$100((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            private Builder() {
                super(InitializationCompletedEventRequest.access$000());
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                InitializationCompletedEventRequest.access$400((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance, (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                InitializationCompletedEventRequest.access$100((InitializationCompletedEventRequest) ((GeneratedMessageLite.Builder) this).instance, (StaticDeviceInfoOuterClass.StaticDeviceInfo) builder.build());
                return this;
            }
        }

        static {
            InitializationCompletedEventRequest initializationCompletedEventRequest = new InitializationCompletedEventRequest();
            DEFAULT_INSTANCE = initializationCompletedEventRequest;
            GeneratedMessageLite.registerDefaultInstance(InitializationCompletedEventRequest.class, initializationCompletedEventRequest);
        }

        private InitializationCompletedEventRequest() {
        }

        public static /* synthetic */ InitializationCompletedEventRequest access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(InitializationCompletedEventRequest initializationCompletedEventRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            initializationCompletedEventRequest.setStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$200(InitializationCompletedEventRequest initializationCompletedEventRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            initializationCompletedEventRequest.mergeStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$300(InitializationCompletedEventRequest initializationCompletedEventRequest) {
            initializationCompletedEventRequest.clearStaticDeviceInfo();
        }

        public static /* synthetic */ void access$400(InitializationCompletedEventRequest initializationCompletedEventRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            initializationCompletedEventRequest.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$500(InitializationCompletedEventRequest initializationCompletedEventRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            initializationCompletedEventRequest.mergeDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$600(InitializationCompletedEventRequest initializationCompletedEventRequest) {
            initializationCompletedEventRequest.clearDynamicDeviceInfo();
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static InitializationCompletedEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 == null || dynamicDeviceInfo2 == DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            } else {
                this.dynamicDeviceInfo_ = (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) ((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = (StaticDeviceInfoOuterClass.StaticDeviceInfo) ((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationCompletedEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        private void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new InitializationCompletedEventRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (InitializationCompletedEventRequest.class) {
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

        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(InitializationCompletedEventRequest initializationCompletedEventRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(initializationCompletedEventRequest);
        }

        public static InitializationCompletedEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationCompletedEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationCompletedEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationCompletedEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface InitializationCompletedEventRequestOrBuilder extends MessageLiteOrBuilder {
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
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

    private InitializationCompletedEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
