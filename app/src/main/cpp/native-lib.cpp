#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_example_xiaobei_mobilevideo_SplashActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "正在启动";
    return env->NewStringUTF(hello.c_str());
}
