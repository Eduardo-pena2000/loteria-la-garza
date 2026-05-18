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
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NativeConfigurationOuterClass {

    public static final class AdOperationsConfiguration extends GeneratedMessageLite implements AdOperationsConfigurationOrBuilder {
        private static final AdOperationsConfiguration DEFAULT_INSTANCE;
        public static final int GET_TOKEN_TIMEOUT_MS_FIELD_NUMBER = 3;
        public static final int LOAD_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int SHOW_TIMEOUT_MS_FIELD_NUMBER = 2;
        private int getTokenTimeoutMs_;
        private int loadTimeoutMs_;
        private int showTimeoutMs_;

        public static final class Builder extends GeneratedMessageLite.Builder implements AdOperationsConfigurationOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearGetTokenTimeoutMs() {
                copyOnWrite();
                AdOperationsConfiguration.access$6500((AdOperationsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLoadTimeoutMs() {
                copyOnWrite();
                AdOperationsConfiguration.access$6100((AdOperationsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearShowTimeoutMs() {
                copyOnWrite();
                AdOperationsConfiguration.access$6300((AdOperationsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public int getGetTokenTimeoutMs() {
                return ((AdOperationsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getGetTokenTimeoutMs();
            }

            public int getLoadTimeoutMs() {
                return ((AdOperationsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getLoadTimeoutMs();
            }

            public int getShowTimeoutMs() {
                return ((AdOperationsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getShowTimeoutMs();
            }

            public Builder setGetTokenTimeoutMs(int i) {
                copyOnWrite();
                AdOperationsConfiguration.access$6400((AdOperationsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setLoadTimeoutMs(int i) {
                copyOnWrite();
                AdOperationsConfiguration.access$6000((AdOperationsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setShowTimeoutMs(int i) {
                copyOnWrite();
                AdOperationsConfiguration.access$6200((AdOperationsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(AdOperationsConfiguration.access$5900());
            }
        }

        static {
            AdOperationsConfiguration adOperationsConfiguration = new AdOperationsConfiguration();
            DEFAULT_INSTANCE = adOperationsConfiguration;
            GeneratedMessageLite.registerDefaultInstance(AdOperationsConfiguration.class, adOperationsConfiguration);
        }

        private AdOperationsConfiguration() {
        }

        public static /* synthetic */ AdOperationsConfiguration access$5900() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$6000(AdOperationsConfiguration adOperationsConfiguration, int i) {
            adOperationsConfiguration.setLoadTimeoutMs(i);
        }

        public static /* synthetic */ void access$6100(AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.clearLoadTimeoutMs();
        }

        public static /* synthetic */ void access$6200(AdOperationsConfiguration adOperationsConfiguration, int i) {
            adOperationsConfiguration.setShowTimeoutMs(i);
        }

        public static /* synthetic */ void access$6300(AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.clearShowTimeoutMs();
        }

        public static /* synthetic */ void access$6400(AdOperationsConfiguration adOperationsConfiguration, int i) {
            adOperationsConfiguration.setGetTokenTimeoutMs(i);
        }

        public static /* synthetic */ void access$6500(AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.clearGetTokenTimeoutMs();
        }

        private void clearGetTokenTimeoutMs() {
            this.getTokenTimeoutMs_ = 0;
        }

        private void clearLoadTimeoutMs() {
            this.loadTimeoutMs_ = 0;
        }

        private void clearShowTimeoutMs() {
            this.showTimeoutMs_ = 0;
        }

        public static AdOperationsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AdOperationsConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdOperationsConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setGetTokenTimeoutMs(int i) {
            this.getTokenTimeoutMs_ = i;
        }

        private void setLoadTimeoutMs(int i) {
            this.loadTimeoutMs_ = i;
        }

        private void setShowTimeoutMs(int i) {
            this.showTimeoutMs_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AdOperationsConfiguration();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"loadTimeoutMs_", "showTimeoutMs_", "getTokenTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AdOperationsConfiguration.class) {
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

        public int getGetTokenTimeoutMs() {
            return this.getTokenTimeoutMs_;
        }

        public int getLoadTimeoutMs() {
            return this.loadTimeoutMs_;
        }

        public int getShowTimeoutMs() {
            return this.showTimeoutMs_;
        }

        public static Builder newBuilder(AdOperationsConfiguration adOperationsConfiguration) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(adOperationsConfiguration);
        }

        public static AdOperationsConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdOperationsConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdOperationsConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdOperationsConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdOperationsConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdOperationsConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AdOperationsConfigurationOrBuilder extends MessageLiteOrBuilder {
        int getGetTokenTimeoutMs();

        int getLoadTimeoutMs();

        int getShowTimeoutMs();
    }

    public static final class CachedAssetsConfiguration extends GeneratedMessageLite implements CachedAssetsConfigurationOrBuilder {
        private static final CachedAssetsConfiguration DEFAULT_INSTANCE;
        public static final int MAX_CACHED_ASSET_AGE_MS_FIELD_NUMBER = 1;
        public static final int MAX_CACHED_ASSET_SIZE_MB_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private long maxCachedAssetAgeMs_;
        private int maxCachedAssetSizeMb_;

        public static final class Builder extends GeneratedMessageLite.Builder implements CachedAssetsConfigurationOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearMaxCachedAssetAgeMs() {
                copyOnWrite();
                CachedAssetsConfiguration.access$6900((CachedAssetsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMaxCachedAssetSizeMb() {
                copyOnWrite();
                CachedAssetsConfiguration.access$7100((CachedAssetsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public long getMaxCachedAssetAgeMs() {
                return ((CachedAssetsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getMaxCachedAssetAgeMs();
            }

            public int getMaxCachedAssetSizeMb() {
                return ((CachedAssetsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getMaxCachedAssetSizeMb();
            }

            public Builder setMaxCachedAssetAgeMs(long j) {
                copyOnWrite();
                CachedAssetsConfiguration.access$6800((CachedAssetsConfiguration) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setMaxCachedAssetSizeMb(int i) {
                copyOnWrite();
                CachedAssetsConfiguration.access$7000((CachedAssetsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(CachedAssetsConfiguration.access$6700());
            }
        }

        static {
            CachedAssetsConfiguration cachedAssetsConfiguration = new CachedAssetsConfiguration();
            DEFAULT_INSTANCE = cachedAssetsConfiguration;
            GeneratedMessageLite.registerDefaultInstance(CachedAssetsConfiguration.class, cachedAssetsConfiguration);
        }

        private CachedAssetsConfiguration() {
        }

        public static /* synthetic */ CachedAssetsConfiguration access$6700() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$6800(CachedAssetsConfiguration cachedAssetsConfiguration, long j) {
            cachedAssetsConfiguration.setMaxCachedAssetAgeMs(j);
        }

        public static /* synthetic */ void access$6900(CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.clearMaxCachedAssetAgeMs();
        }

        public static /* synthetic */ void access$7000(CachedAssetsConfiguration cachedAssetsConfiguration, int i) {
            cachedAssetsConfiguration.setMaxCachedAssetSizeMb(i);
        }

        public static /* synthetic */ void access$7100(CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.clearMaxCachedAssetSizeMb();
        }

        private void clearMaxCachedAssetAgeMs() {
            this.maxCachedAssetAgeMs_ = 0L;
        }

        private void clearMaxCachedAssetSizeMb() {
            this.maxCachedAssetSizeMb_ = 0;
        }

        public static CachedAssetsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CachedAssetsConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CachedAssetsConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMaxCachedAssetAgeMs(long j) {
            this.maxCachedAssetAgeMs_ = j;
        }

        private void setMaxCachedAssetSizeMb(int i) {
            this.maxCachedAssetSizeMb_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new CachedAssetsConfiguration();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"maxCachedAssetAgeMs_", "maxCachedAssetSizeMb_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (CachedAssetsConfiguration.class) {
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

        public long getMaxCachedAssetAgeMs() {
            return this.maxCachedAssetAgeMs_;
        }

        public int getMaxCachedAssetSizeMb() {
            return this.maxCachedAssetSizeMb_;
        }

        public static Builder newBuilder(CachedAssetsConfiguration cachedAssetsConfiguration) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cachedAssetsConfiguration);
        }

        public static CachedAssetsConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CachedAssetsConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static CachedAssetsConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CachedAssetsConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static CachedAssetsConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CachedAssetsConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static CachedAssetsConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CachedAssetsConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static CachedAssetsConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static CachedAssetsConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface CachedAssetsConfigurationOrBuilder extends MessageLiteOrBuilder {
        long getMaxCachedAssetAgeMs();

        int getMaxCachedAssetSizeMb();
    }

    public static final class DebugSettings extends GeneratedMessageLite implements DebugSettingsOrBuilder {
        public static final int CLEAN_CACHE_FIELD_NUMBER = 3;
        private static final DebugSettings DEFAULT_INSTANCE;
        public static final int ENABLE_TRACING_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int WEBVIEW_INSPECTABLE_FIELD_NUMBER = 1;
        private boolean cleanCache_;
        private boolean enableTracing_;
        private boolean webviewInspectable_;

        public static final class Builder extends GeneratedMessageLite.Builder implements DebugSettingsOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearCleanCache() {
                copyOnWrite();
                DebugSettings.access$14600((DebugSettings) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEnableTracing() {
                copyOnWrite();
                DebugSettings.access$14400((DebugSettings) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWebviewInspectable() {
                copyOnWrite();
                DebugSettings.access$14200((DebugSettings) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean getCleanCache() {
                return ((DebugSettings) ((GeneratedMessageLite.Builder) this).instance).getCleanCache();
            }

            public boolean getEnableTracing() {
                return ((DebugSettings) ((GeneratedMessageLite.Builder) this).instance).getEnableTracing();
            }

            public boolean getWebviewInspectable() {
                return ((DebugSettings) ((GeneratedMessageLite.Builder) this).instance).getWebviewInspectable();
            }

            public Builder setCleanCache(boolean z) {
                copyOnWrite();
                DebugSettings.access$14500((DebugSettings) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setEnableTracing(boolean z) {
                copyOnWrite();
                DebugSettings.access$14300((DebugSettings) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setWebviewInspectable(boolean z) {
                copyOnWrite();
                DebugSettings.access$14100((DebugSettings) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            private Builder() {
                super(DebugSettings.access$14000());
            }
        }

        static {
            DebugSettings debugSettings = new DebugSettings();
            DEFAULT_INSTANCE = debugSettings;
            GeneratedMessageLite.registerDefaultInstance(DebugSettings.class, debugSettings);
        }

        private DebugSettings() {
        }

        public static /* synthetic */ DebugSettings access$14000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$14100(DebugSettings debugSettings, boolean z) {
            debugSettings.setWebviewInspectable(z);
        }

        public static /* synthetic */ void access$14200(DebugSettings debugSettings) {
            debugSettings.clearWebviewInspectable();
        }

        public static /* synthetic */ void access$14300(DebugSettings debugSettings, boolean z) {
            debugSettings.setEnableTracing(z);
        }

        public static /* synthetic */ void access$14400(DebugSettings debugSettings) {
            debugSettings.clearEnableTracing();
        }

        public static /* synthetic */ void access$14500(DebugSettings debugSettings, boolean z) {
            debugSettings.setCleanCache(z);
        }

        public static /* synthetic */ void access$14600(DebugSettings debugSettings) {
            debugSettings.clearCleanCache();
        }

        private void clearCleanCache() {
            this.cleanCache_ = false;
        }

        private void clearEnableTracing() {
            this.enableTracing_ = false;
        }

        private void clearWebviewInspectable() {
            this.webviewInspectable_ = false;
        }

        public static DebugSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DebugSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DebugSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DebugSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCleanCache(boolean z) {
            this.cleanCache_ = z;
        }

        private void setEnableTracing(boolean z) {
            this.enableTracing_ = z;
        }

        private void setWebviewInspectable(boolean z) {
            this.webviewInspectable_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DebugSettings();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"webviewInspectable_", "enableTracing_", "cleanCache_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DebugSettings.class) {
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

        public boolean getCleanCache() {
            return this.cleanCache_;
        }

        public boolean getEnableTracing() {
            return this.enableTracing_;
        }

        public boolean getWebviewInspectable() {
            return this.webviewInspectable_;
        }

        public static Builder newBuilder(DebugSettings debugSettings) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(debugSettings);
        }

        public static DebugSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DebugSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DebugSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DebugSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DebugSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DebugSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DebugSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DebugSettings parseFrom(InputStream inputStream) throws IOException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DebugSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DebugSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DebugSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DebugSettingsOrBuilder extends MessageLiteOrBuilder {
        boolean getCleanCache();

        boolean getEnableTracing();

        boolean getWebviewInspectable();
    }

    public static final class DiagnosticEventsConfiguration extends GeneratedMessageLite implements DiagnosticEventsConfigurationOrBuilder {
        public static final int ALLOWED_EVENTS_FIELD_NUMBER = 6;
        public static final int BLOCKED_EVENTS_FIELD_NUMBER = 7;
        private static final DiagnosticEventsConfiguration DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int MAX_BATCH_INTERVAL_MS_FIELD_NUMBER = 3;
        public static final int MAX_BATCH_SIZE_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int SEVERITY_FIELD_NUMBER = 5;
        public static final int TTM_ENABLED_FIELD_NUMBER = 4;
        private static final Internal.ListAdapter.Converter allowedEvents_converter_ = new a();
        private static final Internal.ListAdapter.Converter blockedEvents_converter_ = new b();
        private int allowedEventsMemoizedSerializedSize;
        private int blockedEventsMemoizedSerializedSize;
        private boolean enabled_;
        private int maxBatchIntervalMs_;
        private int maxBatchSize_;
        private int severity_;
        private boolean ttmEnabled_;
        private Internal.IntList allowedEvents_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList blockedEvents_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.Builder implements DiagnosticEventsConfigurationOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllAllowedEvents(Iterable iterable) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4600((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addAllAllowedEventsValue(Iterable iterable) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$5000((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addAllBlockedEvents(Iterable iterable) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$5300((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addAllBlockedEventsValue(Iterable iterable) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$5700((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addAllowedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4500((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, diagnosticEventType);
                return this;
            }

            public Builder addAllowedEventsValue(int i) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4900((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder addBlockedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$5200((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, diagnosticEventType);
                return this;
            }

            public Builder addBlockedEventsValue(int i) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$5600((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder clearAllowedEvents() {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4700((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBlockedEvents() {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$5400((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEnabled() {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$3400((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMaxBatchIntervalMs() {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$3800((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearMaxBatchSize() {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$3600((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSeverity() {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4300((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTtmEnabled() {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4000((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i) {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAllowedEvents(i);
            }

            public int getAllowedEventsCount() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAllowedEventsCount();
            }

            public List getAllowedEventsList() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAllowedEventsList();
            }

            public int getAllowedEventsValue(int i) {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAllowedEventsValue(i);
            }

            public List getAllowedEventsValueList() {
                return Collections.unmodifiableList(((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAllowedEventsValueList());
            }

            public DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i) {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getBlockedEvents(i);
            }

            public int getBlockedEventsCount() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getBlockedEventsCount();
            }

            public List getBlockedEventsList() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getBlockedEventsList();
            }

            public int getBlockedEventsValue(int i) {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getBlockedEventsValue(i);
            }

            public List getBlockedEventsValueList() {
                return Collections.unmodifiableList(((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getBlockedEventsValueList());
            }

            public boolean getEnabled() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getEnabled();
            }

            public int getMaxBatchIntervalMs() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getMaxBatchIntervalMs();
            }

            public int getMaxBatchSize() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getMaxBatchSize();
            }

            public DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getSeverity();
            }

            public int getSeverityValue() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getSeverityValue();
            }

            public boolean getTtmEnabled() {
                return ((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance).getTtmEnabled();
            }

            public Builder setAllowedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4400((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i, diagnosticEventType);
                return this;
            }

            public Builder setAllowedEventsValue(int i, int i2) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4800((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i, i2);
                return this;
            }

            public Builder setBlockedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$5100((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i, diagnosticEventType);
                return this;
            }

            public Builder setBlockedEventsValue(int i, int i2) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$5500((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i, i2);
                return this;
            }

            public Builder setEnabled(boolean z) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$3300((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setMaxBatchIntervalMs(int i) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$3700((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setMaxBatchSize(int i) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$3500((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4200((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, diagnosticEventsSeverity);
                return this;
            }

            public Builder setSeverityValue(int i) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$4100((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setTtmEnabled(boolean z) {
                copyOnWrite();
                DiagnosticEventsConfiguration.access$3900((DiagnosticEventsConfiguration) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            private Builder() {
                super(DiagnosticEventsConfiguration.access$3200());
            }
        }

        public class a implements Internal.ListAdapter.Converter {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DiagnosticEventRequestOuterClass.DiagnosticEventType convert(Integer num) {
                DiagnosticEventRequestOuterClass.DiagnosticEventType forNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
                return forNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : forNumber;
            }
        }

        public class b implements Internal.ListAdapter.Converter {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DiagnosticEventRequestOuterClass.DiagnosticEventType convert(Integer num) {
                DiagnosticEventRequestOuterClass.DiagnosticEventType forNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(num.intValue());
                return forNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : forNumber;
            }
        }

        static {
            DiagnosticEventsConfiguration diagnosticEventsConfiguration = new DiagnosticEventsConfiguration();
            DEFAULT_INSTANCE = diagnosticEventsConfiguration;
            GeneratedMessageLite.registerDefaultInstance(DiagnosticEventsConfiguration.class, diagnosticEventsConfiguration);
        }

        private DiagnosticEventsConfiguration() {
        }

        public static /* synthetic */ DiagnosticEventsConfiguration access$3200() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$3300(DiagnosticEventsConfiguration diagnosticEventsConfiguration, boolean z) {
            diagnosticEventsConfiguration.setEnabled(z);
        }

        public static /* synthetic */ void access$3400(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.clearEnabled();
        }

        public static /* synthetic */ void access$3500(DiagnosticEventsConfiguration diagnosticEventsConfiguration, int i) {
            diagnosticEventsConfiguration.setMaxBatchSize(i);
        }

        public static /* synthetic */ void access$3600(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.clearMaxBatchSize();
        }

        public static /* synthetic */ void access$3700(DiagnosticEventsConfiguration diagnosticEventsConfiguration, int i) {
            diagnosticEventsConfiguration.setMaxBatchIntervalMs(i);
        }

        public static /* synthetic */ void access$3800(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.clearMaxBatchIntervalMs();
        }

        public static /* synthetic */ void access$3900(DiagnosticEventsConfiguration diagnosticEventsConfiguration, boolean z) {
            diagnosticEventsConfiguration.setTtmEnabled(z);
        }

        public static /* synthetic */ void access$4000(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.clearTtmEnabled();
        }

        public static /* synthetic */ void access$4100(DiagnosticEventsConfiguration diagnosticEventsConfiguration, int i) {
            diagnosticEventsConfiguration.setSeverityValue(i);
        }

        public static /* synthetic */ void access$4200(DiagnosticEventsConfiguration diagnosticEventsConfiguration, DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
            diagnosticEventsConfiguration.setSeverity(diagnosticEventsSeverity);
        }

        public static /* synthetic */ void access$4300(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.clearSeverity();
        }

        public static /* synthetic */ void access$4400(DiagnosticEventsConfiguration diagnosticEventsConfiguration, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventsConfiguration.setAllowedEvents(i, diagnosticEventType);
        }

        public static /* synthetic */ void access$4500(DiagnosticEventsConfiguration diagnosticEventsConfiguration, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventsConfiguration.addAllowedEvents(diagnosticEventType);
        }

        public static /* synthetic */ void access$4600(DiagnosticEventsConfiguration diagnosticEventsConfiguration, Iterable iterable) {
            diagnosticEventsConfiguration.addAllAllowedEvents(iterable);
        }

        public static /* synthetic */ void access$4700(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.clearAllowedEvents();
        }

        public static /* synthetic */ void access$4800(DiagnosticEventsConfiguration diagnosticEventsConfiguration, int i, int i2) {
            diagnosticEventsConfiguration.setAllowedEventsValue(i, i2);
        }

        public static /* synthetic */ void access$4900(DiagnosticEventsConfiguration diagnosticEventsConfiguration, int i) {
            diagnosticEventsConfiguration.addAllowedEventsValue(i);
        }

        public static /* synthetic */ void access$5000(DiagnosticEventsConfiguration diagnosticEventsConfiguration, Iterable iterable) {
            diagnosticEventsConfiguration.addAllAllowedEventsValue(iterable);
        }

        public static /* synthetic */ void access$5100(DiagnosticEventsConfiguration diagnosticEventsConfiguration, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventsConfiguration.setBlockedEvents(i, diagnosticEventType);
        }

        public static /* synthetic */ void access$5200(DiagnosticEventsConfiguration diagnosticEventsConfiguration, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventsConfiguration.addBlockedEvents(diagnosticEventType);
        }

        public static /* synthetic */ void access$5300(DiagnosticEventsConfiguration diagnosticEventsConfiguration, Iterable iterable) {
            diagnosticEventsConfiguration.addAllBlockedEvents(iterable);
        }

        public static /* synthetic */ void access$5400(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.clearBlockedEvents();
        }

        public static /* synthetic */ void access$5500(DiagnosticEventsConfiguration diagnosticEventsConfiguration, int i, int i2) {
            diagnosticEventsConfiguration.setBlockedEventsValue(i, i2);
        }

        public static /* synthetic */ void access$5600(DiagnosticEventsConfiguration diagnosticEventsConfiguration, int i) {
            diagnosticEventsConfiguration.addBlockedEventsValue(i);
        }

        public static /* synthetic */ void access$5700(DiagnosticEventsConfiguration diagnosticEventsConfiguration, Iterable iterable) {
            diagnosticEventsConfiguration.addAllBlockedEventsValue(iterable);
        }

        private void addAllAllowedEvents(Iterable iterable) {
            ensureAllowedEventsIsMutable();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.allowedEvents_.addInt(((DiagnosticEventRequestOuterClass.DiagnosticEventType) it.next()).getNumber());
            }
        }

        private void addAllAllowedEventsValue(Iterable iterable) {
            ensureAllowedEventsIsMutable();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.allowedEvents_.addInt(((Integer) it.next()).intValue());
            }
        }

        private void addAllBlockedEvents(Iterable iterable) {
            ensureBlockedEventsIsMutable();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.blockedEvents_.addInt(((DiagnosticEventRequestOuterClass.DiagnosticEventType) it.next()).getNumber());
            }
        }

        private void addAllBlockedEventsValue(Iterable iterable) {
            ensureBlockedEventsIsMutable();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.blockedEvents_.addInt(((Integer) it.next()).intValue());
            }
        }

        private void addAllowedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(diagnosticEventType.getNumber());
        }

        private void addAllowedEventsValue(int i) {
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.addInt(i);
        }

        private void addBlockedEvents(DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(diagnosticEventType.getNumber());
        }

        private void addBlockedEventsValue(int i) {
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.addInt(i);
        }

        private void clearAllowedEvents() {
            this.allowedEvents_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearBlockedEvents() {
            this.blockedEvents_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearEnabled() {
            this.enabled_ = false;
        }

        private void clearMaxBatchIntervalMs() {
            this.maxBatchIntervalMs_ = 0;
        }

        private void clearMaxBatchSize() {
            this.maxBatchSize_ = 0;
        }

        private void clearSeverity() {
            this.severity_ = 0;
        }

        private void clearTtmEnabled() {
            this.ttmEnabled_ = false;
        }

        private void ensureAllowedEventsIsMutable() {
            Internal.IntList intList = this.allowedEvents_;
            if (intList.isModifiable()) {
                return;
            }
            this.allowedEvents_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureBlockedEventsIsMutable() {
            Internal.IntList intList = this.blockedEvents_;
            if (intList.isModifiable()) {
                return;
            }
            this.blockedEvents_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static DiagnosticEventsConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DiagnosticEventsConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAllowedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(i, diagnosticEventType.getNumber());
        }

        private void setAllowedEventsValue(int i, int i2) {
            ensureAllowedEventsIsMutable();
            this.allowedEvents_.setInt(i, i2);
        }

        private void setBlockedEvents(int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            diagnosticEventType.getClass();
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(i, diagnosticEventType.getNumber());
        }

        private void setBlockedEventsValue(int i, int i2) {
            ensureBlockedEventsIsMutable();
            this.blockedEvents_.setInt(i, i2);
        }

        private void setEnabled(boolean z) {
            this.enabled_ = z;
        }

        private void setMaxBatchIntervalMs(int i) {
            this.maxBatchIntervalMs_ = i;
        }

        private void setMaxBatchSize(int i) {
            this.maxBatchSize_ = i;
        }

        private void setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
            this.severity_ = diagnosticEventsSeverity.getNumber();
        }

        private void setSeverityValue(int i) {
            this.severity_ = i;
        }

        private void setTtmEnabled(boolean z) {
            this.ttmEnabled_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new DiagnosticEventsConfiguration();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004\u0007\u0005\f\u0006,\u0007,", new Object[]{"enabled_", "maxBatchSize_", "maxBatchIntervalMs_", "ttmEnabled_", "severity_", "allowedEvents_", "blockedEvents_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DiagnosticEventsConfiguration.class) {
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

        public DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i) {
            DiagnosticEventRequestOuterClass.DiagnosticEventType forNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.allowedEvents_.getInt(i));
            return forNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : forNumber;
        }

        public int getAllowedEventsCount() {
            return this.allowedEvents_.size();
        }

        public List getAllowedEventsList() {
            return new Internal.ListAdapter(this.allowedEvents_, allowedEvents_converter_);
        }

        public int getAllowedEventsValue(int i) {
            return this.allowedEvents_.getInt(i);
        }

        public List getAllowedEventsValueList() {
            return this.allowedEvents_;
        }

        public DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i) {
            DiagnosticEventRequestOuterClass.DiagnosticEventType forNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(this.blockedEvents_.getInt(i));
            return forNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : forNumber;
        }

        public int getBlockedEventsCount() {
            return this.blockedEvents_.size();
        }

        public List getBlockedEventsList() {
            return new Internal.ListAdapter(this.blockedEvents_, blockedEvents_converter_);
        }

        public int getBlockedEventsValue(int i) {
            return this.blockedEvents_.getInt(i);
        }

        public List getBlockedEventsValueList() {
            return this.blockedEvents_;
        }

        public boolean getEnabled() {
            return this.enabled_;
        }

        public int getMaxBatchIntervalMs() {
            return this.maxBatchIntervalMs_;
        }

        public int getMaxBatchSize() {
            return this.maxBatchSize_;
        }

        public DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity forNumber = DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(this.severity_);
            return forNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.UNRECOGNIZED : forNumber;
        }

        public int getSeverityValue() {
            return this.severity_;
        }

        public boolean getTtmEnabled() {
            return this.ttmEnabled_;
        }

        public static Builder newBuilder(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(diagnosticEventsConfiguration);
        }

        public static DiagnosticEventsConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DiagnosticEventsConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DiagnosticEventsConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DiagnosticEventsConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DiagnosticEventsConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DiagnosticEventsConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DiagnosticEventsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DiagnosticEventsConfigurationOrBuilder extends MessageLiteOrBuilder {
        DiagnosticEventRequestOuterClass.DiagnosticEventType getAllowedEvents(int i);

        int getAllowedEventsCount();

        List getAllowedEventsList();

        int getAllowedEventsValue(int i);

        List getAllowedEventsValueList();

        DiagnosticEventRequestOuterClass.DiagnosticEventType getBlockedEvents(int i);

        int getBlockedEventsCount();

        List getBlockedEventsList();

        int getBlockedEventsValue(int i);

        List getBlockedEventsValueList();

        boolean getEnabled();

        int getMaxBatchIntervalMs();

        int getMaxBatchSize();

        DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity();

        int getSeverityValue();

        boolean getTtmEnabled();
    }

    public static final class FeatureFlags extends GeneratedMessageLite implements FeatureFlagsOrBuilder {
        public static final int APP_SHEET_BUG_CHECK_ENABLED_FIELD_NUMBER = 4;
        public static final int BOLD_SDK_NEXT_SESSION_ENABLED_FIELD_NUMBER = 3;
        private static final FeatureFlags DEFAULT_INSTANCE;
        public static final int OPENGL_GPU_ENABLED_FIELD_NUMBER = 1;
        public static final int OPPORTUNITY_ID_PLACEMENT_VALIDATION_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int RECOVER_TERMINATED_WEBVIEWS_FIELD_NUMBER = 5;
        public static final int SHOULD_HANDLE_WEBVIEW_CACHING_FIELD_NUMBER = 6;
        public static final int SHOULD_SEND_IAP_HISTORY_FIELD_NUMBER = 7;
        private boolean appSheetBugCheckEnabled_;
        private boolean boldSdkNextSessionEnabled_;
        private boolean openglGpuEnabled_;
        private boolean opportunityIdPlacementValidation_;
        private boolean recoverTerminatedWebviews_;
        private boolean shouldHandleWebviewCaching_;
        private boolean shouldSendIapHistory_;

        public static final class Builder extends GeneratedMessageLite.Builder implements FeatureFlagsOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAppSheetBugCheckEnabled() {
                copyOnWrite();
                FeatureFlags.access$13200((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBoldSdkNextSessionEnabled() {
                copyOnWrite();
                FeatureFlags.access$13000((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOpenglGpuEnabled() {
                copyOnWrite();
                FeatureFlags.access$12600((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOpportunityIdPlacementValidation() {
                copyOnWrite();
                FeatureFlags.access$12800((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearRecoverTerminatedWebviews() {
                copyOnWrite();
                FeatureFlags.access$13400((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearShouldHandleWebviewCaching() {
                copyOnWrite();
                FeatureFlags.access$13600((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearShouldSendIapHistory() {
                copyOnWrite();
                FeatureFlags.access$13800((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public boolean getAppSheetBugCheckEnabled() {
                return ((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance).getAppSheetBugCheckEnabled();
            }

            public boolean getBoldSdkNextSessionEnabled() {
                return ((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance).getBoldSdkNextSessionEnabled();
            }

            public boolean getOpenglGpuEnabled() {
                return ((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance).getOpenglGpuEnabled();
            }

            public boolean getOpportunityIdPlacementValidation() {
                return ((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance).getOpportunityIdPlacementValidation();
            }

            public boolean getRecoverTerminatedWebviews() {
                return ((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance).getRecoverTerminatedWebviews();
            }

            public boolean getShouldHandleWebviewCaching() {
                return ((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance).getShouldHandleWebviewCaching();
            }

            public boolean getShouldSendIapHistory() {
                return ((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance).getShouldSendIapHistory();
            }

            public Builder setAppSheetBugCheckEnabled(boolean z) {
                copyOnWrite();
                FeatureFlags.access$13100((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setBoldSdkNextSessionEnabled(boolean z) {
                copyOnWrite();
                FeatureFlags.access$12900((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setOpenglGpuEnabled(boolean z) {
                copyOnWrite();
                FeatureFlags.access$12500((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setOpportunityIdPlacementValidation(boolean z) {
                copyOnWrite();
                FeatureFlags.access$12700((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setRecoverTerminatedWebviews(boolean z) {
                copyOnWrite();
                FeatureFlags.access$13300((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setShouldHandleWebviewCaching(boolean z) {
                copyOnWrite();
                FeatureFlags.access$13500((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setShouldSendIapHistory(boolean z) {
                copyOnWrite();
                FeatureFlags.access$13700((FeatureFlags) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            private Builder() {
                super(FeatureFlags.access$12400());
            }
        }

        static {
            FeatureFlags featureFlags = new FeatureFlags();
            DEFAULT_INSTANCE = featureFlags;
            GeneratedMessageLite.registerDefaultInstance(FeatureFlags.class, featureFlags);
        }

        private FeatureFlags() {
        }

        public static /* synthetic */ FeatureFlags access$12400() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$12500(FeatureFlags featureFlags, boolean z) {
            featureFlags.setOpenglGpuEnabled(z);
        }

        public static /* synthetic */ void access$12600(FeatureFlags featureFlags) {
            featureFlags.clearOpenglGpuEnabled();
        }

        public static /* synthetic */ void access$12700(FeatureFlags featureFlags, boolean z) {
            featureFlags.setOpportunityIdPlacementValidation(z);
        }

        public static /* synthetic */ void access$12800(FeatureFlags featureFlags) {
            featureFlags.clearOpportunityIdPlacementValidation();
        }

        public static /* synthetic */ void access$12900(FeatureFlags featureFlags, boolean z) {
            featureFlags.setBoldSdkNextSessionEnabled(z);
        }

        public static /* synthetic */ void access$13000(FeatureFlags featureFlags) {
            featureFlags.clearBoldSdkNextSessionEnabled();
        }

        public static /* synthetic */ void access$13100(FeatureFlags featureFlags, boolean z) {
            featureFlags.setAppSheetBugCheckEnabled(z);
        }

        public static /* synthetic */ void access$13200(FeatureFlags featureFlags) {
            featureFlags.clearAppSheetBugCheckEnabled();
        }

        public static /* synthetic */ void access$13300(FeatureFlags featureFlags, boolean z) {
            featureFlags.setRecoverTerminatedWebviews(z);
        }

        public static /* synthetic */ void access$13400(FeatureFlags featureFlags) {
            featureFlags.clearRecoverTerminatedWebviews();
        }

        public static /* synthetic */ void access$13500(FeatureFlags featureFlags, boolean z) {
            featureFlags.setShouldHandleWebviewCaching(z);
        }

        public static /* synthetic */ void access$13600(FeatureFlags featureFlags) {
            featureFlags.clearShouldHandleWebviewCaching();
        }

        public static /* synthetic */ void access$13700(FeatureFlags featureFlags, boolean z) {
            featureFlags.setShouldSendIapHistory(z);
        }

        public static /* synthetic */ void access$13800(FeatureFlags featureFlags) {
            featureFlags.clearShouldSendIapHistory();
        }

        private void clearAppSheetBugCheckEnabled() {
            this.appSheetBugCheckEnabled_ = false;
        }

        private void clearBoldSdkNextSessionEnabled() {
            this.boldSdkNextSessionEnabled_ = false;
        }

        private void clearOpenglGpuEnabled() {
            this.openglGpuEnabled_ = false;
        }

        private void clearOpportunityIdPlacementValidation() {
            this.opportunityIdPlacementValidation_ = false;
        }

        private void clearRecoverTerminatedWebviews() {
            this.recoverTerminatedWebviews_ = false;
        }

        private void clearShouldHandleWebviewCaching() {
            this.shouldHandleWebviewCaching_ = false;
        }

        private void clearShouldSendIapHistory() {
            this.shouldSendIapHistory_ = false;
        }

        public static FeatureFlags getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureFlags parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureFlags parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppSheetBugCheckEnabled(boolean z) {
            this.appSheetBugCheckEnabled_ = z;
        }

        private void setBoldSdkNextSessionEnabled(boolean z) {
            this.boldSdkNextSessionEnabled_ = z;
        }

        private void setOpenglGpuEnabled(boolean z) {
            this.openglGpuEnabled_ = z;
        }

        private void setOpportunityIdPlacementValidation(boolean z) {
            this.opportunityIdPlacementValidation_ = z;
        }

        private void setRecoverTerminatedWebviews(boolean z) {
            this.recoverTerminatedWebviews_ = z;
        }

        private void setShouldHandleWebviewCaching(boolean z) {
            this.shouldHandleWebviewCaching_ = z;
        }

        private void setShouldSendIapHistory(boolean z) {
            this.shouldSendIapHistory_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new FeatureFlags();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007\u0007\u0007", new Object[]{"openglGpuEnabled_", "opportunityIdPlacementValidation_", "boldSdkNextSessionEnabled_", "appSheetBugCheckEnabled_", "recoverTerminatedWebviews_", "shouldHandleWebviewCaching_", "shouldSendIapHistory_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (FeatureFlags.class) {
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

        public boolean getAppSheetBugCheckEnabled() {
            return this.appSheetBugCheckEnabled_;
        }

        public boolean getBoldSdkNextSessionEnabled() {
            return this.boldSdkNextSessionEnabled_;
        }

        public boolean getOpenglGpuEnabled() {
            return this.openglGpuEnabled_;
        }

        public boolean getOpportunityIdPlacementValidation() {
            return this.opportunityIdPlacementValidation_;
        }

        public boolean getRecoverTerminatedWebviews() {
            return this.recoverTerminatedWebviews_;
        }

        public boolean getShouldHandleWebviewCaching() {
            return this.shouldHandleWebviewCaching_;
        }

        public boolean getShouldSendIapHistory() {
            return this.shouldSendIapHistory_;
        }

        public static Builder newBuilder(FeatureFlags featureFlags) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(featureFlags);
        }

        public static FeatureFlags parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureFlags parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FeatureFlags parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FeatureFlags parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FeatureFlags parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureFlags parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FeatureFlags parseFrom(InputStream inputStream) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureFlags parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureFlags parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FeatureFlags parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FeatureFlags) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface FeatureFlagsOrBuilder extends MessageLiteOrBuilder {
        boolean getAppSheetBugCheckEnabled();

        boolean getBoldSdkNextSessionEnabled();

        boolean getOpenglGpuEnabled();

        boolean getOpportunityIdPlacementValidation();

        boolean getRecoverTerminatedWebviews();

        boolean getShouldHandleWebviewCaching();

        boolean getShouldSendIapHistory();
    }

    public static final class NativeConfiguration extends GeneratedMessageLite implements NativeConfigurationOrBuilder {
        public static final int ADDITIONAL_STORE_PACKAGES_FIELD_NUMBER = 10;
        public static final int AD_OPERATIONS_FIELD_NUMBER = 6;
        public static final int AD_POLICY_FIELD_NUMBER = 3;
        public static final int CACHED_ASSETS_CONFIGURATION_FIELD_NUMBER = 11;
        public static final int CACHED_WEBVIEW_FILES_CONFIGURATION_FIELD_NUMBER = 13;
        public static final int DEBUG_SETTINGS_FIELD_NUMBER = 16;
        private static final NativeConfiguration DEFAULT_INSTANCE;
        public static final int DEFAULT_SHOW_COMPLETION_STATE_FIELD_NUMBER = 14;
        public static final int DIAGNOSTIC_EVENTS_FIELD_NUMBER = 1;
        public static final int DOWNLOAD_POLICY_FIELD_NUMBER = 15;
        public static final int ENABLE_IAP_EVENT_FIELD_NUMBER = 8;
        public static final int ENABLE_OM_FIELD_NUMBER = 9;
        public static final int FEATURE_FLAGS_FIELD_NUMBER = 7;
        public static final int INIT_POLICY_FIELD_NUMBER = 2;
        public static final int OBSERVABLE_ANDROID_ACTIVITIES_FIELD_NUMBER = 12;
        public static final int OPERATIVE_EVENT_POLICY_FIELD_NUMBER = 4;
        public static final int OTHER_POLICY_FIELD_NUMBER = 5;
        private static volatile Parser PARSER;
        private AdOperationsConfiguration adOperations_;
        private RequestPolicy adPolicy_;
        private int bitField0_;
        private CachedAssetsConfiguration cachedAssetsConfiguration_;
        private CachedAssetsConfiguration cachedWebviewFilesConfiguration_;
        private DebugSettings debugSettings_;
        private int defaultShowCompletionState_;
        private DiagnosticEventsConfiguration diagnosticEvents_;
        private RequestPolicy downloadPolicy_;
        private boolean enableIapEvent_;
        private boolean enableOm_;
        private FeatureFlags featureFlags_;
        private RequestPolicy initPolicy_;
        private RequestPolicy operativeEventPolicy_;
        private RequestPolicy otherPolicy_;
        private Internal.ProtobufList additionalStorePackages_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList observableAndroidActivities_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder implements NativeConfigurationOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAdditionalStorePackages(String str) {
                copyOnWrite();
                NativeConfiguration.access$10000((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder addAdditionalStorePackagesBytes(ByteString byteString) {
                copyOnWrite();
                NativeConfiguration.access$10300((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder addAllAdditionalStorePackages(Iterable iterable) {
                copyOnWrite();
                NativeConfiguration.access$10100((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addAllObservableAndroidActivities(Iterable iterable) {
                copyOnWrite();
                NativeConfiguration.access$10900((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addObservableAndroidActivities(ByteString byteString) {
                copyOnWrite();
                NativeConfiguration.access$10800((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder clearAdOperations() {
                copyOnWrite();
                NativeConfiguration.access$9100((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdPolicy() {
                copyOnWrite();
                NativeConfiguration.access$8200((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAdditionalStorePackages() {
                copyOnWrite();
                NativeConfiguration.access$10200((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCachedAssetsConfiguration() {
                copyOnWrite();
                NativeConfiguration.access$10600((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCachedWebviewFilesConfiguration() {
                copyOnWrite();
                NativeConfiguration.access$11300((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDebugSettings() {
                copyOnWrite();
                NativeConfiguration.access$12200((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDefaultShowCompletionState() {
                copyOnWrite();
                NativeConfiguration.access$11600((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDiagnosticEvents() {
                copyOnWrite();
                NativeConfiguration.access$7600((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDownloadPolicy() {
                copyOnWrite();
                NativeConfiguration.access$11900((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEnableIapEvent() {
                copyOnWrite();
                NativeConfiguration.access$9600((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearEnableOm() {
                copyOnWrite();
                NativeConfiguration.access$9800((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearFeatureFlags() {
                copyOnWrite();
                NativeConfiguration.access$9400((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearInitPolicy() {
                copyOnWrite();
                NativeConfiguration.access$7900((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearObservableAndroidActivities() {
                copyOnWrite();
                NativeConfiguration.access$11000((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOperativeEventPolicy() {
                copyOnWrite();
                NativeConfiguration.access$8500((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOtherPolicy() {
                copyOnWrite();
                NativeConfiguration.access$8800((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public AdOperationsConfiguration getAdOperations() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdOperations();
            }

            public RequestPolicy getAdPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdPolicy();
            }

            public String getAdditionalStorePackages(int i) {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdditionalStorePackages(i);
            }

            public ByteString getAdditionalStorePackagesBytes(int i) {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdditionalStorePackagesBytes(i);
            }

            public int getAdditionalStorePackagesCount() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdditionalStorePackagesCount();
            }

            public List getAdditionalStorePackagesList() {
                return Collections.unmodifiableList(((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getAdditionalStorePackagesList());
            }

            public CachedAssetsConfiguration getCachedAssetsConfiguration() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getCachedAssetsConfiguration();
            }

            public CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getCachedWebviewFilesConfiguration();
            }

            public DebugSettings getDebugSettings() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getDebugSettings();
            }

            public ShowCompletionState getDefaultShowCompletionState() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getDefaultShowCompletionState();
            }

            public int getDefaultShowCompletionStateValue() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getDefaultShowCompletionStateValue();
            }

            public DiagnosticEventsConfiguration getDiagnosticEvents() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getDiagnosticEvents();
            }

            public RequestPolicy getDownloadPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getDownloadPolicy();
            }

            public boolean getEnableIapEvent() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getEnableIapEvent();
            }

            public boolean getEnableOm() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getEnableOm();
            }

            public FeatureFlags getFeatureFlags() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getFeatureFlags();
            }

            public RequestPolicy getInitPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getInitPolicy();
            }

            public ByteString getObservableAndroidActivities(int i) {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getObservableAndroidActivities(i);
            }

            public int getObservableAndroidActivitiesCount() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getObservableAndroidActivitiesCount();
            }

            public List getObservableAndroidActivitiesList() {
                return Collections.unmodifiableList(((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getObservableAndroidActivitiesList());
            }

            public RequestPolicy getOperativeEventPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getOperativeEventPolicy();
            }

            public RequestPolicy getOtherPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).getOtherPolicy();
            }

            public boolean hasAdOperations() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasAdOperations();
            }

            public boolean hasAdPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasAdPolicy();
            }

            public boolean hasCachedAssetsConfiguration() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasCachedAssetsConfiguration();
            }

            public boolean hasCachedWebviewFilesConfiguration() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasCachedWebviewFilesConfiguration();
            }

            public boolean hasDebugSettings() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasDebugSettings();
            }

            public boolean hasDiagnosticEvents() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasDiagnosticEvents();
            }

            public boolean hasDownloadPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasDownloadPolicy();
            }

            public boolean hasFeatureFlags() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasFeatureFlags();
            }

            public boolean hasInitPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasInitPolicy();
            }

            public boolean hasOperativeEventPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasOperativeEventPolicy();
            }

            public boolean hasOtherPolicy() {
                return ((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance).hasOtherPolicy();
            }

            public Builder mergeAdOperations(AdOperationsConfiguration adOperationsConfiguration) {
                copyOnWrite();
                NativeConfiguration.access$9000((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, adOperationsConfiguration);
                return this;
            }

            public Builder mergeAdPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$8100((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            public Builder mergeCachedAssetsConfiguration(CachedAssetsConfiguration cachedAssetsConfiguration) {
                copyOnWrite();
                NativeConfiguration.access$10500((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, cachedAssetsConfiguration);
                return this;
            }

            public Builder mergeCachedWebviewFilesConfiguration(CachedAssetsConfiguration cachedAssetsConfiguration) {
                copyOnWrite();
                NativeConfiguration.access$11200((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, cachedAssetsConfiguration);
                return this;
            }

            public Builder mergeDebugSettings(DebugSettings debugSettings) {
                copyOnWrite();
                NativeConfiguration.access$12100((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, debugSettings);
                return this;
            }

            public Builder mergeDiagnosticEvents(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
                copyOnWrite();
                NativeConfiguration.access$7500((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, diagnosticEventsConfiguration);
                return this;
            }

            public Builder mergeDownloadPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$11800((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            public Builder mergeFeatureFlags(FeatureFlags featureFlags) {
                copyOnWrite();
                NativeConfiguration.access$9300((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, featureFlags);
                return this;
            }

            public Builder mergeInitPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$7800((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            public Builder mergeOperativeEventPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$8400((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            public Builder mergeOtherPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$8700((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            public Builder setAdOperations(AdOperationsConfiguration adOperationsConfiguration) {
                copyOnWrite();
                NativeConfiguration.access$8900((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, adOperationsConfiguration);
                return this;
            }

            public Builder setAdPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$8000((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            public Builder setAdditionalStorePackages(int i, String str) {
                copyOnWrite();
                NativeConfiguration.access$9900((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, i, str);
                return this;
            }

            public Builder setCachedAssetsConfiguration(CachedAssetsConfiguration cachedAssetsConfiguration) {
                copyOnWrite();
                NativeConfiguration.access$10400((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, cachedAssetsConfiguration);
                return this;
            }

            public Builder setCachedWebviewFilesConfiguration(CachedAssetsConfiguration cachedAssetsConfiguration) {
                copyOnWrite();
                NativeConfiguration.access$11100((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, cachedAssetsConfiguration);
                return this;
            }

            public Builder setDebugSettings(DebugSettings debugSettings) {
                copyOnWrite();
                NativeConfiguration.access$12000((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, debugSettings);
                return this;
            }

            public Builder setDefaultShowCompletionState(ShowCompletionState showCompletionState) {
                copyOnWrite();
                NativeConfiguration.access$11500((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, showCompletionState);
                return this;
            }

            public Builder setDefaultShowCompletionStateValue(int i) {
                copyOnWrite();
                NativeConfiguration.access$11400((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setDiagnosticEvents(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
                copyOnWrite();
                NativeConfiguration.access$7400((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, diagnosticEventsConfiguration);
                return this;
            }

            public Builder setDownloadPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$11700((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            public Builder setEnableIapEvent(boolean z) {
                copyOnWrite();
                NativeConfiguration.access$9500((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setEnableOm(boolean z) {
                copyOnWrite();
                NativeConfiguration.access$9700((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            public Builder setFeatureFlags(FeatureFlags featureFlags) {
                copyOnWrite();
                NativeConfiguration.access$9200((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, featureFlags);
                return this;
            }

            public Builder setInitPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$7700((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            public Builder setObservableAndroidActivities(int i, ByteString byteString) {
                copyOnWrite();
                NativeConfiguration.access$10700((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, i, byteString);
                return this;
            }

            public Builder setOperativeEventPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$8300((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            public Builder setOtherPolicy(RequestPolicy requestPolicy) {
                copyOnWrite();
                NativeConfiguration.access$8600((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, requestPolicy);
                return this;
            }

            private Builder() {
                super(NativeConfiguration.access$7300());
            }

            public Builder setAdOperations(AdOperationsConfiguration.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$8900((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (AdOperationsConfiguration) builder.build());
                return this;
            }

            public Builder setAdPolicy(RequestPolicy.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$8000((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (RequestPolicy) builder.build());
                return this;
            }

            public Builder setCachedAssetsConfiguration(CachedAssetsConfiguration.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$10400((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (CachedAssetsConfiguration) builder.build());
                return this;
            }

            public Builder setCachedWebviewFilesConfiguration(CachedAssetsConfiguration.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$11100((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (CachedAssetsConfiguration) builder.build());
                return this;
            }

            public Builder setDebugSettings(DebugSettings.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$12000((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (DebugSettings) builder.build());
                return this;
            }

            public Builder setDiagnosticEvents(DiagnosticEventsConfiguration.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$7400((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (DiagnosticEventsConfiguration) builder.build());
                return this;
            }

            public Builder setDownloadPolicy(RequestPolicy.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$11700((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (RequestPolicy) builder.build());
                return this;
            }

            public Builder setFeatureFlags(FeatureFlags.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$9200((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (FeatureFlags) builder.build());
                return this;
            }

            public Builder setInitPolicy(RequestPolicy.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$7700((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (RequestPolicy) builder.build());
                return this;
            }

            public Builder setOperativeEventPolicy(RequestPolicy.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$8300((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (RequestPolicy) builder.build());
                return this;
            }

            public Builder setOtherPolicy(RequestPolicy.Builder builder) {
                copyOnWrite();
                NativeConfiguration.access$8600((NativeConfiguration) ((GeneratedMessageLite.Builder) this).instance, (RequestPolicy) builder.build());
                return this;
            }
        }

        static {
            NativeConfiguration nativeConfiguration = new NativeConfiguration();
            DEFAULT_INSTANCE = nativeConfiguration;
            GeneratedMessageLite.registerDefaultInstance(NativeConfiguration.class, nativeConfiguration);
        }

        private NativeConfiguration() {
        }

        public static /* synthetic */ void access$10000(NativeConfiguration nativeConfiguration, String str) {
            nativeConfiguration.addAdditionalStorePackages(str);
        }

        public static /* synthetic */ void access$10100(NativeConfiguration nativeConfiguration, Iterable iterable) {
            nativeConfiguration.addAllAdditionalStorePackages(iterable);
        }

        public static /* synthetic */ void access$10200(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearAdditionalStorePackages();
        }

        public static /* synthetic */ void access$10300(NativeConfiguration nativeConfiguration, ByteString byteString) {
            nativeConfiguration.addAdditionalStorePackagesBytes(byteString);
        }

        public static /* synthetic */ void access$10400(NativeConfiguration nativeConfiguration, CachedAssetsConfiguration cachedAssetsConfiguration) {
            nativeConfiguration.setCachedAssetsConfiguration(cachedAssetsConfiguration);
        }

        public static /* synthetic */ void access$10500(NativeConfiguration nativeConfiguration, CachedAssetsConfiguration cachedAssetsConfiguration) {
            nativeConfiguration.mergeCachedAssetsConfiguration(cachedAssetsConfiguration);
        }

        public static /* synthetic */ void access$10600(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearCachedAssetsConfiguration();
        }

        public static /* synthetic */ void access$10700(NativeConfiguration nativeConfiguration, int i, ByteString byteString) {
            nativeConfiguration.setObservableAndroidActivities(i, byteString);
        }

        public static /* synthetic */ void access$10800(NativeConfiguration nativeConfiguration, ByteString byteString) {
            nativeConfiguration.addObservableAndroidActivities(byteString);
        }

        public static /* synthetic */ void access$10900(NativeConfiguration nativeConfiguration, Iterable iterable) {
            nativeConfiguration.addAllObservableAndroidActivities(iterable);
        }

        public static /* synthetic */ void access$11000(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearObservableAndroidActivities();
        }

        public static /* synthetic */ void access$11100(NativeConfiguration nativeConfiguration, CachedAssetsConfiguration cachedAssetsConfiguration) {
            nativeConfiguration.setCachedWebviewFilesConfiguration(cachedAssetsConfiguration);
        }

        public static /* synthetic */ void access$11200(NativeConfiguration nativeConfiguration, CachedAssetsConfiguration cachedAssetsConfiguration) {
            nativeConfiguration.mergeCachedWebviewFilesConfiguration(cachedAssetsConfiguration);
        }

        public static /* synthetic */ void access$11300(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearCachedWebviewFilesConfiguration();
        }

        public static /* synthetic */ void access$11400(NativeConfiguration nativeConfiguration, int i) {
            nativeConfiguration.setDefaultShowCompletionStateValue(i);
        }

        public static /* synthetic */ void access$11500(NativeConfiguration nativeConfiguration, ShowCompletionState showCompletionState) {
            nativeConfiguration.setDefaultShowCompletionState(showCompletionState);
        }

        public static /* synthetic */ void access$11600(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearDefaultShowCompletionState();
        }

        public static /* synthetic */ void access$11700(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.setDownloadPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$11800(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.mergeDownloadPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$11900(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearDownloadPolicy();
        }

        public static /* synthetic */ void access$12000(NativeConfiguration nativeConfiguration, DebugSettings debugSettings) {
            nativeConfiguration.setDebugSettings(debugSettings);
        }

        public static /* synthetic */ void access$12100(NativeConfiguration nativeConfiguration, DebugSettings debugSettings) {
            nativeConfiguration.mergeDebugSettings(debugSettings);
        }

        public static /* synthetic */ void access$12200(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearDebugSettings();
        }

        public static /* synthetic */ NativeConfiguration access$7300() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$7400(NativeConfiguration nativeConfiguration, DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            nativeConfiguration.setDiagnosticEvents(diagnosticEventsConfiguration);
        }

        public static /* synthetic */ void access$7500(NativeConfiguration nativeConfiguration, DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            nativeConfiguration.mergeDiagnosticEvents(diagnosticEventsConfiguration);
        }

        public static /* synthetic */ void access$7600(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearDiagnosticEvents();
        }

        public static /* synthetic */ void access$7700(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.setInitPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$7800(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.mergeInitPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$7900(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearInitPolicy();
        }

        public static /* synthetic */ void access$8000(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.setAdPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$8100(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.mergeAdPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$8200(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearAdPolicy();
        }

        public static /* synthetic */ void access$8300(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.setOperativeEventPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$8400(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.mergeOperativeEventPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$8500(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearOperativeEventPolicy();
        }

        public static /* synthetic */ void access$8600(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.setOtherPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$8700(NativeConfiguration nativeConfiguration, RequestPolicy requestPolicy) {
            nativeConfiguration.mergeOtherPolicy(requestPolicy);
        }

        public static /* synthetic */ void access$8800(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearOtherPolicy();
        }

        public static /* synthetic */ void access$8900(NativeConfiguration nativeConfiguration, AdOperationsConfiguration adOperationsConfiguration) {
            nativeConfiguration.setAdOperations(adOperationsConfiguration);
        }

        public static /* synthetic */ void access$9000(NativeConfiguration nativeConfiguration, AdOperationsConfiguration adOperationsConfiguration) {
            nativeConfiguration.mergeAdOperations(adOperationsConfiguration);
        }

        public static /* synthetic */ void access$9100(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearAdOperations();
        }

        public static /* synthetic */ void access$9200(NativeConfiguration nativeConfiguration, FeatureFlags featureFlags) {
            nativeConfiguration.setFeatureFlags(featureFlags);
        }

        public static /* synthetic */ void access$9300(NativeConfiguration nativeConfiguration, FeatureFlags featureFlags) {
            nativeConfiguration.mergeFeatureFlags(featureFlags);
        }

        public static /* synthetic */ void access$9400(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearFeatureFlags();
        }

        public static /* synthetic */ void access$9500(NativeConfiguration nativeConfiguration, boolean z) {
            nativeConfiguration.setEnableIapEvent(z);
        }

        public static /* synthetic */ void access$9600(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearEnableIapEvent();
        }

        public static /* synthetic */ void access$9700(NativeConfiguration nativeConfiguration, boolean z) {
            nativeConfiguration.setEnableOm(z);
        }

        public static /* synthetic */ void access$9800(NativeConfiguration nativeConfiguration) {
            nativeConfiguration.clearEnableOm();
        }

        public static /* synthetic */ void access$9900(NativeConfiguration nativeConfiguration, int i, String str) {
            nativeConfiguration.setAdditionalStorePackages(i, str);
        }

        private void addAdditionalStorePackages(String str) {
            str.getClass();
            ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.add(str);
        }

        private void addAdditionalStorePackagesBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.add(byteString.toStringUtf8());
        }

        private void addAllAdditionalStorePackages(Iterable iterable) {
            ensureAdditionalStorePackagesIsMutable();
            AbstractMessageLite.addAll(iterable, this.additionalStorePackages_);
        }

        private void addAllObservableAndroidActivities(Iterable iterable) {
            ensureObservableAndroidActivitiesIsMutable();
            AbstractMessageLite.addAll(iterable, this.observableAndroidActivities_);
        }

        private void addObservableAndroidActivities(ByteString byteString) {
            byteString.getClass();
            ensureObservableAndroidActivitiesIsMutable();
            this.observableAndroidActivities_.add(byteString);
        }

        private void clearAdOperations() {
            this.adOperations_ = null;
            this.bitField0_ &= -33;
        }

        private void clearAdPolicy() {
            this.adPolicy_ = null;
            this.bitField0_ &= -5;
        }

        private void clearAdditionalStorePackages() {
            this.additionalStorePackages_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearCachedAssetsConfiguration() {
            this.cachedAssetsConfiguration_ = null;
            this.bitField0_ &= -129;
        }

        private void clearCachedWebviewFilesConfiguration() {
            this.cachedWebviewFilesConfiguration_ = null;
            this.bitField0_ &= -257;
        }

        private void clearDebugSettings() {
            this.debugSettings_ = null;
            this.bitField0_ &= -1025;
        }

        private void clearDefaultShowCompletionState() {
            this.defaultShowCompletionState_ = 0;
        }

        private void clearDiagnosticEvents() {
            this.diagnosticEvents_ = null;
            this.bitField0_ &= -2;
        }

        private void clearDownloadPolicy() {
            this.downloadPolicy_ = null;
            this.bitField0_ &= -513;
        }

        private void clearEnableIapEvent() {
            this.enableIapEvent_ = false;
        }

        private void clearEnableOm() {
            this.enableOm_ = false;
        }

        private void clearFeatureFlags() {
            this.featureFlags_ = null;
            this.bitField0_ &= -65;
        }

        private void clearInitPolicy() {
            this.initPolicy_ = null;
            this.bitField0_ &= -3;
        }

        private void clearObservableAndroidActivities() {
            this.observableAndroidActivities_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearOperativeEventPolicy() {
            this.operativeEventPolicy_ = null;
            this.bitField0_ &= -9;
        }

        private void clearOtherPolicy() {
            this.otherPolicy_ = null;
            this.bitField0_ &= -17;
        }

        private void ensureAdditionalStorePackagesIsMutable() {
            Internal.ProtobufList protobufList = this.additionalStorePackages_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.additionalStorePackages_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureObservableAndroidActivitiesIsMutable() {
            Internal.ProtobufList protobufList = this.observableAndroidActivities_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.observableAndroidActivities_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static NativeConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAdOperations(AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.getClass();
            AdOperationsConfiguration adOperationsConfiguration2 = this.adOperations_;
            if (adOperationsConfiguration2 == null || adOperationsConfiguration2 == AdOperationsConfiguration.getDefaultInstance()) {
                this.adOperations_ = adOperationsConfiguration;
            } else {
                this.adOperations_ = (AdOperationsConfiguration) ((AdOperationsConfiguration.Builder) AdOperationsConfiguration.newBuilder(this.adOperations_).mergeFrom(adOperationsConfiguration)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        private void mergeAdPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            RequestPolicy requestPolicy2 = this.adPolicy_;
            if (requestPolicy2 == null || requestPolicy2 == RequestPolicy.getDefaultInstance()) {
                this.adPolicy_ = requestPolicy;
            } else {
                this.adPolicy_ = (RequestPolicy) ((RequestPolicy.Builder) RequestPolicy.newBuilder(this.adPolicy_).mergeFrom(requestPolicy)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeCachedAssetsConfiguration(CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            CachedAssetsConfiguration cachedAssetsConfiguration2 = this.cachedAssetsConfiguration_;
            if (cachedAssetsConfiguration2 == null || cachedAssetsConfiguration2 == CachedAssetsConfiguration.getDefaultInstance()) {
                this.cachedAssetsConfiguration_ = cachedAssetsConfiguration;
            } else {
                this.cachedAssetsConfiguration_ = (CachedAssetsConfiguration) ((CachedAssetsConfiguration.Builder) CachedAssetsConfiguration.newBuilder(this.cachedAssetsConfiguration_).mergeFrom(cachedAssetsConfiguration)).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        private void mergeCachedWebviewFilesConfiguration(CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            CachedAssetsConfiguration cachedAssetsConfiguration2 = this.cachedWebviewFilesConfiguration_;
            if (cachedAssetsConfiguration2 == null || cachedAssetsConfiguration2 == CachedAssetsConfiguration.getDefaultInstance()) {
                this.cachedWebviewFilesConfiguration_ = cachedAssetsConfiguration;
            } else {
                this.cachedWebviewFilesConfiguration_ = (CachedAssetsConfiguration) ((CachedAssetsConfiguration.Builder) CachedAssetsConfiguration.newBuilder(this.cachedWebviewFilesConfiguration_).mergeFrom(cachedAssetsConfiguration)).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        private void mergeDebugSettings(DebugSettings debugSettings) {
            debugSettings.getClass();
            DebugSettings debugSettings2 = this.debugSettings_;
            if (debugSettings2 == null || debugSettings2 == DebugSettings.getDefaultInstance()) {
                this.debugSettings_ = debugSettings;
            } else {
                this.debugSettings_ = (DebugSettings) ((DebugSettings.Builder) DebugSettings.newBuilder(this.debugSettings_).mergeFrom(debugSettings)).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        private void mergeDiagnosticEvents(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.getClass();
            DiagnosticEventsConfiguration diagnosticEventsConfiguration2 = this.diagnosticEvents_;
            if (diagnosticEventsConfiguration2 == null || diagnosticEventsConfiguration2 == DiagnosticEventsConfiguration.getDefaultInstance()) {
                this.diagnosticEvents_ = diagnosticEventsConfiguration;
            } else {
                this.diagnosticEvents_ = (DiagnosticEventsConfiguration) ((DiagnosticEventsConfiguration.Builder) DiagnosticEventsConfiguration.newBuilder(this.diagnosticEvents_).mergeFrom(diagnosticEventsConfiguration)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeDownloadPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            RequestPolicy requestPolicy2 = this.downloadPolicy_;
            if (requestPolicy2 == null || requestPolicy2 == RequestPolicy.getDefaultInstance()) {
                this.downloadPolicy_ = requestPolicy;
            } else {
                this.downloadPolicy_ = (RequestPolicy) ((RequestPolicy.Builder) RequestPolicy.newBuilder(this.downloadPolicy_).mergeFrom(requestPolicy)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        private void mergeFeatureFlags(FeatureFlags featureFlags) {
            featureFlags.getClass();
            FeatureFlags featureFlags2 = this.featureFlags_;
            if (featureFlags2 == null || featureFlags2 == FeatureFlags.getDefaultInstance()) {
                this.featureFlags_ = featureFlags;
            } else {
                this.featureFlags_ = (FeatureFlags) ((FeatureFlags.Builder) FeatureFlags.newBuilder(this.featureFlags_).mergeFrom(featureFlags)).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        private void mergeInitPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            RequestPolicy requestPolicy2 = this.initPolicy_;
            if (requestPolicy2 == null || requestPolicy2 == RequestPolicy.getDefaultInstance()) {
                this.initPolicy_ = requestPolicy;
            } else {
                this.initPolicy_ = (RequestPolicy) ((RequestPolicy.Builder) RequestPolicy.newBuilder(this.initPolicy_).mergeFrom(requestPolicy)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeOperativeEventPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            RequestPolicy requestPolicy2 = this.operativeEventPolicy_;
            if (requestPolicy2 == null || requestPolicy2 == RequestPolicy.getDefaultInstance()) {
                this.operativeEventPolicy_ = requestPolicy;
            } else {
                this.operativeEventPolicy_ = (RequestPolicy) ((RequestPolicy.Builder) RequestPolicy.newBuilder(this.operativeEventPolicy_).mergeFrom(requestPolicy)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeOtherPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            RequestPolicy requestPolicy2 = this.otherPolicy_;
            if (requestPolicy2 == null || requestPolicy2 == RequestPolicy.getDefaultInstance()) {
                this.otherPolicy_ = requestPolicy;
            } else {
                this.otherPolicy_ = (RequestPolicy) ((RequestPolicy.Builder) RequestPolicy.newBuilder(this.otherPolicy_).mergeFrom(requestPolicy)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NativeConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdOperations(AdOperationsConfiguration adOperationsConfiguration) {
            adOperationsConfiguration.getClass();
            this.adOperations_ = adOperationsConfiguration;
            this.bitField0_ |= 32;
        }

        private void setAdPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.adPolicy_ = requestPolicy;
            this.bitField0_ |= 4;
        }

        private void setAdditionalStorePackages(int i, String str) {
            str.getClass();
            ensureAdditionalStorePackagesIsMutable();
            this.additionalStorePackages_.set(i, str);
        }

        private void setCachedAssetsConfiguration(CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            this.cachedAssetsConfiguration_ = cachedAssetsConfiguration;
            this.bitField0_ |= 128;
        }

        private void setCachedWebviewFilesConfiguration(CachedAssetsConfiguration cachedAssetsConfiguration) {
            cachedAssetsConfiguration.getClass();
            this.cachedWebviewFilesConfiguration_ = cachedAssetsConfiguration;
            this.bitField0_ |= 256;
        }

        private void setDebugSettings(DebugSettings debugSettings) {
            debugSettings.getClass();
            this.debugSettings_ = debugSettings;
            this.bitField0_ |= 1024;
        }

        private void setDefaultShowCompletionState(ShowCompletionState showCompletionState) {
            this.defaultShowCompletionState_ = showCompletionState.getNumber();
        }

        private void setDefaultShowCompletionStateValue(int i) {
            this.defaultShowCompletionState_ = i;
        }

        private void setDiagnosticEvents(DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            diagnosticEventsConfiguration.getClass();
            this.diagnosticEvents_ = diagnosticEventsConfiguration;
            this.bitField0_ |= 1;
        }

        private void setDownloadPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.downloadPolicy_ = requestPolicy;
            this.bitField0_ |= 512;
        }

        private void setEnableIapEvent(boolean z) {
            this.enableIapEvent_ = z;
        }

        private void setEnableOm(boolean z) {
            this.enableOm_ = z;
        }

        private void setFeatureFlags(FeatureFlags featureFlags) {
            featureFlags.getClass();
            this.featureFlags_ = featureFlags;
            this.bitField0_ |= 64;
        }

        private void setInitPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.initPolicy_ = requestPolicy;
            this.bitField0_ |= 2;
        }

        private void setObservableAndroidActivities(int i, ByteString byteString) {
            byteString.getClass();
            ensureObservableAndroidActivitiesIsMutable();
            this.observableAndroidActivities_.set(i, byteString);
        }

        private void setOperativeEventPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.operativeEventPolicy_ = requestPolicy;
            this.bitField0_ |= 8;
        }

        private void setOtherPolicy(RequestPolicy requestPolicy) {
            requestPolicy.getClass();
            this.otherPolicy_ = requestPolicy;
            this.bitField0_ |= 16;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NativeConfiguration();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b\u0007\t\u0007\nȚ\u000bဉ\u0007\f\u001c\rဉ\b\u000e\f\u000fဉ\t\u0010ဉ\n", new Object[]{"bitField0_", "diagnosticEvents_", "initPolicy_", "adPolicy_", "operativeEventPolicy_", "otherPolicy_", "adOperations_", "featureFlags_", "enableIapEvent_", "enableOm_", "additionalStorePackages_", "cachedAssetsConfiguration_", "observableAndroidActivities_", "cachedWebviewFilesConfiguration_", "defaultShowCompletionState_", "downloadPolicy_", "debugSettings_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NativeConfiguration.class) {
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

        public AdOperationsConfiguration getAdOperations() {
            AdOperationsConfiguration adOperationsConfiguration = this.adOperations_;
            return adOperationsConfiguration == null ? AdOperationsConfiguration.getDefaultInstance() : adOperationsConfiguration;
        }

        public RequestPolicy getAdPolicy() {
            RequestPolicy requestPolicy = this.adPolicy_;
            return requestPolicy == null ? RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        public String getAdditionalStorePackages(int i) {
            return (String) this.additionalStorePackages_.get(i);
        }

        public ByteString getAdditionalStorePackagesBytes(int i) {
            return ByteString.copyFromUtf8((String) this.additionalStorePackages_.get(i));
        }

        public int getAdditionalStorePackagesCount() {
            return this.additionalStorePackages_.size();
        }

        public List getAdditionalStorePackagesList() {
            return this.additionalStorePackages_;
        }

        public CachedAssetsConfiguration getCachedAssetsConfiguration() {
            CachedAssetsConfiguration cachedAssetsConfiguration = this.cachedAssetsConfiguration_;
            return cachedAssetsConfiguration == null ? CachedAssetsConfiguration.getDefaultInstance() : cachedAssetsConfiguration;
        }

        public CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            CachedAssetsConfiguration cachedAssetsConfiguration = this.cachedWebviewFilesConfiguration_;
            return cachedAssetsConfiguration == null ? CachedAssetsConfiguration.getDefaultInstance() : cachedAssetsConfiguration;
        }

        public DebugSettings getDebugSettings() {
            DebugSettings debugSettings = this.debugSettings_;
            return debugSettings == null ? DebugSettings.getDefaultInstance() : debugSettings;
        }

        public ShowCompletionState getDefaultShowCompletionState() {
            ShowCompletionState forNumber = ShowCompletionState.forNumber(this.defaultShowCompletionState_);
            return forNumber == null ? ShowCompletionState.UNRECOGNIZED : forNumber;
        }

        public int getDefaultShowCompletionStateValue() {
            return this.defaultShowCompletionState_;
        }

        public DiagnosticEventsConfiguration getDiagnosticEvents() {
            DiagnosticEventsConfiguration diagnosticEventsConfiguration = this.diagnosticEvents_;
            return diagnosticEventsConfiguration == null ? DiagnosticEventsConfiguration.getDefaultInstance() : diagnosticEventsConfiguration;
        }

        public RequestPolicy getDownloadPolicy() {
            RequestPolicy requestPolicy = this.downloadPolicy_;
            return requestPolicy == null ? RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        public boolean getEnableIapEvent() {
            return this.enableIapEvent_;
        }

        public boolean getEnableOm() {
            return this.enableOm_;
        }

        public FeatureFlags getFeatureFlags() {
            FeatureFlags featureFlags = this.featureFlags_;
            return featureFlags == null ? FeatureFlags.getDefaultInstance() : featureFlags;
        }

        public RequestPolicy getInitPolicy() {
            RequestPolicy requestPolicy = this.initPolicy_;
            return requestPolicy == null ? RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        public ByteString getObservableAndroidActivities(int i) {
            return (ByteString) this.observableAndroidActivities_.get(i);
        }

        public int getObservableAndroidActivitiesCount() {
            return this.observableAndroidActivities_.size();
        }

        public List getObservableAndroidActivitiesList() {
            return this.observableAndroidActivities_;
        }

        public RequestPolicy getOperativeEventPolicy() {
            RequestPolicy requestPolicy = this.operativeEventPolicy_;
            return requestPolicy == null ? RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        public RequestPolicy getOtherPolicy() {
            RequestPolicy requestPolicy = this.otherPolicy_;
            return requestPolicy == null ? RequestPolicy.getDefaultInstance() : requestPolicy;
        }

        public boolean hasAdOperations() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasAdPolicy() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCachedAssetsConfiguration() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasCachedWebviewFilesConfiguration() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasDebugSettings() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasDiagnosticEvents() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDownloadPolicy() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasFeatureFlags() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasInitPolicy() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOperativeEventPolicy() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasOtherPolicy() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(NativeConfiguration nativeConfiguration) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(nativeConfiguration);
        }

        public static NativeConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NativeConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NativeConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NativeConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NativeConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NativeConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NativeConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NativeConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NativeConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (NativeConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface NativeConfigurationOrBuilder extends MessageLiteOrBuilder {
        AdOperationsConfiguration getAdOperations();

        RequestPolicy getAdPolicy();

        String getAdditionalStorePackages(int i);

        ByteString getAdditionalStorePackagesBytes(int i);

        int getAdditionalStorePackagesCount();

        List getAdditionalStorePackagesList();

        CachedAssetsConfiguration getCachedAssetsConfiguration();

        CachedAssetsConfiguration getCachedWebviewFilesConfiguration();

        DebugSettings getDebugSettings();

        ShowCompletionState getDefaultShowCompletionState();

        int getDefaultShowCompletionStateValue();

        DiagnosticEventsConfiguration getDiagnosticEvents();

        RequestPolicy getDownloadPolicy();

        boolean getEnableIapEvent();

        boolean getEnableOm();

        FeatureFlags getFeatureFlags();

        RequestPolicy getInitPolicy();

        ByteString getObservableAndroidActivities(int i);

        int getObservableAndroidActivitiesCount();

        List getObservableAndroidActivitiesList();

        RequestPolicy getOperativeEventPolicy();

        RequestPolicy getOtherPolicy();

        boolean hasAdOperations();

        boolean hasAdPolicy();

        boolean hasCachedAssetsConfiguration();

        boolean hasCachedWebviewFilesConfiguration();

        boolean hasDebugSettings();

        boolean hasDiagnosticEvents();

        boolean hasDownloadPolicy();

        boolean hasFeatureFlags();

        boolean hasInitPolicy();

        boolean hasOperativeEventPolicy();

        boolean hasOtherPolicy();
    }

    public static final class RequestPolicy extends GeneratedMessageLite implements RequestPolicyOrBuilder {
        private static final RequestPolicy DEFAULT_INSTANCE;
        private static volatile Parser PARSER = null;
        public static final int RETRY_POLICY_FIELD_NUMBER = 1;
        public static final int TIMEOUT_POLICY_FIELD_NUMBER = 2;
        private int bitField0_;
        private RequestRetryPolicy retryPolicy_;
        private RequestTimeoutPolicy timeoutPolicy_;

        public static final class Builder extends GeneratedMessageLite.Builder implements RequestPolicyOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearRetryPolicy() {
                copyOnWrite();
                RequestPolicy.access$2700((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTimeoutPolicy() {
                copyOnWrite();
                RequestPolicy.access$3000((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public RequestRetryPolicy getRetryPolicy() {
                return ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryPolicy();
            }

            public RequestTimeoutPolicy getTimeoutPolicy() {
                return ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).getTimeoutPolicy();
            }

            public boolean hasRetryPolicy() {
                return ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).hasRetryPolicy();
            }

            public boolean hasTimeoutPolicy() {
                return ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).hasTimeoutPolicy();
            }

            public Builder mergeRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                RequestPolicy.access$2600((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance, requestRetryPolicy);
                return this;
            }

            public Builder mergeTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                RequestPolicy.access$2900((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance, requestTimeoutPolicy);
                return this;
            }

            public Builder setRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                RequestPolicy.access$2500((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance, requestRetryPolicy);
                return this;
            }

            public Builder setTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                RequestPolicy.access$2800((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance, requestTimeoutPolicy);
                return this;
            }

            private Builder() {
                super(RequestPolicy.access$2400());
            }

            public Builder setRetryPolicy(RequestRetryPolicy.Builder builder) {
                copyOnWrite();
                RequestPolicy.access$2500((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance, (RequestRetryPolicy) builder.build());
                return this;
            }

            public Builder setTimeoutPolicy(RequestTimeoutPolicy.Builder builder) {
                copyOnWrite();
                RequestPolicy.access$2800((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance, (RequestTimeoutPolicy) builder.build());
                return this;
            }
        }

        static {
            RequestPolicy requestPolicy = new RequestPolicy();
            DEFAULT_INSTANCE = requestPolicy;
            GeneratedMessageLite.registerDefaultInstance(RequestPolicy.class, requestPolicy);
        }

        private RequestPolicy() {
        }

        public static /* synthetic */ RequestPolicy access$2400() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$2500(RequestPolicy requestPolicy, RequestRetryPolicy requestRetryPolicy) {
            requestPolicy.setRetryPolicy(requestRetryPolicy);
        }

        public static /* synthetic */ void access$2600(RequestPolicy requestPolicy, RequestRetryPolicy requestRetryPolicy) {
            requestPolicy.mergeRetryPolicy(requestRetryPolicy);
        }

        public static /* synthetic */ void access$2700(RequestPolicy requestPolicy) {
            requestPolicy.clearRetryPolicy();
        }

        public static /* synthetic */ void access$2800(RequestPolicy requestPolicy, RequestTimeoutPolicy requestTimeoutPolicy) {
            requestPolicy.setTimeoutPolicy(requestTimeoutPolicy);
        }

        public static /* synthetic */ void access$2900(RequestPolicy requestPolicy, RequestTimeoutPolicy requestTimeoutPolicy) {
            requestPolicy.mergeTimeoutPolicy(requestTimeoutPolicy);
        }

        public static /* synthetic */ void access$3000(RequestPolicy requestPolicy) {
            requestPolicy.clearTimeoutPolicy();
        }

        private void clearRetryPolicy() {
            this.retryPolicy_ = null;
            this.bitField0_ &= -2;
        }

        private void clearTimeoutPolicy() {
            this.timeoutPolicy_ = null;
            this.bitField0_ &= -3;
        }

        public static RequestPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.getClass();
            RequestRetryPolicy requestRetryPolicy2 = this.retryPolicy_;
            if (requestRetryPolicy2 == null || requestRetryPolicy2 == RequestRetryPolicy.getDefaultInstance()) {
                this.retryPolicy_ = requestRetryPolicy;
            } else {
                this.retryPolicy_ = (RequestRetryPolicy) ((RequestRetryPolicy.Builder) RequestRetryPolicy.newBuilder(this.retryPolicy_).mergeFrom(requestRetryPolicy)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.getClass();
            RequestTimeoutPolicy requestTimeoutPolicy2 = this.timeoutPolicy_;
            if (requestTimeoutPolicy2 == null || requestTimeoutPolicy2 == RequestTimeoutPolicy.getDefaultInstance()) {
                this.timeoutPolicy_ = requestTimeoutPolicy;
            } else {
                this.timeoutPolicy_ = (RequestTimeoutPolicy) ((RequestTimeoutPolicy.Builder) RequestTimeoutPolicy.newBuilder(this.timeoutPolicy_).mergeFrom(requestTimeoutPolicy)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RequestPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.getClass();
            this.retryPolicy_ = requestRetryPolicy;
            this.bitField0_ |= 1;
        }

        private void setTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.getClass();
            this.timeoutPolicy_ = requestTimeoutPolicy;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RequestPolicy();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "retryPolicy_", "timeoutPolicy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RequestPolicy.class) {
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

        public RequestRetryPolicy getRetryPolicy() {
            RequestRetryPolicy requestRetryPolicy = this.retryPolicy_;
            return requestRetryPolicy == null ? RequestRetryPolicy.getDefaultInstance() : requestRetryPolicy;
        }

        public RequestTimeoutPolicy getTimeoutPolicy() {
            RequestTimeoutPolicy requestTimeoutPolicy = this.timeoutPolicy_;
            return requestTimeoutPolicy == null ? RequestTimeoutPolicy.getDefaultInstance() : requestTimeoutPolicy;
        }

        public boolean hasRetryPolicy() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTimeoutPolicy() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(RequestPolicy requestPolicy) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(requestPolicy);
        }

        public static RequestPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RequestPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RequestPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(InputStream inputStream) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RequestPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface RequestPolicyOrBuilder extends MessageLiteOrBuilder {
        RequestRetryPolicy getRetryPolicy();

        RequestTimeoutPolicy getTimeoutPolicy();

        boolean hasRetryPolicy();

        boolean hasTimeoutPolicy();
    }

    public static final class RequestRetryPolicy extends GeneratedMessageLite implements RequestRetryPolicyOrBuilder {
        private static final RequestRetryPolicy DEFAULT_INSTANCE;
        public static final int MAX_DURATION_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int RETRY_JITTER_PCT_FIELD_NUMBER = 4;
        public static final int RETRY_MAX_INTERVAL_FIELD_NUMBER = 3;
        public static final int RETRY_SCALING_FACTOR_FIELD_NUMBER = 5;
        public static final int RETRY_WAIT_BASE_FIELD_NUMBER = 2;
        public static final int SHOULD_STORE_LOCALLY_FIELD_NUMBER = 6;
        private int maxDuration_;
        private float retryJitterPct_;
        private int retryMaxInterval_;
        private float retryScalingFactor_;
        private int retryWaitBase_;
        private boolean shouldStoreLocally_;

        public static final class Builder extends GeneratedMessageLite.Builder implements RequestRetryPolicyOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearMaxDuration() {
                copyOnWrite();
                RequestRetryPolicy.access$200((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearRetryJitterPct() {
                copyOnWrite();
                RequestRetryPolicy.access$800((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearRetryMaxInterval() {
                copyOnWrite();
                RequestRetryPolicy.access$600((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearRetryScalingFactor() {
                copyOnWrite();
                RequestRetryPolicy.access$1000((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearRetryWaitBase() {
                copyOnWrite();
                RequestRetryPolicy.access$400((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearShouldStoreLocally() {
                copyOnWrite();
                RequestRetryPolicy.access$1200((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public int getMaxDuration() {
                return ((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getMaxDuration();
            }

            public float getRetryJitterPct() {
                return ((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryJitterPct();
            }

            public int getRetryMaxInterval() {
                return ((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryMaxInterval();
            }

            public float getRetryScalingFactor() {
                return ((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryScalingFactor();
            }

            public int getRetryWaitBase() {
                return ((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryWaitBase();
            }

            public boolean getShouldStoreLocally() {
                return ((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getShouldStoreLocally();
            }

            public Builder setMaxDuration(int i) {
                copyOnWrite();
                RequestRetryPolicy.access$100((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setRetryJitterPct(float f) {
                copyOnWrite();
                RequestRetryPolicy.access$700((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance, f);
                return this;
            }

            public Builder setRetryMaxInterval(int i) {
                copyOnWrite();
                RequestRetryPolicy.access$500((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setRetryScalingFactor(float f) {
                copyOnWrite();
                RequestRetryPolicy.access$900((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance, f);
                return this;
            }

            public Builder setRetryWaitBase(int i) {
                copyOnWrite();
                RequestRetryPolicy.access$300((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setShouldStoreLocally(boolean z) {
                copyOnWrite();
                RequestRetryPolicy.access$1100((RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance, z);
                return this;
            }

            private Builder() {
                super(RequestRetryPolicy.access$000());
            }
        }

        static {
            RequestRetryPolicy requestRetryPolicy = new RequestRetryPolicy();
            DEFAULT_INSTANCE = requestRetryPolicy;
            GeneratedMessageLite.registerDefaultInstance(RequestRetryPolicy.class, requestRetryPolicy);
        }

        private RequestRetryPolicy() {
        }

        public static /* synthetic */ RequestRetryPolicy access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(RequestRetryPolicy requestRetryPolicy, int i) {
            requestRetryPolicy.setMaxDuration(i);
        }

        public static /* synthetic */ void access$1000(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.clearRetryScalingFactor();
        }

        public static /* synthetic */ void access$1100(RequestRetryPolicy requestRetryPolicy, boolean z) {
            requestRetryPolicy.setShouldStoreLocally(z);
        }

        public static /* synthetic */ void access$1200(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.clearShouldStoreLocally();
        }

        public static /* synthetic */ void access$200(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.clearMaxDuration();
        }

        public static /* synthetic */ void access$300(RequestRetryPolicy requestRetryPolicy, int i) {
            requestRetryPolicy.setRetryWaitBase(i);
        }

        public static /* synthetic */ void access$400(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.clearRetryWaitBase();
        }

        public static /* synthetic */ void access$500(RequestRetryPolicy requestRetryPolicy, int i) {
            requestRetryPolicy.setRetryMaxInterval(i);
        }

        public static /* synthetic */ void access$600(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.clearRetryMaxInterval();
        }

        public static /* synthetic */ void access$700(RequestRetryPolicy requestRetryPolicy, float f) {
            requestRetryPolicy.setRetryJitterPct(f);
        }

        public static /* synthetic */ void access$800(RequestRetryPolicy requestRetryPolicy) {
            requestRetryPolicy.clearRetryJitterPct();
        }

        public static /* synthetic */ void access$900(RequestRetryPolicy requestRetryPolicy, float f) {
            requestRetryPolicy.setRetryScalingFactor(f);
        }

        private void clearMaxDuration() {
            this.maxDuration_ = 0;
        }

        private void clearRetryJitterPct() {
            this.retryJitterPct_ = 0.0f;
        }

        private void clearRetryMaxInterval() {
            this.retryMaxInterval_ = 0;
        }

        private void clearRetryScalingFactor() {
            this.retryScalingFactor_ = 0.0f;
        }

        private void clearRetryWaitBase() {
            this.retryWaitBase_ = 0;
        }

        private void clearShouldStoreLocally() {
            this.shouldStoreLocally_ = false;
        }

        public static RequestRetryPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RequestRetryPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestRetryPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMaxDuration(int i) {
            this.maxDuration_ = i;
        }

        private void setRetryJitterPct(float f) {
            this.retryJitterPct_ = f;
        }

        private void setRetryMaxInterval(int i) {
            this.retryMaxInterval_ = i;
        }

        private void setRetryScalingFactor(float f) {
            this.retryScalingFactor_ = f;
        }

        private void setRetryWaitBase(int i) {
            this.retryWaitBase_ = i;
        }

        private void setShouldStoreLocally(boolean z) {
            this.shouldStoreLocally_ = z;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RequestRetryPolicy();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0001\u0005\u0001\u0006\u0007", new Object[]{"maxDuration_", "retryWaitBase_", "retryMaxInterval_", "retryJitterPct_", "retryScalingFactor_", "shouldStoreLocally_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RequestRetryPolicy.class) {
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

        public int getMaxDuration() {
            return this.maxDuration_;
        }

        public float getRetryJitterPct() {
            return this.retryJitterPct_;
        }

        public int getRetryMaxInterval() {
            return this.retryMaxInterval_;
        }

        public float getRetryScalingFactor() {
            return this.retryScalingFactor_;
        }

        public int getRetryWaitBase() {
            return this.retryWaitBase_;
        }

        public boolean getShouldStoreLocally() {
            return this.shouldStoreLocally_;
        }

        public static Builder newBuilder(RequestRetryPolicy requestRetryPolicy) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(requestRetryPolicy);
        }

        public static RequestRetryPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RequestRetryPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RequestRetryPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseFrom(InputStream inputStream) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestRetryPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestRetryPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RequestRetryPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface RequestRetryPolicyOrBuilder extends MessageLiteOrBuilder {
        int getMaxDuration();

        float getRetryJitterPct();

        int getRetryMaxInterval();

        float getRetryScalingFactor();

        int getRetryWaitBase();

        boolean getShouldStoreLocally();
    }

    public static final class RequestTimeoutPolicy extends GeneratedMessageLite implements RequestTimeoutPolicyOrBuilder {
        public static final int CONNECT_TIMEOUT_MS_FIELD_NUMBER = 1;
        private static final RequestTimeoutPolicy DEFAULT_INSTANCE;
        public static final int OVERALL_TIMEOUT_MS_FIELD_NUMBER = 4;
        private static volatile Parser PARSER = null;
        public static final int READ_TIMEOUT_MS_FIELD_NUMBER = 2;
        public static final int WRITE_TIMEOUT_MS_FIELD_NUMBER = 3;
        private int connectTimeoutMs_;
        private int overallTimeoutMs_;
        private int readTimeoutMs_;
        private int writeTimeoutMs_;

        public static final class Builder extends GeneratedMessageLite.Builder implements RequestTimeoutPolicyOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearConnectTimeoutMs() {
                copyOnWrite();
                RequestTimeoutPolicy.access$1600((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOverallTimeoutMs() {
                copyOnWrite();
                RequestTimeoutPolicy.access$2200((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearReadTimeoutMs() {
                copyOnWrite();
                RequestTimeoutPolicy.access$1800((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearWriteTimeoutMs() {
                copyOnWrite();
                RequestTimeoutPolicy.access$2000((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public int getConnectTimeoutMs() {
                return ((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).getConnectTimeoutMs();
            }

            public int getOverallTimeoutMs() {
                return ((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).getOverallTimeoutMs();
            }

            public int getReadTimeoutMs() {
                return ((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).getReadTimeoutMs();
            }

            public int getWriteTimeoutMs() {
                return ((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).getWriteTimeoutMs();
            }

            public Builder setConnectTimeoutMs(int i) {
                copyOnWrite();
                RequestTimeoutPolicy.access$1500((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setOverallTimeoutMs(int i) {
                copyOnWrite();
                RequestTimeoutPolicy.access$2100((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setReadTimeoutMs(int i) {
                copyOnWrite();
                RequestTimeoutPolicy.access$1700((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setWriteTimeoutMs(int i) {
                copyOnWrite();
                RequestTimeoutPolicy.access$1900((RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(RequestTimeoutPolicy.access$1400());
            }
        }

        static {
            RequestTimeoutPolicy requestTimeoutPolicy = new RequestTimeoutPolicy();
            DEFAULT_INSTANCE = requestTimeoutPolicy;
            GeneratedMessageLite.registerDefaultInstance(RequestTimeoutPolicy.class, requestTimeoutPolicy);
        }

        private RequestTimeoutPolicy() {
        }

        public static /* synthetic */ RequestTimeoutPolicy access$1400() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$1500(RequestTimeoutPolicy requestTimeoutPolicy, int i) {
            requestTimeoutPolicy.setConnectTimeoutMs(i);
        }

        public static /* synthetic */ void access$1600(RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.clearConnectTimeoutMs();
        }

        public static /* synthetic */ void access$1700(RequestTimeoutPolicy requestTimeoutPolicy, int i) {
            requestTimeoutPolicy.setReadTimeoutMs(i);
        }

        public static /* synthetic */ void access$1800(RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.clearReadTimeoutMs();
        }

        public static /* synthetic */ void access$1900(RequestTimeoutPolicy requestTimeoutPolicy, int i) {
            requestTimeoutPolicy.setWriteTimeoutMs(i);
        }

        public static /* synthetic */ void access$2000(RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.clearWriteTimeoutMs();
        }

        public static /* synthetic */ void access$2100(RequestTimeoutPolicy requestTimeoutPolicy, int i) {
            requestTimeoutPolicy.setOverallTimeoutMs(i);
        }

        public static /* synthetic */ void access$2200(RequestTimeoutPolicy requestTimeoutPolicy) {
            requestTimeoutPolicy.clearOverallTimeoutMs();
        }

        private void clearConnectTimeoutMs() {
            this.connectTimeoutMs_ = 0;
        }

        private void clearOverallTimeoutMs() {
            this.overallTimeoutMs_ = 0;
        }

        private void clearReadTimeoutMs() {
            this.readTimeoutMs_ = 0;
        }

        private void clearWriteTimeoutMs() {
            this.writeTimeoutMs_ = 0;
        }

        public static RequestTimeoutPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RequestTimeoutPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestTimeoutPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setConnectTimeoutMs(int i) {
            this.connectTimeoutMs_ = i;
        }

        private void setOverallTimeoutMs(int i) {
            this.overallTimeoutMs_ = i;
        }

        private void setReadTimeoutMs(int i) {
            this.readTimeoutMs_ = i;
        }

        private void setWriteTimeoutMs(int i) {
            this.writeTimeoutMs_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RequestTimeoutPolicy();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"connectTimeoutMs_", "readTimeoutMs_", "writeTimeoutMs_", "overallTimeoutMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (RequestTimeoutPolicy.class) {
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

        public int getConnectTimeoutMs() {
            return this.connectTimeoutMs_;
        }

        public int getOverallTimeoutMs() {
            return this.overallTimeoutMs_;
        }

        public int getReadTimeoutMs() {
            return this.readTimeoutMs_;
        }

        public int getWriteTimeoutMs() {
            return this.writeTimeoutMs_;
        }

        public static Builder newBuilder(RequestTimeoutPolicy requestTimeoutPolicy) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(requestTimeoutPolicy);
        }

        public static RequestTimeoutPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RequestTimeoutPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RequestTimeoutPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseFrom(InputStream inputStream) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestTimeoutPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestTimeoutPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RequestTimeoutPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface RequestTimeoutPolicyOrBuilder extends MessageLiteOrBuilder {
        int getConnectTimeoutMs();

        int getOverallTimeoutMs();

        int getReadTimeoutMs();

        int getWriteTimeoutMs();
    }

    public enum ShowCompletionState implements Internal.EnumLite {
        SHOW_COMPLETION_STATE_UNSPECIFIED(0),
        SHOW_COMPLETION_STATE_SKIPPED(1),
        SHOW_COMPLETION_STATE_COMPLETED(2),
        UNRECOGNIZED(-1);

        public static final int SHOW_COMPLETION_STATE_COMPLETED_VALUE = 2;
        public static final int SHOW_COMPLETION_STATE_SKIPPED_VALUE = 1;
        public static final int SHOW_COMPLETION_STATE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ShowCompletionState findValueByNumber(int i) {
                return ShowCompletionState.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return ShowCompletionState.forNumber(i) != null;
            }
        }

        ShowCompletionState(int i) {
            this.value = i;
        }

        public static ShowCompletionState forNumber(int i) {
            if (i == 0) {
                return SHOW_COMPLETION_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return SHOW_COMPLETION_STATE_SKIPPED;
            }
            if (i != 2) {
                return null;
            }
            return SHOW_COMPLETION_STATE_COMPLETED;
        }

        public static Internal.EnumLiteMap internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static ShowCompletionState valueOf(int i) {
            return forNumber(i);
        }
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

    private NativeConfigurationOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
