package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UniversalRequestStoreOuterClass {

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

    public static final class UniversalRequestStore extends GeneratedMessageLite implements UniversalRequestStoreOrBuilder {
        private static final UniversalRequestStore DEFAULT_INSTANCE;
        private static volatile Parser PARSER = null;
        public static final int UNIVERSAL_REQUEST_MAP_FIELD_NUMBER = 1;
        private MapFieldLite universalRequestMap_ = MapFieldLite.emptyMapField();

        public static final class Builder extends GeneratedMessageLite.Builder implements UniversalRequestStoreOrBuilder {
            public /* synthetic */ Builder(1 r1) {
                this();
            }

            public Builder clearUniversalRequestMap() {
                copyOnWrite();
                UniversalRequestStore.access$100((UniversalRequestStore) ((GeneratedMessageLite.Builder) this).instance).clear();
                return this;
            }

            public boolean containsUniversalRequestMap(String str) {
                str.getClass();
                return ((UniversalRequestStore) ((GeneratedMessageLite.Builder) this).instance).getUniversalRequestMapMap().containsKey(str);
            }

            @Deprecated
            public Map getUniversalRequestMap() {
                return getUniversalRequestMapMap();
            }

            public int getUniversalRequestMapCount() {
                return ((UniversalRequestStore) ((GeneratedMessageLite.Builder) this).instance).getUniversalRequestMapMap().size();
            }

            public Map getUniversalRequestMapMap() {
                return Collections.unmodifiableMap(((UniversalRequestStore) ((GeneratedMessageLite.Builder) this).instance).getUniversalRequestMapMap());
            }

            public ByteString getUniversalRequestMapOrDefault(String str, ByteString byteString) {
                str.getClass();
                Map universalRequestMapMap = ((UniversalRequestStore) ((GeneratedMessageLite.Builder) this).instance).getUniversalRequestMapMap();
                return universalRequestMapMap.containsKey(str) ? (ByteString) universalRequestMapMap.get(str) : byteString;
            }

            public ByteString getUniversalRequestMapOrThrow(String str) {
                str.getClass();
                Map universalRequestMapMap = ((UniversalRequestStore) ((GeneratedMessageLite.Builder) this).instance).getUniversalRequestMapMap();
                if (universalRequestMapMap.containsKey(str)) {
                    return (ByteString) universalRequestMapMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            public Builder putAllUniversalRequestMap(Map map) {
                copyOnWrite();
                UniversalRequestStore.access$100((UniversalRequestStore) ((GeneratedMessageLite.Builder) this).instance).putAll(map);
                return this;
            }

            public Builder putUniversalRequestMap(String str, ByteString byteString) {
                str.getClass();
                byteString.getClass();
                copyOnWrite();
                UniversalRequestStore.access$100((UniversalRequestStore) ((GeneratedMessageLite.Builder) this).instance).put(str, byteString);
                return this;
            }

            public Builder removeUniversalRequestMap(String str) {
                str.getClass();
                copyOnWrite();
                UniversalRequestStore.access$100((UniversalRequestStore) ((GeneratedMessageLite.Builder) this).instance).remove(str);
                return this;
            }

            private Builder() {
                super(UniversalRequestStore.access$000());
            }
        }

        public static final class UniversalRequestMapDefaultEntryHolder {
            static final MapEntryLite defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BYTES, ByteString.EMPTY);

            private UniversalRequestMapDefaultEntryHolder() {
            }
        }

        static {
            UniversalRequestStore universalRequestStore = new UniversalRequestStore();
            DEFAULT_INSTANCE = universalRequestStore;
            GeneratedMessageLite.registerDefaultInstance(UniversalRequestStore.class, universalRequestStore);
        }

        private UniversalRequestStore() {
        }

        public static /* synthetic */ UniversalRequestStore access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ Map access$100(UniversalRequestStore universalRequestStore) {
            return universalRequestStore.getMutableUniversalRequestMapMap();
        }

        public static UniversalRequestStore getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private Map getMutableUniversalRequestMapMap() {
            return internalGetMutableUniversalRequestMap();
        }

        private MapFieldLite internalGetMutableUniversalRequestMap() {
            if (!this.universalRequestMap_.isMutable()) {
                this.universalRequestMap_ = this.universalRequestMap_.mutableCopy();
            }
            return this.universalRequestMap_;
        }

        private MapFieldLite internalGetUniversalRequestMap() {
            return this.universalRequestMap_;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UniversalRequestStore parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UniversalRequestStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalRequestStore parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        public boolean containsUniversalRequestMap(String str) {
            str.getClass();
            return internalGetUniversalRequestMap().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UniversalRequestStore();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"universalRequestMap_", UniversalRequestMapDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (UniversalRequestStore.class) {
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

        @Deprecated
        public Map getUniversalRequestMap() {
            return getUniversalRequestMapMap();
        }

        public int getUniversalRequestMapCount() {
            return internalGetUniversalRequestMap().size();
        }

        public Map getUniversalRequestMapMap() {
            return Collections.unmodifiableMap(internalGetUniversalRequestMap());
        }

        public ByteString getUniversalRequestMapOrDefault(String str, ByteString byteString) {
            str.getClass();
            MapFieldLite internalGetUniversalRequestMap = internalGetUniversalRequestMap();
            return internalGetUniversalRequestMap.containsKey(str) ? (ByteString) internalGetUniversalRequestMap.get(str) : byteString;
        }

        public ByteString getUniversalRequestMapOrThrow(String str) {
            str.getClass();
            MapFieldLite internalGetUniversalRequestMap = internalGetUniversalRequestMap();
            if (internalGetUniversalRequestMap.containsKey(str)) {
                return (ByteString) internalGetUniversalRequestMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public static Builder newBuilder(UniversalRequestStore universalRequestStore) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(universalRequestStore);
        }

        public static UniversalRequestStore parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequestStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalRequestStore parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UniversalRequestStore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UniversalRequestStore parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static UniversalRequestStore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UniversalRequestStore parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UniversalRequestStore parseFrom(InputStream inputStream) throws IOException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UniversalRequestStore parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UniversalRequestStore parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UniversalRequestStore parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UniversalRequestStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface UniversalRequestStoreOrBuilder extends MessageLiteOrBuilder {
        boolean containsUniversalRequestMap(String str);

        @Deprecated
        Map getUniversalRequestMap();

        int getUniversalRequestMapCount();

        Map getUniversalRequestMapMap();

        ByteString getUniversalRequestMapOrDefault(String str, ByteString byteString);

        ByteString getUniversalRequestMapOrThrow(String str);
    }

    private UniversalRequestStoreOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
