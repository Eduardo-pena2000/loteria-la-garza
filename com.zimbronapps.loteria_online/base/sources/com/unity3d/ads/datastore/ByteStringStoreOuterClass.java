package com.unity3d.ads.datastore;

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
public final class ByteStringStoreOuterClass {

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class ByteStringStore extends GeneratedMessageLite implements ByteStringStoreOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final ByteStringStore DEFAULT_INSTANCE;
        private static volatile Parser PARSER;
        private ByteString data_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.Builder implements ByteStringStoreOrBuilder {
            public /* synthetic */ Builder(1 r1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ByteStringStore.access$200((ByteStringStore) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getData() {
                return ((ByteStringStore) ((GeneratedMessageLite.Builder) this).instance).getData();
            }

            public Builder setData(ByteString byteString) {
                copyOnWrite();
                ByteStringStore.access$100((ByteStringStore) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(ByteStringStore.access$000());
            }
        }

        static {
            ByteStringStore byteStringStore = new ByteStringStore();
            DEFAULT_INSTANCE = byteStringStore;
            GeneratedMessageLite.registerDefaultInstance(ByteStringStore.class, byteStringStore);
        }

        private ByteStringStore() {
        }

        public static /* synthetic */ ByteStringStore access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(ByteStringStore byteStringStore, ByteString byteString) {
            byteStringStore.setData(byteString);
        }

        public static /* synthetic */ void access$200(ByteStringStore byteStringStore) {
            byteStringStore.clearData();
        }

        private void clearData() {
            this.data_ = getDefaultInstance().getData();
        }

        public static ByteStringStore getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ByteStringStore parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ByteStringStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ByteStringStore parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ByteStringStore();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"data_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ByteStringStore.class) {
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

        public ByteString getData() {
            return this.data_;
        }

        public static Builder newBuilder(ByteStringStore byteStringStore) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(byteStringStore);
        }

        public static ByteStringStore parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ByteStringStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ByteStringStore parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ByteStringStore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ByteStringStore parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ByteStringStore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ByteStringStore parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ByteStringStore parseFrom(InputStream inputStream) throws IOException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ByteStringStore parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ByteStringStore parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ByteStringStore parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ByteStringStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ByteStringStoreOrBuilder extends MessageLiteOrBuilder {
        ByteString getData();
    }

    private ByteStringStoreOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
