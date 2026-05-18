package com.amazon.a.a.o.c.a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b {
    public static final char a = '.';
    private static final int c = -1;
    private static final char d = '/';
    private static final char e = '\\';
    private static final char g;
    public static final String b = Character.toString('.');
    private static final char f = File.separatorChar;

    static {
        if (a()) {
            g = '/';
        } else {
            g = '\\';
        }
    }

    private static boolean a(char c2) {
        return c2 == '/' || c2 == '\\';
    }

    public static String b(String str) {
        return a(str, f, false);
    }

    public static String c(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    public static String d(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace('/', '\\');
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        return a() ? d(str) : c(str);
    }

    public static int f(String str) {
        int min;
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return a(charAt) ? 1 : 0;
        }
        if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            min = Math.min(indexOf, indexOf2);
        } else {
            char charAt2 = str.charAt(1);
            if (charAt2 == ':') {
                char upperCase = Character.toUpperCase(charAt);
                if (upperCase < 'A' || upperCase > 'Z') {
                    return -1;
                }
                return (length == 2 || !a(str.charAt(2))) ? 2 : 3;
            }
            if (!a(charAt) || !a(charAt2)) {
                return a(charAt) ? 1 : 0;
            }
            int indexOf3 = str.indexOf(47, 2);
            int indexOf4 = str.indexOf(92, 2);
            if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
                return -1;
            }
            if (indexOf3 == -1) {
                indexOf3 = indexOf4;
            }
            if (indexOf4 == -1) {
                indexOf4 = indexOf3;
            }
            min = Math.min(indexOf3, indexOf4);
        }
        return min + 1;
    }

    public static int g(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static int h(String str) {
        int lastIndexOf;
        if (str != null && g(str) <= (lastIndexOf = str.lastIndexOf(46))) {
            return lastIndexOf;
        }
        return -1;
    }

    public static String i(String str) {
        int f2;
        if (str == null || (f2 = f(str)) < 0) {
            return null;
        }
        if (f2 <= str.length()) {
            String substring = str.substring(0, f2);
            s(substring);
            return substring;
        }
        s(str + '/');
        return str + '/';
    }

    public static String j(String str) {
        return a(str, 1);
    }

    public static String k(String str) {
        return a(str, 0);
    }

    public static String l(String str) {
        return c(str, true);
    }

    public static String m(String str) {
        return c(str, false);
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        s(str);
        return str.substring(g(str) + 1);
    }

    public static String o(String str) {
        return q(n(str));
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int h = h(str);
        return h == -1 ? "" : str.substring(h + 1);
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        s(str);
        int h = h(str);
        return h == -1 ? str : str.substring(0, h);
    }

    public static String[] r(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        int i = 0;
        char c2 = 0;
        while (i < length) {
            char c3 = charArray[i];
            if (c3 == '?' || c3 == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (c3 == '?') {
                    arrayList.add("?");
                } else if (c2 != '*') {
                    arrayList.add("*");
                }
            } else {
                sb.append(c3);
            }
            i++;
            c2 = c3;
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static void s(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 0) {
                throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    public static boolean a() {
        return f == '\\';
    }

    public static String b(String str, boolean z) {
        return a(str, z ? '/' : '\\', false);
    }

    public static String a(String str) {
        return a(str, f, true);
    }

    public static boolean b(String str, String str2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (str2 == null) {
            return false;
        }
        d dVar = d.c;
        if (dVar.b(str, str2)) {
            return false;
        }
        return dVar.c(str2, str);
    }

    private static String c(String str, boolean z) {
        int f2;
        if (str == null || (f2 = f(str)) < 0) {
            return null;
        }
        if (f2 >= str.length()) {
            return z ? i(str) : str;
        }
        int g2 = g(str);
        if (g2 < 0) {
            return str.substring(0, f2);
        }
        int i = g2 + (z ? 1 : 0);
        if (i == 0) {
            i++;
        }
        return str.substring(0, i);
    }

    public static boolean d(String str, String str2) {
        return a(str, str2, false, d.c);
    }

    public static boolean h(String str, String str2) {
        return a(str, str2, d.a);
    }

    public static String a(String str, boolean z) {
        return a(str, z ? '/' : '\\', true);
    }

    public static boolean e(String str, String str2) {
        return a(str, str2, true, d.a);
    }

    public static boolean g(String str, String str2) {
        if (str == null) {
            return false;
        }
        s(str);
        if (str2 == null || str2.isEmpty()) {
            return h(str) == -1;
        }
        return p(str).equals(str2);
    }

    private static String a(String str, char c2, boolean z) {
        boolean z2;
        if (str == null) {
            return null;
        }
        s(str);
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int f2 = f(str);
        if (f2 < 0) {
            return null;
        }
        int i = length + 2;
        char[] cArr = new char[i];
        str.getChars(0, str.length(), cArr, 0);
        char c3 = f;
        if (c2 == c3) {
            c3 = g;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (cArr[i2] == c3) {
                cArr[i2] = c2;
            }
        }
        if (cArr[length - 1] != c2) {
            cArr[length] = c2;
            length++;
            z2 = false;
        } else {
            z2 = true;
        }
        int i3 = f2 + 1;
        int i4 = i3;
        while (i4 < length) {
            if (cArr[i4] == c2) {
                int i5 = i4 - 1;
                if (cArr[i5] == c2) {
                    System.arraycopy(cArr, i4, cArr, i5, length - i4);
                    length--;
                    i4--;
                }
            }
            i4++;
        }
        int i6 = i3;
        while (i6 < length) {
            if (cArr[i6] == c2) {
                int i7 = i6 - 1;
                if (cArr[i7] == '.' && (i6 == i3 || cArr[i6 - 2] == c2)) {
                    if (i6 == length - 1) {
                        z2 = true;
                    }
                    System.arraycopy(cArr, i6 + 1, cArr, i7, length - i6);
                    length -= 2;
                    i6--;
                }
            }
            i6++;
        }
        int i8 = f2 + 2;
        int i9 = i8;
        while (i9 < length) {
            if (cArr[i9] == c2 && cArr[i9 - 1] == '.' && cArr[i9 - 2] == '.' && (i9 == i8 || cArr[i9 - 3] == c2)) {
                if (i9 == i8) {
                    return null;
                }
                if (i9 == length - 1) {
                    z2 = true;
                }
                int i10 = i9 - 4;
                while (true) {
                    if (i10 >= f2) {
                        if (cArr[i10] == c2) {
                            int i11 = i10 + 1;
                            System.arraycopy(cArr, i9 + 1, cArr, i11, length - i9);
                            length -= i9 - i10;
                            i9 = i11;
                            break;
                        }
                        i10--;
                    } else {
                        int i12 = i9 + 1;
                        System.arraycopy(cArr, i12, cArr, f2, length - i9);
                        length -= i12 - f2;
                        i9 = i3;
                        break;
                    }
                }
            }
            i9++;
        }
        if (length <= 0) {
            return "";
        }
        if (length <= f2) {
            return new String(cArr, 0, length);
        }
        if (z2 && z) {
            return new String(cArr, 0, length);
        }
        return new String(cArr, 0, length - 1);
    }

    public static boolean i(String str, String str2) {
        return a(str, str2, d.c);
    }

    public static boolean c(String str, String str2) {
        return a(str, str2, false, d.a);
    }

    public static boolean f(String str, String str2) {
        return a(str, str2, true, d.c);
    }

    public static String a(String str, String str2) {
        int f2 = f(str2);
        if (f2 < 0) {
            return null;
        }
        if (f2 > 0) {
            return a(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return a(str2);
        }
        if (a(str.charAt(length - 1))) {
            return a(str + str2);
        }
        return a(str + '/' + str2);
    }

    private static String a(String str, int i) {
        int f2;
        if (str == null || (f2 = f(str)) < 0) {
            return null;
        }
        int g2 = g(str);
        int i2 = i + g2;
        if (f2 < str.length() && g2 >= 0 && f2 < i2) {
            String substring = str.substring(f2, i2);
            s(substring);
            return substring;
        }
        return "";
    }

    public static boolean a(String str, String str2, boolean z, d dVar) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z) {
            str = a(str);
            str2 = a(str2);
            if (str == null || str2 == null) {
                throw new NullPointerException("Error normalizing one or both of the file names");
            }
        }
        if (dVar == null) {
            dVar = d.a;
        }
        return dVar.b(str, str2);
    }

    public static boolean a(String str, String[] strArr) {
        if (str == null) {
            return false;
        }
        s(str);
        if (strArr == null || strArr.length == 0) {
            return h(str) == -1;
        }
        String p = p(str);
        for (String str2 : strArr) {
            if (p.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, Collection collection) {
        if (str == null) {
            return false;
        }
        s(str);
        if (collection == null || collection.isEmpty()) {
            return h(str) == -1;
        }
        String p = p(str);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (p.equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, d dVar) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            if (dVar == null) {
                dVar = d.a;
            }
            String[] r = r(str2);
            Stack stack = new Stack();
            boolean z = false;
            int i = 0;
            int i2 = 0;
            do {
                if (stack.size() > 0) {
                    int[] iArr = (int[]) stack.pop();
                    i2 = iArr[0];
                    i = iArr[1];
                    z = true;
                }
                while (i2 < r.length) {
                    if (r[i2].equals("?")) {
                        i++;
                        if (i > str.length()) {
                            break;
                        }
                        z = false;
                        i2++;
                    } else if (r[i2].equals("*")) {
                        if (i2 == r.length - 1) {
                            i = str.length();
                        }
                        z = true;
                        i2++;
                    } else {
                        if (z) {
                            i = dVar.a(str, i, r[i2]);
                            if (i == -1) {
                                break;
                            }
                            int a2 = dVar.a(str, i + 1, r[i2]);
                            if (a2 >= 0) {
                                stack.push(new int[]{i2, a2});
                            }
                            i += r[i2].length();
                            z = false;
                        } else {
                            if (!dVar.b(str, i, r[i2])) {
                                break;
                            }
                            i += r[i2].length();
                            z = false;
                        }
                        i2++;
                    }
                }
                if (i2 == r.length && i == str.length()) {
                    return true;
                }
            } while (stack.size() > 0);
        }
        return false;
    }
}
