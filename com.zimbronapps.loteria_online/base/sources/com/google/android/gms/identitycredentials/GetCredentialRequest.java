package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f7.e;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class GetCredentialRequest extends y6.a implements ReflectedParcelable {
    public final List a;
    public final Bundle b;
    public final String c;
    public final ResultReceiver d;
    public static final a e = new a(null);
    public static final Parcelable.Creator CREATOR = new e();

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(k kVar) {
            this();
        }
    }

    public GetCredentialRequest(List list, Bundle bundle, String str, ResultReceiver resultReceiver) {
        t.g(list, "credentialOptions");
        t.g(bundle, "data");
        t.g(resultReceiver, "resultReceiver");
        this.a = list;
        this.b = bundle;
        this.c = str;
        this.d = resultReceiver;
    }

    public final List M1() {
        return this.a;
    }

    public final Bundle N1() {
        return this.b;
    }

    public final String O1() {
        return this.c;
    }

    public final ResultReceiver P1() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.g(parcel, "dest");
        e.c(this, parcel, i);
    }
}
