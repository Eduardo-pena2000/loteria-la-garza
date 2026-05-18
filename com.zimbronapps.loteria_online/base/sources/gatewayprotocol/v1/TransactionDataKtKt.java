package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionDataKtKt {
    public static final TransactionEventRequestOuterClass.TransactionData -initializetransactionData(l block) {
        t.g(block, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder newBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        t.f(newBuilder, "newBuilder()");
        TransactionDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TransactionEventRequestOuterClass.TransactionData copy(TransactionEventRequestOuterClass.TransactionData transactionData, l block) {
        t.g(transactionData, "<this>");
        t.g(block, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = transactionData.toBuilder();
        t.f(builder, "this.toBuilder()");
        TransactionDataKt.Dsl _create = companion._create((TransactionEventRequestOuterClass.TransactionData.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Timestamp getTimestampOrNull(TransactionEventRequestOuterClass.TransactionDataOrBuilder transactionDataOrBuilder) {
        t.g(transactionDataOrBuilder, "<this>");
        if (transactionDataOrBuilder.hasTimestamp()) {
            return transactionDataOrBuilder.getTimestamp();
        }
        return null;
    }
}
