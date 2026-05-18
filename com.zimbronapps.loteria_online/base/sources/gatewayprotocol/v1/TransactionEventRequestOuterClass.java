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
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionEventRequestOuterClass {

    public enum StoreKitVersion implements Internal.EnumLite {
        STORE_KIT_VERSION_UNSPECIFIED(0),
        STORE_KIT_VERSION_1(1),
        STORE_KIT_VERSION_2(2),
        UNRECOGNIZED(-1);

        public static final int STORE_KIT_VERSION_1_VALUE = 1;
        public static final int STORE_KIT_VERSION_2_VALUE = 2;
        public static final int STORE_KIT_VERSION_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StoreKitVersion findValueByNumber(int i) {
                return StoreKitVersion.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return StoreKitVersion.forNumber(i) != null;
            }
        }

        StoreKitVersion(int i) {
            this.value = i;
        }

        public static StoreKitVersion forNumber(int i) {
            if (i == 0) {
                return STORE_KIT_VERSION_UNSPECIFIED;
            }
            if (i == 1) {
                return STORE_KIT_VERSION_1;
            }
            if (i != 2) {
                return null;
            }
            return STORE_KIT_VERSION_2;
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
        public static StoreKitVersion valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum StoreType implements Internal.EnumLite {
        STORE_TYPE_UNSPECIFIED(0),
        STORE_TYPE_CUSTOM(1),
        STORE_TYPE_APPLE_APP_STORE(2),
        STORE_TYPE_GOOGLE_PLAY(3),
        UNRECOGNIZED(-1);

        public static final int STORE_TYPE_APPLE_APP_STORE_VALUE = 2;
        public static final int STORE_TYPE_CUSTOM_VALUE = 1;
        public static final int STORE_TYPE_GOOGLE_PLAY_VALUE = 3;
        public static final int STORE_TYPE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StoreType findValueByNumber(int i) {
                return StoreType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return StoreType.forNumber(i) != null;
            }
        }

        StoreType(int i) {
            this.value = i;
        }

        public static StoreType forNumber(int i) {
            if (i == 0) {
                return STORE_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return STORE_TYPE_CUSTOM;
            }
            if (i == 2) {
                return STORE_TYPE_APPLE_APP_STORE;
            }
            if (i != 3) {
                return null;
            }
            return STORE_TYPE_GOOGLE_PLAY;
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
        public static StoreType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class TransactionData extends GeneratedMessageLite implements TransactionDataOrBuilder {
        private static final TransactionData DEFAULT_INSTANCE;
        public static final int EVENT_ID_FIELD_NUMBER = 3;
        public static final int JWS_REPRESENTATION_FIELD_NUMBER = 9;
        private static volatile Parser PARSER = null;
        public static final int PRODUCT_FIELD_NUMBER = 5;
        public static final int PRODUCT_ID_FIELD_NUMBER = 2;
        public static final int RECEIPT_FIELD_NUMBER = 7;
        public static final int SIGNATURE_FIELD_NUMBER = 10;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        public static final int TRANSACTION_FIELD_NUMBER = 6;
        public static final int TRANSACTION_ID_FIELD_NUMBER = 4;
        public static final int TRANSACTION_STATE_FIELD_NUMBER = 8;
        private int bitField0_;
        private Timestamp timestamp_;
        private int transactionState_;
        private String productId_ = "";
        private ByteString eventId_ = ByteString.EMPTY;
        private String transactionId_ = "";
        private String product_ = "";
        private String transaction_ = "";
        private String receipt_ = "";
        private String jwsRepresentation_ = "";
        private String signature_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements TransactionDataOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder clearEventId() {
                copyOnWrite();
                TransactionData.access$800((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearJwsRepresentation() {
                copyOnWrite();
                TransactionData.access$2500((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearProduct() {
                copyOnWrite();
                TransactionData.access$1300((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearProductId() {
                copyOnWrite();
                TransactionData.access$500((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearReceipt() {
                copyOnWrite();
                TransactionData.access$1900((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                TransactionData.access$2800((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTimestamp() {
                copyOnWrite();
                TransactionData.access$300((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTransaction() {
                copyOnWrite();
                TransactionData.access$1600((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTransactionId() {
                copyOnWrite();
                TransactionData.access$1000((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTransactionState() {
                copyOnWrite();
                TransactionData.access$2300((TransactionData) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public ByteString getEventId() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getEventId();
            }

            public String getJwsRepresentation() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getJwsRepresentation();
            }

            public ByteString getJwsRepresentationBytes() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getJwsRepresentationBytes();
            }

            public String getProduct() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getProduct();
            }

            public ByteString getProductBytes() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getProductBytes();
            }

            public String getProductId() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getProductId();
            }

            public ByteString getProductIdBytes() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getProductIdBytes();
            }

            public String getReceipt() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getReceipt();
            }

            public ByteString getReceiptBytes() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getReceiptBytes();
            }

            public String getSignature() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getSignature();
            }

            public ByteString getSignatureBytes() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getSignatureBytes();
            }

            public Timestamp getTimestamp() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getTimestamp();
            }

            public String getTransaction() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getTransaction();
            }

            public ByteString getTransactionBytes() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getTransactionBytes();
            }

            public String getTransactionId() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getTransactionId();
            }

            public ByteString getTransactionIdBytes() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getTransactionIdBytes();
            }

            public TransactionState getTransactionState() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getTransactionState();
            }

            public int getTransactionStateValue() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).getTransactionStateValue();
            }

            public boolean hasJwsRepresentation() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).hasJwsRepresentation();
            }

            public boolean hasReceipt() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).hasReceipt();
            }

            public boolean hasSignature() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).hasSignature();
            }

            public boolean hasTimestamp() {
                return ((TransactionData) ((GeneratedMessageLite.Builder) this).instance).hasTimestamp();
            }

            public Builder mergeTimestamp(Timestamp timestamp) {
                copyOnWrite();
                TransactionData.access$200((TransactionData) ((GeneratedMessageLite.Builder) this).instance, timestamp);
                return this;
            }

            public Builder setEventId(ByteString byteString) {
                copyOnWrite();
                TransactionData.access$700((TransactionData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setJwsRepresentation(String str) {
                copyOnWrite();
                TransactionData.access$2400((TransactionData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setJwsRepresentationBytes(ByteString byteString) {
                copyOnWrite();
                TransactionData.access$2600((TransactionData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setProduct(String str) {
                copyOnWrite();
                TransactionData.access$1200((TransactionData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setProductBytes(ByteString byteString) {
                copyOnWrite();
                TransactionData.access$1400((TransactionData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setProductId(String str) {
                copyOnWrite();
                TransactionData.access$400((TransactionData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setProductIdBytes(ByteString byteString) {
                copyOnWrite();
                TransactionData.access$600((TransactionData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setReceipt(String str) {
                copyOnWrite();
                TransactionData.access$1800((TransactionData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setReceiptBytes(ByteString byteString) {
                copyOnWrite();
                TransactionData.access$2000((TransactionData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setSignature(String str) {
                copyOnWrite();
                TransactionData.access$2700((TransactionData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setSignatureBytes(ByteString byteString) {
                copyOnWrite();
                TransactionData.access$2900((TransactionData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTimestamp(Timestamp timestamp) {
                copyOnWrite();
                TransactionData.access$100((TransactionData) ((GeneratedMessageLite.Builder) this).instance, timestamp);
                return this;
            }

            public Builder setTransaction(String str) {
                copyOnWrite();
                TransactionData.access$1500((TransactionData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setTransactionBytes(ByteString byteString) {
                copyOnWrite();
                TransactionData.access$1700((TransactionData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTransactionId(String str) {
                copyOnWrite();
                TransactionData.access$900((TransactionData) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setTransactionIdBytes(ByteString byteString) {
                copyOnWrite();
                TransactionData.access$1100((TransactionData) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setTransactionState(TransactionState transactionState) {
                copyOnWrite();
                TransactionData.access$2200((TransactionData) ((GeneratedMessageLite.Builder) this).instance, transactionState);
                return this;
            }

            public Builder setTransactionStateValue(int i) {
                copyOnWrite();
                TransactionData.access$2100((TransactionData) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            private Builder() {
                super(TransactionData.access$000());
            }

            public Builder setTimestamp(Timestamp.Builder builder) {
                copyOnWrite();
                TransactionData.access$100((TransactionData) ((GeneratedMessageLite.Builder) this).instance, builder.build());
                return this;
            }
        }

        static {
            TransactionData transactionData = new TransactionData();
            DEFAULT_INSTANCE = transactionData;
            GeneratedMessageLite.registerDefaultInstance(TransactionData.class, transactionData);
        }

        private TransactionData() {
        }

        public static /* synthetic */ TransactionData access$000() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$100(TransactionData transactionData, Timestamp timestamp) {
            transactionData.setTimestamp(timestamp);
        }

        public static /* synthetic */ void access$1000(TransactionData transactionData) {
            transactionData.clearTransactionId();
        }

        public static /* synthetic */ void access$1100(TransactionData transactionData, ByteString byteString) {
            transactionData.setTransactionIdBytes(byteString);
        }

        public static /* synthetic */ void access$1200(TransactionData transactionData, String str) {
            transactionData.setProduct(str);
        }

        public static /* synthetic */ void access$1300(TransactionData transactionData) {
            transactionData.clearProduct();
        }

        public static /* synthetic */ void access$1400(TransactionData transactionData, ByteString byteString) {
            transactionData.setProductBytes(byteString);
        }

        public static /* synthetic */ void access$1500(TransactionData transactionData, String str) {
            transactionData.setTransaction(str);
        }

        public static /* synthetic */ void access$1600(TransactionData transactionData) {
            transactionData.clearTransaction();
        }

        public static /* synthetic */ void access$1700(TransactionData transactionData, ByteString byteString) {
            transactionData.setTransactionBytes(byteString);
        }

        public static /* synthetic */ void access$1800(TransactionData transactionData, String str) {
            transactionData.setReceipt(str);
        }

        public static /* synthetic */ void access$1900(TransactionData transactionData) {
            transactionData.clearReceipt();
        }

        public static /* synthetic */ void access$200(TransactionData transactionData, Timestamp timestamp) {
            transactionData.mergeTimestamp(timestamp);
        }

        public static /* synthetic */ void access$2000(TransactionData transactionData, ByteString byteString) {
            transactionData.setReceiptBytes(byteString);
        }

        public static /* synthetic */ void access$2100(TransactionData transactionData, int i) {
            transactionData.setTransactionStateValue(i);
        }

        public static /* synthetic */ void access$2200(TransactionData transactionData, TransactionState transactionState) {
            transactionData.setTransactionState(transactionState);
        }

        public static /* synthetic */ void access$2300(TransactionData transactionData) {
            transactionData.clearTransactionState();
        }

        public static /* synthetic */ void access$2400(TransactionData transactionData, String str) {
            transactionData.setJwsRepresentation(str);
        }

        public static /* synthetic */ void access$2500(TransactionData transactionData) {
            transactionData.clearJwsRepresentation();
        }

        public static /* synthetic */ void access$2600(TransactionData transactionData, ByteString byteString) {
            transactionData.setJwsRepresentationBytes(byteString);
        }

        public static /* synthetic */ void access$2700(TransactionData transactionData, String str) {
            transactionData.setSignature(str);
        }

        public static /* synthetic */ void access$2800(TransactionData transactionData) {
            transactionData.clearSignature();
        }

        public static /* synthetic */ void access$2900(TransactionData transactionData, ByteString byteString) {
            transactionData.setSignatureBytes(byteString);
        }

        public static /* synthetic */ void access$300(TransactionData transactionData) {
            transactionData.clearTimestamp();
        }

        public static /* synthetic */ void access$400(TransactionData transactionData, String str) {
            transactionData.setProductId(str);
        }

        public static /* synthetic */ void access$500(TransactionData transactionData) {
            transactionData.clearProductId();
        }

        public static /* synthetic */ void access$600(TransactionData transactionData, ByteString byteString) {
            transactionData.setProductIdBytes(byteString);
        }

        public static /* synthetic */ void access$700(TransactionData transactionData, ByteString byteString) {
            transactionData.setEventId(byteString);
        }

        public static /* synthetic */ void access$800(TransactionData transactionData) {
            transactionData.clearEventId();
        }

        public static /* synthetic */ void access$900(TransactionData transactionData, String str) {
            transactionData.setTransactionId(str);
        }

        private void clearEventId() {
            this.eventId_ = getDefaultInstance().getEventId();
        }

        private void clearJwsRepresentation() {
            this.bitField0_ &= -5;
            this.jwsRepresentation_ = getDefaultInstance().getJwsRepresentation();
        }

        private void clearProduct() {
            this.product_ = getDefaultInstance().getProduct();
        }

        private void clearProductId() {
            this.productId_ = getDefaultInstance().getProductId();
        }

        private void clearReceipt() {
            this.bitField0_ &= -3;
            this.receipt_ = getDefaultInstance().getReceipt();
        }

        private void clearSignature() {
            this.bitField0_ &= -9;
            this.signature_ = getDefaultInstance().getSignature();
        }

        private void clearTimestamp() {
            this.timestamp_ = null;
            this.bitField0_ &= -2;
        }

        private void clearTransaction() {
            this.transaction_ = getDefaultInstance().getTransaction();
        }

        private void clearTransactionId() {
            this.transactionId_ = getDefaultInstance().getTransactionId();
        }

        private void clearTransactionState() {
            this.transactionState_ = 0;
        }

        public static TransactionData getDefaultInstance() {
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

        public static TransactionData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEventId(ByteString byteString) {
            byteString.getClass();
            this.eventId_ = byteString;
        }

        private void setJwsRepresentation(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.jwsRepresentation_ = str;
        }

        private void setJwsRepresentationBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.jwsRepresentation_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setProduct(String str) {
            str.getClass();
            this.product_ = str;
        }

        private void setProductBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.product_ = byteString.toStringUtf8();
        }

        private void setProductId(String str) {
            str.getClass();
            this.productId_ = str;
        }

        private void setProductIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.productId_ = byteString.toStringUtf8();
        }

        private void setReceipt(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.receipt_ = str;
        }

        private void setReceiptBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.receipt_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setSignature(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.signature_ = str;
        }

        private void setSignatureBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.signature_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        private void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this.timestamp_ = timestamp;
            this.bitField0_ |= 1;
        }

        private void setTransaction(String str) {
            str.getClass();
            this.transaction_ = str;
        }

        private void setTransactionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.transaction_ = byteString.toStringUtf8();
        }

        private void setTransactionId(String str) {
            str.getClass();
            this.transactionId_ = str;
        }

        private void setTransactionIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.transactionId_ = byteString.toStringUtf8();
        }

        private void setTransactionState(TransactionState transactionState) {
            this.transactionState_ = transactionState.getNumber();
        }

        private void setTransactionStateValue(int i) {
            this.transactionState_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionData();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007ለ\u0001\b\f\tለ\u0002\nለ\u0003", new Object[]{"bitField0_", "timestamp_", "productId_", "eventId_", "transactionId_", "product_", "transaction_", "receipt_", "transactionState_", "jwsRepresentation_", "signature_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TransactionData.class) {
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

        public ByteString getEventId() {
            return this.eventId_;
        }

        public String getJwsRepresentation() {
            return this.jwsRepresentation_;
        }

        public ByteString getJwsRepresentationBytes() {
            return ByteString.copyFromUtf8(this.jwsRepresentation_);
        }

        public String getProduct() {
            return this.product_;
        }

        public ByteString getProductBytes() {
            return ByteString.copyFromUtf8(this.product_);
        }

        public String getProductId() {
            return this.productId_;
        }

        public ByteString getProductIdBytes() {
            return ByteString.copyFromUtf8(this.productId_);
        }

        public String getReceipt() {
            return this.receipt_;
        }

        public ByteString getReceiptBytes() {
            return ByteString.copyFromUtf8(this.receipt_);
        }

        public String getSignature() {
            return this.signature_;
        }

        public ByteString getSignatureBytes() {
            return ByteString.copyFromUtf8(this.signature_);
        }

        public Timestamp getTimestamp() {
            Timestamp timestamp = this.timestamp_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public String getTransaction() {
            return this.transaction_;
        }

        public ByteString getTransactionBytes() {
            return ByteString.copyFromUtf8(this.transaction_);
        }

        public String getTransactionId() {
            return this.transactionId_;
        }

        public ByteString getTransactionIdBytes() {
            return ByteString.copyFromUtf8(this.transactionId_);
        }

        public TransactionState getTransactionState() {
            TransactionState forNumber = TransactionState.forNumber(this.transactionState_);
            return forNumber == null ? TransactionState.UNRECOGNIZED : forNumber;
        }

        public int getTransactionStateValue() {
            return this.transactionState_;
        }

        public boolean hasJwsRepresentation() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasReceipt() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSignature() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TransactionData transactionData) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionData);
        }

        public static TransactionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TransactionData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TransactionData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TransactionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TransactionData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TransactionData parseFrom(InputStream inputStream) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TransactionData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TransactionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TransactionDataOrBuilder extends MessageLiteOrBuilder {
        ByteString getEventId();

        String getJwsRepresentation();

        ByteString getJwsRepresentationBytes();

        String getProduct();

        ByteString getProductBytes();

        String getProductId();

        ByteString getProductIdBytes();

        String getReceipt();

        ByteString getReceiptBytes();

        String getSignature();

        ByteString getSignatureBytes();

        Timestamp getTimestamp();

        String getTransaction();

        ByteString getTransactionBytes();

        String getTransactionId();

        ByteString getTransactionIdBytes();

        TransactionState getTransactionState();

        int getTransactionStateValue();

        boolean hasJwsRepresentation();

        boolean hasReceipt();

        boolean hasSignature();

        boolean hasTimestamp();
    }

    public static final class TransactionEventRequest extends GeneratedMessageLite implements TransactionEventRequestOrBuilder {
        public static final int APP_STORE_FIELD_NUMBER = 3;
        public static final int CUSTOM_STORE_FIELD_NUMBER = 4;
        private static final TransactionEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        public static final int GOOGLE_PLAY_BILLING_LIBRARY_VERSION_FIELD_NUMBER = 8;
        public static final int ORIGIN_FIELD_NUMBER = 6;
        private static volatile Parser PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        public static final int STORE_KIT_VERSION_FIELD_NUMBER = 7;
        public static final int TRANSACTION_DATA_FIELD_NUMBER = 5;
        private int appStore_;
        private int bitField0_;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private int origin_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;
        private int storeKitVersion_;
        private String customStore_ = "";
        private Internal.ProtobufList transactionData_ = GeneratedMessageLite.emptyProtobufList();
        private String googlePlayBillingLibraryVersion_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder implements TransactionEventRequestOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            public Builder addAllTransactionData(Iterable iterable) {
                copyOnWrite();
                TransactionEventRequest.access$4700((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, iterable);
                return this;
            }

            public Builder addTransactionData(TransactionData transactionData) {
                copyOnWrite();
                TransactionEventRequest.access$4500((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, transactionData);
                return this;
            }

            public Builder clearAppStore() {
                copyOnWrite();
                TransactionEventRequest.access$4000((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearCustomStore() {
                copyOnWrite();
                TransactionEventRequest.access$4200((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                TransactionEventRequest.access$3700((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearGooglePlayBillingLibraryVersion() {
                copyOnWrite();
                TransactionEventRequest.access$5700((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearOrigin() {
                copyOnWrite();
                TransactionEventRequest.access$5200((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                TransactionEventRequest.access$3400((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearStoreKitVersion() {
                copyOnWrite();
                TransactionEventRequest.access$5500((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public Builder clearTransactionData() {
                copyOnWrite();
                TransactionEventRequest.access$4800((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance);
                return this;
            }

            public StoreType getAppStore() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getAppStore();
            }

            public int getAppStoreValue() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getAppStoreValue();
            }

            public String getCustomStore() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getCustomStore();
            }

            public ByteString getCustomStoreBytes() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getCustomStoreBytes();
            }

            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getDynamicDeviceInfo();
            }

            public String getGooglePlayBillingLibraryVersion() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getGooglePlayBillingLibraryVersion();
            }

            public ByteString getGooglePlayBillingLibraryVersionBytes() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getGooglePlayBillingLibraryVersionBytes();
            }

            public TransactionOrigin getOrigin() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getOrigin();
            }

            public int getOriginValue() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getOriginValue();
            }

            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getStaticDeviceInfo();
            }

            public StoreKitVersion getStoreKitVersion() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getStoreKitVersion();
            }

            public int getStoreKitVersionValue() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getStoreKitVersionValue();
            }

            public TransactionData getTransactionData(int i) {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getTransactionData(i);
            }

            public int getTransactionDataCount() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getTransactionDataCount();
            }

            public List getTransactionDataList() {
                return Collections.unmodifiableList(((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).getTransactionDataList());
            }

            public boolean hasDynamicDeviceInfo() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasDynamicDeviceInfo();
            }

            public boolean hasStaticDeviceInfo() {
                return ((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance).hasStaticDeviceInfo();
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                TransactionEventRequest.access$3600((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                TransactionEventRequest.access$3300((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder removeTransactionData(int i) {
                copyOnWrite();
                TransactionEventRequest.access$4900((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setAppStore(StoreType storeType) {
                copyOnWrite();
                TransactionEventRequest.access$3900((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, storeType);
                return this;
            }

            public Builder setAppStoreValue(int i) {
                copyOnWrite();
                TransactionEventRequest.access$3800((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setCustomStore(String str) {
                copyOnWrite();
                TransactionEventRequest.access$4100((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setCustomStoreBytes(ByteString byteString) {
                copyOnWrite();
                TransactionEventRequest.access$4300((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                TransactionEventRequest.access$3500((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, dynamicDeviceInfo);
                return this;
            }

            public Builder setGooglePlayBillingLibraryVersion(String str) {
                copyOnWrite();
                TransactionEventRequest.access$5600((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, str);
                return this;
            }

            public Builder setGooglePlayBillingLibraryVersionBytes(ByteString byteString) {
                copyOnWrite();
                TransactionEventRequest.access$5800((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, byteString);
                return this;
            }

            public Builder setOrigin(TransactionOrigin transactionOrigin) {
                copyOnWrite();
                TransactionEventRequest.access$5100((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, transactionOrigin);
                return this;
            }

            public Builder setOriginValue(int i) {
                copyOnWrite();
                TransactionEventRequest.access$5000((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                TransactionEventRequest.access$3200((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, staticDeviceInfo);
                return this;
            }

            public Builder setStoreKitVersion(StoreKitVersion storeKitVersion) {
                copyOnWrite();
                TransactionEventRequest.access$5400((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, storeKitVersion);
                return this;
            }

            public Builder setStoreKitVersionValue(int i) {
                copyOnWrite();
                TransactionEventRequest.access$5300((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, i);
                return this;
            }

            public Builder setTransactionData(int i, TransactionData transactionData) {
                copyOnWrite();
                TransactionEventRequest.access$4400((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, i, transactionData);
                return this;
            }

            private Builder() {
                super(TransactionEventRequest.access$3100());
            }

            public Builder addTransactionData(int i, TransactionData transactionData) {
                copyOnWrite();
                TransactionEventRequest.access$4600((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, i, transactionData);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                TransactionEventRequest.access$3500((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, (DynamicDeviceInfoOuterClass.DynamicDeviceInfo) builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                TransactionEventRequest.access$3200((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, (StaticDeviceInfoOuterClass.StaticDeviceInfo) builder.build());
                return this;
            }

            public Builder setTransactionData(int i, TransactionData.Builder builder) {
                copyOnWrite();
                TransactionEventRequest.access$4400((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, i, (TransactionData) builder.build());
                return this;
            }

            public Builder addTransactionData(TransactionData.Builder builder) {
                copyOnWrite();
                TransactionEventRequest.access$4500((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, (TransactionData) builder.build());
                return this;
            }

            public Builder addTransactionData(int i, TransactionData.Builder builder) {
                copyOnWrite();
                TransactionEventRequest.access$4600((TransactionEventRequest) ((GeneratedMessageLite.Builder) this).instance, i, (TransactionData) builder.build());
                return this;
            }
        }

        static {
            TransactionEventRequest transactionEventRequest = new TransactionEventRequest();
            DEFAULT_INSTANCE = transactionEventRequest;
            GeneratedMessageLite.registerDefaultInstance(TransactionEventRequest.class, transactionEventRequest);
        }

        private TransactionEventRequest() {
        }

        public static /* synthetic */ TransactionEventRequest access$3100() {
            return DEFAULT_INSTANCE;
        }

        public static /* synthetic */ void access$3200(TransactionEventRequest transactionEventRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            transactionEventRequest.setStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$3300(TransactionEventRequest transactionEventRequest, StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            transactionEventRequest.mergeStaticDeviceInfo(staticDeviceInfo);
        }

        public static /* synthetic */ void access$3400(TransactionEventRequest transactionEventRequest) {
            transactionEventRequest.clearStaticDeviceInfo();
        }

        public static /* synthetic */ void access$3500(TransactionEventRequest transactionEventRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            transactionEventRequest.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$3600(TransactionEventRequest transactionEventRequest, DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            transactionEventRequest.mergeDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public static /* synthetic */ void access$3700(TransactionEventRequest transactionEventRequest) {
            transactionEventRequest.clearDynamicDeviceInfo();
        }

        public static /* synthetic */ void access$3800(TransactionEventRequest transactionEventRequest, int i) {
            transactionEventRequest.setAppStoreValue(i);
        }

        public static /* synthetic */ void access$3900(TransactionEventRequest transactionEventRequest, StoreType storeType) {
            transactionEventRequest.setAppStore(storeType);
        }

        public static /* synthetic */ void access$4000(TransactionEventRequest transactionEventRequest) {
            transactionEventRequest.clearAppStore();
        }

        public static /* synthetic */ void access$4100(TransactionEventRequest transactionEventRequest, String str) {
            transactionEventRequest.setCustomStore(str);
        }

        public static /* synthetic */ void access$4200(TransactionEventRequest transactionEventRequest) {
            transactionEventRequest.clearCustomStore();
        }

        public static /* synthetic */ void access$4300(TransactionEventRequest transactionEventRequest, ByteString byteString) {
            transactionEventRequest.setCustomStoreBytes(byteString);
        }

        public static /* synthetic */ void access$4400(TransactionEventRequest transactionEventRequest, int i, TransactionData transactionData) {
            transactionEventRequest.setTransactionData(i, transactionData);
        }

        public static /* synthetic */ void access$4500(TransactionEventRequest transactionEventRequest, TransactionData transactionData) {
            transactionEventRequest.addTransactionData(transactionData);
        }

        public static /* synthetic */ void access$4600(TransactionEventRequest transactionEventRequest, int i, TransactionData transactionData) {
            transactionEventRequest.addTransactionData(i, transactionData);
        }

        public static /* synthetic */ void access$4700(TransactionEventRequest transactionEventRequest, Iterable iterable) {
            transactionEventRequest.addAllTransactionData(iterable);
        }

        public static /* synthetic */ void access$4800(TransactionEventRequest transactionEventRequest) {
            transactionEventRequest.clearTransactionData();
        }

        public static /* synthetic */ void access$4900(TransactionEventRequest transactionEventRequest, int i) {
            transactionEventRequest.removeTransactionData(i);
        }

        public static /* synthetic */ void access$5000(TransactionEventRequest transactionEventRequest, int i) {
            transactionEventRequest.setOriginValue(i);
        }

        public static /* synthetic */ void access$5100(TransactionEventRequest transactionEventRequest, TransactionOrigin transactionOrigin) {
            transactionEventRequest.setOrigin(transactionOrigin);
        }

        public static /* synthetic */ void access$5200(TransactionEventRequest transactionEventRequest) {
            transactionEventRequest.clearOrigin();
        }

        public static /* synthetic */ void access$5300(TransactionEventRequest transactionEventRequest, int i) {
            transactionEventRequest.setStoreKitVersionValue(i);
        }

        public static /* synthetic */ void access$5400(TransactionEventRequest transactionEventRequest, StoreKitVersion storeKitVersion) {
            transactionEventRequest.setStoreKitVersion(storeKitVersion);
        }

        public static /* synthetic */ void access$5500(TransactionEventRequest transactionEventRequest) {
            transactionEventRequest.clearStoreKitVersion();
        }

        public static /* synthetic */ void access$5600(TransactionEventRequest transactionEventRequest, String str) {
            transactionEventRequest.setGooglePlayBillingLibraryVersion(str);
        }

        public static /* synthetic */ void access$5700(TransactionEventRequest transactionEventRequest) {
            transactionEventRequest.clearGooglePlayBillingLibraryVersion();
        }

        public static /* synthetic */ void access$5800(TransactionEventRequest transactionEventRequest, ByteString byteString) {
            transactionEventRequest.setGooglePlayBillingLibraryVersionBytes(byteString);
        }

        private void addAllTransactionData(Iterable iterable) {
            ensureTransactionDataIsMutable();
            AbstractMessageLite.addAll(iterable, this.transactionData_);
        }

        private void addTransactionData(TransactionData transactionData) {
            transactionData.getClass();
            ensureTransactionDataIsMutable();
            this.transactionData_.add(transactionData);
        }

        private void clearAppStore() {
            this.appStore_ = 0;
        }

        private void clearCustomStore() {
            this.customStore_ = getDefaultInstance().getCustomStore();
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearGooglePlayBillingLibraryVersion() {
            this.googlePlayBillingLibraryVersion_ = getDefaultInstance().getGooglePlayBillingLibraryVersion();
        }

        private void clearOrigin() {
            this.origin_ = 0;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        private void clearStoreKitVersion() {
            this.storeKitVersion_ = 0;
        }

        private void clearTransactionData() {
            this.transactionData_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTransactionDataIsMutable() {
            Internal.ProtobufList protobufList = this.transactionData_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.transactionData_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static TransactionEventRequest getDefaultInstance() {
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
            this.bitField0_ |= 2;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 == null || staticDeviceInfo2 == StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = staticDeviceInfo;
            } else {
                this.staticDeviceInfo_ = (StaticDeviceInfoOuterClass.StaticDeviceInfo) ((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfo)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TransactionEventRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionEventRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeTransactionData(int i) {
            ensureTransactionDataIsMutable();
            this.transactionData_.remove(i);
        }

        private void setAppStore(StoreType storeType) {
            this.appStore_ = storeType.getNumber();
        }

        private void setAppStoreValue(int i) {
            this.appStore_ = i;
        }

        private void setCustomStore(String str) {
            str.getClass();
            this.customStore_ = str;
        }

        private void setCustomStoreBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.customStore_ = byteString.toStringUtf8();
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        private void setGooglePlayBillingLibraryVersion(String str) {
            str.getClass();
            this.googlePlayBillingLibraryVersion_ = str;
        }

        private void setGooglePlayBillingLibraryVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.googlePlayBillingLibraryVersion_ = byteString.toStringUtf8();
        }

        private void setOrigin(TransactionOrigin transactionOrigin) {
            this.origin_ = transactionOrigin.getNumber();
        }

        private void setOriginValue(int i) {
            this.origin_ = i;
        }

        private void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        private void setStoreKitVersion(StoreKitVersion storeKitVersion) {
            this.storeKitVersion_ = storeKitVersion.getNumber();
        }

        private void setStoreKitVersionValue(int i) {
            this.storeKitVersion_ = i;
        }

        private void setTransactionData(int i, TransactionData transactionData) {
            transactionData.getClass();
            ensureTransactionDataIsMutable();
            this.transactionData_.set(i, transactionData);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TransactionEventRequest();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004Ȉ\u0005\u001b\u0006\f\u0007\f\bȈ", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "appStore_", "customStore_", "transactionData_", TransactionData.class, "origin_", "storeKitVersion_", "googlePlayBillingLibraryVersion_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TransactionEventRequest.class) {
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

        public StoreType getAppStore() {
            StoreType forNumber = StoreType.forNumber(this.appStore_);
            return forNumber == null ? StoreType.UNRECOGNIZED : forNumber;
        }

        public int getAppStoreValue() {
            return this.appStore_;
        }

        public String getCustomStore() {
            return this.customStore_;
        }

        public ByteString getCustomStoreBytes() {
            return ByteString.copyFromUtf8(this.customStore_);
        }

        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            return dynamicDeviceInfo == null ? DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance() : dynamicDeviceInfo;
        }

        public String getGooglePlayBillingLibraryVersion() {
            return this.googlePlayBillingLibraryVersion_;
        }

        public ByteString getGooglePlayBillingLibraryVersionBytes() {
            return ByteString.copyFromUtf8(this.googlePlayBillingLibraryVersion_);
        }

        public TransactionOrigin getOrigin() {
            TransactionOrigin forNumber = TransactionOrigin.forNumber(this.origin_);
            return forNumber == null ? TransactionOrigin.UNRECOGNIZED : forNumber;
        }

        public int getOriginValue() {
            return this.origin_;
        }

        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            return staticDeviceInfo == null ? StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance() : staticDeviceInfo;
        }

        public StoreKitVersion getStoreKitVersion() {
            StoreKitVersion forNumber = StoreKitVersion.forNumber(this.storeKitVersion_);
            return forNumber == null ? StoreKitVersion.UNRECOGNIZED : forNumber;
        }

        public int getStoreKitVersionValue() {
            return this.storeKitVersion_;
        }

        public TransactionData getTransactionData(int i) {
            return (TransactionData) this.transactionData_.get(i);
        }

        public int getTransactionDataCount() {
            return this.transactionData_.size();
        }

        public List getTransactionDataList() {
            return this.transactionData_;
        }

        public TransactionDataOrBuilder getTransactionDataOrBuilder(int i) {
            return (TransactionDataOrBuilder) this.transactionData_.get(i);
        }

        public List getTransactionDataOrBuilderList() {
            return this.transactionData_;
        }

        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(TransactionEventRequest transactionEventRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(transactionEventRequest);
        }

        public static TransactionEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addTransactionData(int i, TransactionData transactionData) {
            transactionData.getClass();
            ensureTransactionDataIsMutable();
            this.transactionData_.add(i, transactionData);
        }

        public static TransactionEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TransactionEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(InputStream inputStream) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TransactionEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TransactionEventRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TransactionEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (TransactionEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TransactionEventRequestOrBuilder extends MessageLiteOrBuilder {
        StoreType getAppStore();

        int getAppStoreValue();

        String getCustomStore();

        ByteString getCustomStoreBytes();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        String getGooglePlayBillingLibraryVersion();

        ByteString getGooglePlayBillingLibraryVersionBytes();

        TransactionOrigin getOrigin();

        int getOriginValue();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        StoreKitVersion getStoreKitVersion();

        int getStoreKitVersionValue();

        TransactionData getTransactionData(int i);

        int getTransactionDataCount();

        List getTransactionDataList();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
    }

    public enum TransactionOrigin implements Internal.EnumLite {
        TRANSACTION_ORIGIN_UNSPECIFIED(0),
        TRANSACTION_ORIGIN_LIVE_UPDATE(1),
        TRANSACTION_ORIGIN_HISTORICAL(2),
        UNRECOGNIZED(-1);

        public static final int TRANSACTION_ORIGIN_HISTORICAL_VALUE = 2;
        public static final int TRANSACTION_ORIGIN_LIVE_UPDATE_VALUE = 1;
        public static final int TRANSACTION_ORIGIN_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TransactionOrigin findValueByNumber(int i) {
                return TransactionOrigin.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return TransactionOrigin.forNumber(i) != null;
            }
        }

        TransactionOrigin(int i) {
            this.value = i;
        }

        public static TransactionOrigin forNumber(int i) {
            if (i == 0) {
                return TRANSACTION_ORIGIN_UNSPECIFIED;
            }
            if (i == 1) {
                return TRANSACTION_ORIGIN_LIVE_UPDATE;
            }
            if (i != 2) {
                return null;
            }
            return TRANSACTION_ORIGIN_HISTORICAL;
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
        public static TransactionOrigin valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum TransactionState implements Internal.EnumLite {
        TRANSACTION_STATE_UNSPECIFIED(0),
        TRANSACTION_STATE_PENDING(1),
        TRANSACTION_STATE_PURCHASED(2),
        TRANSACTION_STATE_FAILED(3),
        TRANSACTION_STATE_RESTORED(4),
        TRANSACTION_STATE_DEFERRED(5),
        UNRECOGNIZED(-1);

        public static final int TRANSACTION_STATE_DEFERRED_VALUE = 5;
        public static final int TRANSACTION_STATE_FAILED_VALUE = 3;
        public static final int TRANSACTION_STATE_PENDING_VALUE = 1;
        public static final int TRANSACTION_STATE_PURCHASED_VALUE = 2;
        public static final int TRANSACTION_STATE_RESTORED_VALUE = 4;
        public static final int TRANSACTION_STATE_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TransactionState findValueByNumber(int i) {
                return TransactionState.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            public boolean isInRange(int i) {
                return TransactionState.forNumber(i) != null;
            }
        }

        TransactionState(int i) {
            this.value = i;
        }

        public static TransactionState forNumber(int i) {
            if (i == 0) {
                return TRANSACTION_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return TRANSACTION_STATE_PENDING;
            }
            if (i == 2) {
                return TRANSACTION_STATE_PURCHASED;
            }
            if (i == 3) {
                return TRANSACTION_STATE_FAILED;
            }
            if (i == 4) {
                return TRANSACTION_STATE_RESTORED;
            }
            if (i != 5) {
                return null;
            }
            return TRANSACTION_STATE_DEFERRED;
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
        public static TransactionState valueOf(int i) {
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

    private TransactionEventRequestOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
