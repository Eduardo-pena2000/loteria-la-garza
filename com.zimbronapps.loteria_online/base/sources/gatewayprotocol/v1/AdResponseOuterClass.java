package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdResponseOuterClass {

    public static final class AdResponse extends GeneratedMessageLite implements AdResponseOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 6;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 7;
        private static final AdResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 8;
        public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
        public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
        public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
        private ByteString adDataRefreshToken_;
        private int adDataVersion_;
        private ByteString adData_;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private int impressionConfigurationVersion_;
        private ByteString impressionConfiguration_;
        private ByteString trackingToken_;
        private WebviewConfiguration.WebViewConfiguration webviewConfiguration_;

        public static final class Builder extends GeneratedMessageLite.Builder implements AdResponseOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdData() {
                copyOnWrite();
                AdResponse.access$1300((AdResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdDataRefreshToken() {
                copyOnWrite();
                AdResponse.access$1100((AdResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdDataVersion() {
                copyOnWrite();
                AdResponse.access$1500((AdResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                AdResponse.access$1800((AdResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearImpressionConfiguration() {
                copyOnWrite();
                AdResponse.access$400((AdResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearImpressionConfigurationVersion() {
                copyOnWrite();
                AdResponse.access$600((AdResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTrackingToken() {
                copyOnWrite();
                AdResponse.access$200((AdResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWebviewConfiguration() {
                copyOnWrite();
                AdResponse.access$900((AdResponse) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getAdData() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).getAdData();
            }

            public ByteString getAdDataRefreshToken() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).getAdDataRefreshToken();
            }

            public int getAdDataVersion() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).getAdDataVersion();
            }

            public ErrorOuterClass.Error getError() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).getError();
            }

            public ByteString getImpressionConfiguration() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).getImpressionConfiguration();
            }

            public int getImpressionConfigurationVersion() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).getImpressionConfigurationVersion();
            }

            public ByteString getTrackingToken() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).getTrackingToken();
            }

            public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).getWebviewConfiguration();
            }

            public boolean hasError() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).hasError();
            }

            public boolean hasWebviewConfiguration() {
                return ((AdResponse) ((GeneratedMessageLite.Builder) this).instance).hasWebviewConfiguration();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                AdResponse.access$1700((AdResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            public Builder mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                AdResponse.access$800((AdResponse) ((GeneratedMessageLite.Builder) this).instance, webViewConfiguration);
                return this;
            }

            public Builder setAdData(ByteString byteString) {
                copyOnWrite();
                AdResponse.access$1200((AdResponse) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString) {
                copyOnWrite();
                AdResponse.access$1000((AdResponse) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setAdDataVersion(int i) {
                copyOnWrite();
                AdResponse.access$1400((AdResponse) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                AdResponse.access$1600((AdResponse) ((GeneratedMessageLite.Builder) this).instance, error);
                return this;
            }

            public Builder setImpressionConfiguration(ByteString byteString) {
                copyOnWrite();
                AdResponse.access$300((AdResponse) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setImpressionConfigurationVersion(int i) {
                copyOnWrite();
                AdResponse.access$500((AdResponse) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString) {
                copyOnWrite();
                AdResponse.access$100((AdResponse) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
                copyOnWrite();
                AdResponse.access$700((AdResponse) ((GeneratedMessageLite.Builder) this).instance, webViewConfiguration);
                return this;
            }

            private Builder() {
                super(AdResponse.access$000());
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                AdResponse.access$1600((AdResponse) ((GeneratedMessageLite.Builder) this).instance, (ErrorOuterClass.Error) builder.build());
                return this;
            }

            public Builder setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration.Builder builder) {
                copyOnWrite();
                AdResponse.access$700((AdResponse) ((GeneratedMessageLite.Builder) this).instance, (WebviewConfiguration.WebViewConfiguration) builder.build());
                return this;
            }
        }

        static {
            AdResponse adResponse = new AdResponse();
            DEFAULT_INSTANCE = adResponse;
            GeneratedMessageLite.registerDefaultInstance(AdResponse.class, adResponse);
        }

        private AdResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.trackingToken_ = byteString;
            this.impressionConfiguration_ = byteString;
            this.adDataRefreshToken_ = byteString;
            this.adData_ = byteString;
        }

        public static /* synthetic */ AdResponse access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(AdResponse adResponse, ByteString byteString) {
            adResponse.setTrackingToken(byteString);
        }

        public static /* synthetic */ void access$1000(AdResponse adResponse, ByteString byteString) {
            adResponse.setAdDataRefreshToken(byteString);
        }

        public static /* synthetic */ void access$1100(AdResponse adResponse) {
            adResponse.clearAdDataRefreshToken();
        }

        public static /* synthetic */ void access$1200(AdResponse adResponse, ByteString byteString) {
            adResponse.setAdData(byteString);
        }

        public static /* synthetic */ void access$1300(AdResponse adResponse) {
            adResponse.clearAdData();
        }

        public static /* synthetic */ void access$1400(AdResponse adResponse, int i) {
            adResponse.setAdDataVersion(i);
        }

        public static /* synthetic */ void access$1500(AdResponse adResponse) {
            adResponse.clearAdDataVersion();
        }

        public static /* synthetic */ void access$1600(AdResponse adResponse, ErrorOuterClass.Error error) {
            adResponse.setError(error);
        }

        public static /* synthetic */ void access$1700(AdResponse adResponse, ErrorOuterClass.Error error) {
            adResponse.mergeError(error);
        }

        public static /* synthetic */ void access$1800(AdResponse adResponse) {
            adResponse.clearError();
        }

        public static /* synthetic */ void access$200(AdResponse adResponse) {
            adResponse.clearTrackingToken();
        }

        public static /* synthetic */ void access$300(AdResponse adResponse, ByteString byteString) {
            adResponse.setImpressionConfiguration(byteString);
        }

        public static /* synthetic */ void access$400(AdResponse adResponse) {
            adResponse.clearImpressionConfiguration();
        }

        public static /* synthetic */ void access$500(AdResponse adResponse, int i) {
            adResponse.setImpressionConfigurationVersion(i);
        }

        public static /* synthetic */ void access$600(AdResponse adResponse) {
            adResponse.clearImpressionConfigurationVersion();
        }

        public static /* synthetic */ void access$700(AdResponse adResponse, WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            adResponse.setWebviewConfiguration(webViewConfiguration);
        }

        public static /* synthetic */ void access$800(AdResponse adResponse, WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            adResponse.mergeWebviewConfiguration(webViewConfiguration);
        }

        public static /* synthetic */ void access$900(AdResponse adResponse) {
            adResponse.clearWebviewConfiguration();
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
            this.bitField0_ &= -3;
        }

        private void clearImpressionConfiguration() {
            this.impressionConfiguration_ = getDefaultInstance().getImpressionConfiguration();
        }

        private void clearImpressionConfigurationVersion() {
            this.impressionConfigurationVersion_ = 0;
        }

        private void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        private void clearWebviewConfiguration() {
            this.webviewConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        public static AdResponse getDefaultInstance() {
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
            this.bitField0_ |= 2;
        }

        private void mergeWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            WebviewConfiguration.WebViewConfiguration webViewConfiguration2 = this.webviewConfiguration_;
            if (webViewConfiguration2 == null || webViewConfiguration2 == WebviewConfiguration.WebViewConfiguration.getDefaultInstance()) {
                this.webviewConfiguration_ = webViewConfiguration;
            } else {
                this.webviewConfiguration_ = (WebviewConfiguration.WebViewConfiguration) ((WebviewConfiguration.WebViewConfiguration.Builder) WebviewConfiguration.WebViewConfiguration.newBuilder(this.webviewConfiguration_).mergeFrom(webViewConfiguration)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AdResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
            this.bitField0_ |= 2;
        }

        private void setImpressionConfiguration(ByteString byteString) {
            byteString.getClass();
            this.impressionConfiguration_ = byteString;
        }

        private void setImpressionConfigurationVersion(int i) {
            this.impressionConfigurationVersion_ = i;
        }

        private void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        private void setWebviewConfiguration(WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            this.webviewConfiguration_ = webViewConfiguration;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdResponse();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006\n\u0007\u0004\bဉ\u0001", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "adData_", "adDataVersion_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AdResponse.class) {
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

        public ByteString getImpressionConfiguration() {
            return this.impressionConfiguration_;
        }

        public int getImpressionConfigurationVersion() {
            return this.impressionConfigurationVersion_;
        }

        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        public WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            WebviewConfiguration.WebViewConfiguration webViewConfiguration = this.webviewConfiguration_;
            return webViewConfiguration == null ? WebviewConfiguration.WebViewConfiguration.getDefaultInstance() : webViewConfiguration;
        }

        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasWebviewConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AdResponse adResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(adResponse);
        }

        public static AdResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdResponse parseFrom(InputStream inputStream) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AdResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        ErrorOuterClass.Error getError();

        ByteString getImpressionConfiguration();

        int getImpressionConfigurationVersion();

        ByteString getTrackingToken();

        WebviewConfiguration.WebViewConfiguration getWebviewConfiguration();

        boolean hasError();

        boolean hasWebviewConfiguration();
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

    private AdResponseOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
