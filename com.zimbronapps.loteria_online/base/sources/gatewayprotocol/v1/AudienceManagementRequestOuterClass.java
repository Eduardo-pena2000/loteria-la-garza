package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AudienceManagementRequestOuterClass {

    public static final class AudienceManagementRequest extends GeneratedMessageLite implements AudienceManagementRequestOrBuilder {
        public static final int AUDIENCE_MANAGEMENT_DATA_FIELD_NUMBER = 4;
        private static final AudienceManagementRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 1;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private ByteString audienceManagementData_ = ByteString.EMPTY;
        private int bitField0_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private SessionCountersOuterClass.SessionCounters sessionCounters_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        public static final class Builder extends GeneratedMessageLite.Builder implements AudienceManagementRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAudienceManagementData() {
                copyOnWrite();
                AudienceManagementRequest.access$1100((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                AudienceManagementRequest.access$900((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSessionCounters() {
                copyOnWrite();
                AudienceManagementRequest.access$300((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                AudienceManagementRequest.access$600((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getAudienceManagementData() {
                return ((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance).getAudienceManagementData();
            }

            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance).getDynamicDeviceInfo();
            }

            public SessionCountersOuterClass.SessionCounters getSessionCounters() {
                return ((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance).getSessionCounters();
            }

            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance).getStaticDeviceInfo();
            }

            public boolean hasDynamicDeviceInfo() {
                return ((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance).hasDynamicDeviceInfo();
            }

            public boolean hasSessionCounters() {
                return ((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance).hasSessionCounters();
            }

            public boolean hasStaticDeviceInfo() {
                return ((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance).hasStaticDeviceInfo();
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                AudienceManagementRequest.access$800((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                AudienceManagementRequest.access$200((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                AudienceManagementRequest.access$500((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder setAudienceManagementData(ByteString byteString) {
                copyOnWrite();
                AudienceManagementRequest.access$1000((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                AudienceManagementRequest.access$700((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
                copyOnWrite();
                AudienceManagementRequest.access$100((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, sessionCounters);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                AudienceManagementRequest.access$400((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            private Builder() {
                super(AudienceManagementRequest.access$000());
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                AudienceManagementRequest.access$700((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) builder.build());
                return this;
            }

            public Builder setSessionCounters(SessionCountersOuterClass.SessionCounters.Builder builder) {
                copyOnWrite();
                AudienceManagementRequest.access$100((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, (SessionCountersOuterClass.SessionCounters) builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                AudienceManagementRequest.access$400((AudienceManagementRequest) ((GeneratedMessageLite.Builder) this).instance, (StaticDeviceInfoOuterClass.StaticDeviceInfo) builder.build());
                return this;
            }
        }

        static {
            AudienceManagementRequest audienceManagementRequest = new AudienceManagementRequest();
            DEFAULT_INSTANCE = audienceManagementRequest;
            GeneratedMessageLite.registerDefaultInstance(AudienceManagementRequest.class, audienceManagementRequest);
        }

        private AudienceManagementRequest() {
        }

        public static /* synthetic */ AudienceManagementRequest access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(AudienceManagementRequest audienceManagementRequest, SessionCountersOuterClass.SessionCounters sessionCounters) {
            audienceManagementRequest.setSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$1000(AudienceManagementRequest audienceManagementRequest, ByteString byteString) {
            audienceManagementRequest.setAudienceManagementData(byteString);
        }

        public static /* synthetic */ void access$1100(AudienceManagementRequest audienceManagementRequest) {
            audienceManagementRequest.clearAudienceManagementData();
        }

        public static /* synthetic */ void access$200(AudienceManagementRequest audienceManagementRequest, SessionCountersOuterClass.SessionCounters sessionCounters) {
            audienceManagementRequest.mergeSessionCounters(sessionCounters);
        }

        public static /* synthetic */ void access$300(AudienceManagementRequest audienceManagementRequest) {
            audienceManagementRequest.clearSessionCounters();
        }

        public static /* synthetic */ void access$400(AudienceManagementRequest audienceManagementRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            audienceManagementRequest.setStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$500(AudienceManagementRequest audienceManagementRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            audienceManagementRequest.mergeStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$600(AudienceManagementRequest audienceManagementRequest) {
            audienceManagementRequest.clearStaticDeviceInfo();
        }

        public static /* synthetic */ void access$700(AudienceManagementRequest audienceManagementRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            audienceManagementRequest.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$800(AudienceManagementRequest audienceManagementRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            audienceManagementRequest.mergeDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$900(AudienceManagementRequest audienceManagementRequest) {
            audienceManagementRequest.clearDynamicDeviceInfo();
        }

        private void clearAudienceManagementData() {
            this.audienceManagementData_ = getDefaultInstance().getAudienceManagementData();
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -5;
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -2;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        public static AudienceManagementRequest getDefaultInstance() {
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
            this.bitField0_ |= 4;
        }

        private void mergeSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            SessionCountersOuterClass.SessionCounters sessionCounters2 = this.sessionCounters_;
            if (sessionCounters2 == null || sessionCounters2 == SessionCountersOuterClass.SessionCounters.getDefaultInstance()) {
                this.sessionCounters_ = sessionCounters;
            } else {
                this.sessionCounters_ = (SessionCountersOuterClass.SessionCounters) ((SessionCountersOuterClass.SessionCounters.Builder) SessionCountersOuterClass.SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCounters)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = (StaticDeviceInfoOuterClass.StaticDeviceInfo) ((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AudienceManagementRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAudienceManagementData(ByteString byteString) {
            byteString.getClass();
            this.audienceManagementData_ = byteString;
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 4;
        }

        private void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            sessionCounters.getClass();
            this.sessionCounters_ = sessionCounters;
            this.bitField0_ |= 1;
        }

        private void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AudienceManagementRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\n", new Object[]{"bitField0_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "audienceManagementData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AudienceManagementRequest.class) {
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

        public ByteString getAudienceManagementData() {
            return this.audienceManagementData_;
        }

        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        public SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this.sessionCounters_;
            return sessionCounters == null ? SessionCountersOuterClass.SessionCounters.getDefaultInstance() : sessionCounters;
        }

        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSessionCounters() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(AudienceManagementRequest audienceManagementRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(audienceManagementRequest);
        }

        public static AudienceManagementRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AudienceManagementRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AudienceManagementRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseFrom(InputStream inputStream) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AudienceManagementRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AudienceManagementRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AudienceManagementRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AudienceManagementRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AudienceManagementRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getAudienceManagementData();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        SessionCountersOuterClass.SessionCounters getSessionCounters();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasSessionCounters();

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

    private AudienceManagementRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
