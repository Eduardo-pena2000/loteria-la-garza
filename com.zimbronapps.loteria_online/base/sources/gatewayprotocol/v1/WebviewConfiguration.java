package gatewayprotocol.v1;

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
public final class WebviewConfiguration {

    public static final class WebViewConfiguration extends GeneratedMessageLite implements WebViewConfigurationOrBuilder {
        public static final int ADDITIONAL_FILES_FIELD_NUMBER = 3;
        private static final WebViewConfiguration DEFAULT_INSTANCE;
        public static final int ENTRY_POINT_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int version_;
        private String entryPoint_ = "";
        private Internal.ProtobufList additionalFiles_ = GeneratedMessageLite.emptyProtobufList();
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements WebViewConfigurationOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAdditionalFiles(String str) {
                copyOnWrite();
                WebViewConfiguration.access$700((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder addAdditionalFilesBytes(ByteString byteString) {
                copyOnWrite();
                WebViewConfiguration.access$1000((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder addAllAdditionalFiles(Iterable iterable) {
                copyOnWrite();
                WebViewConfiguration.access$800((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder clearAdditionalFiles() {
                copyOnWrite();
                WebViewConfiguration.access$900((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEntryPoint() {
                copyOnWrite();
                WebViewConfiguration.access$400((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                WebViewConfiguration.access$1200((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                WebViewConfiguration.access$200((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public String getAdditionalFiles(int i) {
                return ((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdditionalFiles(i);
            }

            public ByteString getAdditionalFilesBytes(int i) {
                return ((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdditionalFilesBytes(i);
            }

            public int getAdditionalFilesCount() {
                return ((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdditionalFilesCount();
            }

            public List getAdditionalFilesList() {
                return Collections.unmodifiableList(((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdditionalFilesList());
            }

            public String getEntryPoint() {
                return ((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance).getEntryPoint();
            }

            public ByteString getEntryPointBytes() {
                return ((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance).getEntryPointBytes();
            }

            public String getType() {
                return ((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance).getType();
            }

            public ByteString getTypeBytes() {
                return ((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance).getTypeBytes();
            }

            public int getVersion() {
                return ((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance).getVersion();
            }

            public Builder setAdditionalFiles(int i, String str) {
                copyOnWrite();
                WebViewConfiguration.access$600((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance, i, str);
                return this;
            }

            public Builder setEntryPoint(String str) {
                copyOnWrite();
                WebViewConfiguration.access$300((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setEntryPointBytes(ByteString byteString) {
                copyOnWrite();
                WebViewConfiguration.access$500((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                WebViewConfiguration.access$1100((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                WebViewConfiguration.access$1300((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                WebViewConfiguration.access$100((WebViewConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(WebViewConfiguration.access$000());
            }
        }

        static {
            WebViewConfiguration webViewConfiguration = new WebViewConfiguration();
            DEFAULT_INSTANCE = webViewConfiguration;
            GeneratedMessageLite.registerDefaultInstance(WebViewConfiguration.class, webViewConfiguration);
        }

        private WebViewConfiguration() {
        }

        public static /* synthetic */ WebViewConfiguration access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(WebViewConfiguration webViewConfiguration, int i) {
            webViewConfiguration.setVersion(i);
        }

        public static /* synthetic */ void access$1000(WebViewConfiguration webViewConfiguration, ByteString byteString) {
            webViewConfiguration.addAdditionalFilesBytes(byteString);
        }

        public static /* synthetic */ void access$1100(WebViewConfiguration webViewConfiguration, String str) {
            webViewConfiguration.setType(str);
        }

        public static /* synthetic */ void access$1200(WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.clearType();
        }

        public static /* synthetic */ void access$1300(WebViewConfiguration webViewConfiguration, ByteString byteString) {
            webViewConfiguration.setTypeBytes(byteString);
        }

        public static /* synthetic */ void access$200(WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.clearVersion();
        }

        public static /* synthetic */ void access$300(WebViewConfiguration webViewConfiguration, String str) {
            webViewConfiguration.setEntryPoint(str);
        }

        public static /* synthetic */ void access$400(WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.clearEntryPoint();
        }

        public static /* synthetic */ void access$500(WebViewConfiguration webViewConfiguration, ByteString byteString) {
            webViewConfiguration.setEntryPointBytes(byteString);
        }

        public static /* synthetic */ void access$600(WebViewConfiguration webViewConfiguration, int i, String str) {
            webViewConfiguration.setAdditionalFiles(i, str);
        }

        public static /* synthetic */ void access$700(WebViewConfiguration webViewConfiguration, String str) {
            webViewConfiguration.addAdditionalFiles(str);
        }

        public static /* synthetic */ void access$800(WebViewConfiguration webViewConfiguration, Iterable iterable) {
            webViewConfiguration.addAllAdditionalFiles(iterable);
        }

        public static /* synthetic */ void access$900(WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.clearAdditionalFiles();
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

        public static WebViewConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static WebViewConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WebViewConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebViewConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WebViewConfiguration();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"version_", "entryPoint_", "additionalFiles_", "type_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (WebViewConfiguration.class) {
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

        public static Builder newBuilder(WebViewConfiguration webViewConfiguration) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(webViewConfiguration);
        }

        public static WebViewConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WebViewConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WebViewConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WebViewConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WebViewConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WebViewConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WebViewConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface WebViewConfigurationOrBuilder extends MessageLiteOrBuilder {
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

    private WebviewConfiguration() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
