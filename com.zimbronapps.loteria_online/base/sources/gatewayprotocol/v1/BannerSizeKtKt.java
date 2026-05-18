package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BannerSizeKtKt {
    public static final AdRequestOuterClass.BannerSize -initializebannerSize(l block) {
        t.g(block, "block");
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder newBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        t.f(newBuilder, "newBuilder()");
        BannerSizeKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdRequestOuterClass.BannerSize copy(AdRequestOuterClass.BannerSize bannerSize, l block) {
        t.g(bannerSize, "<this>");
        t.g(block, "block");
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = bannerSize.toBuilder();
        t.f(builder, "this.toBuilder()");
        BannerSizeKt.Dsl _create = companion._create((AdRequestOuterClass.BannerSize.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
