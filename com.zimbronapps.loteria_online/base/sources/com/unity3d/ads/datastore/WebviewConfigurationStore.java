package com.unity3d.ads.datastore;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebviewConfigurationStore {

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

    public static final class WebViewConfigurationStore extends GeneratedMessageLite implements WebViewConfigurationStoreOrBuilder {
        public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
        private static final WebViewConfigurationStore DEFAULT_INSTANCE;
        public static final int ENTRY_POINT_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int version_;
        private String entryPoint_ = "";
        private Internal.ProtobufList additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements WebViewConfigurationStoreOrBuilder {
            public /* synthetic */ Builder(1 r1) {
                this();
            }

            public Builder addAdditionalFiles(String str) {
                copyOnWrite();
                WebViewConfigurationStore.access$700((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder addAdditionalFilesBytes(ByteString byteString) {
                copyOnWrite();
                WebViewConfigurationStore.access$1000((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder addAllAdditionalFiles(Iterable iterable) {
                copyOnWrite();
                WebViewConfigurationStore.access$800((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder clearAdditionalFiles() {
                copyOnWrite();
                WebViewConfigurationStore.access$900((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEntryPoint() {
                copyOnWrite();
                WebViewConfigurationStore.access$400((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                WebViewConfigurationStore.access$1200((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                WebViewConfigurationStore.access$200((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public String getAdditionalFiles(int i) {
                return ((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance).getAdditionalFiles(i);
            }

            public ByteString getAdditionalFilesBytes(int i) {
                return ((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance).getAdditionalFilesBytes(i);
            }

            public int getAdditionalFilesCount() {
                return ((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance).getAdditionalFilesCount();
            }

            public List getAdditionalFilesList() {
                return Collections.unmodifiableList(((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance).getAdditionalFilesList());
            }

            public String getEntryPoint() {
                return ((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance).getEntryPoint();
            }

            public ByteString getEntryPointBytes() {
                return ((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance).getEntryPointBytes();
            }

            public String getType() {
                return ((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance).getType();
            }

            public ByteString getTypeBytes() {
                return ((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance).getTypeBytes();
            }

            public int getVersion() {
                return ((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance).getVersion();
            }

            public Builder setAdditionalFiles(int i, String str) {
                copyOnWrite();
                WebViewConfigurationStore.access$600((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance, i, str);
                return this;
            }

            public Builder setEntryPoint(String str) {
                copyOnWrite();
                WebViewConfigurationStore.access$300((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setEntryPointBytes(ByteString byteString) {
                copyOnWrite();
                WebViewConfigurationStore.access$500((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                WebViewConfigurationStore.access$1100((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                WebViewConfigurationStore.access$1300((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                WebViewConfigurationStore.access$100((WebViewConfigurationStore) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(WebViewConfigurationStore.access$000());
            }
        }

        static {
            WebViewConfigurationStore webViewConfigurationStore = new WebViewConfigurationStore();
            DEFAULT_INSTANCE = webViewConfigurationStore;
            GeneratedMessageLite.registerDefaultInstance(WebViewConfigurationStore.class, webViewConfigurationStore);
        }

        private WebViewConfigurationStore() {
        }

        public static /* synthetic */ WebViewConfigurationStore access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(WebViewConfigurationStore webViewConfigurationStore, int i) {
            webViewConfigurationStore.setVersion(i);
        }

        public static /* synthetic */ void access$1000(WebViewConfigurationStore webViewConfigurationStore, ByteString byteString) {
            webViewConfigurationStore.addAdditionalFilesBytes(byteString);
        }

        public static /* synthetic */ void access$1100(WebViewConfigurationStore webViewConfigurationStore, String str) {
            webViewConfigurationStore.setType(str);
        }

        public static /* synthetic */ void access$1200(WebViewConfigurationStore webViewConfigurationStore) {
            webViewConfigurationStore.clearType();
        }

        public static /* synthetic */ void access$1300(WebViewConfigurationStore webViewConfigurationStore, ByteString byteString) {
            webViewConfigurationStore.setTypeBytes(byteString);
        }

        public static /* synthetic */ void access$200(WebViewConfigurationStore webViewConfigurationStore) {
            webViewConfigurationStore.clearVersion();
        }

        public static /* synthetic */ void access$300(WebViewConfigurationStore webViewConfigurationStore, String str) {
            webViewConfigurationStore.setEntryPoint(str);
        }

        public static /* synthetic */ void access$400(WebViewConfigurationStore webViewConfigurationStore) {
            webViewConfigurationStore.clearEntryPoint();
        }

        public static /* synthetic */ void access$500(WebViewConfigurationStore webViewConfigurationStore, ByteString byteString) {
            webViewConfigurationStore.setEntryPointBytes(byteString);
        }

        public static /* synthetic */ void access$600(WebViewConfigurationStore webViewConfigurationStore, int i, String str) {
            webViewConfigurationStore.setAdditionalFiles(i, str);
        }

        public static /* synthetic */ void access$700(WebViewConfigurationStore webViewConfigurationStore, String str) {
            webViewConfigurationStore.addAdditionalFiles(str);
        }

        public static /* synthetic */ void access$800(WebViewConfigurationStore webViewConfigurationStore, Iterable iterable) {
            webViewConfigurationStore.addAllAdditionalFiles(iterable);
        }

        public static /* synthetic */ void access$900(WebViewConfigurationStore webViewConfigurationStore) {
            webViewConfigurationStore.clearAdditionalFiles();
        }

        private void addAdditionalFiles(String str) {
            str.getClass();
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(str);
        }

        private void addAdditionalFilesBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.add(byteString.toStringUtf8());
        }

        private void addAllAdditionalFiles(Iterable iterable) {
            ensureAdditionalFilesIsMutable();
            AbstractMessageLite.addAll(iterable, this.additionalFiles_);
        }

        private void clearAdditionalFiles() {
            this.additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearEntryPoint() {
            this.entryPoint_ = getDefaultInstance().getEntryPoint();
        }

        private void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        private void clearVersion() {
            this.version_ = 0;
        }

        private void ensureAdditionalFilesIsMutable() {
            Internal.ProtobufList protobufList = this.additionalFiles_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.additionalFiles_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static WebViewConfigurationStore getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WebViewConfigurationStore parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebViewConfigurationStore parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdditionalFiles(int i, String str) {
            str.getClass();
            ensureAdditionalFilesIsMutable();
            this.additionalFiles_.set(i, str);
        }

        private void setEntryPoint(String str) {
            str.getClass();
            this.entryPoint_ = str;
        }

        private void setEntryPointBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.entryPoint_ = byteString.toStringUtf8();
        }

        private void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        private void setTypeBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        private void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebViewConfigurationStore();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"version_", "entryPoint_", "additionalFiles_", "type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (WebViewConfigurationStore.class) {
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

        public String getAdditionalFiles(int i) {
            return (String) this.additionalFiles_.get(i);
        }

        public ByteString getAdditionalFilesBytes(int i) {
            return ByteString.copyFromUtf8((String) this.additionalFiles_.get(i));
        }

        public int getAdditionalFilesCount() {
            return this.additionalFiles_.size();
        }

        public List getAdditionalFilesList() {
            return this.additionalFiles_;
        }

        public String getEntryPoint() {
            return this.entryPoint_;
        }

        public ByteString getEntryPointBytes() {
            return ByteString.copyFromUtf8(this.entryPoint_);
        }

        public String getType() {
            return this.type_;
        }

        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        public int getVersion() {
            return this.version_;
        }

        public static Builder newBuilder(WebViewConfigurationStore webViewConfigurationStore) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(webViewConfigurationStore);
        }

        public static WebViewConfigurationStore parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebViewConfigurationStore parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebViewConfigurationStore parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(InputStream inputStream) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebViewConfigurationStore parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebViewConfigurationStore parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebViewConfigurationStore parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfigurationStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface WebViewConfigurationStoreOrBuilder extends MessageLiteOrBuilder {
        String getAdditionalFiles(int i);

        ByteString getAdditionalFilesBytes(int i);

        int getAdditionalFilesCount();

        List getAdditionalFilesList();

        String getEntryPoint();

        ByteString getEntryPointBytes();

        String getType();

        ByteString getTypeBytes();

        int getVersion();
    }

    private WebviewConfigurationStore() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
