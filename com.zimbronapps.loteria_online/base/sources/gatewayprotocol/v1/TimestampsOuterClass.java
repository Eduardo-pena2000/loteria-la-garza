package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimestampsOuterClass {

    public static final class Timestamps extends GeneratedMessageLite implements TimestampsOrBuilder {
        private static final Timestamps DEFAULT_INSTANCE;
        private static volatile Parser PARSER = null;
        public static final int SESSION_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private int bitField0_;
        private long sessionTimestamp_;
        private Timestamp timestamp_;

        public static final class Builder extends GeneratedMessageLite.Builder implements TimestampsOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearSessionTimestamp() {
                copyOnWrite();
                Timestamps.access$500((Timestamps) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                Timestamps.access$300((Timestamps) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public long getSessionTimestamp() {
                return ((Timestamps) ((GeneratedMessageLite.Builder) this).instance).getSessionTimestamp();
            }

            public Timestamp getTimestamp() {
                return ((Timestamps) ((GeneratedMessageLite.Builder) this).instance).getTimestamp();
            }

            public boolean hasTimestamp() {
                return ((Timestamps) ((GeneratedMessageLite.Builder) this).instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                copyOnWrite();
                Timestamps.access$200((Timestamps) ((GeneratedMessageLite.Builder) this).instance, timestamp);
                return this;
            }

            public Builder setSessionTimestamp(long j) {
                copyOnWrite();
                Timestamps.access$400((Timestamps) ((GeneratedMessageLite.Builder) this).instance, j);
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                copyOnWrite();
                Timestamps.access$100((Timestamps) ((GeneratedMessageLite.Builder) this).instance, timestamp);
                return this;
            }

            private Builder() {
                super(Timestamps.access$000());
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                Timestamps.access$100((Timestamps) ((GeneratedMessageLite.Builder) this).instance, builder.build());
                return this;
            }
        }

        static {
            Timestamps timestamps = new Timestamps();
            DEFAULT_INSTANCE = timestamps;
            GeneratedMessageLite.registerDefaultInstance(Timestamps.class, timestamps);
        }

        private Timestamps() {
        }

        public static /* synthetic */ Timestamps access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(Timestamps timestamps, Timestamp timestamp) {
            timestamps.setTimestamp(timestamp);
        }

        public static /* synthetic */ void access$200(Timestamps timestamps, Timestamp timestamp) {
            timestamps.mergeTimestamp(timestamp);
        }

        public static /* synthetic */ void access$300(Timestamps timestamps) {
            timestamps.clearTimestamp();
        }

        public static /* synthetic */ void access$400(Timestamps timestamps, long j) {
            timestamps.setSessionTimestamp(j);
        }

        public static /* synthetic */ void access$500(Timestamps timestamps) {
            timestamps.clearSessionTimestamp();
        }

        private void clearSessionTimestamp() {
            this.sessionTimestamp_ = 0L;
        }

        private void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        public static Timestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.timestamp_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.timestamp_ = timestamp;
            } else {
                this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom(timestamp).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setSessionTimestamp(long j) {
            this.sessionTimestamp_ = j;
        }

        private void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Timestamps();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"bitField0_", "timestamp_", "sessionTimestamp_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Timestamps.class) {
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

        public long getSessionTimestamp() {
            return this.sessionTimestamp_;
        }

        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Timestamps timestamps) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(timestamps);
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Timestamps parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Timestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Timestamps parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Timestamps parseFrom(InputStream inputStream) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Timestamps parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TimestampsOrBuilder extends MessageLiteOrBuilder {
        long getSessionTimestamp();

        Timestamp getTimestamp();

        boolean hasTimestamp();
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

    private TimestampsOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
