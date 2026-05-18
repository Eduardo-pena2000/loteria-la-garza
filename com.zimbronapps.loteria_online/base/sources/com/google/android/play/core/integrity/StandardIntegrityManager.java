package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface StandardIntegrityManager {

    public static abstract class PrepareIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j);
        }

        public static Builder builder() {
            c cVar = new c();
            cVar.a(0);
            return cVar;
        }

        public abstract int a();

        public abstract long b();
    }

    public static abstract class StandardIntegrityToken {
        public abstract Task showDialog(Activity activity, int i);

        public abstract String token();
    }

    public interface StandardIntegrityTokenProvider {
        Task request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    public static abstract class StandardIntegrityTokenRequest {

        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);
        }

        public static Builder builder() {
            return new f();
        }

        public abstract String a();
    }

    Task prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
