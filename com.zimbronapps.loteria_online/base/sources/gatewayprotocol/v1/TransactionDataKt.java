package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionDataKt {
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (TransactionEventRequestOuterClass.TransactionData) build;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearJwsRepresentation() {
            this._builder.clearJwsRepresentation();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearSignature() {
            this._builder.clearSignature();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            t.f(eventId, "_builder.getEventId()");
            return eventId;
        }

        public final String getJwsRepresentation() {
            String jwsRepresentation = this._builder.getJwsRepresentation();
            t.f(jwsRepresentation, "_builder.getJwsRepresentation()");
            return jwsRepresentation;
        }

        public final String getProduct() {
            String product = this._builder.getProduct();
            t.f(product, "_builder.getProduct()");
            return product;
        }

        public final String getProductId() {
            String productId = this._builder.getProductId();
            t.f(productId, "_builder.getProductId()");
            return productId;
        }

        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            t.f(receipt, "_builder.getReceipt()");
            return receipt;
        }

        public final String getSignature() {
            String signature = this._builder.getSignature();
            t.f(signature, "_builder.getSignature()");
            return signature;
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            t.f(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            t.f(transaction, "_builder.getTransaction()");
            return transaction;
        }

        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            t.f(transactionId, "_builder.getTransactionId()");
            return transactionId;
        }

        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            t.f(transactionState, "_builder.getTransactionState()");
            return transactionState;
        }

        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final boolean hasJwsRepresentation() {
            return this._builder.hasJwsRepresentation();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasSignature() {
            return this._builder.hasSignature();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setEventId(ByteString value) {
            t.g(value, "value");
            this._builder.setEventId(value);
        }

        public final void setJwsRepresentation(String value) {
            t.g(value, "value");
            this._builder.setJwsRepresentation(value);
        }

        public final void setProduct(String value) {
            t.g(value, "value");
            this._builder.setProduct(value);
        }

        public final void setProductId(String value) {
            t.g(value, "value");
            this._builder.setProductId(value);
        }

        public final void setReceipt(String value) {
            t.g(value, "value");
            this._builder.setReceipt(value);
        }

        public final void setSignature(String value) {
            t.g(value, "value");
            this._builder.setSignature(value);
        }

        public final void setTimestamp(Timestamp value) {
            t.g(value, "value");
            this._builder.setTimestamp(value);
        }

        public final void setTransaction(String value) {
            t.g(value, "value");
            this._builder.setTransaction(value);
        }

        public final void setTransactionId(String value) {
            t.g(value, "value");
            this._builder.setTransactionId(value);
        }

        public final void setTransactionState(TransactionEventRequestOuterClass.TransactionState value) {
            t.g(value, "value");
            this._builder.setTransactionState(value);
        }

        public final void setTransactionStateValue(int i) {
            this._builder.setTransactionStateValue(i);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }
    }

    private TransactionDataKt() {
    }
}
