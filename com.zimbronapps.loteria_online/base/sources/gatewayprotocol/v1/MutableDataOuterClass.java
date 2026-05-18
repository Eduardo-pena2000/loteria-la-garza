package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MutableDataOuterClass {

    public static final class MutableData extends GeneratedMessageLite implements MutableDataOrBuilder {
        public static final int ALLOWED_PII_FIELD_NUMBER = 13;
        public static final int CACHE_FIELD_NUMBER = 14;
        public static final int CURRENT_STATE_FIELD_NUMBER = 1;
        private static final MutableData DEFAULT_INSTANCE;
        private static volatile Parser PARSER = null;
        public static final int PRIVACY_FIELD_NUMBER = 11;
        public static final int PRIVACY_FSM_FIELD_NUMBER = 15;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 12;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 10;
        private AllowedPiiOuterClass.AllowedPii allowedPii_;
        private int bitField0_;
        private ByteString cache_;
        private ByteString currentState_;
        private ByteString privacyFsm_;
        private ByteString privacy_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private ByteString sessionToken_;

        public static final class Builder extends GeneratedMessageLite.Builder implements MutableDataOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAllowedPii() {
                copyOnWrite();
                MutableData.access$1200((MutableData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCache() {
                copyOnWrite();
                MutableData.access$1400((MutableData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCurrentState() {
                copyOnWrite();
                MutableData.access$200((MutableData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPrivacy() {
                copyOnWrite();
                MutableData.access$600((MutableData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearPrivacyFsm() {
                copyOnWrite();
                MutableData.access$1600((MutableData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                MutableData.access$900((MutableData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionToken() {
                copyOnWrite();
                MutableData.access$400((MutableData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public AllowedPiiOuterClass.AllowedPii getAllowedPii() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).getAllowedPii();
            }

            public ByteString getCache() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).getCache();
            }

            public ByteString getCurrentState() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).getCurrentState();
            }

            public ByteString getPrivacy() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).getPrivacy();
            }

            public ByteString getPrivacyFsm() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).getPrivacyFsm();
            }

            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).getSessionCounters();
            }

            public ByteString getSessionToken() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).getSessionToken();
            }

            public boolean hasAllowedPii() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).hasAllowedPii();
            }

            public boolean hasCache() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).hasCache();
            }

            public boolean hasCurrentState() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).hasCurrentState();
            }

            public boolean hasPrivacy() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).hasPrivacy();
            }

            public boolean hasPrivacyFsm() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).hasPrivacyFsm();
            }

            public boolean hasSessionCounters() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).hasSessionCounters();
            }

            public boolean hasSessionToken() {
                return ((MutableData) ((GeneratedMessageLite.Builder) this).instance).hasSessionToken();
            }

            public Builder mergeAllowedPii(AllowedPiiOuterClass.AllowedPii allowedPii) {
                copyOnWrite();
                MutableData.access$1100((MutableData) ((GeneratedMessageLite.Builder) this).instance, allowedPii);
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                MutableData.access$800((MutableData) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder setAllowedPii(AllowedPiiOuterClass.AllowedPii allowedPii) {
                copyOnWrite();
                MutableData.access$1000((MutableData) ((GeneratedMessageLite.Builder) this).instance, allowedPii);
                return this;
            }

            public Builder setCache(ByteString byteString) {
                copyOnWrite();
                MutableData.access$1300((MutableData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setCurrentState(ByteString byteString) {
                copyOnWrite();
                MutableData.access$100((MutableData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setPrivacy(ByteString byteString) {
                copyOnWrite();
                MutableData.access$500((MutableData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setPrivacyFsm(ByteString byteString) {
                copyOnWrite();
                MutableData.access$1500((MutableData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                MutableData.access$700((MutableData) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder setSessionToken(ByteString byteString) {
                copyOnWrite();
                MutableData.access$300((MutableData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(MutableData.access$000());
            }

            public Builder setAllowedPii(AllowedPiiOuterClass.AllowedPii.Builder builder) {
                copyOnWrite();
                MutableData.access$1000((MutableData) ((GeneratedMessageLite.Builder) this).instance, (AllowedPiiOuterClass.AllowedPii) builder.build());
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                MutableData.access$700((MutableData) ((GeneratedMessageLite.Builder) this).instance, (SessionCountersOuterClass.SessionCounters) builder.build());
                return this;
            }
        }

        static {
            MutableData mutableData = new MutableData();
            DEFAULT_INSTANCE = mutableData;
            GeneratedMessageLite.registerDefaultInstance(MutableData.class, mutableData);
        }

        private MutableData() {
            ByteString byteString = ByteString.EMPTY;
            this.currentState_ = byteString;
            this.sessionToken_ = byteString;
            this.privacy_ = byteString;
            this.cache_ = byteString;
            this.privacyFsm_ = byteString;
        }

        public static /* synthetic */ MutableData access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(MutableData mutableData, ByteString byteString) {
            mutableData.setCurrentState(byteString);
        }

        public static /* synthetic */ void access$1000(MutableData mutableData, AllowedPiiOuterClass.AllowedPii allowedPii) {
            mutableData.setAllowedPii(allowedPii);
        }

        public static /* synthetic */ void access$1100(MutableData mutableData, AllowedPiiOuterClass.AllowedPii allowedPii) {
            mutableData.mergeAllowedPii(allowedPii);
        }

        public static /* synthetic */ void access$1200(MutableData mutableData) {
            mutableData.clearAllowedPii();
        }

        public static /* synthetic */ void access$1300(MutableData mutableData, ByteString byteString) {
            mutableData.setCache(byteString);
        }

        public static /* synthetic */ void access$1400(MutableData mutableData) {
            mutableData.clearCache();
        }

        public static /* synthetic */ void access$1500(MutableData mutableData, ByteString byteString) {
            mutableData.setPrivacyFsm(byteString);
        }

        public static /* synthetic */ void access$1600(MutableData mutableData) {
            mutableData.clearPrivacyFsm();
        }

        public static /* synthetic */ void access$200(MutableData mutableData) {
            mutableData.clearCurrentState();
        }

        public static /* synthetic */ void access$300(MutableData mutableData, ByteString byteString) {
            mutableData.setSessionToken(byteString);
        }

        public static /* synthetic */ void access$400(MutableData mutableData) {
            mutableData.clearSessionToken();
        }

        public static /* synthetic */ void access$500(MutableData mutableData, ByteString byteString) {
            mutableData.setPrivacy(byteString);
        }

        public static /* synthetic */ void access$600(MutableData mutableData) {
            mutableData.clearPrivacy();
        }

        public static /* synthetic */ void access$700(MutableData mutableData, SessionCountersOuterClass.SessionCounters sessionCounters) {
            mutableData.setSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$800(MutableData mutableData, SessionCountersOuterClass.SessionCounters sessionCounters) {
            mutableData.mergeSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$900(MutableData mutableData) {
            mutableData.clearSessionCounters();
        }

        private void clearAllowedPii() {
            this.allowedPii_ = null;
            this.bitField0_ &= -17;
        }

        private void clearCache() {
            this.bitField0_ &= -33;
            this.cache_ = getDefaultInstance().getCache();
        }

        private void clearCurrentState() {
            this.bitField0_ &= -2;
            this.currentState_ = getDefaultInstance().getCurrentState();
        }

        private void clearPrivacy() {
            this.bitField0_ &= -5;
            this.privacy_ = getDefaultInstance().getPrivacy();
        }

        private void clearPrivacyFsm() {
            this.bitField0_ &= -65;
            this.privacyFsm_ = getDefaultInstance().getPrivacyFsm();
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -9;
        }

        private void clearSessionToken() {
            this.bitField0_ &= -3;
            this.sessionToken_ = getDefaultInstance().getSessionToken();
        }

        public static MutableData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAllowedPii(AllowedPiiOuterClass.AllowedPii allowedPii) {
            allowedPii.getClass();
            AllowedPiiOuterClass.AllowedPii allowedPii2 = this.allowedPii_;
            if (allowedPii2 == null || allowedPii2 == AllowedPiiOuterClass.AllowedPii.getDefaultInstance()) {
                this.allowedPii_ = allowedPii;
            } else {
                this.allowedPii_ = (AllowedPiiOuterClass.AllowedPii) ((AllowedPiiOuterClass.AllowedPii.Builder) AllowedPiiOuterClass.AllowedPii.newBuilder(this.allowedPii_).mergeFrom(allowedPii)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        private void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 == null || sessionCounters2 == SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = sessionCounters;
            } else {
                this.sessionCounters_ = (SessionCountersOuterClass.SessionCounters) ((SessionCountersOuterClass.SessionCounters.Builder) SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCounters)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MutableData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MutableData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MutableData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAllowedPii(AllowedPiiOuterClass.AllowedPii allowedPii) {
            allowedPii.getClass();
            this.allowedPii_ = allowedPii;
            this.bitField0_ |= 16;
        }

        private void setCache(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 32;
            this.cache_ = byteString;
        }

        private void setCurrentState(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 1;
            this.currentState_ = byteString;
        }

        private void setPrivacy(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.privacy_ = byteString;
        }

        private void setPrivacyFsm(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 64;
            this.privacyFsm_ = byteString;
        }

        private void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 8;
        }

        private void setSessionToken(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 2;
            this.sessionToken_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new MutableData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0000\u0000\u0001ည\u0000\nည\u0001\u000bည\u0002\fဉ\u0003\rဉ\u0004\u000eည\u0005\u000fည\u0006", new Object[]{"bitField0_", "currentState_", "sessionToken_", "privacy_", "sessionCounters_", "allowedPii_", "cache_", "privacyFsm_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (MutableData.class) {
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

        public AllowedPiiOuterClass.AllowedPii getAllowedPii() {
            AllowedPiiOuterClass.AllowedPii allowedPii = this.allowedPii_;
            return allowedPii == null ? AllowedPiiOuterClass.AllowedPii.getDefaultInstance() : allowedPii;
        }

        public ByteString getCache() {
            return this.cache_;
        }

        public ByteString getCurrentState() {
            return this.currentState_;
        }

        public ByteString getPrivacy() {
            return this.privacy_;
        }

        public ByteString getPrivacyFsm() {
            return this.privacyFsm_;
        }

        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        public ByteString getSessionToken() {
            return this.sessionToken_;
        }

        public boolean hasAllowedPii() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasCache() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasCurrentState() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPrivacy() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPrivacyFsm() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasSessionCounters() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSessionToken() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(MutableData mutableData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(mutableData);
        }

        public static MutableData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MutableData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MutableData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MutableData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MutableData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MutableData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MutableData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MutableData parseFrom(InputStream inputStream) throws IOException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MutableData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MutableData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MutableData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MutableData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface MutableDataOrBuilder extends MessageLiteOrBuilder {
        AllowedPiiOuterClass.AllowedPii getAllowedPii();

        ByteString getCache();

        ByteString getCurrentState();

        ByteString getPrivacy();

        ByteString getPrivacyFsm();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        ByteString getSessionToken();

        boolean hasAllowedPii();

        boolean hasCache();

        boolean hasCurrentState();

        boolean hasPrivacy();

        boolean hasPrivacyFsm();

        boolean hasSessionCounters();

        boolean hasSessionToken();
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

    private MutableDataOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
