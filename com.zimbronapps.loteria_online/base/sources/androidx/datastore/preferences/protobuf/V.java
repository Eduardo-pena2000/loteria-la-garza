package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class v extends IOException {
    public K a;
    public boolean b;

    public static class a extends v {
        public a(String str) {
            super(str);
        }
    }

    public v(String str) {
        super(str);
        this.a = null;
    }

    public static v b() {
        return new v("Protocol message end-group tag did not match expected tag.");
    }

    public static v c() {
        return new v("Protocol message contained an invalid tag (zero).");
    }

    public static v d() {
        return new v("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static v f() {
        return new v("CodedInputStream encountered a malformed varint.");
    }

    public static v g() {
        return new v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static v h() {
        return new v("Failed to parse the message.");
    }

    public static v i() {
        return new v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static v l() {
        return new v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static v n() {
        return new v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.b;
    }

    public void j() {
        this.b = true;
    }

    public v k(K k) {
        this.a = k;
        return this;
    }

    public v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.a = null;
    }
}
