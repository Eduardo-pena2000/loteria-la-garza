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
public final class SessionCountersOuterClass {

    public static final class SessionCounters extends GeneratedMessageLite implements SessionCountersOrBuilder {
        public static final int BANNER_IMPRESSIONS_FIELD_NUMBER = 5;
        public static final int BANNER_LOAD_REQUESTS_FIELD_NUMBER = 3;
        public static final int BANNER_REQUESTS_ADM_FIELD_NUMBER = 4;
        private static final SessionCounters DEFAULT_INSTANCE;
        public static final int FOCUS_CHANGE_COUNT_FIELD_NUMBER = 8;
        public static final int GLOBAL_ADS_FOCUS_CHANGE_COUNT_FIELD_NUMBER = 7;
        public static final int GLOBAL_ADS_FOCUS_TIME_FIELD_NUMBER = 6;
        public static final int LOAD_REQUESTS_ADM_FIELD_NUMBER = 2;
        public static final int LOAD_REQUESTS_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private int bannerImpressions_;
        private int bannerLoadRequests_;
        private int bannerRequestsAdm_;
        private int focusChangeCount_;
        private int globalAdsFocusChangeCount_;
        private int globalAdsFocusTime_;
        private int loadRequestsAdm_;
        private int loadRequests_;

        public static final class Builder extends GeneratedMessageLite.Builder implements SessionCountersOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearBannerImpressions() {
                copyOnWrite();
                SessionCounters.access$1000((SessionCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBannerLoadRequests() {
                copyOnWrite();
                SessionCounters.access$600((SessionCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearBannerRequestsAdm() {
                copyOnWrite();
                SessionCounters.access$800((SessionCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearFocusChangeCount() {
                copyOnWrite();
                SessionCounters.access$1600((SessionCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearGlobalAdsFocusChangeCount() {
                copyOnWrite();
                SessionCounters.access$1400((SessionCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearGlobalAdsFocusTime() {
                copyOnWrite();
                SessionCounters.access$1200((SessionCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLoadRequests() {
                copyOnWrite();
                SessionCounters.access$200((SessionCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearLoadRequestsAdm() {
                copyOnWrite();
                SessionCounters.access$400((SessionCounters) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public int getBannerImpressions() {
                return ((SessionCounters) ((GeneratedMessageLite.Builder) this).instance).getBannerImpressions();
            }

            public int getBannerLoadRequests() {
                return ((SessionCounters) ((GeneratedMessageLite.Builder) this).instance).getBannerLoadRequests();
            }

            public int getBannerRequestsAdm() {
                return ((SessionCounters) ((GeneratedMessageLite.Builder) this).instance).getBannerRequestsAdm();
            }

            public int getFocusChangeCount() {
                return ((SessionCounters) ((GeneratedMessageLite.Builder) this).instance).getFocusChangeCount();
            }

            public int getGlobalAdsFocusChangeCount() {
                return ((SessionCounters) ((GeneratedMessageLite.Builder) this).instance).getGlobalAdsFocusChangeCount();
            }

            public int getGlobalAdsFocusTime() {
                return ((SessionCounters) ((GeneratedMessageLite.Builder) this).instance).getGlobalAdsFocusTime();
            }

            public int getLoadRequests() {
                return ((SessionCounters) ((GeneratedMessageLite.Builder) this).instance).getLoadRequests();
            }

            public int getLoadRequestsAdm() {
                return ((SessionCounters) ((GeneratedMessageLite.Builder) this).instance).getLoadRequestsAdm();
            }

            public Builder setBannerImpressions(int i) {
                copyOnWrite();
                SessionCounters.access$900((SessionCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setBannerLoadRequests(int i) {
                copyOnWrite();
                SessionCounters.access$500((SessionCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setBannerRequestsAdm(int i) {
                copyOnWrite();
                SessionCounters.access$700((SessionCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setFocusChangeCount(int i) {
                copyOnWrite();
                SessionCounters.access$1500((SessionCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setGlobalAdsFocusChangeCount(int i) {
                copyOnWrite();
                SessionCounters.access$1300((SessionCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setGlobalAdsFocusTime(int i) {
                copyOnWrite();
                SessionCounters.access$1100((SessionCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setLoadRequests(int i) {
                copyOnWrite();
                SessionCounters.access$100((SessionCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setLoadRequestsAdm(int i) {
                copyOnWrite();
                SessionCounters.access$300((SessionCounters) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(SessionCounters.access$000());
            }
        }

        static {
            SessionCounters sessionCounters = new SessionCounters();
            DEFAULT_INSTANCE = sessionCounters;
            GeneratedMessageLite.registerDefaultInstance(SessionCounters.class, sessionCounters);
        }

        private SessionCounters() {
        }

        public static /* synthetic */ SessionCounters access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(SessionCounters sessionCounters, int i) {
            sessionCounters.setLoadRequests(i);
        }

        public static /* synthetic */ void access$1000(SessionCounters sessionCounters) {
            sessionCounters.clearBannerImpressions();
        }

        public static /* synthetic */ void access$1100(SessionCounters sessionCounters, int i) {
            sessionCounters.setGlobalAdsFocusTime(i);
        }

        public static /* synthetic */ void access$1200(SessionCounters sessionCounters) {
            sessionCounters.clearGlobalAdsFocusTime();
        }

        public static /* synthetic */ void access$1300(SessionCounters sessionCounters, int i) {
            sessionCounters.setGlobalAdsFocusChangeCount(i);
        }

        public static /* synthetic */ void access$1400(SessionCounters sessionCounters) {
            sessionCounters.clearGlobalAdsFocusChangeCount();
        }

        public static /* synthetic */ void access$1500(SessionCounters sessionCounters, int i) {
            sessionCounters.setFocusChangeCount(i);
        }

        public static /* synthetic */ void access$1600(SessionCounters sessionCounters) {
            sessionCounters.clearFocusChangeCount();
        }

        public static /* synthetic */ void access$200(SessionCounters sessionCounters) {
            sessionCounters.clearLoadRequests();
        }

        public static /* synthetic */ void access$300(SessionCounters sessionCounters, int i) {
            sessionCounters.setLoadRequestsAdm(i);
        }

        public static /* synthetic */ void access$400(SessionCounters sessionCounters) {
            sessionCounters.clearLoadRequestsAdm();
        }

        public static /* synthetic */ void access$500(SessionCounters sessionCounters, int i) {
            sessionCounters.setBannerLoadRequests(i);
        }

        public static /* synthetic */ void access$600(SessionCounters sessionCounters) {
            sessionCounters.clearBannerLoadRequests();
        }

        public static /* synthetic */ void access$700(SessionCounters sessionCounters, int i) {
            sessionCounters.setBannerRequestsAdm(i);
        }

        public static /* synthetic */ void access$800(SessionCounters sessionCounters) {
            sessionCounters.clearBannerRequestsAdm();
        }

        public static /* synthetic */ void access$900(SessionCounters sessionCounters, int i) {
            sessionCounters.setBannerImpressions(i);
        }

        private void clearBannerImpressions() {
            this.bannerImpressions_ = 0;
        }

        private void clearBannerLoadRequests() {
            this.bannerLoadRequests_ = 0;
        }

        private void clearBannerRequestsAdm() {
            this.bannerRequestsAdm_ = 0;
        }

        private void clearFocusChangeCount() {
            this.focusChangeCount_ = 0;
        }

        private void clearGlobalAdsFocusChangeCount() {
            this.globalAdsFocusChangeCount_ = 0;
        }

        private void clearGlobalAdsFocusTime() {
            this.globalAdsFocusTime_ = 0;
        }

        private void clearLoadRequests() {
            this.loadRequests_ = 0;
        }

        private void clearLoadRequestsAdm() {
            this.loadRequestsAdm_ = 0;
        }

        public static SessionCounters getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBannerImpressions(int i) {
            this.bannerImpressions_ = i;
        }

        private void setBannerLoadRequests(int i) {
            this.bannerLoadRequests_ = i;
        }

        private void setBannerRequestsAdm(int i) {
            this.bannerRequestsAdm_ = i;
        }

        private void setFocusChangeCount(int i) {
            this.focusChangeCount_ = i;
        }

        private void setGlobalAdsFocusChangeCount(int i) {
            this.globalAdsFocusChangeCount_ = i;
        }

        private void setGlobalAdsFocusTime(int i) {
            this.globalAdsFocusTime_ = i;
        }

        private void setLoadRequests(int i) {
            this.loadRequests_ = i;
        }

        private void setLoadRequestsAdm(int i) {
            this.loadRequestsAdm_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SessionCounters();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004", new Object[]{"loadRequests_", "loadRequestsAdm_", "bannerLoadRequests_", "bannerRequestsAdm_", "bannerImpressions_", "globalAdsFocusTime_", "globalAdsFocusChangeCount_", "focusChangeCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SessionCounters.class) {
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

        public int getBannerImpressions() {
            return this.bannerImpressions_;
        }

        public int getBannerLoadRequests() {
            return this.bannerLoadRequests_;
        }

        public int getBannerRequestsAdm() {
            return this.bannerRequestsAdm_;
        }

        public int getFocusChangeCount() {
            return this.focusChangeCount_;
        }

        public int getGlobalAdsFocusChangeCount() {
            return this.globalAdsFocusChangeCount_;
        }

        public int getGlobalAdsFocusTime() {
            return this.globalAdsFocusTime_;
        }

        public int getLoadRequests() {
            return this.loadRequests_;
        }

        public int getLoadRequestsAdm() {
            return this.loadRequestsAdm_;
        }

        public static Builder newBuilder(SessionCounters sessionCounters) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sessionCounters);
        }

        public static SessionCounters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SessionCounters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionCounters parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(InputStream inputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionCounters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SessionCounters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionCounters) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SessionCountersOrBuilder extends MessageLiteOrBuilder {
        int getBannerImpressions();

        int getBannerLoadRequests();

        int getBannerRequestsAdm();

        int getFocusChangeCount();

        int getGlobalAdsFocusChangeCount();

        int getGlobalAdsFocusTime();

        int getLoadRequests();

        int getLoadRequestsAdm();
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

    private SessionCountersOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
