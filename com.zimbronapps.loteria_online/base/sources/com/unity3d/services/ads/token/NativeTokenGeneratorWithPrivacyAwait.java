package com.unity3d.services.ads.token;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.misc.IObserver;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class NativeTokenGeneratorWithPrivacyAwait implements INativeTokenGenerator {
    private final ExecutorService _executorService;
    private final INativeTokenGenerator _nativeTokenGenerator;
    private final ConditionVariable _privacyAwait = new ConditionVariable();
    private final int _privacyAwaitTimeout;

    public class 1 implements IObserver {
        public 1() {
        }

        public void updated(PrivacyConfig privacyConfig) {
            NativeTokenGeneratorWithPrivacyAwait.access$000(NativeTokenGeneratorWithPrivacyAwait.this).open();
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ INativeTokenGeneratorListener val$callback;
        final /* synthetic */ IObserver val$privacyConfigObserver;

        public 2(IObserver iObserver, INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
            this.val$privacyConfigObserver = iObserver;
            this.val$callback = iNativeTokenGeneratorListener;
        }

        public void run() {
            NativeTokenGeneratorWithPrivacyAwait.access$000(NativeTokenGeneratorWithPrivacyAwait.this).block(NativeTokenGeneratorWithPrivacyAwait.access$100(NativeTokenGeneratorWithPrivacyAwait.this));
            PrivacyConfigStorage.getInstance().unregisterObserver(this.val$privacyConfigObserver);
            NativeTokenGeneratorWithPrivacyAwait.access$200(NativeTokenGeneratorWithPrivacyAwait.this).generateToken(this.val$callback);
        }
    }

    public NativeTokenGeneratorWithPrivacyAwait(ExecutorService executorService, INativeTokenGenerator iNativeTokenGenerator, int i) {
        this._executorService = executorService;
        this._nativeTokenGenerator = iNativeTokenGenerator;
        this._privacyAwaitTimeout = i;
    }

    public static /* synthetic */ ConditionVariable access$000(NativeTokenGeneratorWithPrivacyAwait nativeTokenGeneratorWithPrivacyAwait) {
        return nativeTokenGeneratorWithPrivacyAwait._privacyAwait;
    }

    public static /* synthetic */ int access$100(NativeTokenGeneratorWithPrivacyAwait nativeTokenGeneratorWithPrivacyAwait) {
        return nativeTokenGeneratorWithPrivacyAwait._privacyAwaitTimeout;
    }

    public static /* synthetic */ INativeTokenGenerator access$200(NativeTokenGeneratorWithPrivacyAwait nativeTokenGeneratorWithPrivacyAwait) {
        return nativeTokenGeneratorWithPrivacyAwait._nativeTokenGenerator;
    }

    public void generateToken(INativeTokenGeneratorListener iNativeTokenGeneratorListener) {
        1 r0 = new 1();
        PrivacyConfigStorage.getInstance().registerObserver(r0);
        this._executorService.execute(new 2(r0, iNativeTokenGeneratorListener));
    }
}
