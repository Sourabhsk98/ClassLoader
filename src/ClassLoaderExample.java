public class ClassLoaderExample {

    public static void main(String[] args) {
        // Bootstrap Class Loader (using System Class Loader)
        ClassLoader bootstrapLoader = ClassLoader.getSystemClassLoader();
        System.out.println("Class Loader for String (Bootstrap): " + bootstrapLoader);

        // Extension Class Loader
        ClassLoader extensionLoader = ClassLoaderExample.class.getClassLoader().getParent();
        System.out.println("Class Loader for ClassLoaderExample (Extension): " + extensionLoader);

        // Application Class Loader
        ClassLoader appLoader = ClassLoaderExample.class.getClassLoader();
        System.out.println("Class Loader for ClassLoaderExample (Application): " + appLoader);
    }
}