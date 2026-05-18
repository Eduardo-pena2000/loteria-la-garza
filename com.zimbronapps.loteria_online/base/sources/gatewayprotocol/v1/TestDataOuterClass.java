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
public final class TestDataOuterClass {

    public static final class TestData extends GeneratedMessageLite implements TestDataOrBuilder {
        private static final TestData DEFAULT_INSTANCE;
        public static final int FORCE_CAMPAIGN_ID_FIELD_NUMBER = 1;
        public static final int FORCE_COUNTRY_FIELD_NUMBER = 2;
        public static final int FORCE_COUNTRY_SUBDIVISION_FIELD_NUMBER = 3;
        public static final int FORCE_EXCHANGE_TEST_MODE_FIELD_NUMBER = 4;
        private static volatile Parser PARSER;
        private int bitField0_;
        private int forceExchangeTestMode_;
        private String forceCampaignId_ = "";
        private String forceCountry_ = "";
        private String forceCountrySubdivision_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements TestDataOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearForceCampaignId() {
                copyOnWrite();
                TestData.access$200((TestData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearForceCountry() {
                copyOnWrite();
                TestData.access$500((TestData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearForceCountrySubdivision() {
                copyOnWrite();
                TestData.access$800((TestData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearForceExchangeTestMode() {
                copyOnWrite();
                TestData.access$1100((TestData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public String getForceCampaignId() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).getForceCampaignId();
            }

            public ByteString getForceCampaignIdBytes() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).getForceCampaignIdBytes();
            }

            public String getForceCountry() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).getForceCountry();
            }

            public ByteString getForceCountryBytes() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).getForceCountryBytes();
            }

            public String getForceCountrySubdivision() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).getForceCountrySubdivision();
            }

            public ByteString getForceCountrySubdivisionBytes() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).getForceCountrySubdivisionBytes();
            }

            public int getForceExchangeTestMode() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).getForceExchangeTestMode();
            }

            public boolean hasForceCampaignId() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).hasForceCampaignId();
            }

            public boolean hasForceCountry() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).hasForceCountry();
            }

            public boolean hasForceCountrySubdivision() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).hasForceCountrySubdivision();
            }

            public boolean hasForceExchangeTestMode() {
                return ((TestData) ((GeneratedMessageLite.Builder) this).instance).hasForceExchangeTestMode();
            }

            public Builder setForceCampaignId(String str) {
                copyOnWrite();
                TestData.access$100((TestData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setForceCampaignIdBytes(ByteString byteString) {
                copyOnWrite();
                TestData.access$300((TestData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setForceCountry(String str) {
                copyOnWrite();
                TestData.access$400((TestData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setForceCountryBytes(ByteString byteString) {
                copyOnWrite();
                TestData.access$600((TestData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setForceCountrySubdivision(String str) {
                copyOnWrite();
                TestData.access$700((TestData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setForceCountrySubdivisionBytes(ByteString byteString) {
                copyOnWrite();
                TestData.access$900((TestData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setForceExchangeTestMode(int i) {
                copyOnWrite();
                TestData.access$1000((TestData) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(TestData.access$000());
            }
        }

        static {
            TestData testData = new TestData();
            DEFAULT_INSTANCE = testData;
            GeneratedMessageLite.registerDefaultInstance(TestData.class, testData);
        }

        private TestData() {
        }

        public static /* synthetic */ TestData access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(TestData testData, String str) {
            testData.setForceCampaignId(str);
        }

        public static /* synthetic */ void access$1000(TestData testData, int i) {
            testData.setForceExchangeTestMode(i);
        }

        public static /* synthetic */ void access$1100(TestData testData) {
            testData.clearForceExchangeTestMode();
        }

        public static /* synthetic */ void access$200(TestData testData) {
            testData.clearForceCampaignId();
        }

        public static /* synthetic */ void access$300(TestData testData, ByteString byteString) {
            testData.setForceCampaignIdBytes(byteString);
        }

        public static /* synthetic */ void access$400(TestData testData, String str) {
            testData.setForceCountry(str);
        }

        public static /* synthetic */ void access$500(TestData testData) {
            testData.clearForceCountry();
        }

        public static /* synthetic */ void access$600(TestData testData, ByteString byteString) {
            testData.setForceCountryBytes(byteString);
        }

        public static /* synthetic */ void access$700(TestData testData, String str) {
            testData.setForceCountrySubdivision(str);
        }

        public static /* synthetic */ void access$800(TestData testData) {
            testData.clearForceCountrySubdivision();
        }

        public static /* synthetic */ void access$900(TestData testData, ByteString byteString) {
            testData.setForceCountrySubdivisionBytes(byteString);
        }

        private void clearForceCampaignId() {
            this.bitField0_ &= -2;
            this.forceCampaignId_ = getDefaultInstance().getForceCampaignId();
        }

        private void clearForceCountry() {
            this.bitField0_ &= -3;
            this.forceCountry_ = getDefaultInstance().getForceCountry();
        }

        private void clearForceCountrySubdivision() {
            this.bitField0_ &= -5;
            this.forceCountrySubdivision_ = getDefaultInstance().getForceCountrySubdivision();
        }

        private void clearForceExchangeTestMode() {
            this.bitField0_ &= -9;
            this.forceExchangeTestMode_ = 0;
        }

        public static TestData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TestData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TestData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TestData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setForceCampaignId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.forceCampaignId_ = str;
        }

        private void setForceCampaignIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.forceCampaignId_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setForceCountry(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.forceCountry_ = str;
        }

        private void setForceCountryBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.forceCountry_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setForceCountrySubdivision(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.forceCountrySubdivision_ = str;
        }

        private void setForceCountrySubdivisionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.forceCountrySubdivision_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setForceExchangeTestMode(int i) {
            this.bitField0_ |= 8;
            this.forceExchangeTestMode_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TestData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "forceCampaignId_", "forceCountry_", "forceCountrySubdivision_", "forceExchangeTestMode_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TestData.class) {
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

        public String getForceCampaignId() {
            return this.forceCampaignId_;
        }

        public ByteString getForceCampaignIdBytes() {
            return ByteString.copyFromUtf8(this.forceCampaignId_);
        }

        public String getForceCountry() {
            return this.forceCountry_;
        }

        public ByteString getForceCountryBytes() {
            return ByteString.copyFromUtf8(this.forceCountry_);
        }

        public String getForceCountrySubdivision() {
            return this.forceCountrySubdivision_;
        }

        public ByteString getForceCountrySubdivisionBytes() {
            return ByteString.copyFromUtf8(this.forceCountrySubdivision_);
        }

        public int getForceExchangeTestMode() {
            return this.forceExchangeTestMode_;
        }

        public boolean hasForceCampaignId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasForceCountry() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasForceCountrySubdivision() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasForceExchangeTestMode() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(TestData testData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(testData);
        }

        public static TestData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TestData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TestData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TestData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TestData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TestData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TestData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TestData parseFrom(InputStream inputStream) throws IOException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TestData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TestData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TestData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TestData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TestDataOrBuilder extends MessageLiteOrBuilder {
        String getForceCampaignId();

        ByteString getForceCampaignIdBytes();

        String getForceCountry();

        ByteString getForceCountryBytes();

        String getForceCountrySubdivision();

        ByteString getForceCountrySubdivisionBytes();

        int getForceExchangeTestMode();

        boolean hasForceCampaignId();

        boolean hasForceCountry();

        boolean hasForceCountrySubdivision();

        boolean hasForceExchangeTestMode();
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

    private TestDataOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
