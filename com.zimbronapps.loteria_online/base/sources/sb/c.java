package sb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class c {
    public static final Void a(Xa.c subClass, Xa.c baseClass) {
        kotlin.jvm.internal.t.g(subClass, "subClass");
        kotlin.jvm.internal.t.g(baseClass, "baseClass");
        String e = subClass.e();
        if (e == null) {
            e = String.valueOf(subClass);
        }
        b(e, baseClass);
        throw new Ca.i();
    }

    public static final Void b(String str, Xa.c baseClass) {
        String str2;
        kotlin.jvm.internal.t.g(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.e() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.e() + "' has to be sealed and '@Serializable'.";
        }
        throw new ob.j(str2);
    }
}
