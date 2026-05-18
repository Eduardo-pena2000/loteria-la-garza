package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
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
public final class PiiOuterClass {

    public static final class Pii extends GeneratedMessageLite implements PiiOrBuilder {
        public static final int ADVERTISING_ID_FIELD_NUMBER = 1;
        public static final int APPSET_ID_FIELD_NUMBER = 5;
        private static final Pii DEFAULT_INSTANCE;
        public static final int FID_FIELD_NUMBER = 4;
        public static final int OPEN_ADVERTISING_TRACKING_ID_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int VENDOR_ID_FIELD_NUMBER = 2;
        private ByteString advertisingId_;
        private String appsetId_;
        private int bitField0_;
        private String fid_;
        private ByteString openAdvertisingTrackingId_;
        private ByteString vendorId_;

        public static final class Builder extends GeneratedMessageLite.Builder implements PiiOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearAdvertisingId() {
                copyOnWrite();
                Pii.access$200((Pii) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearAppsetId() {
                copyOnWrite();
                Pii.access$1100((Pii) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearFid() {
                copyOnWrite();
                Pii.access$800((Pii) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOpenAdvertisingTrackingId() {
                copyOnWrite();
                Pii.access$600((Pii) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearVendorId() {
                copyOnWrite();
                Pii.access$400((Pii) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getAdvertisingId() {
                return ((Pii) ((GeneratedMessageLite.Builder) this).instance).getAdvertisingId();
            }

            public String getAppsetId() {
                return ((Pii) ((GeneratedMessageLite.Builder) this).instance).getAppsetId();
            }

            public ByteString getAppsetIdBytes() {
                return ((Pii) ((GeneratedMessageLite.Builder) this).instance).getAppsetIdBytes();
            }

            public String getFid() {
                return ((Pii) ((GeneratedMessageLite.Builder) this).instance).getFid();
            }

            public ByteString getFidBytes() {
                return ((Pii) ((GeneratedMessageLite.Builder) this).instance).getFidBytes();
            }

            public ByteString getOpenAdvertisingTrackingId() {
                return ((Pii) ((GeneratedMessageLite.Builder) this).instance).getOpenAdvertisingTrackingId();
            }

            public ByteString getVendorId() {
                return ((Pii) ((GeneratedMessageLite.Builder) this).instance).getVendorId();
            }

            public boolean hasAppsetId() {
                return ((Pii) ((GeneratedMessageLite.Builder) this).instance).hasAppsetId();
            }

            public boolean hasFid() {
                return ((Pii) ((GeneratedMessageLite.Builder) this).instance).hasFid();
            }

            public Builder setAdvertisingId(ByteString byteString) {
                copyOnWrite();
                Pii.access$100((Pii) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setAppsetId(String str) {
                copyOnWrite();
                Pii.access$1000((Pii) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setAppsetIdBytes(ByteString byteString) {
                copyOnWrite();
                Pii.access$1200((Pii) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setFid(String str) {
                copyOnWrite();
                Pii.access$700((Pii) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setFidBytes(ByteString byteString) {
                copyOnWrite();
                Pii.access$900((Pii) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setOpenAdvertisingTrackingId(ByteString byteString) {
                copyOnWrite();
                Pii.access$500((Pii) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setVendorId(ByteString byteString) {
                copyOnWrite();
                Pii.access$300((Pii) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            private Builder() {
                super(Pii.access$000());
            }
        }

        static {
            Pii pii = new Pii();
            DEFAULT_INSTANCE = pii;
            GeneratedMessageLite.registerDefaultInstance(Pii.class, pii);
        }

        private Pii() {
            ByteString byteString = ByteString.EMPTY;
            this.advertisingId_ = byteString;
            this.vendorId_ = byteString;
            this.openAdvertisingTrackingId_ = byteString;
            this.fid_ = "";
            this.appsetId_ = "";
        }

        public static /* synthetic */ Pii access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(Pii pii, ByteString byteString) {
            pii.setAdvertisingId(byteString);
        }

        public static /* synthetic */ void access$1000(Pii pii, String str) {
            pii.setAppsetId(str);
        }

        public static /* synthetic */ void access$1100(Pii pii) {
            pii.clearAppsetId();
        }

        public static /* synthetic */ void access$1200(Pii pii, ByteString byteString) {
            pii.setAppsetIdBytes(byteString);
        }

        public static /* synthetic */ void access$200(Pii pii) {
            pii.clearAdvertisingId();
        }

        public static /* synthetic */ void access$300(Pii pii, ByteString byteString) {
            pii.setVendorId(byteString);
        }

        public static /* synthetic */ void access$400(Pii pii) {
            pii.clearVendorId();
        }

        public static /* synthetic */ void access$500(Pii pii, ByteString byteString) {
            pii.setOpenAdvertisingTrackingId(byteString);
        }

        public static /* synthetic */ void access$600(Pii pii) {
            pii.clearOpenAdvertisingTrackingId();
        }

        public static /* synthetic */ void access$700(Pii pii, String str) {
            pii.setFid(str);
        }

        public static /* synthetic */ void access$800(Pii pii) {
            pii.clearFid();
        }

        public static /* synthetic */ void access$900(Pii pii, ByteString byteString) {
            pii.setFidBytes(byteString);
        }

        private void clearAdvertisingId() {
            this.advertisingId_ = getDefaultInstance().getAdvertisingId();
        }

        private void clearAppsetId() {
            this.bitField0_ &= -3;
            this.appsetId_ = getDefaultInstance().getAppsetId();
        }

        private void clearFid() {
            this.bitField0_ &= -2;
            this.fid_ = getDefaultInstance().getFid();
        }

        private void clearOpenAdvertisingTrackingId() {
            this.openAdvertisingTrackingId_ = getDefaultInstance().getOpenAdvertisingTrackingId();
        }

        private void clearVendorId() {
            this.vendorId_ = getDefaultInstance().getVendorId();
        }

        public static Pii getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Pii parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Pii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdvertisingId(ByteString byteString) {
            byteString.getClass();
            this.advertisingId_ = byteString;
        }

        private void setAppsetId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.appsetId_ = str;
        }

        private void setAppsetIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appsetId_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setFid(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.fid_ = str;
        }

        private void setFidBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.fid_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setOpenAdvertisingTrackingId(ByteString byteString) {
            byteString.getClass();
            this.openAdvertisingTrackingId_ = byteString;
        }

        private void setVendorId(ByteString byteString) {
            byteString.getClass();
            this.vendorId_ = byteString;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Pii();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004ለ\u0000\u0005ለ\u0001", new Object[]{"bitField0_", "advertisingId_", "vendorId_", "openAdvertisingTrackingId_", "fid_", "appsetId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (Pii.class) {
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

        public ByteString getAdvertisingId() {
            return this.advertisingId_;
        }

        public String getAppsetId() {
            return this.appsetId_;
        }

        public ByteString getAppsetIdBytes() {
            return ByteString.copyFromUtf8(this.appsetId_);
        }

        public String getFid() {
            return this.fid_;
        }

        public ByteString getFidBytes() {
            return ByteString.copyFromUtf8(this.fid_);
        }

        public ByteString getOpenAdvertisingTrackingId() {
            return this.openAdvertisingTrackingId_;
        }

        public ByteString getVendorId() {
            return this.vendorId_;
        }

        public boolean hasAppsetId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Pii pii) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(pii);
        }

        public static Pii parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Pii parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Pii parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Pii parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Pii parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Pii parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Pii parseFrom(InputStream inputStream) throws IOException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Pii parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Pii parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Pii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PiiOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdvertisingId();

        String getAppsetId();

        ByteString getAppsetIdBytes();

        String getFid();

        ByteString getFidBytes();

        ByteString getOpenAdvertisingTrackingId();

        ByteString getVendorId();

        boolean hasAppsetId();

        boolean hasFid();
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

    private PiiOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
