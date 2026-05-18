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
public final class AllowedPiiOuterClass {

    public static final class AllowedPii extends GeneratedMessageLite implements AllowedPiiOrBuilder {
        public static final int APPSET_ID_FIELD_NUMBER = 4;
        private static final AllowedPii DEFAULT_INSTANCE;
        public static final int FID_FIELD_NUMBER = 3;
        public static final int IDFA_FIELD_NUMBER = 1;
        public static final int IDFV_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private boolean appsetId_;
        private boolean fid_;
        private boolean idfa_;
        private boolean idfv_;

        public static final class Builder extends GeneratedMessageLite.Builder implements AllowedPiiOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAppsetId() {
                copyOnWrite();
                AllowedPii.access$800((AllowedPii) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearFid() {
                copyOnWrite();
                AllowedPii.access$600((AllowedPii) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearIdfa() {
                copyOnWrite();
                AllowedPii.access$200((AllowedPii) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearIdfv() {
                copyOnWrite();
                AllowedPii.access$400((AllowedPii) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean getAppsetId() {
                return ((AllowedPii) ((GeneratedMessageLite.Builder) this).instance).getAppsetId();
            }

            public boolean getFid() {
                return ((AllowedPii) ((GeneratedMessageLite.Builder) this).instance).getFid();
            }

            public boolean getIdfa() {
                return ((AllowedPii) ((GeneratedMessageLite.Builder) this).instance).getIdfa();
            }

            public boolean getIdfv() {
                return ((AllowedPii) ((GeneratedMessageLite.Builder) this).instance).getIdfv();
            }

            public Builder setAppsetId(boolean z) {
                copyOnWrite();
                AllowedPii.access$700((AllowedPii) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setFid(boolean z) {
                copyOnWrite();
                AllowedPii.access$500((AllowedPii) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setIdfa(boolean z) {
                copyOnWrite();
                AllowedPii.access$100((AllowedPii) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setIdfv(boolean z) {
                copyOnWrite();
                AllowedPii.access$300((AllowedPii) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            private Builder() {
                super(AllowedPii.access$000());
            }
        }

        static {
            AllowedPii allowedPii = new AllowedPii();
            DEFAULT_INSTANCE = allowedPii;
            GeneratedMessageLite.registerDefaultInstance(AllowedPii.class, allowedPii);
        }

        private AllowedPii() {
        }

        public static /* synthetic */ AllowedPii access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(AllowedPii allowedPii, boolean z) {
            allowedPii.setIdfa(z);
        }

        public static /* synthetic */ void access$200(AllowedPii allowedPii) {
            allowedPii.clearIdfa();
        }

        public static /* synthetic */ void access$300(AllowedPii allowedPii, boolean z) {
            allowedPii.setIdfv(z);
        }

        public static /* synthetic */ void access$400(AllowedPii allowedPii) {
            allowedPii.clearIdfv();
        }

        public static /* synthetic */ void access$500(AllowedPii allowedPii, boolean z) {
            allowedPii.setFid(z);
        }

        public static /* synthetic */ void access$600(AllowedPii allowedPii) {
            allowedPii.clearFid();
        }

        public static /* synthetic */ void access$700(AllowedPii allowedPii, boolean z) {
            allowedPii.setAppsetId(z);
        }

        public static /* synthetic */ void access$800(AllowedPii allowedPii) {
            allowedPii.clearAppsetId();
        }

        private void clearAppsetId() {
            this.appsetId_ = false;
        }

        private void clearFid() {
            this.fid_ = false;
        }

        private void clearIdfa() {
            this.idfa_ = false;
        }

        private void clearIdfv() {
            this.idfv_ = false;
        }

        public static AllowedPii getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AllowedPii parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AllowedPii parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppsetId(boolean z) {
            this.appsetId_ = z;
        }

        private void setFid(boolean z) {
            this.fid_ = z;
        }

        private void setIdfa(boolean z) {
            this.idfa_ = z;
        }

        private void setIdfv(boolean z) {
            this.idfv_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AllowedPii();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"idfa_", "idfv_", "fid_", "appsetId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AllowedPii.class) {
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

        public boolean getAppsetId() {
            return this.appsetId_;
        }

        public boolean getFid() {
            return this.fid_;
        }

        public boolean getIdfa() {
            return this.idfa_;
        }

        public boolean getIdfv() {
            return this.idfv_;
        }

        public static Builder newBuilder(AllowedPii allowedPii) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(allowedPii);
        }

        public static AllowedPii parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AllowedPii parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AllowedPii parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(InputStream inputStream) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AllowedPii parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AllowedPii parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AllowedPiiOrBuilder extends MessageLiteOrBuilder {
        boolean getAppsetId();

        boolean getFid();

        boolean getIdfa();

        boolean getIdfv();
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

    private AllowedPiiOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
